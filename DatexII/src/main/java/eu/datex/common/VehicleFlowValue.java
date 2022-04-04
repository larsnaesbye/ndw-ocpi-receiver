
package eu.datex.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.w3._2001.xmlschema.Adapter2;


/**
 * &lt;p&gt;Java class for VehicleFlowValue complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="VehicleFlowValue"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="vehicleFlowRate" type="{http://datex2.eu/schema/3/common}VehiclesPerHour"/&amp;gt;
 *         &amp;lt;element name="_vehicleFlowValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleFlowValue", propOrder = {
    "vehicleFlowRate",
    "_VehicleFlowValueExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class VehicleFlowValue
    extends DataValue
{

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Long vehicleFlowRate;
    @XmlElement(name = "_vehicleFlowValueExtension")
    protected _ExtensionType _VehicleFlowValueExtension;

    /**
     * Gets the value of the vehicleFlowRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getVehicleFlowRate() {
        return vehicleFlowRate;
    }

    /**
     * Sets the value of the vehicleFlowRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleFlowRate(Long value) {
        this.vehicleFlowRate = value;
    }

    /**
     * Gets the value of the _VehicleFlowValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_VehicleFlowValueExtension() {
        return _VehicleFlowValueExtension;
    }

    /**
     * Sets the value of the _VehicleFlowValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_VehicleFlowValueExtension(_ExtensionType value) {
        this._VehicleFlowValueExtension = value;
    }

}
