package nu.ndw.ncis.core.cloud.repository;

import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.specialized.BlobInputStream;
import com.azure.storage.blob.specialized.BlobOutputStream;
import com.azure.storage.blob.specialized.BlockBlobClient;
import nu.ndw.ncis.core.cloud.FileWrapper;
import nu.ndw.ncis.core.exception.NdwCloudStorageException;
import nu.ndw.ncis.core.fixtures.FileWrapperFixtures;
import nu.ndw.ncis.core.fixtures.exception.BlobStorageExceptionFixtures;
import nu.ndw.ncis.core.fixtures.exception.UncheckedIOExceptionFixtures;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.anyLong;
import static org.mockito.BDDMockito.doReturn;
import static org.mockito.BDDMockito.eq;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.BDDMockito.willThrow;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
class BlobStorageRepositoryTest {

    @InjectMocks
    private BlobStorageRepository blobStorageRepository;

    @Mock
    private BlobContainerClient blobContainerClient;

    @Mock
    private BlockBlobClient blockBlobClient;

    private static final String FILENAME = "test.json.gz";
    private static final FileWrapper COMPRESSED_FILE = FileWrapperFixtures.getCompressedGzipFile();

    @BeforeEach
    void setup() {
        prepareBlobContainerClient();
    }

    @Test
    void testGetExistingFileFromCloudStorage() throws NdwCloudStorageException {
        given(blockBlobClient.exists()).willReturn(Boolean.TRUE);

        blobStorageRepository.getFileFromCloudStorage(FILENAME);

        then(blockBlobClient).should().download(any(ByteArrayOutputStream.class));
    }

    @Test
    void testGetNotExistingFileFromCloudStorage() throws NdwCloudStorageException {
        given(blockBlobClient.exists()).willReturn(Boolean.FALSE);

        Optional<FileWrapper> optionalFileWrapper = blobStorageRepository.getFileFromCloudStorage(FILENAME);

        then(blockBlobClient).shouldHaveNoMoreInteractions();

        assertThat(optionalFileWrapper).isEmpty();
    }

    @Test
    void testGetNullExistingFileFromCloudStorage() throws NdwCloudStorageException {
        given(blockBlobClient.exists()).willReturn(null);

        Optional<FileWrapper> optionalFileWrapper = blobStorageRepository.getFileFromCloudStorage(FILENAME);

        then(blockBlobClient).shouldHaveNoMoreInteractions();

        assertThat(optionalFileWrapper).isEmpty();
    }

    @Test
    void testGetExistingFileFromCloudStorageShouldThrowNdwCloudStorageExceptionWhenBlobStorageException() {
        given(blockBlobClient.exists()).willReturn(Boolean.TRUE);

        Throwable cause = BlobStorageExceptionFixtures.getBlobStorageException();
        prepareBlockBlobClientToThrowExceptionOnDownload(cause);

        Optional<FileWrapper> actualFileWrapper = blobStorageRepository.getFileFromCloudStorage(FILENAME);

        assertThat(actualFileWrapper).isEmpty();
    }

    @Test
    void testSaveFileToCloudStorage() throws NdwCloudStorageException {
        blobStorageRepository.saveFileToCloudStorage(COMPRESSED_FILE);

        then(blockBlobClient).should().upload(any(InputStream.class), anyLong(), eq(true));
    }

    @Test
    void testOverwriteFileToCloudStorage() throws NdwCloudStorageException {
        blobStorageRepository.saveFileToCloudStorage(COMPRESSED_FILE);

        then(blockBlobClient).should().upload(any(InputStream.class), anyLong(), eq(true));
    }

    @Test
    void testSaveFileToCloudStorageShouldThrowNdwCloudStorageExceptionOnBlobStorageException() {
        Throwable cause = BlobStorageExceptionFixtures.getBlobStorageException();
        prepareBlockBlobClientToThrowExceptionOnUpload(cause);

        Throwable throwable = catchThrowable(() -> blobStorageRepository.saveFileToCloudStorage(COMPRESSED_FILE));

        assertThat(throwable)
                .isInstanceOf(NdwCloudStorageException.class)
                .hasMessage("Exception while saving parking status \"" + COMPRESSED_FILE.getFileName() +
                            "\" to Azure Blob Storage")
                .hasCause(cause);
    }

    @Test
    void testSaveFileToCloudStorageShouldThrowNdwCloudStorageExceptionOnUncheckedIOException() {
        Throwable cause = UncheckedIOExceptionFixtures.getUncheckedIOException();
        prepareBlockBlobClientToThrowExceptionOnUpload(cause);

        Throwable throwable = catchThrowable(() -> blobStorageRepository.saveFileToCloudStorage(COMPRESSED_FILE));

        assertThat(throwable)
                .isInstanceOf(NdwCloudStorageException.class)
                .hasMessage("Exception while saving parking status \"" + COMPRESSED_FILE.getFileName() +
                            "\" to Azure Blob Storage")
                .hasCause(cause);
    }

    @Test
    void testGetStreamFromCloudStorageShouldReturnInputStreamWhenBlobExists() {
        doReturn(true).when(blockBlobClient).exists();
        doReturn(mock(BlobInputStream.class)).when(blockBlobClient).openInputStream();

        Optional<InputStream> actualOptionalInputStream = blobStorageRepository.getStreamFromCloudStorage(FILENAME);

        assertThat(actualOptionalInputStream)
                .isPresent()
                .get()
                .isInstanceOf(BufferedInputStream.class);
    }

    @Test
    void testGetStreamFromCloudStorageShouldReturnEmptyWhenBlobDoesNotExists() {
        doReturn(false).when(blockBlobClient).exists();

        Optional<InputStream> actualOptionalInputStream = blobStorageRepository.getStreamFromCloudStorage(FILENAME);

        assertThat(actualOptionalInputStream)
                .isEmpty();
    }

    @Test
    void testSaveStreamToCloudStorageShouldReturnOutputStreamWithOverwriteEnabled() {
        doReturn(mock(BlobOutputStream.class)).when(blockBlobClient)
                .getBlobOutputStream(eq(true));

        OutputStream actualOutputStream = blobStorageRepository.saveStreamToCloudStorage(FILENAME);

        assertThat(actualOutputStream)
                .isInstanceOf(BufferedOutputStream.class);
    }

    private void prepareBlobContainerClient() {
        BlobClient blobClient = mock(BlobClient.class);

        given(blobContainerClient.getBlobClient(FILENAME)).willReturn(blobClient);
        given(blobClient.getBlockBlobClient()).willReturn(blockBlobClient);
    }

    private void prepareBlockBlobClientToThrowExceptionOnDownload(Throwable throwable) {
        willThrow(throwable).given(blockBlobClient).download(any(ByteArrayOutputStream.class));
    }

    private void prepareBlockBlobClientToThrowExceptionOnUpload(Throwable throwable) {
        willThrow(throwable).given(blockBlobClient).upload(any(ByteArrayInputStream.class),
                anyLong(), eq(true));
    }
}

