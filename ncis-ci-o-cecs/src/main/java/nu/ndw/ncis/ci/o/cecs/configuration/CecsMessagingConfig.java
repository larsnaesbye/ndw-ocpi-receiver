package nu.ndw.ncis.ci.o.cecs.configuration;

import nu.ndw.ncis.ci.o.cecs.configuration.properties.StatusPublicationProperties;
import nu.ndw.ncis.ci.o.cecs.configuration.properties.TablePublicationProperties;
import nu.ndw.ncis.core.messaging.metadata.MessageMetadataHolder;
import nu.ndw.ncis.core.messaging.publisher.RabbitMQPublisher;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.amqp.RabbitTemplateConfigurer;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(
        {TablePublicationProperties.class, StatusPublicationProperties.class})
public class CecsMessagingConfig {

    @Bean
    @Qualifier("tableRabbitTemplate")
    public RabbitTemplate tableRabbitTemplate(RabbitTemplateConfigurer configurer,
                                                 ConnectionFactory connectionFactory,
                                                 TablePublicationProperties properties) {
        var template = new RabbitTemplate();
        configurer.configure(template, connectionFactory);
        template.setRoutingKey(properties.getRoutingKey());
        return template;
    }

    @Bean
    @Qualifier("statusRabbitTemplate")
    public RabbitTemplate statusRabbitTemplate(RabbitTemplateConfigurer configurer,
                                                      ConnectionFactory connectionFactory,
                                                      StatusPublicationProperties properties) {
        var template = new RabbitTemplate();
        configurer.configure(template, connectionFactory);
        template.setRoutingKey(properties.getRoutingKey());
        return template;
    }

    @Bean
    public MessageMetadataHolder messageMetadataHolder() {
        return new MessageMetadataHolder();
    }

    @Bean
    @Qualifier("tablePublisher")
    public RabbitMQPublisher tablePublisher(
            RabbitTemplate tableRabbitTemplate,
            MessageMetadataHolder messageMetadataHolder
    ) {
        return new RabbitMQPublisher(tableRabbitTemplate, messageMetadataHolder);
    }

    @Bean
    @Qualifier("statusPublisher")
    public RabbitMQPublisher statusPublisher(
            RabbitTemplate statusRabbitTemplate,
            MessageMetadataHolder messageMetadataHolder
    ) {
        return new RabbitMQPublisher(statusRabbitTemplate, messageMetadataHolder);
    }
}
