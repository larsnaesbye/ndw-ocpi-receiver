
package eu.datex.facilities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for OperatingHoursByReference complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="OperatingHoursByReference"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/facilities}OperatingHours"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="operatingHoursReference" type="{http://datex2.eu/schema/3/facilities}_OperatingHoursSpecificationVersionedReference"/&amp;gt;
 *         &amp;lt;element name="operatingHoursTableReference" type="{http://datex2.eu/schema/3/facilities}_OperatingHoursTableVersionedReference" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_operatingHoursByReferenceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingHoursByReference", propOrder = {
    "operatingHoursReference",
    "operatingHoursTableReference",
    "_OperatingHoursByReferenceExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class OperatingHoursByReference
    extends OperatingHours
{

    @XmlElement(required = true)
    protected _OperatingHoursSpecificationVersionedReference operatingHoursReference;
    protected _OperatingHoursTableVersionedReference operatingHoursTableReference;
    @XmlElement(name = "_operatingHoursByReferenceExtension")
    protected _ExtensionType _OperatingHoursByReferenceExtension;

    /**
     * Gets the value of the operatingHoursReference property.
     * 
     * @return
     *     possible object is
     *     {@link _OperatingHoursSpecificationVersionedReference }
     *     
     */
    public _OperatingHoursSpecificationVersionedReference getOperatingHoursReference() {
        return operatingHoursReference;
    }

    /**
     * Sets the value of the operatingHoursReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link _OperatingHoursSpecificationVersionedReference }
     *     
     */
    public void setOperatingHoursReference(_OperatingHoursSpecificationVersionedReference value) {
        this.operatingHoursReference = value;
    }

    /**
     * Gets the value of the operatingHoursTableReference property.
     * 
     * @return
     *     possible object is
     *     {@link _OperatingHoursTableVersionedReference }
     *     
     */
    public _OperatingHoursTableVersionedReference getOperatingHoursTableReference() {
        return operatingHoursTableReference;
    }

    /**
     * Sets the value of the operatingHoursTableReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link _OperatingHoursTableVersionedReference }
     *     
     */
    public void setOperatingHoursTableReference(_OperatingHoursTableVersionedReference value) {
        this.operatingHoursTableReference = value;
    }

    /**
     * Gets the value of the _OperatingHoursByReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OperatingHoursByReferenceExtension() {
        return _OperatingHoursByReferenceExtension;
    }

    /**
     * Sets the value of the _OperatingHoursByReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OperatingHoursByReferenceExtension(_ExtensionType value) {
        this._OperatingHoursByReferenceExtension = value;
    }

}
