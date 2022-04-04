
package eu.datex.facilities;

import java.time.Instant;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.datex.common._ExtensionType;
import io.github.threetenjaxb.core.InstantXmlAdapter;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for ClosureInformation complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ClosureInformation"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="permananentlyClosed" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="temporarilyClosed" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="closedFrom" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="temporarilyClosedUntil" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_closureInformationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClosureInformation", propOrder = {
    "permananentlyClosed",
    "temporarilyClosed",
    "closedFrom",
    "temporarilyClosedUntil",
    "_ClosureInformationExtension"
})
@ToString
@EqualsAndHashCode
public class ClosureInformation {

    protected Boolean permananentlyClosed;
    protected Boolean temporarilyClosed;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(InstantXmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Instant closedFrom;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(InstantXmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Instant temporarilyClosedUntil;
    @XmlElement(name = "_closureInformationExtension")
    protected _ExtensionType _ClosureInformationExtension;

    /**
     * Gets the value of the permananentlyClosed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermananentlyClosed() {
        return permananentlyClosed;
    }

    /**
     * Sets the value of the permananentlyClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermananentlyClosed(Boolean value) {
        this.permananentlyClosed = value;
    }

    /**
     * Gets the value of the temporarilyClosed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTemporarilyClosed() {
        return temporarilyClosed;
    }

    /**
     * Sets the value of the temporarilyClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTemporarilyClosed(Boolean value) {
        this.temporarilyClosed = value;
    }

    /**
     * Gets the value of the closedFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Instant getClosedFrom() {
        return closedFrom;
    }

    /**
     * Sets the value of the closedFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosedFrom(Instant value) {
        this.closedFrom = value;
    }

    /**
     * Gets the value of the temporarilyClosedUntil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Instant getTemporarilyClosedUntil() {
        return temporarilyClosedUntil;
    }

    /**
     * Sets the value of the temporarilyClosedUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemporarilyClosedUntil(Instant value) {
        this.temporarilyClosedUntil = value;
    }

    /**
     * Gets the value of the _ClosureInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_ClosureInformationExtension() {
        return _ClosureInformationExtension;
    }

    /**
     * Sets the value of the _ClosureInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_ClosureInformationExtension(_ExtensionType value) {
        this._ClosureInformationExtension = value;
    }

}
