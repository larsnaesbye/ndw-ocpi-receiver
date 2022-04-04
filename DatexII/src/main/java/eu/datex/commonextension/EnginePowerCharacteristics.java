
package eu.datex.commonextension;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ComparisonOperatorEnum;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for EnginePowerCharacteristics complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="EnginePowerCharacteristics"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="comparisonOperator" type="{http://datex2.eu/schema/3/common}_ComparisonOperatorEnum"/&amp;gt;
 *         &amp;lt;element name="enginePower" type="{http://datex2.eu/schema/3/common}Float"/&amp;gt;
 *         &amp;lt;element name="unitOfMeasure" type="{http://datex2.eu/schema/3/commonExtension}_PowerUnitOfMeasureEnum"/&amp;gt;
 *         &amp;lt;element name="_enginePowerCharacteristicsExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnginePowerCharacteristics", propOrder = {
    "comparisonOperator",
    "enginePower",
    "unitOfMeasure",
    "_EnginePowerCharacteristicsExtension"
})
@ToString
@EqualsAndHashCode
public class EnginePowerCharacteristics {

    @XmlElement(required = true)
    protected _ComparisonOperatorEnum comparisonOperator;
    protected float enginePower;
    @XmlElement(required = true)
    protected _PowerUnitOfMeasureEnum unitOfMeasure;
    @XmlElement(name = "_enginePowerCharacteristicsExtension")
    protected _ExtensionType _EnginePowerCharacteristicsExtension;

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
     * Gets the value of the enginePower property.
     * 
     */
    public float getEnginePower() {
        return enginePower;
    }

    /**
     * Sets the value of the enginePower property.
     * 
     */
    public void setEnginePower(float value) {
        this.enginePower = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link _PowerUnitOfMeasureEnum }
     *     
     */
    public _PowerUnitOfMeasureEnum getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link _PowerUnitOfMeasureEnum }
     *     
     */
    public void setUnitOfMeasure(_PowerUnitOfMeasureEnum value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the _EnginePowerCharacteristicsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_EnginePowerCharacteristicsExtension() {
        return _EnginePowerCharacteristicsExtension;
    }

    /**
     * Sets the value of the _EnginePowerCharacteristicsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_EnginePowerCharacteristicsExtension(_ExtensionType value) {
        this._EnginePowerCharacteristicsExtension = value;
    }

}
