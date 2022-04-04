
package eu.datex.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for _VehicleEquipmentEnum complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="_VehicleEquipmentEnum"&amp;gt;
 *   &amp;lt;simpleContent&amp;gt;
 *     &amp;lt;extension base="&amp;lt;http://datex2.eu/schema/3/common&amp;gt;VehicleEquipmentEnum"&amp;gt;
 *       &amp;lt;attribute name="_extendedValue" type="{http://datex2.eu/schema/3/common}_VehicleEquipmentEnumExtensionType" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/simpleContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_VehicleEquipmentEnum", propOrder = {
    "value"
})
@ToString
@EqualsAndHashCode
public class _VehicleEquipmentEnum {

    @XmlValue
    protected VehicleEquipmentEnum value;
    @XmlAttribute(name = "_extendedValue")
    protected String _ExtendedValue;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleEquipmentEnum }
     *     
     */
    public VehicleEquipmentEnum getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleEquipmentEnum }
     *     
     */
    public void setValue(VehicleEquipmentEnum value) {
        this.value = value;
    }

    /**
     * Gets the value of the _ExtendedValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get_ExtendedValue() {
        return _ExtendedValue;
    }

    /**
     * Sets the value of the _ExtendedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set_ExtendedValue(String value) {
        this._ExtendedValue = value;
    }

}
