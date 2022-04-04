package nu.ndw.ncis.ci.o.cecs.util;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

public class MockWebServerUtil {

    private MockWebServerUtil() {
    }

    public static void mockTotalPages(MockWebServer mockWebServer) throws Exception {
        var response = getOkResponse("json/locations/small-page-locations-total-pages.json");
        mockWebServer.enqueue(response);
    }

    public static MockResponse getOkResponse(String resourceName) throws Exception {
        return new MockResponse()
                .setResponseCode(200)
                .setHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .setBody(TestUtil.getJsonString(resourceName));
    }

    public static void mockPagedResponses(MockWebServer mockWebServer, int nrOfPages) throws Exception {
        for (int i = 0; i < nrOfPages; i++) {
            mockLocations(mockWebServer, i);
        }
    }

    public static void mockLocations(MockWebServer mockWebServer, int page) throws Exception {
        var resourceName = String.format("json/locations/small-page-locations-%d.json", page);
        var response = getOkResponse(resourceName);
        mockWebServer.enqueue(response);
    }

    public static void mockTariffs(MockWebServer mockWebServer) throws Exception {
        var response = getOkResponse("json/tariffs.json");
        mockWebServer.enqueue(response);
    }

    public static void mockInternalServerErrorResponse(MockWebServer mockWebServer) {
        var response = getInternalServerErrorResponse();
        mockWebServer.enqueue(response);
    }

    public static MockResponse getInternalServerErrorResponse() {
        return new MockResponse().setResponseCode(500);
    }
}
