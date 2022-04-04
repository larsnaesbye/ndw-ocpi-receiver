package nu.ndw.ncis.ci.o.cecs.mapper;

import eu.datex.energyinfrastructure.AuthenticationAndIdentificationEnum;
import eu.datex.energyinfrastructure.ConnectorFormatTypeEnum;
import eu.datex.energyinfrastructure.ElectricChargingPoint;
import eu.datex.energyinfrastructure.ElectricChargingPointStatus;
import eu.datex.energyinfrastructure.ElectricEnergySourceTypeEnum;
import eu.datex.energyinfrastructure.EnergyInfrastructureSite;
import eu.datex.energyinfrastructure.EnergyInfrastructureSiteStatus;
import eu.datex.energyinfrastructure.PricingPolicyEnum;
import eu.datex.energyinfrastructure.RefillPointStatusEnum;
import eu.datex.energyinfrastructure._AuthenticationAndIdentificationEnum;
import eu.datex.energyinfrastructure._PricingPolicyEnum;
import eu.datex.facilities.OrganisationSpecification;
import eu.datex.facilities.UnknownOperatingHours;
import eu.datex.locationreferencing.PointLocation;
import nu.ndw.ncis.ci.o.cecs.model.EnergyInfrastructurePublications;
import nu.ndw.ncis.core.exception.NdwProcessingException;
import nu.ndw.ncis.core.parsing.JsonObjectParser;
import ocpi.model.BusinessDetails;
import ocpi.model.OcpiEvse;
import ocpi.model.OcpiLocation;
import ocpi.model.OcpiTariff;
import ocpi.model.PriceComponent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThrows;

class OcpiToDatex2MapperTest {

    private final JsonObjectParser<OcpiLocation> ocpiLocationObjectParser =
            new JsonObjectParser<>(OcpiLocation.class);
    private final JsonObjectParser<OcpiTariff> ocpiTariffObjectParser =
            new JsonObjectParser<>(OcpiTariff.class);
    private final ClassLoader classLoader = getClass().getClassLoader();
    private final OcpiToDatex2Mapper ocpiToDatex2Mapper = new OcpiToDatex2Mapper();
    private EnergyInfrastructureSite energyInfraStructureSite;
    private EnergyInfrastructureSiteStatus energyInfrastructureSiteStatus;
    private static final String DUMMY_STRING_VALUE = "dummyStringValue";

    private final String rooseveltLaanLocationString = new BufferedReader(
            new InputStreamReader(Objects.requireNonNull(classLoader.getResourceAsStream("json/mapper-test-objects/test-location.json")), StandardCharsets.UTF_8))
            .lines()
            .collect(Collectors.joining("\n"));
    private final OcpiLocation testLocation = ocpiLocationObjectParser.parseStringToObject(rooseveltLaanLocationString);

    private final String testTariff1String = new BufferedReader(
            new InputStreamReader(Objects.requireNonNull(classLoader.getResourceAsStream("json/mapper-test-objects/test-tariff1.json")), StandardCharsets.UTF_8))
            .lines()
            .collect(Collectors.joining("\n"));
    private final OcpiTariff testTariff1 = ocpiTariffObjectParser.parseStringToObject(testTariff1String);


    @BeforeEach
    void setup() {
        var publications =
                ocpiToDatex2Mapper.ocpiLocationToEnergyInfrastructureTable(
                        List.of(testLocation),
                        List.of(testTariff1));

        energyInfraStructureSite = publications.getTablePublication().getEnergyInfrastructureTables().get(0).getEnergyInfrastructureSites().get(0);
        energyInfrastructureSiteStatus = publications.getStatusPublication().getEnergyInfrastructureSiteStatuses().get(0);
    }

    /////////////////////////////////////////// BASIC FIELD MAPPING TESTS \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    @Test
    void testShouldMapEnergyInfrastructureSiteName() {
        assertThat(energyInfraStructureSite.getName().getValues().getValues().get(0).getValue())
                .isEqualTo("Noordwal 6");
    }

    @Test
    void testShouldMapEnergyInfrastructureSiteId() {
        assertThat(energyInfraStructureSite.getId())
                .isEqualTo("d6fc5080-74e9-40c5-9719-59fad1a87900");
    }

    @Test
    void testShouldMapOperatingHours() {
        assertThat(energyInfraStructureSite.getOperatingHours()).isInstanceOf(UnknownOperatingHours.class);
    }

