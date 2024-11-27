package nu.ndw.ncis.core.config.properties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties(prefix = "file")
@Getter
//@ConstructorBinding
@AllArgsConstructor
public class FileProperties {

    private final String directory;
}
