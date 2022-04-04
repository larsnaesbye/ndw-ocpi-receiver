
package eu.datex.exchangeinformation;

import java.time.Instant;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.datex.common._ExtensionType;
import io.github.threetenjaxb.core.InstantXmlAdapter;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for DynamicInformation complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="DynamicInformation"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="exchangeStatus" type="{http://datex2.eu/schema/3/exchangeInformation}_ExchangeStatusEnum"/&amp;gt;
 *         &amp;lt;element name="messageGenerationTimestamp" type="{http://datex2.eu/schema/3/common}DateTime"/&amp;gt;
 *         &amp;lt;element name="returnInformation" type="{http://datex2.eu/schema/3/exchangeInformation}ReturnInformation" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sessionInformation" type="{http://datex2.eu/schema/3/exchangeInformation}SessionInformation" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_dynamicInformationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicInformation", propOrder = {
    "exchangeStatus",
    "messageGenerationTimestamp",
    "returnInformation",
    "sessionInformation",
    "_DynamicInformationExtension"
})
@ToString
@EqualsAndHashCode
public class DynamicInformation {

    @XmlElement(required = true)
    protected _ExchangeStatusEnum exchangeStatus;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(InstantXmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Instant messageGenerationTimestamp;
    protected ReturnInformation returnInformation;
    protected SessionInformation sessionInformation;
    @XmlElement(name = "_dynamicInformationExtension")
    protected _ExtensionType _DynamicInformationExtension;

    /**
     * Gets the value of the exchangeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link _ExchangeStatusEnum }
     *     
     */
    public _ExchangeStatusEnum getExchangeStatus() {
        return exchangeStatus;
    }

    /**
     * Sets the value of the exchangeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExchangeStatusEnum }
     *     
     */
    public void setExchangeStatus(_ExchangeStatusEnum value) {
        this.exchangeStatus = value;
    }

    /**
     * Gets the value of the messageGenerationTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Instant getMessageGenerationTimestamp() {
        return messageGenerationTimestamp;
    }

    /**
     * Sets the value of the messageGenerationTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageGenerationTimestamp(Instant value) {
        this.messageGenerationTimestamp = value;
    }

    /**
     * Gets the value of the returnInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnInformation }
     *     
     */
    public ReturnInformation getReturnInformation() {
        return returnInformation;
    }

    /**
     * Sets the value of the returnInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnInformation }
     *     
     */
    public void setReturnInformation(ReturnInformation value) {
        this.returnInformation = value;
    }

    /**
     * Gets the value of the sessionInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SessionInformation }
     *     
     */
    public SessionInformation getSessionInformation() {
        return sessionInformation;
    }

    /**
     * Sets the value of the sessionInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionInformation }
     *     
     */
    public void setSessionInformation(SessionInformation value) {
        this.sessionInformation = value;
    }

    /**
     * Gets the value of the _DynamicInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_DynamicInformationExtension() {
        return _DynamicInformationExtension;
    }

    /**
     * Sets the value of the _DynamicInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_DynamicInformationExtension(_ExtensionType value) {
        this._DynamicInformationExtension = value;
    }

}
