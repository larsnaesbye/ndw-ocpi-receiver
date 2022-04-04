
package eu.datex.facilities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for RatesByReference complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RatesByReference"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/facilities}Rates"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="rateTableReference" type="{http://datex2.eu/schema/3/facilities}_RateTableVersionedReference"/&amp;gt;
 *         &amp;lt;element name="rateMatrixReference" type="{http://datex2.eu/schema/3/facilities}_RateMatrixVersionedReference" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_ratesByReferenceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatesByReference", propOrder = {
    "rateTableReference",
    "rateMatrixReference",
    "_RatesByReferenceExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class RatesByReference
    extends Rates
{

    @XmlElement(required = true)
    protected _RateTableVersionedReference rateTableReference;
    protected _RateMatrixVersionedReference rateMatrixReference;
    @XmlElement(name = "_ratesByReferenceExtension")
    protected _ExtensionType _RatesByReferenceExtension;

    /**
     * Gets the value of the rateTableReference property.
     * 
     * @return
     *     possible object is
     *     {@link _RateTableVersionedReference }
     *     
     */
    public _RateTableVersionedReference getRateTableReference() {
        return rateTableReference;
    }

    /**
     * Sets the value of the rateTableReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link _RateTableVersionedReference }
     *     
     */
    public void setRateTableReference(_RateTableVersionedReference value) {
        this.rateTableReference = value;
    }

    /**
     * Gets the value of the rateMatrixReference property.
     * 
     * @return
     *     possible object is
     *     {@link _RateMatrixVersionedReference }
     *     
     */
    public _RateMatrixVersionedReference getRateMatrixReference() {
        return rateMatrixReference;
    }

    /**
     * Sets the value of the rateMatrixReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link _RateMatrixVersionedReference }
     *     
     */
    public void setRateMatrixReference(_RateMatrixVersionedReference value) {
        this.rateMatrixReference = value;
    }

    /**
     * Gets the value of the _RatesByReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_RatesByReferenceExtension() {
        return _RatesByReferenceExtension;
    }

    /**
     * Sets the value of the _RatesByReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_RatesByReferenceExtension(_ExtensionType value) {
        this._RatesByReferenceExtension = value;
    }

}
