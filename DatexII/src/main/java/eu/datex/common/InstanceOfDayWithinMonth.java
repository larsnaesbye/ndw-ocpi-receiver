
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
 * &lt;p&gt;Java class for InstanceOfDayWithinMonth complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="InstanceOfDayWithinMonth"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/common}DayWeekMonth"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="applicableInstanceOfDayWithinMonth" type="{http://datex2.eu/schema/3/common}_InstanceOfDayEnum" maxOccurs="5"/&amp;gt;
 *         &amp;lt;element name="_instanceOfDayWithinMonthExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstanceOfDayWithinMonth", propOrder = {
    "applicableInstanceOfDayWithinMonths",
    "_InstanceOfDayWithinMonthExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class InstanceOfDayWithinMonth
    extends DayWeekMonth
{

    @XmlElement(name = "applicableInstanceOfDayWithinMonth", required = true)
    protected List<_InstanceOfDayEnum> applicableInstanceOfDayWithinMonths;
    @XmlElement(name = "_instanceOfDayWithinMonthExtension")
    protected _ExtensionType _InstanceOfDayWithinMonthExtension;

    /**
     * Gets the value of the applicableInstanceOfDayWithinMonths property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the applicableInstanceOfDayWithinMonths property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getApplicableInstanceOfDayWithinMonths().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link _InstanceOfDayEnum }
     * 
     * 
     */
    public List<_InstanceOfDayEnum> getApplicableInstanceOfDayWithinMonths() {
        if (applicableInstanceOfDayWithinMonths == null) {
            applicableInstanceOfDayWithinMonths = new ArrayList<_InstanceOfDayEnum>();
        }
        return this.applicableInstanceOfDayWithinMonths;
    }

    /**
     * Gets the value of the _InstanceOfDayWithinMonthExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_InstanceOfDayWithinMonthExtension() {
        return _InstanceOfDayWithinMonthExtension;
    }

    /**
     * Sets the value of the _InstanceOfDayWithinMonthExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_InstanceOfDayWithinMonthExtension(_ExtensionType value) {
        this._InstanceOfDayWithinMonthExtension = value;
    }

}
