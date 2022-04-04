
package eu.datex.energyinfrastructure;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ChargingModeEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ChargingModeEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="mode1AC1p"/&amp;gt;
 *     &amp;lt;enumeration value="mode1AC3p"/&amp;gt;
 *     &amp;lt;enumeration value="mode2AC1p"/&amp;gt;
 *     &amp;lt;enumeration value="mode2AC3p"/&amp;gt;
 *     &amp;lt;enumeration value="mode3AC3p"/&amp;gt;
 *     &amp;lt;enumeration value="mode4DC"/&amp;gt;
 *     &amp;lt;enumeration value="legacyInductive"/&amp;gt;
 *     &amp;lt;enumeration value="ccs"/&amp;gt;
 *     &amp;lt;enumeration value="other"/&amp;gt;
 *     &amp;lt;enumeration value="unknown"/&amp;gt;
 *     &amp;lt;enumeration value="_extended"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "ChargingModeEnum")
@XmlEnum
public enum ChargingModeEnum {

    @XmlEnumValue("mode1AC1p")
    MODE_1_AC_1_P("mode1AC1p"),
    @XmlEnumValue("mode1AC3p")
    MODE_1_AC_3_P("mode1AC3p"),
    @XmlEnumValue("mode2AC1p")
    MODE_2_AC_1_P("mode2AC1p"),
    @XmlEnumValue("mode2AC3p")
    MODE_2_AC_3_P("mode2AC3p"),
    @XmlEnumValue("mode3AC3p")
    MODE_3_AC_3_P("mode3AC3p"),
    @XmlEnumValue("mode4DC")
    MODE_4_DC("mode4DC"),
    @XmlEnumValue("legacyInductive")
    LEGACY_INDUCTIVE("legacyInductive"),
    @XmlEnumValue("ccs")
    CCS("ccs"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    ChargingModeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChargingModeEnum fromValue(String v) {
        for (ChargingModeEnum c: ChargingModeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
