
package eu.datex.exchangeinformation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ExchangeStatusEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ExchangeStatusEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="closingSession"/&amp;gt;
 *     &amp;lt;enumeration value="offline"/&amp;gt;
 *     &amp;lt;enumeration value="online"/&amp;gt;
 *     &amp;lt;enumeration value="openingSession"/&amp;gt;
 *     &amp;lt;enumeration value="resuming"/&amp;gt;
 *     &amp;lt;enumeration value="undefined"/&amp;gt;
 *     &amp;lt;enumeration value="_extended"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "ExchangeStatusEnum")
@XmlEnum
public enum ExchangeStatusEnum {

    @XmlEnumValue("closingSession")
    CLOSING_SESSION("closingSession"),
    @XmlEnumValue("offline")
    OFFLINE("offline"),
    @XmlEnumValue("online")
    ONLINE("online"),
    @XmlEnumValue("openingSession")
    OPENING_SESSION("openingSession"),
    @XmlEnumValue("resuming")
    RESUMING("resuming"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    ExchangeStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExchangeStatusEnum fromValue(String v) {
        for (ExchangeStatusEnum c: ExchangeStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
