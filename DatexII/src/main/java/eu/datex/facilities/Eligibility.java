
package eu.datex.facilities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common.MultilingualString;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for Eligibility complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Eligibility"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="eligibilityName" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="description" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="qualification" type="{http://datex2.eu/schema/3/facilities}Qualification" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_eligibilityExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Eligibility", propOrder = {
    "eligibilityName",
    "description",
    "qualifications",
    "_EligibilityExtension"
})
@ToString
@EqualsAndHashCode
public class Eligibility {

    protected MultilingualString eligibilityName;
    protected MultilingualString description;
    @XmlElement(name = "qualification")
    protected List<Qualification> qualifications;
    @XmlElement(name = "_eligibilityExtension")
    protected _ExtensionType _EligibilityExtension;

    /**
     * Gets the value of the eligibilityName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getEligibilityName() {
        return eligibilityName;
    }

    /**
     * Sets the value of the eligibilityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setEligibilityName(MultilingualString value) {
        this.eligibilityName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setDescription(MultilingualString value) {
        this.description = value;
    }

    /**
     * Gets the value of the qualifications property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the qualifications property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getQualifications().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Qualification }
     * 
     * 
     */
    public List<Qualification> getQualifications() {
        if (qualifications == null) {
            qualifications = new ArrayList<Qualification>();
        }
        return this.qualifications;
    }

    /**
     * Gets the value of the _EligibilityExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_EligibilityExtension() {
        return _EligibilityExtension;
    }

    /**
     * Sets the value of the _EligibilityExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_EligibilityExtension(_ExtensionType value) {
        this._EligibilityExtension = value;
    }

}
