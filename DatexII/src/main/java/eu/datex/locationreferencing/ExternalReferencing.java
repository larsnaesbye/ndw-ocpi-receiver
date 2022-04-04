
package eu.datex.locationreferencing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for ExternalReferencing complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ExternalReferencing"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="externalLocationCode" type="{http://datex2.eu/schema/3/common}String"/&amp;gt;
 *         &amp;lt;element name="externalReferencingSystem" type="{http://datex2.eu/schema/3/common}String"/&amp;gt;
 *         &amp;lt;element name="_externalReferencingExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalReferencing", propOrder = {
    "externalLocationCode",
    "externalReferencingSystem",
    "_ExternalReferencingExtension"
})
@ToString
@EqualsAndHashCode
public class ExternalReferencing {

    @XmlElement(required = true)
    protected String externalLocationCode;
    @XmlElement(required = true)
    protected String externalReferencingSystem;
    @XmlElement(name = "_externalReferencingExtension")
    protected _ExtensionType _ExternalReferencingExtension;

    /**
     * Gets the value of the externalLocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalLocationCode() {
        return externalLocationCode;
    }

    /**
     * Sets the value of the externalLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalLocationCode(String value) {
        this.externalLocationCode = value;
    }

    /**
     * Gets the value of the externalReferencingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalReferencingSystem() {
        return externalReferencingSystem;
    }

    /**
     * Sets the value of the externalReferencingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalReferencingSystem(String value) {
        this.externalReferencingSystem = value;
    }

    /**
     * Gets the value of the _ExternalReferencingExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_ExternalReferencingExtension() {
        return _ExternalReferencingExtension;
    }

    /**
     * Sets the value of the _ExternalReferencingExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_ExternalReferencingExtension(_ExtensionType value) {
        this._ExternalReferencingExtension = value;
    }

}
