
package eu.datex.commonextension;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ComparisonOperatorEnum;
import eu.datex.common._ExtensionType;
import eu.datex.common._WeightTypeEnum;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for GrossTrailerWeightCharacteristics complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="GrossTrailerWeightCharacteristics"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="comparisonOperator" type="{http://datex2.eu/schema/3/common}_ComparisonOperatorEnum"/&amp;gt;
 *         &amp;lt;element name="grossTrailerWeight" type="{http://datex2.eu/schema/3/common}Tonnes"/&amp;gt;
 *         &amp;lt;element name="typeOfWeight" type="{http://datex2.eu/schema/3/common}_WeightTypeEnum"/&amp;gt;
 *         &amp;lt;element name="_grossTrailerWeightCharacteristicsExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrossTrailerWeightCharacteristics", propOrder = {
    "comparisonOperator",
    "grossTrailerWeight",
    "typeOfWeight",
    "_GrossTrailerWeightCharacteristicsExtension"
})
@ToString
@EqualsAndHashCode
public class GrossTrailerWeightCharacteristics {

    @XmlElement(required = true)
    protected _ComparisonOperatorEnum comparisonOperator;
    protected float grossTrailerWeight;
    @XmlElement(required = true)
    protected _WeightTypeEnum typeOfWeight;
    @XmlElement(name = "_grossTrailerWeightCharacteristicsExtension")
    protected _ExtensionType _GrossTrailerWeightCharacteristicsExtension;

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
     * Gets the value of the grossTrailerWeight property.
     * 
     */
    public float getGrossTrailerWeight() {
        return grossTrailerWeight;
    }

    /**
     * Sets the value of the grossTrailerWeight property.
     * 
     */
    public void setGrossTrailerWeight(float value) {
        this.grossTrailerWeight = value;
    }

    /**
     * Gets the value of the typeOfWeight property.
     * 
     * @return
     *     possible object is
     *     {@link _WeightTypeEnum }
     *     
     */
    public _WeightTypeEnum getTypeOfWeight() {
        return typeOfWeight;
    }

    /**
     * Sets the value of the typeOfWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link _WeightTypeEnum }
     *     
     */
    public void setTypeOfWeight(_WeightTypeEnum value) {
        this.typeOfWeight = value;
    }

    /**
     * Gets the value of the _GrossTrailerWeightCharacteristicsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_GrossTrailerWeightCharacteristicsExtension() {
        return _GrossTrailerWeightCharacteristicsExtension;
    }

    /**
     * Sets the value of the _GrossTrailerWeightCharacteristicsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_GrossTrailerWeightCharacteristicsExtension(_ExtensionType value) {
        this._GrossTrailerWeightCharacteristicsExtension = value;
    }

}
