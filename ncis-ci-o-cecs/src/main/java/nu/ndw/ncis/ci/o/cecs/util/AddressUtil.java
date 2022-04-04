package nu.ndw.ncis.ci.o.cecs.util;

public final class AddressUtil {

    private AddressUtil() {}

    public static StreetAndHouseNumber seperatedStreetAndHouseNumberFrom(
            String streetAndHouseNumber) {
        var trimmedStreetAndHouseNumber = streetAndHouseNumber.trim();

        var houseNumber =
                trimmedStreetAndHouseNumber.substring(trimmedStreetAndHouseNumber.lastIndexOf(' ') + 1).trim();
        var street =
                trimmedStreetAndHouseNumber.substring(0, trimmedStreetAndHouseNumber.lastIndexOf(' ')).trim();

        return new StreetAndHouseNumber(street, houseNumber);
    }
}
