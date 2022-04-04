
package eu.datex.informationmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ManagementTypeEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ManagementTypeEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="cancelled"/&amp;gt;
 *     &amp;lt;enumeration value="closed"/&amp;gt;
 *     &amp;lt;enumeration value="_extended"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "ManagementTypeEnum")
@XmlEnum
public enum ManagementTypeEnum {

    @XmlEnumValue("cancelled")
    CANCELLED("cancelled"),
    @XmlEnumValue("closed")
    CLOSED("closed"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    ManagementTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ManagementTypeEnum fromValue(String v) {
        for (ManagementTypeEnum c: ManagementTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
