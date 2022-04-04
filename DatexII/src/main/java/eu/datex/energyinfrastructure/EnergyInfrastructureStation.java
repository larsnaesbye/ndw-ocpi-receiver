
package eu.datex.energyinfrastructure;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import eu.datex.facilities.Facility;
import eu.datex.facilities.Organisation;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for EnergyInfrastructureStation complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="EnergyInfrastructureStation"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/facilities}Facility"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="authenticationAndIdentificationMethods" type="{http://datex2.eu/schema/3/energyInfrastructure}_AuthenticationAndIdentificationEnum" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element name="energyProvider" type="{http://datex2.eu/schema/3/facilities}Organisation" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="refillPoint" type="{http://datex2.eu/schema/3/energyInfrastructure}RefillPoint" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_energyInfrastructureStationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyInfrastructureStation", propOrder = {
    "authenticationAndIdentificationMethods",
    "energyProvider",
    "refillPoints",
    "_EnergyInfrastructureStationExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class EnergyInfrastructureStation
    extends Facility
{

    @XmlElement(required = true)
    protected List<_AuthenticationAndIdentificationEnum> authenticationAndIdentificationMethods;
    protected Organisation energyProvider;
    @XmlElement(name = "refillPoint")
    protected List<RefillPoint> refillPoints;
    @XmlElement(name = "_energyInfrastructureStationExtension")
    protected _ExtensionType _EnergyInfrastructureStationExtension;

    /**
     * Gets the value of the authenticationAndIdentificationMethods property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the authenticationAndIdentificationMethods property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAuthenticationAndIdentificationMethods().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link _AuthenticationAndIdentificationEnum }
     * 
     * 
     */
    public List<_AuthenticationAndIdentificationEnum> getAuthenticationAndIdentificationMethods() {
        if (authenticationAndIdentificationMethods == null) {
            authenticationAndIdentificationMethods = new ArrayList<_AuthenticationAndIdentificationEnum>();
        }
        return this.authenticationAndIdentificationMethods;
    }

    /**
     * Gets the value of the energyProvider property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation }
     *     
     */
    public Organisation getEnergyProvider() {
        return energyProvider;
    }

    /**
     * Sets the value of the energyProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation }
     *     
     */
    public void setEnergyProvider(Organisation value) {
        this.energyProvider = value;
    }

    /**
     * Gets the value of the refillPoints property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the refillPoints property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getRefillPoints().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link RefillPoint }
     * 
     * 
     */
    public List<RefillPoint> getRefillPoints() {
        if (refillPoints == null) {
            refillPoints = new ArrayList<RefillPoint>();
        }
        return this.refillPoints;
    }

    /**
     * Gets the value of the _EnergyInfrastructureStationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_EnergyInfrastructureStationExtension() {
        return _EnergyInfrastructureStationExtension;
    }

    /**
     * Sets the value of the _EnergyInfrastructureStationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_EnergyInfrastructureStationExtension(_ExtensionType value) {
        this._EnergyInfrastructureStationExtension = value;
    }

}
