
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GradeInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GradeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vipgrade" type="{http://www.tech-trans.com.cn/}ArrayOfCombo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GradeInfo", propOrder = {
    "vipgrade"
})
public class GradeInfo {

    protected ArrayOfCombo vipgrade;

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

}
