
package eu.datex.energyinfrastructure;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common.PayloadPublication;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for EnergyInfrastructureTablePublication complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="EnergyInfrastructureTablePublication"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/common}PayloadPublication"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="energyInfrastructureTable" type="{http://datex2.eu/schema/3/energyInfrastructure}EnergyInfrastructureTable" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element name="_energyInfrastructureTablePublicationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyInfrastructureTablePublication", propOrder = {
    "energyInfrastructureTables",
    "_EnergyInfrastructureTablePublicationExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class EnergyInfrastructureTablePublication
    extends PayloadPublication
{

    @XmlElement(name = "energyInfrastructureTable", required = true)
    protected List<EnergyInfrastructureTable> energyInfrastructureTables;
    @XmlElement(name = "_energyInfrastructureTablePublicationExtension")
    protected _ExtensionType _EnergyInfrastructureTablePublicationExtension;

    /**
     * Gets the value of the energyInfrastructureTables property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the energyInfrastructureTables property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getEnergyInfrastructureTables().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link EnergyInfrastructureTable }
     * 
     * 
     */
    public List<EnergyInfrastructureTable> getEnergyInfrastructureTables() {
        if (energyInfrastructureTables == null) {
            energyInfrastructureTables = new ArrayList<EnergyInfrastructureTable>();
        }
        return this.energyInfrastructureTables;
    }

    /**
     * Gets the value of the _EnergyInfrastructureTablePublicationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_EnergyInfrastructureTablePublicationExtension() {
        return _EnergyInfrastructureTablePublicationExtension;
    }

    /**
     * Sets the value of the _EnergyInfrastructureTablePublicationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_EnergyInfrastructureTablePublicationExtension(_ExtensionType value) {
        this._EnergyInfrastructureTablePublicationExtension = value;
    }

}
