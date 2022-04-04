
package eu.datex.locationreferencing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for OpenlrRectangle complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="OpenlrRectangle"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="openlrLowerLeft" type="{http://datex2.eu/schema/3/locationReferencing}PointCoordinates"/&amp;gt;
 *         &amp;lt;element name="openlrUpperRight" type="{http://datex2.eu/schema/3/locationReferencing}PointCoordinates"/&amp;gt;
 *         &amp;lt;element name="_openlrRectangleExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrRectangle", propOrder = {
    "openlrLowerLeft",
    "openlrUpperRight",
    "_OpenlrRectangleExtension"
})
@ToString
@EqualsAndHashCode
public class OpenlrRectangle {

    @XmlElement(required = true)
    protected PointCoordinates openlrLowerLeft;
    @XmlElement(required = true)
    protected PointCoordinates openlrUpperRight;
    @XmlElement(name = "_openlrRectangleExtension")
    protected _ExtensionType _OpenlrRectangleExtension;

    /**
     * Gets the value of the openlrLowerLeft property.
     * 
     * @return
     *     possible object is
     *     {@link PointCoordinates }
     *     
     */
    public PointCoordinates getOpenlrLowerLeft() {
        return openlrLowerLeft;
    }

    /**
     * Sets the value of the openlrLowerLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointCoordinates }
     *     
     */
    public void setOpenlrLowerLeft(PointCoordinates value) {
        this.openlrLowerLeft = value;
    }

    /**
     * Gets the value of the openlrUpperRight property.
     * 
     * @return
     *     possible object is
     *     {@link PointCoordinates }
     *     
     */
    public PointCoordinates getOpenlrUpperRight() {
        return openlrUpperRight;
    }

    /**
     * Sets the value of the openlrUpperRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointCoordinates }
     *     
     */
    public void setOpenlrUpperRight(PointCoordinates value) {
        this.openlrUpperRight = value;
    }

    /**
     * Gets the value of the _OpenlrRectangleExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OpenlrRectangleExtension() {
        return _OpenlrRectangleExtension;
    }

    /**
     * Sets the value of the _OpenlrRectangleExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OpenlrRectangleExtension(_ExtensionType value) {
        this._OpenlrRectangleExtension = value;
    }

}
