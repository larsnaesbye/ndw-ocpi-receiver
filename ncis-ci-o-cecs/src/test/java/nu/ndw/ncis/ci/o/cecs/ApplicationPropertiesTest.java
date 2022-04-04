package nu.ndw.ncis.ci.o.cecs;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApplicationPropertiesTest {
    @Test
    void testRabbitmqSimpleRetryEnabled() throws IOException {
        Properties p = new Properties();
        p.load(ClassLoader.getSystemResourceAsStream("application.properties"));
        assertEquals("true", p.getProperty("spring.rabbitmq.listener.simple.retry.enabled"));
    }
}
