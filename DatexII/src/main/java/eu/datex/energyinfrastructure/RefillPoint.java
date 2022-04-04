
package eu.datex.energyinfrastructure;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import eu.datex.facilities.Facility;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for RefillPoint complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RefillPoint"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/facilities}Facility"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="_refillPointExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefillPoint", propOrder = {
    "_RefillPointExtension"
})
@XmlSeeAlso({
    ElectricChargingPoint.class
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public abstract class RefillPoint
    extends Facility
{

    @XmlElement(name = "_refillPointExtension")
    protected _ExtensionType _RefillPointExtension;

    /**
     * Gets the value of the _RefillPointExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_RefillPointExtension() {
        return _RefillPointExtension;
    }

    /**
     * Sets the value of the _RefillPointExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_RefillPointExtension(_ExtensionType value) {
        this._RefillPointExtension = value;
    }

}
