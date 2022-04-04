
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
 * &lt;p&gt;Java class for TpegNamedOnlyArea complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="TpegNamedOnlyArea"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/locationReferencing}TpegAreaLocation"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="name" type="{http://datex2.eu/schema/3/locationReferencing}TpegAreaDescriptor" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element name="_tpegNamedOnlyAreaExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegNamedOnlyArea", propOrder = {
    "names",
    "_TpegNamedOnlyAreaExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class TpegNamedOnlyArea
    extends TpegAreaLocation
{

    @XmlElement(name = "name", required = true)
    protected List<TpegAreaDescriptor> names;
    @XmlElement(name = "_tpegNamedOnlyAreaExtension")
    protected _ExtensionType _TpegNamedOnlyAreaExtension;

    /**
     * Gets the value of the names property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the names property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getNames().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link TpegAreaDescriptor }
     * 
     * 
     */
    public List<TpegAreaDescriptor> getNames() {
        if (names == null) {
            names = new ArrayList<TpegAreaDescriptor>();
        }
        return this.names;
    }

    /**
     * Gets the value of the _TpegNamedOnlyAreaExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_TpegNamedOnlyAreaExtension() {
        return _TpegNamedOnlyAreaExtension;
    }

    /**
     * Sets the value of the _TpegNamedOnlyAreaExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_TpegNamedOnlyAreaExtension(_ExtensionType value) {
        this._TpegNamedOnlyAreaExtension = value;
    }

}
