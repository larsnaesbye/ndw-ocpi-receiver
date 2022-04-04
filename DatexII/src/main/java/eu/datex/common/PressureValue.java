
package eu.datex.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for PressureValue complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PressureValue"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="pressure" type="{http://datex2.eu/schema/3/common}Hectopascal"/&amp;gt;
 *         &amp;lt;element name="_pressureValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PressureValue", propOrder = {
    "pressure",
    "_PressureValueExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class PressureValue
    extends DataValue
{

    protected float pressure;
    @XmlElement(name = "_pressureValueExtension")
    protected _ExtensionType _PressureValueExtension;

    /**
     * Gets the value of the pressure property.
     * 
     */
    public float getPressure() {
        return pressure;
    }

    /**
     * Sets the value of the pressure property.
     * 
     */
    public void setPressure(float value) {
        this.pressure = value;
    }

    /**
     * Gets the value of the _PressureValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_PressureValueExtension() {
        return _PressureValueExtension;
    }

    /**
     * Sets the value of the _PressureValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_PressureValueExtension(_ExtensionType value) {
        this._PressureValueExtension = value;
    }

}
