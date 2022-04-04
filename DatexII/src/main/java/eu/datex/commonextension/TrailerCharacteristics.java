
package eu.datex.commonextension;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for TrailerCharacteristics complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="TrailerCharacteristics"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="grossTrailerWeightCharacteristics" type="{http://datex2.eu/schema/3/commonExtension}GrossTrailerWeightCharacteristics"/&amp;gt;
 *         &amp;lt;element name="_trailerCharacteristicsExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrailerCharacteristics", propOrder = {
    "grossTrailerWeightCharacteristics",
    "_TrailerCharacteristicsExtension"
})
@ToString
@EqualsAndHashCode
public class TrailerCharacteristics {

    @XmlElement(required = true)
    protected GrossTrailerWeightCharacteristics grossTrailerWeightCharacteristics;
    @XmlElement(name = "_trailerCharacteristicsExtension")
    protected _ExtensionType _TrailerCharacteristicsExtension;

    /**
     * Gets the value of the grossTrailerWeightCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link GrossTrailerWeightCharacteristics }
     *     
     */
    public GrossTrailerWeightCharacteristics getGrossTrailerWeightCharacteristics() {
        return grossTrailerWeightCharacteristics;
    }

    /**
     * Sets the value of the grossTrailerWeightCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrossTrailerWeightCharacteristics }
     *     
     */
    public void setGrossTrailerWeightCharacteristics(GrossTrailerWeightCharacteristics value) {
        this.grossTrailerWeightCharacteristics = value;
    }

    /**
     * Gets the value of the _TrailerCharacteristicsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TrailerCharacteristicsExtension() {
        return _TrailerCharacteristicsExtension;
    }

    /**
     * Sets the value of the _TrailerCharacteristicsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TrailerCharacteristicsExtension(_ExtensionType value) {
        this._TrailerCharacteristicsExtension = value;
    }

}
