package nu.ndw.ncis.core.messaging.metadata;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class MessageMetadataHolderTest {
    private static final String EXPECTED_CORRELATION_ID = "123";
    private static final Instant EXPECTED_FIRST_SEEN = Instant.now();

    @InjectMocks
    private MessageMetadataHolder messageMetadataHolder;

    @Test
    void testSetMetadataFromMessageShouldMapToMessageMetadataAndStoreWhenMessageContainsRequiredProperties() {
        var expectedMessage = createMessage(EXPECTED_CORRELATION_ID, EXPECTED_FIRST_SEEN);

        messageMetadataHolder.setMetadataFromMessage(expectedMessage);

        var actualMetadataOptional = messageMetadataHolder.getMetadata();

        assertThat(actualMetadataOptional)
                .isPresent()
                .get()
                .hasFieldOrPropertyWithValue("correlationId", EXPECTED_CORRELATION_ID)
                .hasFieldOrPropertyWithValue("firstSeen", EXPECTED_FIRST_SEEN);
    }

    @Test
    void testSetMetadataFromMessageShouldCreateMessageMetadataWhenMessageDoesNotContainRequiredProperties() {
        var expectedMessage = createMessageBuilder().build();

        messageMetadataHolder.setMetadataFromMessage(expectedMessage);

        var actualMetadataOptional = messageMetadataHolder.getMetadata();

        assertThat(actualMetadataOptional)
                .isPresent();
    }

    @Test
    void testGetMetadataShouldGetValueFromOwnThreadWhenUsedByMultipleThreads() throws InterruptedException {
        var expectedMessage = createMessage(EXPECTED_CORRELATION_ID, EXPECTED_FIRST_SEEN);

        messageMetadataHolder.setMetadataFromMessage(expectedMessage);

        var threadOne = new Thread(() -> {
            var expectedCorrelationId = "1";
            var expectedFirstSeen = Instant.now().plus(1, ChronoUnit.MINUTES);
            var anotherExpectedMessage = createMessage(expectedCorrelationId, expectedFirstSeen);
            messageMetadataHolder.setMetadataFromMessage(anotherExpectedMessage);

            assertThat(messageMetadataHolder.getMetadata())
                    .isPresent()
                    .get()
                    .hasFieldOrPropertyWithValue("correlationId", expectedCorrelationId)
                    .hasFieldOrPropertyWithValue("firstSeen", expectedFirstSeen);
        });
        threadOne.start();
        threadOne.join();

        assertThat(messageMetadataHolder.getMetadata())
                .isPresent()
                .get()
                .hasFieldOrPropertyWithValue("correlationId", EXPECTED_CORRELATION_ID)
                .hasFieldOrPropertyWithValue("firstSeen", EXPECTED_FIRST_SEEN);
    }

    @Test
    void testRemoveShouldClearInternalData() {
        var expectedMessage = createMessage(EXPECTED_CORRELATION_ID, EXPECTED_FIRST_SEEN);

        messageMetadataHolder.setMetadataFromMessage(expectedMessage);
        messageMetadataHolder.remove();

        assertThat(messageMetadataHolder.getMetadata())
                .isEmpty();
    }

    @Test
    void testSetMetadataToMessageBuilderShouldFillMessageBuilderWithMetadataWhenMetadataStored() {
        var expectedMessage = createMessage(EXPECTED_CORRELATION_ID, EXPECTED_FIRST_SEEN);

        messageMetadataHolder.setMetadataFromMessage(expectedMessage);

        var actualMessage = messageMetadataHolder.setMetadataToMessageBuilder(MessageBuilder.withBody(new byte[0]))
                .build();

        assertThat(actualMessage.getMessageProperties().getCorrelationId())
                .isEqualTo(EXPECTED_CORRELATION_ID);

        assertThat(actualMessage.getMessageProperties().<String>getHeader("x-first-seen"))
                .isEqualTo(EXPECTED_FIRST_SEEN.toString());
    }

    @Test
    void testSetMetadataToMessageBuilderShouldFillMessageBuilderWithMetadataWhenNoInternalDataStored() {
        var actualMessage = messageMetadataHolder.setMetadataToMessageBuilder(MessageBuilder.withBody(new byte[0]))
                .build();

        assertThat(actualMessage.getMessageProperties().getCorrelationId())
                .isNotBlank();

        assertThat(actualMessage.getMessageProperties().<String>getHeader("x-first-seen"))
                .isNotNull();
    }

    private static MessageBuilder createMessageBuilder() {
        return MessageBuilder.withBody(new byte[0]);
    }

    private static Message createMessage(String correlationId, Instant firstSeenInstant) {
        return createMessageBuilder()
                .setCorrelationId(correlationId)
                .setHeader("x-first-seen", firstSeenInstant.toString())
                .build();
    }
}
