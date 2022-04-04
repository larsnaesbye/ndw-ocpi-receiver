
package eu.datex.exchangeinformation;

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
 * &lt;p&gt;Java class for ExchangeContext complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ExchangeContext"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="codedExchangeProtocol" type="{http://datex2.eu/schema/3/exchangeInformation}_ProtocolTypeEnum"/&amp;gt;
 *         &amp;lt;element name="exchangeSpecificationVersion" type="{http://datex2.eu/schema/3/common}String"/&amp;gt;
 *         &amp;lt;element name="operatingMode" type="{http://datex2.eu/schema/3/exchangeInformation}_OperatingModeEnum" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="updateMethod" type="{http://datex2.eu/schema/3/exchangeInformation}_UpdateMethodEnum" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="supplierOrCisRequester" type="{http://datex2.eu/schema/3/exchangeInformation}Agent"/&amp;gt;
 *         &amp;lt;element name="clientOrCisProvider" type="{http://datex2.eu/schema/3/exchangeInformation}Agent" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="subscription" type="{http://datex2.eu/schema/3/exchangeInformation}Subscription" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_exchangeContextExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeContext", propOrder = {
    "codedExchangeProtocol",
    "exchangeSpecificationVersion",
    "operatingMode",
    "updateMethod",
    "supplierOrCisRequester",
    "clientOrCisProviders",
    "subscription",
    "_ExchangeContextExtension"
})
@ToString
@EqualsAndHashCode
public class ExchangeContext {

    @XmlElement(required = true)
    protected _ProtocolTypeEnum codedExchangeProtocol;
    @XmlElement(required = true)
    protected String exchangeSpecificationVersion;
    protected _OperatingModeEnum operatingMode;
    protected _UpdateMethodEnum updateMethod;
    @XmlElement(required = true)
    protected Agent supplierOrCisRequester;
    @XmlElement(name = "clientOrCisProvider")
    protected List<Agent> clientOrCisProviders;
    protected Subscription subscription;
    @XmlElement(name = "_exchangeContextExtension")
    protected _ExtensionType _ExchangeContextExtension;

    /**
     * Gets the value of the codedExchangeProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link _ProtocolTypeEnum }
     *     
     */
    public _ProtocolTypeEnum getCodedExchangeProtocol() {
        return codedExchangeProtocol;
    }

    /**
     * Sets the value of the codedExchangeProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ProtocolTypeEnum }
     *     
     */
    public void setCodedExchangeProtocol(_ProtocolTypeEnum value) {
        this.codedExchangeProtocol = value;
    }

    /**
     * Gets the value of the exchangeSpecificationVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeSpecificationVersion() {
        return exchangeSpecificationVersion;
    }

    /**
     * Sets the value of the exchangeSpecificationVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeSpecificationVersion(String value) {
        this.exchangeSpecificationVersion = value;
    }

    /**
     * Gets the value of the operatingMode property.
     * 
     * @return
     *     possible object is
     *     {@link _OperatingModeEnum }
     *     
     */
    public _OperatingModeEnum getOperatingMode() {
        return operatingMode;
    }

    /**
     * Sets the value of the operatingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link _OperatingModeEnum }
     *     
     */
    public void setOperatingMode(_OperatingModeEnum value) {
        this.operatingMode = value;
    }

    /**
     * Gets the value of the updateMethod property.
     * 
     * @return
     *     possible object is
     *     {@link _UpdateMethodEnum }
     *     
     */
    public _UpdateMethodEnum getUpdateMethod() {
        return updateMethod;
    }

    /**
     * Sets the value of the updateMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link _UpdateMethodEnum }
     *     
     */
    public void setUpdateMethod(_UpdateMethodEnum value) {
        this.updateMethod = value;
    }

    /**
     * Gets the value of the supplierOrCisRequester property.
     * 
     * @return
     *     possible object is
     *     {@link Agent }
     *     
     */
    public Agent getSupplierOrCisRequester() {
        return supplierOrCisRequester;
    }

    /**
     * Sets the value of the supplierOrCisRequester property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agent }
     *     
     */
    public void setSupplierOrCisRequester(Agent value) {
        this.supplierOrCisRequester = value;
    }

    /**
     * Gets the value of the clientOrCisProviders property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the clientOrCisProviders property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getClientOrCisProviders().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Agent }
     * 
     * 
     */
    public List<Agent> getClientOrCisProviders() {
        if (clientOrCisProviders == null) {
            clientOrCisProviders = new ArrayList<Agent>();
        }
        return this.clientOrCisProviders;
    }

    /**
     * Gets the value of the subscription property.
     * 
     * @return
     *     possible object is
     *     {@link Subscription }
     *     
     */
    public Subscription getSubscription() {
        return subscription;
    }

    /**
     * Sets the value of the subscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subscription }
     *     
     */
    public void setSubscription(Subscription value) {
        this.subscription = value;
    }

    /**
     * Gets the value of the _ExchangeContextExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_ExchangeContextExtension() {
        return _ExchangeContextExtension;
    }

    /**
     * Sets the value of the _ExchangeContextExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_ExchangeContextExtension(_ExtensionType value) {
        this._ExchangeContextExtension = value;
    }

}
