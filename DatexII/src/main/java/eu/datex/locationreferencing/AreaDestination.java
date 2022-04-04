
package eu.datex.locationreferencing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for AreaDestination complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AreaDestination"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/locationReferencing}Destination"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="areaLocation" type="{http://datex2.eu/schema/3/locationReferencing}AreaLocation"/&amp;gt;
 *         &amp;lt;element name="_areaDestinationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AreaDestination", propOrder = {
    "areaLocation",
    "_AreaDestinationExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class AreaDestination
    extends Destination
{

    @XmlElement(required = true)
    protected AreaLocation areaLocation;
    @XmlElement(name = "_areaDestinationExtension")
    protected _ExtensionType _AreaDestinationExtension;

    /**
     * Gets the value of the areaLocation property.
     * 
     * @return
     *     possible object is
     *     {@link AreaLocation }
     *     
     */
    public AreaLocation getAreaLocation() {
        return areaLocation;
    }

    /**
     * Sets the value of the areaLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaLocation }
     *     
     */
    public void setAreaLocation(AreaLocation value) {
        this.areaLocation = value;
    }

    /**
     * Gets the value of the _AreaDestinationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_AreaDestinationExtension() {
        return _AreaDestinationExtension;
    }

    /**
     * Sets the value of the _AreaDestinationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_AreaDestinationExtension(_ExtensionType value) {
        this._AreaDestinationExtension = value;
    }

}
