package nu.ndw.ncis.ci.o.cecs.fixture;

import com.fasterxml.jackson.databind.ObjectMapper;
import nu.ndw.ncis.ci.o.cecs.util.TestUtil;
import ocpi.model.OcpiTariff;

import java.util.Arrays;
import java.util.List;

public class OcpiTariffFixtures {
    private static final ObjectMapper OBJECT_MAPPER = TestUtil.getObjectMapper();

    private OcpiTariffFixtures() {
    }

    public static List<OcpiTariff> getJsonData(String resourceName) throws Exception {
        var json = TestUtil.getJsonString(resourceName);
        return Arrays.asList(OBJECT_MAPPER.readValue(json, OcpiTariff[].class));
    }
}
