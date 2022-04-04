
package eu.datex.informationmanagement;

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
 * &lt;p&gt;Java class for InformationManagedResourceList complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="InformationManagedResourceList"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="elementReference" type="{http://datex2.eu/schema/3/informationManagement}ElementReference" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element name="_informationManagedResourceListExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformationManagedResourceList", propOrder = {
    "elementReferences",
    "_InformationManagedResourceListExtension"
})
@ToString
@EqualsAndHashCode
public class InformationManagedResourceList {

    @XmlElement(name = "elementReference", required = true)
    protected List<ElementReference> elementReferences;
    @XmlElement(name = "_informationManagedResourceListExtension")
    protected _ExtensionType _InformationManagedResourceListExtension;

    /**
     * Gets the value of the elementReferences property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the elementReferences property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getElementReferences().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link ElementReference }
     * 
     * 
     */
    public List<ElementReference> getElementReferences() {
        if (elementReferences == null) {
            elementReferences = new ArrayList<ElementReference>();
        }
        return this.elementReferences;
    }

    /**
     * Gets the value of the _InformationManagedResourceListExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_InformationManagedResourceListExtension() {
        return _InformationManagedResourceListExtension;
    }

    /**
     * Sets the value of the _InformationManagedResourceListExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_InformationManagedResourceListExtension(_ExtensionType value) {
        this._InformationManagedResourceListExtension = value;
    }

}
