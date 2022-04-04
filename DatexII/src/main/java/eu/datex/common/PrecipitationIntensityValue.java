
package eu.datex.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for PrecipitationIntensityValue complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PrecipitationIntensityValue"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="millimetresPerHourIntensity" type="{http://datex2.eu/schema/3/common}IntensityMillimetresPerHour"/&amp;gt;
 *         &amp;lt;element name="_precipitationIntensityValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrecipitationIntensityValue", propOrder = {
    "millimetresPerHourIntensity",
    "_PrecipitationIntensityValueExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class PrecipitationIntensityValue
    extends DataValue
{

    protected float millimetresPerHourIntensity;
    @XmlElement(name = "_precipitationIntensityValueExtension")
    protected _ExtensionType _PrecipitationIntensityValueExtension;

    /**
     * Gets the value of the millimetresPerHourIntensity property.
     * 
     */
    public float getMillimetresPerHourIntensity() {
        return millimetresPerHourIntensity;
    }

    /**
     * Sets the value of the millimetresPerHourIntensity property.
     * 
     */
    public void setMillimetresPerHourIntensity(float value) {
        this.millimetresPerHourIntensity = value;
    }

    /**
     * Gets the value of the _PrecipitationIntensityValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_PrecipitationIntensityValueExtension() {
        return _PrecipitationIntensityValueExtension;
    }

    /**
     * Sets the value of the _PrecipitationIntensityValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_PrecipitationIntensityValueExtension(_ExtensionType value) {
        this._PrecipitationIntensityValueExtension = value;
    }

}
