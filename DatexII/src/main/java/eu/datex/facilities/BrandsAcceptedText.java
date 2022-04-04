
package eu.datex.facilities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for BrandsAcceptedText complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="BrandsAcceptedText"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="brandsAccepted" type="{http://datex2.eu/schema/3/common}String"/&amp;gt;
 *         &amp;lt;element name="_brandsAcceptedTextExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrandsAcceptedText", propOrder = {
    "brandsAccepted",
    "_BrandsAcceptedTextExtension"
})
@ToString
@EqualsAndHashCode
public class BrandsAcceptedText {

    @XmlElement(required = true)
    protected String brandsAccepted;
    @XmlElement(name = "_brandsAcceptedTextExtension")
    protected _ExtensionType _BrandsAcceptedTextExtension;

    /**
     * Gets the value of the brandsAccepted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandsAccepted() {
        return brandsAccepted;
    }

    /**
     * Sets the value of the brandsAccepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandsAccepted(String value) {
        this.brandsAccepted = value;
    }

    /**
     * Gets the value of the _BrandsAcceptedTextExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_BrandsAcceptedTextExtension() {
        return _BrandsAcceptedTextExtension;
    }

    /**
     * Sets the value of the _BrandsAcceptedTextExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_BrandsAcceptedTextExtension(_ExtensionType value) {
        this._BrandsAcceptedTextExtension = value;
    }

}
