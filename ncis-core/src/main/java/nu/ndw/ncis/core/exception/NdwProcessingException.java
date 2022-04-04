package nu.ndw.ncis.core.exception;

public class NdwProcessingException extends NdwException {
    public NdwProcessingException(String message) {
        super(message);
    }

    public NdwProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
