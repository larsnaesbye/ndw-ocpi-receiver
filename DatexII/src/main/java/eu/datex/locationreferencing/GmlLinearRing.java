
package eu.datex.locationreferencing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for GmlLinearRing complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="GmlLinearRing"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/locationReferencing}GmlLineString"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="_gmlLinearRingExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GmlLinearRing", propOrder = {
    "_GmlLinearRingExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class GmlLinearRing
    extends GmlLineString
{

    @XmlElement(name = "_gmlLinearRingExtension")
    protected _ExtensionType _GmlLinearRingExtension;

    /**
     * Gets the value of the _GmlLinearRingExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_GmlLinearRingExtension() {
        return _GmlLinearRingExtension;
    }

    /**
     * Sets the value of the _GmlLinearRingExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_GmlLinearRingExtension(_ExtensionType value) {
        this._GmlLinearRingExtension = value;
    }

}