    @Test
    void testShouldMapLastUpdated() {
        assertThat(energyInfraStructureSite.getLastUpdated()).isEqualTo(Instant.parse("2021-11-13T16:10:16Z"));
    }

    @Test
    void testShouldMapLocationReference() {
        var coordinates = ((PointLocation) energyInfraStructureSite.getLocationReference())
                .getPointByCoordinates()
                .getPointCoordinates();

        assertThat(coordinates.getLatitude()).isEqualTo(51.692144f);
        assertThat(coordinates.getLongitude()).isEqualTo(5.309348f);
    }

    @Test
    void testShouldMapLocationReferenceFacilityLocation() {
        var facilityLocation = energyInfraStructureSite
                .getLocationReference()
                .get_LocationReferenceExtension()
                .getFacilityLocation();

        assertThat(facilityLocation).isNotNull();
        assertThat(facilityLocation.getTimeZone()).isEqualTo("NL");
    }

    @Test
    void testShouldMapLocationReferenceFacilityLocationAddress() {
        var facilityLocationAddress = energyInfraStructureSite
                .getLocationReference()
                .get_LocationReferenceExtension()
                .getFacilityLocation()
                .getAddress();

        assertThat(facilityLocationAddress.getCity().getValues().getValues().get(0).getValue()).isEqualTo("'s-Hertogenbosch");
        assertThat(facilityLocationAddress.getPostcode()).isEqualTo("5211RM");
        assertThat(facilityLocationAddress.getCountryCode()).isEqualTo("NLD");
        assertThat(facilityLocationAddress.getAddressLines().get(0).getText().getValues().getValues().get(0).getValue()).isEqualTo("Noordwal");
        assertThat(facilityLocationAddress.getAddressLines().get(1).getText().getValues().getValues().get(0).getValue()).isEqualTo("6");
    }

    @Test
    void testShouldMapEnergyInfraStructureStationAuthenticationMethods() {
        var energyInfraStructureStation = energyInfraStructureSite.getEnergyInfrastructureStations().get(0);

        var methods = energyInfraStructureStation.getAuthenticationAndIdentificationMethods()
                .stream()
                .map(_AuthenticationAndIdentificationEnum::getValue)
                .collect(Collectors.toList());

        assertThat(methods).hasSize(2)
                .contains(AuthenticationAndIdentificationEnum.OVER_THE_AIR)
                .contains(AuthenticationAndIdentificationEnum.RFID);
    }

    @Test
    void testShouldMapEnergyInfraStructureStationEnergyProvider() {
        var energyInfraStructureStation = energyInfraStructureSite.getEnergyInfrastructureStations().get(0);

        var energyProvider = (OrganisationSpecification) energyInfraStructureStation.getEnergyProvider();
        var energyProviderName = energyProvider.getName().getValues().getValues().get(0).getValue();

        assertThat(energyProviderName)
                .isEqualTo("E.ON Energy Deutschland");
    }

    @Test
    void testShouldMapEnergyInfrastructureSiteOperator() {
        var operator = (OrganisationSpecification) energyInfraStructureSite.getOperator();
        var operatorOrganisationNumber = operator.getNationalOrganisationNumber();
        var operatorName = operator.getName().getValues().getValues().get(0).getValue();
        var operatorLinkToGeneralInformation = operator.getLinkToGeneralInformation();

        assertThat(operatorName).isEqualTo("Test Supplier");
        assertThat(operatorOrganisationNumber).isEqualTo(DUMMY_STRING_VALUE);
        assertThat(operatorLinkToGeneralInformation).isEqualTo("https://test-supplier.nl");
    }

    @Test
    void testShouldMapEnergyInfrastructureSiteOperatorOrganisationUnitContactInformation() {
        var operator = (OrganisationSpecification) energyInfraStructureSite.getOperator();
        var organisationUnit = operator.getOrganisationUnits().get(0);
        var contactInformation = organisationUnit.getContactInformations().get(0);

        assertThat(contactInformation.getTelephoneNumber()).isEqualTo("00000000");
        assertThat(organisationUnit.getContactInformations()).hasSize(1);
    }

