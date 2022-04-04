
package eu.datex.locationreferencing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for PointCoordinates complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PointCoordinates"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="latitude" type="{http://datex2.eu/schema/3/common}Float"/&amp;gt;
 *         &amp;lt;element name="longitude" type="{http://datex2.eu/schema/3/common}Float"/&amp;gt;
 *         &amp;lt;element name="_pointCoordinatesExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointCoordinates", propOrder = {
    "latitude",
    "longitude",
    "_PointCoordinatesExtension"
})
@ToString
@EqualsAndHashCode
public class PointCoordinates {

    protected float latitude;
    protected float longitude;
    @XmlElement(name = "_pointCoordinatesExtension")
    protected _ExtensionType _PointCoordinatesExtension;

    /**
     * Gets the value of the latitude property.
     * 
     */
    public float getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     */
    public void setLatitude(float value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     */
    public float getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     */
    public void setLongitude(float value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the _PointCoordinatesExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_PointCoordinatesExtension() {
        return _PointCoordinatesExtension;
    }

    /**
     * Sets the value of the _PointCoordinatesExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_PointCoordinatesExtension(_ExtensionType value) {
        this._PointCoordinatesExtension = value;
    }

}
