
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CRMRefundRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CRMRefundRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VERIFICATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VIPCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOCNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TXDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRMRefundRequest", propOrder = {
    "key",
    "verification",
    "vipcode",
    "docno",
    "txdate",
    "userid"
})
public class CRMRefundRequest {

    @XmlElement(name = "KEY")
    protected String key;
    @XmlElement(name = "VERIFICATION")
    protected String verification;
    @XmlElement(name = "VIPCODE")
    protected String vipcode;
    @XmlElement(name = "DOCNO")
    protected String docno;
    @XmlElement(name = "TXDATE")
    protected String txdate;
    @XmlElement(name = "USERID")
    protected String userid;

    /**
     * 获取key属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKEY() {
        return key;
    }

    /**
     * 设置key属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKEY(String value) {
        this.key = value;
    }

    /**
     * 获取verification属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVERIFICATION() {
        return verification;
    }

    /**
     * 设置verification属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVERIFICATION(String value) {
        this.verification = value;
    }

    /**
     * 获取vipcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIPCODE() {
        return vipcode;
    }

    /**
     * 设置vipcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIPCODE(String value) {
        this.vipcode = value;
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
     * 获取txdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTXDATE() {
        return txdate;
    }

    /**
     * 设置txdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTXDATE(String value) {
        this.txdate = value;
    }

    /**
     * 获取userid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERID() {
        return userid;
    }

    /**
     * 设置userid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSERID(String value) {
        this.userid = value;
    }

}
