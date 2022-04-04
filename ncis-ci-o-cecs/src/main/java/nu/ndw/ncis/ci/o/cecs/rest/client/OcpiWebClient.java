package nu.ndw.ncis.ci.o.cecs.rest.client;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nu.ndw.ncis.ci.o.cecs.configuration.properties.ApiProperties;
import nu.ndw.ncis.core.exception.NdwHttpException;
import ocpi.model.OcpiLocation;
import ocpi.model.OcpiTariff;
import ocpi.model.PageOcpiLocation;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
@Slf4j
@AllArgsConstructor
public class OcpiWebClient {

    public static final String ERROR_MESSAGE = "Failed to send request to service";
    private final WebClient webClient;
    private final ApiProperties apiProperties;

    public List<OcpiLocation> getLocations() {
        int nrOfPages = getTotalPages();

        return IntStream.range(0, nrOfPages)
                .mapToObj(this::fetchLocations)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    private int getTotalPages() {
        PageOcpiLocation page = webClient.get()
                .uri(uriBuilder -> uriBuilder.path(apiProperties.getLocationsPath())
                        .queryParam("size", apiProperties.getPageSize())
                        .build())
                .retrieve()
                .onStatus(HttpStatus::isError, this::handleErrorResponse)
                .bodyToMono(PageOcpiLocation.class)
                .onErrorMap(
                        Predicate.not(NdwHttpException.class::isInstance),
                        throwable -> new NdwHttpException(ERROR_MESSAGE, throwable)
                )
                .block();

        return page != null ? page.getTotalPages() : 0;
    }

    private Mono<Throwable> handleErrorResponse(ClientResponse response) {
        var errorMessage = String.format("API returned a %d: %s status",
                                            response.statusCode().value(),
                                            response.statusCode().getReasonPhrase());
        return Mono.error(new NdwHttpException(errorMessage));
    }

    private List<OcpiLocation> fetchLocations(int pageNr) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder.path(apiProperties.getLocationsPath())
                        .queryParam("page", pageNr)
                        .queryParam("size", apiProperties.getPageSize())
                        .build())
                .retrieve()
                .onStatus(HttpStatus::isError, this::handleErrorResponse)
                .bodyToMono(PageOcpiLocation.class)
                .map(PageOcpiLocation::getContent)
                .onErrorMap(
                        Predicate.not(NdwHttpException.class::isInstance),
                        throwable -> new NdwHttpException(ERROR_MESSAGE, throwable)
                )
                .block();
    }

    public List<OcpiTariff> getTariffs() {
        return webClient.get()
                .uri(apiProperties.getTariffsPath())
                .retrieve()
                .onStatus(HttpStatus::isError, this::handleErrorResponse)
                .bodyToFlux(OcpiTariff.class)
                .collectList()
                .onErrorMap(
                        Predicate.not(NdwHttpException.class::isInstance),
                        throwable -> new NdwHttpException(ERROR_MESSAGE, throwable)
                )
                .block();
    }
}
