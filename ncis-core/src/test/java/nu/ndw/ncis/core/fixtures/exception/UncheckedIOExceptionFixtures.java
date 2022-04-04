package nu.ndw.ncis.core.fixtures.exception;

import java.io.IOException;
import java.io.UncheckedIOException;

public class UncheckedIOExceptionFixtures {
    private UncheckedIOExceptionFixtures() {
    }

    public static UncheckedIOException getUncheckedIOException() {
        return new UncheckedIOException("test", new IOException());
    }
}
