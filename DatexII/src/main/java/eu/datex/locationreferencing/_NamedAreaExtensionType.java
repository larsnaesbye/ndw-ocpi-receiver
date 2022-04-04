
package eu.datex.locationreferencing;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.locationextension.NamedAreaExtended;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.w3c.dom.Element;


/**
 * &lt;p&gt;Java class for _NamedAreaExtensionType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="_NamedAreaExtensionType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="namedAreaExtended" type="{http://datex2.eu/schema/3/locationExtension}NamedAreaExtended" minOccurs="0"/&amp;gt;
 *         &amp;lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_NamedAreaExtensionType", propOrder = {
    "namedAreaExtended",
    "anies"
})
@ToString
@EqualsAndHashCode
public class _NamedAreaExtensionType {

    protected NamedAreaExtended namedAreaExtended;
    @XmlAnyElement
    protected List<Element> anies;

    /**
     * Gets the value of the namedAreaExtended property.
     * 
     * @return
     *     possible object is
     *     {@link NamedAreaExtended }
     *     
     */
    public NamedAreaExtended getNamedAreaExtended() {
        return namedAreaExtended;
    }

    /**
     * Sets the value of the namedAreaExtended property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedAreaExtended }
     *     
     */
    public void setNamedAreaExtended(NamedAreaExtended value) {
        this.namedAreaExtended = value;
    }

    /**
     * Gets the value of the anies property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the anies property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAnies().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAnies() {
        if (anies == null) {
            anies = new ArrayList<Element>();
        }
        return this.anies;
    }

}
