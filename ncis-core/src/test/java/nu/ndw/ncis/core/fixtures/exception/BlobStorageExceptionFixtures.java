package nu.ndw.ncis.core.fixtures.exception;

import com.azure.storage.blob.models.BlobStorageException;

public class BlobStorageExceptionFixtures {
    private BlobStorageExceptionFixtures() {
    }

    public static BlobStorageException getBlobStorageException() {
        return new BlobStorageException("test", null, null);
    }
}
