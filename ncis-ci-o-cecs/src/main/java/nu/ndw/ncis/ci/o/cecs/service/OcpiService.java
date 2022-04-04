package nu.ndw.ncis.ci.o.cecs.service;

import eu.datex.energyinfrastructure.EnergyInfrastructureStatusPublication;
import eu.datex.energyinfrastructure.EnergyInfrastructureTablePublication;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nu.ndw.ncis.ci.o.cecs.analyzer.OcpiDataAnalyzer;
import nu.ndw.ncis.ci.o.cecs.mapper.OcpiToDatex2Mapper;
import nu.ndw.ncis.ci.o.cecs.rest.client.OcpiWebClient;
import nu.ndw.ncis.core.messaging.transmission.ObjectTransmitter;
import ocpi.model.OcpiLocation;
import ocpi.model.OcpiTariff;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class OcpiService {

    private final OcpiWebClient webClient;
    private final OcpiToDatex2Mapper mapper;
    private final ObjectTransmitter<EnergyInfrastructureTablePublication> tablePublicationTransmitter;
    private final ObjectTransmitter<EnergyInfrastructureStatusPublication> statusPublicationTransmitter;
    private final OcpiDataAnalyzer ocpiDataAnalyzer;

    public void getAndSaveOcpiData() {
        var locations = getLocations();
        var tariffs = getTariffs();

        var publications = mapper.ocpiLocationToEnergyInfrastructureTable(locations, tariffs);

        tablePublicationTransmitter.transmitObject(publications.getTablePublication());
        statusPublicationTransmitter.transmitObject(publications.getStatusPublication());

        logMetrics(locations, tariffs);
    }

    public List<OcpiLocation> getLocations() {
        return webClient.getLocations();
    }

    public List<OcpiTariff> getTariffs() {
        return webClient.getTariffs();
    }

    private void logMetrics(List<OcpiLocation> locations, List<OcpiTariff> tariffs) {
        logLocationMetrics(locations);
        logTariffMetrics(tariffs);
    }

    private void logLocationMetrics(List<OcpiLocation> locations) {
        var locationMetrics = ocpiDataAnalyzer.getLocationMetrics(locations);
        log.info("{}", locationMetrics);
    }

    private void logTariffMetrics(List<OcpiTariff> tariffs) {
        var tariffMetrics = ocpiDataAnalyzer.getTariffMetrics(tariffs);
        log.info("{}", tariffMetrics);
    }
}
