
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
 * &lt;p&gt;Java class for Location complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Location"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/locationReferencing}LocationReference"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="_locationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location", propOrder = {
    "_LocationExtension"
})
@XmlSeeAlso({
    AreaLocation.class,
    NetworkLocation.class
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public abstract class Location
    extends LocationReference
{

    @XmlElement(name = "_locationExtension")
    protected _ExtensionType _LocationExtension;

    /**
     * Gets the value of the _LocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_LocationExtension() {
        return _LocationExtension;
    }

    /**
     * Sets the value of the _LocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_LocationExtension(_ExtensionType value) {
        this._LocationExtension = value;
    }

}
