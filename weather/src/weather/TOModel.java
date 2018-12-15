
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TOModel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TOModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://www.tech-trans.com.cn/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="XF_LASTMODIFYDATE_HHMMSS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_LASTMODIFYDATE_YYYYMMDD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_TRFINSTORE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_TRFINSTOREDESCI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_TRFOUTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_TRFOUTSTORE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_TRFOUTSTOREDESCI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_TRFOUT_HHMMSS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_TRFOUT_YYYYMMDD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_USERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TOModel", propOrder = {
    "extensionData",
    "xflastmodifydatehhmmss",
    "xflastmodifydateyyyymmdd",
    "xfstatus",
    "xftrfinstore",
    "xftrfinstoredesci",
    "xftrfoutno",
    "xftrfoutstore",
    "xftrfoutstoredesci",
    "xftrfouthhmmss",
    "xftrfoutyyyymmdd",
    "xfuserid"
})
public class TOModel {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "XF_LASTMODIFYDATE_HHMMSS")
    protected String xflastmodifydatehhmmss;
    @XmlElement(name = "XF_LASTMODIFYDATE_YYYYMMDD")
    protected String xflastmodifydateyyyymmdd;
    @XmlElement(name = "XF_STATUS")
    protected String xfstatus;
    @XmlElement(name = "XF_TRFINSTORE")
    protected String xftrfinstore;
    @XmlElement(name = "XF_TRFINSTOREDESCI")
    protected String xftrfinstoredesci;
    @XmlElement(name = "XF_TRFOUTNO")
    protected String xftrfoutno;
    @XmlElement(name = "XF_TRFOUTSTORE")
    protected String xftrfoutstore;
    @XmlElement(name = "XF_TRFOUTSTOREDESCI")
    protected String xftrfoutstoredesci;
    @XmlElement(name = "XF_TRFOUT_HHMMSS")
    protected String xftrfouthhmmss;
    @XmlElement(name = "XF_TRFOUT_YYYYMMDD")
    protected String xftrfoutyyyymmdd;
    @XmlElement(name = "XF_USERID")
    protected String xfuserid;

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
     * 获取xflastmodifydatehhmmss属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFLASTMODIFYDATEHHMMSS() {
        return xflastmodifydatehhmmss;
    }

    /**
     * 设置xflastmodifydatehhmmss属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFLASTMODIFYDATEHHMMSS(String value) {
        this.xflastmodifydatehhmmss = value;
    }

    /**
     * 获取xflastmodifydateyyyymmdd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFLASTMODIFYDATEYYYYMMDD() {
        return xflastmodifydateyyyymmdd;
    }

    /**
     * 设置xflastmodifydateyyyymmdd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFLASTMODIFYDATEYYYYMMDD(String value) {
        this.xflastmodifydateyyyymmdd = value;
    }

    /**
     * 获取xfstatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFSTATUS() {
        return xfstatus;
    }

    /**
     * 设置xfstatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFSTATUS(String value) {
        this.xfstatus = value;
    }

    /**
     * 获取xftrfinstore属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFTRFINSTORE() {
        return xftrfinstore;
    }

    /**
     * 设置xftrfinstore属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFTRFINSTORE(String value) {
        this.xftrfinstore = value;
    }

    /**
     * 获取xftrfinstoredesci属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFTRFINSTOREDESCI() {
        return xftrfinstoredesci;
    }

    /**
     * 设置xftrfinstoredesci属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFTRFINSTOREDESCI(String value) {
        this.xftrfinstoredesci = value;
    }

    /**
     * 获取xftrfoutno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFTRFOUTNO() {
        return xftrfoutno;
    }

    /**
     * 设置xftrfoutno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFTRFOUTNO(String value) {
        this.xftrfoutno = value;
    }

    /**
     * 获取xftrfoutstore属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFTRFOUTSTORE() {
        return xftrfoutstore;
    }

    /**
     * 设置xftrfoutstore属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFTRFOUTSTORE(String value) {
        this.xftrfoutstore = value;
    }

    /**
     * 获取xftrfoutstoredesci属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFTRFOUTSTOREDESCI() {
        return xftrfoutstoredesci;
    }

    /**
     * 设置xftrfoutstoredesci属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFTRFOUTSTOREDESCI(String value) {
        this.xftrfoutstoredesci = value;
    }

    /**
     * 获取xftrfouthhmmss属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFTRFOUTHHMMSS() {
        return xftrfouthhmmss;
    }

    /**
     * 设置xftrfouthhmmss属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFTRFOUTHHMMSS(String value) {
        this.xftrfouthhmmss = value;
    }

    /**
     * 获取xftrfoutyyyymmdd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFTRFOUTYYYYMMDD() {
        return xftrfoutyyyymmdd;
    }

    /**
     * 设置xftrfoutyyyymmdd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFTRFOUTYYYYMMDD(String value) {
        this.xftrfoutyyyymmdd = value;
    }

    /**
     * 获取xfuserid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFUSERID() {
        return xfuserid;
    }

    /**
     * 设置xfuserid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFUSERID(String value) {
        this.xfuserid = value;
    }

}
