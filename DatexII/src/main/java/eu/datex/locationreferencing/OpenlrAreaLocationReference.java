
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
 * &lt;p&gt;Java class for OpenlrAreaLocationReference complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="OpenlrAreaLocationReference"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="_openlrAreaLocationReferenceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrAreaLocationReference", propOrder = {
    "_OpenlrAreaLocationReferenceExtension"
})
@XmlSeeAlso({
    OpenlrCircleLocationReference.class,
    OpenlrClosedLineLocationReference.class,
    OpenlrGridLocationReference.class,
    OpenlrPolygonLocationReference.class,
    OpenlrRectangleLocationReference.class
})
@ToString
@EqualsAndHashCode
public abstract class OpenlrAreaLocationReference {

    @XmlElement(name = "_openlrAreaLocationReferenceExtension")
    protected _ExtensionType _OpenlrAreaLocationReferenceExtension;

    /**
     * Gets the value of the _OpenlrAreaLocationReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OpenlrAreaLocationReferenceExtension() {
        return _OpenlrAreaLocationReferenceExtension;
    }

    /**
     * Sets the value of the _OpenlrAreaLocationReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OpenlrAreaLocationReferenceExtension(_ExtensionType value) {
        this._OpenlrAreaLocationReferenceExtension = value;
    }

}
