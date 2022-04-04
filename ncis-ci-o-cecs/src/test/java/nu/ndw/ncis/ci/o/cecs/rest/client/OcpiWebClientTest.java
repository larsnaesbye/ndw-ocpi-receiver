package nu.ndw.ncis.ci.o.cecs.rest.client;

import nu.ndw.ncis.ci.o.cecs.configuration.properties.ApiProperties;
import nu.ndw.ncis.ci.o.cecs.fixture.ApiPropertiesFixtures;
import nu.ndw.ncis.ci.o.cecs.util.MockWebServerUtil;
import nu.ndw.ncis.core.exception.NdwHttpException;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.web.reactive.function.client.WebClient;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class OcpiWebClientTest {
    private MockWebServer mockWebServer;
    private OcpiWebClient ocpiWebClient;
    private ApiProperties apiProperties;

    @BeforeEach
    void setUp() throws IOException {
        mockWebServer = new MockWebServer();
        mockWebServer.start();

        var baseUrl = String.format("http://localhost:%s", mockWebServer.getPort());
        apiProperties = ApiPropertiesFixtures.getApiProperties(baseUrl);
        ocpiWebClient = new OcpiWebClient(WebClient.builder().baseUrl(baseUrl).build(), apiProperties);
    }

    @AfterEach
    void tearDown() throws IOException {
        mockWebServer.shutdown();
    }

    @Test
    void testGetLocationsWhenTwoPagesAvailable() throws Exception {
        MockWebServerUtil.mockTotalPages(mockWebServer);
        MockWebServerUtil.mockPagedResponses(mockWebServer, 2);

        var locations = ocpiWebClient.getLocations();

        assertThat(locations).hasSize(4);
    }

    @Test
    void testGetLocationsShouldCallConfiguredUrl() throws Exception {
        var nrOfPages = 2;
        MockWebServerUtil.mockTotalPages(mockWebServer);
        MockWebServerUtil.mockPagedResponses(mockWebServer, nrOfPages);

        ocpiWebClient.getLocations();

        // Flush unnecessary request from MockWebServer
        mockWebServer.takeRequest();

        for (int i = 0; i < nrOfPages; i++) {
            var pathWithQueryString = mockWebServer.takeRequest().getPath();
            var path = removeQueryString(pathWithQueryString);
            assertThat(path).isEqualTo(apiProperties.getLocationsPath());
        }
    }

    @Test
    void testGetTotalPagesShouldCallConfiguredUrl() throws Exception {
        MockWebServerUtil.mockTotalPages(mockWebServer);
        MockWebServerUtil.mockPagedResponses(mockWebServer, 2);

        ocpiWebClient.getLocations();

        var pathWithQueryString = mockWebServer.takeRequest().getPath();
        var path = removeQueryString(pathWithQueryString);
        assertThat(path).isEqualTo(apiProperties.getLocationsPath());
    }

    @Test
    void testGetTotalPagesShouldThrowExceptionOnError() {
        MockWebServerUtil.mockInternalServerErrorResponse(mockWebServer);

        var throwable = catchThrowable(() -> ocpiWebClient.getLocations());

        assertThat(throwable)
                .isExactlyInstanceOf(NdwHttpException.class)
                .hasMessage("API returned a 500: Internal Server Error status");
    }

    @Test
    void testGetLocationsShouldThrowExceptionOnError() throws Exception {
        MockWebServerUtil.mockTotalPages(mockWebServer);
        MockWebServerUtil.mockInternalServerErrorResponse(mockWebServer);

        var throwable = catchThrowable(() -> ocpiWebClient.getLocations());

        assertThat(throwable)
                .isExactlyInstanceOf(NdwHttpException.class)
                .hasMessage("API returned a 500: Internal Server Error status");
    }

    @Test
    void testGetTariffsShouldThrowExceptionOnError() {
        MockWebServerUtil.mockInternalServerErrorResponse(mockWebServer);

        var throwable = catchThrowable(() -> ocpiWebClient.getTariffs());

        assertThat(throwable)
                .isExactlyInstanceOf(NdwHttpException.class)
                .hasMessage("API returned a 500: Internal Server Error status");
    }

    @Test
    void testGetTariffs() throws Exception {
        MockWebServerUtil.mockTariffs(mockWebServer);

        var tariffs = ocpiWebClient.getTariffs();

        assertThat(tariffs).hasSize(5);
    }

    @Test
    void testGetTariffsShouldCallConfiguredUrl() throws Exception {
        MockWebServerUtil.mockTariffs(mockWebServer);

        ocpiWebClient.getTariffs();

        var path = mockWebServer.takeRequest().getPath();
        assertThat(path).isEqualTo(apiProperties.getTariffsPath());
    }

    private String removeQueryString(String path) {
        return path.split("\\?")[0];
    }
}
