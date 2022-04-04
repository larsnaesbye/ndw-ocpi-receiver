
package eu.datex.energyinfrastructure;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common.PercentageValue;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for ElectricEnergySourceRatio complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ElectricEnergySourceRatio"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="energySource" type="{http://datex2.eu/schema/3/energyInfrastructure}_ElectricEnergySourceTypeEnum"/&amp;gt;
 *         &amp;lt;element name="otherEnergySource" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sourceRatioValue" type="{http://datex2.eu/schema/3/common}PercentageValue"/&amp;gt;
 *         &amp;lt;element name="_electricEnergySourceRatioExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricEnergySourceRatio", propOrder = {
    "energySource",
    "otherEnergySource",
    "sourceRatioValue",
    "_ElectricEnergySourceRatioExtension"
})
@ToString
@EqualsAndHashCode
public class ElectricEnergySourceRatio {

    @XmlElement(required = true)
    protected _ElectricEnergySourceTypeEnum energySource;
    protected String otherEnergySource;
    @XmlElement(required = true)
    protected PercentageValue sourceRatioValue;
    @XmlElement(name = "_electricEnergySourceRatioExtension")
    protected _ExtensionType _ElectricEnergySourceRatioExtension;

    /**
     * Gets the value of the energySource property.
     * 
     * @return
     *     possible object is
     *     {@link _ElectricEnergySourceTypeEnum }
     *     
     */
    public _ElectricEnergySourceTypeEnum getEnergySource() {
        return energySource;
    }

    /**
     * Sets the value of the energySource property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ElectricEnergySourceTypeEnum }
     *     
     */
    public void setEnergySource(_ElectricEnergySourceTypeEnum value) {
        this.energySource = value;
    }

    /**
     * Gets the value of the otherEnergySource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherEnergySource() {
        return otherEnergySource;
    }

    /**
     * Sets the value of the otherEnergySource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherEnergySource(String value) {
        this.otherEnergySource = value;
    }

    /**
     * Gets the value of the sourceRatioValue property.
     * 
     * @return
     *     possible object is
     *     {@link PercentageValue }
     *     
     */
    public PercentageValue getSourceRatioValue() {
        return sourceRatioValue;
    }

    /**
     * Sets the value of the sourceRatioValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageValue }
     *     
     */
    public void setSourceRatioValue(PercentageValue value) {
        this.sourceRatioValue = value;
    }

    /**
     * Gets the value of the _ElectricEnergySourceRatioExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_ElectricEnergySourceRatioExtension() {
        return _ElectricEnergySourceRatioExtension;
    }

    /**
     * Sets the value of the _ElectricEnergySourceRatioExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_ElectricEnergySourceRatioExtension(_ExtensionType value) {
        this._ElectricEnergySourceRatioExtension = value;
    }

}
