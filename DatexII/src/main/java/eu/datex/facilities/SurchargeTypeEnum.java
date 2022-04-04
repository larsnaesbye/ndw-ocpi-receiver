
package eu.datex.facilities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SurchargeTypeEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="SurchargeTypeEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="_extended"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "SurchargeTypeEnum")
@XmlEnum
public enum SurchargeTypeEnum {

    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    SurchargeTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SurchargeTypeEnum fromValue(String v) {
        for (SurchargeTypeEnum c: SurchargeTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
