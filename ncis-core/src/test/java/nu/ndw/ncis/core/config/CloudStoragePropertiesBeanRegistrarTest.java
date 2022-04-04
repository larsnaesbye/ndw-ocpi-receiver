package nu.ndw.ncis.core.config;

import nu.ndw.ncis.core.config.properties.CloudStorageProperties;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;

import java.util.Map;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class CloudStoragePropertiesBeanRegistrarTest {
    private static final int ONCE = 1;

    @Mock
    private BeanDefinitionRegistry registry;

    @Mock
    private BeanFactory beanFactory;

    @InjectMocks
    private CloudStoragePropertiesBeanRegistrar processor;

    @Test
    void testPostProcessBeanDefinitionRegistryShouldNotCreateBeanDefinitionsWhenPropertiesConnectionStringsAreNull() {
        CloudStorageProperties properties = new CloudStorageProperties(
                null,
                null,
                null,
                null,
                null,
                Map.of("test", mock(CloudStorageProperties.ContainerName.class)));

        doReturn(properties).when(beanFactory).getBean(CloudStorageProperties.class);

        processor.registerBeanDefinitions(null, registry);

        verify(registry, never()).registerBeanDefinition(anyString(), any());
    }

    @Test
    void testPostProcessBeanDefinitionRegistryShouldNotCreateBeanDefinitionsWhenPropertiesContainerNamesAreNull() {
        CloudStorageProperties properties = new CloudStorageProperties(
                null,
                null,
                null,
                null,
                Map.of("test", mock(CloudStorageProperties.ConnectionString.class)),
                null);

        doReturn(properties).when(beanFactory).getBean(CloudStorageProperties.class);

        processor.registerBeanDefinitions(null, registry);

        verify(registry, never()).registerBeanDefinition(anyString(), any());
    }

    @Test
    void testPostProcessBeanDefinitionRegistryShouldRegisterBeansWhenAllPropertiesAreFound() {
        CloudStorageProperties properties = new CloudStorageProperties(
                null,
                null,
                null,
                null,
                Map.of("test123", new CloudStorageProperties.ConnectionString(
                        "accountName",
                        "key",
                        "connectionString")),
                Map.of("test", new CloudStorageProperties.ContainerName(
                        "test123",
                        "containerName")));

        doReturn(properties).when(beanFactory).getBean(CloudStorageProperties.class);

        processor.registerBeanDefinitions(null, registry);

        verifyRegisterBeanDefinition("storageSharedKeyCredential-test123");
        verifyRegisterBeanDefinition("blobServiceClient-test123");
        verifyRegisterBeanDefinition("blobContainerClient-test");
        verifyRegisterBeanDefinition("blobStorageRepository-test");
        verifyRegisterBeanDefinition("cloudStorageService-test");

    }

    private void verifyRegisterBeanDefinition(String beanName) {
        verify(registry, times(ONCE)).registerBeanDefinition(eq(beanName), any());
    }
}
