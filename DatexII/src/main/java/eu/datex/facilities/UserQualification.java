
package eu.datex.facilities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.datex.common._ExtensionType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * &lt;p&gt;Java class for UserQualification complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="UserQualification"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="userGroup" type="{http://datex2.eu/schema/3/facilities}_UserTypeEnum"/&amp;gt;
 *         &amp;lt;element name="_userQualificationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserQualification", propOrder = {
    "userGroup",
    "_UserQualificationExtension"
})
@ToString
@EqualsAndHashCode
public class UserQualification {

    @XmlElement(required = true)
    protected _UserTypeEnum userGroup;
    @XmlElement(name = "_userQualificationExtension")
    protected _ExtensionType _UserQualificationExtension;

    /**
     * Gets the value of the userGroup property.
     * 
     * @return
     *     possible object is
     *     {@link _UserTypeEnum }
     *     
     */
    public _UserTypeEnum getUserGroup() {
        return userGroup;
    }

    /**
     * Sets the value of the userGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link _UserTypeEnum }
     *     
     */
    public void setUserGroup(_UserTypeEnum value) {
        this.userGroup = value;
    }

    /**
     * Gets the value of the _UserQualificationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_UserQualificationExtension() {
        return _UserQualificationExtension;
    }

    /**
     * Sets the value of the _UserQualificationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_UserQualificationExtension(_ExtensionType value) {
        this._UserQualificationExtension = value;
    }

}
