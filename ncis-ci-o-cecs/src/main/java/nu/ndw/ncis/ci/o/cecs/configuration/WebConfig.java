package nu.ndw.ncis.ci.o.cecs.configuration;

import nu.ndw.ncis.ci.o.cecs.configuration.properties.ApiProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
@EnableConfigurationProperties({ApiProperties.class})
public class WebConfig {

    private static final int MAX_IN_MEMORY_SIZE = 10_000_000;

    @Bean
    public WebClient getWebClientBuilder(
            ExchangeStrategies exchangeStrategies, ApiProperties apiProperties) {
        return WebClient.builder()
                .baseUrl(apiProperties.getBaseUrl())
                .exchangeStrategies(exchangeStrategies)
                .build();
    }

    @Bean
    public ExchangeStrategies exchangeStrategies() {
        return ExchangeStrategies.builder()
                .codecs(configurer -> configurer
                        .defaultCodecs()
                        .maxInMemorySize(MAX_IN_MEMORY_SIZE)
                )
                .build();
    }
}
