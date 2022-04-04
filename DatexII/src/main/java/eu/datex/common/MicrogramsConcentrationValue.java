
package eu.datex.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for MicrogramsConcentrationValue complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MicrogramsConcentrationValue"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="microgramsConcentration" type="{http://datex2.eu/schema/3/common}ConcentrationMicrogramsPerCubicMetre"/&amp;gt;
 *         &amp;lt;element name="_microgramsConcentrationValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MicrogramsConcentrationValue", propOrder = {
    "microgramsConcentration",
    "_MicrogramsConcentrationValueExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class MicrogramsConcentrationValue
    extends DataValue
{

    protected float microgramsConcentration;
    @XmlElement(name = "_microgramsConcentrationValueExtension")
    protected _ExtensionType _MicrogramsConcentrationValueExtension;

    /**
     * Gets the value of the microgramsConcentration property.
     * 
     */
    public float getMicrogramsConcentration() {
        return microgramsConcentration;
    }

    /**
     * Sets the value of the microgramsConcentration property.
     * 
     */
    public void setMicrogramsConcentration(float value) {
        this.microgramsConcentration = value;
    }

    /**
     * Gets the value of the _MicrogramsConcentrationValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_MicrogramsConcentrationValueExtension() {
        return _MicrogramsConcentrationValueExtension;
    }

    /**
     * Sets the value of the _MicrogramsConcentrationValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_MicrogramsConcentrationValueExtension(_ExtensionType value) {
        this._MicrogramsConcentrationValueExtension = value;
    }

}
