
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
 * &lt;p&gt;Java class for OpenlrCircleLocationReference complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="OpenlrCircleLocationReference"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/locationReferencing}OpenlrAreaLocationReference"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="openlrRadius" type="{http://datex2.eu/schema/3/common}MetresAsNonNegativeInteger"/&amp;gt;
 *         &amp;lt;element name="openlrGeoCoordinate" type="{http://datex2.eu/schema/3/locationReferencing}OpenlrGeoCoordinate"/&amp;gt;
 *         &amp;lt;element name="_openlrCircleLocationReferenceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrCircleLocationReference", propOrder = {
    "openlrRadius",
    "openlrGeoCoordinate",
    "_OpenlrCircleLocationReferenceExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class OpenlrCircleLocationReference
    extends OpenlrAreaLocationReference
{

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Long openlrRadius;
    @XmlElement(required = true)
    protected OpenlrGeoCoordinate openlrGeoCoordinate;
    @XmlElement(name = "_openlrCircleLocationReferenceExtension")
    protected _ExtensionType _OpenlrCircleLocationReferenceExtension;

    /**
     * Gets the value of the openlrRadius property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getOpenlrRadius() {
        return openlrRadius;
    }

    /**
     * Sets the value of the openlrRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenlrRadius(Long value) {
        this.openlrRadius = value;
    }

    /**
     * Gets the value of the openlrGeoCoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrGeoCoordinate }
     *     
     */
    public OpenlrGeoCoordinate getOpenlrGeoCoordinate() {
        return openlrGeoCoordinate;
    }

    /**
     * Sets the value of the openlrGeoCoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrGeoCoordinate }
     *     
     */
    public void setOpenlrGeoCoordinate(OpenlrGeoCoordinate value) {
        this.openlrGeoCoordinate = value;
    }

    /**
     * Gets the value of the _OpenlrCircleLocationReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OpenlrCircleLocationReferenceExtension() {
        return _OpenlrCircleLocationReferenceExtension;
    }

    /**
     * Sets the value of the _OpenlrCircleLocationReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OpenlrCircleLocationReferenceExtension(_ExtensionType value) {
        this._OpenlrCircleLocationReferenceExtension = value;
    }

}
