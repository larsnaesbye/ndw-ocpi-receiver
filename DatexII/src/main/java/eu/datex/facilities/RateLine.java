
package eu.datex.facilities;

import java.math.BigDecimal;
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
import javax.xml.datatype.XMLGregorianCalendar;
import eu.datex.common.MultilingualString;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.w3._2001.xmlschema.Adapter1;


/**
 * &lt;p&gt;Java class for RateLine complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RateLine"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="rateLineType" type="{http://datex2.eu/schema/3/facilities}_RateLineTypeEnum"/&amp;gt;
 *         &amp;lt;element name="description" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="durationStart" type="{http://datex2.eu/schema/3/common}Time" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="durationEnd" type="{http://datex2.eu/schema/3/common}Time" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="incrementPeriod" type="{http://datex2.eu/schema/3/facilities}Duration" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="value" type="{http://datex2.eu/schema/3/facilities}AmountOfMoney"/&amp;gt;
 *         &amp;lt;element name="minValue" type="{http://datex2.eu/schema/3/facilities}AmountOfMoney" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="maxValue" type="{http://datex2.eu/schema/3/facilities}AmountOfMoney" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="usageCondition" type="{http://datex2.eu/schema/3/facilities}_RateUsageConditionsTypeEnum" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="surcharge" type="{http://datex2.eu/schema/3/facilities}Surcharge" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="rateLineTax" type="{http://datex2.eu/schema/3/facilities}RateLineTax" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_rateLineExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="sequence" use="required" type="{http://datex2.eu/schema/3/common}Integer" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateLine", propOrder = {
    "rateLineType",
    "description",
    "durationStart",
    "durationEnd",
    "incrementPeriod",
    "value",
    "minValue",
    "maxValue",
    "usageCondition",
    "surcharges",
    "rateLineTaxes",
    "_RateLineExtension"
})
@ToString
@EqualsAndHashCode
public class RateLine {

    @XmlElement(required = true)
    protected _RateLineTypeEnum rateLineType;
    protected MultilingualString description;
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar durationStart;
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar durationEnd;
    protected Duration incrementPeriod;
    @XmlElement(required = true)
    protected BigDecimal value;
    protected BigDecimal minValue;
    protected BigDecimal maxValue;
    protected _RateUsageConditionsTypeEnum usageCondition;
    @XmlElement(name = "surcharge")
    protected List<Surcharge> surcharges;
    @XmlElement(name = "rateLineTax")
    protected List<RateLineTax> rateLineTaxes;
    @XmlElement(name = "_rateLineExtension")
    protected _ExtensionType _RateLineExtension;
    @XmlAttribute(name = "sequence", required = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long sequence;

    /**
     * Gets the value of the rateLineType property.
     * 
     * @return
     *     possible object is
     *     {@link _RateLineTypeEnum }
     *     
     */
    public _RateLineTypeEnum getRateLineType() {
        return rateLineType;
    }

    /**
     * Sets the value of the rateLineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _RateLineTypeEnum }
     *     
     */
    public void setRateLineType(_RateLineTypeEnum value) {
        this.rateLineType = value;
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
     * Gets the value of the durationStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDurationStart() {
        return durationStart;
    }

    /**
     * Sets the value of the durationStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDurationStart(XMLGregorianCalendar value) {
        this.durationStart = value;
    }

    /**
     * Gets the value of the durationEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDurationEnd() {
        return durationEnd;
    }

    /**
     * Sets the value of the durationEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDurationEnd(XMLGregorianCalendar value) {
        this.durationEnd = value;
    }

    /**
     * Gets the value of the incrementPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getIncrementPeriod() {
        return incrementPeriod;
    }

    /**
     * Sets the value of the incrementPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setIncrementPeriod(Duration value) {
        this.incrementPeriod = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the minValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinValue() {
        return minValue;
    }

    /**
     * Sets the value of the minValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinValue(BigDecimal value) {
        this.minValue = value;
    }

    /**
     * Gets the value of the maxValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxValue(BigDecimal value) {
        this.maxValue = value;
    }

    /**
     * Gets the value of the usageCondition property.
     * 
     * @return
     *     possible object is
     *     {@link _RateUsageConditionsTypeEnum }
     *     
     */
    public _RateUsageConditionsTypeEnum getUsageCondition() {
        return usageCondition;
    }

    /**
     * Sets the value of the usageCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link _RateUsageConditionsTypeEnum }
     *     
     */
    public void setUsageCondition(_RateUsageConditionsTypeEnum value) {
        this.usageCondition = value;
    }

    /**
     * Gets the value of the surcharges property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the surcharges property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSurcharges().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Surcharge }
     * 
     * 
     */
    public List<Surcharge> getSurcharges() {
        if (surcharges == null) {
            surcharges = new ArrayList<Surcharge>();
        }
        return this.surcharges;
    }

    /**
     * Gets the value of the rateLineTaxes property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the rateLineTaxes property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getRateLineTaxes().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link RateLineTax }
     * 
     * 
     */
    public List<RateLineTax> getRateLineTaxes() {
        if (rateLineTaxes == null) {
            rateLineTaxes = new ArrayList<RateLineTax>();
        }
        return this.rateLineTaxes;
    }

    /**
     * Gets the value of the _RateLineExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_RateLineExtension() {
        return _RateLineExtension;
    }

    /**
     * Sets the value of the _RateLineExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_RateLineExtension(_ExtensionType value) {
        this._RateLineExtension = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequence(Long value) {
        this.sequence = value;
    }

}
