
package weather;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CRMTender complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CRMTender">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://www.tech-trans.com.cn/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncreaseAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="MaxAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="MinAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TenderDesci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TenderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TenderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRMTender", propOrder = {
    "extensionData",
    "expiryDate",
    "increaseAmt",
    "maxAmt",
    "minAmt",
    "tenderDesci",
    "tenderID",
    "tenderType"
})
public class CRMTender {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "ExpiryDate")
    protected String expiryDate;
    @XmlElement(name = "IncreaseAmt", required = true)
    protected BigDecimal increaseAmt;
    @XmlElement(name = "MaxAmt", required = true)
    protected BigDecimal maxAmt;
    @XmlElement(name = "MinAmt", required = true)
    protected BigDecimal minAmt;
    @XmlElement(name = "TenderDesci")
    protected String tenderDesci;
    @XmlElement(name = "TenderID")
    protected String tenderID;
    @XmlElement(name = "TenderType")
    protected String tenderType;

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
     * 获取expiryDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * 设置expiryDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
    }

    /**
     * 获取increaseAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIncreaseAmt() {
        return increaseAmt;
    }

    /**
     * 设置increaseAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIncreaseAmt(BigDecimal value) {
        this.increaseAmt = value;
    }

    /**
     * 获取maxAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxAmt() {
        return maxAmt;
    }

    /**
     * 设置maxAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxAmt(BigDecimal value) {
        this.maxAmt = value;
    }

    /**
     * 获取minAmt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinAmt() {
        return minAmt;
    }

    /**
     * 设置minAmt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinAmt(BigDecimal value) {
        this.minAmt = value;
    }

    /**
     * 获取tenderDesci属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenderDesci() {
        return tenderDesci;
    }

    /**
     * 设置tenderDesci属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenderDesci(String value) {
        this.tenderDesci = value;
    }

    /**
     * 获取tenderID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenderID() {
        return tenderID;
    }

    /**
     * 设置tenderID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenderID(String value) {
        this.tenderID = value;
    }

    /**
     * 获取tenderType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenderType() {
        return tenderType;
    }

    /**
     * 设置tenderType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTenderType(String value) {
        this.tenderType = value;
    }

}
