
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
 *         &lt;element name="CRMRefundResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfString" minOccurs="0"/>
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
    "crmRefundResult"
})
@XmlRootElement(name = "CRMRefundResponse")
public class CRMRefundResponse {

    @XmlElement(name = "CRMRefundResult")
    protected ResponseDataOfString crmRefundResult;

    /**
     * 获取crmRefundResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfString }
     *     
     */
    public ResponseDataOfString getCRMRefundResult() {
        return crmRefundResult;
    }

    /**
     * 设置crmRefundResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfString }
     *     
     */
    public void setCRMRefundResult(ResponseDataOfString value) {
        this.crmRefundResult = value;
    }

}
