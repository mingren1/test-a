
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
 *         &lt;element name="UseCRMTicketResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfCRMTickReturn" minOccurs="0"/>
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
    "useCRMTicketResult"
})
@XmlRootElement(name = "UseCRMTicketResponse")
public class UseCRMTicketResponse {

    @XmlElement(name = "UseCRMTicketResult")
    protected ResponseDataOfCRMTickReturn useCRMTicketResult;

    /**
     * 获取useCRMTicketResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfCRMTickReturn }
     *     
     */
    public ResponseDataOfCRMTickReturn getUseCRMTicketResult() {
        return useCRMTicketResult;
    }

    /**
     * 设置useCRMTicketResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfCRMTickReturn }
     *     
     */
    public void setUseCRMTicketResult(ResponseDataOfCRMTickReturn value) {
        this.useCRMTicketResult = value;
    }

}
