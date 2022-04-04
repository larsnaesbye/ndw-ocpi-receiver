package nu.ndw.ncis.ci.o.cecs.analyzer;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public enum OcpiMetricType {
    LOCATIONS("locations"),
    TARIFFS("tariffs");

    final String name;
}
