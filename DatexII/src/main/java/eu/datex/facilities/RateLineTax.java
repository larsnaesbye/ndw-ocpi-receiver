
package eu.datex.facilities;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common.MultilingualString;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for RateLineTax complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RateLineTax"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="taxValue" type="{http://datex2.eu/schema/3/facilities}AmountOfMoney" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="taxRate" type="{http://datex2.eu/schema/3/common}Percentage" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="taxIncluded" type="{http://datex2.eu/schema/3/common}Boolean"/&amp;gt;
 *         &amp;lt;element name="trigger" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="labelForDisplay" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_rateLineTaxExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateLineTax", propOrder = {
    "taxValue",
    "taxRate",
    "taxIncluded",
    "trigger",
    "labelForDisplay",
    "_RateLineTaxExtension"
})
@ToString
@EqualsAndHashCode
public class RateLineTax {

    protected BigDecimal taxValue;
    protected Float taxRate;
    protected boolean taxIncluded;
    protected MultilingualString trigger;
    protected MultilingualString labelForDisplay;
    @XmlElement(name = "_rateLineTaxExtension")
    protected _ExtensionType _RateLineTaxExtension;

    /**
     * Gets the value of the taxValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxValue() {
        return taxValue;
    }

    /**
     * Sets the value of the taxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxValue(BigDecimal value) {
        this.taxValue = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTaxRate(Float value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the taxIncluded property.
     * 
     */
    public boolean isTaxIncluded() {
        return taxIncluded;
    }

    /**
     * Sets the value of the taxIncluded property.
     * 
     */
    public void setTaxIncluded(boolean value) {
        this.taxIncluded = value;
    }

    /**
     * Gets the value of the trigger property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getTrigger() {
        return trigger;
    }

    /**
     * Sets the value of the trigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setTrigger(MultilingualString value) {
        this.trigger = value;
    }

    /**
     * Gets the value of the labelForDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getLabelForDisplay() {
        return labelForDisplay;
    }

    /**
     * Sets the value of the labelForDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setLabelForDisplay(MultilingualString value) {
        this.labelForDisplay = value;
    }

    /**
     * Gets the value of the _RateLineTaxExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_RateLineTaxExtension() {
        return _RateLineTaxExtension;
    }

    /**
     * Sets the value of the _RateLineTaxExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_RateLineTaxExtension(_ExtensionType value) {
        this._RateLineTaxExtension = value;
    }

}
