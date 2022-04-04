
package eu.datex.locationreferencing;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for OpenlrClosedLineLocationReference complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="OpenlrClosedLineLocationReference"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/locationReferencing}OpenlrAreaLocationReference"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="openlrLocationReferencePoint" type="{http://datex2.eu/schema/3/locationReferencing}OpenlrLocationReferencePoint" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element name="openlrLastLine" type="{http://datex2.eu/schema/3/locationReferencing}OpenlrLastLocationReferencePoint"/&amp;gt;
 *         &amp;lt;element name="_openlrClosedLineLocationReferenceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrClosedLineLocationReference", propOrder = {
    "openlrLocationReferencePoints",
    "openlrLastLine",
    "_OpenlrClosedLineLocationReferenceExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class OpenlrClosedLineLocationReference
    extends OpenlrAreaLocationReference
{

    @XmlElement(name = "openlrLocationReferencePoint", required = true)
    protected List<OpenlrLocationReferencePoint> openlrLocationReferencePoints;
    @XmlElement(required = true)
    protected OpenlrLastLocationReferencePoint openlrLastLine;
    @XmlElement(name = "_openlrClosedLineLocationReferenceExtension")
    protected _ExtensionType _OpenlrClosedLineLocationReferenceExtension;

    /**
     * Gets the value of the openlrLocationReferencePoints property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the openlrLocationReferencePoints property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getOpenlrLocationReferencePoints().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link OpenlrLocationReferencePoint }
     * 
     * 
     */
    public List<OpenlrLocationReferencePoint> getOpenlrLocationReferencePoints() {
        if (openlrLocationReferencePoints == null) {
            openlrLocationReferencePoints = new ArrayList<OpenlrLocationReferencePoint>();
        }
        return this.openlrLocationReferencePoints;
    }

    /**
     * Gets the value of the openlrLastLine property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrLastLocationReferencePoint }
     *     
     */
    public OpenlrLastLocationReferencePoint getOpenlrLastLine() {
        return openlrLastLine;
    }

    /**
     * Sets the value of the openlrLastLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrLastLocationReferencePoint }
     *     
     */
    public void setOpenlrLastLine(OpenlrLastLocationReferencePoint value) {
        this.openlrLastLine = value;
    }

    /**
     * Gets the value of the _OpenlrClosedLineLocationReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OpenlrClosedLineLocationReferenceExtension() {
        return _OpenlrClosedLineLocationReferenceExtension;
    }

    /**
     * Sets the value of the _OpenlrClosedLineLocationReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OpenlrClosedLineLocationReferenceExtension(_ExtensionType value) {
        this._OpenlrClosedLineLocationReferenceExtension = value;
    }

}
