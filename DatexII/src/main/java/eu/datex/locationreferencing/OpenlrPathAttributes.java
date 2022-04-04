
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
 * &lt;p&gt;Java class for OpenlrPathAttributes complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="OpenlrPathAttributes"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="openlrLowestFrcToNextLRPoint" type="{http://datex2.eu/schema/3/locationReferencing}_OpenlrFunctionalRoadClassEnum"/&amp;gt;
 *         &amp;lt;element name="openlrDistanceToNextLRPoint" type="{http://datex2.eu/schema/3/common}NonNegativeInteger"/&amp;gt;
 *         &amp;lt;element name="_openlrPathAttributesExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrPathAttributes", propOrder = {
    "openlrLowestFrcToNextLRPoint",
    "openlrDistanceToNextLRPoint",
    "_OpenlrPathAttributesExtension"
})
@ToString
@EqualsAndHashCode
public class OpenlrPathAttributes {

    @XmlElement(required = true)
    protected _OpenlrFunctionalRoadClassEnum openlrLowestFrcToNextLRPoint;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Long openlrDistanceToNextLRPoint;
    @XmlElement(name = "_openlrPathAttributesExtension")
    protected _ExtensionType _OpenlrPathAttributesExtension;

    /**
     * Gets the value of the openlrLowestFrcToNextLRPoint property.
     * 
     * @return
     *     possible object is
     *     {@link _OpenlrFunctionalRoadClassEnum }
     *     
     */
    public _OpenlrFunctionalRoadClassEnum getOpenlrLowestFrcToNextLRPoint() {
        return openlrLowestFrcToNextLRPoint;
    }

    /**
     * Sets the value of the openlrLowestFrcToNextLRPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link _OpenlrFunctionalRoadClassEnum }
     *     
     */
    public void setOpenlrLowestFrcToNextLRPoint(_OpenlrFunctionalRoadClassEnum value) {
        this.openlrLowestFrcToNextLRPoint = value;
    }

    /**
     * Gets the value of the openlrDistanceToNextLRPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getOpenlrDistanceToNextLRPoint() {
        return openlrDistanceToNextLRPoint;
    }

    /**
     * Sets the value of the openlrDistanceToNextLRPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenlrDistanceToNextLRPoint(Long value) {
        this.openlrDistanceToNextLRPoint = value;
    }

    /**
     * Gets the value of the _OpenlrPathAttributesExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OpenlrPathAttributesExtension() {
        return _OpenlrPathAttributesExtension;
    }

    /**
     * Sets the value of the _OpenlrPathAttributesExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OpenlrPathAttributesExtension(_ExtensionType value) {
        this._OpenlrPathAttributesExtension = value;
    }

}
