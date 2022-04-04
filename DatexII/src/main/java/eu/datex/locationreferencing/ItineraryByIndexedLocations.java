
package eu.datex.locationreferencing;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for ItineraryByIndexedLocations complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ItineraryByIndexedLocations"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/locationReferencing}Itinerary"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="locationContainedInItinerary" type="{http://datex2.eu/schema/3/locationReferencing}_LocationContainedInItinerary" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_itineraryByIndexedLocationsExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryByIndexedLocations", propOrder = {
    "locationContainedInItineraries",
    "_ItineraryByIndexedLocationsExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ItineraryByIndexedLocations
    extends Itinerary
{

    @XmlElement(name = "locationContainedInItinerary")
    protected List<_LocationContainedInItinerary> locationContainedInItineraries;
    @XmlElement(name = "_itineraryByIndexedLocationsExtension")
    protected _ExtensionType _ItineraryByIndexedLocationsExtension;

    /**
     * Gets the value of the locationContainedInItineraries property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the locationContainedInItineraries property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getLocationContainedInItineraries().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link _LocationContainedInItinerary }
     * 
     * 
     */
    public List<_LocationContainedInItinerary> getLocationContainedInItineraries() {
        if (locationContainedInItineraries == null) {
            locationContainedInItineraries = new ArrayList<_LocationContainedInItinerary>();
        }
        return this.locationContainedInItineraries;
    }

    /**
     * Gets the value of the _ItineraryByIndexedLocationsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_ItineraryByIndexedLocationsExtension() {
        return _ItineraryByIndexedLocationsExtension;
    }

    /**
     * Sets the value of the _ItineraryByIndexedLocationsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_ItineraryByIndexedLocationsExtension(_ExtensionType value) {
        this._ItineraryByIndexedLocationsExtension = value;
    }

}
