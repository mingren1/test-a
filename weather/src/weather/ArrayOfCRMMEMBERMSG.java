
package weather;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfCRM_MEMBERMSG complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCRM_MEMBERMSG">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CRM_MEMBERMSG" type="{http://www.tech-trans.com.cn/}CRM_MEMBERMSG" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCRM_MEMBERMSG", propOrder = {
    "crmmembermsg"
})
public class ArrayOfCRMMEMBERMSG {

    @XmlElement(name = "CRM_MEMBERMSG", nillable = true)
    protected List<CRMMEMBERMSG> crmmembermsg;

    /**
     * Gets the value of the crmmembermsg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crmmembermsg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCRMMEMBERMSG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CRMMEMBERMSG }
     * 
     * 
     */
    public List<CRMMEMBERMSG> getCRMMEMBERMSG() {
        if (crmmembermsg == null) {
            crmmembermsg = new ArrayList<CRMMEMBERMSG>();
        }
        return this.crmmembermsg;
    }

}
