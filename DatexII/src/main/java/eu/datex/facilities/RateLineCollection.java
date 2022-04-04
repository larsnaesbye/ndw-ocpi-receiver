
package eu.datex.facilities;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import eu.datex.common._ExtensionType;
import io.github.threetenjaxb.core.InstantXmlAdapter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.w3._2001.xmlschema.Adapter1;


/**
 * &lt;p&gt;Java class for RateLineCollection complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RateLineCollection"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="applicableCurrency" type="{http://datex2.eu/schema/3/facilities}CurrencyCode" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="minValueCollection" type="{http://datex2.eu/schema/3/facilities}AmountOfMoney" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="maxValueCollection" type="{http://datex2.eu/schema/3/facilities}AmountOfMoney" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="validStart" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="validEnd" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="minTime" type="{http://datex2.eu/schema/3/facilities}Duration" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="maxTime" type="{http://datex2.eu/schema/3/facilities}Duration" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="resetTime" type="{http://datex2.eu/schema/3/common}Time" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="taxIncluded" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="taxRate" type="{http://datex2.eu/schema/3/common}Percentage" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="taxValue" type="{http://datex2.eu/schema/3/facilities}AmountOfMoney" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="relativeTimes" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="rateLine" type="{http://datex2.eu/schema/3/facilities}RateLine" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element name="_rateLineCollectionExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="collectionSequence" use="required" type="{http://datex2.eu/schema/3/common}Integer" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateLineCollection", propOrder = {
    "applicableCurrency",
    "minValueCollection",
    "maxValueCollection",
    "validStart",
    "validEnd",
    "minTime",
    "maxTime",
    "resetTime",
    "taxIncluded",
    "taxRate",
    "taxValue",
    "relativeTimes",
    "rateLines",
    "_RateLineCollectionExtension"
})
@XmlSeeAlso({
    RelativeTimeRates.class
})
@ToString
@EqualsAndHashCode
public class RateLineCollection {

    protected String applicableCurrency;
    protected BigDecimal minValueCollection;
    protected BigDecimal maxValueCollection;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(InstantXmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Instant validStart;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(InstantXmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Instant validEnd;
    protected Duration minTime;
    protected Duration maxTime;
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar resetTime;
    protected Boolean taxIncluded;
    protected Float taxRate;
    protected BigDecimal taxValue;
    protected Boolean relativeTimes;
    @XmlElement(name = "rateLine", required = true)
    protected List<RateLine> rateLines;
    @XmlElement(name = "_rateLineCollectionExtension")
    protected _ExtensionType _RateLineCollectionExtension;
    @XmlAttribute(name = "collectionSequence", required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long collectionSequence;

    /**
     * Gets the value of the applicableCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicableCurrency() {
        return applicableCurrency;
    }

    /**
     * Sets the value of the applicableCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicableCurrency(String value) {
        this.applicableCurrency = value;
    }

    /**
     * Gets the value of the minValueCollection property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinValueCollection() {
        return minValueCollection;
    }

    /**
     * Sets the value of the minValueCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinValueCollection(BigDecimal value) {
        this.minValueCollection = value;
    }

    /**
     * Gets the value of the maxValueCollection property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxValueCollection() {
        return maxValueCollection;
    }

    /**
     * Sets the value of the maxValueCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxValueCollection(BigDecimal value) {
        this.maxValueCollection = value;
    }

    /**
     * Gets the value of the validStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Instant getValidStart() {
        return validStart;
    }

    /**
     * Sets the value of the validStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidStart(Instant value) {
        this.validStart = value;
    }

    /**
     * Gets the value of the validEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Instant getValidEnd() {
        return validEnd;
    }

    /**
     * Sets the value of the validEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidEnd(Instant value) {
        this.validEnd = value;
    }

    /**
     * Gets the value of the minTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinTime() {
        return minTime;
    }

    /**
     * Sets the value of the minTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinTime(Duration value) {
        this.minTime = value;
    }

    /**
     * Gets the value of the maxTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaxTime() {
        return maxTime;
    }

    /**
     * Sets the value of the maxTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaxTime(Duration value) {
        this.maxTime = value;
    }

    /**
     * Gets the value of the resetTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResetTime() {
        return resetTime;
    }

    /**
     * Sets the value of the resetTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResetTime(XMLGregorianCalendar value) {
        this.resetTime = value;
    }

    /**
     * Gets the value of the taxIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxIncluded() {
        return taxIncluded;
    }

    /**
     * Sets the value of the taxIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxIncluded(Boolean value) {
        this.taxIncluded = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTaxRate(Float value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the taxValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxValue() {
        return taxValue;
    }

    /**
     * Sets the value of the taxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxValue(BigDecimal value) {
        this.taxValue = value;
    }

    /**
     * Gets the value of the relativeTimes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRelativeTimes() {
        return relativeTimes;
    }

    /**
     * Sets the value of the relativeTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRelativeTimes(Boolean value) {
        this.relativeTimes = value;
    }

    /**
     * Gets the value of the rateLines property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the rateLines property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getRateLines().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link RateLine }
     * 
     * 
     */
    public List<RateLine> getRateLines() {
        if (rateLines == null) {
            rateLines = new ArrayList<RateLine>();
        }
        return this.rateLines;
    }

    /**
     * Gets the value of the _RateLineCollectionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_RateLineCollectionExtension() {
        return _RateLineCollectionExtension;
    }

    /**
     * Sets the value of the _RateLineCollectionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_RateLineCollectionExtension(_ExtensionType value) {
        this._RateLineCollectionExtension = value;
    }

    /**
     * Gets the value of the collectionSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getCollectionSequence() {
        return collectionSequence;
    }

    /**
     * Sets the value of the collectionSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionSequence(Long value) {
        this.collectionSequence = value;
    }

}
