package nu.ndw.ncis.core.exception;

public class NdwCloudStorageException extends NdwException {
    public NdwCloudStorageException(String message) {
        super(message);
    }

    public NdwCloudStorageException(Throwable throwable) {
        super(throwable);
    }

    public NdwCloudStorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
