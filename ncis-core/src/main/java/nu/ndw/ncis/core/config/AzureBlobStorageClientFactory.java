package nu.ndw.ncis.core.config;

import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import com.azure.storage.common.StorageSharedKeyCredential;

public class AzureBlobStorageClientFactory {
    public BlobServiceClient createBlobServiceClient(
            StorageSharedKeyCredential credential,
            String connectionString) {
        return new BlobServiceClientBuilder()
                .connectionString(connectionString)
                .credential(credential)
                .buildClient();
    }

    public BlobContainerClient createBlobContainerClient(
            BlobServiceClient blobServiceClient,
            String containerName) {
        return blobServiceClient.getBlobContainerClient(containerName);
    }
}
