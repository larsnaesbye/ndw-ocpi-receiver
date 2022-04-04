
package eu.datex.energyinfrastructure;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for RefillPointStatusEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="RefillPointStatusEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="available"/&amp;gt;
 *     &amp;lt;enumeration value="blocked"/&amp;gt;
 *     &amp;lt;enumeration value="charging"/&amp;gt;
 *     &amp;lt;enumeration value="faulted"/&amp;gt;
 *     &amp;lt;enumeration value="inoperative"/&amp;gt;
 *     &amp;lt;enumeration value="occupied"/&amp;gt;
 *     &amp;lt;enumeration value="outOfOrder"/&amp;gt;
 *     &amp;lt;enumeration value="outOfStock"/&amp;gt;
 *     &amp;lt;enumeration value="planned"/&amp;gt;
 *     &amp;lt;enumeration value="removed"/&amp;gt;
 *     &amp;lt;enumeration value="reserved"/&amp;gt;
 *     &amp;lt;enumeration value="unavailable"/&amp;gt;
 *     &amp;lt;enumeration value="unknown"/&amp;gt;
 *     &amp;lt;enumeration value="_extended"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "RefillPointStatusEnum")
@XmlEnum
public enum RefillPointStatusEnum {

    @XmlEnumValue("available")
    AVAILABLE("available"),
    @XmlEnumValue("blocked")
    BLOCKED("blocked"),
    @XmlEnumValue("charging")
    CHARGING("charging"),
    @XmlEnumValue("faulted")
    FAULTED("faulted"),
    @XmlEnumValue("inoperative")
    INOPERATIVE("inoperative"),
    @XmlEnumValue("occupied")
    OCCUPIED("occupied"),
    @XmlEnumValue("outOfOrder")
    OUT_OF_ORDER("outOfOrder"),
    @XmlEnumValue("outOfStock")
    OUT_OF_STOCK("outOfStock"),
    @XmlEnumValue("planned")
    PLANNED("planned"),
    @XmlEnumValue("removed")
    REMOVED("removed"),
    @XmlEnumValue("reserved")
    RESERVED("reserved"),
    @XmlEnumValue("unavailable")
    UNAVAILABLE("unavailable"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    RefillPointStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefillPointStatusEnum fromValue(String v) {
        for (RefillPointStatusEnum c: RefillPointStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
