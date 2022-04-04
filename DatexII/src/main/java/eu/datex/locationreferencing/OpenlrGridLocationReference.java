
package eu.datex.locationreferencing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.w3._2001.xmlschema.Adapter2;


/**
 * &lt;p&gt;Java class for OpenlrGridLocationReference complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="OpenlrGridLocationReference"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/locationReferencing}OpenlrAreaLocationReference"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="openlrNumColumns" type="{http://datex2.eu/schema/3/common}NonNegativeInteger"/&amp;gt;
 *         &amp;lt;element name="openlrNumRows" type="{http://datex2.eu/schema/3/common}NonNegativeInteger"/&amp;gt;
 *         &amp;lt;element name="openlrRectangle" type="{http://datex2.eu/schema/3/locationReferencing}OpenlrRectangle"/&amp;gt;
 *         &amp;lt;element name="_openlrGridLocationReferenceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrGridLocationReference", propOrder = {
    "openlrNumColumns",
    "openlrNumRows",
    "openlrRectangle",
    "_OpenlrGridLocationReferenceExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class OpenlrGridLocationReference
    extends OpenlrAreaLocationReference
{

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Long openlrNumColumns;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Long openlrNumRows;
    @XmlElement(required = true)
    protected OpenlrRectangle openlrRectangle;
    @XmlElement(name = "_openlrGridLocationReferenceExtension")
    protected _ExtensionType _OpenlrGridLocationReferenceExtension;

    /**
     * Gets the value of the openlrNumColumns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getOpenlrNumColumns() {
        return openlrNumColumns;
    }

    /**
     * Sets the value of the openlrNumColumns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenlrNumColumns(Long value) {
        this.openlrNumColumns = value;
    }

    /**
     * Gets the value of the openlrNumRows property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getOpenlrNumRows() {
        return openlrNumRows;
    }

    /**
     * Sets the value of the openlrNumRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenlrNumRows(Long value) {
        this.openlrNumRows = value;
    }

    /**
     * Gets the value of the openlrRectangle property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrRectangle }
     *     
     */
    public OpenlrRectangle getOpenlrRectangle() {
        return openlrRectangle;
    }

    /**
     * Sets the value of the openlrRectangle property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrRectangle }
     *     
     */
    public void setOpenlrRectangle(OpenlrRectangle value) {
        this.openlrRectangle = value;
    }

    /**
     * Gets the value of the _OpenlrGridLocationReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_OpenlrGridLocationReferenceExtension() {
        return _OpenlrGridLocationReferenceExtension;
    }

    /**
     * Sets the value of the _OpenlrGridLocationReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_OpenlrGridLocationReferenceExtension(_ExtensionType value) {
        this._OpenlrGridLocationReferenceExtension = value;
    }

}
