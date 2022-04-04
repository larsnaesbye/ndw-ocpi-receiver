package nu.ndw.ncis.core.exception;

public class NdwHttpException extends NdwException {
    public NdwHttpException(String message) {
        super(message);
    }

    public NdwHttpException(String message, Throwable cause) {
        super(message, cause);
    }
}
