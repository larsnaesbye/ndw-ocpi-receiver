
package eu.datex.facilities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for RateDiscount complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RateDiscount"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="discountRate" type="{http://datex2.eu/schema/3/common}Percentage" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="fixedValue" type="{http://datex2.eu/schema/3/facilities}AmountInCurrency" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_rateDiscountExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateDiscount", propOrder = {
    "discountRate",
    "fixedValue",
    "_RateDiscountExtension"
})
@ToString
@EqualsAndHashCode
public class RateDiscount {

    protected Float discountRate;
    protected AmountInCurrency fixedValue;
    @XmlElement(name = "_rateDiscountExtension")
    protected _ExtensionType _RateDiscountExtension;

    /**
     * Gets the value of the discountRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDiscountRate() {
        return discountRate;
    }

    /**
     * Sets the value of the discountRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDiscountRate(Float value) {
        this.discountRate = value;
    }

    /**
     * Gets the value of the fixedValue property.
     * 
     * @return
     *     possible object is
     *     {@link AmountInCurrency }
     *     
     */
    public AmountInCurrency getFixedValue() {
        return fixedValue;
    }

    /**
     * Sets the value of the fixedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountInCurrency }
     *     
     */
    public void setFixedValue(AmountInCurrency value) {
        this.fixedValue = value;
    }

    /**
     * Gets the value of the _RateDiscountExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_RateDiscountExtension() {
        return _RateDiscountExtension;
    }

    /**
     * Sets the value of the _RateDiscountExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_RateDiscountExtension(_ExtensionType value) {
        this._RateDiscountExtension = value;
    }

}
