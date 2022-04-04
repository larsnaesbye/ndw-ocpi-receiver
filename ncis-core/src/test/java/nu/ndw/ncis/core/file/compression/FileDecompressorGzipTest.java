package nu.ndw.ncis.core.file.compression;

import nu.ndw.ncis.core.cloud.FileWrapper;
import nu.ndw.ncis.core.exception.NdwProcessingException;
import nu.ndw.ncis.core.fixtures.FileWrapperFixtures;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

@ExtendWith(MockitoExtension.class)
class FileDecompressorGzipTest {

    private static final byte[] EXPECTED_TEST_BYTES = "test".getBytes(StandardCharsets.UTF_8);
    private final static FileWrapper COMPRESSED_FILE = FileWrapperFixtures.getCompressedGzipFile();
    private final static FileWrapper ERROR_FILE = FileWrapperFixtures.getGzipFileWithError();

    @InjectMocks
    private FileDecompressorGzip fileDecompressor;

    @Test
    void testDecompressFileShouldRemoveGzipFileExtension() throws NdwProcessingException {
        FileWrapper decompressedFile = fileDecompressor.decompressFile(COMPRESSED_FILE);

        assertThat(decompressedFile.getFileName()).doesNotContain(Compression.GZIP.getExtension());
    }

    @Test
    void testDecompressFileShouldDecompressFileContent() throws NdwProcessingException {
        FileWrapper decompressedFile = fileDecompressor.decompressFile(COMPRESSED_FILE);

        assertThat(decompressedFile.getContent())
                .isEqualTo(EXPECTED_TEST_BYTES);
    }

    @Test
    void testDecompressFileShouldThrowNdwProcessingExceptionOnDecompressingError() {
        Throwable throwable = catchThrowable(() -> fileDecompressor.decompressFile(ERROR_FILE));

        assertThat(throwable)
                .isInstanceOf(NdwProcessingException.class)
                .hasMessage("Unable to unzip file \"" + COMPRESSED_FILE.getFileName() + "\".");
    }

    @Test
    void testDecompressStreamShouldDecompressStream() throws Exception {
        try (ByteArrayInputStream expectedInputStream = new ByteArrayInputStream(COMPRESSED_FILE.getContent());
            InputStream inputStream = fileDecompressor.decompressStream(expectedInputStream)) {
            assertThat(inputStream.readAllBytes())
                    .isEqualTo(EXPECTED_TEST_BYTES);
        }
    }

    @Test
    void testDecompressStreamShouldThrowExceptionWhenStreamHeaderIsNotGzip() throws Exception {
        try (ByteArrayInputStream expectedInputStream = new ByteArrayInputStream(ERROR_FILE.getContent())) {
            Throwable caughtThrowable = catchThrowable(() -> fileDecompressor.decompressStream(expectedInputStream));

            assertThat(caughtThrowable)
                    .isInstanceOf(NdwProcessingException.class)
                    .hasMessage("Unable to unzip file.");
        }
    }

    @Test
    void testGetExtensionReturnsGzip() {
        var extension = fileDecompressor.getType();
        assertThat(extension)
                .isNotNull()
                .isEqualTo(Compression.GZIP);
    }
}
