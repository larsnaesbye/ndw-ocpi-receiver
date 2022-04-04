package nu.ndw.ncis.ci.o.cecs.it;

import nu.ndw.ncis.ci.o.cecs.it.rabbitmq.ITStatusPublicationReceiver;
import nu.ndw.ncis.ci.o.cecs.it.rabbitmq.ITTablePublicationReceiver;
import nu.ndw.ncis.ci.o.cecs.util.MockWebServerUtil;
import nu.ndw.ncis.it.base.CloudStorageRabbitMQIntegrationTest;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

class OCecsITTest extends CloudStorageRabbitMQIntegrationTest {

    private static final int PORT = new Random().nextInt(10000) + 10000;
    private MockWebServer mockWebServer;

    @Autowired
    private PullSchedulerTrigger pullSchedulerTrigger;

    @Autowired
    private ITTablePublicationReceiver tablePublicationReceiver;

    @Autowired
    private ITStatusPublicationReceiver statusPublicationReceiver;

    @DynamicPropertySource
    static void setDynamicProperties(DynamicPropertyRegistry registry) {
        registry.add("api.base-url", () -> String.format("http://localhost:%d", PORT));
    }

    @BeforeEach
    void setUp() throws IOException {
        mockWebServer = new MockWebServer();
        mockWebServer.start(PORT);
    }

    @AfterEach
    void tearDown() throws IOException {
        mockWebServer.shutdown();
        tablePublicationReceiver.reset();
        statusPublicationReceiver.reset();
    }

    @Test
    void testTablePublicationIsSavedToBlobStorage() throws Exception {
        mockSuccessfulApiResponses();

        pullSchedulerTrigger.triggerPullScheduler();

        await().atMost(2, TimeUnit.SECONDS).until(() -> tablePublicationReceiver.getNumberOfReceivedMessages() > 0);
        String tableBlobName = tablePublicationReceiver.getReceivedFileNames().get(0);

        assertThat(blobStorageRepository.listBlobs()).contains(tableBlobName);
    }

    @Test
    void testStatusPublicationIsSavedToBlobStorage() throws Exception {
        mockSuccessfulApiResponses();

        pullSchedulerTrigger.triggerPullScheduler();

        await().atMost(2, TimeUnit.SECONDS).until(() -> statusPublicationReceiver.getNumberOfReceivedMessages() > 0);
        String statusBlobName = statusPublicationReceiver.getReceivedFileNames().get(0);

        assertThat(blobStorageRepository.listBlobs()).contains(statusBlobName);
    }

    private void mockSuccessfulApiResponses() throws Exception {
        MockWebServerUtil.mockTotalPages(mockWebServer);
        MockWebServerUtil.mockPagedResponses(mockWebServer, 2);
        MockWebServerUtil.mockTariffs(mockWebServer);
    }
}
