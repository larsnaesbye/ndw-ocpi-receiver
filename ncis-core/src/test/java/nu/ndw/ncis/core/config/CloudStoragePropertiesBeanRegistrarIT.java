package nu.ndw.ncis.core.config;

import com.azure.storage.blob.BlobContainerClient;
import nu.ndw.ncis.core.cloud.repository.BlobStorageRepository;
import nu.ndw.ncis.core.cloud.service.CloudStorageService;
import nu.ndw.ncis.core.config.annotations.EnableCoreCloudStorage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.utility.DockerImageName;

import static org.assertj.core.api.Assertions.assertThat;

@ActiveProfiles("it")
@SpringBootTest
@Testcontainers
class CloudStoragePropertiesBeanRegistrarIT {
    static class AzuriteContainer extends GenericContainer<AzuriteContainer> {
        public AzuriteContainer(DockerImageName dockerImageName) {
            super(dockerImageName);
        }
    }

    static final String MICROSOFT_AZURITE_IMAGE = "mcr.microsoft.com/azure-storage/azurite:3.13.0";

    @Container
    static final AzuriteContainer CLOUD_STORAGE_CONTAINER
            = new AzuriteContainer(DockerImageName.parse(MICROSOFT_AZURITE_IMAGE))
            .withExposedPorts(10000, 10001)
            .withCommand("azurite", "--blobHost", "0.0.0.0", "--queueHost", "0.0.0.0");

    @Autowired
    CloudStorageService cloudStorageServiceDefault;

    @Autowired
    @Qualifier("cloudStorageService-other")
    CloudStorageService cloudStorageServiceOther;

    @Autowired
    BlobStorageRepository blobStorageRepositoryDefault;

    @Autowired
    @Qualifier("blobStorageRepository-other")
    BlobStorageRepository blobStorageRepositoryOther;

    @Autowired
    BlobContainerClient blobContainerClientDefault;

    @Autowired
    @Qualifier("blobContainerClient-other")
    BlobContainerClient blobContainerClientOther;

    @Test
    void testPostProcessBeanDefinitionRegistry() {
        assertThat(cloudStorageServiceDefault).isNotSameAs(cloudStorageServiceOther);
        assertThat(blobStorageRepositoryDefault).isNotSameAs(blobStorageRepositoryOther);
        assertThat(blobContainerClientDefault.getBlobContainerName()).isEqualTo("test-container");
        assertThat(blobContainerClientOther.getBlobContainerName()).isEqualTo("test-container-other");
    }

    @Configuration
    @EnableCoreCloudStorage
    static class TestConfiguration {
    }
}
