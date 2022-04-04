package nu.ndw.ncis.ci.o.cecs.analyzer;

import nu.ndw.ncis.core.parsing.JsonObjectParser;
import ocpi.model.OcpiLocation;
import ocpi.model.OcpiTariff;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class OcpiDataAnalyzerTest {

    private final JsonObjectParser<OcpiLocation> ocpiLocationObjectParser = new JsonObjectParser<>(OcpiLocation.class);
    private final JsonObjectParser<OcpiTariff> ocpiTariffObjectParser = new JsonObjectParser<>(OcpiTariff.class);
    private final ClassLoader classLoader = getClass().getClassLoader();
    private final OcpiDataAnalyzer ocpiDataAnalyzer = new OcpiDataAnalyzer();

    private final String testLocationString = getFileContent("json/data-analyzer-test/test-location.json");
    private final String testTariff1String = getFileContent("json/data-analyzer-test/test-tariff1.json");
    private OcpiLocation testLocation;
    private OcpiTariff testTariff1;

    @BeforeEach
    void setup() {
        testLocation = ocpiLocationObjectParser.parseStringToObject(testLocationString);
        testTariff1 = ocpiTariffObjectParser.parseStringToObject(testTariff1String);
    }

    @Test
    void testGetLocationMetricsSetsTotal() {
        var metrics = ocpiDataAnalyzer.getLocationMetrics(List.of(testLocation));

        assertThat(metrics.getTotal()).isEqualTo(1);
    }

    @Test
    void testGetLocationMetricsSetsZeroErrorsWhenNoErrors() {
        var metrics = ocpiDataAnalyzer.getLocationMetrics(List.of(testLocation));

        assertThat(metrics.getErrors()).isZero();
    }

    @Test
    void testGetLocationMetricsSetsTypeLocations() {
        var metrics = ocpiDataAnalyzer.getLocationMetrics(List.of(testLocation));

        assertThat(metrics.getType()).isEqualTo(OcpiMetricType.LOCATIONS);
    }

    @Test
    void testGetLocationMetricsSetsErrorsWhenMandatoryFieldHasNullValue() {
        testLocation.setType(null);

        var metrics = ocpiDataAnalyzer.getLocationMetrics(List.of(testLocation));

        assertThat(metrics.getErrors()).isEqualTo(1);
    }

    @Test
    void testGetLocationMetricsSetsFieldWhenMandatoryFieldHasNullValue() {
        testLocation.setType(null);

        var metrics = ocpiDataAnalyzer.getLocationMetrics(List.of(testLocation));

        assertThat(metrics.getFields()).containsExactly("getType");
    }

    @Test
    void testGetLocationMetricsSetsUniqueFieldsOnly() {
        testLocation.setType(null);

        var metrics = ocpiDataAnalyzer.getLocationMetrics(List.of(testLocation));

        assertThat(metrics.getFields()).containsExactly("getType");
    }

    @Test
    void testGetLocationMetricsSetsFieldsWhenMandatoryFieldsHaveNullValues() {
        testLocation.setType(null);
        testLocation.setAddress(null);

        var metrics = ocpiDataAnalyzer.getLocationMetrics(List.of(testLocation));

        assertThat(metrics.getFields()).containsExactly("getType", "getAddress");
    }

    @Test
    void testGetLocationMetricsSetsIdWhenMandatoryFieldHasNullValue() {
        testLocation.setType(null);

        var metrics = ocpiDataAnalyzer.getLocationMetrics(List.of(testLocation));

        assertThat(metrics.getIds()).containsExactly(testLocation.getId());
    }

    @Test
    void testGetLocationMetricsSetsNoFieldsWhenValidMandatoryFields() {
        var metrics = ocpiDataAnalyzer.getLocationMetrics(List.of(testLocation));

        assertThat(metrics.getFields()).isEmpty();
    }

    @Test
    void testGetLocationMetricsSetsErrorsWhenMandatoryFieldsHasBlankValue() {
        testLocation.setCountry("");

        var metrics = ocpiDataAnalyzer.getLocationMetrics(List.of(testLocation));

        assertThat(metrics.getErrors()).isEqualTo(1);
    }

    @Test
    void testGetLocationMetricsSetsFieldsWhenMandatoryFieldsHasBlankValue() {
        testLocation.setCountry("");

        var metrics = ocpiDataAnalyzer.getLocationMetrics(List.of(testLocation));

        assertThat(metrics.getFields()).containsOnly("getCountry");
    }

    @Test
    void testGetLocationMetricsSetsId() {
        testLocation.setCountry("");

        var metrics = ocpiDataAnalyzer.getLocationMetrics(List.of(testLocation));

        assertThat(metrics.getIds()).containsExactly("d6fc5080-74e9-40c5-9719-59fad1a87900");
    }

    @Test
    void testGetLocationsMetricsSetsUniqueIdsOnly() {
        testLocation.setCountry(null);

        var metrics = ocpiDataAnalyzer.getLocationMetrics(List.of(testLocation, testLocation));

        assertThat(metrics.getIds()).containsExactly("d6fc5080-74e9-40c5-9719-59fad1a87900");
    }

    @Test
    void testGetTariffMetricsSetsTotal() {
        testTariff1.setCurrency(null);

        var metrics = ocpiDataAnalyzer.getTariffMetrics(List.of(testTariff1));

        assertThat(metrics.getTotal()).isEqualTo(1);
    }

    @Test
    void testGetTariffMetricsSetsNoErrorsIfNoErrors() {
        var metrics = ocpiDataAnalyzer.getTariffMetrics(List.of(testTariff1));

        assertThat(metrics.getErrors()).isZero();
    }

    @Test
    void testGetTariffMetricsSetsErrorsWhenMandatoryFieldsHasNullValue() {
        testTariff1.setCurrency(null);

        var metrics = ocpiDataAnalyzer.getTariffMetrics(List.of(testTariff1));

        assertThat(metrics.getErrors()).isEqualTo(1);
    }

    @Test
    void testGetTariffMetricsSetsNoFieldsWhenValidMandatoryFields() {
        var metrics = ocpiDataAnalyzer.getTariffMetrics(List.of(testTariff1));

        assertThat(metrics.getFields()).isEmpty();
    }

    @Test
    void testGetTariffMetricsSetsField() {
        testTariff1.setCurrency(null);

        var metrics = ocpiDataAnalyzer.getTariffMetrics(List.of(testTariff1));

        assertThat(metrics.getFields()).containsExactly("getCurrency");
    }

    @Test
    void testGetTariffMetricsSetsOnlyUniqueFields() {
        testTariff1.setCurrency(null);

        var metrics = ocpiDataAnalyzer.getTariffMetrics(List.of(testTariff1, testTariff1));

        assertThat(metrics.getFields()).containsExactly("getCurrency");
    }

    @Test
    void testGetTariffMetricsSetsTypeTariffs() {
        testTariff1.setCurrency(null);

        var metrics = ocpiDataAnalyzer.getTariffMetrics(List.of(testTariff1));

        assertThat(metrics.getType()).isEqualTo(OcpiMetricType.TARIFFS);
    }

    @Test
    void testGetTariffMetricsSetsId() {
        testTariff1.setCurrency(null);

        var metrics = ocpiDataAnalyzer.getTariffMetrics(List.of(testTariff1));

        assertThat(metrics.getIds()).containsExactly("3");
    }

    @Test
    void testGetTariffMetricsSetsOnlyUniqueIds() {
        testTariff1.setCurrency(null);

        var metrics = ocpiDataAnalyzer.getTariffMetrics(List.of(testTariff1, testTariff1));

        assertThat(metrics.getIds()).containsExactly("3");
    }

    private String getFileContent(String filePath) {
        return new BufferedReader(
                new InputStreamReader(Objects.requireNonNull(classLoader.getResourceAsStream(filePath)), StandardCharsets.UTF_8))
                .lines()
                .collect(Collectors.joining("\n"));
    }
}
