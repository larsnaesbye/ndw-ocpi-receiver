package nu.ndw.ncis.core.messaging.metadata;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilderSupport;
import org.springframework.amqp.core.MessageProperties;

import java.time.Instant;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class MessageMetadataHolder {
    private static final ThreadLocal<MessageMetadata> THREAD_LOCAL = new ThreadLocal<>();

    public void setMetadataFromMessage(Message message) {
        var messageProperties = message.getMessageProperties();
        var messageMetadata = hasRequiredProperties(messageProperties)
                ? mapMessageToMetadata(messageProperties)
                : createMessageMetadata();
        THREAD_LOCAL.set(messageMetadata);
    }

    public MessageBuilderSupport<Message> setMetadataToMessageBuilder(MessageBuilderSupport<Message> messageBuilder) {
        var messageMetadata = getMetadata()
                .orElseGet(MessageMetadataHolder::createMessageMetadata);
        return mapMetadataToMessageBuilder(messageMetadata, messageBuilder);
    }

    public void remove() {
        THREAD_LOCAL.remove();
    }

    public Optional<MessageMetadata> getMetadata() {
        return Optional.ofNullable(THREAD_LOCAL.get());
    }

    private boolean hasRequiredProperties(MessageProperties messageProperties) {
        var headers = messageProperties.getHeaders();
        return Objects.nonNull(messageProperties.getCorrelationId())
                && messageProperties.getCorrelationId().trim().length() > 0
                && headers.containsKey(MessageMetadata.HEADER_FIRST_SEEN);
    }

    private static MessageMetadata mapMessageToMetadata(MessageProperties messageProperties) {
        return new MessageMetadata(
                messageProperties.getCorrelationId(),
                mapStringToInstant(messageProperties.getHeader(MessageMetadata.HEADER_FIRST_SEEN)));
    }

    private static MessageBuilderSupport<Message> mapMetadataToMessageBuilder(
            MessageMetadata messageMetadata,
            MessageBuilderSupport<Message> messageBuilder) {
        return messageBuilder
                .setCorrelationId(messageMetadata.getCorrelationId())
                .setHeaderIfAbsent(MessageMetadata.HEADER_FIRST_SEEN, messageMetadata.getFirstSeen().toString());
    }

    private static MessageMetadata createMessageMetadata() {
        return new MessageMetadata(
                UUID.randomUUID().toString(),
                Instant.now());
    }

    private static Instant mapStringToInstant(String instantValue) {
        return Instant.parse(instantValue);
    }
}
