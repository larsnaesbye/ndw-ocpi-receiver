package nu.ndw.ncis.core.fixtures.exception;

import nu.ndw.ncis.core.exception.NdwCloudStorageException;

public class NdwCloudStorageExceptionFixtures {
    private NdwCloudStorageExceptionFixtures() {
    }

    public static NdwCloudStorageException getNdwCloudStorageException() {
        return new NdwCloudStorageException("Exception while communicating with Azure Blob Storage");
    }
}
