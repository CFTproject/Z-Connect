<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Change DDA account record with few invalid input field values</name>
   <tag></tag>
   <elementGuidId>3d0292fd-d56a-4dfc-b5c0-86c4cdb8cc63</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;changeDepositAccountDDAServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;companyNbr\&quot;: ${companyNbr},\n        \&quot;accountNumber\&quot;: ${accountNumber},\n        \&quot;debitIntCode\&quot;: \&quot;${debitIntCode}\&quot;,\n        \&quot;debitIntWaiveCode\&quot;: \&quot;${debitIntWaiveCode}\&quot;,\n        \&quot;debitIntCycle\&quot;: \&quot;${debitIntCycle}\&quot;,\n        \&quot;debitIntPaymentMethod\&quot;: \&quot;${debitIntPaymentMethod}\&quot;,\n        \&quot;svcChgCode\&quot;: \&quot;${svcChgCode}\&quot;,\n        \&quot;svcChgWaiveCode\&quot;: \&quot;${svcChgWaiveCode}\&quot;,\n        \&quot;svcChgCycle\&quot;: \&quot;${svcChgCycle}\&quot;,\n        \&quot;svcChgPaymentMethod\&quot;: \&quot;${svcChgPaymentMethod}\&quot;        \n      }\n    }\n  }\n}&quot;,
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
   <restUrl>https://20.14.209.1:9443/changeDepositAccountDDA/changeDepositAccountDDA?</restUrl>
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
