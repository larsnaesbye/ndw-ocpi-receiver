
package eu.datex.exchangeinformation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for OperatingModeEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="OperatingModeEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="onOccurrence"/&amp;gt;
 *     &amp;lt;enumeration value="periodic"/&amp;gt;
 *     &amp;lt;enumeration value="_extended"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "OperatingModeEnum")
@XmlEnum
public enum OperatingModeEnum {

    @XmlEnumValue("onOccurrence")
    ON_OCCURRENCE("onOccurrence"),
    @XmlEnumValue("periodic")
    PERIODIC("periodic"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    OperatingModeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperatingModeEnum fromValue(String v) {
        for (OperatingModeEnum c: OperatingModeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
