
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
 *         &lt;element name="GetVipSalseResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfVipSales" minOccurs="0"/>
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
    "getVipSalseResult"
})
@XmlRootElement(name = "GetVipSalseResponse")
public class GetVipSalseResponse {

    @XmlElement(name = "GetVipSalseResult")
    protected ResponseDataOfVipSales getVipSalseResult;

    /**
     * 获取getVipSalseResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfVipSales }
     *     
     */
    public ResponseDataOfVipSales getGetVipSalseResult() {
        return getVipSalseResult;
    }

    /**
     * 设置getVipSalseResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfVipSales }
     *     
     */
    public void setGetVipSalseResult(ResponseDataOfVipSales value) {
        this.getVipSalseResult = value;
    }

}
