
package eu.datex.commonextension;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for PeriodExtended complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PeriodExtended"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="fuzzyPeriod" type="{http://datex2.eu/schema/3/commonExtension}FuzzyPeriod" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodExtended", propOrder = {
    "fuzzyPeriods"
})
@ToString
@EqualsAndHashCode
public class PeriodExtended {

    @XmlElement(name = "fuzzyPeriod")
    protected List<FuzzyPeriod> fuzzyPeriods;

    /**
     * Gets the value of the fuzzyPeriods property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the fuzzyPeriods property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getFuzzyPeriods().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link FuzzyPeriod }
     * 
     * 
     */
    public List<FuzzyPeriod> getFuzzyPeriods() {
        if (fuzzyPeriods == null) {
            fuzzyPeriods = new ArrayList<FuzzyPeriod>();
        }
        return this.fuzzyPeriods;
    }

}
