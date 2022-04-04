
package eu.datex.commonextension;

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
 * &lt;p&gt;Java class for RegulatedCharacteristics complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RegulatedCharacteristics"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="euVehicleCategory" type="{http://datex2.eu/schema/3/commonExtension}_EuVehicleCategoryEnum" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="euSpecialPurposeVehicle" type="{http://datex2.eu/schema/3/commonExtension}_EuSpecialPurposeVehicleEnum" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="nationalSpecialPurposeVehicle" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_regulatedCharacteristicsExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulatedCharacteristics", propOrder = {
    "euVehicleCategories",
    "euSpecialPurposeVehicle",
    "nationalSpecialPurposeVehicle",
    "_RegulatedCharacteristicsExtension"
})
@ToString
@EqualsAndHashCode
public class RegulatedCharacteristics {

    @XmlElement(name = "euVehicleCategory")
    protected List<_EuVehicleCategoryEnum> euVehicleCategories;
    protected _EuSpecialPurposeVehicleEnum euSpecialPurposeVehicle;
    protected MultilingualString nationalSpecialPurposeVehicle;
    @XmlElement(name = "_regulatedCharacteristicsExtension")
    protected _ExtensionType _RegulatedCharacteristicsExtension;

    /**
     * Gets the value of the euVehicleCategories property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the euVehicleCategories property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getEuVehicleCategories().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link _EuVehicleCategoryEnum }
     * 
     * 
     */
    public List<_EuVehicleCategoryEnum> getEuVehicleCategories() {
        if (euVehicleCategories == null) {
            euVehicleCategories = new ArrayList<_EuVehicleCategoryEnum>();
        }
        return this.euVehicleCategories;
    }

    /**
     * Gets the value of the euSpecialPurposeVehicle property.
     * 
     * @return
     *     possible object is
     *     {@link _EuSpecialPurposeVehicleEnum }
     *     
     */
    public _EuSpecialPurposeVehicleEnum getEuSpecialPurposeVehicle() {
        return euSpecialPurposeVehicle;
    }

    /**
     * Sets the value of the euSpecialPurposeVehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link _EuSpecialPurposeVehicleEnum }
     *     
     */
    public void setEuSpecialPurposeVehicle(_EuSpecialPurposeVehicleEnum value) {
        this.euSpecialPurposeVehicle = value;
    }

    /**
     * Gets the value of the nationalSpecialPurposeVehicle property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getNationalSpecialPurposeVehicle() {
        return nationalSpecialPurposeVehicle;
    }

    /**
     * Sets the value of the nationalSpecialPurposeVehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setNationalSpecialPurposeVehicle(MultilingualString value) {
        this.nationalSpecialPurposeVehicle = value;
    }

    /**
     * Gets the value of the _RegulatedCharacteristicsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_RegulatedCharacteristicsExtension() {
        return _RegulatedCharacteristicsExtension;
    }

    /**
     * Sets the value of the _RegulatedCharacteristicsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_RegulatedCharacteristicsExtension(_ExtensionType value) {
        this._RegulatedCharacteristicsExtension = value;
    }

}
