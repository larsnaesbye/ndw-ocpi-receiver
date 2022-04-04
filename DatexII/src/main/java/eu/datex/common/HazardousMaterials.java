
package eu.datex.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.w3._2001.xmlschema.Adapter2;


/**
 * &lt;p&gt;Java class for HazardousMaterials complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="HazardousMaterials"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="chemicalName" type="{http://datex2.eu/schema/3/common}MultilingualString"/&amp;gt;
 *         &amp;lt;element name="dangerousGoodsFlashPoint" type="{http://datex2.eu/schema/3/common}TemperatureCelsius" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="dangerousGoodsRegulations" type="{http://datex2.eu/schema/3/common}_DangerousGoodsRegulationsEnum" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="hazardCodeIdentification" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="hazardCodeVersionNumber" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="hazardSubstanceItemPageNumber" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="tremCardNumber" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="undgNumber" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="volumeOfDangerousGoods" type="{http://datex2.eu/schema/3/common}CubicMetres" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="weightOfDangerousGoods" type="{http://datex2.eu/schema/3/common}Tonnes" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="_hazardousMaterialsExtension" type="{http://datex2.eu/schema/3/common}_HazardousMaterialsExtensionType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HazardousMaterials", propOrder = {
    "chemicalName",
    "dangerousGoodsFlashPoint",
    "dangerousGoodsRegulations",
    "hazardCodeIdentification",
    "hazardCodeVersionNumber",
    "hazardSubstanceItemPageNumber",
    "tremCardNumber",
    "undgNumber",
    "volumeOfDangerousGoods",
    "weightOfDangerousGoods",
    "_HazardousMaterialsExtension"
})
@ToString
@EqualsAndHashCode
public class HazardousMaterials {

    @XmlElement(required = true)
    protected MultilingualString chemicalName;
    protected Float dangerousGoodsFlashPoint;
    protected _DangerousGoodsRegulationsEnum dangerousGoodsRegulations;
    protected String hazardCodeIdentification;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Long hazardCodeVersionNumber;
    protected String hazardSubstanceItemPageNumber;
    protected String tremCardNumber;
    protected String undgNumber;
    protected Float volumeOfDangerousGoods;
    protected Float weightOfDangerousGoods;
    @XmlElement(name = "_hazardousMaterialsExtension")
    protected _HazardousMaterialsExtensionType _HazardousMaterialsExtension;

    /**
     * Gets the value of the chemicalName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getChemicalName() {
        return chemicalName;
    }

    /**
     * Sets the value of the chemicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setChemicalName(MultilingualString value) {
        this.chemicalName = value;
    }

    /**
     * Gets the value of the dangerousGoodsFlashPoint property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDangerousGoodsFlashPoint() {
        return dangerousGoodsFlashPoint;
    }

    /**
     * Sets the value of the dangerousGoodsFlashPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDangerousGoodsFlashPoint(Float value) {
        this.dangerousGoodsFlashPoint = value;
    }

    /**
     * Gets the value of the dangerousGoodsRegulations property.
     * 
     * @return
     *     possible object is
     *     {@link _DangerousGoodsRegulationsEnum }
     *     
     */
    public _DangerousGoodsRegulationsEnum getDangerousGoodsRegulations() {
        return dangerousGoodsRegulations;
    }

    /**
     * Sets the value of the dangerousGoodsRegulations property.
     * 
     * @param value
     *     allowed object is
     *     {@link _DangerousGoodsRegulationsEnum }
     *     
     */
    public void setDangerousGoodsRegulations(_DangerousGoodsRegulationsEnum value) {
        this.dangerousGoodsRegulations = value;
    }

    /**
     * Gets the value of the hazardCodeIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardCodeIdentification() {
        return hazardCodeIdentification;
    }

    /**
     * Sets the value of the hazardCodeIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardCodeIdentification(String value) {
        this.hazardCodeIdentification = value;
    }

    /**
     * Gets the value of the hazardCodeVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getHazardCodeVersionNumber() {
        return hazardCodeVersionNumber;
    }

    /**
     * Sets the value of the hazardCodeVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardCodeVersionNumber(Long value) {
        this.hazardCodeVersionNumber = value;
    }

    /**
     * Gets the value of the hazardSubstanceItemPageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHazardSubstanceItemPageNumber() {
        return hazardSubstanceItemPageNumber;
    }

    /**
     * Sets the value of the hazardSubstanceItemPageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHazardSubstanceItemPageNumber(String value) {
        this.hazardSubstanceItemPageNumber = value;
    }

    /**
     * Gets the value of the tremCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTremCardNumber() {
        return tremCardNumber;
    }

    /**
     * Sets the value of the tremCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTremCardNumber(String value) {
        this.tremCardNumber = value;
    }

    /**
     * Gets the value of the undgNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndgNumber() {
        return undgNumber;
    }

    /**
     * Sets the value of the undgNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUndgNumber(String value) {
        this.undgNumber = value;
    }

    /**
     * Gets the value of the volumeOfDangerousGoods property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVolumeOfDangerousGoods() {
        return volumeOfDangerousGoods;
    }

    /**
     * Sets the value of the volumeOfDangerousGoods property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVolumeOfDangerousGoods(Float value) {
        this.volumeOfDangerousGoods = value;
    }

    /**
     * Gets the value of the weightOfDangerousGoods property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWeightOfDangerousGoods() {
        return weightOfDangerousGoods;
    }

    /**
     * Sets the value of the weightOfDangerousGoods property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWeightOfDangerousGoods(Float value) {
        this.weightOfDangerousGoods = value;
    }

    /**
     * Gets the value of the _HazardousMaterialsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _HazardousMaterialsExtensionType }
     *     
     */
    public _HazardousMaterialsExtensionType get_HazardousMaterialsExtension() {
        return _HazardousMaterialsExtension;
    }

    /**
     * Sets the value of the _HazardousMaterialsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _HazardousMaterialsExtensionType }
     *     
     */
    public void set_HazardousMaterialsExtension(_HazardousMaterialsExtensionType value) {
        this._HazardousMaterialsExtension = value;
    }

}
