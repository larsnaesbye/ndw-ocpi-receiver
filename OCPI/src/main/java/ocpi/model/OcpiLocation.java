/*
 * roaming-location-prd
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ocpi.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import ocpi.model.AdditionalGeoLocation;
import ocpi.model.BusinessDetails;
import ocpi.model.EnergyMix;
import ocpi.model.OcpiDisplayText;
import ocpi.model.OcpiEvse;
import ocpi.model.OcpiGeoLocation;
import ocpi.model.OcpiHours;
import ocpi.model.OcpiImage;
/**
 * OcpiLocation
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-31T14:42:19.145134152+02:00[Europe/Amsterdam]")
public class OcpiLocation {
  @JsonProperty("id")
  private String id = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    ON_STREET("ON_STREET"),
    PARKING_GARAGE("PARKING_GARAGE"),
    UNDERGROUND_GARAGE("UNDERGROUND_GARAGE"),
    PARKING_LOT("PARKING_LOT"),
    OTHER("OTHER"),
    PRIVATE("PRIVATE"),
    UNKNOWN("UNKNOWN");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("address")
  private String address = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("coordinates")
  private OcpiGeoLocation coordinates = null;

  @JsonProperty("evses")
  private List<OcpiEvse> evses = null;

  @JsonProperty("directions")
  private List<OcpiDisplayText> directions = null;

  @JsonProperty("operator")
  private BusinessDetails operator = null;

  @JsonProperty("suboperator")
  private BusinessDetails suboperator = null;

  @JsonProperty("owner")
  private BusinessDetails owner = null;

  /**
   * Gets or Sets facilities
   */
  public enum FacilitiesEnum {
    HOTEL("HOTEL"),
    RESTAURANT("RESTAURANT"),
    CAFE("CAFE"),
    MALL("MALL"),
    SUPERMARKET("SUPERMARKET"),
    SPORT("SPORT"),
    RECREATION_AREA("RECREATION_AREA"),
    NATURE("NATURE"),
    MUSEUM("MUSEUM"),
    BUS_STOP("BUS_STOP"),
    TAXI_STAND("TAXI_STAND"),
    TRAIN_STATION("TRAIN_STATION"),
    AIRPORT("AIRPORT"),
    CARPOOL_PARKING("CARPOOL_PARKING"),
    FUEL_STATION("FUEL_STATION"),
    WIFI("WIFI");

    private String value;

    FacilitiesEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static FacilitiesEnum fromValue(String text) {
      for (FacilitiesEnum b : FacilitiesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("facilities")
  private List<FacilitiesEnum> facilities = null;

  @JsonProperty("images")
  private List<OcpiImage> images = null;

  @JsonProperty("postal_code")
  private String postalCode = null;

  @JsonProperty("related_locations")
  private List<AdditionalGeoLocation> relatedLocations = null;

  @JsonProperty("time_zone")
  private String timeZone = null;

  @JsonProperty("opening_times")
  private OcpiHours openingTimes = null;

  @JsonProperty("charging_when_closed")
  private Boolean chargingWhenClosed = null;

  @JsonProperty("energy_mix")
  private EnergyMix energyMix = null;

  @JsonProperty("last_updated")
  private OffsetDateTime lastUpdated = null;

  public OcpiLocation id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OcpiLocation type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public OcpiLocation name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OcpiLocation address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @Schema(required = true, description = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public OcpiLocation city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @Schema(required = true, description = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public OcpiLocation country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @Schema(required = true, description = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public OcpiLocation coordinates(OcpiGeoLocation coordinates) {
    this.coordinates = coordinates;
    return this;
  }

   /**
   * Get coordinates
   * @return coordinates
  **/
  @Schema(required = true, description = "")
  public OcpiGeoLocation getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(OcpiGeoLocation coordinates) {
    this.coordinates = coordinates;
  }

  public OcpiLocation evses(List<OcpiEvse> evses) {
    this.evses = evses;
    return this;
  }

  public OcpiLocation addEvsesItem(OcpiEvse evsesItem) {
    if (this.evses == null) {
      this.evses = new ArrayList<>();
    }
    this.evses.add(evsesItem);
    return this;
  }

   /**
   * Get evses
   * @return evses
  **/
  @Schema(description = "")
  public List<OcpiEvse> getEvses() {
    return evses;
  }

  public void setEvses(List<OcpiEvse> evses) {
    this.evses = evses;
  }

  public OcpiLocation directions(List<OcpiDisplayText> directions) {
    this.directions = directions;
    return this;
  }

  public OcpiLocation addDirectionsItem(OcpiDisplayText directionsItem) {
    if (this.directions == null) {
      this.directions = new ArrayList<>();
    }
    this.directions.add(directionsItem);
    return this;
  }

   /**
   * Get directions
   * @return directions
  **/
  @Schema(description = "")
  public List<OcpiDisplayText> getDirections() {
    return directions;
  }

  public void setDirections(List<OcpiDisplayText> directions) {
    this.directions = directions;
  }

  public OcpiLocation operator(BusinessDetails operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  @Schema(description = "")
  public BusinessDetails getOperator() {
    return operator;
  }

  public void setOperator(BusinessDetails operator) {
    this.operator = operator;
  }

  public OcpiLocation suboperator(BusinessDetails suboperator) {
    this.suboperator = suboperator;
    return this;
  }

   /**
   * Get suboperator
   * @return suboperator
  **/
  @Schema(description = "")
  public BusinessDetails getSuboperator() {
    return suboperator;
  }

  public void setSuboperator(BusinessDetails suboperator) {
    this.suboperator = suboperator;
  }

  public OcpiLocation owner(BusinessDetails owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @Schema(description = "")
  public BusinessDetails getOwner() {
    return owner;
  }

  public void setOwner(BusinessDetails owner) {
    this.owner = owner;
  }

  public OcpiLocation facilities(List<FacilitiesEnum> facilities) {
    this.facilities = facilities;
    return this;
  }

  public OcpiLocation addFacilitiesItem(FacilitiesEnum facilitiesItem) {
    if (this.facilities == null) {
      this.facilities = new ArrayList<>();
    }
    this.facilities.add(facilitiesItem);
    return this;
  }

   /**
   * Get facilities
   * @return facilities
  **/
  @Schema(description = "")
  public List<FacilitiesEnum> getFacilities() {
    return facilities;
  }

  public void setFacilities(List<FacilitiesEnum> facilities) {
    this.facilities = facilities;
  }

  public OcpiLocation images(List<OcpiImage> images) {
    this.images = images;
    return this;
  }

  public OcpiLocation addImagesItem(OcpiImage imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * Get images
   * @return images
  **/
  @Schema(description = "")
  public List<OcpiImage> getImages() {
    return images;
  }

  public void setImages(List<OcpiImage> images) {
    this.images = images;
  }

  public OcpiLocation postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @Schema(required = true, description = "")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public OcpiLocation relatedLocations(List<AdditionalGeoLocation> relatedLocations) {
    this.relatedLocations = relatedLocations;
    return this;
  }

  public OcpiLocation addRelatedLocationsItem(AdditionalGeoLocation relatedLocationsItem) {
    if (this.relatedLocations == null) {
      this.relatedLocations = new ArrayList<>();
    }
    this.relatedLocations.add(relatedLocationsItem);
    return this;
  }

   /**
   * Get relatedLocations
   * @return relatedLocations
  **/
  @Schema(description = "")
  public List<AdditionalGeoLocation> getRelatedLocations() {
    return relatedLocations;
  }

  public void setRelatedLocations(List<AdditionalGeoLocation> relatedLocations) {
    this.relatedLocations = relatedLocations;
  }

  public OcpiLocation timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Get timeZone
   * @return timeZone
  **/
  @Schema(description = "")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public OcpiLocation openingTimes(OcpiHours openingTimes) {
    this.openingTimes = openingTimes;
    return this;
  }

   /**
   * Get openingTimes
   * @return openingTimes
  **/
  @Schema(description = "")
  public OcpiHours getOpeningTimes() {
    return openingTimes;
  }

  public void setOpeningTimes(OcpiHours openingTimes) {
    this.openingTimes = openingTimes;
  }

  public OcpiLocation chargingWhenClosed(Boolean chargingWhenClosed) {
    this.chargingWhenClosed = chargingWhenClosed;
    return this;
  }

   /**
   * Get chargingWhenClosed
   * @return chargingWhenClosed
  **/
  @Schema(description = "")
  public Boolean isChargingWhenClosed() {
    return chargingWhenClosed;
  }

  public void setChargingWhenClosed(Boolean chargingWhenClosed) {
    this.chargingWhenClosed = chargingWhenClosed;
  }

  public OcpiLocation energyMix(EnergyMix energyMix) {
    this.energyMix = energyMix;
    return this;
  }

   /**
   * Get energyMix
   * @return energyMix
  **/
  @Schema(description = "")
  public EnergyMix getEnergyMix() {
    return energyMix;
  }

  public void setEnergyMix(EnergyMix energyMix) {
    this.energyMix = energyMix;
  }

  public OcpiLocation lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @Schema(required = true, description = "")
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OcpiLocation ocpiLocation = (OcpiLocation) o;
    return Objects.equals(this.id, ocpiLocation.id) &&
        Objects.equals(this.type, ocpiLocation.type) &&
        Objects.equals(this.name, ocpiLocation.name) &&
        Objects.equals(this.address, ocpiLocation.address) &&
        Objects.equals(this.city, ocpiLocation.city) &&
        Objects.equals(this.country, ocpiLocation.country) &&
        Objects.equals(this.coordinates, ocpiLocation.coordinates) &&
        Objects.equals(this.evses, ocpiLocation.evses) &&
        Objects.equals(this.directions, ocpiLocation.directions) &&
        Objects.equals(this.operator, ocpiLocation.operator) &&
        Objects.equals(this.suboperator, ocpiLocation.suboperator) &&
        Objects.equals(this.owner, ocpiLocation.owner) &&
        Objects.equals(this.facilities, ocpiLocation.facilities) &&
        Objects.equals(this.images, ocpiLocation.images) &&
        Objects.equals(this.postalCode, ocpiLocation.postalCode) &&
        Objects.equals(this.relatedLocations, ocpiLocation.relatedLocations) &&
        Objects.equals(this.timeZone, ocpiLocation.timeZone) &&
        Objects.equals(this.openingTimes, ocpiLocation.openingTimes) &&
        Objects.equals(this.chargingWhenClosed, ocpiLocation.chargingWhenClosed) &&
        Objects.equals(this.energyMix, ocpiLocation.energyMix) &&
        Objects.equals(this.lastUpdated, ocpiLocation.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, name, address, city, country, coordinates, evses, directions, operator, suboperator, owner, facilities, images, postalCode, relatedLocations, timeZone, openingTimes, chargingWhenClosed, energyMix, lastUpdated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcpiLocation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    evses: ").append(toIndentedString(evses)).append("\n");
    sb.append("    directions: ").append(toIndentedString(directions)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    suboperator: ").append(toIndentedString(suboperator)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    facilities: ").append(toIndentedString(facilities)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    relatedLocations: ").append(toIndentedString(relatedLocations)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    openingTimes: ").append(toIndentedString(openingTimes)).append("\n");
    sb.append("    chargingWhenClosed: ").append(toIndentedString(chargingWhenClosed)).append("\n");
    sb.append("    energyMix: ").append(toIndentedString(energyMix)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}