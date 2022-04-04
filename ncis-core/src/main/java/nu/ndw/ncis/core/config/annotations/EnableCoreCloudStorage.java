package nu.ndw.ncis.core.config.annotations;

import nu.ndw.ncis.core.config.CloudStorageConfig;
import nu.ndw.ncis.core.config.CloudStoragePropertiesBeanRegistrar;
import nu.ndw.ncis.core.config.FileConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Configuration
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import({FileConfig.class, CloudStorageConfig.class, CloudStoragePropertiesBeanRegistrar.class})
public @interface EnableCoreCloudStorage {
}
