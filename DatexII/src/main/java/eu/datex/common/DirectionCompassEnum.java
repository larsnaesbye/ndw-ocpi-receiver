
package eu.datex.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for DirectionCompassEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="DirectionCompassEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="east"/&amp;gt;
 *     &amp;lt;enumeration value="eastNorthEast"/&amp;gt;
 *     &amp;lt;enumeration value="eastSouthEast"/&amp;gt;
 *     &amp;lt;enumeration value="north"/&amp;gt;
 *     &amp;lt;enumeration value="northEast"/&amp;gt;
 *     &amp;lt;enumeration value="northNorthEast"/&amp;gt;
 *     &amp;lt;enumeration value="northNorthWest"/&amp;gt;
 *     &amp;lt;enumeration value="northWest"/&amp;gt;
 *     &amp;lt;enumeration value="south"/&amp;gt;
 *     &amp;lt;enumeration value="southEast"/&amp;gt;
 *     &amp;lt;enumeration value="southSouthEast"/&amp;gt;
 *     &amp;lt;enumeration value="southSouthWest"/&amp;gt;
 *     &amp;lt;enumeration value="southWest"/&amp;gt;
 *     &amp;lt;enumeration value="west"/&amp;gt;
 *     &amp;lt;enumeration value="westNorthWest"/&amp;gt;
 *     &amp;lt;enumeration value="westSouthWest"/&amp;gt;
 *     &amp;lt;enumeration value="_extended"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "DirectionCompassEnum")
@XmlEnum
public enum DirectionCompassEnum {

    @XmlEnumValue("east")
    EAST("east"),
    @XmlEnumValue("eastNorthEast")
    EAST_NORTH_EAST("eastNorthEast"),
    @XmlEnumValue("eastSouthEast")
    EAST_SOUTH_EAST("eastSouthEast"),
    @XmlEnumValue("north")
    NORTH("north"),
    @XmlEnumValue("northEast")
    NORTH_EAST("northEast"),
    @XmlEnumValue("northNorthEast")
    NORTH_NORTH_EAST("northNorthEast"),
    @XmlEnumValue("northNorthWest")
    NORTH_NORTH_WEST("northNorthWest"),
    @XmlEnumValue("northWest")
    NORTH_WEST("northWest"),
    @XmlEnumValue("south")
    SOUTH("south"),
    @XmlEnumValue("southEast")
    SOUTH_EAST("southEast"),
    @XmlEnumValue("southSouthEast")
    SOUTH_SOUTH_EAST("southSouthEast"),
    @XmlEnumValue("southSouthWest")
    SOUTH_SOUTH_WEST("southSouthWest"),
    @XmlEnumValue("southWest")
    SOUTH_WEST("southWest"),
    @XmlEnumValue("west")
    WEST("west"),
    @XmlEnumValue("westNorthWest")
    WEST_NORTH_WEST("westNorthWest"),
    @XmlEnumValue("westSouthWest")
    WEST_SOUTH_WEST("westSouthWest"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    DirectionCompassEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DirectionCompassEnum fromValue(String v) {
        for (DirectionCompassEnum c: DirectionCompassEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
