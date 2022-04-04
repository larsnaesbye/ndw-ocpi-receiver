package nu.ndw.ncis.ci.o.cecs.configuration.properties;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class PublicationProperties {
    private final String directory;
    private final String routingKey;
}
