
package eu.datex.exchangeinformation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for UpdateMethodEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="UpdateMethodEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="allElementUpdate"/&amp;gt;
 *     &amp;lt;enumeration value="allInformationUpdate"/&amp;gt;
 *     &amp;lt;enumeration value="snapshot"/&amp;gt;
 *     &amp;lt;enumeration value="_extended"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "UpdateMethodEnum")
@XmlEnum
public enum UpdateMethodEnum {

    @XmlEnumValue("allElementUpdate")
    ALL_ELEMENT_UPDATE("allElementUpdate"),
    @XmlEnumValue("allInformationUpdate")
    ALL_INFORMATION_UPDATE("allInformationUpdate"),
    @XmlEnumValue("snapshot")
    SNAPSHOT("snapshot"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    UpdateMethodEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UpdateMethodEnum fromValue(String v) {
        for (UpdateMethodEnum c: UpdateMethodEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
