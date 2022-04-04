
package eu.datex.facilities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.w3._2001.xmlschema.Adapter1;


/**
 * &lt;p&gt;Java class for RateEligibility complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RateEligibility"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="priority" type="{http://datex2.eu/schema/3/common}Integer" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="combinable" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="rateDiscount" type="{http://datex2.eu/schema/3/facilities}RateDiscount" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="eligibility" type="{http://datex2.eu/schema/3/facilities}Eligibility"/&amp;gt;
 *         &amp;lt;element name="rightSpecification" type="{http://datex2.eu/schema/3/facilities}RightSpecification" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_rateEligibilityExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateEligibility", propOrder = {
    "priority",
    "combinable",
    "rateDiscount",
    "eligibility",
    "rightSpecifications",
    "_RateEligibilityExtension"
})
@ToString
@EqualsAndHashCode
public class RateEligibility {

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long priority;
    protected Boolean combinable;
    protected RateDiscount rateDiscount;
    @XmlElement(required = true)
    protected Eligibility eligibility;
    @XmlElement(name = "rightSpecification")
    protected List<RightSpecification> rightSpecifications;
    @XmlElement(name = "_rateEligibilityExtension")
    protected _ExtensionType _RateEligibilityExtension;

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(Long value) {
        this.priority = value;
    }

    /**
     * Gets the value of the combinable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCombinable() {
        return combinable;
    }

    /**
     * Sets the value of the combinable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCombinable(Boolean value) {
        this.combinable = value;
    }

    /**
     * Gets the value of the rateDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link RateDiscount }
     *     
     */
    public RateDiscount getRateDiscount() {
        return rateDiscount;
    }

    /**
     * Sets the value of the rateDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateDiscount }
     *     
     */
    public void setRateDiscount(RateDiscount value) {
        this.rateDiscount = value;
    }

    /**
     * Gets the value of the eligibility property.
     * 
     * @return
     *     possible object is
     *     {@link Eligibility }
     *     
     */
    public Eligibility getEligibility() {
        return eligibility;
    }

    /**
     * Sets the value of the eligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Eligibility }
     *     
     */
    public void setEligibility(Eligibility value) {
        this.eligibility = value;
    }

    /**
     * Gets the value of the rightSpecifications property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the rightSpecifications property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getRightSpecifications().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link RightSpecification }
     * 
     * 
     */
    public List<RightSpecification> getRightSpecifications() {
        if (rightSpecifications == null) {
            rightSpecifications = new ArrayList<RightSpecification>();
        }
        return this.rightSpecifications;
    }

    /**
     * Gets the value of the _RateEligibilityExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_RateEligibilityExtension() {
        return _RateEligibilityExtension;
    }

    /**
     * Sets the value of the _RateEligibilityExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_RateEligibilityExtension(_ExtensionType value) {
        this._RateEligibilityExtension = value;
    }

}
