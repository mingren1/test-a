
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CRMPayResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "crmPayResult"
})
@XmlRootElement(name = "CRMPayResponse")
public class CRMPayResponse {

    @XmlElement(name = "CRMPayResult")
    protected ResponseDataOfString crmPayResult;

    /**
     * 获取crmPayResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfString }
     *     
     */
    public ResponseDataOfString getCRMPayResult() {
        return crmPayResult;
    }

    /**
     * 设置crmPayResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfString }
     *     
     */
    public void setCRMPayResult(ResponseDataOfString value) {
        this.crmPayResult = value;
    }

}
