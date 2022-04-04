
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
import javax.xml.datatype.Duration;
import eu.datex.common.MultilingualString;
import eu.datex.common._ExtensionType;
import io.github.threetenjaxb.core.InstantXmlAdapter;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for RateTable complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RateTable"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/facilities}Rates"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="lastUpdated" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="rateTableName" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="activeTimes" type="{http://datex2.eu/schema/3/facilities}Duration" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="availability" type="{http://datex2.eu/schema/3/facilities}_RateAvailabilityTypeEnum" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="rateResponsibleParty" type="{http://datex2.eu/schema/3/facilities}_OrganisationVersionedReference" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="rateSupersedeLink" type="{http://datex2.eu/schema/3/facilities}_RateTableVersionedReference" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="validation" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="rateType" type="{http://datex2.eu/schema/3/facilities}_RateTypeEnum" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="validityStart" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="validityEnd" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="additionalInformation" type="{http://datex2.eu/schema/3/common}Url" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="rateLineCollection" type="{http://datex2.eu/schema/3/facilities}RateLineCollection" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="rateEligibility" type="{http://datex2.eu/schema/3/facilities}RateEligibility" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_rateTableExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
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
@XmlType(name = "RateTable", propOrder = {
    "lastUpdated",
    "rateTableName",
    "activeTimes",
    "availability",
    "rateResponsibleParty",
    "rateSupersedeLink",
    "validation",
    "rateType",
    "validityStart",
    "validityEnd",
    "additionalInformation",
    "rateLineCollections",
    "rateEligibility",
    "_RateTableExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class RateTable
    extends Rates
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(InstantXmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Instant lastUpdated;
    protected MultilingualString rateTableName;
    protected List<Duration> activeTimes;
    protected _RateAvailabilityTypeEnum availability;
    protected _OrganisationVersionedReference rateResponsibleParty;
    protected _RateTableVersionedReference rateSupersedeLink;
    protected Boolean validation;
    protected _RateTypeEnum rateType;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(InstantXmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Instant validityStart;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(InstantXmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Instant validityEnd;
    @XmlSchemaType(name = "anyURI")
    protected String additionalInformation;
    @XmlElement(name = "rateLineCollection")
    protected List<RateLineCollection> rateLineCollections;
    protected RateEligibility rateEligibility;
    @XmlElement(name = "_rateTableExtension")
    protected _ExtensionType _RateTableExtension;
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
     * Gets the value of the rateTableName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getRateTableName() {
        return rateTableName;
    }

    /**
     * Sets the value of the rateTableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setRateTableName(MultilingualString value) {
        this.rateTableName = value;
    }

    /**
     * Gets the value of the activeTimes property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the activeTimes property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getActiveTimes().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Duration }
     * 
     * 
     */
    public List<Duration> getActiveTimes() {
        if (activeTimes == null) {
            activeTimes = new ArrayList<Duration>();
        }
        return this.activeTimes;
    }

    /**
     * Gets the value of the availability property.
     * 
     * @return
     *     possible object is
     *     {@link _RateAvailabilityTypeEnum }
     *     
     */
    public _RateAvailabilityTypeEnum getAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link _RateAvailabilityTypeEnum }
     *     
     */
    public void setAvailability(_RateAvailabilityTypeEnum value) {
        this.availability = value;
    }

    /**
     * Gets the value of the rateResponsibleParty property.
     * 
     * @return
     *     possible object is
     *     {@link _OrganisationVersionedReference }
     *     
     */
    public _OrganisationVersionedReference getRateResponsibleParty() {
        return rateResponsibleParty;
    }

    /**
     * Sets the value of the rateResponsibleParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link _OrganisationVersionedReference }
     *     
     */
    public void setRateResponsibleParty(_OrganisationVersionedReference value) {
        this.rateResponsibleParty = value;
    }

    /**
     * Gets the value of the rateSupersedeLink property.
     * 
     * @return
     *     possible object is
     *     {@link _RateTableVersionedReference }
     *     
     */
    public _RateTableVersionedReference getRateSupersedeLink() {
        return rateSupersedeLink;
    }

    /**
     * Sets the value of the rateSupersedeLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link _RateTableVersionedReference }
     *     
     */
    public void setRateSupersedeLink(_RateTableVersionedReference value) {
        this.rateSupersedeLink = value;
    }

    /**
     * Gets the value of the validation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidation() {
        return validation;
    }

    /**
     * Sets the value of the validation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidation(Boolean value) {
        this.validation = value;
    }

    /**
     * Gets the value of the rateType property.
     * 
     * @return
     *     possible object is
     *     {@link _RateTypeEnum }
     *     
     */
    public _RateTypeEnum getRateType() {
        return rateType;
    }

    /**
     * Sets the value of the rateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _RateTypeEnum }
     *     
     */
    public void setRateType(_RateTypeEnum value) {
        this.rateType = value;
    }

    /**
     * Gets the value of the validityStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Instant getValidityStart() {
        return validityStart;
    }

    /**
     * Sets the value of the validityStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidityStart(Instant value) {
        this.validityStart = value;
    }

    /**
     * Gets the value of the validityEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Instant getValidityEnd() {
        return validityEnd;
    }

    /**
     * Sets the value of the validityEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidityEnd(Instant value) {
        this.validityEnd = value;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Sets the value of the additionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInformation(String value) {
        this.additionalInformation = value;
    }

    /**
     * Gets the value of the rateLineCollections property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the rateLineCollections property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getRateLineCollections().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link RateLineCollection }
     * 
     * 
     */
    public List<RateLineCollection> getRateLineCollections() {
        if (rateLineCollections == null) {
            rateLineCollections = new ArrayList<RateLineCollection>();
        }
        return this.rateLineCollections;
    }

    /**
     * Gets the value of the rateEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link RateEligibility }
     *     
     */
    public RateEligibility getRateEligibility() {
        return rateEligibility;
    }

    /**
     * Sets the value of the rateEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateEligibility }
     *     
     */
    public void setRateEligibility(RateEligibility value) {
        this.rateEligibility = value;
    }

    /**
     * Gets the value of the _RateTableExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_RateTableExtension() {
        return _RateTableExtension;
    }

    /**
     * Sets the value of the _RateTableExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_RateTableExtension(_ExtensionType value) {
        this._RateTableExtension = value;
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
