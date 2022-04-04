
package eu.datex.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for InstanceOfDayEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="InstanceOfDayEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="_extended"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "InstanceOfDayEnum")
@XmlEnum
public enum InstanceOfDayEnum {

    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    InstanceOfDayEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InstanceOfDayEnum fromValue(String v) {
        for (InstanceOfDayEnum c: InstanceOfDayEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
