package nu.ndw.ncis.core.config;

import nu.ndw.ncis.core.config.properties.FileProperties;
import nu.ndw.ncis.core.file.compression.FileCompressor;
import nu.ndw.ncis.core.file.compression.FileCompressorGzip;
import nu.ndw.ncis.core.file.compression.FileCompressorLz4;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({FileProperties.class})
@ComponentScan("nu.ndw.ncis.core.file")
public class FileConfig {

    private static final String PROPERTY_FILE_PREFIX = "file";
    private static final String PROPERTY_COMPRESSION = "compression";
    private static final String PROPERTY_COMPRESSION_VALUE_GZIP = "gzip";
    private static final String PROPERTY_COMPRESSION_VALUE_LZ4 = "lz4";

    @Bean
    @ConditionalOnProperty(
            prefix = PROPERTY_FILE_PREFIX,
            name = PROPERTY_COMPRESSION,
            havingValue = PROPERTY_COMPRESSION_VALUE_GZIP,
            matchIfMissing = true)
    public FileCompressor fileCompressorGzip() {
        return new FileCompressorGzip();
    }

    @Bean
    @ConditionalOnProperty(
            prefix = PROPERTY_FILE_PREFIX,
            name = PROPERTY_COMPRESSION,
            havingValue = PROPERTY_COMPRESSION_VALUE_LZ4)
    public FileCompressor fileCompressorLz4() {
        return new FileCompressorLz4();
    }
}
