package nu.ndw.ncis.ci.o.cecs.it.config;

import com.azure.storage.blob.BlobContainerClient;
import nu.ndw.ncis.core.file.compression.FileCompressor;
import nu.ndw.ncis.core.file.compression.FileDecompressorProvider;
import nu.ndw.ncis.it.cloud.ITBlobStorageRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("it")
@Configuration
public class ITConfig {

    @Bean
    public ITBlobStorageRepository itBlobStorageRepository(
            BlobContainerClient client,
            FileCompressor fileCompressor,
            FileDecompressorProvider fileDecompressorProvider
    ) {
        return new ITBlobStorageRepository(client, fileCompressor, fileDecompressorProvider);
    }
}
