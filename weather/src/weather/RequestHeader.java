
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RequestHeader complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RequestHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="REQDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REQTIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SIGN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestHeader", propOrder = {
    "reqdate",
    "reqtime",
    "sign",
    "user"
})
public class RequestHeader {

    @XmlElement(name = "REQDATE")
    protected String reqdate;
    @XmlElement(name = "REQTIME")
    protected String reqtime;
    @XmlElement(name = "SIGN")
    protected String sign;
    @XmlElement(name = "USER")
    protected String user;

    /**
     * 获取reqdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREQDATE() {
        return reqdate;
    }

    /**
     * 设置reqdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREQDATE(String value) {
        this.reqdate = value;
    }

    /**
     * 获取reqtime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREQTIME() {
        return reqtime;
    }

    /**
     * 设置reqtime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREQTIME(String value) {
        this.reqtime = value;
    }

    /**
     * 获取sign属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIGN() {
        return sign;
    }

    /**
     * 设置sign属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIGN(String value) {
        this.sign = value;
    }

    /**
     * 获取user属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSER() {
        return user;
    }

    /**
     * 设置user属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSER(String value) {
        this.user = value;
    }

}
