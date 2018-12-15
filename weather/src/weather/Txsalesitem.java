
package weather;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>txsalesitem complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="txsalesitem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://www.tech-trans.com.cn/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="dec_discountamount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dec_exstk2sales" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dec_netamount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dec_originalprice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dec_promotionless" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dec_promotionuseqty" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dec_qty" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dec_taxamount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dec_totaldiscountless" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="s_cashier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_clientcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_colorcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_couponnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_demographiccode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_demographicdata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_discountapprove" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_extendparam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_isdeposit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_isnewitem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_ispricealternate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_ispriceoverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_iswholesale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_itemlotnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_plucode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_priceapprove" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_promotionid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_salesitemremark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_salesman" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s_sizecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "txsalesitem", propOrder = {
    "extensionData",
    "decDiscountamount",
    "decExstk2Sales",
    "decNetamount",
    "decOriginalprice",
    "decPromotionless",
    "decPromotionuseqty",
    "decQty",
    "decTaxamount",
    "decTotaldiscountless",
    "sCashier",
    "sClientcode",
    "sColorcode",
    "sCouponnumber",
    "sDemographiccode",
    "sDemographicdata",
    "sDiscountapprove",
    "sExtendparam",
    "sIsdeposit",
    "sIsnewitem",
    "sIspricealternate",
    "sIspriceoverride",
    "sIswholesale",
    "sItemlotnum",
    "sPlucode",
    "sPriceapprove",
    "sPromotionid",
    "sSalesitemremark",
    "sSalesman",
    "sSizecode"
})
public class Txsalesitem {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "dec_discountamount", required = true)
    protected BigDecimal decDiscountamount;
    @XmlElement(name = "dec_exstk2sales", required = true)
    protected BigDecimal decExstk2Sales;
    @XmlElement(name = "dec_netamount", required = true)
    protected BigDecimal decNetamount;
    @XmlElement(name = "dec_originalprice", required = true)
    protected BigDecimal decOriginalprice;
    @XmlElement(name = "dec_promotionless", required = true)
    protected BigDecimal decPromotionless;
    @XmlElement(name = "dec_promotionuseqty", required = true)
    protected BigDecimal decPromotionuseqty;
    @XmlElement(name = "dec_qty", required = true)
    protected BigDecimal decQty;
    @XmlElement(name = "dec_taxamount", required = true)
    protected BigDecimal decTaxamount;
    @XmlElement(name = "dec_totaldiscountless", required = true)
    protected BigDecimal decTotaldiscountless;
    @XmlElement(name = "s_cashier")
    protected String sCashier;
    @XmlElement(name = "s_clientcode")
    protected String sClientcode;
    @XmlElement(name = "s_colorcode")
    protected String sColorcode;
    @XmlElement(name = "s_couponnumber")
    protected String sCouponnumber;
    @XmlElement(name = "s_demographiccode")
    protected String sDemographiccode;
    @XmlElement(name = "s_demographicdata")
    protected String sDemographicdata;
    @XmlElement(name = "s_discountapprove")
    protected String sDiscountapprove;
    @XmlElement(name = "s_extendparam")
    protected String sExtendparam;
    @XmlElement(name = "s_isdeposit")
    protected String sIsdeposit;
    @XmlElement(name = "s_isnewitem")
    protected String sIsnewitem;
    @XmlElement(name = "s_ispricealternate")
    protected String sIspricealternate;
    @XmlElement(name = "s_ispriceoverride")
    protected String sIspriceoverride;
    @XmlElement(name = "s_iswholesale")
    protected String sIswholesale;
    @XmlElement(name = "s_itemlotnum")
    protected String sItemlotnum;
    @XmlElement(name = "s_plucode")
    protected String sPlucode;
    @XmlElement(name = "s_priceapprove")
    protected String sPriceapprove;
    @XmlElement(name = "s_promotionid")
    protected String sPromotionid;
    @XmlElement(name = "s_salesitemremark")
    protected String sSalesitemremark;
    @XmlElement(name = "s_salesman")
    protected String sSalesman;
    @XmlElement(name = "s_sizecode")
    protected String sSizecode;

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
     * 获取decDiscountamount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecDiscountamount() {
        return decDiscountamount;
    }

    /**
     * 设置decDiscountamount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecDiscountamount(BigDecimal value) {
        this.decDiscountamount = value;
    }

    /**
     * 获取decExstk2Sales属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecExstk2Sales() {
        return decExstk2Sales;
    }

    /**
     * 设置decExstk2Sales属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecExstk2Sales(BigDecimal value) {
        this.decExstk2Sales = value;
    }

    /**
     * 获取decNetamount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecNetamount() {
        return decNetamount;
    }

    /**
     * 设置decNetamount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecNetamount(BigDecimal value) {
        this.decNetamount = value;
    }

    /**
     * 获取decOriginalprice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecOriginalprice() {
        return decOriginalprice;
    }

    /**
     * 设置decOriginalprice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecOriginalprice(BigDecimal value) {
        this.decOriginalprice = value;
    }

    /**
     * 获取decPromotionless属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecPromotionless() {
        return decPromotionless;
    }

    /**
     * 设置decPromotionless属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecPromotionless(BigDecimal value) {
        this.decPromotionless = value;
    }

    /**
     * 获取decPromotionuseqty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecPromotionuseqty() {
        return decPromotionuseqty;
    }

    /**
     * 设置decPromotionuseqty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecPromotionuseqty(BigDecimal value) {
        this.decPromotionuseqty = value;
    }

    /**
     * 获取decQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecQty() {
        return decQty;
    }

    /**
     * 设置decQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecQty(BigDecimal value) {
        this.decQty = value;
    }

    /**
     * 获取decTaxamount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecTaxamount() {
        return decTaxamount;
    }

    /**
     * 设置decTaxamount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecTaxamount(BigDecimal value) {
        this.decTaxamount = value;
    }

    /**
     * 获取decTotaldiscountless属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecTotaldiscountless() {
        return decTotaldiscountless;
    }

    /**
     * 设置decTotaldiscountless属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecTotaldiscountless(BigDecimal value) {
        this.decTotaldiscountless = value;
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
     * 获取sColorcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSColorcode() {
        return sColorcode;
    }

    /**
     * 设置sColorcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSColorcode(String value) {
        this.sColorcode = value;
    }

    /**
     * 获取sCouponnumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCouponnumber() {
        return sCouponnumber;
    }

    /**
     * 设置sCouponnumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCouponnumber(String value) {
        this.sCouponnumber = value;
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
     * 获取sIsdeposit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIsdeposit() {
        return sIsdeposit;
    }

    /**
     * 设置sIsdeposit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIsdeposit(String value) {
        this.sIsdeposit = value;
    }

    /**
     * 获取sIsnewitem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIsnewitem() {
        return sIsnewitem;
    }

    /**
     * 设置sIsnewitem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIsnewitem(String value) {
        this.sIsnewitem = value;
    }

    /**
     * 获取sIspricealternate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIspricealternate() {
        return sIspricealternate;
    }

    /**
     * 设置sIspricealternate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIspricealternate(String value) {
        this.sIspricealternate = value;
    }

    /**
     * 获取sIspriceoverride属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIspriceoverride() {
        return sIspriceoverride;
    }

    /**
     * 设置sIspriceoverride属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIspriceoverride(String value) {
        this.sIspriceoverride = value;
    }

    /**
     * 获取sIswholesale属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIswholesale() {
        return sIswholesale;
    }

    /**
     * 设置sIswholesale属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIswholesale(String value) {
        this.sIswholesale = value;
    }

    /**
     * 获取sItemlotnum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSItemlotnum() {
        return sItemlotnum;
    }

    /**
     * 设置sItemlotnum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSItemlotnum(String value) {
        this.sItemlotnum = value;
    }

    /**
     * 获取sPlucode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPlucode() {
        return sPlucode;
    }

    /**
     * 设置sPlucode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPlucode(String value) {
        this.sPlucode = value;
    }

    /**
     * 获取sPriceapprove属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPriceapprove() {
        return sPriceapprove;
    }

    /**
     * 设置sPriceapprove属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPriceapprove(String value) {
        this.sPriceapprove = value;
    }

    /**
     * 获取sPromotionid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPromotionid() {
        return sPromotionid;
    }

    /**
     * 设置sPromotionid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPromotionid(String value) {
        this.sPromotionid = value;
    }

    /**
     * 获取sSalesitemremark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSalesitemremark() {
        return sSalesitemremark;
    }

    /**
     * 设置sSalesitemremark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSalesitemremark(String value) {
        this.sSalesitemremark = value;
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
     * 获取sSizecode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSizecode() {
        return sSizecode;
    }

    /**
     * 设置sSizecode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSizecode(String value) {
        this.sSizecode = value;
    }

}
