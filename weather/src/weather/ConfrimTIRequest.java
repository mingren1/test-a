
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ConfrimTIRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ConfrimTIRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trfoutno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createby" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastmodifydate_yyyymmdd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastmodifydate_hhmmss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfrimTIRequest", propOrder = {
    "trfoutno",
    "storecode",
    "createby",
    "lastmodifydateYyyymmdd",
    "lastmodifydateHhmmss"
})
public class ConfrimTIRequest {

    protected String trfoutno;
    protected String storecode;
    protected String createby;
    @XmlElement(name = "lastmodifydate_yyyymmdd")
    protected String lastmodifydateYyyymmdd;
    @XmlElement(name = "lastmodifydate_hhmmss")
    protected String lastmodifydateHhmmss;

    /**
     * 获取trfoutno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfoutno() {
        return trfoutno;
    }

    /**
     * 设置trfoutno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrfoutno(String value) {
        this.trfoutno = value;
    }

    /**
     * 获取storecode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorecode() {
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
    public void setStorecode(String value) {
        this.storecode = value;
    }

    /**
     * 获取createby属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateby() {
        return createby;
    }

    /**
     * 设置createby属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateby(String value) {
        this.createby = value;
    }

    /**
     * 获取lastmodifydateYyyymmdd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastmodifydateYyyymmdd() {
        return lastmodifydateYyyymmdd;
    }

    /**
     * 设置lastmodifydateYyyymmdd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastmodifydateYyyymmdd(String value) {
        this.lastmodifydateYyyymmdd = value;
    }

    /**
     * 获取lastmodifydateHhmmss属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastmodifydateHhmmss() {
        return lastmodifydateHhmmss;
    }

    /**
     * 设置lastmodifydateHhmmss属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastmodifydateHhmmss(String value) {
        this.lastmodifydateHhmmss = value;
    }

}
