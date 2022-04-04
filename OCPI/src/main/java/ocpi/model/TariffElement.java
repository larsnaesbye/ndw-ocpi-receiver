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
import java.util.ArrayList;
import java.util.List;
import ocpi.model.PriceComponent;
import ocpi.model.TariffRestrictions;
/**
 * TariffElement
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-31T14:42:19.145134152+02:00[Europe/Amsterdam]")
public class TariffElement {
  @JsonProperty("price_components")
  private List<PriceComponent> priceComponents = new ArrayList<>();

  @JsonProperty("restrictions")
  private TariffRestrictions restrictions = null;

  public TariffElement priceComponents(List<PriceComponent> priceComponents) {
    this.priceComponents = priceComponents;
    return this;
  }

  public TariffElement addPriceComponentsItem(PriceComponent priceComponentsItem) {
    this.priceComponents.add(priceComponentsItem);
    return this;
  }

   /**
   * Get priceComponents
   * @return priceComponents
  **/
  @Schema(required = true, description = "")
  public List<PriceComponent> getPriceComponents() {
    return priceComponents;
  }

  public void setPriceComponents(List<PriceComponent> priceComponents) {
    this.priceComponents = priceComponents;
  }

  public TariffElement restrictions(TariffRestrictions restrictions) {
    this.restrictions = restrictions;
    return this;
  }

   /**
   * Get restrictions
   * @return restrictions
  **/
  @Schema(description = "")
  public TariffRestrictions getRestrictions() {
    return restrictions;
  }

  public void setRestrictions(TariffRestrictions restrictions) {
    this.restrictions = restrictions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TariffElement tariffElement = (TariffElement) o;
    return Objects.equals(this.priceComponents, tariffElement.priceComponents) &&
        Objects.equals(this.restrictions, tariffElement.restrictions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceComponents, restrictions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TariffElement {\n");
    
    sb.append("    priceComponents: ").append(toIndentedString(priceComponents)).append("\n");
    sb.append("    restrictions: ").append(toIndentedString(restrictions)).append("\n");
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
