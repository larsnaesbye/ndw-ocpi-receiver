package nu.ndw.ncis.core.file.compression;

import nu.ndw.ncis.core.exception.NdwProcessingException;
import nu.ndw.ncis.core.fixtures.FileWrapperFixtures;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class FileCompressorLz4Test {

    private static final byte[] TEST = "test".getBytes(StandardCharsets.UTF_8);
    private static final byte[] TEST_AS_LZ4 = FileWrapperFixtures.getTestAsLz4();

    @InjectMocks
    private FileCompressorLz4 fileCompressor;

    @Test
    void testCompressFileShouldCompressFile() throws NdwProcessingException {
        byte[] actualContent = fileCompressor.compressFile(TEST);

        assertThat(actualContent).isEqualTo(TEST_AS_LZ4);
    }

    @Test
    void testCompressStreamShouldCompressStream() throws Exception {
        try (ByteArrayOutputStream actualOutputStream = new ByteArrayOutputStream();
             OutputStream expectedOutputStream = fileCompressor.compressStream(actualOutputStream)) {
            expectedOutputStream.write(TEST);
            expectedOutputStream.close();

            assertThat(actualOutputStream.toByteArray())
                    .isEqualTo(TEST_AS_LZ4);
        }
    }
}
