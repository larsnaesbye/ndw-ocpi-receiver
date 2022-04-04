
package eu.datex.common;

import java.util.ArrayList;
import java.util.List;
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
 * &lt;p&gt;Java class for VehicleCharacteristics complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="VehicleCharacteristics"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="fuelType" type="{http://datex2.eu/schema/3/common}_FuelTypeEnum" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="loadType" type="{http://datex2.eu/schema/3/common}_LoadTypeEnum" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="vehicleEquipment" type="{http://datex2.eu/schema/3/common}_VehicleEquipmentEnum" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="vehicleType" type="{http://datex2.eu/schema/3/common}_VehicleTypeEnum" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="vehicleUsage" type="{http://datex2.eu/schema/3/common}_VehicleUsageEnum" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="yearOfFirstRegistration" type="{http://datex2.eu/schema/3/common}Year" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="grossWeightCharacteristic" type="{http://datex2.eu/schema/3/common}GrossWeightCharacteristic" maxOccurs="2" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="heightCharacteristic" type="{http://datex2.eu/schema/3/common}HeightCharacteristic" maxOccurs="2" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="lengthCharacteristic" type="{http://datex2.eu/schema/3/common}LengthCharacteristic" maxOccurs="2" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="widthCharacteristic" type="{http://datex2.eu/schema/3/common}WidthCharacteristic" maxOccurs="2" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="heaviestAxleWeightCharacteristic" type="{http://datex2.eu/schema/3/common}HeaviestAxleWeightCharacteristic" maxOccurs="2" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="numberOfAxlesCharacteristic" type="{http://datex2.eu/schema/3/common}NumberOfAxlesCharacteristic" maxOccurs="2" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="emissions" type="{http://datex2.eu/schema/3/common}Emissions" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_vehicleCharacteristicsExtension" type="{http://datex2.eu/schema/3/common}_VehicleCharacteristicsExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleCharacteristics", propOrder = {
    "fuelTypes",
    "loadType",
    "vehicleEquipment",
    "vehicleTypes",
    "vehicleUsage",
    "yearOfFirstRegistration",
    "grossWeightCharacteristics",
    "heightCharacteristics",
    "lengthCharacteristics",
    "widthCharacteristics",
    "heaviestAxleWeightCharacteristics",
    "numberOfAxlesCharacteristics",
    "emissions",
    "_VehicleCharacteristicsExtension"
})
@ToString
@EqualsAndHashCode
public class VehicleCharacteristics {

    @XmlElement(name = "fuelType")
    protected List<_FuelTypeEnum> fuelTypes;
    protected _LoadTypeEnum loadType;
    protected _VehicleEquipmentEnum vehicleEquipment;
    @XmlElement(name = "vehicleType")
    protected List<_VehicleTypeEnum> vehicleTypes;
    protected _VehicleUsageEnum vehicleUsage;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Long yearOfFirstRegistration;
    @XmlElement(name = "grossWeightCharacteristic")
    protected List<GrossWeightCharacteristic> grossWeightCharacteristics;
    @XmlElement(name = "heightCharacteristic")
    protected List<HeightCharacteristic> heightCharacteristics;
    @XmlElement(name = "lengthCharacteristic")
    protected List<LengthCharacteristic> lengthCharacteristics;
    @XmlElement(name = "widthCharacteristic")
    protected List<WidthCharacteristic> widthCharacteristics;
    @XmlElement(name = "heaviestAxleWeightCharacteristic")
    protected List<HeaviestAxleWeightCharacteristic> heaviestAxleWeightCharacteristics;
    @XmlElement(name = "numberOfAxlesCharacteristic")
    protected List<NumberOfAxlesCharacteristic> numberOfAxlesCharacteristics;
    protected Emissions emissions;
    @XmlElement(name = "_vehicleCharacteristicsExtension")
    protected _VehicleCharacteristicsExtensionType _VehicleCharacteristicsExtension;

    /**
     * Gets the value of the fuelTypes property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the fuelTypes property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getFuelTypes().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link _FuelTypeEnum }
     * 
     * 
     */
    public List<_FuelTypeEnum> getFuelTypes() {
        if (fuelTypes == null) {
            fuelTypes = new ArrayList<_FuelTypeEnum>();
        }
        return this.fuelTypes;
    }

    /**
     * Gets the value of the loadType property.
     * 
     * @return
     *     possible object is
     *     {@link _LoadTypeEnum }
     *     
     */
    public _LoadTypeEnum getLoadType() {
        return loadType;
    }

    /**
     * Sets the value of the loadType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _LoadTypeEnum }
     *     
     */
    public void setLoadType(_LoadTypeEnum value) {
        this.loadType = value;
    }

    /**
     * Gets the value of the vehicleEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link _VehicleEquipmentEnum }
     *     
     */
    public _VehicleEquipmentEnum getVehicleEquipment() {
        return vehicleEquipment;
    }

