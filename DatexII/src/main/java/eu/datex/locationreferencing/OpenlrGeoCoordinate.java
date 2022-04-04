
package eu.datex.locationreferencing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for OpenlrGeoCoordinate complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="OpenlrGeoCoordinate"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/locationReferencing}OpenlrPointLocationReference"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="_openlrGeoCoordinateExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrGeoCoordinate", propOrder = {
    "_OpenlrGeoCoordinateExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class OpenlrGeoCoordinate
    extends OpenlrPointLocationReference
{

    @XmlElement(name = "_openlrGeoCoordinateExtension")
    protected _ExtensionType _OpenlrGeoCoordinateExtension;

    /**
     * Gets the value of the _OpenlrGeoCoordinateExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OpenlrGeoCoordinateExtension() {
        return _OpenlrGeoCoordinateExtension;
    }

    /**
     * Sets the value of the _OpenlrGeoCoordinateExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OpenlrGeoCoordinateExtension(_ExtensionType value) {
        this._OpenlrGeoCoordinateExtension = value;
    }

}
