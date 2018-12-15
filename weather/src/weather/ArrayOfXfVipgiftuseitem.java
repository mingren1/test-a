
package weather;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfXf_vipgiftuseitem complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfXf_vipgiftuseitem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xf_vipgiftuseitem" type="{http://www.tech-trans.com.cn/}xf_vipgiftuseitem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfXf_vipgiftuseitem", propOrder = {
    "xfVipgiftuseitem"
})
public class ArrayOfXfVipgiftuseitem {

    @XmlElement(name = "xf_vipgiftuseitem", nillable = true)
    protected List<XfVipgiftuseitem> xfVipgiftuseitem;

    /**
     * Gets the value of the xfVipgiftuseitem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xfVipgiftuseitem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXfVipgiftuseitem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XfVipgiftuseitem }
     * 
     * 
     */
    public List<XfVipgiftuseitem> getXfVipgiftuseitem() {
        if (xfVipgiftuseitem == null) {
            xfVipgiftuseitem = new ArrayList<XfVipgiftuseitem>();
        }
        return this.xfVipgiftuseitem;
    }

}
