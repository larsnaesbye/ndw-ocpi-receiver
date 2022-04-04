package nu.ndw.ncis.core.file.service;

import lombok.AllArgsConstructor;
import nu.ndw.ncis.core.cloud.FileWrapper;
import nu.ndw.ncis.core.cloud.InputStreamFileWrapper;
import nu.ndw.ncis.core.cloud.OutputStreamFileWrapper;
import nu.ndw.ncis.core.config.properties.FileProperties;
import nu.ndw.ncis.core.exception.NdwProcessingException;
import nu.ndw.ncis.core.file.compression.FileCompressor;
import nu.ndw.ncis.core.file.compression.FileDecompressorProvider;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

@Service
@AllArgsConstructor
public class FileService {

    private static final String JSON_EXTENSION = ".json";
    private static final DateTimeFormatter FILE_NAME_FORMATTER =
            DateTimeFormatter.ofPattern("yyyy-MM-dd/HH-mm-ss")
                    .withZone(ZoneId.from(ZoneOffset.UTC));
    private final FileDecompressorProvider fileDecompressorProvider;
    private final FileCompressor fileCompressor;
    private final FileProperties fileProperties;

    public FileWrapper decompressFile(FileWrapper compressedFile) throws NdwProcessingException {
        var fileDecompressor =
                fileDecompressorProvider.getFileDecompressor(compressedFile.getFileName());
        var fileNameWithoutExtension =
                fileDecompressor.getFileNameWithoutExtension(compressedFile.getFileName());
        return FileWrapper.builder()
                .fileName(fileNameWithoutExtension)
                .content(fileDecompressor.decompressContent(compressedFile.getContent()))
                .build();
    }

    public FileWrapper prepareFile(String input) throws NdwProcessingException {
        if (fileProperties.getDirectory() == null) {
            throw new NdwProcessingException(
                    "Unable to create file, directory is not configured or has not been loaded correctly");
        }

        byte[] content = fileCompressor.compressContent(input.getBytes(StandardCharsets.UTF_8));

        String fileName = getFileName();

        return FileWrapper.builder()
                          .fileName(fileName)
                          .content(content)
                          .build();
    }

    public InputStreamFileWrapper decompressStream(InputStreamFileWrapper fileWrapper) {
        var fileDecompressor =
                fileDecompressorProvider.getFileDecompressor(fileWrapper.getFileName());
        var fileNameWithoutExtension =
                fileDecompressor.getFileNameWithoutExtension(fileWrapper.getFileName());
        return InputStreamFileWrapper.builder()
                .fileName(fileNameWithoutExtension)
                .inputStream(fileDecompressor.decompressStream(fileWrapper.getInputStream()))
                .build();
    }

    public OutputStreamFileWrapper prepareStream(OutputStreamFileWrapper fileWrapper) {
        return fileWrapper.toBuilder()
                .outputStream(fileCompressor.compressStream(fileWrapper.getOutputStream()))
                .build();
    }

    public String generateFileName(String pathPrefix) {
        return pathPrefix + FILE_NAME_FORMATTER.format(Instant.now());
    }

    private String getFileName() {
        return fileProperties.getDirectory() + "/" + Instant.now() +
                JSON_EXTENSION + fileCompressor.getType().getExtension();
    }
}
