
package eu.datex.exchangeinformation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for MessageTypeEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="MessageTypeEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="payloadDelivery"/&amp;gt;
 *     &amp;lt;enumeration value="openSession"/&amp;gt;
 *     &amp;lt;enumeration value="keepAlive"/&amp;gt;
 *     &amp;lt;enumeration value="closeSession"/&amp;gt;
 *     &amp;lt;enumeration value="return"/&amp;gt;
 *     &amp;lt;enumeration value="_extended"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "MessageTypeEnum")
@XmlEnum
public enum MessageTypeEnum {

    @XmlEnumValue("payloadDelivery")
    PAYLOAD_DELIVERY("payloadDelivery"),
    @XmlEnumValue("openSession")
    OPEN_SESSION("openSession"),
    @XmlEnumValue("keepAlive")
    KEEP_ALIVE("keepAlive"),
    @XmlEnumValue("closeSession")
    CLOSE_SESSION("closeSession"),
    @XmlEnumValue("return")
    RETURN("return"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    MessageTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageTypeEnum fromValue(String v) {
        for (MessageTypeEnum c: MessageTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
