
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
 *         &lt;element name="GetNodeInfoResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfNodeInfo" minOccurs="0"/>
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
    "getNodeInfoResult"
})
@XmlRootElement(name = "GetNodeInfoResponse")
public class GetNodeInfoResponse {

    @XmlElement(name = "GetNodeInfoResult")
    protected ResponseDataOfNodeInfo getNodeInfoResult;

    /**
     * 获取getNodeInfoResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfNodeInfo }
     *     
     */
    public ResponseDataOfNodeInfo getGetNodeInfoResult() {
        return getNodeInfoResult;
    }

    /**
     * 设置getNodeInfoResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfNodeInfo }
     *     
     */
    public void setGetNodeInfoResult(ResponseDataOfNodeInfo value) {
        this.getNodeInfoResult = value;
    }

}
