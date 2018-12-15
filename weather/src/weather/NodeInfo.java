
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NodeInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="NodeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://www.tech-trans.com.cn/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="l_child" type="{http://www.tech-trans.com.cn/}ArrayOfNodeInfo" minOccurs="0"/>
 *         &lt;element name="l_info" type="{http://www.tech-trans.com.cn/}ArrayOfEB_INFORMATION" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeInfo", propOrder = {
    "extensionData",
    "code",
    "desc",
    "lChild",
    "lInfo"
})
public class NodeInfo {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    protected String code;
    protected String desc;
    @XmlElement(name = "l_child")
    protected ArrayOfNodeInfo lChild;
    @XmlElement(name = "l_info")
    protected ArrayOfEBINFORMATION lInfo;

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
     * 获取code属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置code属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * 获取desc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置desc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * 获取lChild属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNodeInfo }
     *     
     */
    public ArrayOfNodeInfo getLChild() {
        return lChild;
    }

    /**
     * 设置lChild属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNodeInfo }
     *     
     */
    public void setLChild(ArrayOfNodeInfo value) {
        this.lChild = value;
    }

    /**
     * 获取lInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEBINFORMATION }
     *     
     */
    public ArrayOfEBINFORMATION getLInfo() {
        return lInfo;
    }

    /**
     * 设置lInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEBINFORMATION }
     *     
     */
    public void setLInfo(ArrayOfEBINFORMATION value) {
        this.lInfo = value;
    }

}
