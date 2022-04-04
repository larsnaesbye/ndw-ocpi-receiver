
package eu.datex.commonextension;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for DayWeekMonthExtended complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="DayWeekMonthExtended"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="applicableDaysWithinMonth" type="{http://datex2.eu/schema/3/commonExtension}_ApplicableDaysWithinMonthEnum"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DayWeekMonthExtended", propOrder = {
    "applicableDaysWithinMonth"
})
@ToString
@EqualsAndHashCode
public class DayWeekMonthExtended {

    @XmlElement(required = true)
    protected _ApplicableDaysWithinMonthEnum applicableDaysWithinMonth;

    /**
     * Gets the value of the applicableDaysWithinMonth property.
     * 
     * @return
     *     possible object is
     *     {@link _ApplicableDaysWithinMonthEnum }
     *     
     */
    public _ApplicableDaysWithinMonthEnum getApplicableDaysWithinMonth() {
        return applicableDaysWithinMonth;
    }

    /**
     * Sets the value of the applicableDaysWithinMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ApplicableDaysWithinMonthEnum }
     *     
     */
    public void setApplicableDaysWithinMonth(_ApplicableDaysWithinMonthEnum value) {
        this.applicableDaysWithinMonth = value;
    }

}
