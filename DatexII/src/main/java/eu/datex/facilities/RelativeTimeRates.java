
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
 * &lt;p&gt;Java class for RelativeTimeRates complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RelativeTimeRates"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/facilities}RateLineCollection"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="referenceTimeStart" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="referenceTimeEnd" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_relativeTimeRatesExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelativeTimeRates", propOrder = {
    "referenceTimeStart",
    "referenceTimeEnd",
    "_RelativeTimeRatesExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class RelativeTimeRates
    extends RateLineCollection
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(InstantXmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Instant referenceTimeStart;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(InstantXmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Instant referenceTimeEnd;
    @XmlElement(name = "_relativeTimeRatesExtension")
    protected _ExtensionType _RelativeTimeRatesExtension;

    /**
     * Gets the value of the referenceTimeStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Instant getReferenceTimeStart() {
        return referenceTimeStart;
    }

    /**
     * Sets the value of the referenceTimeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceTimeStart(Instant value) {
        this.referenceTimeStart = value;
    }

    /**
     * Gets the value of the referenceTimeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Instant getReferenceTimeEnd() {
        return referenceTimeEnd;
    }

    /**
     * Sets the value of the referenceTimeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceTimeEnd(Instant value) {
        this.referenceTimeEnd = value;
    }

    /**
     * Gets the value of the _RelativeTimeRatesExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_RelativeTimeRatesExtension() {
        return _RelativeTimeRatesExtension;
    }

    /**
     * Sets the value of the _RelativeTimeRatesExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_RelativeTimeRatesExtension(_ExtensionType value) {
        this._RelativeTimeRatesExtension = value;
    }

}
