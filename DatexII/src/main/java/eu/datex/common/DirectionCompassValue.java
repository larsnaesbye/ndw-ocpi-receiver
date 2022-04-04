
package eu.datex.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for DirectionCompassValue complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="DirectionCompassValue"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="directionCompass" type="{http://datex2.eu/schema/3/common}_DirectionCompassEnum"/&amp;gt;
 *         &amp;lt;element name="_directionCompassValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectionCompassValue", propOrder = {
    "directionCompass",
    "_DirectionCompassValueExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class DirectionCompassValue
    extends DataValue
{

    @XmlElement(required = true)
    protected _DirectionCompassEnum directionCompass;
    @XmlElement(name = "_directionCompassValueExtension")
    protected _ExtensionType _DirectionCompassValueExtension;

    /**
     * Gets the value of the directionCompass property.
     * 
     * @return
     *     possible object is
     *     {@link _DirectionCompassEnum }
     *     
     */
    public _DirectionCompassEnum getDirectionCompass() {
        return directionCompass;
    }

    /**
     * Sets the value of the directionCompass property.
     * 
     * @param value
     *     allowed object is
     *     {@link _DirectionCompassEnum }
     *     
     */
    public void setDirectionCompass(_DirectionCompassEnum value) {
        this.directionCompass = value;
    }

    /**
     * Gets the value of the _DirectionCompassValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_DirectionCompassValueExtension() {
        return _DirectionCompassValueExtension;
    }

    /**
     * Sets the value of the _DirectionCompassValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_DirectionCompassValueExtension(_ExtensionType value) {
        this._DirectionCompassValueExtension = value;
    }

}
