
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
 * &lt;p&gt;Java class for LocationGroupByList complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="LocationGroupByList"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/locationReferencing}LocationGroup"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="locationContainedInGroup" type="{http://datex2.eu/schema/3/locationReferencing}Location" maxOccurs="unbounded" minOccurs="2"/&amp;gt;
 *         &amp;lt;element name="_locationGroupByListExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationGroupByList", propOrder = {
    "locationContainedInGroups",
    "_LocationGroupByListExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class LocationGroupByList
    extends LocationGroup
{

    @XmlElement(name = "locationContainedInGroup", required = true)
    protected List<Location> locationContainedInGroups;
    @XmlElement(name = "_locationGroupByListExtension")
    protected _ExtensionType _LocationGroupByListExtension;

    /**
     * Gets the value of the locationContainedInGroups property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the locationContainedInGroups property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getLocationContainedInGroups().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Location }
     * 
     * 
     */
    public List<Location> getLocationContainedInGroups() {
        if (locationContainedInGroups == null) {
            locationContainedInGroups = new ArrayList<Location>();
        }
        return this.locationContainedInGroups;
    }

    /**
     * Gets the value of the _LocationGroupByListExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_LocationGroupByListExtension() {
        return _LocationGroupByListExtension;
    }

    /**
     * Sets the value of the _LocationGroupByListExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_LocationGroupByListExtension(_ExtensionType value) {
        this._LocationGroupByListExtension = value;
    }

}
