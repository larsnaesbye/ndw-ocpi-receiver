
package eu.datex.commonextension;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.datex.common._ComparisonOperatorEnum;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.w3._2001.xmlschema.Adapter2;


/**
 * &lt;p&gt;Java class for AgeCharacteristic complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AgeCharacteristic"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="comparisonOperator" type="{http://datex2.eu/schema/3/common}_ComparisonOperatorEnum"/&amp;gt;
 *         &amp;lt;element name="yearOfFirstRegistration" type="{http://datex2.eu/schema/3/common}Year"/&amp;gt;
 *         &amp;lt;element name="_ageCharacteristicExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgeCharacteristic", propOrder = {
    "comparisonOperator",
    "yearOfFirstRegistration",
    "_AgeCharacteristicExtension"
})
@ToString
@EqualsAndHashCode
public class AgeCharacteristic {

    @XmlElement(required = true)
    protected _ComparisonOperatorEnum comparisonOperator;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Long yearOfFirstRegistration;
    @XmlElement(name = "_ageCharacteristicExtension")
    protected _ExtensionType _AgeCharacteristicExtension;

    /**
     * Gets the value of the comparisonOperator property.
     * 
     * @return
     *     possible object is
     *     {@link _ComparisonOperatorEnum }
     *     
     */
    public _ComparisonOperatorEnum getComparisonOperator() {
        return comparisonOperator;
    }

    /**
     * Sets the value of the comparisonOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ComparisonOperatorEnum }
     *     
     */
    public void setComparisonOperator(_ComparisonOperatorEnum value) {
        this.comparisonOperator = value;
    }

    /**
     * Gets the value of the yearOfFirstRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getYearOfFirstRegistration() {
        return yearOfFirstRegistration;
    }

    /**
     * Sets the value of the yearOfFirstRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearOfFirstRegistration(Long value) {
        this.yearOfFirstRegistration = value;
    }

    /**
     * Gets the value of the _AgeCharacteristicExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_AgeCharacteristicExtension() {
        return _AgeCharacteristicExtension;
    }

    /**
     * Sets the value of the _AgeCharacteristicExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_AgeCharacteristicExtension(_ExtensionType value) {
        this._AgeCharacteristicExtension = value;
    }

}
