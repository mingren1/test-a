
package weather;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>txsalestender complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="txsalestender">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://www.tech-trans.com.cn/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="dec_baseamount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dec_payamount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="i_specificedtype" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="s_cashier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_extendparam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_tendercode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "txsalestender", propOrder = {
    "extensionData",
    "decBaseamount",
    "decPayamount",
    "iSpecificedtype",
    "sCashier",
    "sExtendparam",
    "sTendercode"
})
public class Txsalestender {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "dec_baseamount", required = true)
    protected BigDecimal decBaseamount;
    @XmlElement(name = "dec_payamount", required = true)
    protected BigDecimal decPayamount;
    @XmlElement(name = "i_specificedtype")
    protected int iSpecificedtype;
    @XmlElement(name = "s_cashier")
    protected String sCashier;
    @XmlElement(name = "s_extendparam")
    protected String sExtendparam;
    @XmlElement(name = "s_tendercode")
    protected String sTendercode;

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
     * 获取decBaseamount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecBaseamount() {
        return decBaseamount;
    }

    /**
     * 设置decBaseamount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecBaseamount(BigDecimal value) {
        this.decBaseamount = value;
    }

    /**
     * 获取decPayamount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecPayamount() {
        return decPayamount;
    }

    /**
     * 设置decPayamount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecPayamount(BigDecimal value) {
        this.decPayamount = value;
    }

    /**
     * 获取iSpecificedtype属性的值。
     * 
     */
    public int getISpecificedtype() {
        return iSpecificedtype;
    }

    /**
     * 设置iSpecificedtype属性的值。
     * 
     */
    public void setISpecificedtype(int value) {
        this.iSpecificedtype = value;
    }

    /**
     * 获取sCashier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCashier() {
        return sCashier;
    }

    /**
     * 设置sCashier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCashier(String value) {
        this.sCashier = value;
    }

    /**
     * 获取sExtendparam属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSExtendparam() {
        return sExtendparam;
    }

    /**
     * 设置sExtendparam属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSExtendparam(String value) {
        this.sExtendparam = value;
    }

    /**
     * 获取sTendercode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTendercode() {
        return sTendercode;
    }

    /**
     * 设置sTendercode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTendercode(String value) {
        this.sTendercode = value;
    }

}
