
package eu.datex.informationmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for InformationManagement complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="InformationManagement"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="informationManagedResourceList" type="{http://datex2.eu/schema/3/informationManagement}InformationManagedResourceList" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_informationManagementExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformationManagement", propOrder = {
    "informationManagedResourceList",
    "_InformationManagementExtension"
})
@ToString
@EqualsAndHashCode
public class InformationManagement {

    protected InformationManagedResourceList informationManagedResourceList;
    @XmlElement(name = "_informationManagementExtension")
    protected _ExtensionType _InformationManagementExtension;

    /**
     * Gets the value of the informationManagedResourceList property.
     * 
     * @return
     *     possible object is
     *     {@link InformationManagedResourceList }
     *     
     */
    public InformationManagedResourceList getInformationManagedResourceList() {
        return informationManagedResourceList;
    }

    /**
     * Sets the value of the informationManagedResourceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationManagedResourceList }
     *     
     */
    public void setInformationManagedResourceList(InformationManagedResourceList value) {
        this.informationManagedResourceList = value;
    }

    /**
     * Gets the value of the _InformationManagementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_InformationManagementExtension() {
        return _InformationManagementExtension;
    }

    /**
     * Sets the value of the _InformationManagementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_InformationManagementExtension(_ExtensionType value) {
        this._InformationManagementExtension = value;
    }

}
