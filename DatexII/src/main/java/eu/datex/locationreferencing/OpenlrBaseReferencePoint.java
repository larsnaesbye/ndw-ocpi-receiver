
package eu.datex.locationreferencing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for OpenlrBaseReferencePoint complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="OpenlrBaseReferencePoint"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="openlrCoordinates" type="{http://datex2.eu/schema/3/locationReferencing}PointCoordinates"/&amp;gt;
 *         &amp;lt;element name="openlrLineAttributes" type="{http://datex2.eu/schema/3/locationReferencing}OpenlrLineAttributes"/&amp;gt;
 *         &amp;lt;element name="_openlrBaseReferencePointExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrBaseReferencePoint", propOrder = {
    "openlrCoordinates",
    "openlrLineAttributes",
    "_OpenlrBaseReferencePointExtension"
})
@XmlSeeAlso({
    OpenlrLastLocationReferencePoint.class,
    OpenlrLocationReferencePoint.class
})
@ToString
@EqualsAndHashCode
public abstract class OpenlrBaseReferencePoint {

    @XmlElement(required = true)
    protected PointCoordinates openlrCoordinates;
    @XmlElement(required = true)
    protected OpenlrLineAttributes openlrLineAttributes;
    @XmlElement(name = "_openlrBaseReferencePointExtension")
    protected _ExtensionType _OpenlrBaseReferencePointExtension;

    /**
     * Gets the value of the openlrCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link PointCoordinates }
     *     
     */
    public PointCoordinates getOpenlrCoordinates() {
        return openlrCoordinates;
    }

    /**
     * Sets the value of the openlrCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointCoordinates }
     *     
     */
    public void setOpenlrCoordinates(PointCoordinates value) {
        this.openlrCoordinates = value;
    }

    /**
     * Gets the value of the openlrLineAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrLineAttributes }
     *     
     */
    public OpenlrLineAttributes getOpenlrLineAttributes() {
        return openlrLineAttributes;
    }

    /**
     * Sets the value of the openlrLineAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrLineAttributes }
     *     
     */
    public void setOpenlrLineAttributes(OpenlrLineAttributes value) {
        this.openlrLineAttributes = value;
    }

    /**
     * Gets the value of the _OpenlrBaseReferencePointExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OpenlrBaseReferencePointExtension() {
        return _OpenlrBaseReferencePointExtension;
    }

    /**
     * Sets the value of the _OpenlrBaseReferencePointExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OpenlrBaseReferencePointExtension(_ExtensionType value) {
        this._OpenlrBaseReferencePointExtension = value;
    }

}
