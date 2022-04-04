
package eu.datex.facilities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common.MultilingualString;
import eu.datex.common._ExtensionType;
import eu.datex.locationreferencing.LocationReference;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for OrganisationUnit complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="OrganisationUnit"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="name" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="function" type="{http://datex2.eu/schema/3/common}MultilingualString" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="locationReference" type="{http://datex2.eu/schema/3/locationReferencing}LocationReference" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="contactInformation" type="{http://datex2.eu/schema/3/facilities}ContactInformation" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="operatingHours" type="{http://datex2.eu/schema/3/facilities}OperatingHours" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_organisationUnitExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationUnit", propOrder = {
    "name",
    "functions",
    "locationReference",
    "contactInformations",
    "operatingHours",
    "_OrganisationUnitExtension"
})
@ToString
@EqualsAndHashCode
public class OrganisationUnit {

    protected MultilingualString name;
    @XmlElement(name = "function")
    protected List<MultilingualString> functions;
    protected LocationReference locationReference;
    @XmlElement(name = "contactInformation")
    protected List<ContactInformation> contactInformations;
    protected OperatingHours operatingHours;
    @XmlElement(name = "_organisationUnitExtension")
    protected _ExtensionType _OrganisationUnitExtension;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setName(MultilingualString value) {
        this.name = value;
    }

    /**
     * Gets the value of the functions property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the functions property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getFunctions().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link MultilingualString }
     * 
     * 
     */
    public List<MultilingualString> getFunctions() {
        if (functions == null) {
            functions = new ArrayList<MultilingualString>();
        }
        return this.functions;
    }

    /**
     * Gets the value of the locationReference property.
     * 
     * @return
     *     possible object is
     *     {@link LocationReference }
     *     
     */
    public LocationReference getLocationReference() {
        return locationReference;
    }

    /**
     * Sets the value of the locationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationReference }
     *     
     */
    public void setLocationReference(LocationReference value) {
        this.locationReference = value;
    }

    /**
     * Gets the value of the contactInformations property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the contactInformations property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getContactInformations().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInformation }
     * 
     * 
     */
    public List<ContactInformation> getContactInformations() {
        if (contactInformations == null) {
            contactInformations = new ArrayList<ContactInformation>();
        }
        return this.contactInformations;
    }

    /**
     * Gets the value of the operatingHours property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingHours }
     *     
     */
    public OperatingHours getOperatingHours() {
        return operatingHours;
    }

    /**
     * Sets the value of the operatingHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingHours }
     *     
     */
    public void setOperatingHours(OperatingHours value) {
        this.operatingHours = value;
    }

    /**
     * Gets the value of the _OrganisationUnitExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OrganisationUnitExtension() {
        return _OrganisationUnitExtension;
    }

    /**
     * Sets the value of the _OrganisationUnitExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OrganisationUnitExtension(_ExtensionType value) {
        this._OrganisationUnitExtension = value;
    }

}
