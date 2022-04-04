package nu.ndw.ncis.core.config;

import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.common.StorageSharedKeyCredential;
import nu.ndw.ncis.core.cloud.repository.BlobStorageRepository;
import nu.ndw.ncis.core.cloud.service.CloudStorageService;
import nu.ndw.ncis.core.config.properties.CloudStorageProperties;
import nu.ndw.ncis.core.file.compression.FileCompressor;
import nu.ndw.ncis.core.file.compression.FileDecompressorProvider;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@EnableConfigurationProperties({CloudStorageProperties.class})
@ComponentScan("nu.ndw.ncis.core.cloud")
public class CloudStorageConfig {
    @Bean
    public AzureBlobStorageClientFactory azureBlobStorageClientFactory() {
        return new AzureBlobStorageClientFactory();
    }

    @Bean
    @Primary
    @ConditionalOnProperty(prefix = "cloud-storage", name = "account-name")
    public StorageSharedKeyCredential credential(CloudStorageProperties properties) {
        return new StorageSharedKeyCredential(
                properties.getAccountName(),
                properties.getKey()
        );
    }

    @Bean
    @Primary
    @ConditionalOnBean(StorageSharedKeyCredential.class)
    @ConditionalOnProperty(prefix = "cloud-storage", name = "connection-string")
    public BlobServiceClient blobServiceClient(
            AzureBlobStorageClientFactory factory,
            StorageSharedKeyCredential credential,
            CloudStorageProperties properties) {
        return factory.createBlobServiceClient(credential, properties.getConnectionString());
    }

    @Bean
    @Primary
    @ConditionalOnBean(BlobServiceClient.class)
    @ConditionalOnProperty(prefix = "cloud-storage", name = "container-name")
    public BlobContainerClient blobContainerClient(
            AzureBlobStorageClientFactory factory,
            BlobServiceClient blobServiceClient,
            CloudStorageProperties properties) {
        return factory.createBlobContainerClient(blobServiceClient, properties.getContainerName());
    }

    @Bean
    @Primary
    @ConditionalOnBean(value = BlobContainerClient.class, name = "blobContainerClient")
    public BlobStorageRepository blobStorageRepository(BlobContainerClient blobContainerClient) {
        return new BlobStorageRepository(blobContainerClient);
    }

    @Bean
    @Primary
    @ConditionalOnBean(value = BlobStorageRepository.class, name = "blobStorageRepository")
    public CloudStorageService cloudStorageService(
            BlobStorageRepository blobStorageRepository,
            FileDecompressorProvider fileDecompressorProvider,
            FileCompressor fileCompressor) {
        return new CloudStorageService(blobStorageRepository, fileDecompressorProvider,
                fileCompressor);
    }
}