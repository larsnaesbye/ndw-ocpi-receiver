
package eu.datex.locationreferencing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common.MultilingualString;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for NamedArea complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="NamedArea"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="areaName" type="{http://datex2.eu/schema/3/common}MultilingualString"/&amp;gt;
 *         &amp;lt;element name="namedAreaType" type="{http://datex2.eu/schema/3/locationReferencing}_NamedAreaTypeEnum" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="country" type="{http://datex2.eu/schema/3/common}CountryCode" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_namedAreaExtension" type="{http://datex2.eu/schema/3/locationReferencing}_NamedAreaExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NamedArea", propOrder = {
    "areaName",
    "namedAreaType",
    "country",
    "_NamedAreaExtension"
})
@XmlSeeAlso({
    IsoNamedArea.class,
    NutsNamedArea.class
})
@ToString
@EqualsAndHashCode
public class NamedArea {

    @XmlElement(required = true)
    protected MultilingualString areaName;
    protected _NamedAreaTypeEnum namedAreaType;
    protected String country;
    @XmlElement(name = "_namedAreaExtension")
    protected _NamedAreaExtensionType _NamedAreaExtension;

    /**
     * Gets the value of the areaName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getAreaName() {
        return areaName;
    }

    /**
     * Sets the value of the areaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setAreaName(MultilingualString value) {
        this.areaName = value;
    }

    /**
     * Gets the value of the namedAreaType property.
     * 
     * @return
     *     possible object is
     *     {@link _NamedAreaTypeEnum }
     *     
     */
    public _NamedAreaTypeEnum getNamedAreaType() {
        return namedAreaType;
    }

    /**
     * Sets the value of the namedAreaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _NamedAreaTypeEnum }
     *     
     */
    public void setNamedAreaType(_NamedAreaTypeEnum value) {
        this.namedAreaType = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the _NamedAreaExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _NamedAreaExtensionType }
     *     
     */
    public _NamedAreaExtensionType get_NamedAreaExtension() {
        return _NamedAreaExtension;
    }

    /**
     * Sets the value of the _NamedAreaExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _NamedAreaExtensionType }
     *     
     */
    public void set_NamedAreaExtension(_NamedAreaExtensionType value) {
        this._NamedAreaExtension = value;
    }

}
