
package eu.datex.common;

import java.time.Instant;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.datex.energyinfrastructure.EnergyInfrastructureStatusPublication;
import eu.datex.energyinfrastructure.EnergyInfrastructureTablePublication;
import io.github.threetenjaxb.core.InstantXmlAdapter;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for PayloadPublication complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PayloadPublication"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="publicationTime" type="{http://datex2.eu/schema/3/common}DateTime"/&amp;gt;
 *         &amp;lt;element name="publicationCreator" type="{http://datex2.eu/schema/3/common}InternationalIdentifier"/&amp;gt;
 *         &amp;lt;element name="_payloadPublicationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="lang" use="required" type="{http://datex2.eu/schema/3/common}Language" /&amp;gt;
 *       &amp;lt;attribute name="modelBaseVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="3" /&amp;gt;
 *       &amp;lt;attribute name="extensionName" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="extensionVersion" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="profileName" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="profileVersion" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayloadPublication", propOrder = {
    "publicationTime",
    "publicationCreator",
    "_PayloadPublicationExtension"
})
@XmlSeeAlso({
    EnergyInfrastructureStatusPublication.class,
    EnergyInfrastructureTablePublication.class
})
@ToString
@EqualsAndHashCode
public abstract class PayloadPublication {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(InstantXmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Instant publicationTime;
    @XmlElement(required = true)
    protected InternationalIdentifier publicationCreator;
    @XmlElement(name = "_payloadPublicationExtension")
    protected _ExtensionType _PayloadPublicationExtension;
    @XmlAttribute(name = "lang", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lang;
    @XmlAttribute(name = "modelBaseVersion", required = true)
    protected String modelBaseVersion;
    @XmlAttribute(name = "extensionName")
    protected String extensionName;
    @XmlAttribute(name = "extensionVersion")
    protected String extensionVersion;
    @XmlAttribute(name = "profileName")
    protected String profileName;
    @XmlAttribute(name = "profileVersion")
    protected String profileVersion;

    /**
     * Gets the value of the publicationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Instant getPublicationTime() {
        return publicationTime;
    }

    /**
     * Sets the value of the publicationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationTime(Instant value) {
        this.publicationTime = value;
    }

    /**
     * Gets the value of the publicationCreator property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalIdentifier }
     *     
     */
    public InternationalIdentifier getPublicationCreator() {
        return publicationCreator;
    }

    /**
     * Sets the value of the publicationCreator property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalIdentifier }
     *     
     */
    public void setPublicationCreator(InternationalIdentifier value) {
        this.publicationCreator = value;
    }

    /**
     * Gets the value of the _PayloadPublicationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_PayloadPublicationExtension() {
        return _PayloadPublicationExtension;
    }

    /**
     * Sets the value of the _PayloadPublicationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_PayloadPublicationExtension(_ExtensionType value) {
        this._PayloadPublicationExtension = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the modelBaseVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelBaseVersion() {
        if (modelBaseVersion == null) {
            return "3";
        } else {
            return modelBaseVersion;
        }
    }

    /**
     * Sets the value of the modelBaseVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelBaseVersion(String value) {
        this.modelBaseVersion = value;
    }

    /**
     * Gets the value of the extensionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionName() {
        return extensionName;
    }

    /**
     * Sets the value of the extensionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionName(String value) {
        this.extensionName = value;
    }

    /**
     * Gets the value of the extensionVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionVersion() {
        return extensionVersion;
    }

    /**
     * Sets the value of the extensionVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionVersion(String value) {
        this.extensionVersion = value;
    }

    /**
     * Gets the value of the profileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileName() {
        return profileName;
    }

    /**
     * Sets the value of the profileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileName(String value) {
        this.profileName = value;
    }

    /**
     * Gets the value of the profileVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileVersion() {
        return profileVersion;
    }

    /**
     * Sets the value of the profileVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileVersion(String value) {
        this.profileVersion = value;
    }

}
