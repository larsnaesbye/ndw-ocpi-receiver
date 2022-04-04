
package eu.datex.locationextension;

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
 * &lt;p&gt;Java class for Address complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Address"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="postcode" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="city" type="{http://datex2.eu/schema/3/common}MultilingualString"/&amp;gt;
 *         &amp;lt;element name="countryCode" type="{http://datex2.eu/schema/3/common}CountryCode"/&amp;gt;
 *         &amp;lt;element name="addressLine" type="{http://datex2.eu/schema/3/locationExtension}AddressLine" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_addressExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
    "postcode",
    "city",
    "countryCode",
    "addressLines",
    "_AddressExtension"
})
@ToString
@EqualsAndHashCode
public class Address {

    protected String postcode;
    @XmlElement(required = true)
    protected MultilingualString city;
    @XmlElement(required = true)
    protected String countryCode;
    @XmlElement(name = "addressLine")
    protected List<AddressLine> addressLines;
    @XmlElement(name = "_addressExtension")
    protected _ExtensionType _AddressExtension;

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setCity(MultilingualString value) {
        this.city = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the addressLines property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the addressLines property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAddressLines().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link AddressLine }
     * 
     * 
     */
    public List<AddressLine> getAddressLines() {
        if (addressLines == null) {
            addressLines = new ArrayList<AddressLine>();
        }
        return this.addressLines;
    }

    /**
     * Gets the value of the _AddressExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_AddressExtension() {
        return _AddressExtension;
    }

    /**
     * Sets the value of the _AddressExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_AddressExtension(_ExtensionType value) {
        this._AddressExtension = value;
    }

}
