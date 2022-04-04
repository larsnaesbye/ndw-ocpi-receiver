package nu.ndw.ncis.core.config.properties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import java.util.Map;

@ConfigurationProperties(prefix = "cloud-storage")
@Validated
@Getter
@ConstructorBinding
@AllArgsConstructor
public class CloudStorageProperties {
    @Getter
    @Validated
    @AllArgsConstructor
    public static class ConnectionString {
        @NotBlank
        private final String accountName;

        @NotBlank
        private final String key;

        @NotBlank
        private final String connectionString;
    }

    @Getter
    @Validated
    @AllArgsConstructor
    public static class ContainerName {
        @NotBlank
        private final String connectionStringId;

        @NotBlank
        private final String containerName;
    }

    private final String accountName;

    private final String key;

    private final String connectionString;

    private final String containerName;

    private final Map<String, ConnectionString> connectionStrings;

    private final Map<String, ContainerName> containerNames;
}
