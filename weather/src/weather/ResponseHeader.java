
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ResponseHeader complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ResponseHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ERRCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ERRMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REQDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REQTIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseHeader", propOrder = {
    "errcode",
    "errmsg",
    "reqdate",
    "reqtime"
})
public class ResponseHeader {

    @XmlElement(name = "ERRCODE")
    protected String errcode;
    @XmlElement(name = "ERRMSG")
    protected String errmsg;
    @XmlElement(name = "REQDATE")
    protected String reqdate;
    @XmlElement(name = "REQTIME")
    protected String reqtime;

    /**
     * 获取errcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERRCODE() {
        return errcode;
    }

    /**
     * 设置errcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERRCODE(String value) {
        this.errcode = value;
    }

    /**
     * 获取errmsg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERRMSG() {
        return errmsg;
    }

    /**
     * 设置errmsg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERRMSG(String value) {
        this.errmsg = value;
    }

    /**
     * 获取reqdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREQDATE() {
        return reqdate;
    }

    /**
     * 设置reqdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREQDATE(String value) {
        this.reqdate = value;
    }

    /**
     * 获取reqtime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREQTIME() {
        return reqtime;
    }

    /**
     * 设置reqtime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREQTIME(String value) {
        this.reqtime = value;
    }

}
