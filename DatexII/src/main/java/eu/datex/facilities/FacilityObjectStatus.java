
package eu.datex.facilities;

import java.time.Instant;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.datex.common._ExtensionType;
import io.github.threetenjaxb.core.InstantXmlAdapter;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for FacilityObjectStatus complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="FacilityObjectStatus"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="reference" type="{http://datex2.eu/schema/3/facilities}_FacilityObjectVersionedReference"/&amp;gt;
 *         &amp;lt;element name="lastUpdated" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="newRates" type="{http://datex2.eu/schema/3/facilities}Rates" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_facilityObjectStatusExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityObjectStatus", propOrder = {
    "reference",
    "lastUpdated",
    "newRates",
    "_FacilityObjectStatusExtension"
})
@XmlSeeAlso({
    FacilityStatus.class
})
@ToString
@EqualsAndHashCode
public class FacilityObjectStatus {

    @XmlElement(required = true)
    protected _FacilityObjectVersionedReference reference;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(InstantXmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Instant lastUpdated;
    protected Rates newRates;
    @XmlElement(name = "_facilityObjectStatusExtension")
    protected _ExtensionType _FacilityObjectStatusExtension;

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link _FacilityObjectVersionedReference }
     *     
     */
    public _FacilityObjectVersionedReference getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link _FacilityObjectVersionedReference }
     *     
     */
    public void setReference(_FacilityObjectVersionedReference value) {
        this.reference = value;
    }

    /**
     * Gets the value of the lastUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Instant getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Sets the value of the lastUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdated(Instant value) {
        this.lastUpdated = value;
    }

    /**
     * Gets the value of the newRates property.
     * 
     * @return
     *     possible object is
     *     {@link Rates }
     *     
     */
    public Rates getNewRates() {
        return newRates;
    }

    /**
     * Sets the value of the newRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rates }
     *     
     */
    public void setNewRates(Rates value) {
        this.newRates = value;
    }

    /**
     * Gets the value of the _FacilityObjectStatusExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_FacilityObjectStatusExtension() {
        return _FacilityObjectStatusExtension;
    }

    /**
     * Sets the value of the _FacilityObjectStatusExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_FacilityObjectStatusExtension(_ExtensionType value) {
        this._FacilityObjectStatusExtension = value;
    }

}
