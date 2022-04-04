
package eu.datex.exchangeinformation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for Agent complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Agent"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="address" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="name" type="{http://datex2.eu/schema/3/common}String"/&amp;gt;
 *         &amp;lt;element name="serviceURL" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_agentExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agent", propOrder = {
    "address",
    "name",
    "serviceURL",
    "_AgentExtension"
})
@ToString
@EqualsAndHashCode
public class Agent {

    protected String address;
    @XmlElement(required = true)
    protected String name;
    protected String serviceURL;
    @XmlElement(name = "_agentExtension")
    protected _ExtensionType _AgentExtension;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the serviceURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceURL() {
        return serviceURL;
    }

    /**
     * Sets the value of the serviceURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceURL(String value) {
        this.serviceURL = value;
    }

    /**
     * Gets the value of the _AgentExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_AgentExtension() {
        return _AgentExtension;
    }

    /**
     * Sets the value of the _AgentExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_AgentExtension(_ExtensionType value) {
        this._AgentExtension = value;
    }

}
