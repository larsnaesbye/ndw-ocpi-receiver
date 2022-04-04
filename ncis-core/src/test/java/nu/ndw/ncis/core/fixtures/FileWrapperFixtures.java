package nu.ndw.ncis.core.fixtures;

import lombok.extern.slf4j.Slf4j;
import nu.ndw.ncis.core.cloud.FileWrapper;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Slf4j
public class FileWrapperFixtures {
    private FileWrapperFixtures() {
    }

    private static final String GZIP_FILENAME = "test.json.gz";
    private static final String LZ4_FILENAME = "test.json.lz4";
    private static final String JSON_FILENAME = "test.json";
    private static final byte[] TEST_AS_GZIP = new byte[]
            {31, -117, 8, 0, 0, 0, 0, 0, 0, -1, 43, 73, 45, 46, 1, 0, 12, 126, 127, -40, 4, 0, 0,
                    0};
    private static final byte[] TEST_AS_LZ4 = new byte[]
            {4, 34, 77, 24, 96, 112, 115, 4, 0, 0, -128, 116, 101, 115, 116, 0, 0, 0, 0};

    private static FileWrapper.FileWrapperBuilder getDefaultFileWrapper() {
        return FileWrapper.builder()
                .fileName(GZIP_FILENAME)
                .content("test".getBytes(StandardCharsets.UTF_8));
    }

    public static FileWrapper getFileWrapper() {
        return getDefaultFileWrapper().build();
    }

    public static FileWrapper getCompressedGzipFile() {
        return getDefaultFileWrapper()
                .fileName(GZIP_FILENAME)
                .content(TEST_AS_GZIP)
                .build();
    }

    public static FileWrapper getCompressedLz4File() {
        return getDefaultFileWrapper()
                .fileName(LZ4_FILENAME)
                .content(TEST_AS_LZ4)
                .build();
    }

    public static FileWrapper getUncompressedFile() {
        return getDefaultFileWrapper()
                .fileName(JSON_FILENAME)
                .build();
    }

    public static FileWrapper getUncompressedFile(String fileName) {
        return getDefaultFileWrapper()
                .fileName(fileName)
                .build();
    }

    public static FileWrapper getGzipFileWithError() {
        return FileWrapper.builder()
                .fileName(GZIP_FILENAME)
                .content(new byte[]{})
                .build();
    }

    public static FileWrapper getLz4FileWithError() {
        return FileWrapper.builder()
                .fileName(LZ4_FILENAME)
                .content(new byte[]{})
                .build();
    }

    public static FileWrapper getFileWrapperFromCompressedJsonFile(String fileName) {
        byte[] content = null;
        String testFile = "availability.json.gz";

        try {
            Path path = Paths.get("src", "test", "resources", "json", testFile);
            content = Files.readAllBytes(path);
        } catch (IOException ignored) {
            log.error("Error when reading test file \"" + testFile + "\"");
        }

        return FileWrapper.builder()
                .fileName(fileName)
                .content(content)
                .build();
    }

    public static byte[] getTestAsGzip() {
        return TEST_AS_GZIP;
    }

    public static byte[] getTestAsLz4() {
        return TEST_AS_LZ4;
    }
}