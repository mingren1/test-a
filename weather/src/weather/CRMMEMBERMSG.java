
package weather;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>CRM_MEMBERMSG complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CRM_MEMBERMSG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://www.tech-trans.com.cn/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="ACTIVE_COST" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ASSIGNMEMBERCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BUILDINGID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONFIRMDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CONFIRMUSER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CRM_MSG_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOCNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_ACTIVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_BONUS" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="EB_CREATEBY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_CREATE_DATETIME" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EB_ISDELETE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_LASTMODIFYBY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EB_LASTMODIFY_DATETIME" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MSGCONTENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MSGDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MSGENDDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MSGSENDTODESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MSGSENDTOSQL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MSGTITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PEOPLELIMIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SENDSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STARTSENDDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="STARTSENDTIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UNCONFIRMDATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UNCONFIRMUSER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRM_MEMBERMSG", propOrder = {
    "extensionData",
    "activecost",
    "assignmembercode",
    "buildingid",
    "confirmdate",
    "confirmuser",
    "crmmsgcode",
    "docno",
    "ebactive",
    "ebbonus",
    "ebcreateby",
    "ebcreatedatetime",
    "ebisdelete",
    "eblastmodifyby",
    "eblastmodifydatetime",
    "msgcontent",
    "msgdate",
    "msgenddate",
    "msgsendtodesc",
    "msgsendtosql",
    "msgtitle",
    "peoplelimit",
    "sendstatus",
    "startsenddate",
    "startsendtime",
    "status",
    "unconfirmdate",
    "unconfirmuser"
})
public class CRMMEMBERMSG {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "ACTIVE_COST", required = true)
    protected BigDecimal activecost;
    @XmlElement(name = "ASSIGNMEMBERCODE")
    protected String assignmembercode;
    @XmlElement(name = "BUILDINGID")
    protected String buildingid;
    @XmlElement(name = "CONFIRMDATE", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar confirmdate;
    @XmlElement(name = "CONFIRMUSER")
    protected String confirmuser;
    @XmlElement(name = "CRM_MSG_CODE")
    protected String crmmsgcode;
    @XmlElement(name = "DOCNO")
    protected String docno;
    @XmlElement(name = "EB_ACTIVE")
    protected String ebactive;
    @XmlElement(name = "EB_BONUS", required = true)
    protected BigDecimal ebbonus;
    @XmlElement(name = "EB_CREATEBY")
    protected String ebcreateby;
    @XmlElement(name = "EB_CREATE_DATETIME", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ebcreatedatetime;
    @XmlElement(name = "EB_ISDELETE")
    protected String ebisdelete;
    @XmlElement(name = "EB_LASTMODIFYBY")
    protected String eblastmodifyby;
    @XmlElement(name = "EB_LASTMODIFY_DATETIME", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eblastmodifydatetime;
    @XmlElement(name = "MSGCONTENT")
    protected String msgcontent;
    @XmlElement(name = "MSGDATE", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar msgdate;
    @XmlElement(name = "MSGENDDATE", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar msgenddate;
    @XmlElement(name = "MSGSENDTODESC")
    protected String msgsendtodesc;
    @XmlElement(name = "MSGSENDTOSQL")
    protected String msgsendtosql;
    @XmlElement(name = "MSGTITLE")
    protected String msgtitle;
    @XmlElement(name = "PEOPLELIMIT")
    protected String peoplelimit;
    @XmlElement(name = "SENDSTATUS")
    protected String sendstatus;
    @XmlElement(name = "STARTSENDDATE", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startsenddate;
    @XmlElement(name = "STARTSENDTIME")
    protected String startsendtime;
    @XmlElement(name = "STATUS")
    protected String status;
    @XmlElement(name = "UNCONFIRMDATE", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar unconfirmdate;
    @XmlElement(name = "UNCONFIRMUSER")
    protected String unconfirmuser;

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
     * 获取activecost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getACTIVECOST() {
        return activecost;
    }

    /**
     * 设置activecost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setACTIVECOST(BigDecimal value) {
        this.activecost = value;
    }

    /**
     * 获取assignmembercode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASSIGNMEMBERCODE() {
        return assignmembercode;
    }

    /**
     * 设置assignmembercode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASSIGNMEMBERCODE(String value) {
        this.assignmembercode = value;
    }

    /**
     * 获取buildingid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUILDINGID() {
        return buildingid;
    }

    /**
     * 设置buildingid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUILDINGID(String value) {
        this.buildingid = value;
    }

    /**
     * 获取confirmdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCONFIRMDATE() {
        return confirmdate;
    }

    /**
     * 设置confirmdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCONFIRMDATE(XMLGregorianCalendar value) {
        this.confirmdate = value;
    }

    /**
     * 获取confirmuser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONFIRMUSER() {
        return confirmuser;
    }

    /**
     * 设置confirmuser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONFIRMUSER(String value) {
        this.confirmuser = value;
    }

    /**
     * 获取crmmsgcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRMMSGCODE() {
        return crmmsgcode;
    }

    /**
     * 设置crmmsgcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRMMSGCODE(String value) {
        this.crmmsgcode = value;
    }

    /**
     * 获取docno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCNO() {
        return docno;
    }

    /**
     * 设置docno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCNO(String value) {
        this.docno = value;
    }

    /**
     * 获取ebactive属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBACTIVE() {
        return ebactive;
    }

    /**
     * 设置ebactive属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBACTIVE(String value) {
        this.ebactive = value;
    }

    /**
     * 获取ebbonus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEBBONUS() {
        return ebbonus;
    }

    /**
     * 设置ebbonus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEBBONUS(BigDecimal value) {
        this.ebbonus = value;
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
     * 获取msgcontent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSGCONTENT() {
        return msgcontent;
    }

    /**
     * 设置msgcontent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSGCONTENT(String value) {
        this.msgcontent = value;
    }

    /**
     * 获取msgdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMSGDATE() {
        return msgdate;
    }

    /**
     * 设置msgdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMSGDATE(XMLGregorianCalendar value) {
        this.msgdate = value;
    }

    /**
     * 获取msgenddate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMSGENDDATE() {
        return msgenddate;
    }

    /**
     * 设置msgenddate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMSGENDDATE(XMLGregorianCalendar value) {
        this.msgenddate = value;
    }

    /**
     * 获取msgsendtodesc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSGSENDTODESC() {
        return msgsendtodesc;
    }

    /**
     * 设置msgsendtodesc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSGSENDTODESC(String value) {
        this.msgsendtodesc = value;
    }

    /**
     * 获取msgsendtosql属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSGSENDTOSQL() {
        return msgsendtosql;
    }

    /**
     * 设置msgsendtosql属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSGSENDTOSQL(String value) {
        this.msgsendtosql = value;
    }

    /**
     * 获取msgtitle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSGTITLE() {
        return msgtitle;
    }

    /**
     * 设置msgtitle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSGTITLE(String value) {
        this.msgtitle = value;
    }

    /**
     * 获取peoplelimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPEOPLELIMIT() {
        return peoplelimit;
    }

    /**
     * 设置peoplelimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPEOPLELIMIT(String value) {
        this.peoplelimit = value;
    }

    /**
     * 获取sendstatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENDSTATUS() {
        return sendstatus;
    }

    /**
     * 设置sendstatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENDSTATUS(String value) {
        this.sendstatus = value;
    }

    /**
     * 获取startsenddate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSTARTSENDDATE() {
        return startsenddate;
    }

    /**
     * 设置startsenddate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSTARTSENDDATE(XMLGregorianCalendar value) {
        this.startsenddate = value;
    }

    /**
     * 获取startsendtime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTARTSENDTIME() {
        return startsendtime;
    }

    /**
     * 设置startsendtime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTARTSENDTIME(String value) {
        this.startsendtime = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

    /**
     * 获取unconfirmdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUNCONFIRMDATE() {
        return unconfirmdate;
    }

    /**
     * 设置unconfirmdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUNCONFIRMDATE(XMLGregorianCalendar value) {
        this.unconfirmdate = value;
    }

    /**
     * 获取unconfirmuser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNCONFIRMUSER() {
        return unconfirmuser;
    }

    /**
     * 设置unconfirmuser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNCONFIRMUSER(String value) {
        this.unconfirmuser = value;
    }

}
