
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RequestDataOfActivitEnrollRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RequestDataOfActivitEnrollRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{http://www.tech-trans.com.cn/}RequestHeader" minOccurs="0"/>
 *         &lt;element name="Data" type="{http://www.tech-trans.com.cn/}ActivitEnrollRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestDataOfActivitEnrollRequest", propOrder = {
    "header",
    "data"
})
public class RequestDataOfActivitEnrollRequest {

    @XmlElement(name = "Header")
    protected RequestHeader header;
    @XmlElement(name = "Data")
    protected ActivitEnrollRequest data;

    /**
     * 获取header属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RequestHeader }
     *     
     */
    public RequestHeader getHeader() {
        return header;
    }

    /**
     * 设置header属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHeader }
     *     
     */
    public void setHeader(RequestHeader value) {
        this.header = value;
    }

    /**
     * 获取data属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ActivitEnrollRequest }
     *     
     */
    public ActivitEnrollRequest getData() {
        return data;
    }

    /**
     * 设置data属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ActivitEnrollRequest }
     *     
     */
    public void setData(ActivitEnrollRequest value) {
        this.data = value;
    }

}
