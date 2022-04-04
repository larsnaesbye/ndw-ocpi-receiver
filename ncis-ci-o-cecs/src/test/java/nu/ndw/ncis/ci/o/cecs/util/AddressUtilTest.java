package nu.ndw.ncis.ci.o.cecs.util;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
class AddressUtilTest {

    @Test
    void testStreetAndHouseNumberShouldSeperateStreetFromHouseNumber() {
        var streetHouseNumbers = new HashMap<String, StreetAndHouseNumber>();

        streetHouseNumbers.put("Wiborgeiland  245 ", AddressUtil.seperatedStreetAndHouseNumberFrom("Wiborgeiland  245"));
        streetHouseNumbers.put("Scheermakershof 2 ", AddressUtil.seperatedStreetAndHouseNumberFrom("Scheermakershof 2"));
        streetHouseNumbers.put("Noordwal 6", AddressUtil.seperatedStreetAndHouseNumberFrom("Noordwal 6"));
        streetHouseNumbers.put("Pelssingel 10", AddressUtil.seperatedStreetAndHouseNumberFrom("Pelssingel 10"));
        streetHouseNumbers.put("Philips de Goedestraat 5", AddressUtil.seperatedStreetAndHouseNumberFrom("Philips de Goedestraat 5"));
        streetHouseNumbers.put("J. S. Bachweg 9", AddressUtil.seperatedStreetAndHouseNumberFrom("J. S. Bachweg 9"));
        streetHouseNumbers.put("Nieuwe Kalfjeslaan 19A", AddressUtil.seperatedStreetAndHouseNumberFrom("Nieuwe Kalfjeslaan 19A"));

        assertThat(streetHouseNumbers.get("Wiborgeiland  245 ").street).isEqualTo("Wiborgeiland");
        assertThat(streetHouseNumbers.get("Wiborgeiland  245 ").houseNumber).isEqualTo("245");

        assertThat(streetHouseNumbers.get("Scheermakershof 2 ").street).isEqualTo("Scheermakershof");
        assertThat(streetHouseNumbers.get("Scheermakershof 2 ").houseNumber).isEqualTo("2");

        assertThat(streetHouseNumbers.get("Noordwal 6").street).isEqualTo("Noordwal");
        assertThat(streetHouseNumbers.get("Noordwal 6").houseNumber).isEqualTo("6");

        assertThat(streetHouseNumbers.get("Pelssingel 10").street).isEqualTo("Pelssingel");
        assertThat(streetHouseNumbers.get("Pelssingel 10").houseNumber).isEqualTo("10");

        assertThat(streetHouseNumbers.get("Philips de Goedestraat 5").street).isEqualTo("Philips de Goedestraat");
        assertThat(streetHouseNumbers.get("Philips de Goedestraat 5").houseNumber).isEqualTo("5");

        assertThat(streetHouseNumbers.get("J. S. Bachweg 9").street).isEqualTo("J. S. Bachweg");
        assertThat(streetHouseNumbers.get("J. S. Bachweg 9").houseNumber).isEqualTo("9");

        assertThat(streetHouseNumbers.get("Nieuwe Kalfjeslaan 19A").street).isEqualTo("Nieuwe Kalfjeslaan");
        assertThat(streetHouseNumbers.get("Nieuwe Kalfjeslaan 19A").houseNumber).isEqualTo("19A");

    }
}
