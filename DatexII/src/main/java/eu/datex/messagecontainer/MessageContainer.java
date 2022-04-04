
package eu.datex.messagecontainer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common.PayloadPublication;
import eu.datex.common._ExtensionType;
import eu.datex.exchangeinformation.ExchangeInformation;
import eu.datex.informationmanagement.InformationManagement;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for MessageContainer complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MessageContainer"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="payload" type="{http://datex2.eu/schema/3/common}PayloadPublication" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="exchangeInformation" type="{http://datex2.eu/schema/3/exchangeInformation}ExchangeInformation"/&amp;gt;
 *         &amp;lt;element name="informationManagement" type="{http://datex2.eu/schema/3/informationManagement}InformationManagement" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_messageContainerExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="modelBaseVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="3" /&amp;gt;
 *       &amp;lt;attribute name="extensionName" type="{http://www.w3.org/2001/XMLSchema}string" default="Exchange 2020" /&amp;gt;
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
@XmlType(name = "MessageContainer", propOrder = {
    "payloads",
    "exchangeInformation",
    "informationManagement",
    "_MessageContainerExtension"
})
@ToString
@EqualsAndHashCode
public class MessageContainer {

    @XmlElement(name = "payload")
    protected List<PayloadPublication> payloads;
    @XmlElement(required = true)
    protected ExchangeInformation exchangeInformation;
    protected InformationManagement informationManagement;
    @XmlElement(name = "_messageContainerExtension")
    protected _ExtensionType _MessageContainerExtension;
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
     * Gets the value of the payloads property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the payloads property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getPayloads().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link PayloadPublication }
     * 
     * 
     */
    public List<PayloadPublication> getPayloads() {
        if (payloads == null) {
            payloads = new ArrayList<PayloadPublication>();
        }
        return this.payloads;
    }

    /**
     * Gets the value of the exchangeInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeInformation }
     *     
     */
    public ExchangeInformation getExchangeInformation() {
        return exchangeInformation;
    }

    /**
     * Sets the value of the exchangeInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeInformation }
     *     
     */
    public void setExchangeInformation(ExchangeInformation value) {
        this.exchangeInformation = value;
    }

    /**
     * Gets the value of the informationManagement property.
     * 
     * @return
     *     possible object is
     *     {@link InformationManagement }
     *     
     */
    public InformationManagement getInformationManagement() {
        return informationManagement;
    }

    /**
     * Sets the value of the informationManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationManagement }
     *     
     */
    public void setInformationManagement(InformationManagement value) {
        this.informationManagement = value;
    }

    /**
     * Gets the value of the _MessageContainerExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_MessageContainerExtension() {
        return _MessageContainerExtension;
    }

    /**
     * Sets the value of the _MessageContainerExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_MessageContainerExtension(_ExtensionType value) {
        this._MessageContainerExtension = value;
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
            return "Exchange 2020";
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
