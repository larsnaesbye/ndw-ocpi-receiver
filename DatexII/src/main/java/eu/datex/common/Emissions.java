
package eu.datex.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for Emissions complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Emissions"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="emissionClassificationEuro" type="{http://datex2.eu/schema/3/common}_EmissionClassificationEuroEnum" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="emissionClassificationOther" type="{http://datex2.eu/schema/3/common}String" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="emissionLevel" type="{http://datex2.eu/schema/3/common}_LowEmissionLevelEnum" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_emissionsExtension" type="{http://datex2.eu/schema/3/common}_EmissionsExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Emissions", propOrder = {
    "emissionClassificationEuro",
    "emissionClassificationOthers",
    "emissionLevel",
    "_EmissionsExtension"
})
@ToString
@EqualsAndHashCode
public class Emissions {

    protected _EmissionClassificationEuroEnum emissionClassificationEuro;
    @XmlElement(name = "emissionClassificationOther")
    protected List<String> emissionClassificationOthers;
    protected _LowEmissionLevelEnum emissionLevel;
    @XmlElement(name = "_emissionsExtension")
    protected _EmissionsExtensionType _EmissionsExtension;

    /**
     * Gets the value of the emissionClassificationEuro property.
     * 
     * @return
     *     possible object is
     *     {@link _EmissionClassificationEuroEnum }
     *     
     */
    public _EmissionClassificationEuroEnum getEmissionClassificationEuro() {
        return emissionClassificationEuro;
    }

    /**
     * Sets the value of the emissionClassificationEuro property.
     * 
     * @param value
     *     allowed object is
     *     {@link _EmissionClassificationEuroEnum }
     *     
     */
    public void setEmissionClassificationEuro(_EmissionClassificationEuroEnum value) {
        this.emissionClassificationEuro = value;
    }

    /**
     * Gets the value of the emissionClassificationOthers property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the emissionClassificationOthers property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getEmissionClassificationOthers().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEmissionClassificationOthers() {
        if (emissionClassificationOthers == null) {
            emissionClassificationOthers = new ArrayList<String>();
        }
        return this.emissionClassificationOthers;
    }

    /**
     * Gets the value of the emissionLevel property.
     * 
     * @return
     *     possible object is
     *     {@link _LowEmissionLevelEnum }
     *     
     */
    public _LowEmissionLevelEnum getEmissionLevel() {
        return emissionLevel;
    }

    /**
     * Sets the value of the emissionLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link _LowEmissionLevelEnum }
     *     
     */
    public void setEmissionLevel(_LowEmissionLevelEnum value) {
        this.emissionLevel = value;
    }

    /**
     * Gets the value of the _EmissionsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _EmissionsExtensionType }
     *     
     */
    public _EmissionsExtensionType get_EmissionsExtension() {
        return _EmissionsExtension;
    }

    /**
     * Sets the value of the _EmissionsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _EmissionsExtensionType }
     *     
     */
    public void set_EmissionsExtension(_EmissionsExtensionType value) {
        this._EmissionsExtension = value;
    }

}
