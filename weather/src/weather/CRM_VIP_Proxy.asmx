<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://www.tech-trans.com.cn/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" targetNamespace="http://www.tech-trans.com.cn/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://www.tech-trans.com.cn/">
      <s:element name="Proxy">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="method" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="data" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ProxyResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ProxyResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetVipBaseInfoByMobile">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfBaseVipInfoRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RequestDataOfBaseVipInfoRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:RequestHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="Data" type="tns:BaseVipInfoRequest" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="RequestHeader">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="REQDATE" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="REQTIME" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="SIGN" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="USER" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="BaseVipInfoRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Mobile" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="MACAddress" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="MallId" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetVipBaseInfoByMobileResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetVipBaseInfoByMobileResult" type="tns:ResponseDataOfBaseVipInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ResponseDataOfBaseVipInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:ResponseHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="DATA" type="tns:BaseVipInfo" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ResponseHeader">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ERRCODE" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ERRMSG" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="REQDATE" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="REQTIME" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="BaseVipInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="VIPCODE" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="NAME" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="GRADE" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="GRADEDESCI" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="MACADRESS" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="CRMPay">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfCRMPayRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RequestDataOfCRMPayRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:RequestHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="Data" type="tns:CRMPayRequest" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CRMPayRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="KEY" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="VERIFICATION" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="VIPCODE" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="STORECODE" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="TENDERID" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="TENDERTYPE" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="PAYAMT" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="USERID" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="TXDATE" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="CRMPayResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CRMPayResult" type="tns:ResponseDataOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ResponseDataOfString">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:ResponseHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="DATA" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="CRMRefund">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfCRMRefundRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RequestDataOfCRMRefundRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:RequestHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="Data" type="tns:CRMRefundRequest" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CRMRefundRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="KEY" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="VERIFICATION" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="VIPCODE" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DOCNO" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="TXDATE" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="USERID" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="CRMRefundResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CRMRefundResult" type="tns:ResponseDataOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CRMPayLedgerQuery">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfCRMPayLedgerQueryRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RequestDataOfCRMPayLedgerQueryRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:RequestHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="Data" type="tns:CRMPayLedgerQueryRequest" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CRMPayLedgerQueryRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="VIPCODE" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="TXDATE" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="CRMPayLedgerQueryResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CRMPayLedgerQueryResult" type="tns:ResponseDataOfArrayOfCRMPayLedger" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ResponseDataOfArrayOfCRMPayLedger">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:ResponseHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="DATA" type="tns:ArrayOfCRMPayLedger" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfCRMPayLedger">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="CRMPayLedger" nillable="true" type="tns:CRMPayLedger" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CRMPayLedger">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="TXDATE" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="TXTIME" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DESCI" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DOCNO" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="NUM" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="AMT" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="STORECODE" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="STORENAME" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="VipCreate">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfCreateVipRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RequestDataOfCreateVipRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:RequestHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="Data" type="tns:CreateVipRequest" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CreateVipRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="vip" type="tns:xf_vip" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="xf_vip">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ExtensionData" type="tns:ExtensionDataObject" />
          <s:element minOccurs="0" maxOccurs="1" name="address" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="birthday" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="email" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="idcardno" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="idcardtype" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="isfreeze" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="jointdate" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="mobile" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="sex" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="surname" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="vip_souce" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="vipgrade" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="weixin" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid0" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid10" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid11" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid12" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid13" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid14" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid15" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid16" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid17" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid18" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid19" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid4" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid5" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid6" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid7" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid8" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid9" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_issuestaffcode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_issuestore" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_vipcode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_vipcodeprefix" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ExtensionDataObject" />
      <s:element name="VipCreateResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="VipCreateResult" type="tns:ResponseDataOfCreateVip" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ResponseDataOfCreateVip">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:ResponseHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="DATA" type="tns:CreateVip" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CreateVip">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="xf_vipcode" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="VipModify">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfVipModifyRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RequestDataOfVipModifyRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:RequestHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="Data" type="tns:VipModifyRequest" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="VipModifyRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="vip" type="tns:xf_vip" />
        </s:sequence>
      </s:complexType>
      <s:element name="VipModifyResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="VipModifyResult" type="tns:ResponseDataOfEmptyResponeData" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ResponseDataOfEmptyResponeData">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:ResponseHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="DATA" type="tns:EmptyResponeData" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="EmptyResponeData" />
      <s:element name="GetGiftList">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfGiftListInfoRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RequestDataOfGiftListInfoRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:RequestHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="Data" type="tns:GiftListInfoRequest" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="GiftListInfoRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="storecode" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetGiftListResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetGiftListResult" type="tns:ResponseDataOfGiftListInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ResponseDataOfGiftListInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:ResponseHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="DATA" type="tns:GiftListInfo" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="GiftListInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ExtensionData" type="tns:ExtensionDataObject" />
          <s:element minOccurs="0" maxOccurs="1" name="header" type="tns:State" />
          <s:element minOccurs="0" maxOccurs="1" name="result" type="tns:ArrayOfXf_vipgiftuseitem" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="State">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ExtensionData" type="tns:ExtensionDataObject" />
          <s:element minOccurs="0" maxOccurs="1" name="errorcode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="errormsg" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfXf_vipgiftuseitem">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="xf_vipgiftuseitem" nillable="true" type="tns:xf_vipgiftuseitem" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="xf_vipgiftuseitem">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ExtensionData" type="tns:ExtensionDataObject" />
          <s:element minOccurs="0" maxOccurs="1" name="EB_BARCODE" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="XF_AMOUNT" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="XF_BONUS" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_ITEMDESCI" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_ITEMNO" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_PHOTOPATH" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="XF_QOH" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="XF_QTY" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_TYPE" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="QueryQOH">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfGiftListInfoRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryQOHResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="QueryQOHResult" type="tns:ResponseDataOfGiftListInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GiftUseh">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfGiftExchangeInfoRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RequestDataOfGiftExchangeInfoRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:RequestHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="Data" type="tns:GiftExchangeInfoRequest" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="GiftExchangeInfoRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="gift" type="tns:xf_vipgiftuseh" />
          <s:element minOccurs="0" maxOccurs="1" name="items" type="tns:ArrayOfXf_vipgiftuseitem" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="xf_vipgiftuseh">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ExtensionData" type="tns:ExtensionDataObject" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_docno" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_issuestaffcode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_mallid" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_parentno" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_remarks" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_storecode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_txdate_hhmmss" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_txdate_yyyymmdd" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_vipcode" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GiftUsehResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GiftUsehResult" type="tns:ResponseDataOfGiftExchangeInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ResponseDataOfGiftExchangeInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:ResponseHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="DATA" type="tns:GiftExchangeInfo" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="GiftExchangeInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ExtensionData" type="tns:ExtensionDataObject" />
          <s:element minOccurs="1" maxOccurs="1" name="bonus" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="docno" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="header" type="tns:State" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetExchangeGiftRecord">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfExchangeGiftRecordRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RequestDataOfExchangeGiftRecordRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:RequestHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="Data" type="tns:ExchangeGiftRecordRequest" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ExchangeGiftRecordRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="VIPCODE" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="FRMTXDATE" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="TOTXDATE" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetExchangeGiftRecordResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetExchangeGiftRecordResult" type="tns:ResponseDataOfArrayOfExchangeGiftRecord" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ResponseDataOfArrayOfExchangeGiftRecord">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:ResponseHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="DATA" type="tns:ArrayOfExchangeGiftRecord" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfExchangeGiftRecord">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="ExchangeGiftRecord" nillable="true" type="tns:ExchangeGiftRecord" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ExchangeGiftRecord">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="TXDATE" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="GIFTNAME" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="GIFTIMG" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="BONUS" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="QTY" type="s:decimal" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetVipSalesRecord">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfVipSalesRecordRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RequestDataOfVipSalesRecordRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:RequestHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="Data" type="tns:VipSalesRecordRequest" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="VipSalesRecordRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="vipcode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="openid" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="frmtxdate" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="totxdate" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetVipSalesRecordResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetVipSalesRecordResult" type="tns:ResponseDataOfListOfxf_transsalestotal" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ResponseDataOfListOfxf_transsalestotal">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:ResponseHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="DATA" type="tns:ArrayOfXf_transsalestotal" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfXf_transsalestotal">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="xf_transsalestotal" nillable="true" type="tns:xf_transsalestotal" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="xf_transsalestotal">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ExtensionData" type="tns:ExtensionDataObject" />
          <s:element minOccurs="0" maxOccurs="1" name="BRANDDESC" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="EB_CREATEBY" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="EB_CREATE_DATETIME" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="EB_ID" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="EB_LASTMODIFYBY" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="EB_LASTMODIFY_DATETIME" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="STOREDESC" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_BONUS" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_DATE" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_DOCNO" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_MALLID" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_NETAMOUNT" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_PARENTNO" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_STORECODE" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_TILLID" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_TXDATE" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_TXTYPE" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_VIPCODE" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetBonusledgerRecord">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfBonusledgerRecordRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RequestDataOfBonusledgerRecordRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:RequestHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="Data" type="tns:BonusledgerRecordRequest" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="BonusledgerRecordRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="vipcode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="openid" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="frmtxdate" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="totxdate" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="action" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="remark" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetBonusledgerRecordResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetBonusledgerRecordResult" type="tns:ResponseDataOfArrayOfxf_bonusledger" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ResponseDataOfArrayOfxf_bonusledger">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:ResponseHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="DATA" type="tns:ArrayOfXf_bonusledger" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfXf_bonusledger">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="xf_bonusledger" nillable="true" type="tns:xf_bonusledger" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="xf_bonusledger">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ExtensionData" type="tns:ExtensionDataObject" />
          <s:element minOccurs="0" maxOccurs="1" name="ACTIONDESC" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="EB_CREATEBY" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="EB_CREATE_DATETIME" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="EB_ID" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="EB_LASTMODIFYBY" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="EB_LASTMODIFY_DATETIME" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="REASONDESC" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="STOREDESC" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_ACTION" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_AMOUNT" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_BONUS" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_DOCNO" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_MALLID" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_PARENTNO" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_REASONCODE" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_REMARK" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_STORECODE" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_TILLID" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_TXDATE" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_VIPCODE" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="Consume">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfConsumeRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RequestDataOfConsumeRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:RequestHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="Data" type="tns:ConsumeRequest" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ConsumeRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="salestotal" type="tns:txsalestotal" />
          <s:element minOccurs="0" maxOccurs="1" name="tender" type="tns:ArrayOfTxsalestender" />
          <s:element minOccurs="0" maxOccurs="1" name="items" type="tns:ArrayOfTxsalesitem" />
          <s:element minOccurs="0" maxOccurs="1" name="isvip" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="txsalestotal">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ExtensionData" type="tns:ExtensionDataObject" />
          <s:element minOccurs="0" maxOccurs="1" name="dec_changeamount" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="dec_discountamount" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="dec_netamount" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="dec_netqty" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="dec_originalamount" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="dec_paidamount" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="dec_sellingamount" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="dec_taxamount" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="dt_reftxdate" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="dt_txdate" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="i_numofitem" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="i_numoftender" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="i_purchasedependent" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_cashier" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_clientcode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_defaulttender" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_demographiccode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_demographicdata" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_discountapprove" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_docno" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_extendparam" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_purchasestaffcode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_refdocno" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_refstorecode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_reftillid" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_salesman" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_storecode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_tillid" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_vipcode" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfTxsalestender">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="txsalestender" nillable="true" type="tns:txsalestender" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="txsalestender">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ExtensionData" type="tns:ExtensionDataObject" />
          <s:element minOccurs="1" maxOccurs="1" name="dec_baseamount" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="dec_payamount" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="i_specificedtype" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="s_cashier" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_extendparam" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_tendercode" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfTxsalesitem">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="txsalesitem" nillable="true" type="tns:txsalesitem" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="txsalesitem">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ExtensionData" type="tns:ExtensionDataObject" />
          <s:element minOccurs="1" maxOccurs="1" name="dec_discountamount" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="dec_exstk2sales" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="dec_netamount" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="dec_originalprice" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="dec_promotionless" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="dec_promotionuseqty" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="dec_qty" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="dec_taxamount" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="dec_totaldiscountless" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="s_cashier" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_clientcode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_colorcode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_couponnumber" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_demographiccode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_demographicdata" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_discountapprove" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_extendparam" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_isdeposit" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_isnewitem" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_ispricealternate" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_ispriceoverride" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_iswholesale" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_itemlotnum" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_plucode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_priceapprove" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_promotionid" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_salesitemremark" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_salesman" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="s_sizecode" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="ConsumeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ConsumeResult" type="tns:ResponseDataOfBonusInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ResponseDataOfBonusInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:ResponseHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="DATA" type="tns:BonusInfo" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="BonusInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ExtensionData" type="tns:ExtensionDataObject" />
          <s:element minOccurs="1" maxOccurs="1" name="bonus2amount" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="bonusearn" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="bonusredeem" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="currentbonus" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="header" type="tns:State" />
          <s:element minOccurs="0" maxOccurs="1" name="traceno" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="CheckConsume">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfConsumeRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CheckConsumeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CheckConsumeResult" type="tns:ResponseDataOfBonusInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetVipDis">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfVipDisRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RequestDataOfVipDisRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:RequestHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="Data" type="tns:VipDisRequest" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="VipDisRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="mallid" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="store" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="cardno" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="vipcode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="surname" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="telphone" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="vipid" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetVipDisResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetVipDisResult" type="tns:ResponseDataOfListOfVIP" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ResponseDataOfListOfVIP">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:ResponseHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="DATA" type="tns:ArrayOfVIP" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfVIP">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="VIP" nillable="true" type="tns:VIP" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="VIP">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ExtensionData" type="tns:ExtensionDataObject" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_active" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_address1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_address2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_address3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_address4" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_bankcardno" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="xf_birthdaydd" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="xf_birthdaymm" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="xf_birthdayyyyy" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_bonus" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="xf_bonus2amt_examount" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="xf_bonus2amt_exbonus" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_defsalesman" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_discount" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_dob" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_expirydate" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_givenname" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_grade" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid0" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid10" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid11" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid12" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid13" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid14" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid15" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid16" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid17" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid18" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid19" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid3" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid4" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid5" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid6" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid7" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid8" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_groupid9" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_idcardtype" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_issuedate" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_issuestore" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_jointdate" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_postal" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_remarks1" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_remarks2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_sex" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_surname" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_telephone" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_telephone2" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_vipcode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_vipemail" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_vipid" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_weixin" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetVipInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfVipInfoRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RequestDataOfVipInfoRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:RequestHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="Data" type="tns:VipInfoRequest" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="VipInfoRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="vipcode" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetVipInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetVipInfoResult" type="tns:ResponseDataOfListOfVIP" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetBasicInfo">
        <s:complexType />
      </s:element>
      <s:element name="GetBasicInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetBasicInfoResult" type="tns:ResponseDataOfBasicInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ResponseDataOfBasicInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:ResponseHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="DATA" type="tns:BasicInfo" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="BasicInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="vipgrade" type="tns:ArrayOfCombo" />
          <s:element minOccurs="0" maxOccurs="1" name="idcardtype" type="tns:ArrayOfCombo" />
          <s:element minOccurs="0" maxOccurs="1" name="xf_vipcodeprefix" type="tns:ArrayOfCombo" />
          <s:element minOccurs="0" maxOccurs="1" name="adjuest_cause" type="tns:ArrayOfCombo" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfCombo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="combo" nillable="true" type="tns:combo" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="combo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ExtensionData" type="tns:ExtensionDataObject" />
          <s:element minOccurs="0" maxOccurs="1" name="code" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="desc" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetGradeList">
        <s:complexType />
      </s:element>
      <s:element name="GetGradeListResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetGradeListResult" type="tns:ResponseDataOfGradeInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ResponseDataOfGradeInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:ResponseHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="DATA" type="tns:GradeInfo" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="GradeInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="vipgrade" type="tns:ArrayOfCombo" />
        </s:sequence>
      </s:complexType>
      <s:element name="RepairConsume">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfRepairConsumeRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RequestDataOfRepairConsumeRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:RequestHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="Data" type="tns:RepairConsumeRequest" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="RepairConsumeRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="salestotal" type="tns:txsalestotal" />
        </s:sequence>
      </s:complexType>
      <s:element name="RepairConsumeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="RepairConsumeResult" type="tns:ResponseDataOfBonusInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryTO">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfQueryTORequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RequestDataOfQueryTORequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:RequestHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="Data" type="tns:QueryTORequest" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="QueryTORequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="trfoutno" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="storecode" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="QueryTOResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="QueryTOResult" type="tns:ResponseDataOfTOresult" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ResponseDataOfTOresult">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:ResponseHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="DATA" type="tns:TOresult" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="TOresult">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ExtensionData" type="tns:ExtensionDataObject" />
          <s:element minOccurs="0" maxOccurs="1" name="data" type="tns:TrfOutModel" />
          <s:element minOccurs="0" maxOccurs="1" name="docno" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="header" type="tns:State" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="TrfOutModel">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ExtensionData" type="tns:ExtensionDataObject" />
          <s:element minOccurs="0" maxOccurs="1" name="tods" type="tns:ArrayOfTOItemModel" />
          <s:element minOccurs="0" maxOccurs="1" name="toh" type="tns:TOModel" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfTOItemModel">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="TOItemModel" nillable="true" type="tns:TOItemModel" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="TOItemModel">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ExtensionData" type="tns:ExtensionDataObject" />
          <s:element minOccurs="1" maxOccurs="1" name="XF_AUCOSTk__BackingField" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_DESCIk__BackingField" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_PLUk__BackingField" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="XF_QTYk__BackingField" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_TRFOUTSTOREk__BackingField" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="XF_TTCOSTk__BackingField" type="s:decimal" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="TOModel">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ExtensionData" type="tns:ExtensionDataObject" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_LASTMODIFYDATE_HHMMSS" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_LASTMODIFYDATE_YYYYMMDD" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_STATUS" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_TRFINSTORE" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_TRFINSTOREDESCI" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_TRFOUTNO" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_TRFOUTSTORE" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_TRFOUTSTOREDESCI" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_TRFOUT_HHMMSS" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_TRFOUT_YYYYMMDD" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_USERID" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="ConfrimTI">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfConfrimTIRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RequestDataOfConfrimTIRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:RequestHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="Data" type="tns:ConfrimTIRequest" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ConfrimTIRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="trfoutno" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="storecode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="createby" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="lastmodifydate_yyyymmdd" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="lastmodifydate_hhmmss" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="ConfrimTIResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ConfrimTIResult" type="tns:ResponseDataOfFirmTIresult" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ResponseDataOfFirmTIresult">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:ResponseHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="DATA" type="tns:FirmTIresult" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="FirmTIresult">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ExtensionData" type="tns:ExtensionDataObject" />
          <s:element minOccurs="0" maxOccurs="1" name="docno" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="header" type="tns:State" />
        </s:sequence>
      </s:complexType>
      <s:element name="CreateTO">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfCreateTORequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RequestDataOfCreateTORequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:RequestHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="Data" type="tns:CreateTORequest" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CreateTORequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="toh" type="tns:TOModel" />
          <s:element minOccurs="0" maxOccurs="1" name="tods" type="tns:ArrayOfTOItemModel" />
        </s:sequence>
      </s:complexType>
      <s:element name="CreateTOResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CreateTOResult" type="tns:ResponseDataOfTOresult" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="BindOpenID">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfBindOpenIDRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RequestDataOfBindOpenIDRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:RequestHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="Data" type="tns:BindOpenIDRequest" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="BindOpenIDRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="vipcode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="mobile" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="openid" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="BindOpenIDResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="BindOpenIDResult" type="tns:ResponseDataOfEmptyResponeData" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetVipInfoByMobileOpenID">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfBindOpenIDRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetVipInfoByMobileOpenIDResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetVipInfoByMobileOpenIDResult" type="tns:ResponseDataOfListOfVIP" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetInformation">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfInformationRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RequestDataOfInformationRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:RequestHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="Data" type="tns:InformationRequest" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="InformationRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="code" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetInformationResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetInformationResult" type="tns:ResponseDataOfListOfEB_INFORMATION" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ResponseDataOfListOfEB_INFORMATION">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:ResponseHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="DATA" type="tns:ArrayOfEB_INFORMATION" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfEB_INFORMATION">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="EB_INFORMATION" nillable="true" type="tns:EB_INFORMATION" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="EB_INFORMATION">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ExtensionData" type="tns:ExtensionDataObject" />
          <s:element minOccurs="0" maxOccurs="1" name="EB_CODE" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="EB_CREATEBY" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="EB_CREATE_DATETIME" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="EB_DELETEABLE" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="EB_DESC" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="EB_EFFECT_DATETIME" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="EB_EXPIRY_DATETIME" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="EB_ID" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="EB_IMAGEURL" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="EB_IMAGE_BIG" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="EB_ISDELETE" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="EB_LASTMODIFYBY" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="EB_LASTMODIFY_DATETIME" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="EB_TITLE" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="XF_STORECODE" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetNodeInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfNodeInfoRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RequestDataOfNodeInfoRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:RequestHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="Data" type="tns:NodeInfoRequest" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="NodeInfoRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="node" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="mallId" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetNodeInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetNodeInfoResult" type="tns:ResponseDataOfNodeInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ResponseDataOfNodeInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:ResponseHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="DATA" type="tns:NodeInfo" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="NodeInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ExtensionData" type="tns:ExtensionDataObject" />
          <s:element minOccurs="0" maxOccurs="1" name="code" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="desc" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="l_child" type="tns:ArrayOfNodeInfo" />
          <s:element minOccurs="0" maxOccurs="1" name="l_info" type="tns:ArrayOfEB_INFORMATION" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfNodeInfo">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="NodeInfo" nillable="true" type="tns:NodeInfo" />
        </s:sequence>
      </s:complexType>
      <s:element name="BonusChange">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfBonusChangeRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RequestDataOfBonusChangeRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:RequestHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="Data" type="tns:BonusChangeRequest" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="BonusChangeRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="vipcode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="openid" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="expdate" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="bonus" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="reasoncode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="remark" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="BonusChangeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="BonusChangeResult" type="tns:ResponseDataOfBonusInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ActivitEnroll">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfActivitEnrollRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RequestDataOfActivitEnrollRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:RequestHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="Data" type="tns:ActivitEnrollRequest" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ActivitEnrollRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="vipcode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="openid" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="activitcode" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="ActivitEnrollResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ActivitEnrollResult" type="tns:ResponseDataOfBonusInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryActivit">
        <s:complexType />
      </s:element>
      <s:element name="QueryActivitResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="QueryActivitResult" type="tns:ResponseDataOfListOfCRM_MEMBERMSG" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ResponseDataOfListOfCRM_MEMBERMSG">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:ResponseHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="DATA" type="tns:ArrayOfCRM_MEMBERMSG" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfCRM_MEMBERMSG">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="CRM_MEMBERMSG" nillable="true" type="tns:CRM_MEMBERMSG" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CRM_MEMBERMSG">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ExtensionData" type="tns:ExtensionDataObject" />
          <s:element minOccurs="1" maxOccurs="1" name="ACTIVE_COST" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="ASSIGNMEMBERCODE" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="BUILDINGID" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="CONFIRMDATE" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="CONFIRMUSER" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CRM_MSG_CODE" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DOCNO" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="EB_ACTIVE" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="EB_BONUS" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="EB_CREATEBY" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="EB_CREATE_DATETIME" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="EB_ISDELETE" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="EB_LASTMODIFYBY" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="EB_LASTMODIFY_DATETIME" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="MSGCONTENT" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="MSGDATE" type="s:dateTime" />
          <s:element minOccurs="1" maxOccurs="1" name="MSGENDDATE" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="MSGSENDTODESC" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="MSGSENDTOSQL" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="MSGTITLE" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="PEOPLELIMIT" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="SENDSTATUS" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="STARTSENDDATE" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="STARTSENDTIME" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="STATUS" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="UNCONFIRMDATE" type="s:dateTime" />
          <s:element minOccurs="0" maxOccurs="1" name="UNCONFIRMUSER" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="SendSMS">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfSMSRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RequestDataOfSMSRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:RequestHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="Data" type="tns:SMSRequest" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="SMSRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="mobile" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="msg" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="subnumber" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="SendSMSResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SendSMSResult" type="tns:ResponseDataOfBoolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ResponseDataOfBoolean">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:ResponseHeader" />
          <s:element minOccurs="1" maxOccurs="1" name="DATA" type="s:boolean" />
        </s:sequence>
      </s:complexType>
      <s:element name="CheckReturnGood">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfCheckReturnGoodRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RequestDataOfCheckReturnGoodRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:RequestHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="Data" type="tns:CheckReturnGoodRequest" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CheckReturnGoodRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="docno" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="tillid" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="txdate" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="storecode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="localstorecode" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="CheckReturnGoodResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CheckReturnGoodResult" type="tns:ResponseDataOfCheckReturnGoodRespose" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ResponseDataOfCheckReturnGoodRespose">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:ResponseHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="DATA" type="tns:CheckReturnGoodRespose" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CheckReturnGoodRespose">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ExtensionData" type="tns:ExtensionDataObject" />
          <s:element minOccurs="0" maxOccurs="1" name="currentbonus" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="header" type="tns:State" />
          <s:element minOccurs="0" maxOccurs="1" name="worse" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetVipSalse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RequestDataOfString">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:RequestHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="Data" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetVipSalseResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetVipSalseResult" type="tns:ResponseDataOfVipSales" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ResponseDataOfVipSales">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:ResponseHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="DATA" type="tns:VipSales" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="VipSales">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ExtensionData" type="tns:ExtensionDataObject" />
          <s:element minOccurs="0" maxOccurs="1" name="Amount" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Count" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Vipcode" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="Consume_QRcode_NoEncrypt">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfConsume_QRcode_NoEncryptRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RequestDataOfConsume_QRcode_NoEncryptRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:RequestHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="Data" type="tns:Consume_QRcode_NoEncryptRequest" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="Consume_QRcode_NoEncryptRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="vipcode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="docno" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="txdate" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="storecode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="amount" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="tillid" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="Consume_QRcode_NoEncryptResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Consume_QRcode_NoEncryptResult" type="tns:ResponseDataOfBonusInfo" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CheckVIP_Password">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfCheckVIP_PasswordRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RequestDataOfCheckVIP_PasswordRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:RequestHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="Data" type="tns:CheckVIP_PasswordRequest" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CheckVIP_PasswordRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="vipcode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="vipcardno" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="mobile" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="password" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="CheckVIP_PasswordResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CheckVIP_PasswordResult" type="tns:ResponseDataOfBoolean" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCRMTicker">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfGetCRMTickerRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RequestDataOfGetCRMTickerRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:RequestHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="Data" type="tns:GetCRMTickerRequest" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="GetCRMTickerRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="vipcode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="storecode" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetCRMTickerResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetCRMTickerResult" type="tns:ResponseDataOfListOfCRMTender" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ResponseDataOfListOfCRMTender">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:ResponseHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="DATA" type="tns:ArrayOfCRMTender" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfCRMTender">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="CRMTender" nillable="true" type="tns:CRMTender" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CRMTender">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ExtensionData" type="tns:ExtensionDataObject" />
          <s:element minOccurs="0" maxOccurs="1" name="ExpiryDate" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="IncreaseAmt" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="MaxAmt" type="s:decimal" />
          <s:element minOccurs="1" maxOccurs="1" name="MinAmt" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="TenderDesci" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="TenderID" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="TenderType" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="CRMTicketPay">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfCRMTicketPayRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RequestDataOfCRMTicketPayRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:RequestHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="Data" type="tns:CRMTicketPayRequest" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CRMTicketPayRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="key" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="value" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="vipcode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="storecode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="tenderId" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="RedemptionAmount" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="tillid" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="userid" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="CRMTicketPayResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CRMTicketPayResult" type="tns:ResponseDataOfCRMTenderReturn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ResponseDataOfCRMTenderReturn">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:ResponseHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="DATA" type="tns:CRMTenderReturn" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CRMTenderReturn">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ExtensionData" type="tns:ExtensionDataObject" />
          <s:element minOccurs="1" maxOccurs="1" name="CanUseAmount" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="LedgerID" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetTicketByTypeCode">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfTicketRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RequestDataOfTicketRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:RequestHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="Data" type="tns:TicketRequest" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="TicketRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="vipcode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="id" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="CRC" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetTicketByTypeCodeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetTicketByTypeCodeResult" type="tns:ResponseDataOfTicketType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ResponseDataOfTicketType">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:ResponseHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="DATA" type="tns:TicketType" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="TicketType">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ExtensionData" type="tns:ExtensionDataObject" />
          <s:element minOccurs="1" maxOccurs="1" name="AMT" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="BATCHDESCI" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="BATCHID" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="DESCI" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="EFFECTDATE" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="EXPIRYDATE" type="s:string" />
          <s:element minOccurs="1" maxOccurs="1" name="QTY" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="TYPE" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="UseCRMTicket">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfTicketRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UseCRMTicketResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="UseCRMTicketResult" type="tns:ResponseDataOfCRMTickReturn" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ResponseDataOfCRMTickReturn">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:ResponseHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="DATA" type="tns:CRMTickReturn" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CRMTickReturn">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ExtensionData" type="tns:ExtensionDataObject" />
          <s:element minOccurs="1" maxOccurs="1" name="AMT" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="CRC" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="QueryTicketType">
        <s:complexType />
      </s:element>
      <s:element name="QueryTicketTypeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="QueryTicketTypeResult" type="tns:ResponseDataOfListOfTicketType" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ResponseDataOfListOfTicketType">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:ResponseHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="DATA" type="tns:ArrayOfTicketType" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfTicketType">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="TicketType" nillable="true" type="tns:TicketType" />
        </s:sequence>
      </s:complexType>
      <s:element name="GetUsedTicket">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfString" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetUsedTicketResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetUsedTicketResult" type="tns:ResponseDataOfListOfCRMTICKET" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ResponseDataOfListOfCRMTICKET">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:ResponseHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="DATA" type="tns:ArrayOfCRMTICKET" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="ArrayOfCRMTICKET">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="CRMTICKET" nillable="true" type="tns:CRMTICKET" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CRMTICKET">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="ExtensionData" type="tns:ExtensionDataObject" />
          <s:element minOccurs="1" maxOccurs="1" name="Amt" type="s:decimal" />
          <s:element minOccurs="0" maxOccurs="1" name="BatchID" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Effectdate" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ExpDate" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ReceiveDt" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Remark" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Status" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="TenderDesci" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="TenderID" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="TenderType" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="TypeCode" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="UseDate" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="CRMPayTenderQuery">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="request" type="tns:RequestDataOfCRMPayTenderRequest" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="RequestDataOfCRMPayTenderRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="Header" type="tns:RequestHeader" />
          <s:element minOccurs="0" maxOccurs="1" name="Data" type="tns:CRMPayTenderRequest" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="CRMPayTenderRequest">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="VIPCODE" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="TXDATE" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="CRMPayTenderQueryResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CRMPayTenderQueryResult" type="tns:ResponseDataOfListOfCRMTender" />
          </s:sequence>
        </s:complexType>
      </s:element>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="ProxySoapIn">
    <wsdl:part name="parameters" element="tns:Proxy" />
  </wsdl:message>
  <wsdl:message name="ProxySoapOut">
    <wsdl:part name="parameters" element="tns:ProxyResponse" />
  </wsdl:message>
  <wsdl:message name="GetVipBaseInfoByMobileSoapIn">
    <wsdl:part name="parameters" element="tns:GetVipBaseInfoByMobile" />
  </wsdl:message>
  <wsdl:message name="GetVipBaseInfoByMobileSoapOut">
    <wsdl:part name="parameters" element="tns:GetVipBaseInfoByMobileResponse" />
  </wsdl:message>
  <wsdl:message name="CRMPaySoapIn">
    <wsdl:part name="parameters" element="tns:CRMPay" />
  </wsdl:message>
  <wsdl:message name="CRMPaySoapOut">
    <wsdl:part name="parameters" element="tns:CRMPayResponse" />
  </wsdl:message>
  <wsdl:message name="CRMRefundSoapIn">
    <wsdl:part name="parameters" element="tns:CRMRefund" />
  </wsdl:message>
  <wsdl:message name="CRMRefundSoapOut">
    <wsdl:part name="parameters" element="tns:CRMRefundResponse" />
  </wsdl:message>
  <wsdl:message name="CRMPayLedgerQuerySoapIn">
    <wsdl:part name="parameters" element="tns:CRMPayLedgerQuery" />
  </wsdl:message>
  <wsdl:message name="CRMPayLedgerQuerySoapOut">
    <wsdl:part name="parameters" element="tns:CRMPayLedgerQueryResponse" />
  </wsdl:message>
  <wsdl:message name="VipCreateSoapIn">
    <wsdl:part name="parameters" element="tns:VipCreate" />
  </wsdl:message>
  <wsdl:message name="VipCreateSoapOut">
    <wsdl:part name="parameters" element="tns:VipCreateResponse" />
  </wsdl:message>
  <wsdl:message name="VipModifySoapIn">
    <wsdl:part name="parameters" element="tns:VipModify" />
  </wsdl:message>
  <wsdl:message name="VipModifySoapOut">
    <wsdl:part name="parameters" element="tns:VipModifyResponse" />
  </wsdl:message>
  <wsdl:message name="GetGiftListSoapIn">
    <wsdl:part name="parameters" element="tns:GetGiftList" />
  </wsdl:message>
  <wsdl:message name="GetGiftListSoapOut">
    <wsdl:part name="parameters" element="tns:GetGiftListResponse" />
  </wsdl:message>
  <wsdl:message name="QueryQOHSoapIn">
    <wsdl:part name="parameters" element="tns:QueryQOH" />
  </wsdl:message>
  <wsdl:message name="QueryQOHSoapOut">
    <wsdl:part name="parameters" element="tns:QueryQOHResponse" />
  </wsdl:message>
  <wsdl:message name="GiftUsehSoapIn">
    <wsdl:part name="parameters" element="tns:GiftUseh" />
  </wsdl:message>
  <wsdl:message name="GiftUsehSoapOut">
    <wsdl:part name="parameters" element="tns:GiftUsehResponse" />
  </wsdl:message>
  <wsdl:message name="GetExchangeGiftRecordSoapIn">
    <wsdl:part name="parameters" element="tns:GetExchangeGiftRecord" />
  </wsdl:message>
  <wsdl:message name="GetExchangeGiftRecordSoapOut">
    <wsdl:part name="parameters" element="tns:GetExchangeGiftRecordResponse" />
  </wsdl:message>
  <wsdl:message name="GetVipSalesRecordSoapIn">
    <wsdl:part name="parameters" element="tns:GetVipSalesRecord" />
  </wsdl:message>
  <wsdl:message name="GetVipSalesRecordSoapOut">
    <wsdl:part name="parameters" element="tns:GetVipSalesRecordResponse" />
  </wsdl:message>
  <wsdl:message name="GetBonusledgerRecordSoapIn">
    <wsdl:part name="parameters" element="tns:GetBonusledgerRecord" />
  </wsdl:message>
  <wsdl:message name="GetBonusledgerRecordSoapOut">
    <wsdl:part name="parameters" element="tns:GetBonusledgerRecordResponse" />
  </wsdl:message>
  <wsdl:message name="ConsumeSoapIn">
    <wsdl:part name="parameters" element="tns:Consume" />
  </wsdl:message>
  <wsdl:message name="ConsumeSoapOut">
    <wsdl:part name="parameters" element="tns:ConsumeResponse" />
  </wsdl:message>
  <wsdl:message name="CheckConsumeSoapIn">
    <wsdl:part name="parameters" element="tns:CheckConsume" />
  </wsdl:message>
  <wsdl:message name="CheckConsumeSoapOut">
    <wsdl:part name="parameters" element="tns:CheckConsumeResponse" />
  </wsdl:message>
  <wsdl:message name="GetVipDisSoapIn">
    <wsdl:part name="parameters" element="tns:GetVipDis" />
  </wsdl:message>
  <wsdl:message name="GetVipDisSoapOut">
    <wsdl:part name="parameters" element="tns:GetVipDisResponse" />
  </wsdl:message>
  <wsdl:message name="GetVipInfoSoapIn">
    <wsdl:part name="parameters" element="tns:GetVipInfo" />
  </wsdl:message>
  <wsdl:message name="GetVipInfoSoapOut">
    <wsdl:part name="parameters" element="tns:GetVipInfoResponse" />
  </wsdl:message>
  <wsdl:message name="GetBasicInfoSoapIn">
    <wsdl:part name="parameters" element="tns:GetBasicInfo" />
  </wsdl:message>
  <wsdl:message name="GetBasicInfoSoapOut">
    <wsdl:part name="parameters" element="tns:GetBasicInfoResponse" />
  </wsdl:message>
  <wsdl:message name="GetGradeListSoapIn">
    <wsdl:part name="parameters" element="tns:GetGradeList" />
  </wsdl:message>
  <wsdl:message name="GetGradeListSoapOut">
    <wsdl:part name="parameters" element="tns:GetGradeListResponse" />
  </wsdl:message>
  <wsdl:message name="RepairConsumeSoapIn">
    <wsdl:part name="parameters" element="tns:RepairConsume" />
  </wsdl:message>
  <wsdl:message name="RepairConsumeSoapOut">
    <wsdl:part name="parameters" element="tns:RepairConsumeResponse" />
  </wsdl:message>
  <wsdl:message name="QueryTOSoapIn">
    <wsdl:part name="parameters" element="tns:QueryTO" />
  </wsdl:message>
  <wsdl:message name="QueryTOSoapOut">
    <wsdl:part name="parameters" element="tns:QueryTOResponse" />
  </wsdl:message>
  <wsdl:message name="ConfrimTISoapIn">
    <wsdl:part name="parameters" element="tns:ConfrimTI" />
  </wsdl:message>
  <wsdl:message name="ConfrimTISoapOut">
    <wsdl:part name="parameters" element="tns:ConfrimTIResponse" />
  </wsdl:message>
  <wsdl:message name="CreateTOSoapIn">
    <wsdl:part name="parameters" element="tns:CreateTO" />
  </wsdl:message>
  <wsdl:message name="CreateTOSoapOut">
    <wsdl:part name="parameters" element="tns:CreateTOResponse" />
  </wsdl:message>
  <wsdl:message name="BindOpenIDSoapIn">
    <wsdl:part name="parameters" element="tns:BindOpenID" />
  </wsdl:message>
  <wsdl:message name="BindOpenIDSoapOut">
    <wsdl:part name="parameters" element="tns:BindOpenIDResponse" />
  </wsdl:message>
  <wsdl:message name="GetVipInfoByMobileOpenIDSoapIn">
    <wsdl:part name="parameters" element="tns:GetVipInfoByMobileOpenID" />
  </wsdl:message>
  <wsdl:message name="GetVipInfoByMobileOpenIDSoapOut">
    <wsdl:part name="parameters" element="tns:GetVipInfoByMobileOpenIDResponse" />
  </wsdl:message>
  <wsdl:message name="GetInformationSoapIn">
    <wsdl:part name="parameters" element="tns:GetInformation" />
  </wsdl:message>
  <wsdl:message name="GetInformationSoapOut">
    <wsdl:part name="parameters" element="tns:GetInformationResponse" />
  </wsdl:message>
  <wsdl:message name="GetNodeInfoSoapIn">
    <wsdl:part name="parameters" element="tns:GetNodeInfo" />
  </wsdl:message>
  <wsdl:message name="GetNodeInfoSoapOut">
    <wsdl:part name="parameters" element="tns:GetNodeInfoResponse" />
  </wsdl:message>
  <wsdl:message name="BonusChangeSoapIn">
    <wsdl:part name="parameters" element="tns:BonusChange" />
  </wsdl:message>
  <wsdl:message name="BonusChangeSoapOut">
    <wsdl:part name="parameters" element="tns:BonusChangeResponse" />
  </wsdl:message>
  <wsdl:message name="ActivitEnrollSoapIn">
    <wsdl:part name="parameters" element="tns:ActivitEnroll" />
  </wsdl:message>
  <wsdl:message name="ActivitEnrollSoapOut">
    <wsdl:part name="parameters" element="tns:ActivitEnrollResponse" />
  </wsdl:message>
  <wsdl:message name="QueryActivitSoapIn">
    <wsdl:part name="parameters" element="tns:QueryActivit" />
  </wsdl:message>
  <wsdl:message name="QueryActivitSoapOut">
    <wsdl:part name="parameters" element="tns:QueryActivitResponse" />
  </wsdl:message>
  <wsdl:message name="SendSMSSoapIn">
    <wsdl:part name="parameters" element="tns:SendSMS" />
  </wsdl:message>
  <wsdl:message name="SendSMSSoapOut">
    <wsdl:part name="parameters" element="tns:SendSMSResponse" />
  </wsdl:message>
  <wsdl:message name="CheckReturnGoodSoapIn">
    <wsdl:part name="parameters" element="tns:CheckReturnGood" />
  </wsdl:message>
  <wsdl:message name="CheckReturnGoodSoapOut">
    <wsdl:part name="parameters" element="tns:CheckReturnGoodResponse" />
  </wsdl:message>
  <wsdl:message name="GetVipSalseSoapIn">
    <wsdl:part name="parameters" element="tns:GetVipSalse" />
  </wsdl:message>
  <wsdl:message name="GetVipSalseSoapOut">
    <wsdl:part name="parameters" element="tns:GetVipSalseResponse" />
  </wsdl:message>
  <wsdl:message name="Consume_QRcode_NoEncryptSoapIn">
    <wsdl:part name="parameters" element="tns:Consume_QRcode_NoEncrypt" />
  </wsdl:message>
  <wsdl:message name="Consume_QRcode_NoEncryptSoapOut">
    <wsdl:part name="parameters" element="tns:Consume_QRcode_NoEncryptResponse" />
  </wsdl:message>
  <wsdl:message name="CheckVIP_PasswordSoapIn">
    <wsdl:part name="parameters" element="tns:CheckVIP_Password" />
  </wsdl:message>
  <wsdl:message name="CheckVIP_PasswordSoapOut">
    <wsdl:part name="parameters" element="tns:CheckVIP_PasswordResponse" />
  </wsdl:message>
  <wsdl:message name="GetCRMTickerSoapIn">
    <wsdl:part name="parameters" element="tns:GetCRMTicker" />
  </wsdl:message>
  <wsdl:message name="GetCRMTickerSoapOut">
    <wsdl:part name="parameters" element="tns:GetCRMTickerResponse" />
  </wsdl:message>
  <wsdl:message name="CRMTicketPaySoapIn">
    <wsdl:part name="parameters" element="tns:CRMTicketPay" />
  </wsdl:message>
  <wsdl:message name="CRMTicketPaySoapOut">
    <wsdl:part name="parameters" element="tns:CRMTicketPayResponse" />
  </wsdl:message>
  <wsdl:message name="GetTicketByTypeCodeSoapIn">
    <wsdl:part name="parameters" element="tns:GetTicketByTypeCode" />
  </wsdl:message>
  <wsdl:message name="GetTicketByTypeCodeSoapOut">
    <wsdl:part name="parameters" element="tns:GetTicketByTypeCodeResponse" />
  </wsdl:message>
  <wsdl:message name="UseCRMTicketSoapIn">
    <wsdl:part name="parameters" element="tns:UseCRMTicket" />
  </wsdl:message>
  <wsdl:message name="UseCRMTicketSoapOut">
    <wsdl:part name="parameters" element="tns:UseCRMTicketResponse" />
  </wsdl:message>
  <wsdl:message name="QueryTicketTypeSoapIn">
    <wsdl:part name="parameters" element="tns:QueryTicketType" />
  </wsdl:message>
  <wsdl:message name="QueryTicketTypeSoapOut">
    <wsdl:part name="parameters" element="tns:QueryTicketTypeResponse" />
  </wsdl:message>
  <wsdl:message name="GetUsedTicketSoapIn">
    <wsdl:part name="parameters" element="tns:GetUsedTicket" />
  </wsdl:message>
  <wsdl:message name="GetUsedTicketSoapOut">
    <wsdl:part name="parameters" element="tns:GetUsedTicketResponse" />
  </wsdl:message>
  <wsdl:message name="CRMPayTenderQuerySoapIn">
    <wsdl:part name="parameters" element="tns:CRMPayTenderQuery" />
  </wsdl:message>
  <wsdl:message name="CRMPayTenderQuerySoapOut">
    <wsdl:part name="parameters" element="tns:CRMPayTenderQueryResponse" />
  </wsdl:message>
  <wsdl:portType name="CRM_VIP_ProxySoap">
    <wsdl:operation name="Proxy">
      <wsdl:input message="tns:ProxySoapIn" />
      <wsdl:output message="tns:ProxySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetVipBaseInfoByMobile">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">手机号获取会员等级</wsdl:documentation>
      <wsdl:input message="tns:GetVipBaseInfoByMobileSoapIn" />
      <wsdl:output message="tns:GetVipBaseInfoByMobileSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CRMPay">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">会员资产支付</wsdl:documentation>
      <wsdl:input message="tns:CRMPaySoapIn" />
      <wsdl:output message="tns:CRMPaySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CRMRefund">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">会员资产退款</wsdl:documentation>
      <wsdl:input message="tns:CRMRefundSoapIn" />
      <wsdl:output message="tns:CRMRefundSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CRMPayLedgerQuery">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询会员资产支付记录</wsdl:documentation>
      <wsdl:input message="tns:CRMPayLedgerQuerySoapIn" />
      <wsdl:output message="tns:CRMPayLedgerQuerySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="VipCreate">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">开卡</wsdl:documentation>
      <wsdl:input message="tns:VipCreateSoapIn" />
      <wsdl:output message="tns:VipCreateSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="VipModify">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">修改会员资料</wsdl:documentation>
      <wsdl:input message="tns:VipModifySoapIn" />
      <wsdl:output message="tns:VipModifySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetGiftList">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取礼品库存</wsdl:documentation>
      <wsdl:input message="tns:GetGiftListSoapIn" />
      <wsdl:output message="tns:GetGiftListSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="QueryQOH">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取礼品库存（调入调出使用）</wsdl:documentation>
      <wsdl:input message="tns:QueryQOHSoapIn" />
      <wsdl:output message="tns:QueryQOHSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GiftUseh">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">礼品兑换</wsdl:documentation>
      <wsdl:input message="tns:GiftUsehSoapIn" />
      <wsdl:output message="tns:GiftUsehSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetExchangeGiftRecord">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">会员礼品兑换记录</wsdl:documentation>
      <wsdl:input message="tns:GetExchangeGiftRecordSoapIn" />
      <wsdl:output message="tns:GetExchangeGiftRecordSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetVipSalesRecord">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">会员消费记录</wsdl:documentation>
      <wsdl:input message="tns:GetVipSalesRecordSoapIn" />
      <wsdl:output message="tns:GetVipSalesRecordSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetBonusledgerRecord">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">会员积分记录</wsdl:documentation>
      <wsdl:input message="tns:GetBonusledgerRecordSoapIn" />
      <wsdl:output message="tns:GetBonusledgerRecordSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="Consume">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">销售</wsdl:documentation>
      <wsdl:input message="tns:ConsumeSoapIn" />
      <wsdl:output message="tns:ConsumeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CheckConsume">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">检测销售，算分</wsdl:documentation>
      <wsdl:input message="tns:CheckConsumeSoapIn" />
      <wsdl:output message="tns:CheckConsumeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetVipDis">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取vip 信息折扣</wsdl:documentation>
      <wsdl:input message="tns:GetVipDisSoapIn" />
      <wsdl:output message="tns:GetVipDisSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetVipInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取vip信息</wsdl:documentation>
      <wsdl:input message="tns:GetVipInfoSoapIn" />
      <wsdl:output message="tns:GetVipInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetBasicInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取会员注册基本信息</wsdl:documentation>
      <wsdl:input message="tns:GetBasicInfoSoapIn" />
      <wsdl:output message="tns:GetBasicInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetGradeList">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">返回等级列表</wsdl:documentation>
      <wsdl:input message="tns:GetGradeListSoapIn" />
      <wsdl:output message="tns:GetGradeListSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RepairConsume">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">积分补录</wsdl:documentation>
      <wsdl:input message="tns:RepairConsumeSoapIn" />
      <wsdl:output message="tns:RepairConsumeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="QueryTO">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询发给该店的转出单</wsdl:documentation>
      <wsdl:input message="tns:QueryTOSoapIn" />
      <wsdl:output message="tns:QueryTOSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ConfrimTI">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">确认调入</wsdl:documentation>
      <wsdl:input message="tns:ConfrimTISoapIn" />
      <wsdl:output message="tns:ConfrimTISoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CreateTO">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">礼品调出单创建</wsdl:documentation>
      <wsdl:input message="tns:CreateTOSoapIn" />
      <wsdl:output message="tns:CreateTOSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="BindOpenID">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">绑定微信ID</wsdl:documentation>
      <wsdl:input message="tns:BindOpenIDSoapIn" />
      <wsdl:output message="tns:BindOpenIDSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetVipInfoByMobileOpenID">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">通过vipcode 手机号 openid 查会员信息</wsdl:documentation>
      <wsdl:input message="tns:GetVipInfoByMobileOpenIDSoapIn" />
      <wsdl:output message="tns:GetVipInfoByMobileOpenIDSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetInformation">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">通过code获取Info信息</wsdl:documentation>
      <wsdl:input message="tns:GetInformationSoapIn" />
      <wsdl:output message="tns:GetInformationSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetNodeInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">通过node获取children和info信息</wsdl:documentation>
      <wsdl:input message="tns:GetNodeInfoSoapIn" />
      <wsdl:output message="tns:GetNodeInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="BonusChange">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">积分调整</wsdl:documentation>
      <wsdl:input message="tns:BonusChangeSoapIn" />
      <wsdl:output message="tns:BonusChangeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ActivitEnroll">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">活动报名</wsdl:documentation>
      <wsdl:input message="tns:ActivitEnrollSoapIn" />
      <wsdl:output message="tns:ActivitEnrollSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="QueryActivit">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">活动查询</wsdl:documentation>
      <wsdl:input message="tns:QueryActivitSoapIn" />
      <wsdl:output message="tns:QueryActivitSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SendSMS">
      <wsdl:input message="tns:SendSMSSoapIn" />
      <wsdl:output message="tns:SendSMSSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CheckReturnGood">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">退货检测</wsdl:documentation>
      <wsdl:input message="tns:CheckReturnGoodSoapIn" />
      <wsdl:output message="tns:CheckReturnGoodSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetVipSalse">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取会员消费总金额，次数</wsdl:documentation>
      <wsdl:input message="tns:GetVipSalseSoapIn" />
      <wsdl:output message="tns:GetVipSalseSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="Consume_QRcode_NoEncrypt">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">销售（二维码补录积分）（不加密）</wsdl:documentation>
      <wsdl:input message="tns:Consume_QRcode_NoEncryptSoapIn" />
      <wsdl:output message="tns:Consume_QRcode_NoEncryptSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CheckVIP_Password">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">检验用户名密码</wsdl:documentation>
      <wsdl:input message="tns:CheckVIP_PasswordSoapIn" />
      <wsdl:output message="tns:CheckVIP_PasswordSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetCRMTicker">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询该会员当前可用的电子券(POS用)</wsdl:documentation>
      <wsdl:input message="tns:GetCRMTickerSoapIn" />
      <wsdl:output message="tns:GetCRMTickerSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CRMTicketPay">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">核销电子券(POS用)</wsdl:documentation>
      <wsdl:input message="tns:CRMTicketPaySoapIn" />
      <wsdl:output message="tns:CRMTicketPaySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetTicketByTypeCode">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">领取电子券</wsdl:documentation>
      <wsdl:input message="tns:GetTicketByTypeCodeSoapIn" />
      <wsdl:output message="tns:GetTicketByTypeCodeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UseCRMTicket">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">使用电子券</wsdl:documentation>
      <wsdl:input message="tns:UseCRMTicketSoapIn" />
      <wsdl:output message="tns:UseCRMTicketSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="QueryTicketType">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">查询电子券类型</wsdl:documentation>
      <wsdl:input message="tns:QueryTicketTypeSoapIn" />
      <wsdl:output message="tns:QueryTicketTypeSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetUsedTicket">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取电子券状态</wsdl:documentation>
      <wsdl:input message="tns:GetUsedTicketSoapIn" />
      <wsdl:output message="tns:GetUsedTicketSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CRMPayTenderQuery">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取会员可用资产</wsdl:documentation>
      <wsdl:input message="tns:CRMPayTenderQuerySoapIn" />
      <wsdl:output message="tns:CRMPayTenderQuerySoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="CRM_VIP_ProxySoap" type="tns:CRM_VIP_ProxySoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="Proxy">
      <soap:operation soapAction="http://www.tech-trans.com.cn/Proxy" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetVipBaseInfoByMobile">
      <soap:operation soapAction="http://www.tech-trans.com.cn/GetVipBaseInfoByMobile" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CRMPay">
      <soap:operation soapAction="http://www.tech-trans.com.cn/CRMPay" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CRMRefund">
      <soap:operation soapAction="http://www.tech-trans.com.cn/CRMRefund" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CRMPayLedgerQuery">
      <soap:operation soapAction="http://www.tech-trans.com.cn/CRMPayLedgerQuery" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="VipCreate">
      <soap:operation soapAction="http://www.tech-trans.com.cn/VipCreate" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="VipModify">
      <soap:operation soapAction="http://www.tech-trans.com.cn/VipModify" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetGiftList">
      <soap:operation soapAction="http://www.tech-trans.com.cn/GetGiftList" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryQOH">
      <soap:operation soapAction="http://www.tech-trans.com.cn/QueryQOH" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GiftUseh">
      <soap:operation soapAction="http://www.tech-trans.com.cn/GiftUseh" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetExchangeGiftRecord">
      <soap:operation soapAction="http://www.tech-trans.com.cn/GetExchangeGiftRecord" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetVipSalesRecord">
      <soap:operation soapAction="http://www.tech-trans.com.cn/GetVipSalesRecord" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetBonusledgerRecord">
      <soap:operation soapAction="http://www.tech-trans.com.cn/GetBonusledgerRecord" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Consume">
      <soap:operation soapAction="http://www.tech-trans.com.cn/Consume" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CheckConsume">
      <soap:operation soapAction="http://www.tech-trans.com.cn/CheckConsume" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetVipDis">
      <soap:operation soapAction="http://www.tech-trans.com.cn/GetVipDis" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetVipInfo">
      <soap:operation soapAction="http://www.tech-trans.com.cn/GetVipInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetBasicInfo">
      <soap:operation soapAction="http://www.tech-trans.com.cn/GetBasicInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetGradeList">
      <soap:operation soapAction="http://www.tech-trans.com.cn/GetGradeList" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RepairConsume">
      <soap:operation soapAction="http://www.tech-trans.com.cn/RepairConsume" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryTO">
      <soap:operation soapAction="http://www.tech-trans.com.cn/QueryTO" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ConfrimTI">
      <soap:operation soapAction="http://www.tech-trans.com.cn/ConfrimTI" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CreateTO">
      <soap:operation soapAction="http://www.tech-trans.com.cn/CreateTO" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="BindOpenID">
      <soap:operation soapAction="http://www.tech-trans.com.cn/BindOpenID" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetVipInfoByMobileOpenID">
      <soap:operation soapAction="http://www.tech-trans.com.cn/GetVipInfoByMobileOpenID" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetInformation">
      <soap:operation soapAction="http://www.tech-trans.com.cn/GetInformation" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetNodeInfo">
      <soap:operation soapAction="http://www.tech-trans.com.cn/GetNodeInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="BonusChange">
      <soap:operation soapAction="http://www.tech-trans.com.cn/BonusChange" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ActivitEnroll">
      <soap:operation soapAction="http://www.tech-trans.com.cn/ActivitEnroll" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryActivit">
      <soap:operation soapAction="http://www.tech-trans.com.cn/QueryActivit" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SendSMS">
      <soap:operation soapAction="http://www.tech-trans.com.cn/SendSMS" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CheckReturnGood">
      <soap:operation soapAction="http://www.tech-trans.com.cn/CheckReturnGood" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetVipSalse">
      <soap:operation soapAction="http://www.tech-trans.com.cn/GetVipSalse" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Consume_QRcode_NoEncrypt">
      <soap:operation soapAction="http://www.tech-trans.com.cn/Consume_QRcode_NoEncrypt" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CheckVIP_Password">
      <soap:operation soapAction="http://www.tech-trans.com.cn/CheckVIP_Password" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCRMTicker">
      <soap:operation soapAction="http://www.tech-trans.com.cn/GetCRMTicker" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CRMTicketPay">
      <soap:operation soapAction="http://www.tech-trans.com.cn/CRMTicketPay" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTicketByTypeCode">
      <soap:operation soapAction="http://www.tech-trans.com.cn/GetTicketByTypeCode" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UseCRMTicket">
      <soap:operation soapAction="http://www.tech-trans.com.cn/UseCRMTicket" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryTicketType">
      <soap:operation soapAction="http://www.tech-trans.com.cn/QueryTicketType" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetUsedTicket">
      <soap:operation soapAction="http://www.tech-trans.com.cn/GetUsedTicket" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CRMPayTenderQuery">
      <soap:operation soapAction="http://www.tech-trans.com.cn/CRMPayTenderQuery" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="CRM_VIP_ProxySoap12" type="tns:CRM_VIP_ProxySoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="Proxy">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/Proxy" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetVipBaseInfoByMobile">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/GetVipBaseInfoByMobile" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CRMPay">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/CRMPay" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CRMRefund">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/CRMRefund" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CRMPayLedgerQuery">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/CRMPayLedgerQuery" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="VipCreate">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/VipCreate" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="VipModify">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/VipModify" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetGiftList">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/GetGiftList" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryQOH">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/QueryQOH" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GiftUseh">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/GiftUseh" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetExchangeGiftRecord">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/GetExchangeGiftRecord" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetVipSalesRecord">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/GetVipSalesRecord" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetBonusledgerRecord">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/GetBonusledgerRecord" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Consume">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/Consume" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CheckConsume">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/CheckConsume" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetVipDis">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/GetVipDis" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetVipInfo">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/GetVipInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetBasicInfo">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/GetBasicInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetGradeList">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/GetGradeList" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RepairConsume">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/RepairConsume" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryTO">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/QueryTO" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ConfrimTI">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/ConfrimTI" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CreateTO">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/CreateTO" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="BindOpenID">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/BindOpenID" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetVipInfoByMobileOpenID">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/GetVipInfoByMobileOpenID" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetInformation">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/GetInformation" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetNodeInfo">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/GetNodeInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="BonusChange">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/BonusChange" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ActivitEnroll">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/ActivitEnroll" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryActivit">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/QueryActivit" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SendSMS">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/SendSMS" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CheckReturnGood">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/CheckReturnGood" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetVipSalse">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/GetVipSalse" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Consume_QRcode_NoEncrypt">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/Consume_QRcode_NoEncrypt" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CheckVIP_Password">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/CheckVIP_Password" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCRMTicker">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/GetCRMTicker" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CRMTicketPay">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/CRMTicketPay" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetTicketByTypeCode">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/GetTicketByTypeCode" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UseCRMTicket">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/UseCRMTicket" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryTicketType">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/QueryTicketType" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetUsedTicket">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/GetUsedTicket" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CRMPayTenderQuery">
      <soap12:operation soapAction="http://www.tech-trans.com.cn/CRMPayTenderQuery" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="CRM_VIP_Proxy">
    <wsdl:port name="CRM_VIP_ProxySoap" binding="tns:CRM_VIP_ProxySoap">
      <soap:address location="http://114.255.150.14:1030/CRM_VIP_Proxy.asmx" />
    </wsdl:port>
    <wsdl:port name="CRM_VIP_ProxySoap12" binding="tns:CRM_VIP_ProxySoap12">
      <soap12:address location="http://114.255.150.14:1030/CRM_VIP_Proxy.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>