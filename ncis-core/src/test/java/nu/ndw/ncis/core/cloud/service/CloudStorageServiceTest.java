package nu.ndw.ncis.core.cloud.service;

import nu.ndw.ncis.core.cloud.FileWrapper;
import nu.ndw.ncis.core.cloud.repository.BlobStorageRepository;
import nu.ndw.ncis.core.exception.NdwCloudStorageException;
import nu.ndw.ncis.core.exception.NdwProcessingException;
import nu.ndw.ncis.core.file.compression.FileCompressor;
import nu.ndw.ncis.core.file.compression.FileDecompressor;
import nu.ndw.ncis.core.file.compression.FileDecompressorProvider;
import nu.ndw.ncis.core.fixtures.FileWrapperFixtures;
import nu.ndw.ncis.core.fixtures.exception.NdwCloudStorageExceptionFixtures;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.mockito.BDDMockito.any;
import static org.mockito.BDDMockito.doReturn;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.mock;
import static org.mockito.BDDMockito.then;
import static org.mockito.BDDMockito.willThrow;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class CloudStorageServiceTest {

    @InjectMocks
    private CloudStorageService cloudStorageService;

    @Mock
    private BlobStorageRepository blobStorageRepository;
    @Mock
    private FileDecompressorProvider fileDecompressorProvider;
    @Mock
    private FileDecompressor fileDecompressor;
    @Mock
    private FileCompressor fileCompressor;

    private static final String FILENAME = "test.json.gz";
    private static final Throwable CAUSE = new NdwProcessingException("Test");
    private static final FileWrapper FILE_WRAPPER = FileWrapperFixtures.getFileWrapper();

    @Test
    void testGetFileFromCloud() throws NdwProcessingException {
        Optional<FileWrapper> optionalFileWrapper = Optional.of(FILE_WRAPPER);
        given(blobStorageRepository.getFileFromCloudStorage(FILENAME)).willReturn(optionalFileWrapper);
        given(fileDecompressorProvider.getFileDecompressor(FILENAME)).willReturn(fileDecompressor);
        given(fileDecompressor.decompressFile(optionalFileWrapper.get())).willReturn(FILE_WRAPPER);

        Optional<FileWrapper> actualFile = cloudStorageService.getFileFromCloud(FILENAME);

        assertThat(actualFile).isEqualTo(optionalFileWrapper);
    }

    @Test
    void testGetFileFromCloudShouldDelegateNdwProcessingException()
            throws NdwProcessingException {
        given(blobStorageRepository.getFileFromCloudStorage(FILENAME)).willReturn(Optional.of(FILE_WRAPPER));
        given(fileDecompressorProvider.getFileDecompressor(FILENAME)).willReturn(fileDecompressor);
        willThrow(CAUSE).given(fileDecompressor).decompressFile(any());

        Optional<FileWrapper> actualFileWrapper = cloudStorageService.getFileFromCloud(FILENAME);

        assertThat(actualFileWrapper).isEmpty();
    }

    @Test
    void testSaveFileToCloud() throws NdwCloudStorageException, NdwProcessingException {
        given(fileCompressor.compressFile(any())).willReturn(FILE_WRAPPER.getContent());
        cloudStorageService.saveFileToCloud(FILE_WRAPPER);
        then(blobStorageRepository).should().saveFileToCloudStorage(FILE_WRAPPER);
    }

    @Test
    void testSaveFileToCloudShouldDelegateNdwCloudStorageException()
            throws NdwCloudStorageException, NdwProcessingException {
        Throwable cause = NdwCloudStorageExceptionFixtures.getNdwCloudStorageException();
        prepareBlobStorageRepositoryToThrowExceptionOnSave(cause);
        given(fileCompressor.compressFile(any())).willReturn(FILE_WRAPPER.getContent());

        Throwable throwable = catchThrowable(() -> cloudStorageService.saveFileToCloud(FILE_WRAPPER));

        assertThat(throwable).isEqualTo(cause);
    }

    @Test
    void testSaveFileToCloudShouldDelegateNdwProcessingException()
            throws NdwProcessingException {
        willThrow(CAUSE).given(fileCompressor).compressFile(any());

        Throwable throwable = catchThrowable(() -> cloudStorageService.saveFileToCloud(FILE_WRAPPER));

        assertThat(throwable).getCause().isEqualTo(CAUSE);
    }

    @Test
    void testGetStreamFromCloudStorageShouldReturnDecompressedInputStreamWhenBlobExists() {
        InputStream expectedInputStream = mock(InputStream.class);
        doReturn(Optional.of(expectedInputStream)).when(blobStorageRepository)
                .getStreamFromCloudStorage(FILENAME);
        given(fileDecompressorProvider.getFileDecompressor(FILENAME)).willReturn(fileDecompressor);
        doReturn(expectedInputStream).when(fileDecompressor).decompressStream(expectedInputStream);

        Optional<InputStream> actualOptionalInputStream = cloudStorageService.getStreamFromCloudStorage(FILENAME);

        assertThat(actualOptionalInputStream)
                .isPresent()
                .get()
                .isEqualTo(expectedInputStream);
    }

    @Test
    void testGetStreamFromCloudStorageShouldReturnEmptyWhenBlobDoesNotExists() {
        doReturn(Optional.empty()).when(blobStorageRepository)
                .getStreamFromCloudStorage(FILENAME);
        given(fileDecompressorProvider.getFileDecompressor(FILENAME)).willReturn(fileDecompressor);

        Optional<InputStream> actualOptionalInputStream = cloudStorageService.getStreamFromCloudStorage(FILENAME);

        verify(fileDecompressor, never()).decompressStream(any());

        assertThat(actualOptionalInputStream)
                .isEmpty();
    }

    @Test
    void testSaveStreamToCloudStorageShouldReturnCompressedStream() {
        OutputStream expectedOutputStream = mock(OutputStream.class);
        doReturn(expectedOutputStream).when(blobStorageRepository).saveStreamToCloudStorage(FILENAME);
        doReturn(expectedOutputStream).when(fileCompressor).compressStream(expectedOutputStream);

        OutputStream actualOutputStream = cloudStorageService.saveStreamToCloudStorage(FILENAME);

        assertThat(actualOutputStream)
                .isEqualTo(expectedOutputStream);
    }

    private void prepareBlobStorageRepositoryToThrowExceptionOnSave(Throwable throwable)
            throws NdwCloudStorageException {
        willThrow(throwable).given(blobStorageRepository).saveFileToCloudStorage(FILE_WRAPPER);
    }
}