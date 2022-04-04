
package eu.datex.energyinfrastructure;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import eu.datex.facilities.FacilityStatus;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for EnergyInfrastructureSiteStatus complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="EnergyInfrastructureSiteStatus"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/facilities}FacilityStatus"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="energyInfrastructureStationStatus" type="{http://datex2.eu/schema/3/energyInfrastructure}EnergyInfrastructureStationStatus" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_energyInfrastructureSiteStatusExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyInfrastructureSiteStatus", propOrder = {
    "energyInfrastructureStationStatuses",
    "_EnergyInfrastructureSiteStatusExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class EnergyInfrastructureSiteStatus
    extends FacilityStatus
{

    @XmlElement(name = "energyInfrastructureStationStatus")
    protected List<EnergyInfrastructureStationStatus> energyInfrastructureStationStatuses;
    @XmlElement(name = "_energyInfrastructureSiteStatusExtension")
    protected _ExtensionType _EnergyInfrastructureSiteStatusExtension;

    /**
     * Gets the value of the energyInfrastructureStationStatuses property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the energyInfrastructureStationStatuses property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getEnergyInfrastructureStationStatuses().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link EnergyInfrastructureStationStatus }
     * 
     * 
     */
    public List<EnergyInfrastructureStationStatus> getEnergyInfrastructureStationStatuses() {
        if (energyInfrastructureStationStatuses == null) {
            energyInfrastructureStationStatuses = new ArrayList<EnergyInfrastructureStationStatus>();
        }
        return this.energyInfrastructureStationStatuses;
    }

    /**
     * Gets the value of the _EnergyInfrastructureSiteStatusExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_EnergyInfrastructureSiteStatusExtension() {
        return _EnergyInfrastructureSiteStatusExtension;
    }

    /**
     * Sets the value of the _EnergyInfrastructureSiteStatusExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_EnergyInfrastructureSiteStatusExtension(_ExtensionType value) {
        this._EnergyInfrastructureSiteStatusExtension = value;
    }

}
