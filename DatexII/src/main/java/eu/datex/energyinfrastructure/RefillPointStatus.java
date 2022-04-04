
package eu.datex.energyinfrastructure;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import eu.datex.facilities.FacilityStatus;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for RefillPointStatus complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RefillPointStatus"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/facilities}FacilityStatus"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="status" type="{http://datex2.eu/schema/3/energyInfrastructure}_RefillPointStatusEnum"/&amp;gt;
 *         &amp;lt;element name="_refillPointStatusExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefillPointStatus", propOrder = {
    "status",
    "_RefillPointStatusExtension"
})
@XmlSeeAlso({
    ElectricChargingPointStatus.class
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class RefillPointStatus
    extends FacilityStatus
{

    @XmlElement(required = true)
    protected _RefillPointStatusEnum status;
    @XmlElement(name = "_refillPointStatusExtension")
    protected _ExtensionType _RefillPointStatusExtension;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link _RefillPointStatusEnum }
     *     
     */
    public _RefillPointStatusEnum getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link _RefillPointStatusEnum }
     *     
     */
    public void setStatus(_RefillPointStatusEnum value) {
        this.status = value;
    }

    /**
     * Gets the value of the _RefillPointStatusExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_RefillPointStatusExtension() {
        return _RefillPointStatusExtension;
    }

    /**
     * Sets the value of the _RefillPointStatusExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_RefillPointStatusExtension(_ExtensionType value) {
        this._RefillPointStatusExtension = value;
    }

}
