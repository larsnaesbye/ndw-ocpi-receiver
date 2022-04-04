
package eu.datex.exchangeinformation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ProtocolTypeEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ProtocolTypeEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="simplePush"/&amp;gt;
 *     &amp;lt;enumeration value="snapshotPull"/&amp;gt;
 *     &amp;lt;enumeration value="snapshotPush"/&amp;gt;
 *     &amp;lt;enumeration value="statefulPush"/&amp;gt;
 *     &amp;lt;enumeration value="_extended"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "ProtocolTypeEnum")
@XmlEnum
public enum ProtocolTypeEnum {

    @XmlEnumValue("simplePush")
    SIMPLE_PUSH("simplePush"),
    @XmlEnumValue("snapshotPull")
    SNAPSHOT_PULL("snapshotPull"),
    @XmlEnumValue("snapshotPush")
    SNAPSHOT_PUSH("snapshotPush"),
    @XmlEnumValue("statefulPush")
    STATEFUL_PUSH("statefulPush"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    ProtocolTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProtocolTypeEnum fromValue(String v) {
        for (ProtocolTypeEnum c: ProtocolTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
