package nu.ndw.ncis.ci.o.cecs.properties;

import nu.ndw.ncis.ci.o.cecs.configuration.properties.ApiProperties;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@EnableConfigurationProperties(ApiProperties.class)
@TestPropertySource(properties = {
        "api.base-url=test-url",
        "api.page-size=4",
        "api.locations-path=/locations",
        "api.tariffs-path=/tariffs"
})
class ApiPropertiesTest {

    @Autowired
    private ApiProperties properties;

    @Test
    void testBaseUrl() {
        assertThat(properties.getBaseUrl()).isEqualTo("test-url");
    }

    @Test
    void testPageSize() {
        assertThat(properties.getPageSize()).isEqualTo(4);
    }

    @Test
    void testLocationsPath() {
        assertThat(properties.getLocationsPath()).isEqualTo("/locations");
    }

    @Test
    void testTariffsPath() {
        assertThat(properties.getTariffsPath()).isEqualTo("/tariffs");
    }
}
