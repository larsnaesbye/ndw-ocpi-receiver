
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
 * &lt;p&gt;Java class for Surcharge complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Surcharge"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="surchargeType" type="{http://datex2.eu/schema/3/facilities}_SurchargeTypeEnum"/&amp;gt;
 *         &amp;lt;element name="value" type="{http://datex2.eu/schema/3/facilities}AmountOfMoney" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="rate" type="{http://datex2.eu/schema/3/common}Percentage" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="trigger" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="refund" type="{http://datex2.eu/schema/3/facilities}_RefundTypeEnum" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="labelForDisplay" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_surchargeExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Surcharge", propOrder = {
    "surchargeType",
    "value",
    "rate",
    "trigger",
    "refund",
    "labelForDisplay",
    "_SurchargeExtension"
})
@ToString
@EqualsAndHashCode
public class Surcharge {

    @XmlElement(required = true)
    protected _SurchargeTypeEnum surchargeType;
    protected BigDecimal value;
    protected Float rate;
    protected MultilingualString trigger;
    protected _RefundTypeEnum refund;
    protected MultilingualString labelForDisplay;
    @XmlElement(name = "_surchargeExtension")
    protected _ExtensionType _SurchargeExtension;

    /**
     * Gets the value of the surchargeType property.
     * 
     * @return
     *     possible object is
     *     {@link _SurchargeTypeEnum }
     *     
     */
    public _SurchargeTypeEnum getSurchargeType() {
        return surchargeType;
    }

    /**
     * Sets the value of the surchargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _SurchargeTypeEnum }
     *     
     */
    public void setSurchargeType(_SurchargeTypeEnum value) {
        this.surchargeType = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRate(Float value) {
        this.rate = value;
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
     * Gets the value of the refund property.
     * 
     * @return
     *     possible object is
     *     {@link _RefundTypeEnum }
     *     
     */
    public _RefundTypeEnum getRefund() {
        return refund;
    }

    /**
     * Sets the value of the refund property.
     * 
     * @param value
     *     allowed object is
     *     {@link _RefundTypeEnum }
     *     
     */
    public void setRefund(_RefundTypeEnum value) {
        this.refund = value;
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
     * Gets the value of the _SurchargeExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_SurchargeExtension() {
        return _SurchargeExtension;
    }

    /**
     * Sets the value of the _SurchargeExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_SurchargeExtension(_ExtensionType value) {
        this._SurchargeExtension = value;
    }

}
