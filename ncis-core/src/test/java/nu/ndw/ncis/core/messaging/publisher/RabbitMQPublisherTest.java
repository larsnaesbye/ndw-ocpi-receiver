package nu.ndw.ncis.core.messaging.publisher;

import nu.ndw.ncis.core.exception.NdwMessagingException;
import nu.ndw.ncis.core.fixtures.exception.AmqpExceptionFixtures;
import nu.ndw.ncis.core.messaging.metadata.MessageMetadataHolder;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.test.TestRabbitTemplate;

import java.nio.charset.StandardCharsets;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.then;
import static org.mockito.BDDMockito.willThrow;
import static org.mockito.Mockito.doAnswer;

@ExtendWith(MockitoExtension.class)
class RabbitMQPublisherTest {

    private static final String FILENAME = "test.json.gz";

    @InjectMocks
    private RabbitMQPublisher rabbitMQPublisher;

    @Mock
    private TestRabbitTemplate rabbitTemplate;

    @Mock
    private MessageMetadataHolder messageMetadataHolder;

    @Captor
    private ArgumentCaptor<Message> messageCaptor;

    @Test
    void testSendShouldSendMessageWithCorrectPayload() throws NdwMessagingException {
        prepareMessageMetadataHolderToMessageBuilder();

        rabbitMQPublisher.send(FILENAME);

        then(rabbitTemplate).should().send(messageCaptor.capture());

        byte[] body = messageCaptor.getValue().getBody();
        assertThat(body).isEqualTo(FILENAME.getBytes(StandardCharsets.UTF_8));
    }

    @Test
    void testSendShouldSendMessageWithCorrectContentType() throws NdwMessagingException {
        prepareMessageMetadataHolderToMessageBuilder();

        rabbitMQPublisher.send(FILENAME);

        then(rabbitTemplate).should().send(messageCaptor.capture());
        MessageProperties properties = messageCaptor.getValue().getMessageProperties();

        assertThat(properties.getContentType()).isEqualTo(MessageProperties.CONTENT_TYPE_TEXT_PLAIN);
    }

    @Test
    void testSendShouldSendMessageWithTimestamp() throws NdwMessagingException {
        prepareMessageMetadataHolderToMessageBuilder();

        rabbitMQPublisher.send(FILENAME);

        then(rabbitTemplate).should().send(messageCaptor.capture());
        MessageProperties properties = messageCaptor.getValue().getMessageProperties();

        assertThat(properties.getTimestamp()).isNotNull();
    }

    @Test
    void testSendShouldThrowNdwMessagingExceptionWhenUnableToConnectToBroker() {
        prepareMessageMetadataHolderToMessageBuilder();

        Throwable cause = AmqpExceptionFixtures.getAmqpConnectException();
        prepareRabbitTemplateToThrowException(cause);

        Throwable thrownException = catchThrowable(() -> rabbitMQPublisher.send(FILENAME));

        assertThat(thrownException)
                .isInstanceOf(NdwMessagingException.class)
                .hasMessage("Unable to connect to broker")
                .hasCause(cause);
    }

    @Test
    void testSendShouldThrowNdwMessagingExceptionWhenUnableToAuthenticate() {
        prepareMessageMetadataHolderToMessageBuilder();

        Throwable cause = AmqpExceptionFixtures.getAmqpAuthenticationException();
        prepareRabbitTemplateToThrowException(cause);

        Throwable thrownException = catchThrowable(() -> rabbitMQPublisher.send(FILENAME));

        assertThat(thrownException)
                .isInstanceOf(NdwMessagingException.class)
                .hasMessage("Unable to authenticate using current credentials")
                .hasCause(cause);
    }

    @Test
    void testSendShouldThrowNdwMessagingExceptionWhenAmqpException() {
        prepareMessageMetadataHolderToMessageBuilder();

        Throwable cause = AmqpExceptionFixtures.getAmqpException();
        prepareRabbitTemplateToThrowException(cause);

        Throwable thrownException = catchThrowable(() -> rabbitMQPublisher.send(FILENAME));

        assertThat(thrownException)
                .isInstanceOf(NdwMessagingException.class)
                .hasMessage("Unable to send message to queue")
                .hasCause(cause);
    }

    @Test
    void testSendShouldCopyPropertiesAndHeadersWhenGivenMessageProperties() {
        prepareMessageMetadataHolderToMessageBuilder();

        var expectedHeaders = Map.<String, Object>of("key", "value");

        rabbitMQPublisher.send(FILENAME, expectedHeaders);

        then(rabbitTemplate).should().send(messageCaptor.capture());
        MessageProperties properties = messageCaptor.getValue().getMessageProperties();

        assertThat(properties.getTimestamp()).isNotNull();
        assertThat(properties.getHeaders().get("key")).isEqualTo("value");
    }

    private void prepareRabbitTemplateToThrowException(Throwable throwable) {
        willThrow(throwable).given(rabbitTemplate).send(any(Message.class));
    }

    private void prepareMessageMetadataHolderToMessageBuilder() {
        doAnswer(x -> x.getArgument(0))
                .when(messageMetadataHolder)
                .setMetadataToMessageBuilder(any());
    }
}