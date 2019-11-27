<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Change Address of an account</name>
   <tag></tag>
   <elementGuidId>3a7b0aef-fc1d-4966-a1be-10d156f5df19</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;changeAddressAccountServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;actionCd\&quot;: \&quot;${actionCd}\&quot;,\n        \&quot;accountProductCd\&quot;: \&quot;${accountProductCd}\&quot;,\n        \&quot;accountNbr\&quot;: \&quot;${accountNbr}\&quot;,\n        \&quot;useCd\&quot;: \&quot;${useCd}\&quot;,\n        \&quot;sequence\&quot;: ${sequence},\n        \&quot;accountTitle1\&quot;: \&quot;${accountTitle1}\&quot;,\n        \&quot;accountTitle2\&quot;: \&quot;${accountTitle2}\&quot;,\n        \&quot;accountTitle3\&quot;: \&quot;${accountTitle3}\&quot;,\n        \&quot;addressLine1\&quot;: \&quot;${addressLine1}\&quot;,\n        \&quot;addressLine2\&quot;: \&quot;${addressLine2}\&quot;,\n        \&quot;addressLine3\&quot;: \&quot;${addressLine3}\&quot;,\n        \&quot;city\&quot;: \&quot;${city}\&quot;,\n        \&quot;postalCd\&quot;: \&quot;${postalCd}\&quot;,\n        \&quot;state\&quot;: \&quot;${state}\&quot;,\n        \&quot;country\&quot;: \&quot;${country}\&quot;\n      }\n    }\n  }\n}&quot;,
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
   <restUrl>https://20.14.209.1:9443/changeAddressAccount/changeAddressAccount?</restUrl>
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
