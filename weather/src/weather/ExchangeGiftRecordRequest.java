
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ExchangeGiftRecordRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ExchangeGiftRecordRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VIPCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FRMTXDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOTXDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeGiftRecordRequest", propOrder = {
    "vipcode",
    "frmtxdate",
    "totxdate"
})
public class ExchangeGiftRecordRequest {

    @XmlElement(name = "VIPCODE")
    protected String vipcode;
    @XmlElement(name = "FRMTXDATE")
    protected String frmtxdate;
    @XmlElement(name = "TOTXDATE")
    protected String totxdate;

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
     * 获取frmtxdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFRMTXDATE() {
        return frmtxdate;
    }

    /**
     * 设置frmtxdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFRMTXDATE(String value) {
        this.frmtxdate = value;
    }

    /**
     * 获取totxdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTXDATE() {
        return totxdate;
    }

    /**
     * 设置totxdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTXDATE(String value) {
        this.totxdate = value;
    }

}
