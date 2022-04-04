
package eu.datex.exchangeinformation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ExchangeReturnEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ExchangeReturnEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="ack"/&amp;gt;
 *     &amp;lt;enumeration value="closeSessionRequest"/&amp;gt;
 *     &amp;lt;enumeration value="fail"/&amp;gt;
 *     &amp;lt;enumeration value="snapshotSynchronisationRequest"/&amp;gt;
 *     &amp;lt;enumeration value="_extended"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "ExchangeReturnEnum")
@XmlEnum
public enum ExchangeReturnEnum {

    @XmlEnumValue("ack")
    ACK("ack"),
    @XmlEnumValue("closeSessionRequest")
    CLOSE_SESSION_REQUEST("closeSessionRequest"),
    @XmlEnumValue("fail")
    FAIL("fail"),
    @XmlEnumValue("snapshotSynchronisationRequest")
    SNAPSHOT_SYNCHRONISATION_REQUEST("snapshotSynchronisationRequest"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    ExchangeReturnEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExchangeReturnEnum fromValue(String v) {
        for (ExchangeReturnEnum c: ExchangeReturnEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
