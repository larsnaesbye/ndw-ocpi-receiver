
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
 * &lt;p&gt;Java class for EnergyInfrastructureStationStatus complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="EnergyInfrastructureStationStatus"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/facilities}FacilityStatus"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="isAvailable" type="{http://datex2.eu/schema/3/common}Boolean"/&amp;gt;
 *         &amp;lt;element name="refillPointStatus" type="{http://datex2.eu/schema/3/energyInfrastructure}RefillPointStatus" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_energyInfrastructureStationStatusExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyInfrastructureStationStatus", propOrder = {
    "isAvailable",
    "refillPointStatuses",
    "_EnergyInfrastructureStationStatusExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class EnergyInfrastructureStationStatus
    extends FacilityStatus
{

    protected boolean isAvailable;
    @XmlElement(name = "refillPointStatus")
    protected List<RefillPointStatus> refillPointStatuses;
    @XmlElement(name = "_energyInfrastructureStationStatusExtension")
    protected _ExtensionType _EnergyInfrastructureStationStatusExtension;

    /**
     * Gets the value of the isAvailable property.
     * 
     */
    public boolean isIsAvailable() {
        return isAvailable;
    }

    /**
     * Sets the value of the isAvailable property.
     * 
     */
    public void setIsAvailable(boolean value) {
        this.isAvailable = value;
    }

    /**
     * Gets the value of the refillPointStatuses property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the refillPointStatuses property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getRefillPointStatuses().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link RefillPointStatus }
     * 
     * 
     */
    public List<RefillPointStatus> getRefillPointStatuses() {
        if (refillPointStatuses == null) {
            refillPointStatuses = new ArrayList<RefillPointStatus>();
        }
        return this.refillPointStatuses;
    }

    /**
     * Gets the value of the _EnergyInfrastructureStationStatusExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_EnergyInfrastructureStationStatusExtension() {
        return _EnergyInfrastructureStationStatusExtension;
    }

    /**
     * Sets the value of the _EnergyInfrastructureStationStatusExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_EnergyInfrastructureStationStatusExtension(_ExtensionType value) {
        this._EnergyInfrastructureStationStatusExtension = value;
    }

}
