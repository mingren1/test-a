
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ResponseDataOfListOfEB_INFORMATION complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ResponseDataOfListOfEB_INFORMATION">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{http://www.tech-trans.com.cn/}ResponseHeader" minOccurs="0"/>
 *         &lt;element name="DATA" type="{http://www.tech-trans.com.cn/}ArrayOfEB_INFORMATION" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseDataOfListOfEB_INFORMATION", propOrder = {
    "header",
    "data"
})
public class ResponseDataOfListOfEBINFORMATION {

    @XmlElement(name = "Header")
    protected ResponseHeader header;
    @XmlElement(name = "DATA")
    protected ArrayOfEBINFORMATION data;

    /**
     * 获取header属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseHeader }
     *     
     */
    public ResponseHeader getHeader() {
        return header;
    }

    /**
     * 设置header属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseHeader }
     *     
     */
    public void setHeader(ResponseHeader value) {
        this.header = value;
    }

    /**
     * 获取data属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEBINFORMATION }
     *     
     */
    public ArrayOfEBINFORMATION getDATA() {
        return data;
    }

    /**
     * 设置data属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEBINFORMATION }
     *     
     */
    public void setDATA(ArrayOfEBINFORMATION value) {
        this.data = value;
    }

}
