package nu.ndw.ncis.core.file.service;

import nu.ndw.ncis.core.cloud.FileWrapper;
import nu.ndw.ncis.core.cloud.InputStreamFileWrapper;
import nu.ndw.ncis.core.cloud.OutputStreamFileWrapper;
import nu.ndw.ncis.core.config.properties.FileProperties;
import nu.ndw.ncis.core.exception.NdwProcessingException;
import nu.ndw.ncis.core.file.compression.Compression;
import nu.ndw.ncis.core.file.compression.FileCompressor;
import nu.ndw.ncis.core.file.compression.FileDecompressor;
import nu.ndw.ncis.core.file.compression.FileDecompressorProvider;
import nu.ndw.ncis.core.fixtures.FileWrapperFixtures;
import nu.ndw.ncis.core.fixtures.exception.NdwProcessingExceptionFixtures;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.mockito.BDDMockito.eq;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willThrow;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
class FileServiceTest {

    private static final FileWrapper COMPRESSED_FILE = FileWrapperFixtures.getCompressedGzipFile();
    private static final FileWrapper DECOMPRESSED_FILE = FileWrapperFixtures.getUncompressedFile();
    private static final String JSON = "{\"name\": \"test\"}";
    private static final String FILE_DIRECTORY = "test";

    @InjectMocks
    private FileService fileService;

    @Mock
    private FileDecompressorProvider fileDecompressorProvider;

    @Mock
    private FileDecompressor fileDecompressor;

    @Mock
    private FileCompressor fileCompressor;

    @Mock
    private FileProperties properties;

    @Mock
    private Compression compression;

    @Test
    void testShouldReturnNewFileWrapperWhenDecompressed() throws NdwProcessingException {
        given(fileDecompressor.decompressContent(COMPRESSED_FILE.getContent()))
                .willReturn(DECOMPRESSED_FILE.getContent());
        given(fileDecompressorProvider.getFileDecompressor(COMPRESSED_FILE.getFileName()))
                .willReturn(fileDecompressor);
        given(fileDecompressor.getFileNameWithoutExtension(COMPRESSED_FILE.getFileName()))
                .willReturn(DECOMPRESSED_FILE.getFileName());

        FileWrapper actualFile = fileService.decompressFile(COMPRESSED_FILE);

        assertThat(actualFile)
                .isEqualTo(DECOMPRESSED_FILE)
                .isNotEqualTo(COMPRESSED_FILE);
    }

    @Test
    void testShouldDelegateNdwProcessingExceptionWhenExceptionOnDecompressing() throws NdwProcessingException {
        Throwable cause = NdwProcessingExceptionFixtures.getNdwProcessingException();
        prepareFileDecompressorToThrowException(cause);
        given(fileDecompressorProvider.getFileDecompressor(COMPRESSED_FILE.getFileName()))
                .willReturn(fileDecompressor);
        given(fileDecompressor.getFileNameWithoutExtension(COMPRESSED_FILE.getFileName()))
                .willReturn(DECOMPRESSED_FILE.getFileName());

        Throwable thrownException = catchThrowable(() -> fileService.decompressFile(COMPRESSED_FILE));

        assertThat(thrownException).isEqualTo(cause);
    }

    @Test
    void testPrepareFileShouldCreateFileNameWithDirectorySetByProperties() throws NdwProcessingException {
        prepareFilePropertiesToReturnDirectory();
        doReturn(compression).when(fileCompressor).getType();
        doReturn(Compression.GZIP.getExtension()).when(compression).getExtension();

        FileWrapper actualFileWrapper = fileService.prepareFile(JSON);

        assertThat(actualFileWrapper.getFileName()).startsWith("test/");
    }

    @Test
    void testPrepareFileShouldCreateFileNameWithGzipExtension() throws NdwProcessingException {
        prepareFilePropertiesToReturnDirectory();
        doReturn(Compression.GZIP).when(fileCompressor).getType();

        FileWrapper actualFileWrapper = fileService.prepareFile(JSON);

        assertThat(actualFileWrapper.getFileName()).endsWith(Compression.GZIP.getExtension());
    }

    @Test
    void testPrepareFileShouldThrowNdwProcessingExceptionWhenNoDirectoryConfigured() {
        prepareFilePropertiesToReturnNullDirectory();

        Throwable caughtException = catchThrowable(() -> fileService.prepareFile(JSON));

        assertThat(caughtException)
                .isInstanceOf(NdwProcessingException.class)
                .hasMessage("Unable to create file, directory is not configured or has not been loaded correctly");
    }

