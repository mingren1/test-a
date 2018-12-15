
package weather;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BonusInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BonusInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://www.tech-trans.com.cn/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="bonus2amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="bonusearn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bonusredeem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentbonus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="header" type="{http://www.tech-trans.com.cn/}State" minOccurs="0"/>
 *         &lt;element name="traceno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BonusInfo", propOrder = {
    "extensionData",
    "bonus2Amount",
    "bonusearn",
    "bonusredeem",
    "currentbonus",
    "header",
    "traceno"
})
public class BonusInfo {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "bonus2amount", required = true)
    protected BigDecimal bonus2Amount;
    protected String bonusearn;
    protected String bonusredeem;
    protected String currentbonus;
    protected State header;
    protected String traceno;

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
     * 获取bonus2Amount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBonus2Amount() {
        return bonus2Amount;
    }

    /**
     * 设置bonus2Amount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBonus2Amount(BigDecimal value) {
        this.bonus2Amount = value;
    }

    /**
     * 获取bonusearn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBonusearn() {
        return bonusearn;
    }

    /**
     * 设置bonusearn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBonusearn(String value) {
        this.bonusearn = value;
    }

    /**
     * 获取bonusredeem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBonusredeem() {
        return bonusredeem;
    }

    /**
     * 设置bonusredeem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBonusredeem(String value) {
        this.bonusredeem = value;
    }

    /**
     * 获取currentbonus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentbonus() {
        return currentbonus;
    }

    /**
     * 设置currentbonus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentbonus(String value) {
        this.currentbonus = value;
    }

    /**
     * 获取header属性的值。
     * 
     * @return
     *     possible object is
     *     {@link State }
     *     
     */
    public State getHeader() {
        return header;
    }

    /**
     * 设置header属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link State }
     *     
     */
    public void setHeader(State value) {
        this.header = value;
    }

    /**
     * 获取traceno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceno() {
        return traceno;
    }

    /**
     * 设置traceno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraceno(String value) {
        this.traceno = value;
    }

}
