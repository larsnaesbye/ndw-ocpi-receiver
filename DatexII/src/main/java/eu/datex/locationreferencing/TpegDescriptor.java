
package eu.datex.locationreferencing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common.MultilingualString;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for TpegDescriptor complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="TpegDescriptor"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="descriptor" type="{http://datex2.eu/schema/3/common}MultilingualString"/&amp;gt;
 *         &amp;lt;element name="_tpegDescriptorExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegDescriptor", propOrder = {
    "descriptor",
    "_TpegDescriptorExtension"
})
@XmlSeeAlso({
    TpegAreaDescriptor.class
})
@ToString
@EqualsAndHashCode
public abstract class TpegDescriptor {

    @XmlElement(required = true)
    protected MultilingualString descriptor;
    @XmlElement(name = "_tpegDescriptorExtension")
    protected _ExtensionType _TpegDescriptorExtension;

    /**
     * Gets the value of the descriptor property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getDescriptor() {
        return descriptor;
    }

    /**
     * Sets the value of the descriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setDescriptor(MultilingualString value) {
        this.descriptor = value;
    }

    /**
     * Gets the value of the _TpegDescriptorExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TpegDescriptorExtension() {
        return _TpegDescriptorExtension;
    }

    /**
     * Sets the value of the _TpegDescriptorExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TpegDescriptorExtension(_ExtensionType value) {
        this._TpegDescriptorExtension = value;
    }

}
