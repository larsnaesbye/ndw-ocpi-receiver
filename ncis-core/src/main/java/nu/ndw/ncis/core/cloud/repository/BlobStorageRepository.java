package nu.ndw.ncis.core.cloud.repository;

import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.models.BlobStorageException;
import com.azure.storage.blob.specialized.BlockBlobClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nu.ndw.ncis.core.cloud.FileWrapper;
import nu.ndw.ncis.core.exception.NdwCloudStorageException;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
public class BlobStorageRepository {

    private final BlobContainerClient blobContainerClient;

    public Optional<FileWrapper> getFileFromCloudStorage(String fileName) {
        BlockBlobClient blobClient = blobContainerClient
                .getBlobClient(fileName)
                .getBlockBlobClient();

        if (Boolean.TRUE.equals(blobClient.exists())) {
            try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
                blobClient.download(outputStream);
                return Optional.of(mapToFileWrapper(fileName, outputStream));
            } catch (IOException | BlobStorageException e) {
                log.warn("An error occured during file retrieval", e);
            }
        }

        return Optional.empty();
    }

    public Optional<InputStream> getStreamFromCloudStorage(String fileName) {
        BlockBlobClient blobClient = blobContainerClient
                .getBlobClient(fileName)
                .getBlockBlobClient();

        if (Boolean.TRUE.equals(blobClient.exists())) {
            return Optional.of(new BufferedInputStream(blobClient.openInputStream()));
        }

        return Optional.empty();
    }


    private FileWrapper mapToFileWrapper(String fileName, ByteArrayOutputStream outputStream) {
        return FileWrapper.builder()
                          .fileName(fileName)
                          .content(outputStream.toByteArray())
                          .build();
    }

    public void saveFileToCloudStorage(FileWrapper fileWrapper) throws NdwCloudStorageException {
        BlockBlobClient blobClient = blobContainerClient
                .getBlobClient(fileWrapper.getFileName())
                .getBlockBlobClient();

        byte[] content = fileWrapper.getContent();

        try (InputStream is = new ByteArrayInputStream(content)) {
            blobClient.upload(is, content.length, true);
        } catch (IOException | UncheckedIOException | BlobStorageException e) {
            throw new NdwCloudStorageException(
                    "Exception while saving parking status \"" + fileWrapper.getFileName() + "\" to Azure Blob Storage",
                    e);
        }
    }

    public OutputStream saveStreamToCloudStorage(String fileName) {
        BlockBlobClient blobClient = blobContainerClient
                .getBlobClient(fileName)
                .getBlockBlobClient();

        return new BufferedOutputStream(blobClient.getBlobOutputStream(true));
    }
}

