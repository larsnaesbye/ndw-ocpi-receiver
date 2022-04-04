
package eu.datex.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for TimePeriodOfDay complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="TimePeriodOfDay"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="startTimeOfPeriod" type="{http://datex2.eu/schema/3/common}Time"/&amp;gt;
 *         &amp;lt;element name="endTimeOfPeriod" type="{http://datex2.eu/schema/3/common}Time"/&amp;gt;
 *         &amp;lt;element name="_timePeriodOfDayExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimePeriodOfDay", propOrder = {
    "startTimeOfPeriod",
    "endTimeOfPeriod",
    "_TimePeriodOfDayExtension"
})
@ToString
@EqualsAndHashCode
public class TimePeriodOfDay {

    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar startTimeOfPeriod;
    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar endTimeOfPeriod;
    @XmlElement(name = "_timePeriodOfDayExtension")
    protected _ExtensionType _TimePeriodOfDayExtension;

    /**
     * Gets the value of the startTimeOfPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTimeOfPeriod() {
        return startTimeOfPeriod;
    }

    /**
     * Sets the value of the startTimeOfPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTimeOfPeriod(XMLGregorianCalendar value) {
        this.startTimeOfPeriod = value;
    }

    /**
     * Gets the value of the endTimeOfPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTimeOfPeriod() {
        return endTimeOfPeriod;
    }

    /**
     * Sets the value of the endTimeOfPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTimeOfPeriod(XMLGregorianCalendar value) {
        this.endTimeOfPeriod = value;
    }

    /**
     * Gets the value of the _TimePeriodOfDayExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TimePeriodOfDayExtension() {
        return _TimePeriodOfDayExtension;
    }

    /**
     * Sets the value of the _TimePeriodOfDayExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TimePeriodOfDayExtension(_ExtensionType value) {
        this._TimePeriodOfDayExtension = value;
    }

}
