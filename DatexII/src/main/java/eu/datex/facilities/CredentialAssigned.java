
package eu.datex.facilities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for CredentialAssigned complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CredentialAssigned"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/facilities}Credential"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="localIdentifier" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="issuer" type="{http://datex2.eu/schema/3/facilities}_OrganisationVersionedReference"/&amp;gt;
 *         &amp;lt;element name="_credentialAssignedExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CredentialAssigned", propOrder = {
    "localIdentifier",
    "issuer",
    "_CredentialAssignedExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class CredentialAssigned
    extends Credential
{

    protected String localIdentifier;
    @XmlElement(required = true)
    protected _OrganisationVersionedReference issuer;
    @XmlElement(name = "_credentialAssignedExtension")
    protected _ExtensionType _CredentialAssignedExtension;

    /**
     * Gets the value of the localIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalIdentifier() {
        return localIdentifier;
    }

    /**
     * Sets the value of the localIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalIdentifier(String value) {
        this.localIdentifier = value;
    }

    /**
     * Gets the value of the issuer property.
     * 
     * @return
     *     possible object is
     *     {@link _OrganisationVersionedReference }
     *     
     */
    public _OrganisationVersionedReference getIssuer() {
        return issuer;
    }

    /**
     * Sets the value of the issuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link _OrganisationVersionedReference }
     *     
     */
    public void setIssuer(_OrganisationVersionedReference value) {
        this.issuer = value;
    }

    /**
     * Gets the value of the _CredentialAssignedExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_CredentialAssignedExtension() {
        return _CredentialAssignedExtension;
    }

    /**
     * Sets the value of the _CredentialAssignedExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_CredentialAssignedExtension(_ExtensionType value) {
        this._CredentialAssignedExtension = value;
    }

}
