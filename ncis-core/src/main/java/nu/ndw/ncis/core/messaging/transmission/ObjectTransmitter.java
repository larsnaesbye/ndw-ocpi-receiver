package nu.ndw.ncis.core.messaging.transmission;

import lombok.extern.slf4j.Slf4j;
import nu.ndw.ncis.core.cloud.FileWrapper;
import nu.ndw.ncis.core.cloud.service.CloudStorageService;
import nu.ndw.ncis.core.exception.NdwException;
import nu.ndw.ncis.core.file.compression.FileCompressor;
import nu.ndw.ncis.core.messaging.publisher.RabbitMQPublisher;
import nu.ndw.ncis.core.parsing.StringToObjectParser;
import org.springframework.transaction.annotation.Transactional;

import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

@Slf4j
public class ObjectTransmitter<T> {
    private static final DateTimeFormatter FILE_NAME_FORMATTER
            = DateTimeFormatter.ofPattern("yyyy-MM-dd/HH-mm-ss")
            .withZone(ZoneId.from(ZoneOffset.UTC));

    private final CloudStorageService cloudStorageService;
    private final StringToObjectParser<T> stringToObjectParser;
    private final String fileNamePrefix;
    private final RabbitMQPublisher rabbitMQPublisher;
    private final FileCompressor fileCompressor;

    @Deprecated
    public ObjectTransmitter(
            CloudStorageService cloudStorageService,
            StringToObjectParser<T> stringToObjectParser,
            String fileNamePrefix,
            RabbitMQPublisher rabbitMQPublisher,
            FileCompressor fileCompressor) {
        this.cloudStorageService = cloudStorageService;
        this.stringToObjectParser = stringToObjectParser;
        this.fileNamePrefix = fileNamePrefix;
        this.rabbitMQPublisher = rabbitMQPublisher;
        this.fileCompressor = fileCompressor;
    }

    @Deprecated
    @Transactional
    public String transmitObject(T object) throws NdwException {
        var content = Objects.requireNonNull(stringToObjectParser).parseObjectToString(object);
        String fileName = generateFileName();
        var fileWrapper = FileWrapper.builder()
                .fileName(fileName)
                .content(content.getBytes(StandardCharsets.UTF_8))
                .build();
        Objects.requireNonNull(cloudStorageService).saveFileToCloud(fileWrapper);
        rabbitMQPublisher.send(fileName);
        return fileName;
    }

    private String generateFileName() {
        var fileNameWithoutExtension = fileNamePrefix + FILE_NAME_FORMATTER.format(Instant.now());
        return fileCompressor.getFileNameWithExtension(fileNameWithoutExtension);
    }
}
