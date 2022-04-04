
package eu.datex.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for WindSpeedValue complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="WindSpeedValue"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="windSpeed" type="{http://datex2.eu/schema/3/common}MetresPerSecond"/&amp;gt;
 *         &amp;lt;element name="_windSpeedValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WindSpeedValue", propOrder = {
    "windSpeed",
    "_WindSpeedValueExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class WindSpeedValue
    extends DataValue
{

    protected float windSpeed;
    @XmlElement(name = "_windSpeedValueExtension")
    protected _ExtensionType _WindSpeedValueExtension;

    /**
     * Gets the value of the windSpeed property.
     * 
     */
    public float getWindSpeed() {
        return windSpeed;
    }

    /**
     * Sets the value of the windSpeed property.
     * 
     */
    public void setWindSpeed(float value) {
        this.windSpeed = value;
    }

    /**
     * Gets the value of the _WindSpeedValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_WindSpeedValueExtension() {
        return _WindSpeedValueExtension;
    }

    /**
     * Sets the value of the _WindSpeedValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_WindSpeedValueExtension(_ExtensionType value) {
        this._WindSpeedValueExtension = value;
    }

}
