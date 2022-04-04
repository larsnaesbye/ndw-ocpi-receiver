
package eu.datex.energyinfrastructure;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AuthenticationAndIdentificationEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="AuthenticationAndIdentificationEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="activeRFIDChip"/&amp;gt;
 *     &amp;lt;enumeration value="apps"/&amp;gt;
 *     &amp;lt;enumeration value="calypso"/&amp;gt;
 *     &amp;lt;enumeration value="cashPayment"/&amp;gt;
 *     &amp;lt;enumeration value="creditCard"/&amp;gt;
 *     &amp;lt;enumeration value="debitCard"/&amp;gt;
 *     &amp;lt;enumeration value="mifareClassic"/&amp;gt;
 *     &amp;lt;enumeration value="mifareDesfire"/&amp;gt;
 *     &amp;lt;enumeration value="nfc"/&amp;gt;
 *     &amp;lt;enumeration value="overTheAir"/&amp;gt;
 *     &amp;lt;enumeration value="phoneDialog"/&amp;gt;
 *     &amp;lt;enumeration value="phoneSMS"/&amp;gt;
 *     &amp;lt;enumeration value="pinpad"/&amp;gt;
 *     &amp;lt;enumeration value="plc"/&amp;gt;
 *     &amp;lt;enumeration value="prepaidCard"/&amp;gt;
 *     &amp;lt;enumeration value="rfid"/&amp;gt;
 *     &amp;lt;enumeration value="website"/&amp;gt;
 *     &amp;lt;enumeration value="unlimitedAccess"/&amp;gt;
 *     &amp;lt;enumeration value="noAccess"/&amp;gt;
 *     &amp;lt;enumeration value="_extended"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "AuthenticationAndIdentificationEnum")
@XmlEnum
public enum AuthenticationAndIdentificationEnum {

    @XmlEnumValue("activeRFIDChip")
    ACTIVE_RFID_CHIP("activeRFIDChip"),
    @XmlEnumValue("apps")
    APPS("apps"),
    @XmlEnumValue("calypso")
    CALYPSO("calypso"),
    @XmlEnumValue("cashPayment")
    CASH_PAYMENT("cashPayment"),
    @XmlEnumValue("creditCard")
    CREDIT_CARD("creditCard"),
    @XmlEnumValue("debitCard")
    DEBIT_CARD("debitCard"),
    @XmlEnumValue("mifareClassic")
    MIFARE_CLASSIC("mifareClassic"),
    @XmlEnumValue("mifareDesfire")
    MIFARE_DESFIRE("mifareDesfire"),
    @XmlEnumValue("nfc")
    NFC("nfc"),
    @XmlEnumValue("overTheAir")
    OVER_THE_AIR("overTheAir"),
    @XmlEnumValue("phoneDialog")
    PHONE_DIALOG("phoneDialog"),
    @XmlEnumValue("phoneSMS")
    PHONE_SMS("phoneSMS"),
    @XmlEnumValue("pinpad")
    PINPAD("pinpad"),
    @XmlEnumValue("plc")
    PLC("plc"),
    @XmlEnumValue("prepaidCard")
    PREPAID_CARD("prepaidCard"),
    @XmlEnumValue("rfid")
    RFID("rfid"),
    @XmlEnumValue("website")
    WEBSITE("website"),
    @XmlEnumValue("unlimitedAccess")
    UNLIMITED_ACCESS("unlimitedAccess"),
    @XmlEnumValue("noAccess")
    NO_ACCESS("noAccess"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    AuthenticationAndIdentificationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthenticationAndIdentificationEnum fromValue(String v) {
        for (AuthenticationAndIdentificationEnum c: AuthenticationAndIdentificationEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
