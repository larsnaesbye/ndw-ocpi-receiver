
package eu.datex.facilities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for UnspecifiedRates complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UnspecifiedRates"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/facilities}Rates"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="_unspecifiedRatesExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnspecifiedRates", propOrder = {
    "_UnspecifiedRatesExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class UnspecifiedRates
    extends Rates
{

    @XmlElement(name = "_unspecifiedRatesExtension")
    protected _ExtensionType _UnspecifiedRatesExtension;

    /**
     * Gets the value of the _UnspecifiedRatesExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_UnspecifiedRatesExtension() {
        return _UnspecifiedRatesExtension;
    }

    /**
     * Sets the value of the _UnspecifiedRatesExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_UnspecifiedRatesExtension(_ExtensionType value) {
        this._UnspecifiedRatesExtension = value;
    }

}
