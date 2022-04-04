
package eu.datex.locationreferencing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.w3._2001.xmlschema.Adapter2;


/**
 * &lt;p&gt;Java class for PointByCoordinates complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PointByCoordinates"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="bearing" type="{http://datex2.eu/schema/3/common}AngleInDegrees" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="pointCoordinates" type="{http://datex2.eu/schema/3/locationReferencing}PointCoordinates"/&amp;gt;
 *         &amp;lt;element name="_pointByCoordinatesExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointByCoordinates", propOrder = {
    "bearing",
    "pointCoordinates",
    "_PointByCoordinatesExtension"
})
@ToString
@EqualsAndHashCode
public class PointByCoordinates {

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Long bearing;
    @XmlElement(required = true)
    protected PointCoordinates pointCoordinates;
    @XmlElement(name = "_pointByCoordinatesExtension")
    protected _ExtensionType _PointByCoordinatesExtension;

    /**
     * Gets the value of the bearing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getBearing() {
        return bearing;
    }

    /**
     * Sets the value of the bearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBearing(Long value) {
        this.bearing = value;
    }

    /**
     * Gets the value of the pointCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link PointCoordinates }
     *     
     */
    public PointCoordinates getPointCoordinates() {
        return pointCoordinates;
    }

    /**
     * Sets the value of the pointCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointCoordinates }
     *     
     */
    public void setPointCoordinates(PointCoordinates value) {
        this.pointCoordinates = value;
    }

    /**
     * Gets the value of the _PointByCoordinatesExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_PointByCoordinatesExtension() {
        return _PointByCoordinatesExtension;
    }

    /**
     * Sets the value of the _PointByCoordinatesExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_PointByCoordinatesExtension(_ExtensionType value) {
        this._PointByCoordinatesExtension = value;
    }

}
