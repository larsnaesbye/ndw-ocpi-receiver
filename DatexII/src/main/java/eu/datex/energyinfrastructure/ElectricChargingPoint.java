
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
 * &lt;p&gt;Java class for ElectricChargingPoint complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ElectricChargingPoint"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/energyInfrastructure}RefillPoint"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="availableVoltage" type="{http://datex2.eu/schema/3/energyInfrastructure}Volt" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="availableChargingPower" type="{http://datex2.eu/schema/3/energyInfrastructure}Watt" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element name="connector" type="{http://datex2.eu/schema/3/energyInfrastructure}Connector" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="electricEnergyMix" type="{http://datex2.eu/schema/3/energyInfrastructure}ElectricEnergyMix" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_electricChargingPointExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricChargingPoint", propOrder = {
    "availableVoltages",
    "availableChargingPowers",
    "connectors",
    "electricEnergyMixes",
    "_ElectricChargingPointExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ElectricChargingPoint
    extends RefillPoint
{

    @XmlElement(name = "availableVoltage", type = Float.class)
    protected List<Float> availableVoltages;
    @XmlElement(name = "availableChargingPower", type = Float.class)
    protected List<Float> availableChargingPowers;
    @XmlElement(name = "connector")
    protected List<Connector> connectors;
    @XmlElement(name = "electricEnergyMix")
    protected List<ElectricEnergyMix> electricEnergyMixes;
    @XmlElement(name = "_electricChargingPointExtension")
    protected _ExtensionType _ElectricChargingPointExtension;

    /**
     * Gets the value of the availableVoltages property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the availableVoltages property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAvailableVoltages().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Float }
     * 
     * 
     */
    public List<Float> getAvailableVoltages() {
        if (availableVoltages == null) {
            availableVoltages = new ArrayList<Float>();
        }
        return this.availableVoltages;
    }

    /**
     * Gets the value of the availableChargingPowers property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the availableChargingPowers property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAvailableChargingPowers().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Float }
     * 
     * 
     */
    public List<Float> getAvailableChargingPowers() {
        if (availableChargingPowers == null) {
            availableChargingPowers = new ArrayList<Float>();
        }
        return this.availableChargingPowers;
    }

    /**
     * Gets the value of the connectors property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the connectors property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getConnectors().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Connector }
     * 
     * 
     */
    public List<Connector> getConnectors() {
        if (connectors == null) {
            connectors = new ArrayList<Connector>();
        }
        return this.connectors;
    }

    /**
     * Gets the value of the electricEnergyMixes property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the electricEnergyMixes property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getElectricEnergyMixes().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link ElectricEnergyMix }
     * 
     * 
     */
    public List<ElectricEnergyMix> getElectricEnergyMixes() {
        if (electricEnergyMixes == null) {
            electricEnergyMixes = new ArrayList<ElectricEnergyMix>();
        }
        return this.electricEnergyMixes;
    }

    /**
     * Gets the value of the _ElectricChargingPointExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_ElectricChargingPointExtension() {
        return _ElectricChargingPointExtension;
    }

    /**
     * Sets the value of the _ElectricChargingPointExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_ElectricChargingPointExtension(_ExtensionType value) {
        this._ElectricChargingPointExtension = value;
    }

}
