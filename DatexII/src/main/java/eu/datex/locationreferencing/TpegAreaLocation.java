
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
 * &lt;p&gt;Java class for TpegAreaLocation complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="TpegAreaLocation"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="tpegAreaLocationType" type="{http://datex2.eu/schema/3/locationReferencing}_TpegLoc01AreaLocationSubtypeEnum"/&amp;gt;
 *         &amp;lt;element name="tpegHeight" type="{http://datex2.eu/schema/3/locationReferencing}TpegHeight" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_tpegAreaLocationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegAreaLocation", propOrder = {
    "tpegAreaLocationType",
    "tpegHeight",
    "_TpegAreaLocationExtension"
})
@XmlSeeAlso({
    TpegGeometricArea.class,
    TpegNamedOnlyArea.class
})
@ToString
@EqualsAndHashCode
public abstract class TpegAreaLocation {

    @XmlElement(required = true)
    protected _TpegLoc01AreaLocationSubtypeEnum tpegAreaLocationType;
    protected TpegHeight tpegHeight;
    @XmlElement(name = "_tpegAreaLocationExtension")
    protected _ExtensionType _TpegAreaLocationExtension;

    /**
     * Gets the value of the tpegAreaLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link _TpegLoc01AreaLocationSubtypeEnum }
     *     
     */
    public _TpegLoc01AreaLocationSubtypeEnum getTpegAreaLocationType() {
        return tpegAreaLocationType;
    }

    /**
     * Sets the value of the tpegAreaLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _TpegLoc01AreaLocationSubtypeEnum }
     *     
     */
    public void setTpegAreaLocationType(_TpegLoc01AreaLocationSubtypeEnum value) {
        this.tpegAreaLocationType = value;
    }

    /**
     * Gets the value of the tpegHeight property.
     * 
     * @return
     *     possible object is
     *     {@link TpegHeight }
     *     
     */
    public TpegHeight getTpegHeight() {
        return tpegHeight;
    }

    /**
     * Sets the value of the tpegHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegHeight }
     *     
     */
    public void setTpegHeight(TpegHeight value) {
        this.tpegHeight = value;
    }

    /**
     * Gets the value of the _TpegAreaLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TpegAreaLocationExtension() {
        return _TpegAreaLocationExtension;
    }

    /**
     * Sets the value of the _TpegAreaLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TpegAreaLocationExtension(_ExtensionType value) {
        this._TpegAreaLocationExtension = value;
    }

}
