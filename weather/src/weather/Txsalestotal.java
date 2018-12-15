
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>txsalestotal complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="txsalestotal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://www.tech-trans.com.cn/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="dec_changeamount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dec_discountamount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dec_netamount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dec_netqty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dec_originalamount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dec_paidamount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dec_sellingamount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dec_taxamount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dt_reftxdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dt_txdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="i_numofitem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="i_numoftender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="i_purchasedependent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_cashier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_clientcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_defaulttender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_demographiccode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_demographicdata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_discountapprove" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_docno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_extendparam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_purchasestaffcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_refdocno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_refstorecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_reftillid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_salesman" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_storecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_tillid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_vipcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "txsalestotal", propOrder = {
    "extensionData",
    "decChangeamount",
    "decDiscountamount",
    "decNetamount",
    "decNetqty",
    "decOriginalamount",
    "decPaidamount",
    "decSellingamount",
    "decTaxamount",
    "dtReftxdate",
    "dtTxdate",
    "iNumofitem",
    "iNumoftender",
    "iPurchasedependent",
    "sCashier",
    "sClientcode",
    "sDefaulttender",
    "sDemographiccode",
    "sDemographicdata",
    "sDiscountapprove",
    "sDocno",
    "sExtendparam",
    "sPurchasestaffcode",
    "sRefdocno",
    "sRefstorecode",
    "sReftillid",
    "sSalesman",
    "sStorecode",
    "sTillid",
    "sVipcode"
})
public class Txsalestotal {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "dec_changeamount")
    protected String decChangeamount;
    @XmlElement(name = "dec_discountamount")
    protected String decDiscountamount;
    @XmlElement(name = "dec_netamount")
    protected String decNetamount;
    @XmlElement(name = "dec_netqty")
    protected String decNetqty;
    @XmlElement(name = "dec_originalamount")
    protected String decOriginalamount;
    @XmlElement(name = "dec_paidamount")
    protected String decPaidamount;
    @XmlElement(name = "dec_sellingamount")
    protected String decSellingamount;
    @XmlElement(name = "dec_taxamount")
    protected String decTaxamount;
    @XmlElement(name = "dt_reftxdate")
    protected String dtReftxdate;
    @XmlElement(name = "dt_txdate")
    protected String dtTxdate;
    @XmlElement(name = "i_numofitem")
    protected String iNumofitem;
    @XmlElement(name = "i_numoftender")
    protected String iNumoftender;
    @XmlElement(name = "i_purchasedependent")
    protected String iPurchasedependent;
    @XmlElement(name = "s_cashier")
    protected String sCashier;
    @XmlElement(name = "s_clientcode")
    protected String sClientcode;
    @XmlElement(name = "s_defaulttender")
    protected String sDefaulttender;
    @XmlElement(name = "s_demographiccode")
    protected String sDemographiccode;
    @XmlElement(name = "s_demographicdata")
    protected String sDemographicdata;
    @XmlElement(name = "s_discountapprove")
    protected String sDiscountapprove;
    @XmlElement(name = "s_docno")
    protected String sDocno;
    @XmlElement(name = "s_extendparam")
    protected String sExtendparam;
    @XmlElement(name = "s_purchasestaffcode")
    protected String sPurchasestaffcode;
    @XmlElement(name = "s_refdocno")
    protected String sRefdocno;
    @XmlElement(name = "s_refstorecode")
    protected String sRefstorecode;
    @XmlElement(name = "s_reftillid")
    protected String sReftillid;
    @XmlElement(name = "s_salesman")
    protected String sSalesman;
    @XmlElement(name = "s_storecode")
    protected String sStorecode;
    @XmlElement(name = "s_tillid")
    protected String sTillid;
    @XmlElement(name = "s_vipcode")
    protected String sVipcode;

    /**
     * 获取extensionData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExtensionDataObject }
     *     
     */
    public ExtensionDataObject getExtensionData() {
        return extensionData;
    }

    /**
     * 设置extensionData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionDataObject }
     *     
     */
    public void setExtensionData(ExtensionDataObject value) {
        this.extensionData = value;
    }

    /**
     * 获取decChangeamount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecChangeamount() {
        return decChangeamount;
    }

    /**
     * 设置decChangeamount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecChangeamount(String value) {
        this.decChangeamount = value;
    }

    /**
     * 获取decDiscountamount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecDiscountamount() {
        return decDiscountamount;
    }

    /**
     * 设置decDiscountamount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecDiscountamount(String value) {
        this.decDiscountamount = value;
    }

    /**
     * 获取decNetamount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecNetamount() {
        return decNetamount;
    }

    /**
     * 设置decNetamount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecNetamount(String value) {
        this.decNetamount = value;
    }

    /**
     * 获取decNetqty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecNetqty() {
        return decNetqty;
    }

    /**
     * 设置decNetqty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecNetqty(String value) {
        this.decNetqty = value;
    }

    /**
     * 获取decOriginalamount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecOriginalamount() {
        return decOriginalamount;
    }

    /**
     * 设置decOriginalamount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecOriginalamount(String value) {
        this.decOriginalamount = value;
    }

    /**
     * 获取decPaidamount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecPaidamount() {
        return decPaidamount;
    }

    /**
     * 设置decPaidamount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecPaidamount(String value) {
        this.decPaidamount = value;
    }

    /**
     * 获取decSellingamount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecSellingamount() {
        return decSellingamount;
    }

    /**
     * 设置decSellingamount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecSellingamount(String value) {
        this.decSellingamount = value;
    }

    /**
     * 获取decTaxamount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecTaxamount() {
        return decTaxamount;
    }

    /**
     * 设置decTaxamount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecTaxamount(String value) {
        this.decTaxamount = value;
    }

    /**
     * 获取dtReftxdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtReftxdate() {
        return dtReftxdate;
    }

    /**
     * 设置dtReftxdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtReftxdate(String value) {
        this.dtReftxdate = value;
    }

    /**
     * 获取dtTxdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtTxdate() {
        return dtTxdate;
    }

    /**
     * 设置dtTxdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtTxdate(String value) {
        this.dtTxdate = value;
    }

    /**
     * 获取iNumofitem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINumofitem() {
        return iNumofitem;
    }

    /**
     * 设置iNumofitem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINumofitem(String value) {
        this.iNumofitem = value;
    }

    /**
     * 获取iNumoftender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINumoftender() {
        return iNumoftender;
    }

    /**
     * 设置iNumoftender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINumoftender(String value) {
        this.iNumoftender = value;
    }

    /**
     * 获取iPurchasedependent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPurchasedependent() {
        return iPurchasedependent;
    }

    /**
     * 设置iPurchasedependent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPurchasedependent(String value) {
        this.iPurchasedependent = value;
    }

    /**
     * 获取sCashier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCashier() {
        return sCashier;
    }

    /**
     * 设置sCashier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCashier(String value) {
        this.sCashier = value;
    }

    /**
     * 获取sClientcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSClientcode() {
        return sClientcode;
    }

    /**
     * 设置sClientcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSClientcode(String value) {
        this.sClientcode = value;
    }

    /**
     * 获取sDefaulttender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDefaulttender() {
        return sDefaulttender;
    }

    /**
     * 设置sDefaulttender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDefaulttender(String value) {
        this.sDefaulttender = value;
    }

    /**
     * 获取sDemographiccode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDemographiccode() {
        return sDemographiccode;
    }

    /**
     * 设置sDemographiccode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDemographiccode(String value) {
        this.sDemographiccode = value;
    }

    /**
     * 获取sDemographicdata属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDemographicdata() {
        return sDemographicdata;
    }

    /**
     * 设置sDemographicdata属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDemographicdata(String value) {
        this.sDemographicdata = value;
    }

    /**
     * 获取sDiscountapprove属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDiscountapprove() {
        return sDiscountapprove;
    }

    /**
     * 设置sDiscountapprove属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDiscountapprove(String value) {
        this.sDiscountapprove = value;
    }

    /**
     * 获取sDocno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDocno() {
        return sDocno;
    }

    /**
     * 设置sDocno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDocno(String value) {
        this.sDocno = value;
    }

    /**
     * 获取sExtendparam属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSExtendparam() {
        return sExtendparam;
    }

    /**
     * 设置sExtendparam属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSExtendparam(String value) {
        this.sExtendparam = value;
    }

    /**
     * 获取sPurchasestaffcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPurchasestaffcode() {
        return sPurchasestaffcode;
    }

    /**
     * 设置sPurchasestaffcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPurchasestaffcode(String value) {
        this.sPurchasestaffcode = value;
    }

    /**
     * 获取sRefdocno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRefdocno() {
        return sRefdocno;
    }

    /**
     * 设置sRefdocno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRefdocno(String value) {
        this.sRefdocno = value;
    }

    /**
     * 获取sRefstorecode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRefstorecode() {
        return sRefstorecode;
    }

    /**
     * 设置sRefstorecode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRefstorecode(String value) {
        this.sRefstorecode = value;
    }

    /**
     * 获取sReftillid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSReftillid() {
        return sReftillid;
    }

    /**
     * 设置sReftillid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSReftillid(String value) {
        this.sReftillid = value;
    }

    /**
     * 获取sSalesman属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSalesman() {
        return sSalesman;
    }

    /**
     * 设置sSalesman属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSalesman(String value) {
        this.sSalesman = value;
    }

    /**
     * 获取sStorecode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSStorecode() {
        return sStorecode;
    }

    /**
     * 设置sStorecode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSStorecode(String value) {
        this.sStorecode = value;
    }

    /**
     * 获取sTillid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTillid() {
        return sTillid;
    }

    /**
     * 设置sTillid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTillid(String value) {
        this.sTillid = value;
    }

    /**
     * 获取sVipcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSVipcode() {
        return sVipcode;
    }

    /**
     * 设置sVipcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSVipcode(String value) {
        this.sVipcode = value;
    }

}
