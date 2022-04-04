
package eu.datex.locationreferencing;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common.MultilingualString;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for GmlMultiPolygon complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="GmlMultiPolygon"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="gmlAreaName" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="gmlPolygon" type="{http://datex2.eu/schema/3/locationReferencing}GmlPolygon" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element name="_gmlMultiPolygonExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GmlMultiPolygon", propOrder = {
    "gmlAreaName",
    "gmlPolygons",
    "_GmlMultiPolygonExtension"
})
@ToString
@EqualsAndHashCode
public class GmlMultiPolygon {

    protected MultilingualString gmlAreaName;
    @XmlElement(name = "gmlPolygon", required = true)
    protected List<GmlPolygon> gmlPolygons;
    @XmlElement(name = "_gmlMultiPolygonExtension")
    protected _ExtensionType _GmlMultiPolygonExtension;

    /**
     * Gets the value of the gmlAreaName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getGmlAreaName() {
        return gmlAreaName;
    }

    /**
     * Sets the value of the gmlAreaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setGmlAreaName(MultilingualString value) {
        this.gmlAreaName = value;
    }

    /**
     * Gets the value of the gmlPolygons property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the gmlPolygons property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getGmlPolygons().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link GmlPolygon }
     * 
     * 
     */
    public List<GmlPolygon> getGmlPolygons() {
        if (gmlPolygons == null) {
            gmlPolygons = new ArrayList<GmlPolygon>();
        }
        return this.gmlPolygons;
    }

    /**
     * Gets the value of the _GmlMultiPolygonExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_GmlMultiPolygonExtension() {
        return _GmlMultiPolygonExtension;
    }

    /**
     * Sets the value of the _GmlMultiPolygonExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_GmlMultiPolygonExtension(_ExtensionType value) {
        this._GmlMultiPolygonExtension = value;
    }

}
