package nu.ndw.ncis.ci.o.cecs.analyzer;

import lombok.Builder;
import lombok.Value;

import java.util.Set;

@Value
@Builder
public class OcpiMetrics {
    int total;
    int errors;
    OcpiMetricType type;
    Set<String> fields;
    Set<String> ids;
}
