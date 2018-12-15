
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
 *         &lt;element name="GetVipInfoResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfListOfVIP" minOccurs="0"/>
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
    "getVipInfoResult"
})
@XmlRootElement(name = "GetVipInfoResponse")
public class GetVipInfoResponse {

    @XmlElement(name = "GetVipInfoResult")
    protected ResponseDataOfListOfVIP getVipInfoResult;

    /**
     * 获取getVipInfoResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfListOfVIP }
     *     
     */
    public ResponseDataOfListOfVIP getGetVipInfoResult() {
        return getVipInfoResult;
    }

    /**
     * 设置getVipInfoResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfListOfVIP }
     *     
     */
    public void setGetVipInfoResult(ResponseDataOfListOfVIP value) {
        this.getVipInfoResult = value;
    }

}
