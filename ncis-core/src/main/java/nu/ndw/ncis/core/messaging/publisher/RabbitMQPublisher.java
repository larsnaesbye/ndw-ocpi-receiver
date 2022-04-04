package nu.ndw.ncis.core.messaging.publisher;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nu.ndw.ncis.core.exception.NdwMessagingException;
import nu.ndw.ncis.core.messaging.metadata.MessageMetadataHolder;
import org.springframework.amqp.AmqpAuthenticationException;
import org.springframework.amqp.AmqpConnectException;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.Date;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

@Slf4j
@AllArgsConstructor
public class RabbitMQPublisher {

    private final RabbitTemplate rabbitTemplate;
    private final MessageMetadataHolder messageMetadataHolder;

    public void send(String fileName) throws NdwMessagingException {
        send(fileName, Map.of());
    }

    public void send(String fileName, Map<String, Object> messageHeaders) {
        var message = createMessage(fileName, messageHeaders);
        try {
            rabbitTemplate.send(message);
            logMessage(fileName, message);
        } catch (AmqpConnectException e) {
            throw new NdwMessagingException("Unable to connect to broker", e);
        } catch (AmqpAuthenticationException e) {
            throw new NdwMessagingException("Unable to authenticate using current credentials", e);
        } catch (AmqpException e) {
            throw new NdwMessagingException("Unable to send message to queue", e);
        }
    }

    public String sendAndReceive(String fileName) throws NdwMessagingException {
        try {
            var message = createMessage(fileName, Map.of());
            var result = rabbitTemplate.sendAndReceive(message);
            logMessage(fileName, message);
            if (result != null) {
                return new String(result.getBody(), StandardCharsets.UTF_8);
            } else {
                throw new NdwMessagingException("Received an empty result");
            }
        } catch (AmqpConnectException e) {
            throw new NdwMessagingException("Unable to connect to broker", e);
        } catch (AmqpAuthenticationException e) {
            throw new NdwMessagingException("Unable to authenticate using current credentials", e);
        } catch (AmqpException e) {
            throw new NdwMessagingException("Unable to send message to queue", e);
        }
    }

    private Message createMessage(String fileName, Map<String, Object> messageHeaders) {
        var fileNameBytes = fileName.getBytes(StandardCharsets.UTF_8);
        return messageMetadataHolder.setMetadataToMessageBuilder(MessageBuilder.withBody(fileNameBytes))
                .copyHeaders(messageHeaders)
                .setMessageId(UUID.nameUUIDFromBytes(fileNameBytes).toString())
                .setContentType(MessageProperties.CONTENT_TYPE_TEXT_PLAIN)
                .setTimestamp(Date.from(Instant.now()))
                .build();
    }

    private void logMessage(final String fileName, final Message message) {
        if (Objects.nonNull(message.getMessageProperties().getCorrelationId())) {
            log.info(
                    "Sending message `{}` to routing key `{}.{}` (correlation: `{}`).",
                    fileName,
                    rabbitTemplate.getExchange(),
                    rabbitTemplate.getRoutingKey(),
                    message.getMessageProperties().getCorrelationId());
        } else {
            log.info(
                    "Sending message `{}` to routing key `{}.{}`.",
                    fileName,
                    rabbitTemplate.getExchange(),
                    rabbitTemplate.getRoutingKey());
        }
    }
}
