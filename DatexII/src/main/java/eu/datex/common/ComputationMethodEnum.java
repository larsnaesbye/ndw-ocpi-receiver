
package eu.datex.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ComputationMethodEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ComputationMethodEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="arithmeticAverageOfSamplesBasedOnAFixedNumberOfSamples"/&amp;gt;
 *     &amp;lt;enumeration value="arithmeticAverageOfSamplesInATimePeriod"/&amp;gt;
 *     &amp;lt;enumeration value="harmonicAverageOfSamplesInATimePeriod"/&amp;gt;
 *     &amp;lt;enumeration value="medianOfSamplesInATimePeriod"/&amp;gt;
 *     &amp;lt;enumeration value="movingAverageOfSamples"/&amp;gt;
 *     &amp;lt;enumeration value="_extended"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "ComputationMethodEnum")
@XmlEnum
public enum ComputationMethodEnum {

    @XmlEnumValue("arithmeticAverageOfSamplesBasedOnAFixedNumberOfSamples")
    ARITHMETIC_AVERAGE_OF_SAMPLES_BASED_ON_A_FIXED_NUMBER_OF_SAMPLES("arithmeticAverageOfSamplesBasedOnAFixedNumberOfSamples"),
    @XmlEnumValue("arithmeticAverageOfSamplesInATimePeriod")
    ARITHMETIC_AVERAGE_OF_SAMPLES_IN_A_TIME_PERIOD("arithmeticAverageOfSamplesInATimePeriod"),
    @XmlEnumValue("harmonicAverageOfSamplesInATimePeriod")
    HARMONIC_AVERAGE_OF_SAMPLES_IN_A_TIME_PERIOD("harmonicAverageOfSamplesInATimePeriod"),
    @XmlEnumValue("medianOfSamplesInATimePeriod")
    MEDIAN_OF_SAMPLES_IN_A_TIME_PERIOD("medianOfSamplesInATimePeriod"),
    @XmlEnumValue("movingAverageOfSamples")
    MOVING_AVERAGE_OF_SAMPLES("movingAverageOfSamples"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    ComputationMethodEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComputationMethodEnum fromValue(String v) {
        for (ComputationMethodEnum c: ComputationMethodEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
