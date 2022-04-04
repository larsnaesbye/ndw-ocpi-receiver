package nu.ndw.ncis.ci.o.cecs.configuration.properties;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "cecs.table")
@Validated
@Getter
@ConstructorBinding
public class TablePublicationProperties extends PublicationProperties {

    public TablePublicationProperties(String directory, String routingKey) {
        super(directory, routingKey);
    }
}
