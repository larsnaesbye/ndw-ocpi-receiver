package nu.ndw.ncis.ci.o.cecs.configuration;

import nu.ndw.ncis.ci.o.cecs.configuration.properties.SchedulingProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ConditionalOnProperty(name = "scheduling.enabled", havingValue = "true", matchIfMissing = true)
@EnableConfigurationProperties(SchedulingProperties.class)
@EnableScheduling
public class SchedulingConfig {
}
