
package eu.datex.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for GrossWeightCharacteristic complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="GrossWeightCharacteristic"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="comparisonOperator" type="{http://datex2.eu/schema/3/common}_ComparisonOperatorEnum"/&amp;gt;
 *         &amp;lt;element name="grossVehicleWeight" type="{http://datex2.eu/schema/3/common}Tonnes"/&amp;gt;
 *         &amp;lt;element name="typeOfWeight" type="{http://datex2.eu/schema/3/common}_WeightTypeEnum"/&amp;gt;
 *         &amp;lt;element name="_grossWeightCharacteristicExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrossWeightCharacteristic", propOrder = {
    "comparisonOperator",
    "grossVehicleWeight",
    "typeOfWeight",
    "_GrossWeightCharacteristicExtension"
})
@ToString
@EqualsAndHashCode
public class GrossWeightCharacteristic {

    @XmlElement(required = true)
    protected _ComparisonOperatorEnum comparisonOperator;
    protected float grossVehicleWeight;
    @XmlElement(required = true)
    protected _WeightTypeEnum typeOfWeight;
    @XmlElement(name = "_grossWeightCharacteristicExtension")
    protected _ExtensionType _GrossWeightCharacteristicExtension;

    /**
     * Gets the value of the comparisonOperator property.
     * 
     * @return
     *     possible object is
     *     {@link _ComparisonOperatorEnum }
     *     
     */
    public _ComparisonOperatorEnum getComparisonOperator() {
        return comparisonOperator;
    }

    /**
     * Sets the value of the comparisonOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ComparisonOperatorEnum }
     *     
     */
    public void setComparisonOperator(_ComparisonOperatorEnum value) {
        this.comparisonOperator = value;
    }

    /**
     * Gets the value of the grossVehicleWeight property.
     * 
     */
    public float getGrossVehicleWeight() {
        return grossVehicleWeight;
    }

    /**
     * Sets the value of the grossVehicleWeight property.
     * 
     */
    public void setGrossVehicleWeight(float value) {
        this.grossVehicleWeight = value;
    }

    /**
     * Gets the value of the typeOfWeight property.
     * 
     * @return
     *     possible object is
     *     {@link _WeightTypeEnum }
     *     
     */
    public _WeightTypeEnum getTypeOfWeight() {
        return typeOfWeight;
    }

    /**
     * Sets the value of the typeOfWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link _WeightTypeEnum }
     *     
     */
    public void setTypeOfWeight(_WeightTypeEnum value) {
        this.typeOfWeight = value;
    }

    /**
     * Gets the value of the _GrossWeightCharacteristicExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_GrossWeightCharacteristicExtension() {
        return _GrossWeightCharacteristicExtension;
    }

    /**
     * Sets the value of the _GrossWeightCharacteristicExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_GrossWeightCharacteristicExtension(_ExtensionType value) {
        this._GrossWeightCharacteristicExtension = value;
    }

}
