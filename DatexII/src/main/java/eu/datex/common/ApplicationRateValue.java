
package eu.datex.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for ApplicationRateValue complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ApplicationRateValue"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="applicationRate" type="{http://datex2.eu/schema/3/common}IntensityKilogramsPerSquareMetre"/&amp;gt;
 *         &amp;lt;element name="_applicationRateValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationRateValue", propOrder = {
    "applicationRate",
    "_ApplicationRateValueExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ApplicationRateValue
    extends DataValue
{

    protected float applicationRate;
    @XmlElement(name = "_applicationRateValueExtension")
    protected _ExtensionType _ApplicationRateValueExtension;

    /**
     * Gets the value of the applicationRate property.
     * 
     */
    public float getApplicationRate() {
        return applicationRate;
    }

    /**
     * Sets the value of the applicationRate property.
     * 
     */
    public void setApplicationRate(float value) {
        this.applicationRate = value;
    }

    /**
     * Gets the value of the _ApplicationRateValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_ApplicationRateValueExtension() {
        return _ApplicationRateValueExtension;
    }

    /**
     * Sets the value of the _ApplicationRateValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_ApplicationRateValueExtension(_ExtensionType value) {
        this._ApplicationRateValueExtension = value;
    }

}
