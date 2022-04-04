
package eu.datex.locationreferencing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for NutsNamedArea complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="NutsNamedArea"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://datex2.eu/schema/3/locationReferencing}NamedArea"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="nutsCodeType" type="{http://datex2.eu/schema/3/locationReferencing}_NutsCodeTypeEnum"/&amp;gt;
 *         &amp;lt;element name="nutsCode" type="{http://datex2.eu/schema/3/locationReferencing}NutsCode"/&amp;gt;
 *         &amp;lt;element name="_nutsNamedAreaExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NutsNamedArea", propOrder = {
    "nutsCodeType",
    "nutsCode",
    "_NutsNamedAreaExtension"
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class NutsNamedArea
    extends NamedArea
{

    @XmlElement(required = true)
    protected _NutsCodeTypeEnum nutsCodeType;
    @XmlElement(required = true)
    protected String nutsCode;
    @XmlElement(name = "_nutsNamedAreaExtension")
    protected _ExtensionType _NutsNamedAreaExtension;

    /**
     * Gets the value of the nutsCodeType property.
     * 
     * @return
     *     possible object is
     *     {@link _NutsCodeTypeEnum }
     *     
     */
    public _NutsCodeTypeEnum getNutsCodeType() {
        return nutsCodeType;
    }

    /**
     * Sets the value of the nutsCodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _NutsCodeTypeEnum }
     *     
     */
    public void setNutsCodeType(_NutsCodeTypeEnum value) {
        this.nutsCodeType = value;
    }

    /**
     * Gets the value of the nutsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNutsCode() {
        return nutsCode;
    }

    /**
     * Sets the value of the nutsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNutsCode(String value) {
        this.nutsCode = value;
    }

    /**
     * Gets the value of the _NutsNamedAreaExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_NutsNamedAreaExtension() {
        return _NutsNamedAreaExtension;
    }

    /**
     * Sets the value of the _NutsNamedAreaExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_NutsNamedAreaExtension(_ExtensionType value) {
        this._NutsNamedAreaExtension = value;
    }

}