    @Test
    void testShouldMapEnergyInfrastructureSiteOperatorSubOrganisation() {
        var operator = (OrganisationSpecification) energyInfraStructureSite.getOperator();
        var subOrganisation = (OrganisationSpecification) operator.getSubOrganisations().get(0);
        var subOrganisationName = subOrganisation.getName().getValues().getValues().get(0).getValue();

        assertThat(subOrganisationName).isEqualTo("Test Supplier sub");
    }

    @Test
    void testShouldMapElectricChargingPoints() {
        var station = energyInfraStructureSite.getEnergyInfrastructureStations().get(0);
        var refillPoints = station.getRefillPoints();
        var firstRefillPoint = refillPoints.get(0);
        var refillPointExternalIdentifier = firstRefillPoint.getExternalIdentifier();

        assertThat(refillPointExternalIdentifier).isEqualTo("be8c4660-603e-4ae8-8942-5cffa79247d8");
        assertThat(refillPoints).hasSize(2);
    }

    @Test
    void testShouldMapElectricChargingPointElectricEnergyMix() {
        var station = energyInfraStructureSite.getEnergyInfrastructureStations().get(0);
        var firstRefillPoints = (ElectricChargingPoint) station.getRefillPoints().get(0);
        var firstElectricEnergyMix = firstRefillPoints.getElectricEnergyMixes().get(0);
        var productName = firstElectricEnergyMix.getEnergyProductName().getValues().getValues().get(0).getValue();

        var ratios = firstElectricEnergyMix.getElectricEnergySourceRatios()
                .stream()
                .collect(Collectors.toMap(
                        r -> r.getEnergySource().getValue(),
                        r -> r.getSourceRatioValue().getPercentage()
                ));

        assertThat(ratios).hasSize(8)
                .containsEntry(ElectricEnergySourceTypeEnum.GENERAL_GREEN, 31.9f)
                .containsEntry(ElectricEnergySourceTypeEnum.GAS, 6.3f)
                .containsEntry(ElectricEnergySourceTypeEnum.COAL, 30.0f)
                .containsEntry(ElectricEnergySourceTypeEnum.GENERAL_FOSSIL, 2.0f)
                .containsEntry(ElectricEnergySourceTypeEnum.NUCLEAR, 0.9f)
                .containsEntry(ElectricEnergySourceTypeEnum.SOLAR, 3.2f)
                .containsEntry(ElectricEnergySourceTypeEnum.WIND, 4.0f)
                .containsEntry(ElectricEnergySourceTypeEnum.WATER, 21.7f);
        assertThat(productName).isEqualTo("E.ON DirektStrom eco");
    }

    @Test
    void testShouldMapElectricChargingPointConnectors() {
        var station = energyInfraStructureSite.getEnergyInfrastructureStations().get(0);
        var refillPoints = station.getRefillPoints();
        var firstRefillPoint = (ElectricChargingPoint) refillPoints.get(0);
        var firstConnector = firstRefillPoint.getConnectors().get(0);

        assertThat(firstConnector.getMaxPowerAtSocket()).isEqualTo(0.0f);
        assertThat(firstConnector.getVoltage()).isEqualTo(230f);
        assertThat(firstConnector.getMaximumCurrent()).isEqualTo(16f);
        assertThat(firstConnector.getConnectorFormat().getValue()).isEqualTo(ConnectorFormatTypeEnum.SOCKET);
    }

    @Test
    void testShouldMapElectricChargingPointStatusRefillPointsEnergyPricingPolicies() {
        var status = energyInfrastructureSiteStatus.getEnergyInfrastructureStationStatuses().get(0);
        var firstRefillPointStatus = (ElectricChargingPointStatus) status.getRefillPointStatuses().get(0);
        var electricEnergyMixOverride = firstRefillPointStatus.getElectricEnergyMixOverrides().get(0);
        var rates = electricEnergyMixOverride.getRates();
        var energyPricingPolicy = rates.getEnergyPricingPolicy();
        var energyPricingPolicies = energyPricingPolicy.getPricingPolicies();

        assertThat(energyPricingPolicies.get(0).getValue()).isEqualTo(PricingPolicyEnum.PRICE_PER_DELIVERY_UNIT);
    }

    @Test
    void testShouldMapDynamicDataStatus() {
        var status = energyInfrastructureSiteStatus.getEnergyInfrastructureStationStatuses().get(0);
        var statusIsAvailable = status.isIsAvailable();
        var firstRefillPointStatus = status.getRefillPointStatuses().get(0);

        assertThat(statusIsAvailable).isTrue();
        assertThat(firstRefillPointStatus.getStatus().getValue()).isEqualTo(RefillPointStatusEnum.AVAILABLE);
    }

