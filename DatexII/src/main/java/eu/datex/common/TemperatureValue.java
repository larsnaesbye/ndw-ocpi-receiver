
package eu.datex.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for TemperatureValue complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="TemperatureValue"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="temperature" type="{http://datex2.eu/schema/3/common}TemperatureCelsius"/&amp;gt;
 *         &amp;lt;element name="_temperatureValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemperatureValue", propOrder = {
    "temperature",
    "_TemperatureValueExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class TemperatureValue
    extends DataValue
{

    protected float temperature;
    @XmlElement(name = "_temperatureValueExtension")
    protected _ExtensionType _TemperatureValueExtension;

    /**
     * Gets the value of the temperature property.
     * 
     */
    public float getTemperature() {
        return temperature;
    }

    /**
     * Sets the value of the temperature property.
     * 
     */
    public void setTemperature(float value) {
        this.temperature = value;
    }

    /**
     * Gets the value of the _TemperatureValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TemperatureValueExtension() {
        return _TemperatureValueExtension;
    }

    /**
     * Sets the value of the _TemperatureValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TemperatureValueExtension(_ExtensionType value) {
        this._TemperatureValueExtension = value;
    }

}
