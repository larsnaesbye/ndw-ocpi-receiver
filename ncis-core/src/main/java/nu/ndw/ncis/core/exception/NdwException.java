package nu.ndw.ncis.core.exception;

public class NdwException extends RuntimeException {
    public NdwException(String message) {
        super(message);
    }

    public NdwException(Throwable throwable) {
        super(throwable);
    }

    public NdwException(String message, Throwable cause) {
        super(message, cause);
    }
}
