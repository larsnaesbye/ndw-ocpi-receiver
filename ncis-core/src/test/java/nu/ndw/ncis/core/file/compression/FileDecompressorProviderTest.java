package nu.ndw.ncis.core.file.compression;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class FileDecompressorProviderTest {

    private static final String EXTENSION_GZIP = Compression.GZIP.getExtension();
    private static final String EXTENSION_LZ4 = Compression.LZ4.getExtension();
    private static final String FILENAME = "am_i_zipped_or_am_i_not";

    @Mock
    private FileDecompressor fileDecompressorGzip;
    @Mock
    private FileDecompressor fileDecompressorLz4;

    private FileDecompressorProvider fileDecompressorProvider;

    @BeforeEach
    void setUp() {
        fileDecompressorProvider =
                new FileDecompressorProvider(fileDecompressorGzip, fileDecompressorLz4);
    }

    @Test
    void testGetFileDecompressorShouldReturnGzipWhenExtensionIsGzip() {
        var fileDecompressor =
                fileDecompressorProvider.getFileDecompressor(FILENAME + EXTENSION_GZIP);

        assertThat(fileDecompressor)
                .isEqualTo(fileDecompressorGzip)
                .isNotEqualTo(fileDecompressorLz4);
    }

    @Test
    void testGetFileDecompressorShouldReturnLz4WhenExtensionIsLz4() {
        var fileDecompressor =
                fileDecompressorProvider.getFileDecompressor(FILENAME + EXTENSION_LZ4);

        assertThat(fileDecompressor)
                .isEqualTo(fileDecompressorLz4)
                .isNotEqualTo(fileDecompressorGzip);
    }

    @Test
    void testGetFileDecompressorShouldReturnGzipWhenExtensionIsNotRecognized() {
        var fileDecompressor =
                fileDecompressorProvider.getFileDecompressor(FILENAME);

        assertThat(fileDecompressor)
                .isEqualTo(fileDecompressorGzip)
                .isNotEqualTo(fileDecompressorLz4);
    }
}
