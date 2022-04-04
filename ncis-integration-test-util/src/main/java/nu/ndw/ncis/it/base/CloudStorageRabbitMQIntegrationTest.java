package nu.ndw.ncis.it.base;

import nu.ndw.ncis.it.cloud.ITBlobStorageRepository;
import nu.ndw.ncis.it.testcontainers.AzuriteContainer;
import nu.ndw.ncis.it.testcontainers.TestContainerSupplier;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.RabbitMQContainer;
import org.testcontainers.containers.wait.strategy.Wait;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.time.Duration;

@SpringBootTest
@Testcontainers
@ActiveProfiles("it")
public abstract class CloudStorageRabbitMQIntegrationTest {

    private static final long FOUR_MINUTES_IN_SECONDS = 240L;
    private static final int ORIGINAL_AZURITE_CONTAINER_PORT = 10000;
    @Container
    static final AzuriteContainer CLOUD_STORAGE_CONTAINER =
            TestContainerSupplier.getAzureBlobStorageContainer();
    @Container
    static final RabbitMQContainer RABBITMQ_CONTAINER =
            TestContainerSupplier.getRabbitMQContainer();
    @Autowired
    protected ITBlobStorageRepository blobStorageRepository;

    @DynamicPropertySource
    static void setDynamicProperties(DynamicPropertyRegistry registry) {
        registry.add("cloud-storage.connection-string", () -> String.format(
                "DefaultEndpointsProtocol=http;AccountName=devstoreaccount1;" +
                        "AccountKey=Eby8vdM02xNOcqFlqUwJPLlmEtlCDX" +
                        "J1OUzFT50uSRZ6IFsuFq2UVErCz4I6tq/K1SZFPTOtr/KBHBeksoGMGw==;" +
                        "BlobEndpoint=http://127.0.0.1:%s/devstore" +
                        "account1;QueueEndpoint=http://127.0.0.1:10001/devstoreaccount1;",
                CLOUD_STORAGE_CONTAINER.getMappedPort(ORIGINAL_AZURITE_CONTAINER_PORT)));
        registry.add("spring.rabbitmq.host", RABBITMQ_CONTAINER::getHost);
        registry.add("spring.rabbitmq.port", RABBITMQ_CONTAINER::getAmqpPort);
    }

    @BeforeAll
    static void waitForContainersInitialized() {
        CLOUD_STORAGE_CONTAINER.setWaitStrategy(
                Wait.forLogMessage(".*Azurite Blob service is successfully listening at.*", 1)
                        .withStartupTimeout(Duration.ofSeconds(FOUR_MINUTES_IN_SECONDS)));

        RABBITMQ_CONTAINER.setWaitStrategy(
                Wait.forLogMessage(".*Server startup complete.*", 1)
                        .withStartupTimeout(Duration.ofSeconds(FOUR_MINUTES_IN_SECONDS)));
    }

    @BeforeEach
    void beforeEach() {
        blobStorageRepository.createBlobContainer();
    }

    @AfterEach
    void afterEach() {
        blobStorageRepository.deleteBlobContainer();
    }
}
