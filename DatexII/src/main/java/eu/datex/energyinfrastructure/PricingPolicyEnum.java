
package eu.datex.energyinfrastructure;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for PricingPolicyEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="PricingPolicyEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="pricePerChargingTime"/&amp;gt;
 *     &amp;lt;enumeration value="pricePerDeliveryUnit"/&amp;gt;
 *     &amp;lt;enumeration value="contract"/&amp;gt;
 *     &amp;lt;enumeration value="flatRate"/&amp;gt;
 *     &amp;lt;enumeration value="unknown"/&amp;gt;
 *     &amp;lt;enumeration value="free"/&amp;gt;
 *     &amp;lt;enumeration value="other"/&amp;gt;
 *     &amp;lt;enumeration value="_extended"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "PricingPolicyEnum")
@XmlEnum
public enum PricingPolicyEnum {

    @XmlEnumValue("pricePerChargingTime")
    PRICE_PER_CHARGING_TIME("pricePerChargingTime"),
    @XmlEnumValue("pricePerDeliveryUnit")
    PRICE_PER_DELIVERY_UNIT("pricePerDeliveryUnit"),
    @XmlEnumValue("contract")
    CONTRACT("contract"),
    @XmlEnumValue("flatRate")
    FLAT_RATE("flatRate"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("free")
    FREE("free"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    PricingPolicyEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PricingPolicyEnum fromValue(String v) {
        for (PricingPolicyEnum c: PricingPolicyEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
