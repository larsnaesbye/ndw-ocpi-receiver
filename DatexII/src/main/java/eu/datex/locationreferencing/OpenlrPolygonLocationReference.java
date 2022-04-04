
package eu.datex.locationreferencing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for OpenlrPolygonLocationReference complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="OpenlrPolygonLocationReference"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/locationReferencing}OpenlrAreaLocationReference"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="openlrPolygonCorners" type="{http://datex2.eu/schema/3/locationReferencing}OpenlrPolygonCorners"/&amp;gt;
 *         &amp;lt;element name="_openlrPolygonLocationReferenceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrPolygonLocationReference", propOrder = {
    "openlrPolygonCorners",
    "_OpenlrPolygonLocationReferenceExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class OpenlrPolygonLocationReference
    extends OpenlrAreaLocationReference
{

    @XmlElement(required = true)
    protected OpenlrPolygonCorners openlrPolygonCorners;
    @XmlElement(name = "_openlrPolygonLocationReferenceExtension")
    protected _ExtensionType _OpenlrPolygonLocationReferenceExtension;

    /**
     * Gets the value of the openlrPolygonCorners property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrPolygonCorners }
     *     
     */
    public OpenlrPolygonCorners getOpenlrPolygonCorners() {
        return openlrPolygonCorners;
    }

    /**
     * Sets the value of the openlrPolygonCorners property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrPolygonCorners }
     *     
     */
    public void setOpenlrPolygonCorners(OpenlrPolygonCorners value) {
        this.openlrPolygonCorners = value;
    }

    /**
     * Gets the value of the _OpenlrPolygonLocationReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OpenlrPolygonLocationReferenceExtension() {
        return _OpenlrPolygonLocationReferenceExtension;
    }

    /**
     * Sets the value of the _OpenlrPolygonLocationReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OpenlrPolygonLocationReferenceExtension(_ExtensionType value) {
        this._OpenlrPolygonLocationReferenceExtension = value;
    }

}
