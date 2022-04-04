package nu.ndw.ncis.ci.o.cecs.properties;

import nu.ndw.ncis.ci.o.cecs.configuration.properties.SchedulingProperties;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@EnableConfigurationProperties(SchedulingProperties.class)
@TestPropertySource(properties = {
        "scheduling.enabled=false",
        "scheduling.cron-schedule=0 1 2 3 4 *"
})
class SchedulingPropertiesTest {

    @Autowired
    private SchedulingProperties properties;

    @Test
    void testEnabled() {
        assertThat(properties.getEnabled()).isFalse();
    }

    @Test
    void testCronSchedule() {
        assertThat(properties.getCronSchedule()).isEqualTo("0 1 2 3 4 *");
    }
}
