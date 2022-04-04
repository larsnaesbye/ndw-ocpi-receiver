
package eu.datex.facilities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for SupplementalFacility complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="SupplementalFacility"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/facilities}FacilityObject"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="_supplementalFacilityExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplementalFacility", propOrder = {
    "_SupplementalFacilityExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public abstract class SupplementalFacility
    extends FacilityObject
{

    @XmlElement(name = "_supplementalFacilityExtension")
    protected _ExtensionType _SupplementalFacilityExtension;

    /**
     * Gets the value of the _SupplementalFacilityExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_SupplementalFacilityExtension() {
        return _SupplementalFacilityExtension;
    }

    /**
     * Sets the value of the _SupplementalFacilityExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_SupplementalFacilityExtension(_ExtensionType value) {
        this._SupplementalFacilityExtension = value;
    }

}
