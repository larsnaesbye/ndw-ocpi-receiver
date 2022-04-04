
package eu.datex.locationreferencing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.datex.common.MultilingualString;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.w3._2001.xmlschema.Adapter2;


/**
 * &lt;p&gt;Java class for AlertCLocation complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AlertCLocation"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="alertCLocationName" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="specificLocation" type="{http://datex2.eu/schema/3/locationReferencing}AlertCLocationCode"/&amp;gt;
 *         &amp;lt;element name="_alertCLocationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCLocation", propOrder = {
    "alertCLocationName",
    "specificLocation",
    "_AlertCLocationExtension"
})
@ToString
@EqualsAndHashCode
public class AlertCLocation {

    protected MultilingualString alertCLocationName;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Long specificLocation;
    @XmlElement(name = "_alertCLocationExtension")
    protected _ExtensionType _AlertCLocationExtension;

    /**
     * Gets the value of the alertCLocationName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getAlertCLocationName() {
        return alertCLocationName;
    }

    /**
     * Sets the value of the alertCLocationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setAlertCLocationName(MultilingualString value) {
        this.alertCLocationName = value;
    }

    /**
     * Gets the value of the specificLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getSpecificLocation() {
        return specificLocation;
    }

    /**
     * Sets the value of the specificLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificLocation(Long value) {
        this.specificLocation = value;
    }

    /**
     * Gets the value of the _AlertCLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_AlertCLocationExtension() {
        return _AlertCLocationExtension;
    }

    /**
     * Sets the value of the _AlertCLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_AlertCLocationExtension(_ExtensionType value) {
        this._AlertCLocationExtension = value;
    }

}
