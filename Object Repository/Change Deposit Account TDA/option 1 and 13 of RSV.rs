<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>option 1 and 13 of RSV</name>
   <tag></tag>
   <elementGuidId>1319ba4f-9e53-4308-8692-fc96edf4af97</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;changeDepositAccountTDAServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;companyNbr\&quot;: ${companyNbr},\n        \&quot;accountNumber\&quot;: ${accountNumber},\n        \&quot;accountType\&quot;: \&quot;${accountType}\&quot;,\n        \&quot;accountName\&quot;: \&quot;${accountName}\&quot;,\n        \&quot;packageCode\&quot;: \&quot;${packageCode}\&quot;,\n        \&quot;obpCode\&quot;: \&quot;${obpCode}\&quot;,\n        \&quot;largeItemMonitor\&quot;: \&quot;${largeItemMonitor}\&quot;,\n        \&quot;transactionAdviceCode\&quot;: \&quot;${transactionAdviceCode}\&quot;,\n        \&quot;relOfficer1\&quot;: \&quot;${relOfficer1}\&quot;,\n        \&quot;relOfficer2\&quot;: \&quot;${relOfficer2}\&quot;,    \n\t    \&quot;intCode\&quot;: \&quot;${intCode}\&quot;,\n        \&quot;intWaiveCode\&quot;: \&quot;${intWaiveCode}\&quot;,        \n        \&quot;svcChgCode\&quot;: \&quot;${svcChgCode}\&quot;,\n        \&quot;svcChgWaiveCode\&quot;: \&quot;${svcChgWaiveCode}\&quot;\n        \n\t    \n        \n        \n      }\n    }\n  }\n}&quot;,
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
   <restUrl>https://20.14.209.1:9443/changeDepositAccountTDA/changeDepositAccountTDA?</restUrl>
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
