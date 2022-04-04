
package eu.datex.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import eu.datex.energyinfrastructure._EnergyInfrastructureTableVersionedReference;
import eu.datex.facilities._FacilityObjectVersionedReference;
import eu.datex.facilities._OperatingHoursSpecificationVersionedReference;
import eu.datex.facilities._OperatingHoursTableVersionedReference;
import eu.datex.facilities._OrganisationVersionedReference;
import eu.datex.facilities._RateMatrixVersionedReference;
import eu.datex.facilities._RateTableVersionedReference;
import eu.datex.locationreferencing._PredefinedItineraryVersionedReference;
import eu.datex.locationreferencing._PredefinedLocationGroupVersionedReference;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for VersionedReference complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="VersionedReference"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VersionedReference")
@XmlSeeAlso({
    _FacilityObjectVersionedReference.class,
    _OperatingHoursSpecificationVersionedReference.class,
    _OperatingHoursTableVersionedReference.class,
    _OrganisationVersionedReference.class,
    _RateMatrixVersionedReference.class,
    _RateTableVersionedReference.class,
    _EnergyInfrastructureTableVersionedReference.class,
    _PredefinedItineraryVersionedReference.class,
    _PredefinedLocationGroupVersionedReference.class
})
@ToString
@EqualsAndHashCode
public class VersionedReference {

    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