    @Test
    void testShouldMapDynamicDataReferenceToEnergyInfrastructureSite() {
        var reference = energyInfrastructureSiteStatus.getReference();

        assertThat(reference.getId()).isEqualTo("d6fc5080-74e9-40c5-9719-59fad1a87900");
    }

    @Test
    void testShouldMapDynamicDataElectricChargingPointElectricEnergyMixOverride() {
        var station = energyInfrastructureSiteStatus.getEnergyInfrastructureStationStatuses().get(0);
        var firstRefillPoints = (ElectricChargingPointStatus) station.getRefillPointStatuses().get(0);
        var firstElectricEnergyMix = firstRefillPoints.getElectricEnergyMixOverrides().get(0);
        var rates = firstElectricEnergyMix.getRates();
        var energyPricingPolicy = rates.getEnergyPricingPolicy();
        var pricingPolicyEnums = energyPricingPolicy.getPricingPolicies();
        var pricePerDeliveryUnitPricingPolicyEnum = new _PricingPolicyEnum();
        pricePerDeliveryUnitPricingPolicyEnum.setValue(PricingPolicyEnum.PRICE_PER_DELIVERY_UNIT);

        assertThat(pricingPolicyEnums).containsExactly(
                pricePerDeliveryUnitPricingPolicyEnum,
                pricePerDeliveryUnitPricingPolicyEnum,
                pricePerDeliveryUnitPricingPolicyEnum);
    }

    @Test
    void testShouldMapHighestStepPriceOfDynamicDataElectricChargingPointElectricEnergyMixOverrideMinimumDeliveryFee() {
        var station = energyInfrastructureSiteStatus.getEnergyInfrastructureStationStatuses().get(0);
        var firstRefillPoints = (ElectricChargingPointStatus) station.getRefillPointStatuses().get(0);
        var firstElectricEnergyMix = firstRefillPoints.getElectricEnergyMixOverrides().get(0);
        var rates = firstElectricEnergyMix.getRates();
        var energyPricingPolicy = rates.getEnergyPricingPolicy();

        assertThat(energyPricingPolicy.getMinimumDeliveryFee()).isEqualTo(new BigDecimal("0.40"));
    }

    /////////////////////////////////////////// UNHAPPY FLOW & EDGE CASE TESTS \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    @Test
    void testShouldOmitEnergyInfraStructureStationEnergyProviderGivenNoOcpiEnergyMix() {
        testLocation.setEnergyMix(null);

        var publications =
                ocpiToDatex2Mapper.ocpiLocationToEnergyInfrastructureTable(
                        List.of(testLocation),
                        List.of(testTariff1));

        energyInfraStructureSite = publications.getTablePublication().getEnergyInfrastructureTables().get(0).getEnergyInfrastructureSites().get(0);
        var energyInfraStructureStation = energyInfraStructureSite.getEnergyInfrastructureStations().get(0);

        var energyProvider = (OrganisationSpecification)energyInfraStructureStation.getEnergyProvider();

        assertThat(energyProvider)
                .isNull();
    }

    @Test
    void testShouldMapEnergyInfrastructureSiteOperatorNameWithDummyValueWhenNoOCPIValueIsGiven() {
        var ocpiOperator = new BusinessDetails();
        ocpiOperator.setName(null);
        testLocation.setOperator(ocpiOperator);

        var publications =
                ocpiToDatex2Mapper.ocpiLocationToEnergyInfrastructureTable(
                        List.of(testLocation),
                        List.of(testTariff1));

        energyInfraStructureSite = publications.getTablePublication().getEnergyInfrastructureTables().get(0).getEnergyInfrastructureSites().get(0);
        var operator = (OrganisationSpecification) energyInfraStructureSite.getOperator();
        var operatorName = operator.getName().getValues().getValues().get(0).getValue();

        assertThat(operatorName).isEqualTo("dummyStringValue");
    }

