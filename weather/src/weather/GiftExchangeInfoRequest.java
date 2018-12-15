
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GiftExchangeInfoRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GiftExchangeInfoRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gift" type="{http://www.tech-trans.com.cn/}xf_vipgiftuseh" minOccurs="0"/>
 *         &lt;element name="items" type="{http://www.tech-trans.com.cn/}ArrayOfXf_vipgiftuseitem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GiftExchangeInfoRequest", propOrder = {
    "gift",
    "items"
})
public class GiftExchangeInfoRequest {

    protected XfVipgiftuseh gift;
    protected ArrayOfXfVipgiftuseitem items;

    /**
     * 获取gift属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XfVipgiftuseh }
     *     
     */
    public XfVipgiftuseh getGift() {
        return gift;
    }

    /**
     * 设置gift属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XfVipgiftuseh }
     *     
     */
    public void setGift(XfVipgiftuseh value) {
        this.gift = value;
    }

    /**
     * 获取items属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfXfVipgiftuseitem }
     *     
     */
    public ArrayOfXfVipgiftuseitem getItems() {
        return items;
    }

    /**
     * 设置items属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfXfVipgiftuseitem }
     *     
     */
    public void setItems(ArrayOfXfVipgiftuseitem value) {
        this.items = value;
    }

}
