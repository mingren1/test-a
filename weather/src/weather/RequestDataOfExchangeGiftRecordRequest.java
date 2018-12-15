
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RequestDataOfExchangeGiftRecordRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RequestDataOfExchangeGiftRecordRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{http://www.tech-trans.com.cn/}RequestHeader" minOccurs="0"/>
 *         &lt;element name="Data" type="{http://www.tech-trans.com.cn/}ExchangeGiftRecordRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestDataOfExchangeGiftRecordRequest", propOrder = {
    "header",
    "data"
})
public class RequestDataOfExchangeGiftRecordRequest {

    @XmlElement(name = "Header")
    protected RequestHeader header;
    @XmlElement(name = "Data")
    protected ExchangeGiftRecordRequest data;

    /**
     * 获取header属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RequestHeader }
     *     
     */
    public RequestHeader getHeader() {
        return header;
    }

    /**
     * 设置header属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHeader }
     *     
     */
    public void setHeader(RequestHeader value) {
        this.header = value;
    }

    /**
     * 获取data属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExchangeGiftRecordRequest }
     *     
     */
    public ExchangeGiftRecordRequest getData() {
        return data;
    }

    /**
     * 设置data属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeGiftRecordRequest }
     *     
     */
    public void setData(ExchangeGiftRecordRequest value) {
        this.data = value;
    }

}
