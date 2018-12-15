
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>xf_transsalestotal complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="xf_transsalestotal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://www.tech-trans.com.cn/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="BRANDDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_CREATEBY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_CREATE_DATETIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_LASTMODIFYBY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_LASTMODIFY_DATETIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STOREDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_BONUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_DOCNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_MALLID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_NETAMOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_PARENTNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_STORECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_TILLID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_TXDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_TXTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XF_VIPCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xf_transsalestotal", propOrder = {
    "extensionData",
    "branddesc",
    "ebcreateby",
    "ebcreatedatetime",
    "ebid",
    "eblastmodifyby",
    "eblastmodifydatetime",
    "storedesc",
    "xfbonus",
    "xfdate",
    "xfdocno",
    "xfmallid",
    "xfnetamount",
    "xfparentno",
    "xfstorecode",
    "xftillid",
    "xftxdate",
    "xftxtype",
    "xfvipcode"
})
public class XfTranssalestotal {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "BRANDDESC")
    protected String branddesc;
    @XmlElement(name = "EB_CREATEBY")
    protected String ebcreateby;
    @XmlElement(name = "EB_CREATE_DATETIME")
    protected String ebcreatedatetime;
    @XmlElement(name = "EB_ID")
    protected String ebid;
    @XmlElement(name = "EB_LASTMODIFYBY")
    protected String eblastmodifyby;
    @XmlElement(name = "EB_LASTMODIFY_DATETIME")
    protected String eblastmodifydatetime;
    @XmlElement(name = "STOREDESC")
    protected String storedesc;
    @XmlElement(name = "XF_BONUS")
    protected String xfbonus;
    @XmlElement(name = "XF_DATE")
    protected String xfdate;
    @XmlElement(name = "XF_DOCNO")
    protected String xfdocno;
    @XmlElement(name = "XF_MALLID")
    protected String xfmallid;
    @XmlElement(name = "XF_NETAMOUNT")
    protected String xfnetamount;
    @XmlElement(name = "XF_PARENTNO")
    protected String xfparentno;
    @XmlElement(name = "XF_STORECODE")
    protected String xfstorecode;
    @XmlElement(name = "XF_TILLID")
    protected String xftillid;
    @XmlElement(name = "XF_TXDATE")
    protected String xftxdate;
    @XmlElement(name = "XF_TXTYPE")
    protected String xftxtype;
    @XmlElement(name = "XF_VIPCODE")
    protected String xfvipcode;

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
     * 获取branddesc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRANDDESC() {
        return branddesc;
    }

    /**
     * 设置branddesc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRANDDESC(String value) {
        this.branddesc = value;
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
     *     {@link String }
     *     
     */
    public String getEBCREATEDATETIME() {
        return ebcreatedatetime;
    }

    /**
     * 设置ebcreatedatetime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBCREATEDATETIME(String value) {
        this.ebcreatedatetime = value;
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
     *     {@link String }
     *     
     */
    public String getEBLASTMODIFYDATETIME() {
        return eblastmodifydatetime;
    }

    /**
     * 设置eblastmodifydatetime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBLASTMODIFYDATETIME(String value) {
        this.eblastmodifydatetime = value;
    }

    /**
     * 获取storedesc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTOREDESC() {
        return storedesc;
    }

    /**
     * 设置storedesc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTOREDESC(String value) {
        this.storedesc = value;
    }

    /**
     * 获取xfbonus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFBONUS() {
        return xfbonus;
    }

    /**
     * 设置xfbonus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFBONUS(String value) {
        this.xfbonus = value;
    }

    /**
     * 获取xfdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFDATE() {
        return xfdate;
    }

    /**
     * 设置xfdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFDATE(String value) {
        this.xfdate = value;
    }

    /**
     * 获取xfdocno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFDOCNO() {
        return xfdocno;
    }

    /**
     * 设置xfdocno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFDOCNO(String value) {
        this.xfdocno = value;
    }

    /**
     * 获取xfmallid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFMALLID() {
        return xfmallid;
    }

    /**
     * 设置xfmallid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFMALLID(String value) {
        this.xfmallid = value;
    }

    /**
     * 获取xfnetamount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFNETAMOUNT() {
        return xfnetamount;
    }

    /**
     * 设置xfnetamount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFNETAMOUNT(String value) {
        this.xfnetamount = value;
    }

    /**
     * 获取xfparentno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFPARENTNO() {
        return xfparentno;
    }

    /**
     * 设置xfparentno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFPARENTNO(String value) {
        this.xfparentno = value;
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

    /**
     * 获取xftillid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFTILLID() {
        return xftillid;
    }

    /**
     * 设置xftillid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFTILLID(String value) {
        this.xftillid = value;
    }

    /**
     * 获取xftxdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFTXDATE() {
        return xftxdate;
    }

    /**
     * 设置xftxdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFTXDATE(String value) {
        this.xftxdate = value;
    }

    /**
     * 获取xftxtype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFTXTYPE() {
        return xftxtype;
    }

    /**
     * 设置xftxtype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFTXTYPE(String value) {
        this.xftxtype = value;
    }

    /**
     * 获取xfvipcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXFVIPCODE() {
        return xfvipcode;
    }

    /**
     * 设置xfvipcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXFVIPCODE(String value) {
        this.xfvipcode = value;
    }

}
