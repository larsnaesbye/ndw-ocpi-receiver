
package eu.datex.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.w3._2001.xmlschema.Adapter2;


/**
 * &lt;p&gt;Java class for AxleSpacing complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AxleSpacing"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="axleSpacing" type="{http://datex2.eu/schema/3/common}MetresAsFloat"/&amp;gt;
 *         &amp;lt;element name="axleSpacingSequenceIdentifier" type="{http://datex2.eu/schema/3/common}NonNegativeInteger"/&amp;gt;
 *         &amp;lt;element name="_axleSpacingExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AxleSpacing", propOrder = {
    "axleSpacing",
    "axleSpacingSequenceIdentifier",
    "_AxleSpacingExtension"
})
@ToString
@EqualsAndHashCode
public class AxleSpacing {

    protected float axleSpacing;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Long axleSpacingSequenceIdentifier;
    @XmlElement(name = "_axleSpacingExtension")
    protected _ExtensionType _AxleSpacingExtension;

    /**
     * Gets the value of the axleSpacing property.
     * 
     */
    public float getAxleSpacing() {
        return axleSpacing;
    }

    /**
     * Sets the value of the axleSpacing property.
     * 
     */
    public void setAxleSpacing(float value) {
        this.axleSpacing = value;
    }

    /**
     * Gets the value of the axleSpacingSequenceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getAxleSpacingSequenceIdentifier() {
        return axleSpacingSequenceIdentifier;
    }

    /**
     * Sets the value of the axleSpacingSequenceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAxleSpacingSequenceIdentifier(Long value) {
        this.axleSpacingSequenceIdentifier = value;
    }

    /**
     * Gets the value of the _AxleSpacingExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_AxleSpacingExtension() {
        return _AxleSpacingExtension;
    }

    /**
     * Sets the value of the _AxleSpacingExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_AxleSpacingExtension(_ExtensionType value) {
        this._AxleSpacingExtension = value;
    }

}
