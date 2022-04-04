
package eu.datex.facilities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for Credential complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Credential"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="type" type="{http://datex2.eu/schema/3/facilities}_CredentialTypeEnum"/&amp;gt;
 *         &amp;lt;element name="otherType" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_credentialExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Credential", propOrder = {
    "type",
    "otherType",
    "_CredentialExtension"
})
@XmlSeeAlso({
    CredentialAssigned.class
})
@ToString
@EqualsAndHashCode
public class Credential {

    @XmlElement(required = true)
    protected _CredentialTypeEnum type;
    protected String otherType;
    @XmlElement(name = "_credentialExtension")
    protected _ExtensionType _CredentialExtension;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link _CredentialTypeEnum }
     *     
     */
    public _CredentialTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link _CredentialTypeEnum }
     *     
     */
    public void setType(_CredentialTypeEnum value) {
        this.type = value;
    }

    /**
     * Gets the value of the otherType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherType() {
        return otherType;
    }

    /**
     * Sets the value of the otherType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherType(String value) {
        this.otherType = value;
    }

    /**
     * Gets the value of the _CredentialExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_CredentialExtension() {
        return _CredentialExtension;
    }

    /**
     * Sets the value of the _CredentialExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_CredentialExtension(_ExtensionType value) {
        this._CredentialExtension = value;
    }

}
