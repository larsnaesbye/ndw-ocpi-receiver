package nu.ndw.ncis.ci.o.cecs.fixture;

import com.fasterxml.jackson.databind.ObjectMapper;
import nu.ndw.ncis.ci.o.cecs.util.TestUtil;
import ocpi.model.OcpiLocation;

import java.util.Arrays;
import java.util.List;

public class OcpiLocationFixtures {
    private static final ObjectMapper OBJECT_MAPPER = TestUtil.getObjectMapper();

    private OcpiLocationFixtures() {
    }

    public static List<OcpiLocation> getJsonData(String resourceName) throws Exception {
        var json = TestUtil.getJsonString(resourceName);
        return Arrays.asList(OBJECT_MAPPER.readValue(json, OcpiLocation[].class));
    }
}
