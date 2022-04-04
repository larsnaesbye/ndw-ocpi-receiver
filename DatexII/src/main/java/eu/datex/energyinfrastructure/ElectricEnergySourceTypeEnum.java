
package eu.datex.energyinfrastructure;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ElectricEnergySourceTypeEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ElectricEnergySourceTypeEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="biogas"/&amp;gt;
 *     &amp;lt;enumeration value="coal"/&amp;gt;
 *     &amp;lt;enumeration value="gas"/&amp;gt;
 *     &amp;lt;enumeration value="nuclear"/&amp;gt;
 *     &amp;lt;enumeration value="solar"/&amp;gt;
 *     &amp;lt;enumeration value="water"/&amp;gt;
 *     &amp;lt;enumeration value="wind"/&amp;gt;
 *     &amp;lt;enumeration value="generalGreen"/&amp;gt;
 *     &amp;lt;enumeration value="generalFossil"/&amp;gt;
 *     &amp;lt;enumeration value="other"/&amp;gt;
 *     &amp;lt;enumeration value="_extended"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "ElectricEnergySourceTypeEnum")
@XmlEnum
public enum ElectricEnergySourceTypeEnum {

    @XmlEnumValue("biogas")
    BIOGAS("biogas"),
    @XmlEnumValue("coal")
    COAL("coal"),
    @XmlEnumValue("gas")
    GAS("gas"),
    @XmlEnumValue("nuclear")
    NUCLEAR("nuclear"),
    @XmlEnumValue("solar")
    SOLAR("solar"),
    @XmlEnumValue("water")
    WATER("water"),
    @XmlEnumValue("wind")
    WIND("wind"),
    @XmlEnumValue("generalGreen")
    GENERAL_GREEN("generalGreen"),
    @XmlEnumValue("generalFossil")
    GENERAL_FOSSIL("generalFossil"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    ElectricEnergySourceTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ElectricEnergySourceTypeEnum fromValue(String v) {
        for (ElectricEnergySourceTypeEnum c: ElectricEnergySourceTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
