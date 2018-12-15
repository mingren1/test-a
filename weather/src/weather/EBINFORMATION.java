
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>EB_INFORMATION complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EB_INFORMATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://www.tech-trans.com.cn/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="EB_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_CREATEBY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_CREATE_DATETIME" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EB_DELETEABLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_EFFECT_DATETIME" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EB_EXPIRY_DATETIME" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EB_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_IMAGEURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_IMAGE_BIG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_ISDELETE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_LASTMODIFYBY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_LASTMODIFY_DATETIME" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EB_TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_STORECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EB_INFORMATION", propOrder = {
    "extensionData",
    "ebcode",
    "ebcreateby",
    "ebcreatedatetime",
    "ebdeleteable",
    "ebdesc",
    "ebeffectdatetime",
    "ebexpirydatetime",
    "ebid",
    "ebimageurl",
    "ebimagebig",
    "ebisdelete",
    "eblastmodifyby",
    "eblastmodifydatetime",
    "ebtitle",
    "xfstorecode"
})
public class EBINFORMATION {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "EB_CODE")
    protected String ebcode;
    @XmlElement(name = "EB_CREATEBY")
    protected String ebcreateby;
    @XmlElement(name = "EB_CREATE_DATETIME", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ebcreatedatetime;
    @XmlElement(name = "EB_DELETEABLE")
    protected String ebdeleteable;
    @XmlElement(name = "EB_DESC")
    protected String ebdesc;
    @XmlElement(name = "EB_EFFECT_DATETIME", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ebeffectdatetime;
    @XmlElement(name = "EB_EXPIRY_DATETIME", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ebexpirydatetime;
    @XmlElement(name = "EB_ID")
    protected String ebid;
    @XmlElement(name = "EB_IMAGEURL")
    protected String ebimageurl;
    @XmlElement(name = "EB_IMAGE_BIG")
    protected String ebimagebig;
    @XmlElement(name = "EB_ISDELETE")
    protected String ebisdelete;
    @XmlElement(name = "EB_LASTMODIFYBY")
    protected String eblastmodifyby;
    @XmlElement(name = "EB_LASTMODIFY_DATETIME", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eblastmodifydatetime;
    @XmlElement(name = "EB_TITLE")
    protected String ebtitle;
    @XmlElement(name = "XF_STORECODE")
    protected String xfstorecode;

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
     * 获取ebcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBCODE() {
        return ebcode;
    }

    /**
     * 设置ebcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBCODE(String value) {
        this.ebcode = value;
    }

    /**
     * 获取ebcreateby属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBCREATEBY() {
        return ebcreateby;
    }

    /**
     * 设置ebcreateby属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBCREATEBY(String value) {
        this.ebcreateby = value;
    }

    /**
     * 获取ebcreatedatetime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEBCREATEDATETIME() {
        return ebcreatedatetime;
    }

    /**
     * 设置ebcreatedatetime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEBCREATEDATETIME(XMLGregorianCalendar value) {
        this.ebcreatedatetime = value;
    }

    /**
     * 获取ebdeleteable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBDELETEABLE() {
        return ebdeleteable;
    }

    /**
     * 设置ebdeleteable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBDELETEABLE(String value) {
        this.ebdeleteable = value;
    }

    /**
     * 获取ebdesc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBDESC() {
        return ebdesc;
    }

    /**
     * 设置ebdesc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBDESC(String value) {
        this.ebdesc = value;
    }

    /**
     * 获取ebeffectdatetime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEBEFFECTDATETIME() {
        return ebeffectdatetime;
    }

    /**
     * 设置ebeffectdatetime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEBEFFECTDATETIME(XMLGregorianCalendar value) {
        this.ebeffectdatetime = value;
    }

    /**
     * 获取ebexpirydatetime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEBEXPIRYDATETIME() {
        return ebexpirydatetime;
    }

    /**
     * 设置ebexpirydatetime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEBEXPIRYDATETIME(XMLGregorianCalendar value) {
        this.ebexpirydatetime = value;
    }

    /**
     * 获取ebid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBID() {
        return ebid;
    }

    /**
     * 设置ebid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBID(String value) {
        this.ebid = value;
    }

    /**
     * 获取ebimageurl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBIMAGEURL() {
        return ebimageurl;
    }

    /**
     * 设置ebimageurl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBIMAGEURL(String value) {
        this.ebimageurl = value;
    }

    /**
     * 获取ebimagebig属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBIMAGEBIG() {
        return ebimagebig;
    }

    /**
     * 设置ebimagebig属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBIMAGEBIG(String value) {
        this.ebimagebig = value;
    }

    /**
     * 获取ebisdelete属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBISDELETE() {
        return ebisdelete;
    }

    /**
     * 设置ebisdelete属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBISDELETE(String value) {
        this.ebisdelete = value;
    }

    /**
     * 获取eblastmodifyby属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBLASTMODIFYBY() {
        return eblastmodifyby;
    }

    /**
     * 设置eblastmodifyby属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBLASTMODIFYBY(String value) {
        this.eblastmodifyby = value;
    }

    /**
     * 获取eblastmodifydatetime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEBLASTMODIFYDATETIME() {
        return eblastmodifydatetime;
    }

    /**
     * 设置eblastmodifydatetime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEBLASTMODIFYDATETIME(XMLGregorianCalendar value) {
        this.eblastmodifydatetime = value;
    }

    /**
     * 获取ebtitle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBTITLE() {
        return ebtitle;
    }

    /**
     * 设置ebtitle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBTITLE(String value) {
        this.ebtitle = value;
    }

    /**
     * 获取xfstorecode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFSTORECODE() {
        return xfstorecode;
    }

    /**
     * 设置xfstorecode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFSTORECODE(String value) {
        this.xfstorecode = value;
    }

}
