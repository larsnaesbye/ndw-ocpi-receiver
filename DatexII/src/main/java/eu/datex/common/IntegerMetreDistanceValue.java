
package eu.datex.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.w3._2001.xmlschema.Adapter2;


/**
 * &lt;p&gt;Java class for IntegerMetreDistanceValue complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="IntegerMetreDistanceValue"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/common}DataValue"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="integerMetreDistance" type="{http://datex2.eu/schema/3/common}MetresAsNonNegativeInteger"/&amp;gt;
 *         &amp;lt;element name="_integerMetreDistanceValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntegerMetreDistanceValue", propOrder = {
    "integerMetreDistance",
    "_IntegerMetreDistanceValueExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class IntegerMetreDistanceValue
    extends DataValue
{

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Long integerMetreDistance;
    @XmlElement(name = "_integerMetreDistanceValueExtension")
    protected _ExtensionType _IntegerMetreDistanceValueExtension;

    /**
     * Gets the value of the integerMetreDistance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getIntegerMetreDistance() {
        return integerMetreDistance;
    }

    /**
     * Sets the value of the integerMetreDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegerMetreDistance(Long value) {
        this.integerMetreDistance = value;
    }

    /**
     * Gets the value of the _IntegerMetreDistanceValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_IntegerMetreDistanceValueExtension() {
        return _IntegerMetreDistanceValueExtension;
    }

    /**
     * Sets the value of the _IntegerMetreDistanceValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_IntegerMetreDistanceValueExtension(_ExtensionType value) {
        this._IntegerMetreDistanceValueExtension = value;
    }

}
