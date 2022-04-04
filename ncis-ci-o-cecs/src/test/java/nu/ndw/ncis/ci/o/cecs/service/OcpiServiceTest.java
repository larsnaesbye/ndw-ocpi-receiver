package nu.ndw.ncis.ci.o.cecs.service;

import eu.datex.energyinfrastructure.EnergyInfrastructureStatusPublication;
import eu.datex.energyinfrastructure.EnergyInfrastructureTablePublication;
import nu.ndw.ncis.ci.o.cecs.analyzer.OcpiDataAnalyzer;
import nu.ndw.ncis.ci.o.cecs.fixture.OcpiLocationFixtures;
import nu.ndw.ncis.ci.o.cecs.fixture.OcpiTariffFixtures;
import nu.ndw.ncis.ci.o.cecs.mapper.OcpiToDatex2Mapper;
import nu.ndw.ncis.ci.o.cecs.model.EnergyInfrastructurePublications;
import nu.ndw.ncis.ci.o.cecs.rest.client.OcpiWebClient;
import nu.ndw.ncis.core.messaging.transmission.ObjectTransmitter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.then;
import static org.mockito.BDDMockito.willReturn;

@ExtendWith(MockitoExtension.class)
class OcpiServiceTest {

    private OcpiService ocpiService;

    @Mock
    private OcpiWebClient ocpiWebClient;

    @Mock
    private OcpiToDatex2Mapper mapper;

    @Mock
    private ObjectTransmitter<EnergyInfrastructureTablePublication> tablePublicationTransmitter;

    @Mock
    private ObjectTransmitter<EnergyInfrastructureStatusPublication> statusPublicationTransmitter;

    @Mock
    private OcpiDataAnalyzer ocpiDataAnalyzer;

    // @InjectMocks does not work correctly with the 2 ObjectTransmitter mocks
    @BeforeEach
    void setUp() {
        ocpiService = new OcpiService(
                ocpiWebClient,
                mapper,
                tablePublicationTransmitter,
                statusPublicationTransmitter,
                ocpiDataAnalyzer
        );
    }

    @Test
    void testGetAndSaveOcpiDataShouldPublishTablePublication() throws Exception {
        var locations = OcpiLocationFixtures.getJsonData("json/locations/small-locations.json");
        willReturn(locations).given(ocpiWebClient).getLocations();
        var tariffs = OcpiTariffFixtures.getJsonData("json/tariffs.json");
        willReturn(tariffs).given(ocpiWebClient).getTariffs();

        var publications = EnergyInfrastructurePublications.builder()
                .tablePublication(new EnergyInfrastructureTablePublication())
                .statusPublication(new EnergyInfrastructureStatusPublication())
                .build();
        willReturn(publications).given(mapper).ocpiLocationToEnergyInfrastructureTable(locations, tariffs);

        ocpiService.getAndSaveOcpiData();

        then(tablePublicationTransmitter).should().transmitObject(publications.getTablePublication());
    }

    @Test
    void testGetAndSaveOcpiDataShouldPublishStatusPublication() throws Exception {
        var locations = OcpiLocationFixtures.getJsonData("json/locations/small-locations.json");
        willReturn(locations).given(ocpiWebClient).getLocations();
        var tariffs = OcpiTariffFixtures.getJsonData("json/tariffs.json");
        willReturn(tariffs).given(ocpiWebClient).getTariffs();

        var publications = EnergyInfrastructurePublications.builder()
                .tablePublication(new EnergyInfrastructureTablePublication())
                .statusPublication(new EnergyInfrastructureStatusPublication())
                .build();
        willReturn(publications).given(mapper).ocpiLocationToEnergyInfrastructureTable(locations, tariffs);

        ocpiService.getAndSaveOcpiData();

        then(statusPublicationTransmitter).should().transmitObject(publications.getStatusPublication());
    }

    @Test
    void testGetLocations() throws Exception {
        var locations = OcpiLocationFixtures.getJsonData("json/locations/small-locations.json");
        willReturn(locations).given(ocpiWebClient).getLocations();

        var actualLocations = ocpiService.getLocations();

        then(ocpiWebClient).should().getLocations();
        assertThat(actualLocations).hasSize(2);
    }

    @Test
    void testGetTariffs() throws Exception {
        var tariffs = OcpiTariffFixtures.getJsonData("json/tariffs.json");
        willReturn(tariffs).given(ocpiWebClient).getTariffs();

        var actualTariffs = ocpiService.getTariffs();

        assertThat(actualTariffs).isEqualTo(tariffs);
    }
}
