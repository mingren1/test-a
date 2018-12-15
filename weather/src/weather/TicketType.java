
package weather;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TicketType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TicketType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://www.tech-trans.com.cn/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="BATCHDESCI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BATCHID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESCI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EFFECTDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXPIRYDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QTY" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketType", propOrder = {
    "extensionData",
    "amt",
    "batchdesci",
    "batchid",
    "desci",
    "effectdate",
    "expirydate",
    "qty",
    "type"
})
public class TicketType {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "AMT", required = true)
    protected BigDecimal amt;
    @XmlElement(name = "BATCHDESCI")
    protected String batchdesci;
    @XmlElement(name = "BATCHID")
    protected String batchid;
    @XmlElement(name = "DESCI")
    protected String desci;
    @XmlElement(name = "EFFECTDATE")
    protected String effectdate;
    @XmlElement(name = "EXPIRYDATE")
    protected String expirydate;
    @XmlElement(name = "QTY", required = true)
    protected BigDecimal qty;
    @XmlElement(name = "TYPE")
    protected String type;

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
     * 获取batchdesci属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBATCHDESCI() {
        return batchdesci;
    }

    /**
     * 设置batchdesci属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBATCHDESCI(String value) {
        this.batchdesci = value;
    }

    /**
     * 获取batchid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBATCHID() {
        return batchid;
    }

    /**
     * 设置batchid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBATCHID(String value) {
        this.batchid = value;
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
     * 获取effectdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEFFECTDATE() {
        return effectdate;
    }

    /**
     * 设置effectdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEFFECTDATE(String value) {
        this.effectdate = value;
    }

    /**
     * 获取expirydate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXPIRYDATE() {
        return expirydate;
    }

    /**
     * 设置expirydate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXPIRYDATE(String value) {
        this.expirydate = value;
    }

    /**
     * 获取qty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQTY() {
        return qty;
    }

    /**
     * 设置qty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQTY(BigDecimal value) {
        this.qty = value;
    }

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPE() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPE(String value) {
        this.type = value;
    }

}
