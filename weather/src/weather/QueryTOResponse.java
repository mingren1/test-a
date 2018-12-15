
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
 *         &lt;element name="QueryTOResult" type="{http://www.tech-trans.com.cn/}ResponseDataOfTOresult" minOccurs="0"/>
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
    "queryTOResult"
})
@XmlRootElement(name = "QueryTOResponse")
public class QueryTOResponse {

    @XmlElement(name = "QueryTOResult")
    protected ResponseDataOfTOresult queryTOResult;

    /**
     * 获取queryTOResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResponseDataOfTOresult }
     *     
     */
    public ResponseDataOfTOresult getQueryTOResult() {
        return queryTOResult;
    }

    /**
     * 设置queryTOResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDataOfTOresult }
     *     
     */
    public void setQueryTOResult(ResponseDataOfTOresult value) {
        this.queryTOResult = value;
    }

}
