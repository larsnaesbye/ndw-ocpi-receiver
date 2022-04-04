
package eu.datex.facilities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for BrandsAcceptedCodeList complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="BrandsAcceptedCodeList"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="brandsAcceptedList" type="{http://datex2.eu/schema/3/facilities}_PaymentBrandsEnum"/&amp;gt;
 *         &amp;lt;element name="_brandsAcceptedCodeListExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrandsAcceptedCodeList", propOrder = {
    "brandsAcceptedList",
    "_BrandsAcceptedCodeListExtension"
})
@ToString
@EqualsAndHashCode
public class BrandsAcceptedCodeList {

    @XmlElement(required = true)
    protected _PaymentBrandsEnum brandsAcceptedList;
    @XmlElement(name = "_brandsAcceptedCodeListExtension")
    protected _ExtensionType _BrandsAcceptedCodeListExtension;

    /**
     * Gets the value of the brandsAcceptedList property.
     * 
     * @return
     *     possible object is
     *     {@link _PaymentBrandsEnum }
     *     
     */
    public _PaymentBrandsEnum getBrandsAcceptedList() {
        return brandsAcceptedList;
    }

    /**
     * Sets the value of the brandsAcceptedList property.
     * 
     * @param value
     *     allowed object is
     *     {@link _PaymentBrandsEnum }
     *     
     */
    public void setBrandsAcceptedList(_PaymentBrandsEnum value) {
        this.brandsAcceptedList = value;
    }

    /**
     * Gets the value of the _BrandsAcceptedCodeListExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_BrandsAcceptedCodeListExtension() {
        return _BrandsAcceptedCodeListExtension;
    }

    /**
     * Sets the value of the _BrandsAcceptedCodeListExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_BrandsAcceptedCodeListExtension(_ExtensionType value) {
        this._BrandsAcceptedCodeListExtension = value;
    }

}
