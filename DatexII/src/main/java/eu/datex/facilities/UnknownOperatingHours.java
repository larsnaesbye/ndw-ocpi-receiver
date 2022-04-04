
package eu.datex.facilities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for UnknownOperatingHours complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UnknownOperatingHours"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/facilities}OperatingHours"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="_unknownOperatingHoursExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnknownOperatingHours", propOrder = {
    "_UnknownOperatingHoursExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class UnknownOperatingHours
    extends OperatingHours
{

    @XmlElement(name = "_unknownOperatingHoursExtension")
    protected _ExtensionType _UnknownOperatingHoursExtension;

    /**
     * Gets the value of the _UnknownOperatingHoursExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_UnknownOperatingHoursExtension() {
        return _UnknownOperatingHoursExtension;
    }

    /**
     * Sets the value of the _UnknownOperatingHoursExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_UnknownOperatingHoursExtension(_ExtensionType value) {
        this._UnknownOperatingHoursExtension = value;
    }

}
