
package eu.datex.locationreferencing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for IsoNamedArea complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="IsoNamedArea"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/locationReferencing}NamedArea"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="subdivisionType" type="{http://datex2.eu/schema/3/locationReferencing}_SubdivisionTypeEnum"/&amp;gt;
 *         &amp;lt;element name="subdivisionCode" type="{http://datex2.eu/schema/3/locationReferencing}SubdivisionCode"/&amp;gt;
 *         &amp;lt;element name="_isoNamedAreaExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IsoNamedArea", propOrder = {
    "subdivisionType",
    "subdivisionCode",
    "_IsoNamedAreaExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class IsoNamedArea
    extends NamedArea
{

    @XmlElement(required = true)
    protected _SubdivisionTypeEnum subdivisionType;
    @XmlElement(required = true)
    protected String subdivisionCode;
    @XmlElement(name = "_isoNamedAreaExtension")
    protected _ExtensionType _IsoNamedAreaExtension;

    /**
     * Gets the value of the subdivisionType property.
     * 
     * @return
     *     possible object is
     *     {@link _SubdivisionTypeEnum }
     *     
     */
    public _SubdivisionTypeEnum getSubdivisionType() {
        return subdivisionType;
    }

    /**
     * Sets the value of the subdivisionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _SubdivisionTypeEnum }
     *     
     */
    public void setSubdivisionType(_SubdivisionTypeEnum value) {
        this.subdivisionType = value;
    }

    /**
     * Gets the value of the subdivisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubdivisionCode() {
        return subdivisionCode;
    }

    /**
     * Sets the value of the subdivisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubdivisionCode(String value) {
        this.subdivisionCode = value;
    }

    /**
     * Gets the value of the _IsoNamedAreaExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_IsoNamedAreaExtension() {
        return _IsoNamedAreaExtension;
    }

    /**
     * Sets the value of the _IsoNamedAreaExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_IsoNamedAreaExtension(_ExtensionType value) {
        this._IsoNamedAreaExtension = value;
    }

}
