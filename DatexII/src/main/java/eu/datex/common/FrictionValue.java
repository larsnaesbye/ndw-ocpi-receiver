
package eu.datex.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for FrictionValue complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="FrictionValue"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="friction" type="{http://datex2.eu/schema/3/common}Float"/&amp;gt;
 *         &amp;lt;element name="_frictionValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrictionValue", propOrder = {
    "friction",
    "_FrictionValueExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class FrictionValue
    extends DataValue
{

    protected float friction;
    @XmlElement(name = "_frictionValueExtension")
    protected _ExtensionType _FrictionValueExtension;

    /**
     * Gets the value of the friction property.
     * 
     */
    public float getFriction() {
        return friction;
    }

    /**
     * Sets the value of the friction property.
     * 
     */
    public void setFriction(float value) {
        this.friction = value;
    }

    /**
     * Gets the value of the _FrictionValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_FrictionValueExtension() {
        return _FrictionValueExtension;
    }

    /**
     * Sets the value of the _FrictionValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_FrictionValueExtension(_ExtensionType value) {
        this._FrictionValueExtension = value;
    }

}
