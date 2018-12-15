
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
 *         &lt;element name="CheckVIP_PasswordResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfBoolean" minOccurs="0"/>
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
    "checkVIPPasswordResult"
})
@XmlRootElement(name = "CheckVIP_PasswordResponse")
public class CheckVIPPasswordResponse {

    @XmlElement(name = "CheckVIP_PasswordResult")
    protected ResponseDataOfBoolean checkVIPPasswordResult;

    /**
     * 获取checkVIPPasswordResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfBoolean }
     *     
     */
    public ResponseDataOfBoolean getCheckVIPPasswordResult() {
        return checkVIPPasswordResult;
    }

    /**
     * 设置checkVIPPasswordResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfBoolean }
     *     
     */
    public void setCheckVIPPasswordResult(ResponseDataOfBoolean value) {
        this.checkVIPPasswordResult = value;
    }

}
