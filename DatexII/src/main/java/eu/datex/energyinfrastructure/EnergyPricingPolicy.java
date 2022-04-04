
package eu.datex.energyinfrastructure;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for EnergyPricingPolicy complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="EnergyPricingPolicy"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="pricingPolicy" type="{http://datex2.eu/schema/3/energyInfrastructure}_PricingPolicyEnum" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="minimumDeliveryFee" type="{http://datex2.eu/schema/3/facilities}AmountOfMoney"/&amp;gt;
 *         &amp;lt;element name="_energyPricingPolicyExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyPricingPolicy", propOrder = {
    "pricingPolicies",
    "minimumDeliveryFee",
    "_EnergyPricingPolicyExtension"
})
@ToString
@EqualsAndHashCode
public class EnergyPricingPolicy {

    @XmlElement(name = "pricingPolicy")
    protected List<_PricingPolicyEnum> pricingPolicies;
    @XmlElement(required = true)
    protected BigDecimal minimumDeliveryFee;
    @XmlElement(name = "_energyPricingPolicyExtension")
    protected _ExtensionType _EnergyPricingPolicyExtension;

    /**
     * Gets the value of the pricingPolicies property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the pricingPolicies property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getPricingPolicies().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link _PricingPolicyEnum }
     * 
     * 
     */
    public List<_PricingPolicyEnum> getPricingPolicies() {
        if (pricingPolicies == null) {
            pricingPolicies = new ArrayList<_PricingPolicyEnum>();
        }
        return this.pricingPolicies;
    }

    /**
     * Gets the value of the minimumDeliveryFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumDeliveryFee() {
        return minimumDeliveryFee;
    }

    /**
     * Sets the value of the minimumDeliveryFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumDeliveryFee(BigDecimal value) {
        this.minimumDeliveryFee = value;
    }

    /**
     * Gets the value of the _EnergyPricingPolicyExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_EnergyPricingPolicyExtension() {
        return _EnergyPricingPolicyExtension;
    }

    /**
     * Sets the value of the _EnergyPricingPolicyExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_EnergyPricingPolicyExtension(_ExtensionType value) {
        this._EnergyPricingPolicyExtension = value;
    }

}
