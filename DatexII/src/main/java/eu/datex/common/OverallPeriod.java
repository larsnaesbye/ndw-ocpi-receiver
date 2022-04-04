
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
 * &lt;p&gt;Java class for OverallPeriod complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="OverallPeriod"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="overallStartTime" type="{http://datex2.eu/schema/3/common}DateTime"/&amp;gt;
 *         &amp;lt;element name="overallEndTime" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="validPeriod" type="{http://datex2.eu/schema/3/common}Period" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="exceptionPeriod" type="{http://datex2.eu/schema/3/common}Period" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_overallPeriodExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverallPeriod", propOrder = {
    "overallStartTime",
    "overallEndTime",
    "validPeriods",
    "exceptionPeriods",
    "_OverallPeriodExtension"
})
@ToString
@EqualsAndHashCode
public class OverallPeriod {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(InstantXmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Instant overallStartTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(InstantXmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Instant overallEndTime;
    @XmlElement(name = "validPeriod")
    protected List<Period> validPeriods;
    @XmlElement(name = "exceptionPeriod")
    protected List<Period> exceptionPeriods;
    @XmlElement(name = "_overallPeriodExtension")
    protected _ExtensionType _OverallPeriodExtension;

    /**
     * Gets the value of the overallStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Instant getOverallStartTime() {
        return overallStartTime;
    }

    /**
     * Sets the value of the overallStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverallStartTime(Instant value) {
        this.overallStartTime = value;
    }

    /**
     * Gets the value of the overallEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Instant getOverallEndTime() {
        return overallEndTime;
    }

    /**
     * Sets the value of the overallEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverallEndTime(Instant value) {
        this.overallEndTime = value;
    }

    /**
     * Gets the value of the validPeriods property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the validPeriods property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getValidPeriods().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Period }
     * 
     * 
     */
    public List<Period> getValidPeriods() {
        if (validPeriods == null) {
            validPeriods = new ArrayList<Period>();
        }
        return this.validPeriods;
    }

    /**
     * Gets the value of the exceptionPeriods property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the exceptionPeriods property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getExceptionPeriods().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Period }
     * 
     * 
     */
    public List<Period> getExceptionPeriods() {
        if (exceptionPeriods == null) {
            exceptionPeriods = new ArrayList<Period>();
        }
        return this.exceptionPeriods;
    }

    /**
     * Gets the value of the _OverallPeriodExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OverallPeriodExtension() {
        return _OverallPeriodExtension;
    }

    /**
     * Sets the value of the _OverallPeriodExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OverallPeriodExtension(_ExtensionType value) {
        this._OverallPeriodExtension = value;
    }

}
