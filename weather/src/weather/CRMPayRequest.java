
package weather;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CRMPayRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CRMPayRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VERIFICATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VIPCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STORECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TENDERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TENDERTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYAMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="USERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TXDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRMPayRequest", propOrder = {
    "key",
    "verification",
    "vipcode",
    "storecode",
    "tenderid",
    "tendertype",
    "payamt",
    "userid",
    "txdate"
})
public class CRMPayRequest {

    @XmlElement(name = "KEY")
    protected String key;
    @XmlElement(name = "VERIFICATION")
    protected String verification;
    @XmlElement(name = "VIPCODE")
    protected String vipcode;
    @XmlElement(name = "STORECODE")
    protected String storecode;
    @XmlElement(name = "TENDERID")
    protected String tenderid;
    @XmlElement(name = "TENDERTYPE")
    protected String tendertype;
    @XmlElement(name = "PAYAMT", required = true)
    protected BigDecimal payamt;
    @XmlElement(name = "USERID")
    protected String userid;
    @XmlElement(name = "TXDATE")
    protected String txdate;

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
     * 获取storecode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTORECODE() {
        return storecode;
    }

    /**
     * 设置storecode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTORECODE(String value) {
        this.storecode = value;
    }

    /**
     * 获取tenderid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTENDERID() {
        return tenderid;
    }

    /**
     * 设置tenderid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTENDERID(String value) {
        this.tenderid = value;
    }

    /**
     * 获取tendertype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTENDERTYPE() {
        return tendertype;
    }

    /**
     * 设置tendertype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTENDERTYPE(String value) {
        this.tendertype = value;
    }

    /**
     * 获取payamt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPAYAMT() {
        return payamt;
    }

    /**
     * 设置payamt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPAYAMT(BigDecimal value) {
        this.payamt = value;
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

}
