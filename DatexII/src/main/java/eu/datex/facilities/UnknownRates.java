
package eu.datex.facilities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for UnknownRates complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UnknownRates"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/facilities}Rates"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="_unknownRatesExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnknownRates", propOrder = {
    "_UnknownRatesExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class UnknownRates
    extends Rates
{

    @XmlElement(name = "_unknownRatesExtension")
    protected _ExtensionType _UnknownRatesExtension;

    /**
     * Gets the value of the _UnknownRatesExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_UnknownRatesExtension() {
        return _UnknownRatesExtension;
    }

    /**
     * Sets the value of the _UnknownRatesExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_UnknownRatesExtension(_ExtensionType value) {
        this._UnknownRatesExtension = value;
    }

}
