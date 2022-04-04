
package eu.datex.facilities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for UndefinedOperatingHours complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UndefinedOperatingHours"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/facilities}OperatingHours"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="_undefinedOperatingHoursExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndefinedOperatingHours", propOrder = {
    "_UndefinedOperatingHoursExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class UndefinedOperatingHours
    extends OperatingHours
{

    @XmlElement(name = "_undefinedOperatingHoursExtension")
    protected _ExtensionType _UndefinedOperatingHoursExtension;

    /**
     * Gets the value of the _UndefinedOperatingHoursExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_UndefinedOperatingHoursExtension() {
        return _UndefinedOperatingHoursExtension;
    }

    /**
     * Sets the value of the _UndefinedOperatingHoursExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_UndefinedOperatingHoursExtension(_ExtensionType value) {
        this._UndefinedOperatingHoursExtension = value;
    }

}
