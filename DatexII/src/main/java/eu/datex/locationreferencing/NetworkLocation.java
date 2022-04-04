
package eu.datex.locationreferencing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for NetworkLocation complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="NetworkLocation"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/locationReferencing}Location"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="_networkLocationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkLocation", propOrder = {
    "_NetworkLocationExtension"
})
@XmlSeeAlso({
    PointLocation.class
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public abstract class NetworkLocation
    extends Location
{

    @XmlElement(name = "_networkLocationExtension")
    protected _ExtensionType _NetworkLocationExtension;

    /**
     * Gets the value of the _NetworkLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_NetworkLocationExtension() {
        return _NetworkLocationExtension;
    }

    /**
     * Sets the value of the _NetworkLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_NetworkLocationExtension(_ExtensionType value) {
        this._NetworkLocationExtension = value;
    }

}
