<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Use an valid existing account and new address and valid relation data</name>
   <tag></tag>
   <elementGuidId>918b520b-ad24-49fa-aebe-917383e11ff7</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;relateAccountToAddressServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;accountCompanyNbr\&quot;: 11,\n        \&quot;accountProductCd\&quot;: \&quot;RSV\&quot;,\n        \&quot;accountNbr\&quot;: \&quot;1113\&quot;,\n        \&quot;accountTitle\&quot;: \&quot;ganesh\&quot;,\n        \&quot;addressCompanyNbr\&quot;: 11,\n        \&quot;addressLine1\&quot;: \&quot;DE123456\&quot;,\n        \&quot;addressLine2\&quot;: null,\n        \&quot;addressLine3\&quot;: null,\n        \&quot;city\&quot;: \&quot;NOIDA\&quot;,\n        \&quot;state\&quot;: \&quot;UP\&quot;,\n        \&quot;postalCd\&quot;: \&quot;EMAIL\&quot;,\n        \&quot;country\&quot;: \&quot;IN\&quot;,\n        \&quot;addressTie\&quot;: 1,\n        \&quot;addressUseCd\&quot;: \&quot;S1\&quot;,\n        \&quot;sequenceWithinUseCd\&quot;: 1,\n        \&quot;addressEffectiveDt\&quot;: \&quot;1926-01-02\&quot;,\n        \&quot;addressExpiryDt\&quot;: \&quot;1927-01-02\&quot;\n      }\n    }\n  }\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Basic RnJlZDpmcmVkcHdk</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://20.14.209.1:9443/relateAccountToAddress/relateAccountToAddress?</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