    @Test
    void testShouldMapDynamicDataAvailabilityGivenASingleAvailableEvseAndOthersAreBlocked() {
        testLocation.getEvses().forEach(evse -> evse.setStatus(OcpiEvse.StatusEnum.BLOCKED));
        testLocation.getEvses().get(1).setStatus(OcpiEvse.StatusEnum.AVAILABLE);
        var publications =
                ocpiToDatex2Mapper.ocpiLocationToEnergyInfrastructureTable(
                        List.of(testLocation),
                        List.of(testTariff1));

        var statusIsAvailable = isStatusIsAvailable(publications);

        assertThat(statusIsAvailable).isTrue();
    }

    @Test
    void testShouldMapDynamicDataAvailabilityGivenASingleAvailableEvseAndOthersAreCharging() {
        testLocation.getEvses().forEach(evse -> evse.setStatus(OcpiEvse.StatusEnum.CHARGING));
        testLocation.getEvses().get(1).setStatus(OcpiEvse.StatusEnum.AVAILABLE);
        var publications =
                ocpiToDatex2Mapper.ocpiLocationToEnergyInfrastructureTable(
                        List.of(testLocation),
                        List.of(testTariff1));

        var statusIsAvailable = isStatusIsAvailable(publications);

        assertThat(statusIsAvailable).isTrue();
    }

    @Test
    void testShouldMapDynamicDataAvailabilityGivenASingleAvailableEvseAndOthersAreInoperative() {
        testLocation.getEvses().forEach(evse -> evse.setStatus(OcpiEvse.StatusEnum.INOPERATIVE));
        testLocation.getEvses().get(1).setStatus(OcpiEvse.StatusEnum.AVAILABLE);
        var publications =
                ocpiToDatex2Mapper.ocpiLocationToEnergyInfrastructureTable(
                        List.of(testLocation),
                        List.of(testTariff1));

        var statusIsAvailable = isStatusIsAvailable(publications);

        assertThat(statusIsAvailable).isTrue();
    }

    @Test
    void testShouldMapDynamicDataAvailabilityGivenASingleAvailableEvseAndOthersAreOutOfOrder() {
        testLocation.getEvses().forEach(evse -> evse.setStatus(OcpiEvse.StatusEnum.OUTOFORDER));
        testLocation.getEvses().get(1).setStatus(OcpiEvse.StatusEnum.AVAILABLE);
        var publications =
                ocpiToDatex2Mapper.ocpiLocationToEnergyInfrastructureTable(
                        List.of(testLocation),
                        List.of(testTariff1));

        var statusIsAvailable = isStatusIsAvailable(publications);

        assertThat(statusIsAvailable).isTrue();
    }

    @Test
    void testShouldMapDynamicDataAvailabilityGivenASingleAvailableEvseAndOthersArePlanned() {
        testLocation.getEvses().forEach(evse -> evse.setStatus(OcpiEvse.StatusEnum.PLANNED));
        testLocation.getEvses().get(1).setStatus(OcpiEvse.StatusEnum.AVAILABLE);
        var publications =
                ocpiToDatex2Mapper.ocpiLocationToEnergyInfrastructureTable(
                        List.of(testLocation),
                        List.of(testTariff1));

        var statusIsAvailable = isStatusIsAvailable(publications);

        assertThat(statusIsAvailable).isTrue();
    }

    @Test
    void testShouldMapDynamicDataAvailabilityGivenASingleAvailableEvseAndOthersAreRemoved() {
        testLocation.getEvses().forEach(evse -> evse.setStatus(OcpiEvse.StatusEnum.REMOVED));
        testLocation.getEvses().get(1).setStatus(OcpiEvse.StatusEnum.AVAILABLE);
        var publications =
                ocpiToDatex2Mapper.ocpiLocationToEnergyInfrastructureTable(
                        List.of(testLocation),
                        List.of(testTariff1));

        var statusIsAvailable = isStatusIsAvailable(publications);

        assertThat(statusIsAvailable).isTrue();
    }

    @Test
    void testShouldMapDynamicDataAvailabilityGivenASingleAvailableEvseAndOthersAreReserved() {
        testLocation.getEvses().forEach(evse -> evse.setStatus(OcpiEvse.StatusEnum.RESERVED));
        testLocation.getEvses().get(1).setStatus(OcpiEvse.StatusEnum.AVAILABLE);
        var publications =
                ocpiToDatex2Mapper.ocpiLocationToEnergyInfrastructureTable(
                        List.of(testLocation),
                        List.of(testTariff1));

        var statusIsAvailable = isStatusIsAvailable(publications);

        assertThat(statusIsAvailable).isTrue();
    }

