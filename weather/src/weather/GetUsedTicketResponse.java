
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
 *         &lt;element name="GetUsedTicketResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfListOfCRMTICKET" minOccurs="0"/>
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
    "getUsedTicketResult"
})
@XmlRootElement(name = "GetUsedTicketResponse")
public class GetUsedTicketResponse {

    @XmlElement(name = "GetUsedTicketResult")
    protected ResponseDataOfListOfCRMTICKET getUsedTicketResult;

    /**
     * 获取getUsedTicketResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfListOfCRMTICKET }
     *     
     */
    public ResponseDataOfListOfCRMTICKET getGetUsedTicketResult() {
        return getUsedTicketResult;
    }

    /**
     * 设置getUsedTicketResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfListOfCRMTICKET }
     *     
     */
    public void setGetUsedTicketResult(ResponseDataOfListOfCRMTICKET value) {
        this.getUsedTicketResult = value;
    }

}
