
package weather;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VIP complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VIP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://www.tech-trans.com.cn/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="xf_active" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_address3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_address4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_bankcardno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_birthdaydd" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="xf_birthdaymm" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="xf_birthdayyyyy" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="xf_bonus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_bonus2amt_examount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="xf_bonus2amt_exbonus" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="xf_defsalesman" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_discount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_dob" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_expirydate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_givenname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_grade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_groupid9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_idcardtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_issuedate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_issuestore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_jointdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_postal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_remarks1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_remarks2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_telephone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_vipcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_vipemail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_vipid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_weixin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VIP", propOrder = {
    "extensionData",
    "xfActive",
    "xfAddress1",
    "xfAddress2",
    "xfAddress3",
    "xfAddress4",
    "xfBankcardno",
    "xfBirthdaydd",
    "xfBirthdaymm",
    "xfBirthdayyyyy",
    "xfBonus",
    "xfBonus2AmtExamount",
    "xfBonus2AmtExbonus",
    "xfDefsalesman",
    "xfDiscount",
    "xfDob",
    "xfExpirydate",
    "xfGivenname",
    "xfGrade",
    "xfGroupid0",
    "xfGroupid1",
    "xfGroupid10",
    "xfGroupid11",
    "xfGroupid12",
    "xfGroupid13",
    "xfGroupid14",
    "xfGroupid15",
    "xfGroupid16",
    "xfGroupid17",
    "xfGroupid18",
    "xfGroupid19",
    "xfGroupid2",
    "xfGroupid3",
    "xfGroupid4",
    "xfGroupid5",
    "xfGroupid6",
    "xfGroupid7",
    "xfGroupid8",
    "xfGroupid9",
    "xfIdcardtype",
    "xfIssuedate",
    "xfIssuestore",
    "xfJointdate",
    "xfPostal",
    "xfRemarks1",
    "xfRemarks2",
    "xfSex",
    "xfSurname",
    "xfTelephone",
    "xfTelephone2",
    "xfVipcode",
    "xfVipemail",
    "xfVipid",
    "xfWeixin"
})
public class VIP {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "xf_active")
    protected String xfActive;
    @XmlElement(name = "xf_address1")
    protected String xfAddress1;
    @XmlElement(name = "xf_address2")
    protected String xfAddress2;
    @XmlElement(name = "xf_address3")
    protected String xfAddress3;
    @XmlElement(name = "xf_address4")
    protected String xfAddress4;
    @XmlElement(name = "xf_bankcardno")
    protected String xfBankcardno;
    @XmlElement(name = "xf_birthdaydd", required = true)
    protected BigDecimal xfBirthdaydd;
    @XmlElement(name = "xf_birthdaymm", required = true)
    protected BigDecimal xfBirthdaymm;
    @XmlElement(name = "xf_birthdayyyyy", required = true)
    protected BigDecimal xfBirthdayyyyy;
    @XmlElement(name = "xf_bonus")
    protected String xfBonus;
    @XmlElement(name = "xf_bonus2amt_examount", required = true)
    protected BigDecimal xfBonus2AmtExamount;
    @XmlElement(name = "xf_bonus2amt_exbonus", required = true)
    protected BigDecimal xfBonus2AmtExbonus;
    @XmlElement(name = "xf_defsalesman")
    protected String xfDefsalesman;
    @XmlElement(name = "xf_discount")
    protected String xfDiscount;
    @XmlElement(name = "xf_dob")
    protected String xfDob;
    @XmlElement(name = "xf_expirydate")
    protected String xfExpirydate;
    @XmlElement(name = "xf_givenname")
    protected String xfGivenname;
    @XmlElement(name = "xf_grade")
    protected String xfGrade;
    @XmlElement(name = "xf_groupid0")
    protected String xfGroupid0;
    @XmlElement(name = "xf_groupid1")
    protected String xfGroupid1;
    @XmlElement(name = "xf_groupid10")
    protected String xfGroupid10;
    @XmlElement(name = "xf_groupid11")
    protected String xfGroupid11;
    @XmlElement(name = "xf_groupid12")
    protected String xfGroupid12;
    @XmlElement(name = "xf_groupid13")
    protected String xfGroupid13;
    @XmlElement(name = "xf_groupid14")
    protected String xfGroupid14;
    @XmlElement(name = "xf_groupid15")
    protected String xfGroupid15;
    @XmlElement(name = "xf_groupid16")
    protected String xfGroupid16;
    @XmlElement(name = "xf_groupid17")
    protected String xfGroupid17;
    @XmlElement(name = "xf_groupid18")
    protected String xfGroupid18;
    @XmlElement(name = "xf_groupid19")
    protected String xfGroupid19;
    @XmlElement(name = "xf_groupid2")
    protected String xfGroupid2;
    @XmlElement(name = "xf_groupid3")
    protected String xfGroupid3;
    @XmlElement(name = "xf_groupid4")
    protected String xfGroupid4;
    @XmlElement(name = "xf_groupid5")
    protected String xfGroupid5;
    @XmlElement(name = "xf_groupid6")
    protected String xfGroupid6;
    @XmlElement(name = "xf_groupid7")
    protected String xfGroupid7;
    @XmlElement(name = "xf_groupid8")
    protected String xfGroupid8;
    @XmlElement(name = "xf_groupid9")
    protected String xfGroupid9;
    @XmlElement(name = "xf_idcardtype")
    protected String xfIdcardtype;
    @XmlElement(name = "xf_issuedate")
    protected String xfIssuedate;
    @XmlElement(name = "xf_issuestore")
    protected String xfIssuestore;
    @XmlElement(name = "xf_jointdate")
    protected String xfJointdate;
    @XmlElement(name = "xf_postal")
    protected String xfPostal;
    @XmlElement(name = "xf_remarks1")
    protected String xfRemarks1;
    @XmlElement(name = "xf_remarks2")
    protected String xfRemarks2;
    @XmlElement(name = "xf_sex")
    protected String xfSex;
    @XmlElement(name = "xf_surname")
    protected String xfSurname;
    @XmlElement(name = "xf_telephone")
    protected String xfTelephone;
    @XmlElement(name = "xf_telephone2")
    protected String xfTelephone2;
    @XmlElement(name = "xf_vipcode")
    protected String xfVipcode;
    @XmlElement(name = "xf_vipemail")
    protected String xfVipemail;
    @XmlElement(name = "xf_vipid")
    protected String xfVipid;
    @XmlElement(name = "xf_weixin")
    protected String xfWeixin;

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
     * 获取xfActive属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfActive() {
        return xfActive;
    }

    /**
     * 设置xfActive属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfActive(String value) {
        this.xfActive = value;
    }

    /**
     * 获取xfAddress1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfAddress1() {
        return xfAddress1;
    }

    /**
     * 设置xfAddress1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfAddress1(String value) {
        this.xfAddress1 = value;
    }

    /**
     * 获取xfAddress2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfAddress2() {
        return xfAddress2;
    }

    /**
     * 设置xfAddress2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfAddress2(String value) {
        this.xfAddress2 = value;
    }

    /**
     * 获取xfAddress3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfAddress3() {
        return xfAddress3;
    }

    /**
     * 设置xfAddress3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfAddress3(String value) {
        this.xfAddress3 = value;
    }

    /**
     * 获取xfAddress4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfAddress4() {
        return xfAddress4;
    }

    /**
     * 设置xfAddress4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfAddress4(String value) {
        this.xfAddress4 = value;
    }

    /**
     * 获取xfBankcardno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfBankcardno() {
        return xfBankcardno;
    }

    /**
     * 设置xfBankcardno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfBankcardno(String value) {
        this.xfBankcardno = value;
    }

    /**
     * 获取xfBirthdaydd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXfBirthdaydd() {
        return xfBirthdaydd;
    }

    /**
     * 设置xfBirthdaydd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXfBirthdaydd(BigDecimal value) {
        this.xfBirthdaydd = value;
    }

    /**
     * 获取xfBirthdaymm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXfBirthdaymm() {
        return xfBirthdaymm;
    }

    /**
     * 设置xfBirthdaymm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXfBirthdaymm(BigDecimal value) {
        this.xfBirthdaymm = value;
    }

    /**
     * 获取xfBirthdayyyyy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXfBirthdayyyyy() {
        return xfBirthdayyyyy;
    }

    /**
     * 设置xfBirthdayyyyy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXfBirthdayyyyy(BigDecimal value) {
        this.xfBirthdayyyyy = value;
    }

    /**
     * 获取xfBonus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfBonus() {
        return xfBonus;
    }

    /**
     * 设置xfBonus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfBonus(String value) {
        this.xfBonus = value;
    }

    /**
     * 获取xfBonus2AmtExamount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXfBonus2AmtExamount() {
        return xfBonus2AmtExamount;
    }

    /**
     * 设置xfBonus2AmtExamount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXfBonus2AmtExamount(BigDecimal value) {
        this.xfBonus2AmtExamount = value;
    }

    /**
     * 获取xfBonus2AmtExbonus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXfBonus2AmtExbonus() {
        return xfBonus2AmtExbonus;
    }

    /**
     * 设置xfBonus2AmtExbonus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXfBonus2AmtExbonus(BigDecimal value) {
        this.xfBonus2AmtExbonus = value;
    }

    /**
     * 获取xfDefsalesman属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfDefsalesman() {
        return xfDefsalesman;
    }

    /**
     * 设置xfDefsalesman属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfDefsalesman(String value) {
        this.xfDefsalesman = value;
    }

    /**
     * 获取xfDiscount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfDiscount() {
        return xfDiscount;
    }

    /**
     * 设置xfDiscount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfDiscount(String value) {
        this.xfDiscount = value;
    }

    /**
     * 获取xfDob属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfDob() {
        return xfDob;
    }

    /**
     * 设置xfDob属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfDob(String value) {
        this.xfDob = value;
    }

    /**
     * 获取xfExpirydate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfExpirydate() {
        return xfExpirydate;
    }

    /**
     * 设置xfExpirydate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfExpirydate(String value) {
        this.xfExpirydate = value;
    }

    /**
     * 获取xfGivenname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGivenname() {
        return xfGivenname;
    }

    /**
     * 设置xfGivenname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGivenname(String value) {
        this.xfGivenname = value;
    }

    /**
     * 获取xfGrade属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGrade() {
        return xfGrade;
    }

    /**
     * 设置xfGrade属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGrade(String value) {
        this.xfGrade = value;
    }

    /**
     * 获取xfGroupid0属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid0() {
        return xfGroupid0;
    }

    /**
     * 设置xfGroupid0属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid0(String value) {
        this.xfGroupid0 = value;
    }

    /**
     * 获取xfGroupid1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid1() {
        return xfGroupid1;
    }

    /**
     * 设置xfGroupid1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid1(String value) {
        this.xfGroupid1 = value;
    }

    /**
     * 获取xfGroupid10属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid10() {
        return xfGroupid10;
    }

    /**
     * 设置xfGroupid10属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid10(String value) {
        this.xfGroupid10 = value;
    }

    /**
     * 获取xfGroupid11属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid11() {
        return xfGroupid11;
    }

    /**
     * 设置xfGroupid11属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid11(String value) {
        this.xfGroupid11 = value;
    }

    /**
     * 获取xfGroupid12属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid12() {
        return xfGroupid12;
    }

    /**
     * 设置xfGroupid12属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid12(String value) {
        this.xfGroupid12 = value;
    }

    /**
     * 获取xfGroupid13属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid13() {
        return xfGroupid13;
    }

    /**
     * 设置xfGroupid13属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid13(String value) {
        this.xfGroupid13 = value;
    }

    /**
     * 获取xfGroupid14属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid14() {
        return xfGroupid14;
    }

    /**
     * 设置xfGroupid14属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid14(String value) {
        this.xfGroupid14 = value;
    }

    /**
     * 获取xfGroupid15属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid15() {
        return xfGroupid15;
    }

    /**
     * 设置xfGroupid15属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid15(String value) {
        this.xfGroupid15 = value;
    }

    /**
     * 获取xfGroupid16属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid16() {
        return xfGroupid16;
    }

    /**
     * 设置xfGroupid16属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid16(String value) {
        this.xfGroupid16 = value;
    }

    /**
     * 获取xfGroupid17属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid17() {
        return xfGroupid17;
    }

    /**
     * 设置xfGroupid17属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid17(String value) {
        this.xfGroupid17 = value;
    }

    /**
     * 获取xfGroupid18属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid18() {
        return xfGroupid18;
    }

    /**
     * 设置xfGroupid18属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid18(String value) {
        this.xfGroupid18 = value;
    }

    /**
     * 获取xfGroupid19属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid19() {
        return xfGroupid19;
    }

    /**
     * 设置xfGroupid19属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid19(String value) {
        this.xfGroupid19 = value;
    }

    /**
     * 获取xfGroupid2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid2() {
        return xfGroupid2;
    }

    /**
     * 设置xfGroupid2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid2(String value) {
        this.xfGroupid2 = value;
    }

    /**
     * 获取xfGroupid3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid3() {
        return xfGroupid3;
    }

    /**
     * 设置xfGroupid3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid3(String value) {
        this.xfGroupid3 = value;
    }

    /**
     * 获取xfGroupid4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid4() {
        return xfGroupid4;
    }

    /**
     * 设置xfGroupid4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid4(String value) {
        this.xfGroupid4 = value;
    }

    /**
     * 获取xfGroupid5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid5() {
        return xfGroupid5;
    }

    /**
     * 设置xfGroupid5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid5(String value) {
        this.xfGroupid5 = value;
    }

    /**
     * 获取xfGroupid6属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid6() {
        return xfGroupid6;
    }

    /**
     * 设置xfGroupid6属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid6(String value) {
        this.xfGroupid6 = value;
    }

    /**
     * 获取xfGroupid7属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid7() {
        return xfGroupid7;
    }

    /**
     * 设置xfGroupid7属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid7(String value) {
        this.xfGroupid7 = value;
    }

    /**
     * 获取xfGroupid8属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid8() {
        return xfGroupid8;
    }

    /**
     * 设置xfGroupid8属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid8(String value) {
        this.xfGroupid8 = value;
    }

    /**
     * 获取xfGroupid9属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfGroupid9() {
        return xfGroupid9;
    }

    /**
     * 设置xfGroupid9属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfGroupid9(String value) {
        this.xfGroupid9 = value;
    }

    /**
     * 获取xfIdcardtype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfIdcardtype() {
        return xfIdcardtype;
    }

    /**
     * 设置xfIdcardtype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfIdcardtype(String value) {
        this.xfIdcardtype = value;
    }

    /**
     * 获取xfIssuedate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfIssuedate() {
        return xfIssuedate;
    }

    /**
     * 设置xfIssuedate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfIssuedate(String value) {
        this.xfIssuedate = value;
    }

    /**
     * 获取xfIssuestore属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfIssuestore() {
        return xfIssuestore;
    }

    /**
     * 设置xfIssuestore属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfIssuestore(String value) {
        this.xfIssuestore = value;
    }

    /**
     * 获取xfJointdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfJointdate() {
        return xfJointdate;
    }

    /**
     * 设置xfJointdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfJointdate(String value) {
        this.xfJointdate = value;
    }

    /**
     * 获取xfPostal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfPostal() {
        return xfPostal;
    }

    /**
     * 设置xfPostal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfPostal(String value) {
        this.xfPostal = value;
    }

    /**
     * 获取xfRemarks1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfRemarks1() {
        return xfRemarks1;
    }

    /**
     * 设置xfRemarks1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfRemarks1(String value) {
        this.xfRemarks1 = value;
    }

    /**
     * 获取xfRemarks2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfRemarks2() {
        return xfRemarks2;
    }

    /**
     * 设置xfRemarks2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfRemarks2(String value) {
        this.xfRemarks2 = value;
    }

    /**
     * 获取xfSex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfSex() {
        return xfSex;
    }

    /**
     * 设置xfSex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfSex(String value) {
        this.xfSex = value;
    }

    /**
     * 获取xfSurname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfSurname() {
        return xfSurname;
    }

    /**
     * 设置xfSurname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfSurname(String value) {
        this.xfSurname = value;
    }

    /**
     * 获取xfTelephone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfTelephone() {
        return xfTelephone;
    }

    /**
     * 设置xfTelephone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfTelephone(String value) {
        this.xfTelephone = value;
    }

    /**
     * 获取xfTelephone2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfTelephone2() {
        return xfTelephone2;
    }

    /**
     * 设置xfTelephone2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfTelephone2(String value) {
        this.xfTelephone2 = value;
    }

    /**
     * 获取xfVipcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfVipcode() {
        return xfVipcode;
    }

    /**
     * 设置xfVipcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfVipcode(String value) {
        this.xfVipcode = value;
    }

    /**
     * 获取xfVipemail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfVipemail() {
        return xfVipemail;
    }

    /**
     * 设置xfVipemail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfVipemail(String value) {
        this.xfVipemail = value;
    }

    /**
     * 获取xfVipid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfVipid() {
        return xfVipid;
    }

    /**
     * 设置xfVipid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfVipid(String value) {
        this.xfVipid = value;
    }

    /**
     * 获取xfWeixin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfWeixin() {
        return xfWeixin;
    }

    /**
     * 设置xfWeixin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfWeixin(String value) {
        this.xfWeixin = value;
    }

}
