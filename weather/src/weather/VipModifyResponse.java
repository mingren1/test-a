
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
 *         &lt;element name="VipModifyResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfEmptyResponeData" minOccurs="0"/>
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
    "vipModifyResult"
})
@XmlRootElement(name = "VipModifyResponse")
public class VipModifyResponse {

    @XmlElement(name = "VipModifyResult")
    protected ResponseDataOfEmptyResponeData vipModifyResult;

    /**
     * 获取vipModifyResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfEmptyResponeData }
     *     
     */
    public ResponseDataOfEmptyResponeData getVipModifyResult() {
        return vipModifyResult;
    }

    /**
     * 设置vipModifyResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfEmptyResponeData }
     *     
     */
    public void setVipModifyResult(ResponseDataOfEmptyResponeData value) {
        this.vipModifyResult = value;
    }

}
