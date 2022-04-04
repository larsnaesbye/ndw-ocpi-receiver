
package eu.datex.exchangeinformation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for ReturnInformation complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ReturnInformation"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="returnStatus" type="{http://datex2.eu/schema/3/exchangeInformation}_ExchangeReturnEnum"/&amp;gt;
 *         &amp;lt;element name="codedInvalidityReason" type="{http://datex2.eu/schema/3/exchangeInformation}_InvalidityReasonEnum" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_returnInformationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnInformation", propOrder = {
    "returnStatus",
    "codedInvalidityReasons",
    "_ReturnInformationExtension"
})
@ToString
@EqualsAndHashCode
public class ReturnInformation {

    @XmlElement(required = true)
    protected _ExchangeReturnEnum returnStatus;
    @XmlElement(name = "codedInvalidityReason")
    protected List<_InvalidityReasonEnum> codedInvalidityReasons;
    @XmlElement(name = "_returnInformationExtension")
    protected _ExtensionType _ReturnInformationExtension;

    /**
     * Gets the value of the returnStatus property.
     * 
     * @return
     *     possible object is
     *     {@link _ExchangeReturnEnum }
     *     
     */
    public _ExchangeReturnEnum getReturnStatus() {
        return returnStatus;
    }

    /**
     * Sets the value of the returnStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExchangeReturnEnum }
     *     
     */
    public void setReturnStatus(_ExchangeReturnEnum value) {
        this.returnStatus = value;
    }

    /**
     * Gets the value of the codedInvalidityReasons property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the codedInvalidityReasons property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getCodedInvalidityReasons().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link _InvalidityReasonEnum }
     * 
     * 
     */
    public List<_InvalidityReasonEnum> getCodedInvalidityReasons() {
        if (codedInvalidityReasons == null) {
            codedInvalidityReasons = new ArrayList<_InvalidityReasonEnum>();
        }
        return this.codedInvalidityReasons;
    }

    /**
     * Gets the value of the _ReturnInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_ReturnInformationExtension() {
        return _ReturnInformationExtension;
    }

    /**
     * Sets the value of the _ReturnInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_ReturnInformationExtension(_ExtensionType value) {
        this._ReturnInformationExtension = value;
    }

}
