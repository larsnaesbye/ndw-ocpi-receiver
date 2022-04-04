
package eu.datex.locationreferencing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for OpenlrLocationReferencePoint complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="OpenlrLocationReferencePoint"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/locationReferencing}OpenlrBaseReferencePoint"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="openlrPathAttributes" type="{http://datex2.eu/schema/3/locationReferencing}OpenlrPathAttributes"/&amp;gt;
 *         &amp;lt;element name="_openlrLocationReferencePointExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrLocationReferencePoint", propOrder = {
    "openlrPathAttributes",
    "_OpenlrLocationReferencePointExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class OpenlrLocationReferencePoint
    extends OpenlrBaseReferencePoint
{

    @XmlElement(required = true)
    protected OpenlrPathAttributes openlrPathAttributes;
    @XmlElement(name = "_openlrLocationReferencePointExtension")
    protected _ExtensionType _OpenlrLocationReferencePointExtension;

    /**
     * Gets the value of the openlrPathAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrPathAttributes }
     *     
     */
    public OpenlrPathAttributes getOpenlrPathAttributes() {
        return openlrPathAttributes;
    }

    /**
     * Sets the value of the openlrPathAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrPathAttributes }
     *     
     */
    public void setOpenlrPathAttributes(OpenlrPathAttributes value) {
        this.openlrPathAttributes = value;
    }

    /**
     * Gets the value of the _OpenlrLocationReferencePointExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OpenlrLocationReferencePointExtension() {
        return _OpenlrLocationReferencePointExtension;
    }

    /**
     * Sets the value of the _OpenlrLocationReferencePointExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OpenlrLocationReferencePointExtension(_ExtensionType value) {
        this._OpenlrLocationReferencePointExtension = value;
    }

}
