<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Change originationBankName</name>
   <tag></tag>
   <elementGuidId>b48effa8-b207-49a8-b680-5b2ca48048ba</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;changeDirectDebitDepositAccountServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;companyNbr\&quot;: ${companyNbr},\n        \&quot;paymentType\&quot;: ${paymentType},\n        \&quot;productCd\&quot;: \&quot;${productCd}\&quot;,\n        \&quot;accountNbr\&quot;: ${accountNbr},\n        \&quot;sequenceNumberHi\&quot;: ${sequenceNumberHi},\n        \&quot;sequenceNumberLo\&quot;: ${sequenceNumberLo},\n        \&quot;startDate\&quot;: ${startDate},\n        \&quot;expiryDate\&quot;: ${expiryDate},\n        \&quot;lastMaintenanceDate\&quot;: ${lastMaintenanceDate},\n        \&quot;maximumAuthorizedAmt\&quot;: ${maximumAuthorizedAmt},\n        \&quot;originationTransitRouting\&quot;: ${originationTransitRouting},\n        \&quot;originationProductCd\&quot;: ${originationProductCd},\n        \&quot;originationAccountNbr\&quot;: ${originationAccountNbr},\n        \&quot;originationBankName\&quot;: \&quot;${originationBankName}\&quot;\n      }\n    }\n  }\n}&quot;,
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
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>System</name>
      <type>Main</type>
      <value>zosapifnon</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PATCH</restRequestMethod>
   <restUrl>https://20.14.209.1:9443/changeDirectDebitDepositAccount/changeDirectDebitDepositAccount?</restUrl>
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
