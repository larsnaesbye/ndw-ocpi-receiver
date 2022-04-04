
package eu.datex.energyinfrastructure;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for Connector complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Connector"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="connectorType" type="{http://datex2.eu/schema/3/energyInfrastructure}_ConnectorTypeEnum"/&amp;gt;
 *         &amp;lt;element name="chargingMode" type="{http://datex2.eu/schema/3/energyInfrastructure}_ChargingModeEnum"/&amp;gt;
 *         &amp;lt;element name="connectorFormat" type="{http://datex2.eu/schema/3/energyInfrastructure}_ConnectorFormatTypeEnum" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="maxPowerAtSocket" type="{http://datex2.eu/schema/3/energyInfrastructure}Watt"/&amp;gt;
 *         &amp;lt;element name="voltage" type="{http://datex2.eu/schema/3/energyInfrastructure}Volt" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="maximumCurrent" type="{http://datex2.eu/schema/3/energyInfrastructure}Ampere" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_connectorExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Connector", propOrder = {
    "connectorType",
    "chargingMode",
    "connectorFormat",
    "maxPowerAtSocket",
    "voltage",
    "maximumCurrent",
    "_ConnectorExtension"
})
@ToString
@EqualsAndHashCode
public class Connector {

    @XmlElement(required = true)
    protected _ConnectorTypeEnum connectorType;
    @XmlElement(required = true)
    protected _ChargingModeEnum chargingMode;
    protected _ConnectorFormatTypeEnum connectorFormat;
    protected float maxPowerAtSocket;
    protected Float voltage;
    protected Float maximumCurrent;
    @XmlElement(name = "_connectorExtension")
    protected _ExtensionType _ConnectorExtension;

    /**
     * Gets the value of the connectorType property.
     * 
     * @return
     *     possible object is
     *     {@link _ConnectorTypeEnum }
     *     
     */
    public _ConnectorTypeEnum getConnectorType() {
        return connectorType;
    }

    /**
     * Sets the value of the connectorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ConnectorTypeEnum }
     *     
     */
    public void setConnectorType(_ConnectorTypeEnum value) {
        this.connectorType = value;
    }

    /**
     * Gets the value of the chargingMode property.
     * 
     * @return
     *     possible object is
     *     {@link _ChargingModeEnum }
     *     
     */
    public _ChargingModeEnum getChargingMode() {
        return chargingMode;
    }

    /**
     * Sets the value of the chargingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ChargingModeEnum }
     *     
     */
    public void setChargingMode(_ChargingModeEnum value) {
        this.chargingMode = value;
    }

    /**
     * Gets the value of the connectorFormat property.
     * 
     * @return
     *     possible object is
     *     {@link _ConnectorFormatTypeEnum }
     *     
     */
    public _ConnectorFormatTypeEnum getConnectorFormat() {
        return connectorFormat;
    }

    /**
     * Sets the value of the connectorFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ConnectorFormatTypeEnum }
     *     
     */
    public void setConnectorFormat(_ConnectorFormatTypeEnum value) {
        this.connectorFormat = value;
    }

    /**
     * Gets the value of the maxPowerAtSocket property.
     * 
     */
    public float getMaxPowerAtSocket() {
        return maxPowerAtSocket;
    }

    /**
     * Sets the value of the maxPowerAtSocket property.
     * 
     */
    public void setMaxPowerAtSocket(float value) {
        this.maxPowerAtSocket = value;
    }

    /**
     * Gets the value of the voltage property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVoltage() {
        return voltage;
    }

    /**
     * Sets the value of the voltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVoltage(Float value) {
        this.voltage = value;
    }

    /**
     * Gets the value of the maximumCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaximumCurrent() {
        return maximumCurrent;
    }

    /**
     * Sets the value of the maximumCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaximumCurrent(Float value) {
        this.maximumCurrent = value;
    }

    /**
     * Gets the value of the _ConnectorExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_ConnectorExtension() {
        return _ConnectorExtension;
    }

    /**
     * Sets the value of the _ConnectorExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_ConnectorExtension(_ExtensionType value) {
        this._ConnectorExtension = value;
    }

}
