
package eu.datex.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for SpeedValue complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SpeedValue"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="speed" type="{http://datex2.eu/schema/3/common}KilometresPerHour"/&amp;gt;
 *         &amp;lt;element name="_speedValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpeedValue", propOrder = {
    "speed",
    "_SpeedValueExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class SpeedValue
    extends DataValue
{

    protected float speed;
    @XmlElement(name = "_speedValueExtension")
    protected _ExtensionType _SpeedValueExtension;

    /**
     * Gets the value of the speed property.
     * 
     */
    public float getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     */
    public void setSpeed(float value) {
        this.speed = value;
    }

    /**
     * Gets the value of the _SpeedValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_SpeedValueExtension() {
        return _SpeedValueExtension;
    }

    /**
     * Sets the value of the _SpeedValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_SpeedValueExtension(_ExtensionType value) {
        this._SpeedValueExtension = value;
    }

}
