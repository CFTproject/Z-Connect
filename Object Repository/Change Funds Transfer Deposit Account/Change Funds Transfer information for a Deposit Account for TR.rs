<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Change Funds Transfer information for a Deposit Account for TR</name>
   <tag></tag>
   <elementGuidId>f8430aed-2c86-41c8-94b2-868b7c5eaa5e</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;changeFundsTransferDepositAccountServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;companyNbr\&quot;: ${companyNbr},\n        \&quot;paymentType\&quot;: \&quot;${paymentType}\&quot;,\n        \&quot;productCd\&quot;: \&quot;${productCd}\&quot;,\n        \&quot;accountNbr\&quot;: \&quot;${accountNbr}\&quot;,\n        \&quot;transferNumberHi\&quot;: ${transferNumberHi},\n        \&quot;transferNumberLo\&quot;: ${transferNumberLo},\n        \&quot;destinationAccountType\&quot;: \&quot;${destinationAccountType}\&quot;,\n        \&quot;destainationAccountNbr\&quot;: \&quot;${destainationAccountNbr}\&quot;,\n        \&quot;destinationCompanyNbr\&quot;: ${destinationCompanyNbr}\n      }\n    }\n  }\n}&quot;,
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
   <restRequestMethod>PATCH</restRequestMethod>
   <restUrl>https://20.14.209.1:9443/changeFundsTransferDepositAccount/changeFundsTransferDepositAccount?</restUrl>
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
