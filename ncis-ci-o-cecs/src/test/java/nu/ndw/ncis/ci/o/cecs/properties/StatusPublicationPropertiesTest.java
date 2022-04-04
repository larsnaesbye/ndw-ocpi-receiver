package nu.ndw.ncis.ci.o.cecs.properties;

import nu.ndw.ncis.ci.o.cecs.configuration.properties.StatusPublicationProperties;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@EnableConfigurationProperties(StatusPublicationProperties.class)
@TestPropertySource(properties = {"cecs.status.directory=test-directory", "cecs.status.routing-key=test-routing-key"})
class StatusPublicationPropertiesTest {

    @Autowired
    private StatusPublicationProperties properties;

    @Test
    void testDirectory() {
        assertThat(properties.getDirectory()).isEqualTo("test-directory");
    }

    @Test
    void testRoutingKey() {
        assertThat(properties.getRoutingKey()).isEqualTo("test-routing-key");
    }
}
