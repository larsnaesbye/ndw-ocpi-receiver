package nu.ndw.ncis.ci.o.cecs.configuration.properties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@ConfigurationProperties(prefix = "api")
@Validated
@ConstructorBinding
@Getter
@AllArgsConstructor
public class ApiProperties {

    @NotBlank
    private final String baseUrl;

    @NotNull
    private final Integer pageSize;

    @NotBlank
    private final String locationsPath;

    @NotBlank
    private final String tariffsPath;
}
