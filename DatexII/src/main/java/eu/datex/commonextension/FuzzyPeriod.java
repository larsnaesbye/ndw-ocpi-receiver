
package eu.datex.commonextension;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for FuzzyPeriod complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="FuzzyPeriod"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="beginOrDuration" type="{http://datex2.eu/schema/3/commonExtension}_FuzzyTimeEnum" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="endOrDuration" type="{http://datex2.eu/schema/3/commonExtension}_FuzzyTimeEnum" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_fuzzyPeriodExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FuzzyPeriod", propOrder = {
    "beginOrDuration",
    "endOrDuration",
    "_FuzzyPeriodExtension"
})
@ToString
@EqualsAndHashCode
public class FuzzyPeriod {

    protected _FuzzyTimeEnum beginOrDuration;
    protected _FuzzyTimeEnum endOrDuration;
    @XmlElement(name = "_fuzzyPeriodExtension")
    protected _ExtensionType _FuzzyPeriodExtension;

    /**
     * Gets the value of the beginOrDuration property.
     * 
     * @return
     *     possible object is
     *     {@link _FuzzyTimeEnum }
     *     
     */
    public _FuzzyTimeEnum getBeginOrDuration() {
        return beginOrDuration;
    }

    /**
     * Sets the value of the beginOrDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link _FuzzyTimeEnum }
     *     
     */
    public void setBeginOrDuration(_FuzzyTimeEnum value) {
        this.beginOrDuration = value;
    }

    /**
     * Gets the value of the endOrDuration property.
     * 
     * @return
     *     possible object is
     *     {@link _FuzzyTimeEnum }
     *     
     */
    public _FuzzyTimeEnum getEndOrDuration() {
        return endOrDuration;
    }

    /**
     * Sets the value of the endOrDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link _FuzzyTimeEnum }
     *     
     */
    public void setEndOrDuration(_FuzzyTimeEnum value) {
        this.endOrDuration = value;
    }

    /**
     * Gets the value of the _FuzzyPeriodExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_FuzzyPeriodExtension() {
        return _FuzzyPeriodExtension;
    }

    /**
     * Sets the value of the _FuzzyPeriodExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_FuzzyPeriodExtension(_ExtensionType value) {
        this._FuzzyPeriodExtension = value;
    }

}
