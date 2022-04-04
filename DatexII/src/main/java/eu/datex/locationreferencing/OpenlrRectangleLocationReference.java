
package eu.datex.locationreferencing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for OpenlrRectangleLocationReference complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="OpenlrRectangleLocationReference"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/locationReferencing}OpenlrAreaLocationReference"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="openlrRectangle" type="{http://datex2.eu/schema/3/locationReferencing}OpenlrRectangle"/&amp;gt;
 *         &amp;lt;element name="_openlrRectangleLocationReferenceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrRectangleLocationReference", propOrder = {
    "openlrRectangle",
    "_OpenlrRectangleLocationReferenceExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class OpenlrRectangleLocationReference
    extends OpenlrAreaLocationReference
{

    @XmlElement(required = true)
    protected OpenlrRectangle openlrRectangle;
    @XmlElement(name = "_openlrRectangleLocationReferenceExtension")
    protected _ExtensionType _OpenlrRectangleLocationReferenceExtension;

    /**
     * Gets the value of the openlrRectangle property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrRectangle }
     *     
     */
    public OpenlrRectangle getOpenlrRectangle() {
        return openlrRectangle;
    }

    /**
     * Sets the value of the openlrRectangle property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrRectangle }
     *     
     */
    public void setOpenlrRectangle(OpenlrRectangle value) {
        this.openlrRectangle = value;
    }

    /**
     * Gets the value of the _OpenlrRectangleLocationReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OpenlrRectangleLocationReferenceExtension() {
        return _OpenlrRectangleLocationReferenceExtension;
    }

    /**
     * Sets the value of the _OpenlrRectangleLocationReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OpenlrRectangleLocationReferenceExtension(_ExtensionType value) {
        this._OpenlrRectangleLocationReferenceExtension = value;
    }

}
