
package eu.datex.exchangeinformation;

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
 * &lt;p&gt;Java class for Subscription complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Subscription"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="subscriptionStart" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="subscriptionEnd" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_subscriptionExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subscription", propOrder = {
    "subscriptionStart",
    "subscriptionEnd",
    "_SubscriptionExtension"
})
@ToString
@EqualsAndHashCode
public class Subscription {

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(InstantXmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Instant subscriptionStart;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(InstantXmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Instant subscriptionEnd;
    @XmlElement(name = "_subscriptionExtension")
    protected _ExtensionType _SubscriptionExtension;

    /**
     * Gets the value of the subscriptionStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Instant getSubscriptionStart() {
        return subscriptionStart;
    }

    /**
     * Sets the value of the subscriptionStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionStart(Instant value) {
        this.subscriptionStart = value;
    }

    /**
     * Gets the value of the subscriptionEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Instant getSubscriptionEnd() {
        return subscriptionEnd;
    }

    /**
     * Sets the value of the subscriptionEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionEnd(Instant value) {
        this.subscriptionEnd = value;
    }

    /**
     * Gets the value of the _SubscriptionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_SubscriptionExtension() {
        return _SubscriptionExtension;
    }

    /**
     * Sets the value of the _SubscriptionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_SubscriptionExtension(_ExtensionType value) {
        this._SubscriptionExtension = value;
    }

}
