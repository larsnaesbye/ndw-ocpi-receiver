
package eu.datex.facilities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for UserTypeEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="UserTypeEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="allUsers"/&amp;gt;
 *     &amp;lt;enumeration value="commuters"/&amp;gt;
 *     &amp;lt;enumeration value="customers"/&amp;gt;
 *     &amp;lt;enumeration value="elderlyUsers"/&amp;gt;
 *     &amp;lt;enumeration value="employees"/&amp;gt;
 *     &amp;lt;enumeration value="families"/&amp;gt;
 *     &amp;lt;enumeration value="hearingImpaired"/&amp;gt;
 *     &amp;lt;enumeration value="hotelGuests"/&amp;gt;
 *     &amp;lt;enumeration value="longTermParkers"/&amp;gt;
 *     &amp;lt;enumeration value="members"/&amp;gt;
 *     &amp;lt;enumeration value="men"/&amp;gt;
 *     &amp;lt;enumeration value="overnightParkers"/&amp;gt;
 *     &amp;lt;enumeration value="parkAndCycleUser"/&amp;gt;
 *     &amp;lt;enumeration value="parkAndRideUsers"/&amp;gt;
 *     &amp;lt;enumeration value="parkAndWalkUser"/&amp;gt;
 *     &amp;lt;enumeration value="pensioners"/&amp;gt;
 *     &amp;lt;enumeration value="pregnantWomen"/&amp;gt;
 *     &amp;lt;enumeration value="registeredDisabledUsers"/&amp;gt;
 *     &amp;lt;enumeration value="reservationHolders"/&amp;gt;
 *     &amp;lt;enumeration value="residents"/&amp;gt;
 *     &amp;lt;enumeration value="seasonTicketHolders"/&amp;gt;
 *     &amp;lt;enumeration value="shoppers"/&amp;gt;
 *     &amp;lt;enumeration value="shortTermParkers"/&amp;gt;
 *     &amp;lt;enumeration value="sportEventAwaySupporters"/&amp;gt;
 *     &amp;lt;enumeration value="sportEventHomeSupporters"/&amp;gt;
 *     &amp;lt;enumeration value="students"/&amp;gt;
 *     &amp;lt;enumeration value="staff"/&amp;gt;
 *     &amp;lt;enumeration value="subscribers"/&amp;gt;
 *     &amp;lt;enumeration value="visitors"/&amp;gt;
 *     &amp;lt;enumeration value="visuallyImpaired"/&amp;gt;
 *     &amp;lt;enumeration value="wheelchairUsers"/&amp;gt;
 *     &amp;lt;enumeration value="women"/&amp;gt;
 *     &amp;lt;enumeration value="unknown"/&amp;gt;
 *     &amp;lt;enumeration value="other"/&amp;gt;
 *     &amp;lt;enumeration value="_extended"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "UserTypeEnum")
@XmlEnum
public enum UserTypeEnum {

    @XmlEnumValue("allUsers")
    ALL_USERS("allUsers"),
    @XmlEnumValue("commuters")
    COMMUTERS("commuters"),
    @XmlEnumValue("customers")
    CUSTOMERS("customers"),
    @XmlEnumValue("elderlyUsers")
    ELDERLY_USERS("elderlyUsers"),
    @XmlEnumValue("employees")
    EMPLOYEES("employees"),
    @XmlEnumValue("families")
    FAMILIES("families"),
    @XmlEnumValue("hearingImpaired")
    HEARING_IMPAIRED("hearingImpaired"),
    @XmlEnumValue("hotelGuests")
    HOTEL_GUESTS("hotelGuests"),
    @XmlEnumValue("longTermParkers")
    LONG_TERM_PARKERS("longTermParkers"),
    @XmlEnumValue("members")
    MEMBERS("members"),
    @XmlEnumValue("men")
    MEN("men"),
    @XmlEnumValue("overnightParkers")
    OVERNIGHT_PARKERS("overnightParkers"),
    @XmlEnumValue("parkAndCycleUser")
    PARK_AND_CYCLE_USER("parkAndCycleUser"),
    @XmlEnumValue("parkAndRideUsers")
    PARK_AND_RIDE_USERS("parkAndRideUsers"),
    @XmlEnumValue("parkAndWalkUser")
    PARK_AND_WALK_USER("parkAndWalkUser"),
    @XmlEnumValue("pensioners")
    PENSIONERS("pensioners"),
    @XmlEnumValue("pregnantWomen")
    PREGNANT_WOMEN("pregnantWomen"),
    @XmlEnumValue("registeredDisabledUsers")
    REGISTERED_DISABLED_USERS("registeredDisabledUsers"),
    @XmlEnumValue("reservationHolders")
    RESERVATION_HOLDERS("reservationHolders"),
    @XmlEnumValue("residents")
    RESIDENTS("residents"),
    @XmlEnumValue("seasonTicketHolders")
    SEASON_TICKET_HOLDERS("seasonTicketHolders"),
    @XmlEnumValue("shoppers")
    SHOPPERS("shoppers"),
    @XmlEnumValue("shortTermParkers")
    SHORT_TERM_PARKERS("shortTermParkers"),
    @XmlEnumValue("sportEventAwaySupporters")
    SPORT_EVENT_AWAY_SUPPORTERS("sportEventAwaySupporters"),
    @XmlEnumValue("sportEventHomeSupporters")
    SPORT_EVENT_HOME_SUPPORTERS("sportEventHomeSupporters"),
    @XmlEnumValue("students")
    STUDENTS("students"),
    @XmlEnumValue("staff")
    STAFF("staff"),
    @XmlEnumValue("subscribers")
    SUBSCRIBERS("subscribers"),
    @XmlEnumValue("visitors")
    VISITORS("visitors"),
    @XmlEnumValue("visuallyImpaired")
    VISUALLY_IMPAIRED("visuallyImpaired"),
    @XmlEnumValue("wheelchairUsers")
    WHEELCHAIR_USERS("wheelchairUsers"),
    @XmlEnumValue("women")
    WOMEN("women"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    UserTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserTypeEnum fromValue(String v) {
        for (UserTypeEnum c: UserTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
