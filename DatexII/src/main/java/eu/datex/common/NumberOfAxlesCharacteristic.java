
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
 * &lt;p&gt;Java class for NumberOfAxlesCharacteristic complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="NumberOfAxlesCharacteristic"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="comparisonOperator" type="{http://datex2.eu/schema/3/common}_ComparisonOperatorEnum"/&amp;gt;
 *         &amp;lt;element name="numberOfAxles" type="{http://datex2.eu/schema/3/common}NonNegativeInteger"/&amp;gt;
 *         &amp;lt;element name="_numberOfAxlesCharacteristicExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOfAxlesCharacteristic", propOrder = {
    "comparisonOperator",
    "numberOfAxles",
    "_NumberOfAxlesCharacteristicExtension"
})
@ToString
@EqualsAndHashCode
public class NumberOfAxlesCharacteristic {

    @XmlElement(required = true)
    protected _ComparisonOperatorEnum comparisonOperator;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Long numberOfAxles;
    @XmlElement(name = "_numberOfAxlesCharacteristicExtension")
    protected _ExtensionType _NumberOfAxlesCharacteristicExtension;

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
     * Gets the value of the numberOfAxles property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getNumberOfAxles() {
        return numberOfAxles;
    }

    /**
     * Sets the value of the numberOfAxles property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfAxles(Long value) {
        this.numberOfAxles = value;
    }

    /**
     * Gets the value of the _NumberOfAxlesCharacteristicExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_NumberOfAxlesCharacteristicExtension() {
        return _NumberOfAxlesCharacteristicExtension;
    }

    /**
     * Sets the value of the _NumberOfAxlesCharacteristicExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_NumberOfAxlesCharacteristicExtension(_ExtensionType value) {
        this._NumberOfAxlesCharacteristicExtension = value;
    }

}
