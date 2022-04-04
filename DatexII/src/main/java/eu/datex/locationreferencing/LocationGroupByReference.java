
package eu.datex.locationreferencing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for LocationGroupByReference complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="LocationGroupByReference"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/locationReferencing}LocationGroup"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="predefinedLocationGroupReference" type="{http://datex2.eu/schema/3/locationReferencing}_PredefinedLocationGroupVersionedReference"/&amp;gt;
 *         &amp;lt;element name="_locationGroupByReferenceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationGroupByReference", propOrder = {
    "predefinedLocationGroupReference",
    "_LocationGroupByReferenceExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class LocationGroupByReference
    extends LocationGroup
{

    @XmlElement(required = true)
    protected _PredefinedLocationGroupVersionedReference predefinedLocationGroupReference;
    @XmlElement(name = "_locationGroupByReferenceExtension")
    protected _ExtensionType _LocationGroupByReferenceExtension;

    /**
     * Gets the value of the predefinedLocationGroupReference property.
     * 
     * @return
     *     possible object is
     *     {@link _PredefinedLocationGroupVersionedReference }
     *     
     */
    public _PredefinedLocationGroupVersionedReference getPredefinedLocationGroupReference() {
        return predefinedLocationGroupReference;
    }

    /**
     * Sets the value of the predefinedLocationGroupReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link _PredefinedLocationGroupVersionedReference }
     *     
     */
    public void setPredefinedLocationGroupReference(_PredefinedLocationGroupVersionedReference value) {
        this.predefinedLocationGroupReference = value;
    }

    /**
     * Gets the value of the _LocationGroupByReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_LocationGroupByReferenceExtension() {
        return _LocationGroupByReferenceExtension;
    }

    /**
     * Sets the value of the _LocationGroupByReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_LocationGroupByReferenceExtension(_ExtensionType value) {
        this._LocationGroupByReferenceExtension = value;
    }

}
