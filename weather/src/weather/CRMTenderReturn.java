
package weather;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CRMTenderReturn complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CRMTenderReturn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://www.tech-trans.com.cn/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="CanUseAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="LedgerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRMTenderReturn", propOrder = {
    "extensionData",
    "canUseAmount",
    "ledgerID"
})
public class CRMTenderReturn {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "CanUseAmount", required = true)
    protected BigDecimal canUseAmount;
    @XmlElement(name = "LedgerID")
    protected String ledgerID;

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
     * 获取canUseAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCanUseAmount() {
        return canUseAmount;
    }

    /**
     * 设置canUseAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCanUseAmount(BigDecimal value) {
        this.canUseAmount = value;
    }

    /**
     * 获取ledgerID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLedgerID() {
        return ledgerID;
    }

    /**
     * 设置ledgerID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLedgerID(String value) {
        this.ledgerID = value;
    }

}
