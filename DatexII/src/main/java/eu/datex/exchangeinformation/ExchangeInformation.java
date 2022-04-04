
package eu.datex.exchangeinformation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for ExchangeInformation complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ExchangeInformation"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="messageType" type="{http://datex2.eu/schema/3/exchangeInformation}_MessageTypeEnum" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="exchangeContext" type="{http://datex2.eu/schema/3/exchangeInformation}ExchangeContext"/&amp;gt;
 *         &amp;lt;element name="dynamicInformation" type="{http://datex2.eu/schema/3/exchangeInformation}DynamicInformation"/&amp;gt;
 *         &amp;lt;element name="_exchangeInformationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="modelBaseVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="3" /&amp;gt;
 *       &amp;lt;attribute name="extensionName" type="{http://www.w3.org/2001/XMLSchema}string" default="Exchange 2018" /&amp;gt;
 *       &amp;lt;attribute name="extensionVersion" type="{http://www.w3.org/2001/XMLSchema}string" default="1" /&amp;gt;
 *       &amp;lt;attribute name="profileName" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="profileVersion" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeInformation", propOrder = {
    "messageType",
    "exchangeContext",
    "dynamicInformation",
    "_ExchangeInformationExtension"
})
@ToString
@EqualsAndHashCode
public class ExchangeInformation {

    protected _MessageTypeEnum messageType;
    @XmlElement(required = true)
    protected ExchangeContext exchangeContext;
    @XmlElement(required = true)
    protected DynamicInformation dynamicInformation;
    @XmlElement(name = "_exchangeInformationExtension")
    protected _ExtensionType _ExchangeInformationExtension;
    @XmlAttribute(name = "modelBaseVersion", required = true)
    protected String modelBaseVersion;
    @XmlAttribute(name = "extensionName")
    protected String extensionName;
    @XmlAttribute(name = "extensionVersion")
    protected String extensionVersion;
    @XmlAttribute(name = "profileName")
    protected String profileName;
    @XmlAttribute(name = "profileVersion")
    protected String profileVersion;

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link _MessageTypeEnum }
     *     
     */
    public _MessageTypeEnum getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _MessageTypeEnum }
     *     
     */
    public void setMessageType(_MessageTypeEnum value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the exchangeContext property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeContext }
     *     
     */
    public ExchangeContext getExchangeContext() {
        return exchangeContext;
    }

    /**
     * Sets the value of the exchangeContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeContext }
     *     
     */
    public void setExchangeContext(ExchangeContext value) {
        this.exchangeContext = value;
    }

    /**
     * Gets the value of the dynamicInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicInformation }
     *     
     */
    public DynamicInformation getDynamicInformation() {
        return dynamicInformation;
    }

    /**
     * Sets the value of the dynamicInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicInformation }
     *     
     */
    public void setDynamicInformation(DynamicInformation value) {
        this.dynamicInformation = value;
    }

    /**
     * Gets the value of the _ExchangeInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_ExchangeInformationExtension() {
        return _ExchangeInformationExtension;
    }

    /**
     * Sets the value of the _ExchangeInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_ExchangeInformationExtension(_ExtensionType value) {
        this._ExchangeInformationExtension = value;
    }

    /**
     * Gets the value of the modelBaseVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelBaseVersion() {
        if (modelBaseVersion == null) {
            return "3";
        } else {
            return modelBaseVersion;
        }
    }

    /**
     * Sets the value of the modelBaseVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelBaseVersion(String value) {
        this.modelBaseVersion = value;
    }

    /**
     * Gets the value of the extensionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionName() {
        if (extensionName == null) {
            return "Exchange 2018";
        } else {
            return extensionName;
        }
    }

    /**
     * Sets the value of the extensionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionName(String value) {
        this.extensionName = value;
    }

    /**
     * Gets the value of the extensionVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionVersion() {
        if (extensionVersion == null) {
            return "1";
        } else {
            return extensionVersion;
        }
    }

    /**
     * Sets the value of the extensionVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionVersion(String value) {
        this.extensionVersion = value;
    }

    /**
     * Gets the value of the profileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileName() {
        return profileName;
    }

    /**
     * Sets the value of the profileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileName(String value) {
        this.profileName = value;
    }

    /**
     * Gets the value of the profileVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileVersion() {
        return profileVersion;
    }

    /**
     * Sets the value of the profileVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileVersion(String value) {
        this.profileVersion = value;
    }

}
