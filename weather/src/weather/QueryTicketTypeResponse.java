
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
 *         &lt;element name="QueryTicketTypeResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfListOfTicketType" minOccurs="0"/>
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
    "queryTicketTypeResult"
})
@XmlRootElement(name = "QueryTicketTypeResponse")
public class QueryTicketTypeResponse {

    @XmlElement(name = "QueryTicketTypeResult")
    protected ResponseDataOfListOfTicketType queryTicketTypeResult;

    /**
     * 获取queryTicketTypeResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfListOfTicketType }
     *     
     */
    public ResponseDataOfListOfTicketType getQueryTicketTypeResult() {
        return queryTicketTypeResult;
    }

    /**
     * 设置queryTicketTypeResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfListOfTicketType }
     *     
     */
    public void setQueryTicketTypeResult(ResponseDataOfListOfTicketType value) {
        this.queryTicketTypeResult = value;
    }

}
