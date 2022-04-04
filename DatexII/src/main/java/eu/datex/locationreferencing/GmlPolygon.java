
package eu.datex.locationreferencing;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for GmlPolygon complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="GmlPolygon"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="exterior" type="{http://datex2.eu/schema/3/locationReferencing}GmlLinearRing"/&amp;gt;
 *         &amp;lt;element name="interior" type="{http://datex2.eu/schema/3/locationReferencing}GmlLinearRing" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_gmlPolygonExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GmlPolygon", propOrder = {
    "exterior",
    "interiors",
    "_GmlPolygonExtension"
})
@ToString
@EqualsAndHashCode
public class GmlPolygon {

    @XmlElement(required = true)
    protected GmlLinearRing exterior;
    @XmlElement(name = "interior")
    protected List<GmlLinearRing> interiors;
    @XmlElement(name = "_gmlPolygonExtension")
    protected _ExtensionType _GmlPolygonExtension;

    /**
     * Gets the value of the exterior property.
     * 
     * @return
     *     possible object is
     *     {@link GmlLinearRing }
     *     
     */
    public GmlLinearRing getExterior() {
        return exterior;
    }

    /**
     * Sets the value of the exterior property.
     * 
     * @param value
     *     allowed object is
     *     {@link GmlLinearRing }
     *     
     */
    public void setExterior(GmlLinearRing value) {
        this.exterior = value;
    }

    /**
     * Gets the value of the interiors property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the interiors property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getInteriors().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link GmlLinearRing }
     * 
     * 
     */
    public List<GmlLinearRing> getInteriors() {
        if (interiors == null) {
            interiors = new ArrayList<GmlLinearRing>();
        }
        return this.interiors;
    }

    /**
     * Gets the value of the _GmlPolygonExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_GmlPolygonExtension() {
        return _GmlPolygonExtension;
    }

    /**
     * Sets the value of the _GmlPolygonExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_GmlPolygonExtension(_ExtensionType value) {
        this._GmlPolygonExtension = value;
    }

}
