
package weather;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfTxsalesitem complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTxsalesitem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="txsalesitem" type="{http://www.tech-trans.com.cn/}txsalesitem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTxsalesitem", propOrder = {
    "txsalesitem"
})
public class ArrayOfTxsalesitem {

    @XmlElement(nillable = true)
    protected List<Txsalesitem> txsalesitem;

    /**
     * Gets the value of the txsalesitem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txsalesitem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxsalesitem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Txsalesitem }
     * 
     * 
     */
    public List<Txsalesitem> getTxsalesitem() {
        if (txsalesitem == null) {
            txsalesitem = new ArrayList<Txsalesitem>();
        }
        return this.txsalesitem;
    }

}
