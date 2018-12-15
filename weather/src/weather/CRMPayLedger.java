
package weather;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CRMPayLedger complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CRMPayLedger">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TXDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TXTIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESCI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOCNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NUM" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="STORECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STORENAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRMPayLedger", propOrder = {
    "txdate",
    "txtime",
    "desci",
    "docno",
    "num",
    "amt",
    "storecode",
    "storename"
})
public class CRMPayLedger {

    @XmlElement(name = "TXDATE")
    protected String txdate;
    @XmlElement(name = "TXTIME")
    protected String txtime;
    @XmlElement(name = "DESCI")
    protected String desci;
    @XmlElement(name = "DOCNO")
    protected String docno;
    @XmlElement(name = "NUM", required = true)
    protected BigDecimal num;
    @XmlElement(name = "AMT", required = true)
    protected BigDecimal amt;
    @XmlElement(name = "STORECODE")
    protected String storecode;
    @XmlElement(name = "STORENAME")
    protected String storename;

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
     * 获取txtime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTXTIME() {
        return txtime;
    }

    /**
     * 设置txtime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTXTIME(String value) {
        this.txtime = value;
    }

    /**
     * 获取desci属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCI() {
        return desci;
    }

    /**
     * 设置desci属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCI(String value) {
        this.desci = value;
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
     * 获取num属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNUM() {
        return num;
    }

    /**
     * 设置num属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNUM(BigDecimal value) {
        this.num = value;
    }

    /**
     * 获取amt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMT() {
        return amt;
    }

    /**
     * 设置amt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMT(BigDecimal value) {
        this.amt = value;
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
     * 获取storename属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTORENAME() {
        return storename;
    }

    /**
     * 设置storename属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTORENAME(String value) {
        this.storename = value;
    }

}
