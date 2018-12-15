
package weather;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>xf_vipgiftuseitem complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="xf_vipgiftuseitem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://www.tech-trans.com.cn/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="EB_BARCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="XF_BONUS" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="XF_ITEMDESCI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_ITEMNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_PHOTOPATH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_QOH" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="XF_QTY" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="XF_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xf_vipgiftuseitem", propOrder = {
    "extensionData",
    "ebbarcode",
    "xfamount",
    "xfbonus",
    "xfitemdesci",
    "xfitemno",
    "xfphotopath",
    "xfqoh",
    "xfqty",
    "xftype"
})
public class XfVipgiftuseitem {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "EB_BARCODE")
    protected String ebbarcode;
    @XmlElement(name = "XF_AMOUNT", required = true)
    protected BigDecimal xfamount;
    @XmlElement(name = "XF_BONUS", required = true)
    protected BigDecimal xfbonus;
    @XmlElement(name = "XF_ITEMDESCI")
    protected String xfitemdesci;
    @XmlElement(name = "XF_ITEMNO")
    protected String xfitemno;
    @XmlElement(name = "XF_PHOTOPATH")
    protected String xfphotopath;
    @XmlElement(name = "XF_QOH", required = true)
    protected BigDecimal xfqoh;
    @XmlElement(name = "XF_QTY", required = true)
    protected BigDecimal xfqty;
    @XmlElement(name = "XF_TYPE")
    protected String xftype;

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
     * 获取ebbarcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBBARCODE() {
        return ebbarcode;
    }

    /**
     * 设置ebbarcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBBARCODE(String value) {
        this.ebbarcode = value;
    }

    /**
     * 获取xfamount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXFAMOUNT() {
        return xfamount;
    }

    /**
     * 设置xfamount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXFAMOUNT(BigDecimal value) {
        this.xfamount = value;
    }

    /**
     * 获取xfbonus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXFBONUS() {
        return xfbonus;
    }

    /**
     * 设置xfbonus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXFBONUS(BigDecimal value) {
        this.xfbonus = value;
    }

    /**
     * 获取xfitemdesci属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFITEMDESCI() {
        return xfitemdesci;
    }

    /**
     * 设置xfitemdesci属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFITEMDESCI(String value) {
        this.xfitemdesci = value;
    }

    /**
     * 获取xfitemno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFITEMNO() {
        return xfitemno;
    }

    /**
     * 设置xfitemno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFITEMNO(String value) {
        this.xfitemno = value;
    }

    /**
     * 获取xfphotopath属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFPHOTOPATH() {
        return xfphotopath;
    }

    /**
     * 设置xfphotopath属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFPHOTOPATH(String value) {
        this.xfphotopath = value;
    }

    /**
     * 获取xfqoh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXFQOH() {
        return xfqoh;
    }

    /**
     * 设置xfqoh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXFQOH(BigDecimal value) {
        this.xfqoh = value;
    }

    /**
     * 获取xfqty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXFQTY() {
        return xfqty;
    }

    /**
     * 设置xfqty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXFQTY(BigDecimal value) {
        this.xfqty = value;
    }

    /**
     * 获取xftype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFTYPE() {
        return xftype;
    }

    /**
     * 设置xftype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFTYPE(String value) {
        this.xftype = value;
    }

}
