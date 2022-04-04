package nu.ndw.ncis.it.fixture;

import lombok.extern.slf4j.Slf4j;
import nu.ndw.ncis.core.cloud.FileWrapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Slf4j
public class FileWrapperFixtures {
    private FileWrapperFixtures() {
    }

    @Deprecated
    public static FileWrapper getFileWrapper(Path filePath, String fileName) {
        byte[] content = null;

        try {
            content = Files.readAllBytes(filePath);
        } catch (IOException ignored) {
            log.error("Error when reading test file \"" + filePath.toString() + "\"");
        }

        return FileWrapper.builder()
                .fileName(fileName)
                .content(content)
                .build();
    }

    @Deprecated
    public static FileWrapper getFileWrapper(byte[] bytes, String fileName) {
        return FileWrapper.builder()
                .fileName(fileName)
                .content(bytes)
                .build();
    }
}
