
package eu.datex.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.w3._2001.xmlschema.Adapter2;


/**
 * &lt;p&gt;Java class for DataValue complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="DataValue"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="dataError" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="reasonForDataError" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_dataValueExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="accuracy" type="{http://datex2.eu/schema/3/common}Percentage" /&amp;gt;
 *       &amp;lt;attribute name="computationalMethod" type="{http://datex2.eu/schema/3/common}ComputationMethodEnum" /&amp;gt;
 *       &amp;lt;attribute name="numberOfIncompleteInputs" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" /&amp;gt;
 *       &amp;lt;attribute name="numberOfInputValuesUsed" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" /&amp;gt;
 *       &amp;lt;attribute name="smoothingFactor" type="{http://datex2.eu/schema/3/common}Float" /&amp;gt;
 *       &amp;lt;attribute name="standardDeviation" type="{http://datex2.eu/schema/3/common}Float" /&amp;gt;
 *       &amp;lt;attribute name="supplierCalculatedDataQuality" type="{http://datex2.eu/schema/3/common}Percentage" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataValue", propOrder = {
    "dataError",
    "reasonForDataError",
    "_DataValueExtension"
})
@XmlSeeAlso({
    ApplicationRateValue.class,
    DirectionBearingValue.class,
    DirectionCompassValue.class,
    FloatingPointMetreDistanceValue.class,
    FrictionValue.class,
    IntegerMetreDistanceValue.class,
    KilogramsConcentrationValue.class,
    MicrogramsConcentrationValue.class,
    PercentageValue.class,
    PrecipitationIntensityValue.class,
    PressureValue.class,
    SpeedValue.class,
    TemperatureValue.class,
    VehicleFlowValue.class,
    WindSpeedValue.class
})
@ToString
@EqualsAndHashCode
public abstract class DataValue {

    protected Boolean dataError;
    protected MultilingualString reasonForDataError;
    @XmlElement(name = "_dataValueExtension")
    protected _ExtensionType _DataValueExtension;
    @XmlAttribute(name = "accuracy")
    protected Float accuracy;
    @XmlAttribute(name = "computationalMethod")
    protected ComputationMethodEnum computationalMethod;
    @XmlAttribute(name = "numberOfIncompleteInputs")
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Long numberOfIncompleteInputs;
    @XmlAttribute(name = "numberOfInputValuesUsed")
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Long numberOfInputValuesUsed;
    @XmlAttribute(name = "smoothingFactor")
    protected Float smoothingFactor;
    @XmlAttribute(name = "standardDeviation")
    protected Float standardDeviation;
    @XmlAttribute(name = "supplierCalculatedDataQuality")
    protected Float supplierCalculatedDataQuality;

    /**
     * Gets the value of the dataError property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataError() {
        return dataError;
    }

    /**
     * Sets the value of the dataError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataError(Boolean value) {
        this.dataError = value;
    }

    /**
     * Gets the value of the reasonForDataError property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getReasonForDataError() {
        return reasonForDataError;
    }

    /**
     * Sets the value of the reasonForDataError property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setReasonForDataError(MultilingualString value) {
        this.reasonForDataError = value;
    }

    /**
     * Gets the value of the _DataValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_DataValueExtension() {
        return _DataValueExtension;
    }

    /**
     * Sets the value of the _DataValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_DataValueExtension(_ExtensionType value) {
        this._DataValueExtension = value;
    }

    /**
     * Gets the value of the accuracy property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAccuracy() {
        return accuracy;
    }

    /**
     * Sets the value of the accuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAccuracy(Float value) {
        this.accuracy = value;
    }

    /**
     * Gets the value of the computationalMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ComputationMethodEnum }
     *     
     */
    public ComputationMethodEnum getComputationalMethod() {
        return computationalMethod;
    }

    /**
     * Sets the value of the computationalMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComputationMethodEnum }
     *     
     */
    public void setComputationalMethod(ComputationMethodEnum value) {
        this.computationalMethod = value;
    }

    /**
     * Gets the value of the numberOfIncompleteInputs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getNumberOfIncompleteInputs() {
        return numberOfIncompleteInputs;
    }

    /**
     * Sets the value of the numberOfIncompleteInputs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfIncompleteInputs(Long value) {
        this.numberOfIncompleteInputs = value;
    }

    /**
     * Gets the value of the numberOfInputValuesUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getNumberOfInputValuesUsed() {
        return numberOfInputValuesUsed;
    }

    /**
     * Sets the value of the numberOfInputValuesUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfInputValuesUsed(Long value) {
        this.numberOfInputValuesUsed = value;
    }

    /**
     * Gets the value of the smoothingFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSmoothingFactor() {
        return smoothingFactor;
    }

    /**
     * Sets the value of the smoothingFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSmoothingFactor(Float value) {
        this.smoothingFactor = value;
    }

    /**
     * Gets the value of the standardDeviation property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getStandardDeviation() {
        return standardDeviation;
    }

    /**
     * Sets the value of the standardDeviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setStandardDeviation(Float value) {
        this.standardDeviation = value;
    }

    /**
     * Gets the value of the supplierCalculatedDataQuality property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSupplierCalculatedDataQuality() {
        return supplierCalculatedDataQuality;
    }

    /**
     * Sets the value of the supplierCalculatedDataQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSupplierCalculatedDataQuality(Float value) {
        this.supplierCalculatedDataQuality = value;
    }

}
