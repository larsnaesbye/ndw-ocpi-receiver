
package eu.datex.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for CalendarWeekWithinMonth complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CalendarWeekWithinMonth"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/common}DayWeekMonth"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="applicableCalenderWeekWithinMonth" type="{http://datex2.eu/schema/3/common}_CalendarWeekWithinMonthEnum" maxOccurs="6"/&amp;gt;
 *         &amp;lt;element name="_calendarWeekWithinMonthExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarWeekWithinMonth", propOrder = {
    "applicableCalenderWeekWithinMonths",
    "_CalendarWeekWithinMonthExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class CalendarWeekWithinMonth
    extends DayWeekMonth
{

    @XmlElement(name = "applicableCalenderWeekWithinMonth", required = true)
    protected List<_CalendarWeekWithinMonthEnum> applicableCalenderWeekWithinMonths;
    @XmlElement(name = "_calendarWeekWithinMonthExtension")
    protected _ExtensionType _CalendarWeekWithinMonthExtension;

    /**
     * Gets the value of the applicableCalenderWeekWithinMonths property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the applicableCalenderWeekWithinMonths property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getApplicableCalenderWeekWithinMonths().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link _CalendarWeekWithinMonthEnum }
     * 
     * 
     */
    public List<_CalendarWeekWithinMonthEnum> getApplicableCalenderWeekWithinMonths() {
        if (applicableCalenderWeekWithinMonths == null) {
            applicableCalenderWeekWithinMonths = new ArrayList<_CalendarWeekWithinMonthEnum>();
        }
        return this.applicableCalenderWeekWithinMonths;
    }

    /**
     * Gets the value of the _CalendarWeekWithinMonthExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_CalendarWeekWithinMonthExtension() {
        return _CalendarWeekWithinMonthExtension;
    }

    /**
     * Sets the value of the _CalendarWeekWithinMonthExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_CalendarWeekWithinMonthExtension(_ExtensionType value) {
        this._CalendarWeekWithinMonthExtension = value;
    }

}
