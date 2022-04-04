
package eu.datex.facilities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for OperatingHours complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="OperatingHours"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="closureInformation" type="{http://datex2.eu/schema/3/facilities}ClosureInformation" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_operatingHoursExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingHours", propOrder = {
    "closureInformation",
    "_OperatingHoursExtension"
})
@XmlSeeAlso({
    OpenAllHours.class,
    OperatingHoursByReference.class,
    OperatingHoursSpecification.class,
    UndefinedOperatingHours.class,
    UnknownOperatingHours.class
})
@ToString
@EqualsAndHashCode
public abstract class OperatingHours {

    protected ClosureInformation closureInformation;
    @XmlElement(name = "_operatingHoursExtension")
    protected _ExtensionType _OperatingHoursExtension;

    /**
     * Gets the value of the closureInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ClosureInformation }
     *     
     */
    public ClosureInformation getClosureInformation() {
        return closureInformation;
    }

    /**
     * Sets the value of the closureInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosureInformation }
     *     
     */
    public void setClosureInformation(ClosureInformation value) {
        this.closureInformation = value;
    }

    /**
     * Gets the value of the _OperatingHoursExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OperatingHoursExtension() {
        return _OperatingHoursExtension;
    }

    /**
     * Sets the value of the _OperatingHoursExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OperatingHoursExtension(_ExtensionType value) {
        this._OperatingHoursExtension = value;
    }

}
