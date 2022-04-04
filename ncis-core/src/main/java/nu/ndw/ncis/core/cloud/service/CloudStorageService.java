package nu.ndw.ncis.core.cloud.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nu.ndw.ncis.core.cloud.FileWrapper;
import nu.ndw.ncis.core.cloud.repository.BlobStorageRepository;
import nu.ndw.ncis.core.exception.NdwCloudStorageException;
import nu.ndw.ncis.core.exception.NdwProcessingException;
import nu.ndw.ncis.core.file.compression.FileCompressor;
import nu.ndw.ncis.core.file.compression.FileDecompressorProvider;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Optional;

@Slf4j
@AllArgsConstructor
public class CloudStorageService {
    private final BlobStorageRepository blobStorageRepository;
    private final FileDecompressorProvider fileDecompressorProvider;
    private final FileCompressor fileCompressor;

    public Optional<FileWrapper> getFileFromCloud(String fileName) {
        Optional<FileWrapper> fileFromCloudStorage = blobStorageRepository.getFileFromCloudStorage(fileName);
        return fileFromCloudStorage.map(this::decompressFile);
    }

    public Optional<InputStream> getStreamFromCloudStorage(String fileName) {
        var fileDecompressor = fileDecompressorProvider.getFileDecompressor(fileName);
        return blobStorageRepository.getStreamFromCloudStorage(fileName)
                .map(fileDecompressor::decompressStream);
    }

    private FileWrapper decompressFile(FileWrapper compressedFile) {
        try {
            var fileDecompressor = fileDecompressorProvider
                    .getFileDecompressor(compressedFile.getFileName());
            return fileDecompressor.decompressFile(compressedFile);
        } catch (NdwProcessingException e) {
            log.warn("An error occurred during decompression", e);
            return null;
        }
    }

    public void saveFileToCloud(FileWrapper fileWrapper) throws NdwCloudStorageException {
        try {
            FileWrapper compressedFilewrapper = fileWrapper.toBuilder()
                    .content(fileCompressor.compressFile(fileWrapper.getContent()))
                    .build();
            blobStorageRepository.saveFileToCloudStorage(compressedFilewrapper);
        } catch (NdwProcessingException e) {
            throw new NdwCloudStorageException(e);
        }
    }

    public OutputStream saveStreamToCloudStorage(String fileName) {
        OutputStream outputStream = blobStorageRepository.saveStreamToCloudStorage(fileName);
        return fileCompressor.compressStream(outputStream);
    }
}
