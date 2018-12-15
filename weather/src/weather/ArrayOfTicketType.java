
package weather;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfTicketType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTicketType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TicketType" type="{http://www.tech-trans.com.cn/}TicketType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTicketType", propOrder = {
    "ticketType"
})
public class ArrayOfTicketType {

    @XmlElement(name = "TicketType", nillable = true)
    protected List<TicketType> ticketType;

    /**
     * Gets the value of the ticketType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketType }
     * 
     * 
     */
    public List<TicketType> getTicketType() {
        if (ticketType == null) {
            ticketType = new ArrayList<TicketType>();
        }
        return this.ticketType;
    }

}
