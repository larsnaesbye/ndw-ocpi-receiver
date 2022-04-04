
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
 * &lt;p&gt;Java class for SpecialDay complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SpecialDay"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="intersectWithApplicableDays" type="{http://datex2.eu/schema/3/common}Boolean"/&amp;gt;
 *         &amp;lt;element name="specialDayType" type="{http://datex2.eu/schema/3/common}_SpecialDayTypeEnum"/&amp;gt;
 *         &amp;lt;element name="publicEvent" type="{http://datex2.eu/schema/3/common}_PublicEventTypeEnum" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="namedArea" type="{http://datex2.eu/schema/3/common}NamedArea" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_specialDayExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialDay", propOrder = {
    "intersectWithApplicableDays",
    "specialDayType",
    "publicEvent",
    "namedAreas",
    "_SpecialDayExtension"
})
@XmlSeeAlso({
    PublicHoliday.class
})
@ToString
@EqualsAndHashCode
public class SpecialDay {

    protected boolean intersectWithApplicableDays;
    @XmlElement(required = true)
    protected _SpecialDayTypeEnum specialDayType;
    protected _PublicEventTypeEnum publicEvent;
    @XmlElement(name = "namedArea")
    protected List<NamedArea> namedAreas;
    @XmlElement(name = "_specialDayExtension")
    protected _ExtensionType _SpecialDayExtension;

    /**
     * Gets the value of the intersectWithApplicableDays property.
     * 
     */
    public boolean isIntersectWithApplicableDays() {
        return intersectWithApplicableDays;
    }

    /**
     * Sets the value of the intersectWithApplicableDays property.
     * 
     */
    public void setIntersectWithApplicableDays(boolean value) {
        this.intersectWithApplicableDays = value;
    }

    /**
     * Gets the value of the specialDayType property.
     * 
     * @return
     *     possible object is
     *     {@link _SpecialDayTypeEnum }
     *     
     */
    public _SpecialDayTypeEnum getSpecialDayType() {
        return specialDayType;
    }

    /**
     * Sets the value of the specialDayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _SpecialDayTypeEnum }
     *     
     */
    public void setSpecialDayType(_SpecialDayTypeEnum value) {
        this.specialDayType = value;
    }

    /**
     * Gets the value of the publicEvent property.
     * 
     * @return
     *     possible object is
     *     {@link _PublicEventTypeEnum }
     *     
     */
    public _PublicEventTypeEnum getPublicEvent() {
        return publicEvent;
    }

    /**
     * Sets the value of the publicEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link _PublicEventTypeEnum }
     *     
     */
    public void setPublicEvent(_PublicEventTypeEnum value) {
        this.publicEvent = value;
    }

    /**
     * Gets the value of the namedAreas property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the namedAreas property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getNamedAreas().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link NamedArea }
     * 
     * 
     */
    public List<NamedArea> getNamedAreas() {
        if (namedAreas == null) {
            namedAreas = new ArrayList<NamedArea>();
        }
        return this.namedAreas;
    }

    /**
     * Gets the value of the _SpecialDayExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_SpecialDayExtension() {
        return _SpecialDayExtension;
    }

    /**
     * Sets the value of the _SpecialDayExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_SpecialDayExtension(_ExtensionType value) {
        this._SpecialDayExtension = value;
    }

}
