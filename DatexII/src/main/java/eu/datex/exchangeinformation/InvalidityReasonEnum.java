
package eu.datex.exchangeinformation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for InvalidityReasonEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="InvalidityReasonEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="invalidExchangeContext"/&amp;gt;
 *     &amp;lt;enumeration value="invalidInformationManagement"/&amp;gt;
 *     &amp;lt;enumeration value="invalidMessage"/&amp;gt;
 *     &amp;lt;enumeration value="invalidPayload"/&amp;gt;
 *     &amp;lt;enumeration value="invalidSession"/&amp;gt;
 *     &amp;lt;enumeration value="other"/&amp;gt;
 *     &amp;lt;enumeration value="invalidClient"/&amp;gt;
 *     &amp;lt;enumeration value="invalidSupplier"/&amp;gt;
 *     &amp;lt;enumeration value="_extended"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "InvalidityReasonEnum")
@XmlEnum
public enum InvalidityReasonEnum {

    @XmlEnumValue("invalidExchangeContext")
    INVALID_EXCHANGE_CONTEXT("invalidExchangeContext"),
    @XmlEnumValue("invalidInformationManagement")
    INVALID_INFORMATION_MANAGEMENT("invalidInformationManagement"),
    @XmlEnumValue("invalidMessage")
    INVALID_MESSAGE("invalidMessage"),
    @XmlEnumValue("invalidPayload")
    INVALID_PAYLOAD("invalidPayload"),
    @XmlEnumValue("invalidSession")
    INVALID_SESSION("invalidSession"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("invalidClient")
    INVALID_CLIENT("invalidClient"),
    @XmlEnumValue("invalidSupplier")
    INVALID_SUPPLIER("invalidSupplier"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    InvalidityReasonEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvalidityReasonEnum fromValue(String v) {
        for (InvalidityReasonEnum c: InvalidityReasonEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
