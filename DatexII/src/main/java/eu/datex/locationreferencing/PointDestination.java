
package eu.datex.locationreferencing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for PointDestination complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PointDestination"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/locationReferencing}Destination"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="pointLocation" type="{http://datex2.eu/schema/3/locationReferencing}PointLocation"/&amp;gt;
 *         &amp;lt;element name="_pointDestinationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointDestination", propOrder = {
    "pointLocation",
    "_PointDestinationExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class PointDestination
    extends Destination
{

    @XmlElement(required = true)
    protected PointLocation pointLocation;
    @XmlElement(name = "_pointDestinationExtension")
    protected _ExtensionType _PointDestinationExtension;

    /**
     * Gets the value of the pointLocation property.
     * 
     * @return
     *     possible object is
     *     {@link PointLocation }
     *     
     */
    public PointLocation getPointLocation() {
        return pointLocation;
    }

    /**
     * Sets the value of the pointLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointLocation }
     *     
     */
    public void setPointLocation(PointLocation value) {
        this.pointLocation = value;
    }

    /**
     * Gets the value of the _PointDestinationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_PointDestinationExtension() {
        return _PointDestinationExtension;
    }

    /**
     * Sets the value of the _PointDestinationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_PointDestinationExtension(_ExtensionType value) {
        this._PointDestinationExtension = value;
    }

}
