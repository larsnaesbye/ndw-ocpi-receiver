
package eu.datex.energyinfrastructure;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for EnergyInfrastructureTable complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="EnergyInfrastructureTable"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="energyInfrastructureSite" type="{http://datex2.eu/schema/3/energyInfrastructure}EnergyInfrastructureSite" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element name="_energyInfrastructureTableExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyInfrastructureTable", propOrder = {
    "energyInfrastructureSites",
    "_EnergyInfrastructureTableExtension"
})
@ToString
@EqualsAndHashCode
public class EnergyInfrastructureTable {

    @XmlElement(name = "energyInfrastructureSite", required = true)
    protected List<EnergyInfrastructureSite> energyInfrastructureSites;
    @XmlElement(name = "_energyInfrastructureTableExtension")
    protected _ExtensionType _EnergyInfrastructureTableExtension;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the energyInfrastructureSites property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the energyInfrastructureSites property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getEnergyInfrastructureSites().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link EnergyInfrastructureSite }
     * 
     * 
     */
    public List<EnergyInfrastructureSite> getEnergyInfrastructureSites() {
        if (energyInfrastructureSites == null) {
            energyInfrastructureSites = new ArrayList<EnergyInfrastructureSite>();
        }
        return this.energyInfrastructureSites;
    }

    /**
     * Gets the value of the _EnergyInfrastructureTableExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_EnergyInfrastructureTableExtension() {
        return _EnergyInfrastructureTableExtension;
    }

    /**
     * Sets the value of the _EnergyInfrastructureTableExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_EnergyInfrastructureTableExtension(_ExtensionType value) {
        this._EnergyInfrastructureTableExtension = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
