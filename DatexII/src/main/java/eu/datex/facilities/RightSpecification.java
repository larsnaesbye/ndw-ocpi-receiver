
package eu.datex.facilities;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.datex.common.MultilingualString;
import eu.datex.common.Validity;
import eu.datex.common._ExtensionType;
import io.github.threetenjaxb.core.InstantXmlAdapter;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for RightSpecification complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RightSpecification"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="type" type="{http://datex2.eu/schema/3/facilities}_RightTypeEnum" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="description" type="{http://datex2.eu/schema/3/common}MultilingualString" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="expiry" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="financialReference" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="issuer" type="{http://datex2.eu/schema/3/facilities}_OrganisationVersionedReference" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="noFeeToUse" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="credential" type="{http://datex2.eu/schema/3/facilities}Credential" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="validity" type="{http://datex2.eu/schema/3/common}Validity" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_rightSpecificationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RightSpecification", propOrder = {
    "type",
    "descriptions",
    "expiry",
    "financialReference",
    "issuer",
    "noFeeToUse",
    "credentials",
    "validity",
    "_RightSpecificationExtension"
})
@ToString
@EqualsAndHashCode
public class RightSpecification {

    protected _RightTypeEnum type;
    @XmlElement(name = "description")
    protected List<MultilingualString> descriptions;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(InstantXmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Instant expiry;
    protected String financialReference;
    protected _OrganisationVersionedReference issuer;
    protected Boolean noFeeToUse;
    @XmlElement(name = "credential")
    protected List<Credential> credentials;
    protected Validity validity;
    @XmlElement(name = "_rightSpecificationExtension")
    protected _ExtensionType _RightSpecificationExtension;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link _RightTypeEnum }
     *     
     */
    public _RightTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link _RightTypeEnum }
     *     
     */
    public void setType(_RightTypeEnum value) {
        this.type = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the descriptions property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getDescriptions().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link MultilingualString }
     * 
     * 
     */
    public List<MultilingualString> getDescriptions() {
        if (descriptions == null) {
            descriptions = new ArrayList<MultilingualString>();
        }
        return this.descriptions;
    }

    /**
     * Gets the value of the expiry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Instant getExpiry() {
        return expiry;
    }

    /**
     * Sets the value of the expiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiry(Instant value) {
        this.expiry = value;
    }

    /**
     * Gets the value of the financialReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialReference() {
        return financialReference;
    }

    /**
     * Sets the value of the financialReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialReference(String value) {
        this.financialReference = value;
    }

    /**
     * Gets the value of the issuer property.
     * 
     * @return
     *     possible object is
     *     {@link _OrganisationVersionedReference }
     *     
     */
    public _OrganisationVersionedReference getIssuer() {
        return issuer;
    }

    /**
     * Sets the value of the issuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link _OrganisationVersionedReference }
     *     
     */
    public void setIssuer(_OrganisationVersionedReference value) {
        this.issuer = value;
    }

    /**
     * Gets the value of the noFeeToUse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoFeeToUse() {
        return noFeeToUse;
    }

    /**
     * Sets the value of the noFeeToUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoFeeToUse(Boolean value) {
        this.noFeeToUse = value;
    }

    /**
     * Gets the value of the credentials property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the credentials property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getCredentials().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Credential }
     * 
     * 
     */
    public List<Credential> getCredentials() {
        if (credentials == null) {
            credentials = new ArrayList<Credential>();
        }
        return this.credentials;
    }

    /**
     * Gets the value of the validity property.
     * 
     * @return
     *     possible object is
     *     {@link Validity }
     *     
     */
    public Validity getValidity() {
        return validity;
    }

    /**
     * Sets the value of the validity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Validity }
     *     
     */
    public void setValidity(Validity value) {
        this.validity = value;
    }

    /**
     * Gets the value of the _RightSpecificationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_RightSpecificationExtension() {
        return _RightSpecificationExtension;
    }

    /**
     * Sets the value of the _RightSpecificationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_RightSpecificationExtension(_ExtensionType value) {
        this._RightSpecificationExtension = value;
    }

}
