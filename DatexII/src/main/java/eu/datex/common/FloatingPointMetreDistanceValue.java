
package eu.datex.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for FloatingPointMetreDistanceValue complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="FloatingPointMetreDistanceValue"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="distance" type="{http://datex2.eu/schema/3/common}MetresAsFloat"/&amp;gt;
 *         &amp;lt;element name="_floatingPointMetreDistanceValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatingPointMetreDistanceValue", propOrder = {
    "distance",
    "_FloatingPointMetreDistanceValueExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class FloatingPointMetreDistanceValue
    extends DataValue
{

    protected float distance;
    @XmlElement(name = "_floatingPointMetreDistanceValueExtension")
    protected _ExtensionType _FloatingPointMetreDistanceValueExtension;

    /**
     * Gets the value of the distance property.
     * 
     */
    public float getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     */
    public void setDistance(float value) {
        this.distance = value;
    }

    /**
     * Gets the value of the _FloatingPointMetreDistanceValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_FloatingPointMetreDistanceValueExtension() {
        return _FloatingPointMetreDistanceValueExtension;
    }

    /**
     * Sets the value of the _FloatingPointMetreDistanceValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_FloatingPointMetreDistanceValueExtension(_ExtensionType value) {
        this._FloatingPointMetreDistanceValueExtension = value;
    }

}
