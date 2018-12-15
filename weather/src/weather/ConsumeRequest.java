
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ConsumeRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ConsumeRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="salestotal" type="{http://www.tech-trans.com.cn/}txsalestotal" minOccurs="0"/>
 *         &lt;element name="tender" type="{http://www.tech-trans.com.cn/}ArrayOfTxsalestender" minOccurs="0"/>
 *         &lt;element name="items" type="{http://www.tech-trans.com.cn/}ArrayOfTxsalesitem" minOccurs="0"/>
 *         &lt;element name="isvip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumeRequest", propOrder = {
    "salestotal",
    "tender",
    "items",
    "isvip"
})
public class ConsumeRequest {

    protected Txsalestotal salestotal;
    protected ArrayOfTxsalestender tender;
    protected ArrayOfTxsalesitem items;
    protected String isvip;

    /**
     * 获取salestotal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Txsalestotal }
     *     
     */
    public Txsalestotal getSalestotal() {
        return salestotal;
    }

    /**
     * 设置salestotal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Txsalestotal }
     *     
     */
    public void setSalestotal(Txsalestotal value) {
        this.salestotal = value;
    }

    /**
     * 获取tender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTxsalestender }
     *     
     */
    public ArrayOfTxsalestender getTender() {
        return tender;
    }

    /**
     * 设置tender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTxsalestender }
     *     
     */
    public void setTender(ArrayOfTxsalestender value) {
        this.tender = value;
    }

    /**
     * 获取items属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTxsalesitem }
     *     
     */
    public ArrayOfTxsalesitem getItems() {
        return items;
    }

    /**
     * 设置items属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTxsalesitem }
     *     
     */
    public void setItems(ArrayOfTxsalesitem value) {
        this.items = value;
    }

    /**
     * 获取isvip属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsvip() {
        return isvip;
    }

    /**
     * 设置isvip属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsvip(String value) {
        this.isvip = value;
    }

}
