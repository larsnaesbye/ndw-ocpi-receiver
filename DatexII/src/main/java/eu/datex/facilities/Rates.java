
package eu.datex.facilities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common.OverallPeriod;
import eu.datex.common._ExtensionType;
import eu.datex.energyinfrastructure.EnergyPricingPolicy;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for Rates complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Rates"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="applicableCurrency" type="{http://datex2.eu/schema/3/facilities}CurrencyCode" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="paymentMethod" type="{http://datex2.eu/schema/3/facilities}PaymentMethod" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="overallPeriod" type="{http://datex2.eu/schema/3/common}OverallPeriod" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="energyPricingPolicy" type="{http://datex2.eu/schema/3/energyInfrastructure}EnergyPricingPolicy" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_ratesExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rates", propOrder = {
    "applicableCurrencies",
    "paymentMethod",
    "overallPeriod",
    "energyPricingPolicy",
    "_RatesExtension"
})
@XmlSeeAlso({
    FreeOfCharge.class,
    GeneralRateInformation.class,
    RatesByReference.class,
    RateTable.class,
    UnknownRates.class,
    UnspecifiedRates.class
})
@ToString
@EqualsAndHashCode
public abstract class Rates {

    @XmlElement(name = "applicableCurrency")
    protected List<String> applicableCurrencies;
    protected PaymentMethod paymentMethod;
    protected OverallPeriod overallPeriod;
    protected EnergyPricingPolicy energyPricingPolicy;
    @XmlElement(name = "_ratesExtension")
    protected _ExtensionType _RatesExtension;

    /**
     * Gets the value of the applicableCurrencies property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the applicableCurrencies property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getApplicableCurrencies().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getApplicableCurrencies() {
        if (applicableCurrencies == null) {
            applicableCurrencies = new ArrayList<String>();
        }
        return this.applicableCurrencies;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethod }
     *     
     */
    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethod }
     *     
     */
    public void setPaymentMethod(PaymentMethod value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the overallPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link OverallPeriod }
     *     
     */
    public OverallPeriod getOverallPeriod() {
        return overallPeriod;
    }

    /**
     * Sets the value of the overallPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverallPeriod }
     *     
     */
    public void setOverallPeriod(OverallPeriod value) {
        this.overallPeriod = value;
    }

    /**
     * Gets the value of the energyPricingPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyPricingPolicy }
     *     
     */
    public EnergyPricingPolicy getEnergyPricingPolicy() {
        return energyPricingPolicy;
    }

    /**
     * Sets the value of the energyPricingPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyPricingPolicy }
     *     
     */
    public void setEnergyPricingPolicy(EnergyPricingPolicy value) {
        this.energyPricingPolicy = value;
    }

    /**
     * Gets the value of the _RatesExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_RatesExtension() {
        return _RatesExtension;
    }

    /**
     * Sets the value of the _RatesExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_RatesExtension(_ExtensionType value) {
        this._RatesExtension = value;
    }

}
