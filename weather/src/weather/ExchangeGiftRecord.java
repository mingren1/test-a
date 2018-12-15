
package weather;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ExchangeGiftRecord complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ExchangeGiftRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TXDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GIFTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GIFTIMG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BONUS" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="QTY" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeGiftRecord", propOrder = {
    "txdate",
    "giftname",
    "giftimg",
    "bonus",
    "qty"
})
public class ExchangeGiftRecord {

    @XmlElement(name = "TXDATE")
    protected String txdate;
    @XmlElement(name = "GIFTNAME")
    protected String giftname;
    @XmlElement(name = "GIFTIMG")
    protected String giftimg;
    @XmlElement(name = "BONUS", required = true)
    protected BigDecimal bonus;
    @XmlElement(name = "QTY", required = true)
    protected BigDecimal qty;

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
     * 获取giftname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGIFTNAME() {
        return giftname;
    }

    /**
     * 设置giftname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGIFTNAME(String value) {
        this.giftname = value;
    }

    /**
     * 获取giftimg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGIFTIMG() {
        return giftimg;
    }

    /**
     * 设置giftimg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGIFTIMG(String value) {
        this.giftimg = value;
    }

    /**
     * 获取bonus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBONUS() {
        return bonus;
    }

    /**
     * 设置bonus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBONUS(BigDecimal value) {
        this.bonus = value;
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

}
