
package eu.datex.locationreferencing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for LocationReference complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="LocationReference"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="_locationReferenceExtension" type="{http://datex2.eu/schema/3/locationReferencing}_LocationReferenceExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationReference", propOrder = {
    "_LocationReferenceExtension"
})
@XmlSeeAlso({
    Itinerary.class,
    LocationGroup.class,
    Location.class
})
@ToString
@EqualsAndHashCode
public abstract class LocationReference {

    @XmlElement(name = "_locationReferenceExtension")
    protected _LocationReferenceExtensionType _LocationReferenceExtension;

    /**
     * Gets the value of the _LocationReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _LocationReferenceExtensionType }
     *     
     */
    public _LocationReferenceExtensionType get_LocationReferenceExtension() {
        return _LocationReferenceExtension;
    }

    /**
     * Sets the value of the _LocationReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _LocationReferenceExtensionType }
     *     
     */
    public void set_LocationReferenceExtension(_LocationReferenceExtensionType value) {
        this._LocationReferenceExtension = value;
    }

}
