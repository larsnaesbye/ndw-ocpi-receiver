package nu.ndw.ncis.core.fixtures.exception;

import nu.ndw.ncis.core.exception.NdwProcessingException;

public class NdwProcessingExceptionFixtures {
    private NdwProcessingExceptionFixtures() {
    }

    public static NdwProcessingException getNdwProcessingException() {
        return new NdwProcessingException("Exception while processing file");
    }
}
