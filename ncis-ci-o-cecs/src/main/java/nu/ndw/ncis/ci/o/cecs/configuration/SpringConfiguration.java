package nu.ndw.ncis.ci.o.cecs.configuration;

import eu.datex.energyinfrastructure.EnergyInfrastructureStatusPublication;
import eu.datex.energyinfrastructure.EnergyInfrastructureTablePublication;
import nu.ndw.ncis.ci.o.cecs.configuration.properties.StatusPublicationProperties;
import nu.ndw.ncis.ci.o.cecs.configuration.properties.TablePublicationProperties;
import nu.ndw.ncis.core.cloud.service.CloudStorageService;
import nu.ndw.ncis.core.config.annotations.EnableCoreCloudStorage;
import nu.ndw.ncis.core.file.compression.FileCompressor;
import nu.ndw.ncis.core.messaging.publisher.RabbitMQPublisher;
import nu.ndw.ncis.core.messaging.transmission.ObjectTransmitter;
import nu.ndw.ncis.core.parsing.XmlObjectParser;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.transaction.RabbitTransactionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableCoreCloudStorage
public class SpringConfiguration {

    @Bean
    public TransactionManager transactionManager(ConnectionFactory connectionFactory) {
        return new RabbitTransactionManager(connectionFactory);
    }

    @Bean
    public XmlObjectParser<EnergyInfrastructureTablePublication> tablePublicationParser() {
        return new XmlObjectParser<>(EnergyInfrastructureTablePublication.class);
    }

    @Bean
    public XmlObjectParser<EnergyInfrastructureStatusPublication> statusPublicationParser() {
        return new XmlObjectParser<>(EnergyInfrastructureStatusPublication.class);
    }

    @Bean
    public ObjectTransmitter<EnergyInfrastructureTablePublication> tableTransmitter(
            CloudStorageService cloudStorageService,
            XmlObjectParser<EnergyInfrastructureTablePublication> tablePublicationParser,
            TablePublicationProperties properties,
            RabbitMQPublisher tablePublisher,
            FileCompressor fileCompressor
    ) {
        return new ObjectTransmitter<>(
                cloudStorageService,
                tablePublicationParser,
                properties.getDirectory(),
                tablePublisher,
                fileCompressor
        );
    }

    @Bean
    public ObjectTransmitter<EnergyInfrastructureStatusPublication> statusTransmitter(
            CloudStorageService cloudStorageService,
            XmlObjectParser<EnergyInfrastructureStatusPublication> statusPublicationParser,
            StatusPublicationProperties properties,
            RabbitMQPublisher statusPublisher,
            FileCompressor fileCompressor
    ) {
        return new ObjectTransmitter<>(
                cloudStorageService,
                statusPublicationParser,
                properties.getDirectory(),
                statusPublisher,
                fileCompressor
        );
    }
}
