
package eu.datex.locationreferencing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for ItineraryByReference complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ItineraryByReference"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/locationReferencing}Itinerary"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="predefinedItineraryReference" type="{http://datex2.eu/schema/3/locationReferencing}_PredefinedItineraryVersionedReference"/&amp;gt;
 *         &amp;lt;element name="_itineraryByReferenceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryByReference", propOrder = {
    "predefinedItineraryReference",
    "_ItineraryByReferenceExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ItineraryByReference
    extends Itinerary
{

    @XmlElement(required = true)
    protected _PredefinedItineraryVersionedReference predefinedItineraryReference;
    @XmlElement(name = "_itineraryByReferenceExtension")
    protected _ExtensionType _ItineraryByReferenceExtension;

    /**
     * Gets the value of the predefinedItineraryReference property.
     * 
     * @return
     *     possible object is
     *     {@link _PredefinedItineraryVersionedReference }
     *     
     */
    public _PredefinedItineraryVersionedReference getPredefinedItineraryReference() {
        return predefinedItineraryReference;
    }

    /**
     * Sets the value of the predefinedItineraryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link _PredefinedItineraryVersionedReference }
     *     
     */
    public void setPredefinedItineraryReference(_PredefinedItineraryVersionedReference value) {
        this.predefinedItineraryReference = value;
    }

    /**
     * Gets the value of the _ItineraryByReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_ItineraryByReferenceExtension() {
        return _ItineraryByReferenceExtension;
    }

    /**
     * Sets the value of the _ItineraryByReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_ItineraryByReferenceExtension(_ExtensionType value) {
        this._ItineraryByReferenceExtension = value;
    }

}
