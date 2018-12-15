
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="request" type="{http://www.tech-trans.com.cn/}RequestDataOfBaseVipInfoRequest" minOccurs="0"/>
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
    "request"
})
@XmlRootElement(name = "GetVipBaseInfoByMobile")
public class GetVipBaseInfoByMobile {

    protected RequestDataOfBaseVipInfoRequest request;

    /**
     * 获取request属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RequestDataOfBaseVipInfoRequest }
     *     
     */
    public RequestDataOfBaseVipInfoRequest getRequest() {
        return request;
    }

    /**
     * 设置request属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RequestDataOfBaseVipInfoRequest }
     *     
     */
    public void setRequest(RequestDataOfBaseVipInfoRequest value) {
        this.request = value;
    }

}
