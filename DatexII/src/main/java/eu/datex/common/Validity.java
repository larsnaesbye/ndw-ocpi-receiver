
package eu.datex.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for Validity complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Validity"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="validityStatus" type="{http://datex2.eu/schema/3/common}_ValidityStatusEnum"/&amp;gt;
 *         &amp;lt;element name="overrunning" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="validityTimeSpecification" type="{http://datex2.eu/schema/3/common}OverallPeriod"/&amp;gt;
 *         &amp;lt;element name="_validityExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Validity", propOrder = {
    "validityStatus",
    "overrunning",
    "validityTimeSpecification",
    "_ValidityExtension"
})
@ToString
@EqualsAndHashCode
public class Validity {

    @XmlElement(required = true)
    protected _ValidityStatusEnum validityStatus;
    protected Boolean overrunning;
    @XmlElement(required = true)
    protected OverallPeriod validityTimeSpecification;
    @XmlElement(name = "_validityExtension")
    protected _ExtensionType _ValidityExtension;

    /**
     * Gets the value of the validityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link _ValidityStatusEnum }
     *     
     */
    public _ValidityStatusEnum getValidityStatus() {
        return validityStatus;
    }

    /**
     * Sets the value of the validityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ValidityStatusEnum }
     *     
     */
    public void setValidityStatus(_ValidityStatusEnum value) {
        this.validityStatus = value;
    }

    /**
     * Gets the value of the overrunning property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrunning() {
        return overrunning;
    }

    /**
     * Sets the value of the overrunning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrunning(Boolean value) {
        this.overrunning = value;
    }

    /**
     * Gets the value of the validityTimeSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link OverallPeriod }
     *     
     */
    public OverallPeriod getValidityTimeSpecification() {
        return validityTimeSpecification;
    }

    /**
     * Sets the value of the validityTimeSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverallPeriod }
     *     
     */
    public void setValidityTimeSpecification(OverallPeriod value) {
        this.validityTimeSpecification = value;
    }

    /**
     * Gets the value of the _ValidityExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_ValidityExtension() {
        return _ValidityExtension;
    }

    /**
     * Sets the value of the _ValidityExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_ValidityExtension(_ExtensionType value) {
        this._ValidityExtension = value;
    }

}
