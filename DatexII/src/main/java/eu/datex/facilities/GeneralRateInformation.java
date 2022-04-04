
package eu.datex.facilities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for GeneralRateInformation complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="GeneralRateInformation"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/facilities}Rates"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="_generalRateInformationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralRateInformation", propOrder = {
    "_GeneralRateInformationExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class GeneralRateInformation
    extends Rates
{

    @XmlElement(name = "_generalRateInformationExtension")
    protected _ExtensionType _GeneralRateInformationExtension;

    /**
     * Gets the value of the _GeneralRateInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_GeneralRateInformationExtension() {
        return _GeneralRateInformationExtension;
    }

    /**
     * Sets the value of the _GeneralRateInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_GeneralRateInformationExtension(_ExtensionType value) {
        this._GeneralRateInformationExtension = value;
    }

}
