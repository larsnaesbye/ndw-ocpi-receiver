
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
 * &lt;p&gt;Java class for EnergyInfrastructureStatusPublication complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="EnergyInfrastructureStatusPublication"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/common}PayloadPublication"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="tableReference" type="{http://datex2.eu/schema/3/energyInfrastructure}_EnergyInfrastructureTableVersionedReference" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element name="energyInfrastructureSiteStatus" type="{http://datex2.eu/schema/3/energyInfrastructure}EnergyInfrastructureSiteStatus" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_energyInfrastructureStatusPublicationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
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
@XmlType(name = "EnergyInfrastructureStatusPublication", propOrder = {
    "tableReferences",
    "energyInfrastructureSiteStatuses",
    "_EnergyInfrastructureStatusPublicationExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class EnergyInfrastructureStatusPublication
    extends PayloadPublication
{

    @XmlElement(name = "tableReference", required = true)
    protected List<_EnergyInfrastructureTableVersionedReference> tableReferences;
    @XmlElement(name = "energyInfrastructureSiteStatus")
    protected List<EnergyInfrastructureSiteStatus> energyInfrastructureSiteStatuses;
    @XmlElement(name = "_energyInfrastructureStatusPublicationExtension")
    protected _ExtensionType _EnergyInfrastructureStatusPublicationExtension;

    /**
     * Gets the value of the tableReferences property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the tableReferences property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getTableReferences().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link _EnergyInfrastructureTableVersionedReference }
     * 
     * 
     */
    public List<_EnergyInfrastructureTableVersionedReference> getTableReferences() {
        if (tableReferences == null) {
            tableReferences = new ArrayList<_EnergyInfrastructureTableVersionedReference>();
        }
        return this.tableReferences;
    }

    /**
     * Gets the value of the energyInfrastructureSiteStatuses property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the energyInfrastructureSiteStatuses property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getEnergyInfrastructureSiteStatuses().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link EnergyInfrastructureSiteStatus }
     * 
     * 
     */
    public List<EnergyInfrastructureSiteStatus> getEnergyInfrastructureSiteStatuses() {
        if (energyInfrastructureSiteStatuses == null) {
            energyInfrastructureSiteStatuses = new ArrayList<EnergyInfrastructureSiteStatus>();
        }
        return this.energyInfrastructureSiteStatuses;
    }

    /**
     * Gets the value of the _EnergyInfrastructureStatusPublicationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_EnergyInfrastructureStatusPublicationExtension() {
        return _EnergyInfrastructureStatusPublicationExtension;
    }

    /**
     * Sets the value of the _EnergyInfrastructureStatusPublicationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_EnergyInfrastructureStatusPublicationExtension(_ExtensionType value) {
        this._EnergyInfrastructureStatusPublicationExtension = value;
    }

}
