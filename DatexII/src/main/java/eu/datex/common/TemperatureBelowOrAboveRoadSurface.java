
package eu.datex.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for TemperatureBelowOrAboveRoadSurface complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="TemperatureBelowOrAboveRoadSurface"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="heightBelowOrAboveRoadSurface" type="{http://datex2.eu/schema/3/common}MetresAsFloat"/&amp;gt;
 *         &amp;lt;element name="temperatureBelowOrAboveRoadSurface" type="{http://datex2.eu/schema/3/common}TemperatureValue"/&amp;gt;
 *         &amp;lt;element name="_temperatureBelowOrAboveRoadSurfaceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemperatureBelowOrAboveRoadSurface", propOrder = {
    "heightBelowOrAboveRoadSurface",
    "temperatureBelowOrAboveRoadSurface",
    "_TemperatureBelowOrAboveRoadSurfaceExtension"
})
@ToString
@EqualsAndHashCode
public class TemperatureBelowOrAboveRoadSurface {

    protected float heightBelowOrAboveRoadSurface;
    @XmlElement(required = true)
    protected TemperatureValue temperatureBelowOrAboveRoadSurface;
    @XmlElement(name = "_temperatureBelowOrAboveRoadSurfaceExtension")
    protected _ExtensionType _TemperatureBelowOrAboveRoadSurfaceExtension;

    /**
     * Gets the value of the heightBelowOrAboveRoadSurface property.
     * 
     */
    public float getHeightBelowOrAboveRoadSurface() {
        return heightBelowOrAboveRoadSurface;
    }

    /**
     * Sets the value of the heightBelowOrAboveRoadSurface property.
     * 
     */
    public void setHeightBelowOrAboveRoadSurface(float value) {
        this.heightBelowOrAboveRoadSurface = value;
    }

    /**
     * Gets the value of the temperatureBelowOrAboveRoadSurface property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureValue }
     *     
     */
    public TemperatureValue getTemperatureBelowOrAboveRoadSurface() {
        return temperatureBelowOrAboveRoadSurface;
    }

    /**
     * Sets the value of the temperatureBelowOrAboveRoadSurface property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureValue }
     *     
     */
    public void setTemperatureBelowOrAboveRoadSurface(TemperatureValue value) {
        this.temperatureBelowOrAboveRoadSurface = value;
    }

    /**
     * Gets the value of the _TemperatureBelowOrAboveRoadSurfaceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TemperatureBelowOrAboveRoadSurfaceExtension() {
        return _TemperatureBelowOrAboveRoadSurfaceExtension;
    }

    /**
     * Sets the value of the _TemperatureBelowOrAboveRoadSurfaceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TemperatureBelowOrAboveRoadSurfaceExtension(_ExtensionType value) {
        this._TemperatureBelowOrAboveRoadSurfaceExtension = value;
    }

}
