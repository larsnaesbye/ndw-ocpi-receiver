package nu.ndw.ncis.ci.o.cecs.mapper;

import eu.datex.common.MultilingualString;
import eu.datex.common.MultilingualStringValue;
import eu.datex.common.PercentageValue;
import eu.datex.energyinfrastructure.AuthenticationAndIdentificationEnum;
import eu.datex.energyinfrastructure.ChargingModeEnum;
import eu.datex.energyinfrastructure.Connector;
import eu.datex.energyinfrastructure.ConnectorFormatTypeEnum;
import eu.datex.energyinfrastructure.ConnectorTypeEnum;
import eu.datex.energyinfrastructure.ElectricChargingPoint;
import eu.datex.energyinfrastructure.ElectricChargingPointStatus;
import eu.datex.energyinfrastructure.ElectricEnergyMix;
import eu.datex.energyinfrastructure.ElectricEnergySourceRatio;
import eu.datex.energyinfrastructure.ElectricEnergySourceTypeEnum;
import eu.datex.energyinfrastructure.EnergyInfrastructureSite;
import eu.datex.energyinfrastructure.EnergyInfrastructureSiteStatus;
import eu.datex.energyinfrastructure.EnergyInfrastructureStation;
import eu.datex.energyinfrastructure.EnergyInfrastructureStationStatus;
import eu.datex.energyinfrastructure.EnergyInfrastructureStatusPublication;
import eu.datex.energyinfrastructure.EnergyInfrastructureTable;
import eu.datex.energyinfrastructure.EnergyInfrastructureTablePublication;
import eu.datex.energyinfrastructure.EnergyPricingPolicy;
import eu.datex.energyinfrastructure.PricingPolicyEnum;
import eu.datex.energyinfrastructure.RefillPointStatus;
import eu.datex.energyinfrastructure.RefillPointStatusEnum;
import eu.datex.energyinfrastructure._AuthenticationAndIdentificationEnum;
import eu.datex.energyinfrastructure._ChargingModeEnum;
import eu.datex.energyinfrastructure._ConnectorFormatTypeEnum;
import eu.datex.energyinfrastructure._ConnectorTypeEnum;
import eu.datex.energyinfrastructure._ElectricEnergySourceTypeEnum;
import eu.datex.energyinfrastructure._PricingPolicyEnum;
import eu.datex.energyinfrastructure._RefillPointStatusEnum;
import eu.datex.facilities.ContactInformation;
import eu.datex.facilities.GeneralRateInformation;
import eu.datex.facilities.OpenAllHours;
import eu.datex.facilities.OperatingHours;
import eu.datex.facilities.OrganisationSpecification;
import eu.datex.facilities.OrganisationUnit;
import eu.datex.facilities.UnknownOperatingHours;
import eu.datex.facilities._FacilityObjectVersionedReference;
import eu.datex.locationextension.Address;
import eu.datex.locationextension.AddressLine;
import eu.datex.locationextension.AddressLineTypeEnum;
import eu.datex.locationextension.FacilityLocation;
import eu.datex.locationextension._AddressLineTypeEnum;
import eu.datex.locationreferencing.LocationReference;
import eu.datex.locationreferencing.PointByCoordinates;
import eu.datex.locationreferencing.PointCoordinates;
import eu.datex.locationreferencing.PointLocation;
import eu.datex.locationreferencing._LocationReferenceExtensionType;
import nu.ndw.ncis.ci.o.cecs.model.EnergyInfrastructurePublications;
import nu.ndw.ncis.ci.o.cecs.util.AddressUtil;
import nu.ndw.ncis.core.exception.NdwProcessingException;
import ocpi.model.EnergyMix;
import ocpi.model.EnergySource;
import ocpi.model.OcpiConnector;
import ocpi.model.OcpiEvse;
import ocpi.model.OcpiGeoLocation;
import ocpi.model.OcpiLocation;
import ocpi.model.OcpiTariff;
import ocpi.model.PriceComponent;
import ocpi.model.TariffElement;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class OcpiToDatex2Mapper {
    private static final String DUMMY_STRING_VALUE = "dummyStringValue";

    public EnergyInfrastructurePublications ocpiLocationToEnergyInfrastructureTable(
            List<OcpiLocation> ocpiLocations,
            List<OcpiTariff> ocpiTariffs) {

        var tariffsById = ocpiTariffsMap(ocpiTariffs);

        var sites = energyInfrastructureSitesFrom(ocpiLocations);
        var statuses =
                infraStructureSiteStatusesFrom(ocpiLocations, tariffsById);

        return EnergyInfrastructurePublications.builder()
                .tablePublication(tablePublicationFrom(sites))
                .statusPublication(statusPublicationFrom(statuses))
                .build();
    }

    private Map<String, OcpiTariff> ocpiTariffsMap(List<OcpiTariff> ocpiTariffs) {
        return ocpiTariffs.stream()
                .collect(Collectors.toMap(OcpiTariff::getId, Function.identity()));
    }

    private EnergyInfrastructureTablePublication tablePublicationFrom(
            List<EnergyInfrastructureSite> sites) {
        var tablePublication = new EnergyInfrastructureTablePublication();
        var table = new EnergyInfrastructureTable();

        table.getEnergyInfrastructureSites().addAll(sites);
        tablePublication.getEnergyInfrastructureTables().add(table);

        return tablePublication;
    }

    private EnergyInfrastructureStatusPublication statusPublicationFrom(
            List<EnergyInfrastructureSiteStatus> statuses) {
        var statusPublication = new EnergyInfrastructureStatusPublication();
        statusPublication.getEnergyInfrastructureSiteStatuses().addAll(statuses);

        return statusPublication;
    }

    private List<EnergyInfrastructureSiteStatus> infraStructureSiteStatusesFrom(
            List<OcpiLocation> ocpiLocations, Map<String, OcpiTariff> tariffsById) {
        return ocpiLocations.stream()
                .map(location -> energyInfrastructureSiteStatusFrom(location, tariffsById))
                .collect(Collectors.toList());
    }

    private EnergyInfrastructureSiteStatus energyInfrastructureSiteStatusFrom(
            OcpiLocation ocpiLocation, Map<String, OcpiTariff> tariffsById) {
        var energyInfraStructureSiteStatus = new EnergyInfrastructureSiteStatus();
        var facilityObjectVersionedReference = new _FacilityObjectVersionedReference();
        facilityObjectVersionedReference.setId(ocpiLocation.getId());
        energyInfraStructureSiteStatus.setReference(facilityObjectVersionedReference);

        energyInfraStructureSiteStatus.getEnergyInfrastructureStationStatuses()
                .add(energyInfrastructureStationStatusesFrom(ocpiLocation, tariffsById));

        return energyInfraStructureSiteStatus;
    }

    private EnergyInfrastructureStationStatus energyInfrastructureStationStatusesFrom(
            OcpiLocation ocpiLocation, Map<String, OcpiTariff> tariffsById) {
        return energyInfrastructureStationStatusFrom(ocpiLocation.getEvses(), tariffsById);
    }

    private EnergyInfrastructureStationStatus energyInfrastructureStationStatusFrom(
            List<OcpiEvse> ocpiEvses, Map<String, OcpiTariff> tariffsById) {
        var energyInfrastructureStationStatus = new EnergyInfrastructureStationStatus();
        var refillPointStatuses = refillPointStatusesFrom(ocpiEvses, tariffsById);
        var hasAvailableRefillPoints =
                refillPointStatuses
                        .stream()
                        .anyMatch(refillPointStatus ->
                                RefillPointStatusEnum.AVAILABLE ==
                                        refillPointStatus.getStatus().getValue());

        energyInfrastructureStationStatus
                .getRefillPointStatuses()
                .addAll(refillPointStatusesFrom(ocpiEvses, tariffsById));
        energyInfrastructureStationStatus.setIsAvailable(hasAvailableRefillPoints);

        return energyInfrastructureStationStatus;
    }

    private List<RefillPointStatus> refillPointStatusesFrom(
            List<OcpiEvse> ocpiEvses, Map<String, OcpiTariff> tariffsById) {
        return ocpiEvses.stream()
                .map(evse -> refillPointStatus(evse, tariffsById)).collect(Collectors.toList());
    }

    private RefillPointStatus refillPointStatus(
            OcpiEvse ocpiEvse, Map<String, OcpiTariff> tariffsById) {
        var refillPointStatus = new ElectricChargingPointStatus();
        var electricEnergyMix = new ElectricEnergyMix();
        var rates = new GeneralRateInformation();
        var energyPricingPolicy = new EnergyPricingPolicy();
        energyPricingPolicy.getPricingPolicies()
                .addAll(pricingPolicyEnumsFrom(ocpiEvse, tariffsById));

        var highestPriceComponent = priceComponentFrom(ocpiEvse, tariffsById);
        highestPriceComponent.ifPresent(priceComponent ->
                energyPricingPolicy.setMinimumDeliveryFee(priceComponent.getPrice()));

        rates.setEnergyPricingPolicy(energyPricingPolicy);

        electricEnergyMix.setRates(rates);
        refillPointStatus.setStatus(refillPointStatusEnumFrom(ocpiEvse.getStatus()));
        refillPointStatus.getElectricEnergyMixOverrides().add(electricEnergyMix);

        return refillPointStatus;
    }

    private Optional<PriceComponent> priceComponentFrom(
            OcpiEvse ocpiEvse, Map<String, OcpiTariff> tariffsById) {
        return ocpiEvse.getConnectors()
                .stream()
                .map(connector -> tariffsById.get(connector.getTariffId()))
                .map(OcpiTariff::getElements)
                .flatMap(Collection::stream)
                .map(TariffElement::getPriceComponents)
                .flatMap(Collection::stream)
                .filter(priceComponent -> priceComponent.getType() == PriceComponent.TypeEnum.ENERGY)
                .max(Comparator.comparing(PriceComponent::getPrice));
    }

    private List<OcpiTariff> ocpiTariffsFrom(
            List<OcpiConnector> connectors, Map<String, OcpiTariff> tariffsById) {
        return connectors.stream()
                .map(OcpiConnector::getTariffId)
                .map(tariffsById::get)
                .collect(Collectors.toList());
    }

    private List<_PricingPolicyEnum> pricingPolicyEnumsFrom(
            OcpiEvse ocpiEvse, Map<String, OcpiTariff> tariffsById) {
        return ocpiTariffsFrom(ocpiEvse.getConnectors(), tariffsById)
                .stream()
                .flatMap(this::pricingPolicyEnumsFrom)
                .collect(Collectors.toList());
    }

    private Stream<_PricingPolicyEnum> pricingPolicyEnumsFrom(OcpiTariff ocpiTariff) {
        return ocpiTariff.getElements()
                .stream()
                .map(TariffElement::getPriceComponents)
                .flatMap(Collection::stream)
                .map(this::pricingPolicyEnumFrom);
    }

    private _PricingPolicyEnum pricingPolicyEnumFrom(PriceComponent priceComponent) {
        PricingPolicyEnum pricingPolicyEnumValue;

        switch (priceComponent.getType()) {
            case ENERGY:
                pricingPolicyEnumValue = PricingPolicyEnum.PRICE_PER_DELIVERY_UNIT;
            default:
                throw new NdwProcessingException("Unrecognized price component type");
        }

        var pricingPolicyEnum = new _PricingPolicyEnum();
        pricingPolicyEnum.setValue(pricingPolicyEnumValue);
        return pricingPolicyEnum;
    }

    private _RefillPointStatusEnum refillPointStatusEnumFrom(OcpiEvse.StatusEnum statusEnum) {
        RefillPointStatusEnum refillPointStatusEnumValue;

        switch (statusEnum) {
            case AVAILABLE:
                refillPointStatusEnumValue = RefillPointStatusEnum.AVAILABLE;
                break;
            case BLOCKED:
                refillPointStatusEnumValue = RefillPointStatusEnum.BLOCKED;
                break;
            case CHARGING:
                refillPointStatusEnumValue = RefillPointStatusEnum.CHARGING;
                break;
            case INOPERATIVE:
                refillPointStatusEnumValue = RefillPointStatusEnum.INOPERATIVE;
                break;
            case OUTOFORDER:
                refillPointStatusEnumValue = RefillPointStatusEnum.OUT_OF_ORDER;
                break;
            case PLANNED:
                refillPointStatusEnumValue = RefillPointStatusEnum.PLANNED;
                break;
            case REMOVED:
                refillPointStatusEnumValue = RefillPointStatusEnum.REMOVED;
                break;
            case RESERVED:
                refillPointStatusEnumValue = RefillPointStatusEnum.RESERVED;
                break;
            case UNKNOWN:
                refillPointStatusEnumValue = RefillPointStatusEnum.UNKNOWN;
                break;
            default:
                throw new NdwProcessingException("Unrecognized RefillPointStatus type");
        }

        var refillPointStatusEnum = new _RefillPointStatusEnum();
        refillPointStatusEnum.setValue(refillPointStatusEnumValue);

        return refillPointStatusEnum;
    }

    private List<EnergyInfrastructureSite> energyInfrastructureSitesFrom(
            List<OcpiLocation> ocpiLocations) {
        return ocpiLocations.stream()
                .map(this::energyInfraStructureSiteFrom)
                .collect(Collectors.toList());
    }

    private EnergyInfrastructureSite energyInfraStructureSiteFrom(OcpiLocation ocpiLocation) {
        var energyInfrastructureSite = new EnergyInfrastructureSite();

        energyInfrastructureSite.setId(ocpiLocation.getId());
        energyInfrastructureSite.setLocationReference(locationReferenceFrom(ocpiLocation));
        energyInfrastructureSite.setName(
                multiLingualString(valueOrDummyFrom(ocpiLocation.getName())));
        energyInfrastructureSite.setOperatingHours(operatingHoursFrom(ocpiLocation));
        energyInfrastructureSite.setOperator(operatorFrom(ocpiLocation));

        if (ocpiLocation.getOwner() != null) {
            energyInfrastructureSite.setOwner(ownerFrom(ocpiLocation));
        }

        if (ocpiLocation.getLastUpdated() != null) {
            energyInfrastructureSite.setLastUpdated(ocpiLocation.getLastUpdated().toInstant());
        }

        energyInfrastructureSite.getEnergyInfrastructureStations()
                .add(energyInfrastructureStationFrom(ocpiLocation));

        return energyInfrastructureSite;
    }

    private EnergyInfrastructureStation energyInfrastructureStationFrom(OcpiLocation ocpiLocation) {
        var evses = ocpiLocation.getEvses();
        var station = new EnergyInfrastructureStation();
        var organisationSpecification = new OrganisationSpecification();
        var ocpiEnergyMix = ocpiLocation.getEnergyMix();


        station.getRefillPoints().addAll(electricChargingPointsFrom(evses, ocpiLocation));
        station.getAuthenticationAndIdentificationMethods()
                .addAll(uniqueAuthenticationAndIdentificationMethodsFrom(evses));

        if (ocpiEnergyMix != null) {
            organisationSpecification.setName(
                    multiLingualString(valueOrDummyFrom(ocpiEnergyMix.getSupplierName())));
            station.setEnergyProvider(organisationSpecification);
        }

        return station;
    }

    private List<_AuthenticationAndIdentificationEnum>
    uniqueAuthenticationAndIdentificationMethodsFrom(
            List<OcpiEvse> evses) {
        var flattenedAuthenticationMethods = evses.stream()
                .flatMap(this::authenticationAndIdentificationMethodsFrom)
                .collect(Collectors.toList());
        return new ArrayList<>(new HashSet<>(flattenedAuthenticationMethods));
    }

    private Stream<_AuthenticationAndIdentificationEnum> authenticationAndIdentificationMethodsFrom(
            OcpiEvse evse) {
        var capabilities = evse.getCapabilities();
        return capabilities.stream()
                .map(this::authenticationAndIdentificationMethodFrom);
    }

    private _AuthenticationAndIdentificationEnum authenticationAndIdentificationMethodFrom(
            OcpiEvse.CapabilitiesEnum capabilityEnum) {
        AuthenticationAndIdentificationEnum authenticationAndIdentificationEnumValue;

        switch (capabilityEnum) {
            case CREDIT_CARD_PAYABLE:
                authenticationAndIdentificationEnumValue =
                        AuthenticationAndIdentificationEnum.CREDIT_CARD;
                break;
            case REMOTE_START_STOP_CAPABLE:
                authenticationAndIdentificationEnumValue =
                        AuthenticationAndIdentificationEnum.OVER_THE_AIR;
                break;
            case RFID_READER:
                authenticationAndIdentificationEnumValue =
                        AuthenticationAndIdentificationEnum.RFID;
                break;
            // other official ocpi authentication methods would be
            // watch out because the OCPI CapabilitiesEnum is a mixed enum of authentication
            // methods and capabillities
            // CHIP_CARD_SUPPORT
            // CONTACTLESS_CARD_SUPPORT
            // DEBIT_CARD_PAYABLE
            // PED_TERMINAL
            default:
                throw new NdwProcessingException("Unrecognized authentication/identification type");

        }
        var authenticationAndIdentificationEnum = new _AuthenticationAndIdentificationEnum();
        authenticationAndIdentificationEnum.setValue(authenticationAndIdentificationEnumValue);
        return authenticationAndIdentificationEnum;
    }

    private List<ElectricChargingPoint> electricChargingPointsFrom(
            List<OcpiEvse> evses, OcpiLocation ocpiLocation) {
        return evses.stream()
                .map(evse -> electricChargingPointFrom(evse, ocpiLocation))
                .collect(Collectors.toList());
    }

    private ElectricChargingPoint electricChargingPointFrom(
            OcpiEvse evse, OcpiLocation ocpiLocation) {
        var electricChargingPoint = new ElectricChargingPoint();
        var ocpiLocationEnergyMix = ocpiLocation.getEnergyMix();
        electricChargingPoint.setExternalIdentifier(valueOrDummyFrom(evse.getUid()));
        electricChargingPoint.getConnectors()
                .addAll(evse.getConnectors()
                        .stream()
                        .map(this::connectorFrom)
                        .collect(Collectors.toList()));

        electricEnergyMixFrom(ocpiLocationEnergyMix)
                .ifPresent(energyMix -> electricChargingPoint.getElectricEnergyMixes()
                        .add(energyMix));

        return electricChargingPoint;
    }

    private Connector connectorFrom(OcpiConnector ocpiConnector) {
        var connector = new Connector();
        connector.setChargingMode(chargingModeEnumFromPowerTypeEnum(ocpiConnector.getPowerType()));
        connector.setConnectorType(
                connectorTypeEnumFromConnectorEnumType(ocpiConnector.getStandard()));
        connector.setVoltage(ocpiConnector.getVoltage().floatValue());
        connector.setMaximumCurrent(ocpiConnector.getAmperage().floatValue());
        connector.setConnectorFormat(connectorFormatTypeEnumFrom(ocpiConnector.getFormat()));

        return connector;
    }

    private Optional<ElectricEnergyMix> electricEnergyMixFrom(EnergyMix energyMix) {
        if (energyMix != null) {
            var electricEnergyMix = new ElectricEnergyMix();
            electricEnergyMix.setEnergyProductName(
                    multiLingualString(energyMix.getEnergyProductName()));
            var electricEnergySourceRatios = energyMix.getEnergySources()
                    .stream()
                    .map(this::electricEnergySourceRatioFrom)
                    .collect(Collectors.toList());

            electricEnergyMix.getElectricEnergySourceRatios().addAll(electricEnergySourceRatios);

            return Optional.of(electricEnergyMix);
        } else {
            return Optional.empty();
        }
    }

    private ElectricEnergySourceRatio electricEnergySourceRatioFrom(EnergySource energySource) {
        var electricEnergySourceRatio = new ElectricEnergySourceRatio();
        var percentageValue = new PercentageValue();
        percentageValue.setPercentage(energySource.getPercentage().floatValue());
        electricEnergySourceRatio
                .setSourceRatioValue(percentageValue);
        electricEnergySourceRatio
                .setEnergySource(electricEnergySourceTypeEnumFrom(energySource.getSource()));
        return electricEnergySourceRatio;
    }

    private _ElectricEnergySourceTypeEnum electricEnergySourceTypeEnumFrom(
            EnergySource.SourceEnum sourceType) {

        ElectricEnergySourceTypeEnum electricEnergySourceTypeEnumValue;

        switch (sourceType) {
            case NUCLEAR:
                electricEnergySourceTypeEnumValue = ElectricEnergySourceTypeEnum.NUCLEAR;
                break;
            case GENERAL_FOSSIL:
                electricEnergySourceTypeEnumValue = ElectricEnergySourceTypeEnum.GENERAL_FOSSIL;
                break;
            case COAL:
                electricEnergySourceTypeEnumValue = ElectricEnergySourceTypeEnum.COAL;
                break;
            case GAS:
                electricEnergySourceTypeEnumValue = ElectricEnergySourceTypeEnum.GAS;
                break;
            case GENERAL_GREEN:
                electricEnergySourceTypeEnumValue = ElectricEnergySourceTypeEnum.GENERAL_GREEN;
                break;
            case SOLAR:
                electricEnergySourceTypeEnumValue = ElectricEnergySourceTypeEnum.SOLAR;
                break;
            case WIND:
                electricEnergySourceTypeEnumValue = ElectricEnergySourceTypeEnum.WIND;
                break;
            case WATER:
                electricEnergySourceTypeEnumValue = ElectricEnergySourceTypeEnum.WATER;
                break;
            default:
                throw new NdwProcessingException("Unrecognized electric source type");
        }

        var electricEnergySourceTypeEnum = new _ElectricEnergySourceTypeEnum();
        electricEnergySourceTypeEnum.setValue(electricEnergySourceTypeEnumValue);

        return electricEnergySourceTypeEnum;
    }

    private _ChargingModeEnum chargingModeEnumFromPowerTypeEnum(
            OcpiConnector.PowerTypeEnum powerType) {
        ChargingModeEnum chargingModeEnumValue;

        switch (powerType) {
            case AC_1_PHASE:
                chargingModeEnumValue = ChargingModeEnum.MODE_2_AC_1_P;
                break;
            case AC_3_PHASE:
                chargingModeEnumValue = ChargingModeEnum.MODE_3_AC_3_P;
                break;
            case DC:
                chargingModeEnumValue = ChargingModeEnum.MODE_4_DC;
                break;
            default:
                throw new NdwProcessingException("Unrecognized power type");
        }

        var chargingModeEnum = new _ChargingModeEnum();
        chargingModeEnum.setValue(chargingModeEnumValue);
        return chargingModeEnum;
    }

    private _ConnectorTypeEnum connectorTypeEnumFromConnectorEnumType(
            OcpiConnector.StandardEnum ocpiConnectorStandard) {
        ConnectorTypeEnum connectorTypeEnumValue;

        switch (ocpiConnectorStandard) {
            case CHADEMO:
                connectorTypeEnumValue = ConnectorTypeEnum.CHADEMO;
                break;
            case DOMESTIC_A:
                connectorTypeEnumValue = ConnectorTypeEnum.DOMESTIC_A;
                break;
            case DOMESTIC_B:
                connectorTypeEnumValue = ConnectorTypeEnum.DOMESTIC_B;
                break;
            case DOMESTIC_C:
                connectorTypeEnumValue = ConnectorTypeEnum.DOMESTIC_C;
                break;
            case DOMESTIC_D:
                connectorTypeEnumValue = ConnectorTypeEnum.DOMESTIC_D;
                break;
            case DOMESTIC_E:
                connectorTypeEnumValue = ConnectorTypeEnum.DOMESTIC_E;
                break;
            case DOMESTIC_F:
                connectorTypeEnumValue = ConnectorTypeEnum.DOMESTIC_F;
                break;
            case DOMESTIC_G:
                connectorTypeEnumValue = ConnectorTypeEnum.DOMESTIC_G;
                break;
            case DOMESTIC_H:
                connectorTypeEnumValue = ConnectorTypeEnum.DOMESTIC_H;
                break;
            case DOMESTIC_I:
                connectorTypeEnumValue = ConnectorTypeEnum.DOMESTIC_I;
                break;
            case DOMESTIC_J:
                connectorTypeEnumValue = ConnectorTypeEnum.DOMESTIC_J;
                break;
            case DOMESTIC_K:
                connectorTypeEnumValue = ConnectorTypeEnum.DOMESTIC_K;
                break;
            case DOMESTIC_L:
                connectorTypeEnumValue = ConnectorTypeEnum.DOMESTIC_L;
                break;
            case IEC_60309_2_SINGLE_16:
                connectorTypeEnumValue = ConnectorTypeEnum.IEC_60309_X_2_SINGLE_16;
                break;
            case IEC_60309_2_THREE_16:
                connectorTypeEnumValue = ConnectorTypeEnum.IEC_60309_X_2_THREE_16;
                break;
            case IEC_60309_2_THREE_32:
                connectorTypeEnumValue = ConnectorTypeEnum.IEC_60309_X_2_THREE_32;
                break;
            case IEC_60309_2_THREE_64:
                connectorTypeEnumValue = ConnectorTypeEnum.IEC_60309_X_2_THREE_64;
                break;
            case IEC_62196_T1:
                connectorTypeEnumValue = ConnectorTypeEnum.IEC_62196_T_1;
                break;
            case IEC_62196:
                connectorTypeEnumValue = ConnectorTypeEnum.OTHER;
                break;
            case IEC_62196_T1_COMBO:
                connectorTypeEnumValue = ConnectorTypeEnum.IEC_62196_T_1_COMBO;
                break;
            case IEC_62196_T2:
                connectorTypeEnumValue = ConnectorTypeEnum.IEC_62196_T_2;
                break;
            case IEC_62196_T2_COMBO:
                connectorTypeEnumValue = ConnectorTypeEnum.IEC_62196_T_2_COMBO;
                break;
            case IEC_62196_T3A:
                connectorTypeEnumValue = ConnectorTypeEnum.IEC_62196_T_3_A;
                break;
            case IEC_62196_T3C:
                connectorTypeEnumValue = ConnectorTypeEnum.IEC_62196_T_3_C;
                break;
            case TESLA_R:
                connectorTypeEnumValue = ConnectorTypeEnum.TESLA_R;
                break;
            case TESLA_S:
                connectorTypeEnumValue = ConnectorTypeEnum.TESLA_S;
                break;
            default:
                throw new NdwProcessingException("Unrecognized connector type");
        }

        var connectorTypeEnum = new _ConnectorTypeEnum();
        connectorTypeEnum.setValue(connectorTypeEnumValue);
        return connectorTypeEnum;
    }

    private _ConnectorFormatTypeEnum connectorFormatTypeEnumFrom(
            OcpiConnector.FormatEnum ocpiFormatEnum) {
        ConnectorFormatTypeEnum connectorTypeEnumValue;

        switch (ocpiFormatEnum) {
            case SOCKET:
                connectorTypeEnumValue = ConnectorFormatTypeEnum.SOCKET;
                break;
            case CABLE:
                connectorTypeEnumValue = ConnectorFormatTypeEnum.CABLE_MODE_3;
                break;
            default:
                throw new NdwProcessingException("Unrecognized connector format type");
        }

        var connectorFormatTypeEnum = new _ConnectorFormatTypeEnum();
        connectorFormatTypeEnum.setValue(connectorTypeEnumValue);
        return connectorFormatTypeEnum;
    }

    private OperatingHours operatingHoursFrom(OcpiLocation ocpiLocation) {
        var openingTimes = ocpiLocation.getOpeningTimes();

        if (openingTimes == null) {
            return new UnknownOperatingHours();
        } else if (Boolean.TRUE.equals(openingTimes.isTwentyfourseven())) {
            return new OpenAllHours();
        } else {
            throw new UnsupportedOperationException(
                    "Found operating hours while mapping that have not been implemented yet");
        }
    }

    private OrganisationSpecification operatorFrom(OcpiLocation ocpiLocation) {
        var operator = new OrganisationSpecification();

        operator.setName(
                multiLingualString(valueOrDummyFrom(ocpiLocation.getOperator().getName())));
        subOrganisationFrom(ocpiLocation)
                .ifPresent(organisationSpecification ->
                        operator.getSubOrganisations().add(organisationSpecification));
        operator.getOrganisationUnits().add(organisationUnitFrom());
        operator.setNationalOrganisationNumber(DUMMY_STRING_VALUE);

        if (ocpiLocation.getOperator().getWebsite() != null) {
            operator.setLinkToGeneralInformation(ocpiLocation.getOperator().getWebsite());
        }

        return operator;
    }

    private OrganisationSpecification ownerFrom(OcpiLocation ocpiLocation) {
        var owner = new OrganisationSpecification();
        var ocpiOwner = ocpiLocation.getOwner();
        var ownerWebsite = ocpiOwner.getWebsite();

        owner.setName(multiLingualString(ocpiLocation.getOwner().getName()));
        if (ownerWebsite != null) {
            owner.setLinkToGeneralInformation(ocpiLocation.getOwner().getWebsite());
        }

        return owner;
    }

    private OrganisationUnit organisationUnitFrom() {
        var organisationUnit = new OrganisationUnit();
        var contactInformation = new ContactInformation();

        // ocpi does not contain a telephone number
        contactInformation.setTelephoneNumber("00000000");
        organisationUnit.getContactInformations().add(contactInformation);
        return organisationUnit;
    }

    private Optional<OrganisationSpecification> subOrganisationFrom(OcpiLocation ocpiLocation) {
        var subOperator = ocpiLocation.getSuboperator();

        if (subOperator != null) {
            var subOrganisation = new OrganisationSpecification();
            subOrganisation.setName(
                    multiLingualString(
                            valueOrDummyFrom(ocpiLocation
                                    .getSuboperator()
                                    .getName())));
            return Optional.of(subOrganisation);
        } else {
            return Optional.empty();
        }
    }

    private LocationReference locationReferenceFrom(OcpiLocation location) {
        var coordinates = coordinatesFrom(location.getCoordinates());

        var pointLocation = new PointLocation();
        pointLocation.setPointByCoordinates(coordinates);

        var facilityLocation = new FacilityLocation();
        var locationRefExtensionType = new _LocationReferenceExtensionType();

        var address = addressFrom(location);
        facilityLocation.setAddress(address);
        facilityLocation.setTimeZone(location.getTimeZone());

        locationRefExtensionType.setFacilityLocation(facilityLocation);

        pointLocation.set_LocationReferenceExtension(locationRefExtensionType);

        return pointLocation;
    }

    private PointByCoordinates coordinatesFrom(OcpiGeoLocation coordinates) {
        var pointByCoordinates = new PointByCoordinates();
        var pointCoordinates = new PointCoordinates();

        try {
            pointCoordinates.setLatitude(Float.parseFloat(
                    valueOrDummyFrom(coordinates.getLatitude())));
            pointCoordinates.setLongitude(Float.parseFloat(
                    valueOrDummyFrom(coordinates.getLongitude())));
            pointByCoordinates.setPointCoordinates(pointCoordinates);
            return pointByCoordinates;
        } catch (NumberFormatException e) {
            throw new NdwProcessingException("Exception on parsing location coordinates", e);
        }
    }

    private Address addressFrom(OcpiLocation location) {
        var address = new Address();

        var streetAndHouseNumber =
                AddressUtil.seperatedStreetAndHouseNumberFrom(location.getAddress());

        var streetAddressLine = new AddressLine();
        streetAddressLine.setText(
                multiLingualString(valueOrDummyFrom(streetAndHouseNumber.street)));
        streetAddressLine.setType(addressLineTypeEnum(AddressLineTypeEnum.STREET));

        var houseNumberAddressLine = new AddressLine();
        houseNumberAddressLine.setText(
                multiLingualString(valueOrDummyFrom(streetAndHouseNumber.houseNumber)));
        houseNumberAddressLine.setType(addressLineTypeEnum(AddressLineTypeEnum.HOUSE_NUMBER));

        address.getAddressLines()
                .addAll(Arrays.asList(
                        streetAddressLine,
                        houseNumberAddressLine));
        address.setPostcode(valueOrDummyFrom(location.getPostalCode()));
        address.setCity(multiLingualString(valueOrDummyFrom(location.getCity())));
        address.setCountryCode(location.getCountry());

        return address;
    }

    private _AddressLineTypeEnum addressLineTypeEnum(AddressLineTypeEnum addressLineTypeEnum) {
        var type = new _AddressLineTypeEnum();
        type.setValue(addressLineTypeEnum);

        return type;
    }

    private MultilingualString multiLingualString(String value) {
        var multilingualStringValue = new MultilingualStringValue();
        multilingualStringValue.setValue(value);

        var values = new MultilingualString.Values();
        values.getValues().add(multilingualStringValue);

        var mlString = new MultilingualString();
        mlString.setValues(values);

        return mlString;
    }

    private String valueOrDummyFrom(String value) {
        return value == null || value.isBlank() ? DUMMY_STRING_VALUE : value;
    }
}
