<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Change DDA account record with blank NAICS code field</name>
   <tag></tag>
   <elementGuidId>75d5eec3-bf63-4e57-90fc-b4800871d215</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;changeDepositAccountDDAServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;companyNbr\&quot;: ${companyNbr},\n        \&quot;accountNumber\&quot;: ${accountNumber},\n        \&quot;location\&quot;: \&quot;${location}\&quot;,\n        \&quot;geographicCode\&quot;: \&quot;${geographicCode}\&quot;,\n        \&quot;sic\&quot;: \&quot;${sic}\&quot;,\n        \&quot;naics\&quot;: \&quot;${naics}\&quot;,\n        \&quot;intCode\&quot;: \&quot;${intCode}\&quot;,\n        \&quot;intWaiveCode\&quot;: \&quot;${intWaiveCode}\&quot;,\n        \&quot;intCycle\&quot;: \&quot;${intCycle}\&quot;,\n        \&quot;intPaymentMethod\&quot;: \&quot;${intPaymentMethod}\&quot;       \n      }\n    }\n  }\n}&quot;,
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
