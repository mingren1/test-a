
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
 *         &lt;element name="GetVipDisResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfListOfVIP" minOccurs="0"/>
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
    "getVipDisResult"
})
@XmlRootElement(name = "GetVipDisResponse")
public class GetVipDisResponse {

    @XmlElement(name = "GetVipDisResult")
    protected ResponseDataOfListOfVIP getVipDisResult;

    /**
     * 获取getVipDisResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfListOfVIP }
     *     
     */
    public ResponseDataOfListOfVIP getGetVipDisResult() {
        return getVipDisResult;
    }

    /**
     * 设置getVipDisResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfListOfVIP }
     *     
     */
    public void setGetVipDisResult(ResponseDataOfListOfVIP value) {
        this.getVipDisResult = value;
    }

}