    @Test
    void testPrepareFileShouldCreateFileNameWithJsonAndGzipExtension() throws NdwProcessingException {
        prepareFilePropertiesToReturnDirectory();
        doReturn(compression).when(fileCompressor).getType();
        doReturn(Compression.GZIP.getExtension()).when(compression).getExtension();

        FileWrapper actualFileWrapper = fileService.prepareFile(JSON);

        assertThat(actualFileWrapper.getFileName()).endsWith(".json.gz");
    }

    @Test
    void testPrepareFileShouldCreateNewFileWrapperWithCompressedContent() throws NdwProcessingException {
        prepareFilePropertiesToReturnDirectory();
        given(fileCompressor.compressContent(JSON.getBytes(StandardCharsets.UTF_8)))
                .willReturn(COMPRESSED_FILE.getContent());
        doReturn(compression).when(fileCompressor).getType();
        doReturn(Compression.GZIP.getExtension()).when(compression).getExtension();

        FileWrapper actualFileWrapper = fileService.prepareFile(JSON);

        assertThat(actualFileWrapper.getContent()).isEqualTo(COMPRESSED_FILE.getContent());
    }

    @Test
    void testPrepareFileShouldThrowNdwProcessingExceptionWhenExceptionOnCompressing() throws NdwProcessingException {
        Throwable cause = NdwProcessingExceptionFixtures.getNdwProcessingException();
        prepareFilePropertiesToReturnDirectory();
        prepareFileCompressorToThrowException(cause);

        Throwable thrownException = catchThrowable(() -> fileService.prepareFile(JSON));

        assertThat(thrownException).isEqualTo(cause);
    }

    @Test
    void testGenerateFileName() {
        final String prefix = "fileprefix/subfolder/";

        String generatedFileName = fileService.generateFileName(prefix);

        assertThat(generatedFileName).matches(prefix +
                "\\d{4}-[01]\\d-[0-3]\\d/[0-2]\\d-[0-5]\\d-[0-5]\\d(?:\\.\\d+)?Z?");
    }

    @Test
    void testDecompressStreamShouldDecompressStream() throws IOException {
        InputStreamFileWrapper expectedFileWrapper = InputStreamFileWrapper.builder()
                .fileName(COMPRESSED_FILE.getFileName())
                .inputStream(mock(InputStream.class))
                .build();
        given(fileDecompressorProvider.getFileDecompressor(COMPRESSED_FILE.getFileName()))
                .willReturn(fileDecompressor);
        given(fileDecompressor.getFileNameWithoutExtension(COMPRESSED_FILE.getFileName()))
                .willReturn(DECOMPRESSED_FILE.getFileName());

        doReturn(new ByteArrayInputStream(DECOMPRESSED_FILE.getContent()))
                .when(fileDecompressor)
                .decompressStream(expectedFileWrapper.getInputStream());

        InputStreamFileWrapper actualFileWrapper = fileService.decompressStream(expectedFileWrapper);

        assertThat(actualFileWrapper.getFileName())
                .isEqualTo(DECOMPRESSED_FILE.getFileName());
        assertThat(actualFileWrapper.getInputStream().readAllBytes())
                .isEqualTo(DECOMPRESSED_FILE.getContent());
    }

    @Test
    void testPrepareStreamShouldCompressStream() {
        OutputStreamFileWrapper expectedFileWrapper = OutputStreamFileWrapper.builder()
                .fileName(DECOMPRESSED_FILE.getFileName())
                .outputStream(mock(OutputStream.class))
                .build();

        doReturn(expectedFileWrapper.getOutputStream())
                .when(fileCompressor)
                .compressStream(expectedFileWrapper.getOutputStream());

        OutputStreamFileWrapper actualFileWrapper = fileService.prepareStream(expectedFileWrapper);

        assertThat(actualFileWrapper.getFileName())
                .isEqualTo(expectedFileWrapper.getFileName());
        assertThat(actualFileWrapper.getOutputStream())
                .isEqualTo(expectedFileWrapper.getOutputStream());
    }

    private void prepareFileDecompressorToThrowException(Throwable cause) throws NdwProcessingException {
        willThrow(cause).given(fileDecompressor).decompressContent(eq(COMPRESSED_FILE.getContent()));
    }

    private void prepareFileCompressorToThrowException(Throwable cause) throws NdwProcessingException {
        willThrow(cause).given(fileCompressor).compressContent(JSON.getBytes(StandardCharsets.UTF_8));
    }

    private void prepareFilePropertiesToReturnDirectory() {
        given(properties.getDirectory()).willReturn(FILE_DIRECTORY);
    }

    private void prepareFilePropertiesToReturnNullDirectory() {
        given(properties.getDirectory()).willReturn(null);
    }
}
