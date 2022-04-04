package nu.ndw.ncis.core.fixtures.exception;

import org.springframework.amqp.AmqpAuthenticationException;
import org.springframework.amqp.AmqpConnectException;
import org.springframework.amqp.AmqpException;

public class AmqpExceptionFixtures {
    private AmqpExceptionFixtures() {
    }

    public static AmqpException getAmqpException() {
        return new AmqpException("Exception while communicating with broker");
    }

    public static AmqpConnectException getAmqpConnectException() {
        return new AmqpConnectException("Exception while connecting to broker", null);
    }

    public static AmqpAuthenticationException getAmqpAuthenticationException() {
        return new AmqpAuthenticationException(null);
    }
}
