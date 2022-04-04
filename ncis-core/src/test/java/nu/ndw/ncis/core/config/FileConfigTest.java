package nu.ndw.ncis.core.config;

import nu.ndw.ncis.core.file.compression.FileCompressor;
import nu.ndw.ncis.core.file.compression.FileCompressorGzip;
import nu.ndw.ncis.core.file.compression.FileCompressorLz4;
import nu.ndw.ncis.core.file.compression.FileDecompressor;
import nu.ndw.ncis.core.file.compression.FileDecompressorGzip;
import nu.ndw.ncis.core.file.compression.FileDecompressorLz4;
import nu.ndw.ncis.core.fixtures.FileWrapperFixtures;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.assertj.AssertableApplicationContext;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import java.nio.charset.StandardCharsets;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class FileConfigTest {

    private static final byte[] TEST = "test".getBytes(StandardCharsets.UTF_8);
    private static final byte[] TEST_AS_GZIP = FileWrapperFixtures.getTestAsGzip();
    private static final byte[] TEST_AS_LZ4 = FileWrapperFixtures.getTestAsLz4();
    private static final String BEAN_NAME_COMPRESSOR_GZIP = "fileCompressorGzip";
    private static final String BEAN_NAME_COMPRESSOR_LZ4 = "fileCompressorLz4";
    private static final String BEAN_NAME_DECOMPRESSOR_GZIP = "fileDecompressorGzip";
    private static final String BEAN_NAME_DECOMPRESSOR_LZ4 = "fileDecompressorLz4";
    private static final String PROPERTY_FILE_COMPRESSION_GZIP = "file.compression=gzip";
    private static final String PROPERTY_FILE_COMPRESSION_LZ4 = "file.compression=lz4";

    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner();

    @Test
    void testShouldCreateLz4FileCompressorGivenFileCompressionValueSetToLz4() {
        this.contextRunner.withPropertyValues(PROPERTY_FILE_COMPRESSION_LZ4)
                .withUserConfiguration(FileConfig.class)
                .run(context -> {
                    assertThat(context).hasBean(BEAN_NAME_COMPRESSOR_LZ4);
                    FileCompressor fileCompressor = context.getBean(FileCompressorLz4.class);
                    byte[] actualContent = fileCompressor.compressContent(TEST);
                    assertThat(actualContent).isEqualTo(TEST_AS_LZ4);
                    assertThat(context).doesNotHaveBean(BEAN_NAME_COMPRESSOR_GZIP);
                });
    }

    @Test
    void testShouldCreateGzipFileCompressorGivenFileCompressionValueSetToGzip() {
        this.contextRunner.withPropertyValues(PROPERTY_FILE_COMPRESSION_GZIP)
                .withUserConfiguration(FileConfig.class)
                .run(context -> {
                    assertThat(context).hasBean(BEAN_NAME_COMPRESSOR_GZIP);
                    FileCompressor fileCompressor = context.getBean(FileCompressorGzip.class);
                    byte[] actualContent = fileCompressor.compressContent(TEST);
                    assertThat(actualContent).isEqualTo(TEST_AS_GZIP);
                    assertThat(context).doesNotHaveBean(BEAN_NAME_COMPRESSOR_LZ4);
                });
    }

    @Test
    void testShouldCreateGzipFileCompressorGivenFileCompressionValueNotSet() {
        this.contextRunner
                .withUserConfiguration(FileConfig.class)
                .run(context -> {
                    assertThat(context).hasBean(BEAN_NAME_COMPRESSOR_GZIP);
                    FileCompressor fileCompressor = context.getBean(FileCompressorGzip.class);
                    byte[] actualContent = fileCompressor.compressContent(TEST);
                    assertThat(actualContent).isEqualTo(TEST_AS_GZIP);
                    assertThat(context).doesNotHaveBean(BEAN_NAME_COMPRESSOR_LZ4);
                });
    }

    @Test
    void testShouldCreateGzipAndLz4FileDecompressorGivenFileCompressionValueSetToLz4() {
        this.contextRunner.withPropertyValues(PROPERTY_FILE_COMPRESSION_LZ4)
                .withUserConfiguration(FileConfig.class)
                .run(this::assertDecompressorsAlwaysAvailable);
    }
    @Test
    void testShouldCreateGzipAndLz4FileDecompressorGivenFileCompressionValueSetToGzip() {
        this.contextRunner.withPropertyValues(PROPERTY_FILE_COMPRESSION_GZIP)
                .withUserConfiguration(FileConfig.class)
                .run(this::assertDecompressorsAlwaysAvailable);
    }

    @Test
    void testShouldCreateGzipAndLz4FileDecompressorGivenFileCompressionValueNotSet() {
        this.contextRunner
                .withUserConfiguration(FileConfig.class)
                .run(this::assertDecompressorsAlwaysAvailable);
    }

    void assertDecompressorsAlwaysAvailable(AssertableApplicationContext context) {
        assertThat(context).hasBean(BEAN_NAME_DECOMPRESSOR_LZ4);
        assertThat(context).hasBean(BEAN_NAME_DECOMPRESSOR_GZIP);
        FileDecompressor fileDecompressorLz4 =
                context.getBean(FileDecompressorLz4.class);
        byte[] decompressLz4Content =
                fileDecompressorLz4.decompressContent(TEST_AS_LZ4);
        assertThat(decompressLz4Content).isEqualTo(TEST);
        FileDecompressor fileDecompressorGzip =
                context.getBean(FileDecompressorGzip.class);
        byte[] decompressGzipContent =
                fileDecompressorGzip.decompressContent(TEST_AS_GZIP);
        assertThat(decompressGzipContent).isEqualTo(TEST);
    }
}
