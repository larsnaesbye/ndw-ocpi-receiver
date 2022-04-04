
package eu.datex.locationextension;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AddressLineTypeEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="AddressLineTypeEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="street"/&amp;gt;
 *     &amp;lt;enumeration value="houseNumber"/&amp;gt;
 *     &amp;lt;enumeration value="_extended"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "AddressLineTypeEnum")
@XmlEnum
public enum AddressLineTypeEnum {

    @XmlEnumValue("street")
    STREET("street"),
    @XmlEnumValue("houseNumber")
    HOUSE_NUMBER("houseNumber"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    AddressLineTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AddressLineTypeEnum fromValue(String v) {
        for (AddressLineTypeEnum c: AddressLineTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
