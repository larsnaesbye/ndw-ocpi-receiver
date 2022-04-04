
package eu.datex.facilities;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for AmountInCurrency complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AmountInCurrency"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="currencyValue" type="{http://datex2.eu/schema/3/facilities}AmountOfMoney"/&amp;gt;
 *         &amp;lt;element name="currencyType" type="{http://datex2.eu/schema/3/facilities}CurrencyCode"/&amp;gt;
 *         &amp;lt;element name="_amountInCurrencyExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountInCurrency", propOrder = {
    "currencyValue",
    "currencyType",
    "_AmountInCurrencyExtension"
})
@ToString
@EqualsAndHashCode
public class AmountInCurrency {

    @XmlElement(required = true)
    protected BigDecimal currencyValue;
    @XmlElement(required = true)
    protected String currencyType;
    @XmlElement(name = "_amountInCurrencyExtension")
    protected _ExtensionType _AmountInCurrencyExtension;

    /**
     * Gets the value of the currencyValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrencyValue() {
        return currencyValue;
    }

    /**
     * Sets the value of the currencyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrencyValue(BigDecimal value) {
        this.currencyValue = value;
    }

    /**
     * Gets the value of the currencyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyType() {
        return currencyType;
    }

    /**
     * Sets the value of the currencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyType(String value) {
        this.currencyType = value;
    }

    /**
     * Gets the value of the _AmountInCurrencyExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_AmountInCurrencyExtension() {
        return _AmountInCurrencyExtension;
    }

    /**
     * Sets the value of the _AmountInCurrencyExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_AmountInCurrencyExtension(_ExtensionType value) {
        this._AmountInCurrencyExtension = value;
    }

}
