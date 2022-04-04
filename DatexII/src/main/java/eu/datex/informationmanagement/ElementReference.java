
package eu.datex.informationmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common.Reference;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for ElementReference complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ElementReference"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="managementStatus" type="{http://datex2.eu/schema/3/informationManagement}_ManagementTypeEnum"/&amp;gt;
 *         &amp;lt;element name="reference" type="{http://datex2.eu/schema/3/common}Reference"/&amp;gt;
 *         &amp;lt;element name="_elementReferenceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementReference", propOrder = {
    "managementStatus",
    "reference",
    "_ElementReferenceExtension"
})
@ToString
@EqualsAndHashCode
public class ElementReference {

    @XmlElement(required = true)
    protected _ManagementTypeEnum managementStatus;
    @XmlElement(required = true)
    protected Reference reference;
    @XmlElement(name = "_elementReferenceExtension")
    protected _ExtensionType _ElementReferenceExtension;

    /**
     * Gets the value of the managementStatus property.
     * 
     * @return
     *     possible object is
     *     {@link _ManagementTypeEnum }
     *     
     */
    public _ManagementTypeEnum getManagementStatus() {
        return managementStatus;
    }

    /**
     * Sets the value of the managementStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ManagementTypeEnum }
     *     
     */
    public void setManagementStatus(_ManagementTypeEnum value) {
        this.managementStatus = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setReference(Reference value) {
        this.reference = value;
    }

    /**
     * Gets the value of the _ElementReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_ElementReferenceExtension() {
        return _ElementReferenceExtension;
    }

    /**
     * Sets the value of the _ElementReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_ElementReferenceExtension(_ExtensionType value) {
        this._ElementReferenceExtension = value;
    }

}
