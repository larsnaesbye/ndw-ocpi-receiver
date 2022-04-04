
package eu.datex.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for DayWeekMonth complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="DayWeekMonth"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="applicableDay" type="{http://datex2.eu/schema/3/common}_DayEnum" maxOccurs="7" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="applicableMonth" type="{http://datex2.eu/schema/3/common}_MonthOfYearEnum" maxOccurs="12" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_dayWeekMonthExtension" type="{http://datex2.eu/schema/3/common}_DayWeekMonthExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DayWeekMonth", propOrder = {
    "applicableDaies",
    "applicableMonths",
    "_DayWeekMonthExtension"
})
@XmlSeeAlso({
    CalendarWeekWithinMonth.class,
    InstanceOfDayWithinMonth.class
})
@ToString
@EqualsAndHashCode
public class DayWeekMonth {

    @XmlElement(name = "applicableDay")
    protected List<_DayEnum> applicableDaies;
    @XmlElement(name = "applicableMonth")
    protected List<_MonthOfYearEnum> applicableMonths;
    @XmlElement(name = "_dayWeekMonthExtension")
    protected _DayWeekMonthExtensionType _DayWeekMonthExtension;

    /**
     * Gets the value of the applicableDaies property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the applicableDaies property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getApplicableDaies().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link _DayEnum }
     * 
     * 
     */
    public List<_DayEnum> getApplicableDaies() {
        if (applicableDaies == null) {
            applicableDaies = new ArrayList<_DayEnum>();
        }
        return this.applicableDaies;
    }

    /**
     * Gets the value of the applicableMonths property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the applicableMonths property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getApplicableMonths().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link _MonthOfYearEnum }
     * 
     * 
     */
    public List<_MonthOfYearEnum> getApplicableMonths() {
        if (applicableMonths == null) {
            applicableMonths = new ArrayList<_MonthOfYearEnum>();
        }
        return this.applicableMonths;
    }

    /**
     * Gets the value of the _DayWeekMonthExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _DayWeekMonthExtensionType }
     *     
     */
    public _DayWeekMonthExtensionType get_DayWeekMonthExtension() {
        return _DayWeekMonthExtension;
    }

    /**
     * Sets the value of the _DayWeekMonthExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _DayWeekMonthExtensionType }
     *     
     */
    public void set_DayWeekMonthExtension(_DayWeekMonthExtensionType value) {
        this._DayWeekMonthExtension = value;
    }

}
