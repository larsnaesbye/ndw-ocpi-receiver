
package eu.datex.facilities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common.MultilingualString;
import eu.datex.common.VehicleCharacteristics;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for Qualification complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Qualification"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="withReservation" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="propulsionEnergyType" type="{http://datex2.eu/schema/3/facilities}_EnergySourceEnum" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="noFeeToUse" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="withMembership" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="membershipName" type="{http://datex2.eu/schema/3/common}MultilingualString" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="memberOfOtherRateTable" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="rateTableMember" type="{http://datex2.eu/schema/3/facilities}_RateTableVersionedReference" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="activeAssignedRight" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="paymentMethod" type="{http://datex2.eu/schema/3/facilities}PaymentMethod" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="vehicleCharacteristics" type="{http://datex2.eu/schema/3/common}VehicleCharacteristics" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="userQualification" type="{http://datex2.eu/schema/3/facilities}UserQualification" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_qualificationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Qualification", propOrder = {
    "withReservation",
    "propulsionEnergyTypes",
    "noFeeToUse",
    "withMembership",
    "membershipNames",
    "memberOfOtherRateTable",
    "rateTableMembers",
    "activeAssignedRight",
    "paymentMethods",
    "vehicleCharacteristics",
    "userQualifications",
    "_QualificationExtension"
})
@ToString
@EqualsAndHashCode
public class Qualification {

    protected Boolean withReservation;
    @XmlElement(name = "propulsionEnergyType")
    protected List<_EnergySourceEnum> propulsionEnergyTypes;
    protected Boolean noFeeToUse;
    protected Boolean withMembership;
    @XmlElement(name = "membershipName")
    protected List<MultilingualString> membershipNames;
    protected Boolean memberOfOtherRateTable;
    @XmlElement(name = "rateTableMember")
    protected List<_RateTableVersionedReference> rateTableMembers;
    protected String activeAssignedRight;
    @XmlElement(name = "paymentMethod")
    protected List<PaymentMethod> paymentMethods;
    protected List<VehicleCharacteristics> vehicleCharacteristics;
    @XmlElement(name = "userQualification")
    protected List<UserQualification> userQualifications;
    @XmlElement(name = "_qualificationExtension")
    protected _ExtensionType _QualificationExtension;

    /**
     * Gets the value of the withReservation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithReservation() {
        return withReservation;
    }

    /**
     * Sets the value of the withReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithReservation(Boolean value) {
        this.withReservation = value;
    }

    /**
     * Gets the value of the propulsionEnergyTypes property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the propulsionEnergyTypes property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getPropulsionEnergyTypes().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link _EnergySourceEnum }
     * 
     * 
     */
    public List<_EnergySourceEnum> getPropulsionEnergyTypes() {
        if (propulsionEnergyTypes == null) {
            propulsionEnergyTypes = new ArrayList<_EnergySourceEnum>();
        }
        return this.propulsionEnergyTypes;
    }

    /**
     * Gets the value of the noFeeToUse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoFeeToUse() {
        return noFeeToUse;
    }

    /**
     * Sets the value of the noFeeToUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoFeeToUse(Boolean value) {
        this.noFeeToUse = value;
    }

    /**
     * Gets the value of the withMembership property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithMembership() {
        return withMembership;
    }

    /**
     * Sets the value of the withMembership property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithMembership(Boolean value) {
        this.withMembership = value;
    }

    /**
     * Gets the value of the membershipNames property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the membershipNames property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getMembershipNames().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link MultilingualString }
     * 
     * 
     */
    public List<MultilingualString> getMembershipNames() {
        if (membershipNames == null) {
            membershipNames = new ArrayList<MultilingualString>();
        }
        return this.membershipNames;
    }

    /**
     * Gets the value of the memberOfOtherRateTable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMemberOfOtherRateTable() {
        return memberOfOtherRateTable;
    }

    /**
     * Sets the value of the memberOfOtherRateTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMemberOfOtherRateTable(Boolean value) {
        this.memberOfOtherRateTable = value;
    }

    /**
     * Gets the value of the rateTableMembers property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the rateTableMembers property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getRateTableMembers().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link _RateTableVersionedReference }
     * 
     * 
     */
    public List<_RateTableVersionedReference> getRateTableMembers() {
        if (rateTableMembers == null) {
            rateTableMembers = new ArrayList<_RateTableVersionedReference>();
        }
        return this.rateTableMembers;
    }

    /**
     * Gets the value of the activeAssignedRight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveAssignedRight() {
        return activeAssignedRight;
    }

    /**
     * Sets the value of the activeAssignedRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveAssignedRight(String value) {
        this.activeAssignedRight = value;
    }

    /**
     * Gets the value of the paymentMethods property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the paymentMethods property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getPaymentMethods().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentMethod }
     * 
     * 
     */
    public List<PaymentMethod> getPaymentMethods() {
        if (paymentMethods == null) {
            paymentMethods = new ArrayList<PaymentMethod>();
        }
        return this.paymentMethods;
    }

    /**
     * Gets the value of the vehicleCharacteristics property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the vehicleCharacteristics property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getVehicleCharacteristics().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleCharacteristics }
     * 
     * 
     */
    public List<VehicleCharacteristics> getVehicleCharacteristics() {
        if (vehicleCharacteristics == null) {
            vehicleCharacteristics = new ArrayList<VehicleCharacteristics>();
        }
        return this.vehicleCharacteristics;
    }

    /**
     * Gets the value of the userQualifications property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the userQualifications property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getUserQualifications().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link UserQualification }
     * 
     * 
     */
    public List<UserQualification> getUserQualifications() {
        if (userQualifications == null) {
            userQualifications = new ArrayList<UserQualification>();
        }
        return this.userQualifications;
    }

    /**
     * Gets the value of the _QualificationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_QualificationExtension() {
        return _QualificationExtension;
    }

    /**
     * Sets the value of the _QualificationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_QualificationExtension(_ExtensionType value) {
        this._QualificationExtension = value;
    }

}
