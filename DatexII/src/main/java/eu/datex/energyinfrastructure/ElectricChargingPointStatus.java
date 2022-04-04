
package eu.datex.energyinfrastructure;

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
 * &lt;p&gt;Java class for ElectricChargingPointStatus complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ElectricChargingPointStatus"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/energyInfrastructure}RefillPointStatus"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="electricEnergyMixOverride" type="{http://datex2.eu/schema/3/energyInfrastructure}ElectricEnergyMix" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_electricChargingPointStatusExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricChargingPointStatus", propOrder = {
    "electricEnergyMixOverrides",
    "_ElectricChargingPointStatusExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ElectricChargingPointStatus
    extends RefillPointStatus
{

    @XmlElement(name = "electricEnergyMixOverride")
    protected List<ElectricEnergyMix> electricEnergyMixOverrides;
    @XmlElement(name = "_electricChargingPointStatusExtension")
    protected _ExtensionType _ElectricChargingPointStatusExtension;

    /**
     * Gets the value of the electricEnergyMixOverrides property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the electricEnergyMixOverrides property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getElectricEnergyMixOverrides().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link ElectricEnergyMix }
     * 
     * 
     */
    public List<ElectricEnergyMix> getElectricEnergyMixOverrides() {
        if (electricEnergyMixOverrides == null) {
            electricEnergyMixOverrides = new ArrayList<ElectricEnergyMix>();
        }
        return this.electricEnergyMixOverrides;
    }

    /**
     * Gets the value of the _ElectricChargingPointStatusExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_ElectricChargingPointStatusExtension() {
        return _ElectricChargingPointStatusExtension;
    }

    /**
     * Sets the value of the _ElectricChargingPointStatusExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_ElectricChargingPointStatusExtension(_ExtensionType value) {
        this._ElectricChargingPointStatusExtension = value;
    }

}
