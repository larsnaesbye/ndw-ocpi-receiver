
package eu.datex.locationreferencing;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for Itinerary complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Itinerary"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/locationReferencing}LocationReference"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="routeDestination" type="{http://datex2.eu/schema/3/locationReferencing}Destination" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_itineraryExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Itinerary", propOrder = {
    "routeDestinations",
    "_ItineraryExtension"
})
@XmlSeeAlso({
    ItineraryByIndexedLocations.class,
    ItineraryByReference.class
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public abstract class Itinerary
    extends LocationReference
{

    @XmlElement(name = "routeDestination")
    protected List<Destination> routeDestinations;
    @XmlElement(name = "_itineraryExtension")
    protected _ExtensionType _ItineraryExtension;

    /**
     * Gets the value of the routeDestinations property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the routeDestinations property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getRouteDestinations().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Destination }
     * 
     * 
     */
    public List<Destination> getRouteDestinations() {
        if (routeDestinations == null) {
            routeDestinations = new ArrayList<Destination>();
        }
        return this.routeDestinations;
    }

    /**
     * Gets the value of the _ItineraryExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_ItineraryExtension() {
        return _ItineraryExtension;
    }

    /**
     * Sets the value of the _ItineraryExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_ItineraryExtension(_ExtensionType value) {
        this._ItineraryExtension = value;
    }

}
