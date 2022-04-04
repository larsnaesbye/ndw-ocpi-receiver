
package eu.datex.locationreferencing;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for TpegLoc04HeightTypeEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="TpegLoc04HeightTypeEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="_extended"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "TpegLoc04HeightTypeEnum")
@XmlEnum
public enum TpegLoc04HeightTypeEnum {

    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    TpegLoc04HeightTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpegLoc04HeightTypeEnum fromValue(String v) {
        for (TpegLoc04HeightTypeEnum c: TpegLoc04HeightTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
