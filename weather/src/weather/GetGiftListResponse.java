
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
 *         &lt;element name="GetGiftListResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfGiftListInfo" minOccurs="0"/>
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
    "getGiftListResult"
})
@XmlRootElement(name = "GetGiftListResponse")
public class GetGiftListResponse {

    @XmlElement(name = "GetGiftListResult")
    protected ResponseDataOfGiftListInfo getGiftListResult;

    /**
     * 获取getGiftListResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfGiftListInfo }
     *     
     */
    public ResponseDataOfGiftListInfo getGetGiftListResult() {
        return getGiftListResult;
    }

    /**
     * 设置getGiftListResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfGiftListInfo }
     *     
     */
    public void setGetGiftListResult(ResponseDataOfGiftListInfo value) {
        this.getGiftListResult = value;
    }

}
