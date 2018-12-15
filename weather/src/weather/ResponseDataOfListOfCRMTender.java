
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ResponseDataOfListOfCRMTender complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ResponseDataOfListOfCRMTender">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{http://www.tech-trans.com.cn/}ResponseHeader" minOccurs="0"/>
 *         &lt;element name="DATA" type="{http://www.tech-trans.com.cn/}ArrayOfCRMTender" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseDataOfListOfCRMTender", propOrder = {
    "header",
    "data"
})
public class ResponseDataOfListOfCRMTender {

    @XmlElement(name = "Header")
    protected ResponseHeader header;
    @XmlElement(name = "DATA")
    protected ArrayOfCRMTender data;

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
     *     {@link ArrayOfCRMTender }
     *     
     */
    public ArrayOfCRMTender getDATA() {
        return data;
    }

    /**
     * 设置data属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCRMTender }
     *     
     */
    public void setDATA(ArrayOfCRMTender value) {
        this.data = value;
    }

}
