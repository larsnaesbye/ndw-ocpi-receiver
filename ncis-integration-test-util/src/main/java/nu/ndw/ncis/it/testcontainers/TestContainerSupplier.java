package nu.ndw.ncis.it.testcontainers;

import org.testcontainers.containers.RabbitMQContainer;
import org.testcontainers.utility.DockerImageName;

public class TestContainerSupplier {

    private static final String MICROSOFT_AZURITE_IMAGE = "mcr.microsoft.com/azure-storage/azurite:3.16.0";
    private static final String RABBITMQ_IMAGE = "rabbitmq:3.8-alpine";

    private TestContainerSupplier() {
    }

    public static AzuriteContainer getAzureBlobStorageContainer() {
        return new AzuriteContainer(DockerImageName.parse(MICROSOFT_AZURITE_IMAGE))
                .withExposedPorts(10000, 10001)
                .withCommand("azurite", "--blobHost", "0.0.0.0", "--queueHost", "0.0.0.0");
    }

    public static RabbitMQContainer getRabbitMQContainer() {
        return new RabbitMQContainer(DockerImageName.parse(RABBITMQ_IMAGE))
                .withExposedPorts(5672)
                .withVhost("/");
    }
}
