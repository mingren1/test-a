
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
 *         &lt;element name="ConsumeResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfBonusInfo" minOccurs="0"/>
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
    "consumeResult"
})
@XmlRootElement(name = "ConsumeResponse")
public class ConsumeResponse {

    @XmlElement(name = "ConsumeResult")
    protected ResponseDataOfBonusInfo consumeResult;

    /**
     * 获取consumeResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfBonusInfo }
     *     
     */
    public ResponseDataOfBonusInfo getConsumeResult() {
        return consumeResult;
    }

    /**
     * 设置consumeResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfBonusInfo }
     *     
     */
    public void setConsumeResult(ResponseDataOfBonusInfo value) {
        this.consumeResult = value;
    }

}
