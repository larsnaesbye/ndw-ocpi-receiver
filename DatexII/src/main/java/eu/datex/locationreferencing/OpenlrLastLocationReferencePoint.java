
package eu.datex.locationreferencing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for OpenlrLastLocationReferencePoint complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="OpenlrLastLocationReferencePoint"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/locationReferencing}OpenlrBaseReferencePoint"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="_openlrLastLocationReferencePointExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrLastLocationReferencePoint", propOrder = {
    "_OpenlrLastLocationReferencePointExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class OpenlrLastLocationReferencePoint
    extends OpenlrBaseReferencePoint
{

    @XmlElement(name = "_openlrLastLocationReferencePointExtension")
    protected _ExtensionType _OpenlrLastLocationReferencePointExtension;

    /**
     * Gets the value of the _OpenlrLastLocationReferencePointExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OpenlrLastLocationReferencePointExtension() {
        return _OpenlrLastLocationReferencePointExtension;
    }

    /**
     * Sets the value of the _OpenlrLastLocationReferencePointExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OpenlrLastLocationReferencePointExtension(_ExtensionType value) {
        this._OpenlrLastLocationReferencePointExtension = value;
    }

}
