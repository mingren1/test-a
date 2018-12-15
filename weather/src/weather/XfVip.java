
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>xf_vip complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="xf_vip">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://www.tech-trans.com.cn/}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idcardno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idcardtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isfreeze" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jointdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vip_souce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vipgrade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weixin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="xf_issuestaffcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_issuestore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_vipcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xf_vipcodeprefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xf_vip", propOrder = {
    "extensionData",
    "address",
    "birthday",
    "email",
    "idcardno",
    "idcardtype",
    "isfreeze",
    "jointdate",
    "mobile",
    "sex",
    "surname",
    "vipSouce",
    "vipgrade",
    "weixin",
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
    "xfIssuestaffcode",
    "xfIssuestore",
    "xfVipcode",
    "xfVipcodeprefix"
})
public class XfVip {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    protected String address;
    protected String birthday;
    protected String email;
    protected String idcardno;
    protected String idcardtype;
    protected String isfreeze;
    protected String jointdate;
    protected String mobile;
    protected String sex;
    protected String surname;
    @XmlElement(name = "vip_souce")
    protected String vipSouce;
    protected String vipgrade;
    protected String weixin;
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
    @XmlElement(name = "xf_issuestaffcode")
    protected String xfIssuestaffcode;
    @XmlElement(name = "xf_issuestore")
    protected String xfIssuestore;
    @XmlElement(name = "xf_vipcode")
    protected String xfVipcode;
    @XmlElement(name = "xf_vipcodeprefix")
    protected String xfVipcodeprefix;

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
     * 获取address属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置address属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * 获取birthday属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 设置birthday属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthday(String value) {
        this.birthday = value;
    }

    /**
     * 获取email属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置email属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * 获取idcardno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcardno() {
        return idcardno;
    }

    /**
     * 设置idcardno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcardno(String value) {
        this.idcardno = value;
    }

    /**
     * 获取idcardtype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcardtype() {
        return idcardtype;
    }

    /**
     * 设置idcardtype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcardtype(String value) {
        this.idcardtype = value;
    }

    /**
     * 获取isfreeze属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsfreeze() {
        return isfreeze;
    }

    /**
     * 设置isfreeze属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsfreeze(String value) {
        this.isfreeze = value;
    }

    /**
     * 获取jointdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJointdate() {
        return jointdate;
    }

    /**
     * 设置jointdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJointdate(String value) {
        this.jointdate = value;
    }

    /**
     * 获取mobile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置mobile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * 获取sex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置sex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
    }

    /**
     * 获取surname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * 设置surname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * 获取vipSouce属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVipSouce() {
        return vipSouce;
    }

    /**
     * 设置vipSouce属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVipSouce(String value) {
        this.vipSouce = value;
    }

    /**
     * 获取vipgrade属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVipgrade() {
        return vipgrade;
    }

    /**
     * 设置vipgrade属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVipgrade(String value) {
        this.vipgrade = value;
    }

    /**
     * 获取weixin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeixin() {
        return weixin;
    }

    /**
     * 设置weixin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeixin(String value) {
        this.weixin = value;
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
     * 获取xfIssuestaffcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfIssuestaffcode() {
        return xfIssuestaffcode;
    }

    /**
     * 设置xfIssuestaffcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfIssuestaffcode(String value) {
        this.xfIssuestaffcode = value;
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
     * 获取xfVipcodeprefix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXfVipcodeprefix() {
        return xfVipcodeprefix;
    }

    /**
     * 设置xfVipcodeprefix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXfVipcodeprefix(String value) {
        this.xfVipcodeprefix = value;
    }

}
