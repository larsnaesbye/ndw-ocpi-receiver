
package eu.datex.energyinfrastructure;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ConnectorTypeEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ConnectorTypeEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="chademo"/&amp;gt;
 *     &amp;lt;enumeration value="cee3"/&amp;gt;
 *     &amp;lt;enumeration value="cee5"/&amp;gt;
 *     &amp;lt;enumeration value="yazaki"/&amp;gt;
 *     &amp;lt;enumeration value="domestic"/&amp;gt;
 *     &amp;lt;enumeration value="domesticA"/&amp;gt;
 *     &amp;lt;enumeration value="domesticB"/&amp;gt;
 *     &amp;lt;enumeration value="domesticC"/&amp;gt;
 *     &amp;lt;enumeration value="domesticD"/&amp;gt;
 *     &amp;lt;enumeration value="domesticE"/&amp;gt;
 *     &amp;lt;enumeration value="domesticF"/&amp;gt;
 *     &amp;lt;enumeration value="domesticG"/&amp;gt;
 *     &amp;lt;enumeration value="domesticH"/&amp;gt;
 *     &amp;lt;enumeration value="domesticI"/&amp;gt;
 *     &amp;lt;enumeration value="domesticJ"/&amp;gt;
 *     &amp;lt;enumeration value="domesticK"/&amp;gt;
 *     &amp;lt;enumeration value="domesticL"/&amp;gt;
 *     &amp;lt;enumeration value="domesticM"/&amp;gt;
 *     &amp;lt;enumeration value="domesticN"/&amp;gt;
 *     &amp;lt;enumeration value="domesticO"/&amp;gt;
 *     &amp;lt;enumeration value="iec60309x2single16"/&amp;gt;
 *     &amp;lt;enumeration value="iec60309x2three16"/&amp;gt;
 *     &amp;lt;enumeration value="iec60309x2three32"/&amp;gt;
 *     &amp;lt;enumeration value="iec60309x2three64"/&amp;gt;
 *     &amp;lt;enumeration value="iec62196T1"/&amp;gt;
 *     &amp;lt;enumeration value="iec62196T1COMBO"/&amp;gt;
 *     &amp;lt;enumeration value="iec62196T2"/&amp;gt;
 *     &amp;lt;enumeration value="iec62196T2COMBO"/&amp;gt;
 *     &amp;lt;enumeration value="iec62196T3A"/&amp;gt;
 *     &amp;lt;enumeration value="iec62196T3C"/&amp;gt;
 *     &amp;lt;enumeration value="pantographBottomUp"/&amp;gt;
 *     &amp;lt;enumeration value="pantographTopDown"/&amp;gt;
 *     &amp;lt;enumeration value="teslaConnectorEurope"/&amp;gt;
 *     &amp;lt;enumeration value="teslaConnectorAmerica"/&amp;gt;
 *     &amp;lt;enumeration value="teslaR"/&amp;gt;
 *     &amp;lt;enumeration value="teslaS"/&amp;gt;
 *     &amp;lt;enumeration value="other"/&amp;gt;
 *     &amp;lt;enumeration value="_extended"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "ConnectorTypeEnum")
@XmlEnum
public enum ConnectorTypeEnum {

    @XmlEnumValue("chademo")
    CHADEMO("chademo"),
    @XmlEnumValue("cee3")
    CEE_3("cee3"),
    @XmlEnumValue("cee5")
    CEE_5("cee5"),
    @XmlEnumValue("yazaki")
    YAZAKI("yazaki"),
    @XmlEnumValue("domestic")
    DOMESTIC("domestic"),
    @XmlEnumValue("domesticA")
    DOMESTIC_A("domesticA"),
    @XmlEnumValue("domesticB")
    DOMESTIC_B("domesticB"),
    @XmlEnumValue("domesticC")
    DOMESTIC_C("domesticC"),
    @XmlEnumValue("domesticD")
    DOMESTIC_D("domesticD"),
    @XmlEnumValue("domesticE")
    DOMESTIC_E("domesticE"),
    @XmlEnumValue("domesticF")
    DOMESTIC_F("domesticF"),
    @XmlEnumValue("domesticG")
    DOMESTIC_G("domesticG"),
    @XmlEnumValue("domesticH")
    DOMESTIC_H("domesticH"),
    @XmlEnumValue("domesticI")
    DOMESTIC_I("domesticI"),
    @XmlEnumValue("domesticJ")
    DOMESTIC_J("domesticJ"),
    @XmlEnumValue("domesticK")
    DOMESTIC_K("domesticK"),
    @XmlEnumValue("domesticL")
    DOMESTIC_L("domesticL"),
    @XmlEnumValue("domesticM")
    DOMESTIC_M("domesticM"),
    @XmlEnumValue("domesticN")
    DOMESTIC_N("domesticN"),
    @XmlEnumValue("domesticO")
    DOMESTIC_O("domesticO"),
    @XmlEnumValue("iec60309x2single16")
    IEC_60309_X_2_SINGLE_16("iec60309x2single16"),
    @XmlEnumValue("iec60309x2three16")
    IEC_60309_X_2_THREE_16("iec60309x2three16"),
    @XmlEnumValue("iec60309x2three32")
    IEC_60309_X_2_THREE_32("iec60309x2three32"),
    @XmlEnumValue("iec60309x2three64")
    IEC_60309_X_2_THREE_64("iec60309x2three64"),
    @XmlEnumValue("iec62196T1")
    IEC_62196_T_1("iec62196T1"),
    @XmlEnumValue("iec62196T1COMBO")
    IEC_62196_T_1_COMBO("iec62196T1COMBO"),
    @XmlEnumValue("iec62196T2")
    IEC_62196_T_2("iec62196T2"),
    @XmlEnumValue("iec62196T2COMBO")
    IEC_62196_T_2_COMBO("iec62196T2COMBO"),
    @XmlEnumValue("iec62196T3A")
    IEC_62196_T_3_A("iec62196T3A"),
    @XmlEnumValue("iec62196T3C")
    IEC_62196_T_3_C("iec62196T3C"),
    @XmlEnumValue("pantographBottomUp")
    PANTOGRAPH_BOTTOM_UP("pantographBottomUp"),
    @XmlEnumValue("pantographTopDown")
    PANTOGRAPH_TOP_DOWN("pantographTopDown"),
    @XmlEnumValue("teslaConnectorEurope")
    TESLA_CONNECTOR_EUROPE("teslaConnectorEurope"),
    @XmlEnumValue("teslaConnectorAmerica")
    TESLA_CONNECTOR_AMERICA("teslaConnectorAmerica"),
    @XmlEnumValue("teslaR")
    TESLA_R("teslaR"),
    @XmlEnumValue("teslaS")
    TESLA_S("teslaS"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    ConnectorTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConnectorTypeEnum fromValue(String v) {
        for (ConnectorTypeEnum c: ConnectorTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
