
package eu.datex.locationreferencing;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.locationextension.FacilityLocation;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.w3c.dom.Element;


/**
 * &lt;p&gt;Java class for _LocationReferenceExtensionType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="_LocationReferenceExtensionType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="facilityLocation" type="{http://datex2.eu/schema/3/locationExtension}FacilityLocation" minOccurs="0"/&amp;gt;
 *         &amp;lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_LocationReferenceExtensionType", propOrder = {
    "facilityLocation",
    "anies"
})
@ToString
@EqualsAndHashCode
public class _LocationReferenceExtensionType {

    protected FacilityLocation facilityLocation;
    @XmlAnyElement
    protected List<Element> anies;

    /**
     * Gets the value of the facilityLocation property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityLocation }
     *     
     */
    public FacilityLocation getFacilityLocation() {
        return facilityLocation;
    }

    /**
     * Sets the value of the facilityLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityLocation }
     *     
     */
    public void setFacilityLocation(FacilityLocation value) {
        this.facilityLocation = value;
    }

    /**
     * Gets the value of the anies property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the anies property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAnies().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAnies() {
        if (anies == null) {
            anies = new ArrayList<Element>();
        }
        return this.anies;
    }

}
