
package eu.datex.locationreferencing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for AreaLocation complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AreaLocation"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/locationReferencing}Location"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="_areaLocationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AreaLocation", propOrder = {
    "_AreaLocationExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class AreaLocation
    extends Location
{

    @XmlElement(name = "_areaLocationExtension")
    protected _ExtensionType _AreaLocationExtension;

    /**
     * Gets the value of the _AreaLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_AreaLocationExtension() {
        return _AreaLocationExtension;
    }

    /**
     * Sets the value of the _AreaLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_AreaLocationExtension(_ExtensionType value) {
        this._AreaLocationExtension = value;
    }

}
