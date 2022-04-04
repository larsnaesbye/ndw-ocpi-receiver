package nu.ndw.ncis.core.config;

import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.common.StorageSharedKeyCredential;
import lombok.RequiredArgsConstructor;
import nu.ndw.ncis.core.cloud.repository.BlobStorageRepository;
import nu.ndw.ncis.core.cloud.service.CloudStorageService;
import nu.ndw.ncis.core.config.properties.CloudStorageProperties;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

@Configuration
@RequiredArgsConstructor
public class CloudStoragePropertiesBeanRegistrar implements ImportBeanDefinitionRegistrar {
    private static final String BEAN_AZURE_BLOB_STORAGE_CLIENT_FACTORY = "azureBlobStorageClientFactory";
    private static final String METHOD_CREATE_BLOB_CONTAINER_CLIENT = "createBlobContainerClient";
    private static final String METHOD_CREATE_BLOB_SERVICE_CLIENT = "createBlobServiceClient";

    private final BeanFactory beanFactory;

    @Override
    public void registerBeanDefinitions(
            AnnotationMetadata metadata,
            BeanDefinitionRegistry registry) {
        CloudStorageProperties properties =  beanFactory.getBean(CloudStorageProperties.class);

        if (properties.getConnectionStrings() == null || properties.getContainerNames() == null) {
            return;
        }

        registerBlobServiceClients(properties.getConnectionStrings(), registry);

        for (Map.Entry<String, CloudStorageProperties.ContainerName> entry
                : properties.getContainerNames().entrySet()) {
            CloudStorageProperties.ContainerName containerName = entry.getValue();

            AbstractBeanDefinition blobContainerClientBeanDefinition = createBlobContainerClientBeanDefinition(
                    containerName.getConnectionStringId(),
                    containerName.getContainerName());

            registry.registerBeanDefinition(
                    getBlobContainerClientBeanName(entry.getKey()),
                    blobContainerClientBeanDefinition);

            AbstractBeanDefinition blobStorageRepositoryBeanDefinition = createBlobStorageRepositoryBeanDefinition(
                    entry.getKey());

            registry.registerBeanDefinition(
                    getBlobStorageRepositoryBeanName(entry.getKey()),
                    blobStorageRepositoryBeanDefinition);

            AbstractBeanDefinition cloudStorageServiceBeanDefinition = createCloudStorageServiceBeanDefinition(
                    entry.getKey());

            registry.registerBeanDefinition(
                    getCloudStorageServiceBeanName(entry.getKey()),
                    cloudStorageServiceBeanDefinition);
        }
    }

    private static void registerBlobServiceClients(
            Map<String, CloudStorageProperties.ConnectionString> connectionStrings,
            BeanDefinitionRegistry beanDefinitionRegistry) {
        for (Map.Entry<String, CloudStorageProperties.ConnectionString> entry : connectionStrings.entrySet()) {
            CloudStorageProperties.ConnectionString connectionString = entry.getValue();

            AbstractBeanDefinition storageSharedKeyCredentialBeanDefinition =
                    createStorageSharedKeyCredentialBeanDefinition(
                            connectionString.getAccountName(),
                            connectionString.getKey());

            beanDefinitionRegistry.registerBeanDefinition(
                    getStorageSharedKeyCredentialBeanName(entry.getKey()),
                    storageSharedKeyCredentialBeanDefinition);

            AbstractBeanDefinition blobServiceClientBeanDefinition = createBlobServiceClientBeanDefinition(
                    entry.getKey(),
                    connectionString.getConnectionString());

            beanDefinitionRegistry.registerBeanDefinition(
                    getBlobServiceClientBeanName(entry.getKey()),
                    blobServiceClientBeanDefinition);
        }
    }

    private static AbstractBeanDefinition createBlobStorageRepositoryBeanDefinition(String key) {
        return BeanDefinitionBuilder
                .genericBeanDefinition(BlobStorageRepository.class)
                .addConstructorArgReference(getBlobContainerClientBeanName(key))
                .getBeanDefinition();
    }

    private static AbstractBeanDefinition createCloudStorageServiceBeanDefinition(String key) {
        return BeanDefinitionBuilder
                .genericBeanDefinition(CloudStorageService.class)
                .addConstructorArgReference(getBlobStorageRepositoryBeanName(key))
                .getBeanDefinition();
    }

    private static AbstractBeanDefinition createStorageSharedKeyCredentialBeanDefinition(
            String accountName,
            String accountKey) {
        return BeanDefinitionBuilder
                .genericBeanDefinition(StorageSharedKeyCredential.class)
                .addConstructorArgValue(accountName)
                .addConstructorArgValue(accountKey)
                .getBeanDefinition();
    }

    private static AbstractBeanDefinition createBlobServiceClientBeanDefinition(String key, String connectionString) {
        return BeanDefinitionBuilder
                .genericBeanDefinition(BlobServiceClient.class)
                .setFactoryMethodOnBean(METHOD_CREATE_BLOB_SERVICE_CLIENT, BEAN_AZURE_BLOB_STORAGE_CLIENT_FACTORY)
                .addConstructorArgReference(getStorageSharedKeyCredentialBeanName(key))
                .addConstructorArgValue(connectionString)
                .getBeanDefinition();
    }

    private static AbstractBeanDefinition createBlobContainerClientBeanDefinition(
            String connectionStringKey,
            String containerName) {
        return BeanDefinitionBuilder
                .genericBeanDefinition(AzureBlobStorageClientFactory.class)
                .setFactoryMethodOnBean(METHOD_CREATE_BLOB_CONTAINER_CLIENT, BEAN_AZURE_BLOB_STORAGE_CLIENT_FACTORY)
                .addConstructorArgReference(getBlobServiceClientBeanName(connectionStringKey))
                .addConstructorArgValue(containerName)
                .getBeanDefinition();
    }

    private static String getStorageSharedKeyCredentialBeanName(String key) {
        return String.format("storageSharedKeyCredential-%s", key);
    }

    private static String getBlobServiceClientBeanName(String key) {
        return String.format("blobServiceClient-%s", key);
    }

    private static String getBlobContainerClientBeanName(String key) {
        return String.format("blobContainerClient-%s", key);
    }

    private static String getBlobStorageRepositoryBeanName(String key) {
        return String.format("blobStorageRepository-%s", key);
    }

    private static String getCloudStorageServiceBeanName(String key) {
        return String.format("cloudStorageService-%s", key);
    }
}
