
package eu.datex.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for PublicHoliday complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PublicHoliday"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/common}SpecialDay"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="publicHolidayName" type="{http://datex2.eu/schema/3/common}MultilingualString"/&amp;gt;
 *         &amp;lt;element name="_publicHolidayExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicHoliday", propOrder = {
    "publicHolidayName",
    "_PublicHolidayExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class PublicHoliday
    extends SpecialDay
{

    @XmlElement(required = true)
    protected MultilingualString publicHolidayName;
    @XmlElement(name = "_publicHolidayExtension")
    protected _ExtensionType _PublicHolidayExtension;

    /**
     * Gets the value of the publicHolidayName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getPublicHolidayName() {
        return publicHolidayName;
    }

    /**
     * Sets the value of the publicHolidayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setPublicHolidayName(MultilingualString value) {
        this.publicHolidayName = value;
    }

    /**
     * Gets the value of the _PublicHolidayExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_PublicHolidayExtension() {
        return _PublicHolidayExtension;
    }

    /**
     * Sets the value of the _PublicHolidayExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_PublicHolidayExtension(_ExtensionType value) {
        this._PublicHolidayExtension = value;
    }

}
