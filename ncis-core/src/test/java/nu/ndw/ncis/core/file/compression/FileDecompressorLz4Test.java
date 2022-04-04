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
class FileDecompressorLz4Test {

    private static final byte[] EXPECTED_TEST_BYTES = "test".getBytes(StandardCharsets.UTF_8);
    private final static FileWrapper COMPRESSED_FILE = FileWrapperFixtures.getCompressedLz4File();
    private final static FileWrapper ERROR_FILE = FileWrapperFixtures.getLz4FileWithError();

    @InjectMocks
    private FileDecompressorLz4 fileDecompressor;

    @Test
    void testDecompressFileShouldRemoveGzipFileExtension() throws NdwProcessingException {
        FileWrapper decompressedFile = fileDecompressor.decompressFile(COMPRESSED_FILE);

        assertThat(decompressedFile.getFileName()).doesNotContain(Compression.LZ4.getExtension());
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
    void testGetExtensionReturnsLz4() {
        var extension = fileDecompressor.getType();
        assertThat(extension)
                .isNotNull()
                .isEqualTo(Compression.LZ4);
    }
}
