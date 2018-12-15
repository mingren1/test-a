
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
 *         &lt;element name="GetTicketByTypeCodeResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfTicketType" minOccurs="0"/>
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
    "getTicketByTypeCodeResult"
})
@XmlRootElement(name = "GetTicketByTypeCodeResponse")
public class GetTicketByTypeCodeResponse {

    @XmlElement(name = "GetTicketByTypeCodeResult")
    protected ResponseDataOfTicketType getTicketByTypeCodeResult;

    /**
     * 获取getTicketByTypeCodeResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfTicketType }
     *     
     */
    public ResponseDataOfTicketType getGetTicketByTypeCodeResult() {
        return getTicketByTypeCodeResult;
    }

    /**
     * 设置getTicketByTypeCodeResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfTicketType }
     *     
     */
    public void setGetTicketByTypeCodeResult(ResponseDataOfTicketType value) {
        this.getTicketByTypeCodeResult = value;
    }

}