    @Test
    void testShouldMapDynamicDataAvailabilityGivenASingleAvailableEvseAndOthersAreUnknown() {
        testLocation.getEvses().forEach(evse -> evse.setStatus(OcpiEvse.StatusEnum.UNKNOWN));
        testLocation.getEvses().get(1).setStatus(OcpiEvse.StatusEnum.AVAILABLE);
        var publications =
                ocpiToDatex2Mapper.ocpiLocationToEnergyInfrastructureTable(
                        List.of(testLocation),
                        List.of(testTariff1));

        var statusIsAvailable = isStatusIsAvailable(publications);

        assertThat(statusIsAvailable).isTrue();
    }

    @Test
    void testShouldMapDynamicDataAvailabilityGivenANoAvailableEvse() {
        testLocation.getEvses().forEach(evse -> evse.setStatus(OcpiEvse.StatusEnum.BLOCKED));
        var publications =
                ocpiToDatex2Mapper.ocpiLocationToEnergyInfrastructureTable(
                        List.of(testLocation),
                        List.of(testTariff1));

        boolean statusIsAvailable = isStatusIsAvailable(publications);

        assertThat(statusIsAvailable).isFalse();
    }

    @Test
    void testShouldMapOneOCPILocationToOneEnergyInfrastructureSite() {
        var publications =
                ocpiToDatex2Mapper.ocpiLocationToEnergyInfrastructureTable(
                        List.of(testLocation),
                        List.of(testTariff1));

        energyInfraStructureSite = publications.getTablePublication().getEnergyInfrastructureTables().get(0).getEnergyInfrastructureSites().get(0);

        assertThat(publications.getTablePublication().getEnergyInfrastructureTables().get(0).getEnergyInfrastructureSites().size()).isEqualTo(1);
    }

    @Test
    void testShouldMapOneOCPILocationToOneEnergyInfrastructureSiteStatus() {
        var publications =
                ocpiToDatex2Mapper.ocpiLocationToEnergyInfrastructureTable(
                        List.of(testLocation),
                        List.of(testTariff1));

        assertThat(publications.getStatusPublication().getEnergyInfrastructureSiteStatuses().size()).isEqualTo(1);
    }

    @Test
    void testShouldMapMultipleOCPILocationsToMultipleEnergyInfrastructureSiteStatuses() {
        var publications =
                ocpiToDatex2Mapper.ocpiLocationToEnergyInfrastructureTable(
                        List.of(testLocation, testLocation, testLocation),
                        List.of(testTariff1));

        assertThat(publications.getStatusPublication().getEnergyInfrastructureSiteStatuses().size()).isEqualTo(3);
    }

    @Test
    void testShouldMapOneOCPILocationToMultipleEnergyInfrastructureSites() {
        var publications =
                ocpiToDatex2Mapper.ocpiLocationToEnergyInfrastructureTable(
                        List.of(testLocation, testLocation, testLocation),
                        List.of(testTariff1));

        assertThat(publications.getTablePublication().getEnergyInfrastructureTables().get(0).getEnergyInfrastructureSites().size()).isEqualTo(3);
    }

    @Test
    void testShouldFailWhenHighestPriceOfDynamicDataElectricChargingPointElectricEnergyMixOverrideMinimumDeliveryFeeWhenPriceComponentTypeIsNotEnergy() {
        var testLocations = List.of(testLocation);
        var testTariffs = List.of(testTariff1);
        var priceComponent = testTariff1.getElements().get(1).getPriceComponents().get(1);
        priceComponent.setType(PriceComponent.TypeEnum.FLAT);

        Throwable exception = assertThrows(NdwProcessingException.class, () ->
                ocpiToDatex2Mapper.ocpiLocationToEnergyInfrastructureTable(
                        testLocations,
                        testTariffs));

        Assertions.assertEquals("Unrecognized price component type", exception.getMessage());
    }


    private boolean isStatusIsAvailable(EnergyInfrastructurePublications publications) {
        energyInfraStructureSite = publications.getTablePublication().getEnergyInfrastructureTables().get(0).getEnergyInfrastructureSites().get(0);
        energyInfrastructureSiteStatus = publications.getStatusPublication().getEnergyInfrastructureSiteStatuses().get(0);
        var status = energyInfrastructureSiteStatus.getEnergyInfrastructureStationStatuses().get(0);
        return status.isIsAvailable();
    }

}
