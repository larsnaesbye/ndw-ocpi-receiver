
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
 * &lt;p&gt;Java class for OpenlrLineAttributes complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="OpenlrLineAttributes"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="openlrFunctionalRoadClass" type="{http://datex2.eu/schema/3/locationReferencing}_OpenlrFunctionalRoadClassEnum"/&amp;gt;
 *         &amp;lt;element name="openlrFormOfWay" type="{http://datex2.eu/schema/3/locationReferencing}_OpenlrFormOfWayEnum"/&amp;gt;
 *         &amp;lt;element name="openlrBearing" type="{http://datex2.eu/schema/3/common}AngleInDegrees"/&amp;gt;
 *         &amp;lt;element name="_openlrLineAttributesExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrLineAttributes", propOrder = {
    "openlrFunctionalRoadClass",
    "openlrFormOfWay",
    "openlrBearing",
    "_OpenlrLineAttributesExtension"
})
@ToString
@EqualsAndHashCode
public class OpenlrLineAttributes {

    @XmlElement(required = true)
    protected _OpenlrFunctionalRoadClassEnum openlrFunctionalRoadClass;
    @XmlElement(required = true)
    protected _OpenlrFormOfWayEnum openlrFormOfWay;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Long openlrBearing;
    @XmlElement(name = "_openlrLineAttributesExtension")
    protected _ExtensionType _OpenlrLineAttributesExtension;

    /**
     * Gets the value of the openlrFunctionalRoadClass property.
     * 
     * @return
     *     possible object is
     *     {@link _OpenlrFunctionalRoadClassEnum }
     *     
     */
    public _OpenlrFunctionalRoadClassEnum getOpenlrFunctionalRoadClass() {
        return openlrFunctionalRoadClass;
    }

    /**
     * Sets the value of the openlrFunctionalRoadClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link _OpenlrFunctionalRoadClassEnum }
     *     
     */
    public void setOpenlrFunctionalRoadClass(_OpenlrFunctionalRoadClassEnum value) {
        this.openlrFunctionalRoadClass = value;
    }

    /**
     * Gets the value of the openlrFormOfWay property.
     * 
     * @return
     *     possible object is
     *     {@link _OpenlrFormOfWayEnum }
     *     
     */
    public _OpenlrFormOfWayEnum getOpenlrFormOfWay() {
        return openlrFormOfWay;
    }

    /**
     * Sets the value of the openlrFormOfWay property.
     * 
     * @param value
     *     allowed object is
     *     {@link _OpenlrFormOfWayEnum }
     *     
     */
    public void setOpenlrFormOfWay(_OpenlrFormOfWayEnum value) {
        this.openlrFormOfWay = value;
    }

    /**
     * Gets the value of the openlrBearing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getOpenlrBearing() {
        return openlrBearing;
    }

    /**
     * Sets the value of the openlrBearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenlrBearing(Long value) {
        this.openlrBearing = value;
    }

    /**
     * Gets the value of the _OpenlrLineAttributesExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OpenlrLineAttributesExtension() {
        return _OpenlrLineAttributesExtension;
    }

    /**
     * Sets the value of the _OpenlrLineAttributesExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OpenlrLineAttributesExtension(_ExtensionType value) {
        this._OpenlrLineAttributesExtension = value;
    }

}
