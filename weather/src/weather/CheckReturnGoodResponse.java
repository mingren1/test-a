
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
 *         &lt;element name="CheckReturnGoodResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfCheckReturnGoodRespose" minOccurs="0"/>
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
    "checkReturnGoodResult"
})
@XmlRootElement(name = "CheckReturnGoodResponse")
public class CheckReturnGoodResponse {

    @XmlElement(name = "CheckReturnGoodResult")
    protected ResponseDataOfCheckReturnGoodRespose checkReturnGoodResult;

    /**
     * 获取checkReturnGoodResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfCheckReturnGoodRespose }
     *     
     */
    public ResponseDataOfCheckReturnGoodRespose getCheckReturnGoodResult() {
        return checkReturnGoodResult;
    }

    /**
     * 设置checkReturnGoodResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfCheckReturnGoodRespose }
     *     
     */
    public void setCheckReturnGoodResult(ResponseDataOfCheckReturnGoodRespose value) {
        this.checkReturnGoodResult = value;
    }

}
