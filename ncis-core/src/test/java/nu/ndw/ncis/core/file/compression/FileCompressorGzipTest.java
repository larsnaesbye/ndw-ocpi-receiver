package nu.ndw.ncis.core.file.compression;

import nu.ndw.ncis.core.exception.NdwProcessingException;
import nu.ndw.ncis.core.fixtures.FileWrapperFixtures;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doThrow;

@ExtendWith(MockitoExtension.class)
class FileCompressorGzipTest {

    private static final byte[] TEST = "test".getBytes(StandardCharsets.UTF_8);
    private static final byte[] TEST_AS_GZIP = FileWrapperFixtures.getTestAsGzip();

    @Mock
    private ByteArrayOutputStream outputStream;
    @InjectMocks
    private FileCompressorGzip fileCompressor;

    @Test
    void testCompressFileShouldCompressFile() throws NdwProcessingException {
        byte[] actualContent = fileCompressor.compressFile(TEST);

        assertThat(actualContent).isEqualTo(TEST_AS_GZIP);
    }

    @Test
    void testCompressStreamShouldCompressStream() throws Exception {
        try (ByteArrayOutputStream actualOutputStream = new ByteArrayOutputStream();
             OutputStream expectedOutputStream = fileCompressor.compressStream(actualOutputStream)) {
            expectedOutputStream.write(TEST);
            expectedOutputStream.close();

            assertThat(actualOutputStream.toByteArray())
                    .isEqualTo(TEST_AS_GZIP);
        }
    }

    @Test
    void testCompressStreamShouldThrowNdwProcessingExceptionWhenIOExceptionOccurs()
            throws IOException {
        doThrow(new IOException()).when(outputStream).write(any());
        assertThrows(NdwProcessingException.class,
                () -> fileCompressor.compressStream(outputStream));
    }
}