    /**
     * Sets the value of the vehicleEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link _VehicleEquipmentEnum }
     *     
     */
    public void setVehicleEquipment(_VehicleEquipmentEnum value) {
        this.vehicleEquipment = value;
    }

    /**
     * Gets the value of the vehicleTypes property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the vehicleTypes property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getVehicleTypes().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link _VehicleTypeEnum }
     * 
     * 
     */
    public List<_VehicleTypeEnum> getVehicleTypes() {
        if (vehicleTypes == null) {
            vehicleTypes = new ArrayList<_VehicleTypeEnum>();
        }
        return this.vehicleTypes;
    }

    /**
     * Gets the value of the vehicleUsage property.
     * 
     * @return
     *     possible object is
     *     {@link _VehicleUsageEnum }
     *     
     */
    public _VehicleUsageEnum getVehicleUsage() {
        return vehicleUsage;
    }

    /**
     * Sets the value of the vehicleUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link _VehicleUsageEnum }
     *     
     */
    public void setVehicleUsage(_VehicleUsageEnum value) {
        this.vehicleUsage = value;
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
     * Gets the value of the grossWeightCharacteristics property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the grossWeightCharacteristics property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getGrossWeightCharacteristics().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link GrossWeightCharacteristic }
     * 
     * 
     */
    public List<GrossWeightCharacteristic> getGrossWeightCharacteristics() {
        if (grossWeightCharacteristics == null) {
            grossWeightCharacteristics = new ArrayList<GrossWeightCharacteristic>();
        }
        return this.grossWeightCharacteristics;
    }

    /**
     * Gets the value of the heightCharacteristics property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the heightCharacteristics property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getHeightCharacteristics().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link HeightCharacteristic }
     * 
     * 
     */
    public List<HeightCharacteristic> getHeightCharacteristics() {
        if (heightCharacteristics == null) {
            heightCharacteristics = new ArrayList<HeightCharacteristic>();
        }
        return this.heightCharacteristics;
    }

    /**
     * Gets the value of the lengthCharacteristics property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the lengthCharacteristics property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getLengthCharacteristics().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link LengthCharacteristic }
     * 
     * 
     */
    public List<LengthCharacteristic> getLengthCharacteristics() {
        if (lengthCharacteristics == null) {
            lengthCharacteristics = new ArrayList<LengthCharacteristic>();
        }
        return this.lengthCharacteristics;
    }

    /**
     * Gets the value of the widthCharacteristics property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the widthCharacteristics property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getWidthCharacteristics().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link WidthCharacteristic }
     * 
     * 
     */
    public List<WidthCharacteristic> getWidthCharacteristics() {
        if (widthCharacteristics == null) {
            widthCharacteristics = new ArrayList<WidthCharacteristic>();
        }
        return this.widthCharacteristics;
    }

    /**
     * Gets the value of the heaviestAxleWeightCharacteristics property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the heaviestAxleWeightCharacteristics property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getHeaviestAxleWeightCharacteristics().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link HeaviestAxleWeightCharacteristic }
     * 
     * 
     */
    public List<HeaviestAxleWeightCharacteristic> getHeaviestAxleWeightCharacteristics() {
        if (heaviestAxleWeightCharacteristics == null) {
            heaviestAxleWeightCharacteristics = new ArrayList<HeaviestAxleWeightCharacteristic>();
        }
        return this.heaviestAxleWeightCharacteristics;
    }

    /**
     * Gets the value of the numberOfAxlesCharacteristics property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the numberOfAxlesCharacteristics property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getNumberOfAxlesCharacteristics().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfAxlesCharacteristic }
     * 
     * 
     */
    public List<NumberOfAxlesCharacteristic> getNumberOfAxlesCharacteristics() {
        if (numberOfAxlesCharacteristics == null) {
            numberOfAxlesCharacteristics = new ArrayList<NumberOfAxlesCharacteristic>();
        }
        return this.numberOfAxlesCharacteristics;
    }

    /**
     * Gets the value of the emissions property.
     * 
     * @return
     *     possible object is
     *     {@link Emissions }
     *     
     */
    public Emissions getEmissions() {
        return emissions;
    }

    /**
     * Sets the value of the emissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Emissions }
     *     
     */
    public void setEmissions(Emissions value) {
        this.emissions = value;
    }

    /**
     * Gets the value of the _VehicleCharacteristicsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _VehicleCharacteristicsExtensionType }
     *     
     */
    public _VehicleCharacteristicsExtensionType get_VehicleCharacteristicsExtension() {
        return _VehicleCharacteristicsExtension;
    }

    /**
     * Sets the value of the _VehicleCharacteristicsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _VehicleCharacteristicsExtensionType }
     *     
     */
    public void set_VehicleCharacteristicsExtension(_VehicleCharacteristicsExtensionType value) {
        this._VehicleCharacteristicsExtension = value;
    }

}
