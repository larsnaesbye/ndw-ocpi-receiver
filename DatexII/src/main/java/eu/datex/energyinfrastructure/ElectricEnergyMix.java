
package eu.datex.energyinfrastructure;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.datex.common.MultilingualString;
import eu.datex.common._ExtensionType;
import eu.datex.facilities.Organisation;
import eu.datex.facilities.Rates;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.w3._2001.xmlschema.Adapter1;


/**
 * &lt;p&gt;Java class for ElectricEnergyMix complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ElectricEnergyMix"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="energyProductName" type="{http://datex2.eu/schema/3/common}MultilingualString"/&amp;gt;
 *         &amp;lt;element name="isGreenEnergy" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="electricEnergySourceRatio" type="{http://datex2.eu/schema/3/energyInfrastructure}ElectricEnergySourceRatio" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element name="energyProvider" type="{http://datex2.eu/schema/3/facilities}Organisation" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="rates" type="{http://datex2.eu/schema/3/facilities}Rates" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_electricEnergyMixExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="energyMixIndex" use="required" type="{http://datex2.eu/schema/3/common}Integer" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricEnergyMix", propOrder = {
    "energyProductName",
    "isGreenEnergy",
    "electricEnergySourceRatios",
    "energyProvider",
    "rates",
    "_ElectricEnergyMixExtension"
})
@ToString
@EqualsAndHashCode
public class ElectricEnergyMix {

    @XmlElement(required = true)
    protected MultilingualString energyProductName;
    protected Boolean isGreenEnergy;
    @XmlElement(name = "electricEnergySourceRatio", required = true)
    protected List<ElectricEnergySourceRatio> electricEnergySourceRatios;
    protected Organisation energyProvider;
    protected Rates rates;
    @XmlElement(name = "_electricEnergyMixExtension")
    protected _ExtensionType _ElectricEnergyMixExtension;
    @XmlAttribute(name = "energyMixIndex", required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long energyMixIndex;

    /**
     * Gets the value of the energyProductName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getEnergyProductName() {
        return energyProductName;
    }

    /**
     * Sets the value of the energyProductName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setEnergyProductName(MultilingualString value) {
        this.energyProductName = value;
    }

    /**
     * Gets the value of the isGreenEnergy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGreenEnergy() {
        return isGreenEnergy;
    }

    /**
     * Sets the value of the isGreenEnergy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGreenEnergy(Boolean value) {
        this.isGreenEnergy = value;
    }

    /**
     * Gets the value of the electricEnergySourceRatios property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the electricEnergySourceRatios property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getElectricEnergySourceRatios().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link ElectricEnergySourceRatio }
     * 
     * 
     */
    public List<ElectricEnergySourceRatio> getElectricEnergySourceRatios() {
        if (electricEnergySourceRatios == null) {
            electricEnergySourceRatios = new ArrayList<ElectricEnergySourceRatio>();
        }
        return this.electricEnergySourceRatios;
    }

    /**
     * Gets the value of the energyProvider property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation }
     *     
     */
    public Organisation getEnergyProvider() {
        return energyProvider;
    }

    /**
     * Sets the value of the energyProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation }
     *     
     */
    public void setEnergyProvider(Organisation value) {
        this.energyProvider = value;
    }

    /**
     * Gets the value of the rates property.
     * 
     * @return
     *     possible object is
     *     {@link Rates }
     *     
     */
    public Rates getRates() {
        return rates;
    }

    /**
     * Sets the value of the rates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rates }
     *     
     */
    public void setRates(Rates value) {
        this.rates = value;
    }

    /**
     * Gets the value of the _ElectricEnergyMixExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_ElectricEnergyMixExtension() {
        return _ElectricEnergyMixExtension;
    }

    /**
     * Sets the value of the _ElectricEnergyMixExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_ElectricEnergyMixExtension(_ExtensionType value) {
        this._ElectricEnergyMixExtension = value;
    }

    /**
     * Gets the value of the energyMixIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getEnergyMixIndex() {
        return energyMixIndex;
    }

    /**
     * Sets the value of the energyMixIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnergyMixIndex(Long value) {
        this.energyMixIndex = value;
    }

}
