
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TrfOutModel complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TrfOutModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://www.tech-trans.com.cn/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="tods" type="{http://www.tech-trans.com.cn/}ArrayOfTOItemModel" minOccurs="0"/>
 *         &lt;element name="toh" type="{http://www.tech-trans.com.cn/}TOModel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrfOutModel", propOrder = {
    "extensionData",
    "tods",
    "toh"
})
public class TrfOutModel {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    protected ArrayOfTOItemModel tods;
    protected TOModel toh;

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
     * 获取tods属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTOItemModel }
     *     
     */
    public ArrayOfTOItemModel getTods() {
        return tods;
    }

    /**
     * 设置tods属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTOItemModel }
     *     
     */
    public void setTods(ArrayOfTOItemModel value) {
        this.tods = value;
    }

    /**
     * 获取toh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TOModel }
     *     
     */
    public TOModel getToh() {
        return toh;
    }

    /**
     * 设置toh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TOModel }
     *     
     */
    public void setToh(TOModel value) {
        this.toh = value;
    }

}
