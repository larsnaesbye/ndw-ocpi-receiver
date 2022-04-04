
package eu.datex.facilities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import eu.datex.energyinfrastructure.EnergyInfrastructureSiteStatus;
import eu.datex.energyinfrastructure.EnergyInfrastructureStationStatus;
import eu.datex.energyinfrastructure.RefillPointStatus;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for FacilityStatus complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="FacilityStatus"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/facilities}FacilityObjectStatus"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="_facilityStatusExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityStatus", propOrder = {
    "_FacilityStatusExtension"
})
@XmlSeeAlso({
    EnergyInfrastructureSiteStatus.class,
    EnergyInfrastructureStationStatus.class,
    RefillPointStatus.class
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class FacilityStatus
    extends FacilityObjectStatus
{

    @XmlElement(name = "_facilityStatusExtension")
    protected _ExtensionType _FacilityStatusExtension;

    /**
     * Gets the value of the _FacilityStatusExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_FacilityStatusExtension() {
        return _FacilityStatusExtension;
    }

    /**
     * Sets the value of the _FacilityStatusExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_FacilityStatusExtension(_ExtensionType value) {
        this._FacilityStatusExtension = value;
    }

}
