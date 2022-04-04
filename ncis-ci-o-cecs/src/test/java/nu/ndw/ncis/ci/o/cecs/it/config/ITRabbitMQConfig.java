package nu.ndw.ncis.ci.o.cecs.it.config;

import nu.ndw.ncis.ci.o.cecs.configuration.properties.StatusPublicationProperties;
import nu.ndw.ncis.ci.o.cecs.configuration.properties.TablePublicationProperties;
import nu.ndw.ncis.ci.o.cecs.it.rabbitmq.ITRabbitMQProperties;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Declarables;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("it")
@EnableConfigurationProperties(ITRabbitMQProperties.class)
public class ITRabbitMQConfig {

    private static final boolean NON_DURABLE = false;

    @Bean
    public TopicExchange topicExchange(ITRabbitMQProperties properties) {
        return new TopicExchange(properties.getExchangeName());
    }

    @Bean
    @Qualifier("tablePublicationQueue")
    public Queue tablePublicationQueue(ITRabbitMQProperties properties) {
        return new Queue(properties.getTablePublicationQueue(), NON_DURABLE);
    }

    @Bean
    @Qualifier("statusPublicationQueue")
    public Queue statusPublicationQueue(ITRabbitMQProperties properties) {
        return new Queue(properties.getStatusPublicationQueue(), NON_DURABLE);
    }

    @Bean
    public Declarables declarables(TopicExchange exchange,
                                   Queue tablePublicationQueue,
                                   Queue statusPublicationQueue,
                                   TablePublicationProperties tablePublicationProperties,
                                   StatusPublicationProperties statusPublicationProperties) {
        return new Declarables(
                exchange,
                tablePublicationQueue,
                statusPublicationQueue,
                BindingBuilder.bind(tablePublicationQueue)
                        .to(exchange)
                        .with(tablePublicationProperties.getRoutingKey()),
                BindingBuilder.bind(statusPublicationQueue)
                        .to(exchange)
                        .with(statusPublicationProperties.getRoutingKey()));
    }
}