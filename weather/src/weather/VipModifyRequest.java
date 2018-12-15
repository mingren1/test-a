
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VipModifyRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VipModifyRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vip" type="{http://www.tech-trans.com.cn/}xf_vip" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VipModifyRequest", propOrder = {
    "vip"
})
public class VipModifyRequest {

    protected XfVip vip;

    /**
     * 获取vip属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XfVip }
     *     
     */
    public XfVip getVip() {
        return vip;
    }

    /**
     * 设置vip属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XfVip }
     *     
     */
    public void setVip(XfVip value) {
        this.vip = value;
    }

}
