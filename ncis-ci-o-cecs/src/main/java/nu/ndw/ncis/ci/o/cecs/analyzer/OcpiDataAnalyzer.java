package nu.ndw.ncis.ci.o.cecs.analyzer;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.extern.slf4j.Slf4j;
import ocpi.model.OcpiLocation;
import ocpi.model.OcpiTariff;
import org.reflections.ReflectionUtils;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.reflections.ReflectionUtils.withAnnotation;
import static org.reflections.ReflectionUtils.withModifier;
import static org.reflections.ReflectionUtils.withPrefix;

@Component
@Slf4j
public class OcpiDataAnalyzer {

    public OcpiMetrics getLocationMetrics(Collection<OcpiLocation> locations) {
        var metrics = locations.stream()
                .map(location -> new OcpiObjectMetrics(
                                location.getId(),
                                "OcpiLocation",
                                mandatoryFieldsWithNullOrBlankValues(location)
                ))
                .filter(metric -> !metric.getMandatoryFieldsWithNullValues().isEmpty())
                .collect(Collectors.toList());

        var ids = getIds(metrics);
        var fields = getFields(metrics);

        return OcpiMetrics.builder()
                .type(OcpiMetricType.LOCATIONS)
                .total(locations.size())
                .errors(metrics.size())
                .fields(fields)
                .ids(ids)
                .build();
    }

    private Set<String> getIds(List<OcpiObjectMetrics> metrics) {
        return metrics.stream().map(OcpiObjectMetrics::getId).collect(Collectors.toSet());
    }

    private Set<String> getFields(List<OcpiObjectMetrics> metrics) {
        return metrics.stream().map(OcpiObjectMetrics::getMandatoryFieldsWithNullValues)
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());
    }

    public OcpiMetrics getTariffMetrics(Collection<OcpiTariff> tariffs) {
        var metrics = tariffs.stream()
                .map(tariff -> new OcpiObjectMetrics(
                        tariff.getId(),
                        "OcpiTariff",
                        mandatoryFieldsWithNullOrBlankValues(tariff)
                ))
                .filter(metric -> !metric.getMandatoryFieldsWithNullValues().isEmpty())
                .collect(Collectors.toList());

        var ids = getIds(metrics);
        var fields = getFields(metrics);

        return OcpiMetrics.builder()
                .type(OcpiMetricType.TARIFFS)
                .total(tariffs.size())
                .errors(metrics.size())
                .fields(fields)
                .ids(ids)
                .build();
    }

    public List<String> mandatoryFieldsWithNullOrBlankValues(final Object object) {
        var mandatoryFieldsWithNullValues = new ArrayList<String>();

        var getters = ReflectionUtils.getAllMethods(object.getClass(),
                withModifier(Modifier.PUBLIC), withPrefix("get"), withAnnotation(Schema.class));

        getters.forEach(getter -> {
            try {
                var schemaAnnotation = getter.getAnnotation(Schema.class);
                var hasRequiredAnnotation =
                        schemaAnnotation.toString().contains("required=true");
                var getterValue = getter.invoke(object);

                if ((getterValue == null || isEmptyString(getterValue)) && hasRequiredAnnotation) {
                    mandatoryFieldsWithNullValues.add(getter.getName());
                } else if (
                        getterValue != null &&
                                getterValue.toString().startsWith("class")) {
                    mandatoryFieldsWithNullOrBlankValues(getterValue);
                }
            } catch (IllegalAccessException | InvocationTargetException e) {
                log.error("Problem analyzing OCPI data, skipping current object", e);
            }
        });

        return mandatoryFieldsWithNullValues;
    }

    private boolean isEmptyString(Object value) {
        return value instanceof String && ((String) value).isBlank();
    }
}
