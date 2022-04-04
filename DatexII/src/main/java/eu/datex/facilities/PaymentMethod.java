
package eu.datex.facilities;

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
 * &lt;p&gt;Java class for PaymentMethod complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PaymentMethod"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="paymentMeans" type="{http://datex2.eu/schema/3/facilities}_MeansOfPaymentEnum" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="paymentMode" type="{http://datex2.eu/schema/3/facilities}_PaymentTimingEnum" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="brandsAcceptedText" type="{http://datex2.eu/schema/3/facilities}BrandsAcceptedText" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="brandsAcceptedCodeList" type="{http://datex2.eu/schema/3/facilities}BrandsAcceptedCodeList" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_paymentMethodExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentMethod", propOrder = {
    "paymentMeans",
    "paymentModes",
    "brandsAcceptedTexts",
    "brandsAcceptedCodeLists",
    "_PaymentMethodExtension"
})
@ToString
@EqualsAndHashCode
public class PaymentMethod {

    protected List<_MeansOfPaymentEnum> paymentMeans;
    @XmlElement(name = "paymentMode")
    protected List<_PaymentTimingEnum> paymentModes;
    @XmlElement(name = "brandsAcceptedText")
    protected List<BrandsAcceptedText> brandsAcceptedTexts;
    @XmlElement(name = "brandsAcceptedCodeList")
    protected List<BrandsAcceptedCodeList> brandsAcceptedCodeLists;
    @XmlElement(name = "_paymentMethodExtension")
    protected _ExtensionType _PaymentMethodExtension;

    /**
     * Gets the value of the paymentMeans property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the paymentMeans property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getPaymentMeans().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link _MeansOfPaymentEnum }
     * 
     * 
     */
    public List<_MeansOfPaymentEnum> getPaymentMeans() {
        if (paymentMeans == null) {
            paymentMeans = new ArrayList<_MeansOfPaymentEnum>();
        }
        return this.paymentMeans;
    }

    /**
     * Gets the value of the paymentModes property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the paymentModes property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getPaymentModes().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link _PaymentTimingEnum }
     * 
     * 
     */
    public List<_PaymentTimingEnum> getPaymentModes() {
        if (paymentModes == null) {
            paymentModes = new ArrayList<_PaymentTimingEnum>();
        }
        return this.paymentModes;
    }

    /**
     * Gets the value of the brandsAcceptedTexts property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the brandsAcceptedTexts property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getBrandsAcceptedTexts().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link BrandsAcceptedText }
     * 
     * 
     */
    public List<BrandsAcceptedText> getBrandsAcceptedTexts() {
        if (brandsAcceptedTexts == null) {
            brandsAcceptedTexts = new ArrayList<BrandsAcceptedText>();
        }
        return this.brandsAcceptedTexts;
    }

    /**
     * Gets the value of the brandsAcceptedCodeLists property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the brandsAcceptedCodeLists property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getBrandsAcceptedCodeLists().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link BrandsAcceptedCodeList }
     * 
     * 
     */
    public List<BrandsAcceptedCodeList> getBrandsAcceptedCodeLists() {
        if (brandsAcceptedCodeLists == null) {
            brandsAcceptedCodeLists = new ArrayList<BrandsAcceptedCodeList>();
        }
        return this.brandsAcceptedCodeLists;
    }

    /**
     * Gets the value of the _PaymentMethodExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_PaymentMethodExtension() {
        return _PaymentMethodExtension;
    }

    /**
     * Sets the value of the _PaymentMethodExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_PaymentMethodExtension(_ExtensionType value) {
        this._PaymentMethodExtension = value;
    }

}
