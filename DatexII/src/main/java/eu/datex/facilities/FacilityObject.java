
package eu.datex.facilities;

import java.time.Instant;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.datex.common.MultilingualString;
import eu.datex.common._ExtensionType;
import eu.datex.locationreferencing.LocationReference;
import io.github.threetenjaxb.core.InstantXmlAdapter;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for FacilityObject complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="FacilityObject"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="name" type="{http://datex2.eu/schema/3/common}MultilingualString"/&amp;gt;
 *         &amp;lt;element name="externalIdentifier" type="{http://datex2.eu/schema/3/common}String"/&amp;gt;
 *         &amp;lt;element name="lastUpdated" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="operatingHours" type="{http://datex2.eu/schema/3/facilities}OperatingHours" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="locationReference" type="{http://datex2.eu/schema/3/locationReferencing}LocationReference" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="owner" type="{http://datex2.eu/schema/3/facilities}Organisation" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="operator" type="{http://datex2.eu/schema/3/facilities}Organisation" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="rates" type="{http://datex2.eu/schema/3/facilities}Rates" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_facilityObjectExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
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
@XmlType(name = "FacilityObject", propOrder = {
    "name",
    "externalIdentifier",
    "lastUpdated",
    "operatingHours",
    "locationReference",
    "owner",
    "operator",
    "rates",
    "_FacilityObjectExtension"
})
@XmlSeeAlso({
    SupplementalFacility.class,
    Facility.class
})
@ToString
@EqualsAndHashCode
public abstract class FacilityObject {

    @XmlElement(required = true)
    protected MultilingualString name;
    @XmlElement(required = true)
    protected String externalIdentifier;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(InstantXmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Instant lastUpdated;
    protected OperatingHours operatingHours;
    protected LocationReference locationReference;
    protected Organisation owner;
    protected Organisation operator;
    protected Rates rates;
    @XmlElement(name = "_facilityObjectExtension")
    protected _ExtensionType _FacilityObjectExtension;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "version", required = true)
    protected String version;

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
     * Gets the value of the externalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalIdentifier() {
        return externalIdentifier;
    }

    /**
     * Sets the value of the externalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalIdentifier(String value) {
        this.externalIdentifier = value;
    }

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
     * Gets the value of the operatingHours property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingHours }
     *     
     */
    public OperatingHours getOperatingHours() {
        return operatingHours;
    }

    /**
     * Sets the value of the operatingHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingHours }
     *     
     */
    public void setOperatingHours(OperatingHours value) {
        this.operatingHours = value;
    }

    /**
     * Gets the value of the locationReference property.
     * 
     * @return
     *     possible object is
     *     {@link LocationReference }
     *     
     */
    public LocationReference getLocationReference() {
        return locationReference;
    }

    /**
     * Sets the value of the locationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationReference }
     *     
     */
    public void setLocationReference(LocationReference value) {
        this.locationReference = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation }
     *     
     */
    public Organisation getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation }
     *     
     */
    public void setOwner(Organisation value) {
        this.owner = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation }
     *     
     */
    public Organisation getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation }
     *     
     */
    public void setOperator(Organisation value) {
        this.operator = value;
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
     * Gets the value of the _FacilityObjectExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_FacilityObjectExtension() {
        return _FacilityObjectExtension;
    }

    /**
     * Sets the value of the _FacilityObjectExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_FacilityObjectExtension(_ExtensionType value) {
        this._FacilityObjectExtension = value;
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
