
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
 * &lt;p&gt;Java class for TpegGeometricArea complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="TpegGeometricArea"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/locationReferencing}TpegAreaLocation"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="radius" type="{http://datex2.eu/schema/3/common}MetresAsNonNegativeInteger"/&amp;gt;
 *         &amp;lt;element name="centrePoint" type="{http://datex2.eu/schema/3/locationReferencing}PointCoordinates"/&amp;gt;
 *         &amp;lt;element name="name" type="{http://datex2.eu/schema/3/locationReferencing}TpegAreaDescriptor" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_tpegGeometricAreaExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegGeometricArea", propOrder = {
    "radius",
    "centrePoint",
    "name",
    "_TpegGeometricAreaExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class TpegGeometricArea
    extends TpegAreaLocation
{

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Long radius;
    @XmlElement(required = true)
    protected PointCoordinates centrePoint;
    protected TpegAreaDescriptor name;
    @XmlElement(name = "_tpegGeometricAreaExtension")
    protected _ExtensionType _TpegGeometricAreaExtension;

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadius(Long value) {
        this.radius = value;
    }

    /**
     * Gets the value of the centrePoint property.
     * 
     * @return
     *     possible object is
     *     {@link PointCoordinates }
     *     
     */
    public PointCoordinates getCentrePoint() {
        return centrePoint;
    }

    /**
     * Sets the value of the centrePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointCoordinates }
     *     
     */
    public void setCentrePoint(PointCoordinates value) {
        this.centrePoint = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link TpegAreaDescriptor }
     *     
     */
    public TpegAreaDescriptor getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegAreaDescriptor }
     *     
     */
    public void setName(TpegAreaDescriptor value) {
        this.name = value;
    }

    /**
     * Gets the value of the _TpegGeometricAreaExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TpegGeometricAreaExtension() {
        return _TpegGeometricAreaExtension;
    }

    /**
     * Sets the value of the _TpegGeometricAreaExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TpegGeometricAreaExtension(_ExtensionType value) {
        this._TpegGeometricAreaExtension = value;
    }

}
