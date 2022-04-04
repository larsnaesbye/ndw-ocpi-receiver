
package eu.datex.facilities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for FreeOfCharge complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="FreeOfCharge"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/facilities}Rates"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="_freeOfChargeExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreeOfCharge", propOrder = {
    "_FreeOfChargeExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class FreeOfCharge
    extends Rates
{

    @XmlElement(name = "_freeOfChargeExtension")
    protected _ExtensionType _FreeOfChargeExtension;

    /**
     * Gets the value of the _FreeOfChargeExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_FreeOfChargeExtension() {
        return _FreeOfChargeExtension;
    }

    /**
     * Sets the value of the _FreeOfChargeExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_FreeOfChargeExtension(_ExtensionType value) {
        this._FreeOfChargeExtension = value;
    }

}
