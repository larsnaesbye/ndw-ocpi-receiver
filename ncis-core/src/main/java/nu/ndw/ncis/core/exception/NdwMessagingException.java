package nu.ndw.ncis.core.exception;

public class NdwMessagingException extends NdwException {
    public NdwMessagingException(String message) {
        super(message);
    }

    public NdwMessagingException(String message, Throwable cause) {
        super(message, cause);
    }
}