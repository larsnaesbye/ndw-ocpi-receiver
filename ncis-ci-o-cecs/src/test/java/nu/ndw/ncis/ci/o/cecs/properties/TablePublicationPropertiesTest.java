package nu.ndw.ncis.ci.o.cecs.properties;

import nu.ndw.ncis.ci.o.cecs.configuration.properties.TablePublicationProperties;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@EnableConfigurationProperties(TablePublicationProperties.class)
@TestPropertySource(properties = {"cecs.table.directory=test-directory", "cecs.table.routing-key=test-routing-key"})
class TablePublicationPropertiesTest {

    @Autowired
    private TablePublicationProperties properties;

    @Test
    void testDirectory() {
        assertThat(properties.getDirectory()).isEqualTo("test-directory");
    }

    @Test
    void testRoutingKey() {
        assertThat(properties.getRoutingKey()).isEqualTo("test-routing-key");
    }
}
