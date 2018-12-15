
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CheckReturnGoodRespose complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CheckReturnGoodRespose">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://www.tech-trans.com.cn/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="currentbonus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="header" type="{http://www.tech-trans.com.cn/}State" minOccurs="0"/>
 *         &lt;element name="worse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckReturnGoodRespose", propOrder = {
    "extensionData",
    "currentbonus",
    "header",
    "worse"
})
public class CheckReturnGoodRespose {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    protected String currentbonus;
    protected State header;
    protected String worse;

    /**
     * 获取extensionData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExtensionDataObject }
     *     
     */
    public ExtensionDataObject getExtensionData() {
        return extensionData;
    }

    /**
     * 设置extensionData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionDataObject }
     *     
     */
    public void setExtensionData(ExtensionDataObject value) {
        this.extensionData = value;
    }

    /**
     * 获取currentbonus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentbonus() {
        return currentbonus;
    }

    /**
     * 设置currentbonus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentbonus(String value) {
        this.currentbonus = value;
    }

    /**
     * 获取header属性的值。
     * 
     * @return
     *     possible object is
     *     {@link State }
     *     
     */
    public State getHeader() {
        return header;
    }

    /**
     * 设置header属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link State }
     *     
     */
    public void setHeader(State value) {
        this.header = value;
    }

    /**
     * 获取worse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorse() {
        return worse;
    }

    /**
     * 设置worse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorse(String value) {
        this.worse = value;
    }

}
