
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BasicInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BasicInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vipgrade" type="{http://www.tech-trans.com.cn/}ArrayOfCombo" minOccurs="0"/>
 *         &lt;element name="idcardtype" type="{http://www.tech-trans.com.cn/}ArrayOfCombo" minOccurs="0"/>
 *         &lt;element name="xf_vipcodeprefix" type="{http://www.tech-trans.com.cn/}ArrayOfCombo" minOccurs="0"/>
 *         &lt;element name="adjuest_cause" type="{http://www.tech-trans.com.cn/}ArrayOfCombo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicInfo", propOrder = {
    "vipgrade",
    "idcardtype",
    "xfVipcodeprefix",
    "adjuestCause"
})
public class BasicInfo {

    protected ArrayOfCombo vipgrade;
    protected ArrayOfCombo idcardtype;
    @XmlElement(name = "xf_vipcodeprefix")
    protected ArrayOfCombo xfVipcodeprefix;
    @XmlElement(name = "adjuest_cause")
    protected ArrayOfCombo adjuestCause;

    /**
     * 获取vipgrade属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCombo }
     *     
     */
    public ArrayOfCombo getVipgrade() {
        return vipgrade;
    }

    /**
     * 设置vipgrade属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCombo }
     *     
     */
    public void setVipgrade(ArrayOfCombo value) {
        this.vipgrade = value;
    }

    /**
     * 获取idcardtype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCombo }
     *     
     */
    public ArrayOfCombo getIdcardtype() {
        return idcardtype;
    }

    /**
     * 设置idcardtype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCombo }
     *     
     */
    public void setIdcardtype(ArrayOfCombo value) {
        this.idcardtype = value;
    }

    /**
     * 获取xfVipcodeprefix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCombo }
     *     
     */
    public ArrayOfCombo getXfVipcodeprefix() {
        return xfVipcodeprefix;
    }

    /**
     * 设置xfVipcodeprefix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCombo }
     *     
     */
    public void setXfVipcodeprefix(ArrayOfCombo value) {
        this.xfVipcodeprefix = value;
    }

    /**
     * 获取adjuestCause属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCombo }
     *     
     */
    public ArrayOfCombo getAdjuestCause() {
        return adjuestCause;
    }

    /**
     * 设置adjuestCause属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCombo }
     *     
     */
    public void setAdjuestCause(ArrayOfCombo value) {
        this.adjuestCause = value;
    }

}
