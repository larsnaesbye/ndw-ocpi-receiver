package nu.ndw.ncis.ci.o.cecs.analyzer;

import lombok.Value;

import java.util.List;

@Value
public class OcpiObjectMetrics {
    String id;
    String type;
    List<String> mandatoryFieldsWithNullValues;
}
