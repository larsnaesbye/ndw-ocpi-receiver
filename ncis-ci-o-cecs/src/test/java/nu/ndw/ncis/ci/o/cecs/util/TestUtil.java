package nu.ndw.ncis.ci.o.cecs.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestUtil {
    public static String getJsonString(String resourceName) throws Exception {
        Path resourcePath = getSystemResource(resourceName);

        return Files.readString(resourcePath);
    }

    public static Path getSystemResource(String resourceName) throws URISyntaxException {
        return Paths.get(ClassLoader.getSystemResource(resourceName).toURI());
    }

    public static ObjectMapper getObjectMapper() {
        var time = new JavaTimeModule();
        var mapper = new ObjectMapper();
        return mapper.registerModule(time);
    }
}