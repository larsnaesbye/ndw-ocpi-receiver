
package eu.datex.facilities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common.VersionedReference;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for _OperatingHoursSpecificationVersionedReference complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="_OperatingHoursSpecificationVersionedReference"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/common}VersionedReference"&amp;gt;
 *       &amp;lt;attribute name="targetClass" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="fac:OperatingHoursSpecification" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_OperatingHoursSpecificationVersionedReference")
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class _OperatingHoursSpecificationVersionedReference
    extends VersionedReference
{

    @XmlAttribute(name = "targetClass", required = true)
    protected String targetClass;

    /**
     * Gets the value of the targetClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetClass() {
        if (targetClass == null) {
            return "fac:OperatingHoursSpecification";
        } else {
            return targetClass;
        }
    }

    /**
     * Sets the value of the targetClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetClass(String value) {
        this.targetClass = value;
    }

}
