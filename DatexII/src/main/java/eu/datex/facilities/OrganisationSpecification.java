
package eu.datex.facilities;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.datex.common.MultilingualString;
import eu.datex.common._ExtensionType;
import io.github.threetenjaxb.core.InstantXmlAdapter;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for OrganisationSpecification complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="OrganisationSpecification"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/facilities}Organisation"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="lastUpdated" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="name" type="{http://datex2.eu/schema/3/common}MultilingualString"/&amp;gt;
 *         &amp;lt;element name="externalCode" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="legalName" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="linkToGeneralInformation" type="{http://datex2.eu/schema/3/common}Url" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="nationalOrganisationNumber" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="nationalRegister" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="vatIdentificationNumber" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="organisationUnit" type="{http://datex2.eu/schema/3/facilities}OrganisationUnit" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element name="subOrganisation" type="{http://datex2.eu/schema/3/facilities}Organisation" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_organisationSpecificationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationSpecification", propOrder = {
    "lastUpdated",
    "name",
    "externalCode",
    "legalName",
    "linkToGeneralInformation",
    "nationalOrganisationNumber",
    "nationalRegister",
    "vatIdentificationNumber",
    "organisationUnits",
    "subOrganisations",
    "_OrganisationSpecificationExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class OrganisationSpecification
    extends Organisation
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(InstantXmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Instant lastUpdated;
    @XmlElement(required = true)
    protected MultilingualString name;
    protected String externalCode;
    protected MultilingualString legalName;
    @XmlSchemaType(name = "anyURI")
    protected String linkToGeneralInformation;
    protected String nationalOrganisationNumber;
    protected String nationalRegister;
    protected String vatIdentificationNumber;
    @XmlElement(name = "organisationUnit", required = true)
    protected List<OrganisationUnit> organisationUnits;
    @XmlElement(name = "subOrganisation")
    protected List<Organisation> subOrganisations;
    @XmlElement(name = "_organisationSpecificationExtension")
    protected _ExtensionType _OrganisationSpecificationExtension;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the lastUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Instant getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Sets the value of the lastUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdated(Instant value) {
        this.lastUpdated = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setName(MultilingualString value) {
        this.name = value;
    }

    /**
     * Gets the value of the externalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalCode() {
        return externalCode;
    }

    /**
     * Sets the value of the externalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalCode(String value) {
        this.externalCode = value;
    }

    /**
     * Gets the value of the legalName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getLegalName() {
        return legalName;
    }

    /**
     * Sets the value of the legalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setLegalName(MultilingualString value) {
        this.legalName = value;
    }

    /**
     * Gets the value of the linkToGeneralInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkToGeneralInformation() {
        return linkToGeneralInformation;
    }

    /**
     * Sets the value of the linkToGeneralInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkToGeneralInformation(String value) {
        this.linkToGeneralInformation = value;
    }

    /**
     * Gets the value of the nationalOrganisationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalOrganisationNumber() {
        return nationalOrganisationNumber;
    }

    /**
     * Sets the value of the nationalOrganisationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalOrganisationNumber(String value) {
        this.nationalOrganisationNumber = value;
    }

    /**
     * Gets the value of the nationalRegister property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalRegister() {
        return nationalRegister;
    }

    /**
     * Sets the value of the nationalRegister property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalRegister(String value) {
        this.nationalRegister = value;
    }

    /**
     * Gets the value of the vatIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatIdentificationNumber() {
        return vatIdentificationNumber;
    }

    /**
     * Sets the value of the vatIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatIdentificationNumber(String value) {
        this.vatIdentificationNumber = value;
    }

    /**
     * Gets the value of the organisationUnits property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the organisationUnits property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getOrganisationUnits().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationUnit }
     * 
     * 
     */
    public List<OrganisationUnit> getOrganisationUnits() {
        if (organisationUnits == null) {
            organisationUnits = new ArrayList<OrganisationUnit>();
        }
        return this.organisationUnits;
    }

    /**
     * Gets the value of the subOrganisations property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the subOrganisations property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSubOrganisations().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Organisation }
     * 
     * 
     */
    public List<Organisation> getSubOrganisations() {
        if (subOrganisations == null) {
            subOrganisations = new ArrayList<Organisation>();
        }
        return this.subOrganisations;
    }

    /**
     * Gets the value of the _OrganisationSpecificationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OrganisationSpecificationExtension() {
        return _OrganisationSpecificationExtension;
    }

    /**
     * Sets the value of the _OrganisationSpecificationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OrganisationSpecificationExtension(_ExtensionType value) {
        this._OrganisationSpecificationExtension = value;
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
