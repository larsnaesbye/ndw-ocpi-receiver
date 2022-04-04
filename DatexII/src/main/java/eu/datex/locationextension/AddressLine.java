
package eu.datex.locationextension;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.datex.common.MultilingualString;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.w3._2001.xmlschema.Adapter2;


/**
 * &lt;p&gt;Java class for AddressLine complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AddressLine"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="type" type="{http://datex2.eu/schema/3/locationExtension}_AddressLineTypeEnum"/&amp;gt;
 *         &amp;lt;element name="text" type="{http://datex2.eu/schema/3/common}MultilingualString"/&amp;gt;
 *         &amp;lt;element name="_addressLineExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="order" use="required" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressLine", propOrder = {
    "type",
    "text",
    "_AddressLineExtension"
})
@ToString
@EqualsAndHashCode
public class AddressLine {

    @XmlElement(required = true)
    protected _AddressLineTypeEnum type;
    @XmlElement(required = true)
    protected MultilingualString text;
    @XmlElement(name = "_addressLineExtension")
    protected _ExtensionType _AddressLineExtension;
    @XmlAttribute(name = "order", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Long order;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link _AddressLineTypeEnum }
     *     
     */
    public _AddressLineTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link _AddressLineTypeEnum }
     *     
     */
    public void setType(_AddressLineTypeEnum value) {
        this.type = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setText(MultilingualString value) {
        this.text = value;
    }

    /**
     * Gets the value of the _AddressLineExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_AddressLineExtension() {
        return _AddressLineExtension;
    }

    /**
     * Sets the value of the _AddressLineExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_AddressLineExtension(_ExtensionType value) {
        this._AddressLineExtension = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrder(Long value) {
        this.order = value;
    }

}
