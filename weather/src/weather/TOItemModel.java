
package weather;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TOItemModel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TOItemModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://www.tech-trans.com.cn/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="XF_AUCOSTk__BackingField" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="XF_DESCIk__BackingField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_PLUk__BackingField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_QTYk__BackingField" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="XF_TRFOUTSTOREk__BackingField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_TTCOSTk__BackingField" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TOItemModel", propOrder = {
    "extensionData",
    "xfaucosTkBackingField",
    "xfdescIkBackingField",
    "xfplUkBackingField",
    "xfqtYkBackingField",
    "xftrfoutstorEkBackingField",
    "xfttcosTkBackingField"
})
public class TOItemModel {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "XF_AUCOSTk__BackingField", required = true)
    protected BigDecimal xfaucosTkBackingField;
    @XmlElement(name = "XF_DESCIk__BackingField")
    protected String xfdescIkBackingField;
    @XmlElement(name = "XF_PLUk__BackingField")
    protected String xfplUkBackingField;
    @XmlElement(name = "XF_QTYk__BackingField", required = true)
    protected BigDecimal xfqtYkBackingField;
    @XmlElement(name = "XF_TRFOUTSTOREk__BackingField")
    protected String xftrfoutstorEkBackingField;
    @XmlElement(name = "XF_TTCOSTk__BackingField", required = true)
    protected BigDecimal xfttcosTkBackingField;

    /**
     * 获取extensionData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExtensionDataObject }
     *     
     */
    public ExtensionDataObject getExtensionData() {
        return extensionData;
    }

    /**
     * 设置extensionData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionDataObject }
     *     
     */
    public void setExtensionData(ExtensionDataObject value) {
        this.extensionData = value;
    }

    /**
     * 获取xfaucosTkBackingField属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXFAUCOSTkBackingField() {
        return xfaucosTkBackingField;
    }

    /**
     * 设置xfaucosTkBackingField属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXFAUCOSTkBackingField(BigDecimal value) {
        this.xfaucosTkBackingField = value;
    }

    /**
     * 获取xfdescIkBackingField属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFDESCIkBackingField() {
        return xfdescIkBackingField;
    }

    /**
     * 设置xfdescIkBackingField属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFDESCIkBackingField(String value) {
        this.xfdescIkBackingField = value;
    }

    /**
     * 获取xfplUkBackingField属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFPLUkBackingField() {
        return xfplUkBackingField;
    }

    /**
     * 设置xfplUkBackingField属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFPLUkBackingField(String value) {
        this.xfplUkBackingField = value;
    }

    /**
     * 获取xfqtYkBackingField属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXFQTYkBackingField() {
        return xfqtYkBackingField;
    }

    /**
     * 设置xfqtYkBackingField属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXFQTYkBackingField(BigDecimal value) {
        this.xfqtYkBackingField = value;
    }

    /**
     * 获取xftrfoutstorEkBackingField属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFTRFOUTSTOREkBackingField() {
        return xftrfoutstorEkBackingField;
    }

    /**
     * 设置xftrfoutstorEkBackingField属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFTRFOUTSTOREkBackingField(String value) {
        this.xftrfoutstorEkBackingField = value;
    }

    /**
     * 获取xfttcosTkBackingField属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXFTTCOSTkBackingField() {
        return xfttcosTkBackingField;
    }

    /**
     * 设置xfttcosTkBackingField属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXFTTCOSTkBackingField(BigDecimal value) {
        this.xfttcosTkBackingField = value;
    }

}
