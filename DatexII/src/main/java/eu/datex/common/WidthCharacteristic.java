
package eu.datex.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for WidthCharacteristic complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="WidthCharacteristic"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="comparisonOperator" type="{http://datex2.eu/schema/3/common}_ComparisonOperatorEnum"/&amp;gt;
 *         &amp;lt;element name="vehicleWidth" type="{http://datex2.eu/schema/3/common}MetresAsFloat"/&amp;gt;
 *         &amp;lt;element name="_widthCharacteristicExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WidthCharacteristic", propOrder = {
    "comparisonOperator",
    "vehicleWidth",
    "_WidthCharacteristicExtension"
})
@ToString
@EqualsAndHashCode
public class WidthCharacteristic {

    @XmlElement(required = true)
    protected _ComparisonOperatorEnum comparisonOperator;
    protected float vehicleWidth;
    @XmlElement(name = "_widthCharacteristicExtension")
    protected _ExtensionType _WidthCharacteristicExtension;

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
     * Gets the value of the vehicleWidth property.
     * 
     */
    public float getVehicleWidth() {
        return vehicleWidth;
    }

    /**
     * Sets the value of the vehicleWidth property.
     * 
     */
    public void setVehicleWidth(float value) {
        this.vehicleWidth = value;
    }

    /**
     * Gets the value of the _WidthCharacteristicExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_WidthCharacteristicExtension() {
        return _WidthCharacteristicExtension;
    }

    /**
     * Sets the value of the _WidthCharacteristicExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_WidthCharacteristicExtension(_ExtensionType value) {
        this._WidthCharacteristicExtension = value;
    }

}
