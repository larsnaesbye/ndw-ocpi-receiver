
package eu.datex.locationreferencing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for TpegAreaDescriptor complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="TpegAreaDescriptor"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/locationReferencing}TpegDescriptor"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="tpegAreaDescriptorType" type="{http://datex2.eu/schema/3/locationReferencing}_TpegLoc03AreaDescriptorSubtypeEnum"/&amp;gt;
 *         &amp;lt;element name="_tpegAreaDescriptorExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegAreaDescriptor", propOrder = {
    "tpegAreaDescriptorType",
    "_TpegAreaDescriptorExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class TpegAreaDescriptor
    extends TpegDescriptor
{

    @XmlElement(required = true)
    protected _TpegLoc03AreaDescriptorSubtypeEnum tpegAreaDescriptorType;
    @XmlElement(name = "_tpegAreaDescriptorExtension")
    protected _ExtensionType _TpegAreaDescriptorExtension;

    /**
     * Gets the value of the tpegAreaDescriptorType property.
     * 
     * @return
     *     possible object is
     *     {@link _TpegLoc03AreaDescriptorSubtypeEnum }
     *     
     */
    public _TpegLoc03AreaDescriptorSubtypeEnum getTpegAreaDescriptorType() {
        return tpegAreaDescriptorType;
    }

    /**
     * Sets the value of the tpegAreaDescriptorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _TpegLoc03AreaDescriptorSubtypeEnum }
     *     
     */
    public void setTpegAreaDescriptorType(_TpegLoc03AreaDescriptorSubtypeEnum value) {
        this.tpegAreaDescriptorType = value;
    }

    /**
     * Gets the value of the _TpegAreaDescriptorExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TpegAreaDescriptorExtension() {
        return _TpegAreaDescriptorExtension;
    }

    /**
     * Sets the value of the _TpegAreaDescriptorExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TpegAreaDescriptorExtension(_ExtensionType value) {
        this._TpegAreaDescriptorExtension = value;
    }

}
