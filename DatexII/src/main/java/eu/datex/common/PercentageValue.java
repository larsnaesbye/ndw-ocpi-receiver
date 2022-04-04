
package eu.datex.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for PercentageValue complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PercentageValue"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="percentage" type="{http://datex2.eu/schema/3/common}Percentage"/&amp;gt;
 *         &amp;lt;element name="_percentageValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PercentageValue", propOrder = {
    "percentage",
    "_PercentageValueExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class PercentageValue
    extends DataValue
{

    protected float percentage;
    @XmlElement(name = "_percentageValueExtension")
    protected _ExtensionType _PercentageValueExtension;

    /**
     * Gets the value of the percentage property.
     * 
     */
    public float getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     */
    public void setPercentage(float value) {
        this.percentage = value;
    }

    /**
     * Gets the value of the _PercentageValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_PercentageValueExtension() {
        return _PercentageValueExtension;
    }

    /**
     * Sets the value of the _PercentageValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_PercentageValueExtension(_ExtensionType value) {
        this._PercentageValueExtension = value;
    }

}
