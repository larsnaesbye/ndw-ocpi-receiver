
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
 * &lt;p&gt;Java class for OpenlrPolygonCorners complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="OpenlrPolygonCorners"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="openlrCoordinates" type="{http://datex2.eu/schema/3/locationReferencing}PointCoordinates" maxOccurs="unbounded" minOccurs="3"/&amp;gt;
 *         &amp;lt;element name="_openlrPolygonCornersExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrPolygonCorners", propOrder = {
    "openlrCoordinates",
    "_OpenlrPolygonCornersExtension"
})
@ToString
@EqualsAndHashCode
public class OpenlrPolygonCorners {

    @XmlElement(required = true)
    protected List<PointCoordinates> openlrCoordinates;
    @XmlElement(name = "_openlrPolygonCornersExtension")
    protected _ExtensionType _OpenlrPolygonCornersExtension;

    /**
     * Gets the value of the openlrCoordinates property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the openlrCoordinates property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getOpenlrCoordinates().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link PointCoordinates }
     * 
     * 
     */
    public List<PointCoordinates> getOpenlrCoordinates() {
        if (openlrCoordinates == null) {
            openlrCoordinates = new ArrayList<PointCoordinates>();
        }
        return this.openlrCoordinates;
    }

    /**
     * Gets the value of the _OpenlrPolygonCornersExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OpenlrPolygonCornersExtension() {
        return _OpenlrPolygonCornersExtension;
    }

    /**
     * Sets the value of the _OpenlrPolygonCornersExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OpenlrPolygonCornersExtension(_ExtensionType value) {
        this._OpenlrPolygonCornersExtension = value;
    }

}
