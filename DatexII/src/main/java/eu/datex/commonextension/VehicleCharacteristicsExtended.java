
package eu.datex.commonextension;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common.HazardousMaterials;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for VehicleCharacteristicsExtended complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="VehicleCharacteristicsExtended"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ageCharacteristic" type="{http://datex2.eu/schema/3/commonExtension}AgeCharacteristic" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="trailerCharacteristics" type="{http://datex2.eu/schema/3/commonExtension}TrailerCharacteristics" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="hazardousMaterials" type="{http://datex2.eu/schema/3/common}HazardousMaterials" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="enginePowerCharacteristics" type="{http://datex2.eu/schema/3/commonExtension}EnginePowerCharacteristics" maxOccurs="2" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="regulatedCharacteristics" type="{http://datex2.eu/schema/3/commonExtension}RegulatedCharacteristics" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleCharacteristicsExtended", propOrder = {
    "ageCharacteristic",
    "trailerCharacteristics",
    "hazardousMaterials",
    "enginePowerCharacteristics",
    "regulatedCharacteristics"
})
@ToString
@EqualsAndHashCode
public class VehicleCharacteristicsExtended {

    protected AgeCharacteristic ageCharacteristic;
    protected TrailerCharacteristics trailerCharacteristics;
    protected HazardousMaterials hazardousMaterials;
    protected List<EnginePowerCharacteristics> enginePowerCharacteristics;
    protected List<RegulatedCharacteristics> regulatedCharacteristics;

    /**
     * Gets the value of the ageCharacteristic property.
     * 
     * @return
     *     possible object is
     *     {@link AgeCharacteristic }
     *     
     */
    public AgeCharacteristic getAgeCharacteristic() {
        return ageCharacteristic;
    }

    /**
     * Sets the value of the ageCharacteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgeCharacteristic }
     *     
     */
    public void setAgeCharacteristic(AgeCharacteristic value) {
        this.ageCharacteristic = value;
    }

    /**
     * Gets the value of the trailerCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link TrailerCharacteristics }
     *     
     */
    public TrailerCharacteristics getTrailerCharacteristics() {
        return trailerCharacteristics;
    }

    /**
     * Sets the value of the trailerCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrailerCharacteristics }
     *     
     */
    public void setTrailerCharacteristics(TrailerCharacteristics value) {
        this.trailerCharacteristics = value;
    }

    /**
     * Gets the value of the hazardousMaterials property.
     * 
     * @return
     *     possible object is
     *     {@link HazardousMaterials }
     *     
     */
    public HazardousMaterials getHazardousMaterials() {
        return hazardousMaterials;
    }

    /**
     * Sets the value of the hazardousMaterials property.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousMaterials }
     *     
     */
    public void setHazardousMaterials(HazardousMaterials value) {
        this.hazardousMaterials = value;
    }

    /**
     * Gets the value of the enginePowerCharacteristics property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the enginePowerCharacteristics property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getEnginePowerCharacteristics().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link EnginePowerCharacteristics }
     * 
     * 
     */
    public List<EnginePowerCharacteristics> getEnginePowerCharacteristics() {
        if (enginePowerCharacteristics == null) {
            enginePowerCharacteristics = new ArrayList<EnginePowerCharacteristics>();
        }
        return this.enginePowerCharacteristics;
    }

    /**
     * Gets the value of the regulatedCharacteristics property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the regulatedCharacteristics property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getRegulatedCharacteristics().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link RegulatedCharacteristics }
     * 
     * 
     */
    public List<RegulatedCharacteristics> getRegulatedCharacteristics() {
        if (regulatedCharacteristics == null) {
            regulatedCharacteristics = new ArrayList<RegulatedCharacteristics>();
        }
        return this.regulatedCharacteristics;
    }

}
