
package eu.datex.facilities;

import java.time.Instant;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.datex.common.OverallPeriod;
import eu.datex.common._ExtensionType;
import io.github.threetenjaxb.core.InstantXmlAdapter;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for OperatingHoursSpecification complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="OperatingHoursSpecification"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/facilities}OperatingHours"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="lastUpdated" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="label" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="operatingAllYear" type="{http://datex2.eu/schema/3/common}Boolean"/&amp;gt;
 *         &amp;lt;element name="urlLinkAddress" type="{http://datex2.eu/schema/3/common}Url" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="overallPeriod" type="{http://datex2.eu/schema/3/common}OverallPeriod"/&amp;gt;
 *         &amp;lt;element name="_operatingHoursSpecificationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingHoursSpecification", propOrder = {
    "lastUpdated",
    "label",
    "operatingAllYear",
    "urlLinkAddress",
    "overallPeriod",
    "_OperatingHoursSpecificationExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class OperatingHoursSpecification
    extends OperatingHours
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(InstantXmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Instant lastUpdated;
    protected String label;
    protected boolean operatingAllYear;
    @XmlSchemaType(name = "anyURI")
    protected String urlLinkAddress;
    @XmlElement(required = true)
    protected OverallPeriod overallPeriod;
    @XmlElement(name = "_operatingHoursSpecificationExtension")
    protected _ExtensionType _OperatingHoursSpecificationExtension;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "version", required = true)
    protected String version;

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
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the operatingAllYear property.
     * 
     */
    public boolean isOperatingAllYear() {
        return operatingAllYear;
    }

    /**
     * Sets the value of the operatingAllYear property.
     * 
     */
    public void setOperatingAllYear(boolean value) {
        this.operatingAllYear = value;
    }

    /**
     * Gets the value of the urlLinkAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlLinkAddress() {
        return urlLinkAddress;
    }

    /**
     * Sets the value of the urlLinkAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlLinkAddress(String value) {
        this.urlLinkAddress = value;
    }

    /**
     * Gets the value of the overallPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link OverallPeriod }
     *     
     */
    public OverallPeriod getOverallPeriod() {
        return overallPeriod;
    }

    /**
     * Sets the value of the overallPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverallPeriod }
     *     
     */
    public void setOverallPeriod(OverallPeriod value) {
        this.overallPeriod = value;
    }

    /**
     * Gets the value of the _OperatingHoursSpecificationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OperatingHoursSpecificationExtension() {
        return _OperatingHoursSpecificationExtension;
    }

    /**
     * Sets the value of the _OperatingHoursSpecificationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OperatingHoursSpecificationExtension(_ExtensionType value) {
        this._OperatingHoursSpecificationExtension = value;
    }

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
