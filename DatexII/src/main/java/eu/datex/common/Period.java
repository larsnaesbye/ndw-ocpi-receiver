
package eu.datex.common;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.github.threetenjaxb.core.InstantXmlAdapter;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for Period complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Period"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="startOfPeriod" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="endOfPeriod" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="periodName" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="recurringTimePeriodOfDay" type="{http://datex2.eu/schema/3/common}TimePeriodOfDay" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="recurringDayWeekMonthPeriod" type="{http://datex2.eu/schema/3/common}DayWeekMonth" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="recurringSpecialDay" type="{http://datex2.eu/schema/3/common}SpecialDay" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_periodExtension" type="{http://datex2.eu/schema/3/common}_PeriodExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Period", propOrder = {
    "startOfPeriod",
    "endOfPeriod",
    "periodName",
    "recurringTimePeriodOfDaies",
    "recurringDayWeekMonthPeriods",
    "recurringSpecialDaies",
    "_PeriodExtension"
})
@ToString
@EqualsAndHashCode
public class Period {

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(InstantXmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Instant startOfPeriod;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(InstantXmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Instant endOfPeriod;
    protected MultilingualString periodName;
    @XmlElement(name = "recurringTimePeriodOfDay")
    protected List<TimePeriodOfDay> recurringTimePeriodOfDaies;
    @XmlElement(name = "recurringDayWeekMonthPeriod")
    protected List<DayWeekMonth> recurringDayWeekMonthPeriods;
    @XmlElement(name = "recurringSpecialDay")
    protected List<SpecialDay> recurringSpecialDaies;
    @XmlElement(name = "_periodExtension")
    protected _PeriodExtensionType _PeriodExtension;

    /**
     * Gets the value of the startOfPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Instant getStartOfPeriod() {
        return startOfPeriod;
    }

    /**
     * Sets the value of the startOfPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartOfPeriod(Instant value) {
        this.startOfPeriod = value;
    }

    /**
     * Gets the value of the endOfPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Instant getEndOfPeriod() {
        return endOfPeriod;
    }

    /**
     * Sets the value of the endOfPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndOfPeriod(Instant value) {
        this.endOfPeriod = value;
    }

    /**
     * Gets the value of the periodName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getPeriodName() {
        return periodName;
    }

    /**
     * Sets the value of the periodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setPeriodName(MultilingualString value) {
        this.periodName = value;
    }

    /**
     * Gets the value of the recurringTimePeriodOfDaies property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the recurringTimePeriodOfDaies property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getRecurringTimePeriodOfDaies().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link TimePeriodOfDay }
     * 
     * 
     */
    public List<TimePeriodOfDay> getRecurringTimePeriodOfDaies() {
        if (recurringTimePeriodOfDaies == null) {
            recurringTimePeriodOfDaies = new ArrayList<TimePeriodOfDay>();
        }
        return this.recurringTimePeriodOfDaies;
    }

    /**
     * Gets the value of the recurringDayWeekMonthPeriods property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the recurringDayWeekMonthPeriods property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getRecurringDayWeekMonthPeriods().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link DayWeekMonth }
     * 
     * 
     */
    public List<DayWeekMonth> getRecurringDayWeekMonthPeriods() {
        if (recurringDayWeekMonthPeriods == null) {
            recurringDayWeekMonthPeriods = new ArrayList<DayWeekMonth>();
        }
        return this.recurringDayWeekMonthPeriods;
    }

    /**
     * Gets the value of the recurringSpecialDaies property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the recurringSpecialDaies property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getRecurringSpecialDaies().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialDay }
     * 
     * 
     */
    public List<SpecialDay> getRecurringSpecialDaies() {
        if (recurringSpecialDaies == null) {
            recurringSpecialDaies = new ArrayList<SpecialDay>();
        }
        return this.recurringSpecialDaies;
    }

    /**
     * Gets the value of the _PeriodExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _PeriodExtensionType }
     *     
     */
    public _PeriodExtensionType get_PeriodExtension() {
        return _PeriodExtension;
    }

    /**
     * Sets the value of the _PeriodExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _PeriodExtensionType }
     *     
     */
    public void set_PeriodExtension(_PeriodExtensionType value) {
        this._PeriodExtension = value;
    }

}
