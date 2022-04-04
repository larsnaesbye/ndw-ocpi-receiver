package nu.ndw.ncis.it.cloud;

import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.models.BlobItem;
import com.azure.storage.blob.models.BlobStorageException;
import com.azure.storage.blob.specialized.BlockBlobClient;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nu.ndw.ncis.core.cloud.FileWrapper;
import nu.ndw.ncis.core.exception.NdwCloudStorageException;
import nu.ndw.ncis.core.exception.NdwException;
import nu.ndw.ncis.core.exception.NdwProcessingException;
import nu.ndw.ncis.core.file.compression.FileCompressor;
import nu.ndw.ncis.core.file.compression.FileDecompressorProvider;
import nu.ndw.ncis.it.fixture.FileWrapperFixtures;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@AllArgsConstructor
public class ITBlobStorageRepository {
    private static final boolean DEFAULT_SHOULD_COMPRESS = false;


    private final BlobContainerClient blobContainerClient;
    private final FileCompressor fileCompressor;
    private final FileDecompressorProvider fileDecompressorProvider;

    public void createBlobContainer() {
        try {
            blobContainerClient.create();
        } catch (BlobStorageException e) {
            log.info("Blob container already exists");
        }
    }

    @Deprecated
    public void uploadFile(Path filePath, String blobName, boolean isZipped) throws NdwException {
        FileWrapper fileWrapper = FileWrapperFixtures.getFileWrapper(filePath, blobName);

        if (!isZipped) {
            fileWrapper = compressFile(blobName, fileWrapper);
        }

        uploadFile(fileWrapper);
    }

    private void uploadFile(FileWrapper fileWrapper) {
        BlockBlobClient blobClient = blobContainerClient
                .getBlobClient(fileWrapper.getFileName())
                .getBlockBlobClient();

        byte[] content = fileWrapper.getContent();

        try (InputStream is = new ByteArrayInputStream(content)) {
            blobClient.upload(is, content.length, true);
        } catch (IOException | UncheckedIOException | BlobStorageException e) {
            throw new NdwCloudStorageException(
                    "Exception while saving test file \"" + fileWrapper.getFileName() + "\" to Azure Blob Storage", e);
        }
    }

    @Deprecated
    public void uploadBytes(byte[] bytes, String blobName, boolean isZipped) {
        var fileWrapper = FileWrapperFixtures.getFileWrapper(bytes, blobName);

        if (!isZipped) {
            fileWrapper = compressFile(blobName, fileWrapper);
        }

        uploadFile(fileWrapper);
    }

    @Deprecated
    private FileWrapper compressFile(String fileName, FileWrapper fileWrapper) throws NdwProcessingException {
        byte[] compressed = fileCompressor.compressFile(fileWrapper.getContent());

        fileWrapper = FileWrapper.builder()
                .fileName(fileName)
                .content(compressed)
                .build();

        return fileWrapper;
    }

    public void deleteBlobContainer() {
        blobContainerClient.delete();
    }

    public List<String> listBlobs() {
        return blobContainerClient
                .listBlobs()
                .stream()
                .map(BlobItem::getName)
                .collect(Collectors.toUnmodifiableList());
    }

    @Deprecated
    public FileWrapper downloadBlob(String fileName) {
        var fileDecompressor =
                fileDecompressorProvider.getFileDecompressor(fileName);
        var baos = new ByteArrayOutputStream();
        blobContainerClient.getBlobClient(fileName).download(baos);

        FileWrapper file = FileWrapper.builder()
                .fileName(fileName)
                .content(baos.toByteArray())
                .build();

        return fileDecompressor.decompressFile(file);
    }

    public Optional<byte[]> getByteArrayFromCloudStorage(String blobName) {
        return getByteArrayFromCloudStorage(blobName, DEFAULT_SHOULD_COMPRESS);
    }

    public Optional<byte[]> getByteArrayFromCloudStorage(String blobName, boolean shouldUncompress) {
        var inputStreamOptional = getStreamFromCloudStorage(blobName, shouldUncompress);
        if (inputStreamOptional.isEmpty()) {
            return Optional.empty();
        }

        try (var inputStream = inputStreamOptional.get()) {
            return Optional.of(inputStream.readAllBytes());
        } catch (IOException exception) {
            throw new NdwCloudStorageException("Unable to read bytes from cloud storage.", exception);
        }
    }

    public Optional<InputStream> getStreamFromCloudStorage(String blobName) {
        return Optional
                .of(blobContainerClient.getBlobClient(blobName).getBlockBlobClient())
                .filter(BlockBlobClient::exists)
                .map(BlockBlobClient::openInputStream);
    }

    public Optional<InputStream> getStreamFromCloudStorage(String blobName, boolean shouldUncompress) {
        var fileDecompressor = fileDecompressorProvider.getFileDecompressor(blobName);
        Optional<InputStream> inputStreamOptional = getStreamFromCloudStorage(blobName);

        return shouldUncompress
                ? inputStreamOptional.map(fileDecompressor::decompressStream)
                : inputStreamOptional;
    }

    public void saveByteArrayToCloudStorage(byte[] bytes, String blobName) {
        saveByteArrayToCloudStorage(bytes, blobName, DEFAULT_SHOULD_COMPRESS);
    }

    public void saveByteArrayToCloudStorage(byte[] bytes, String blobName, boolean shouldCompress) {
        try (var outputStream = saveStreamToCloudStorage(blobName, shouldCompress)) {
            outputStream.write(bytes);
        } catch (IOException exception) {
            throw new NdwCloudStorageException("Unable to write bytes to cloud storage.", exception);
        }
    }

    public OutputStream saveStreamToCloudStorage(String blobName) {
        BlockBlobClient blockBlobClient = blobContainerClient.getBlobClient(blobName)
                .getBlockBlobClient();

        return blockBlobClient.getBlobOutputStream();
    }

    public OutputStream saveStreamToCloudStorage(String blobName, boolean shouldCompress) {
        OutputStream outputStream = saveStreamToCloudStorage(blobName);

        return shouldCompress
                ? fileCompressor.compressStream(outputStream)
                : outputStream;
    }

    public void saveResourceToCloudStorage(String resourceFileName, String blobName) {
        saveResourceToCloudStorage(resourceFileName, blobName, DEFAULT_SHOULD_COMPRESS);
    }

    public void saveResourceToCloudStorage(String resourceFileName, String blobName, boolean shouldCompress) {
        try (OutputStream outputStream = saveStreamToCloudStorage(blobName, shouldCompress);
             InputStream inputStream = getResourceAsStream(resourceFileName)) {
            inputStream.transferTo(outputStream);
        } catch (IOException exception) {
            throw new NdwCloudStorageException("", exception);
        }
    }

    private InputStream getResourceAsStream(String resourceFileName) {
        return Thread.currentThread()
                .getContextClassLoader()
                .getResourceAsStream(resourceFileName);
    }
}