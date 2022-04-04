
package eu.datex.facilities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import eu.datex.energyinfrastructure.EnergyInfrastructureSite;
import eu.datex.energyinfrastructure.EnergyInfrastructureStation;
import eu.datex.energyinfrastructure.RefillPoint;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for Facility complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Facility"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/facilities}FacilityObject"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="supplementalFacility" type="{http://datex2.eu/schema/3/facilities}SupplementalFacility" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_facilityExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Facility", propOrder = {
    "supplementalFacilities",
    "_FacilityExtension"
})
@XmlSeeAlso({
    EnergyInfrastructureSite.class,
    EnergyInfrastructureStation.class,
    RefillPoint.class
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public abstract class Facility
    extends FacilityObject
{

    @XmlElement(name = "supplementalFacility")
    protected List<SupplementalFacility> supplementalFacilities;
    @XmlElement(name = "_facilityExtension")
    protected _ExtensionType _FacilityExtension;

    /**
     * Gets the value of the supplementalFacilities property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the supplementalFacilities property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSupplementalFacilities().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementalFacility }
     * 
     * 
     */
    public List<SupplementalFacility> getSupplementalFacilities() {
        if (supplementalFacilities == null) {
            supplementalFacilities = new ArrayList<SupplementalFacility>();
        }
        return this.supplementalFacilities;
    }

    /**
     * Gets the value of the _FacilityExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_FacilityExtension() {
        return _FacilityExtension;
    }

    /**
     * Sets the value of the _FacilityExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_FacilityExtension(_ExtensionType value) {
        this._FacilityExtension = value;
    }

}
