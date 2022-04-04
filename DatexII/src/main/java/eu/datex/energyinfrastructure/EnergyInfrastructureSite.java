
package eu.datex.energyinfrastructure;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common.MultilingualString;
import eu.datex.common._ExtensionType;
import eu.datex.facilities.Facility;
import eu.datex.locationreferencing.Location;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for EnergyInfrastructureSite complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="EnergyInfrastructureSite"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/facilities}Facility"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="brand" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="entrance" type="{http://datex2.eu/schema/3/locationReferencing}Location" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="energyInfrastructureStation" type="{http://datex2.eu/schema/3/energyInfrastructure}EnergyInfrastructureStation" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_energyInfrastructureSiteExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyInfrastructureSite", propOrder = {
    "brand",
    "entrances",
    "energyInfrastructureStations",
    "_EnergyInfrastructureSiteExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class EnergyInfrastructureSite
    extends Facility
{

    protected MultilingualString brand;
    @XmlElement(name = "entrance")
    protected List<Location> entrances;
    @XmlElement(name = "energyInfrastructureStation")
    protected List<EnergyInfrastructureStation> energyInfrastructureStations;
    @XmlElement(name = "_energyInfrastructureSiteExtension")
    protected _ExtensionType _EnergyInfrastructureSiteExtension;

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setBrand(MultilingualString value) {
        this.brand = value;
    }

    /**
     * Gets the value of the entrances property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the entrances property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getEntrances().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Location }
     * 
     * 
     */
    public List<Location> getEntrances() {
        if (entrances == null) {
            entrances = new ArrayList<Location>();
        }
        return this.entrances;
    }

    /**
     * Gets the value of the energyInfrastructureStations property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the energyInfrastructureStations property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getEnergyInfrastructureStations().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link EnergyInfrastructureStation }
     * 
     * 
     */
    public List<EnergyInfrastructureStation> getEnergyInfrastructureStations() {
        if (energyInfrastructureStations == null) {
            energyInfrastructureStations = new ArrayList<EnergyInfrastructureStation>();
        }
        return this.energyInfrastructureStations;
    }

    /**
     * Gets the value of the _EnergyInfrastructureSiteExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_EnergyInfrastructureSiteExtension() {
        return _EnergyInfrastructureSiteExtension;
    }

    /**
     * Sets the value of the _EnergyInfrastructureSiteExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_EnergyInfrastructureSiteExtension(_ExtensionType value) {
        this._EnergyInfrastructureSiteExtension = value;
    }

}
