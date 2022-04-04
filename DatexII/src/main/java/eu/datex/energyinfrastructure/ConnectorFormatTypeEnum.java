
package eu.datex.energyinfrastructure;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ConnectorFormatTypeEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ConnectorFormatTypeEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="cableMode2"/&amp;gt;
 *     &amp;lt;enumeration value="cableMode3"/&amp;gt;
 *     &amp;lt;enumeration value="otherCable"/&amp;gt;
 *     &amp;lt;enumeration value="socket"/&amp;gt;
 *     &amp;lt;enumeration value="_extended"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "ConnectorFormatTypeEnum")
@XmlEnum
public enum ConnectorFormatTypeEnum {

    @XmlEnumValue("cableMode2")
    CABLE_MODE_2("cableMode2"),
    @XmlEnumValue("cableMode3")
    CABLE_MODE_3("cableMode3"),
    @XmlEnumValue("otherCable")
    OTHER_CABLE("otherCable"),
    @XmlEnumValue("socket")
    SOCKET("socket"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    ConnectorFormatTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConnectorFormatTypeEnum fromValue(String v) {
        for (ConnectorFormatTypeEnum c: ConnectorFormatTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
