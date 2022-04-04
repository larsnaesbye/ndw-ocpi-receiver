
package eu.datex.locationreferencing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for PointLocation complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PointLocation"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/locationReferencing}NetworkLocation"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="pointByCoordinates" type="{http://datex2.eu/schema/3/locationReferencing}PointByCoordinates" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_pointLocationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointLocation", propOrder = {
    "pointByCoordinates",
    "_PointLocationExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class PointLocation
    extends NetworkLocation
{

    protected PointByCoordinates pointByCoordinates;
    @XmlElement(name = "_pointLocationExtension")
    protected _ExtensionType _PointLocationExtension;

    /**
     * Gets the value of the pointByCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link PointByCoordinates }
     *     
     */
    public PointByCoordinates getPointByCoordinates() {
        return pointByCoordinates;
    }

    /**
     * Sets the value of the pointByCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointByCoordinates }
     *     
     */
    public void setPointByCoordinates(PointByCoordinates value) {
        this.pointByCoordinates = value;
    }

    /**
     * Gets the value of the _PointLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_PointLocationExtension() {
        return _PointLocationExtension;
    }

    /**
     * Sets the value of the _PointLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_PointLocationExtension(_ExtensionType value) {
        this._PointLocationExtension = value;
    }

}
