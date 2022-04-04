package nu.ndw.ncis.ci.o.cecs.it.rabbitmq;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Profile;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

@ConfigurationProperties(prefix = "it.rabbitmq")
@Profile("it")
@Validated
@Getter
@ConstructorBinding
@AllArgsConstructor
public class ITRabbitMQProperties {

    @NotBlank
    private final String exchangeName;

    @NotBlank
    private final String tablePublicationQueue;

    @NotBlank
    private final String statusPublicationQueue;
}
