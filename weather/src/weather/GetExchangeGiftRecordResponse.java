
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
 *         &lt;element name="GetExchangeGiftRecordResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfArrayOfExchangeGiftRecord" minOccurs="0"/>
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
    "getExchangeGiftRecordResult"
})
@XmlRootElement(name = "GetExchangeGiftRecordResponse")
public class GetExchangeGiftRecordResponse {

    @XmlElement(name = "GetExchangeGiftRecordResult")
    protected ResponseDataOfArrayOfExchangeGiftRecord getExchangeGiftRecordResult;

    /**
     * 获取getExchangeGiftRecordResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfArrayOfExchangeGiftRecord }
     *     
     */
    public ResponseDataOfArrayOfExchangeGiftRecord getGetExchangeGiftRecordResult() {
        return getExchangeGiftRecordResult;
    }

    /**
     * 设置getExchangeGiftRecordResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfArrayOfExchangeGiftRecord }
     *     
     */
    public void setGetExchangeGiftRecordResult(ResponseDataOfArrayOfExchangeGiftRecord value) {
        this.getExchangeGiftRecordResult = value;
    }

}
