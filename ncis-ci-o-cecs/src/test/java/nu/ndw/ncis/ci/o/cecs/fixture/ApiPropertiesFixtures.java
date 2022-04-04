package nu.ndw.ncis.ci.o.cecs.fixture;

import nu.ndw.ncis.ci.o.cecs.configuration.properties.ApiProperties;

public class ApiPropertiesFixtures {
    private ApiPropertiesFixtures() {
    }

    public static ApiProperties getApiProperties(String baseUrl) {
        return new ApiProperties(baseUrl, 2, "/test-locations", "/test-tariffs");
    }
}
