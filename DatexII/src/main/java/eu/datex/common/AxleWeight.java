
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
 * &lt;p&gt;Java class for AxleWeight complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="AxleWeight"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="axlePositionIdentifier" type="{http://datex2.eu/schema/3/common}NonNegativeInteger"/&amp;gt;
 *         &amp;lt;element name="axleWeight" type="{http://datex2.eu/schema/3/common}Tonnes" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="maximumPermittedAxleWeight" type="{http://datex2.eu/schema/3/common}Tonnes" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_axleWeightExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AxleWeight", propOrder = {
    "axlePositionIdentifier",
    "axleWeight",
    "maximumPermittedAxleWeight",
    "_AxleWeightExtension"
})
@ToString
@EqualsAndHashCode
public class AxleWeight {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Long axlePositionIdentifier;
    protected Float axleWeight;
    protected Float maximumPermittedAxleWeight;
    @XmlElement(name = "_axleWeightExtension")
    protected _ExtensionType _AxleWeightExtension;

    /**
     * Gets the value of the axlePositionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getAxlePositionIdentifier() {
        return axlePositionIdentifier;
    }

    /**
     * Sets the value of the axlePositionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAxlePositionIdentifier(Long value) {
        this.axlePositionIdentifier = value;
    }

    /**
     * Gets the value of the axleWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAxleWeight() {
        return axleWeight;
    }

    /**
     * Sets the value of the axleWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAxleWeight(Float value) {
        this.axleWeight = value;
    }

    /**
     * Gets the value of the maximumPermittedAxleWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaximumPermittedAxleWeight() {
        return maximumPermittedAxleWeight;
    }

    /**
     * Sets the value of the maximumPermittedAxleWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaximumPermittedAxleWeight(Float value) {
        this.maximumPermittedAxleWeight = value;
    }

    /**
     * Gets the value of the _AxleWeightExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_AxleWeightExtension() {
        return _AxleWeightExtension;
    }

    /**
     * Sets the value of the _AxleWeightExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_AxleWeightExtension(_ExtensionType value) {
        this._AxleWeightExtension = value;
    }

}
