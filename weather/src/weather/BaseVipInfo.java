
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BaseVipInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BaseVipInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VIPCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GRADE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GRADEDESCI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MACADRESS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseVipInfo", propOrder = {
    "vipcode",
    "name",
    "grade",
    "gradedesci",
    "macadress"
})
public class BaseVipInfo {

    @XmlElement(name = "VIPCODE")
    protected String vipcode;
    @XmlElement(name = "NAME")
    protected String name;
    @XmlElement(name = "GRADE")
    protected String grade;
    @XmlElement(name = "GRADEDESCI")
    protected String gradedesci;
    @XmlElement(name = "MACADRESS")
    protected String macadress;

    /**
     * 获取vipcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIPCODE() {
        return vipcode;
    }

    /**
     * 设置vipcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIPCODE(String value) {
        this.vipcode = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * 获取grade属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRADE() {
        return grade;
    }

    /**
     * 设置grade属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRADE(String value) {
        this.grade = value;
    }

    /**
     * 获取gradedesci属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRADEDESCI() {
        return gradedesci;
    }

    /**
     * 设置gradedesci属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRADEDESCI(String value) {
        this.gradedesci = value;
    }

    /**
     * 获取macadress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMACADRESS() {
        return macadress;
    }

    /**
     * 设置macadress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMACADRESS(String value) {
        this.macadress = value;
    }

}
