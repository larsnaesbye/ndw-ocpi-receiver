
package eu.datex.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for KilogramsConcentrationValue complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="KilogramsConcentrationValue"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="kilogramsConcentration" type="{http://datex2.eu/schema/3/common}ConcentrationKilogramsPerCubicMetre"/&amp;gt;
 *         &amp;lt;element name="_kilogramsConcentrationValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KilogramsConcentrationValue", propOrder = {
    "kilogramsConcentration",
    "_KilogramsConcentrationValueExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class KilogramsConcentrationValue
    extends DataValue
{

    protected float kilogramsConcentration;
    @XmlElement(name = "_kilogramsConcentrationValueExtension")
    protected _ExtensionType _KilogramsConcentrationValueExtension;

    /**
     * Gets the value of the kilogramsConcentration property.
     * 
     */
    public float getKilogramsConcentration() {
        return kilogramsConcentration;
    }

    /**
     * Sets the value of the kilogramsConcentration property.
     * 
     */
    public void setKilogramsConcentration(float value) {
        this.kilogramsConcentration = value;
    }

    /**
     * Gets the value of the _KilogramsConcentrationValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_KilogramsConcentrationValueExtension() {
        return _KilogramsConcentrationValueExtension;
    }

    /**
     * Sets the value of the _KilogramsConcentrationValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_KilogramsConcentrationValueExtension(_ExtensionType value) {
        this._KilogramsConcentrationValueExtension = value;
    }

}
