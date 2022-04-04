package nu.ndw.ncis.ci.o.cecs.configuration.properties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties(prefix = "scheduling")
@ConstructorBinding
@Getter
@AllArgsConstructor
public class SchedulingProperties {

    private final Boolean enabled;

    private final String cronSchedule;
}
