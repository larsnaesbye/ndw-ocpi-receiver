
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
 * &lt;p&gt;Java class for DirectionBearingValue complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="DirectionBearingValue"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="directionBearing" type="{http://datex2.eu/schema/3/common}AngleInDegrees"/&amp;gt;
 *         &amp;lt;element name="_directionBearingValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectionBearingValue", propOrder = {
    "directionBearing",
    "_DirectionBearingValueExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class DirectionBearingValue
    extends DataValue
{

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Long directionBearing;
    @XmlElement(name = "_directionBearingValueExtension")
    protected _ExtensionType _DirectionBearingValueExtension;

    /**
     * Gets the value of the directionBearing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getDirectionBearing() {
        return directionBearing;
    }

    /**
     * Sets the value of the directionBearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectionBearing(Long value) {
        this.directionBearing = value;
    }

    /**
     * Gets the value of the _DirectionBearingValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_DirectionBearingValueExtension() {
        return _DirectionBearingValueExtension;
    }

    /**
     * Sets the value of the _DirectionBearingValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_DirectionBearingValueExtension(_ExtensionType value) {
        this._DirectionBearingValueExtension = value;
    }

}
