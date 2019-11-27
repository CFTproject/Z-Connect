<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create Restraint Merchant Auth record with all blank input fields</name>
   <tag></tag>
   <elementGuidId>f641c589-0d2a-412c-b680-e1332072b46c</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;createRestraintMerchantAuthServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;companyNbr\&quot;: ${companyNbr},\n        \&quot;productCd\&quot;: \&quot;${productCd}\&quot;,\n        \&quot;accountNbr\&quot;: ${accountNbr},\n        \&quot;expireDt\&quot;: \&quot;${expireDt}\&quot;,\n        \&quot;authorizationNbr\&quot;: ${authorizationNbr},\n        \&quot;pledgeToAccountNbr\&quot;: ${pledgeToAccountNbr},\n        \&quot;reviewFrequency\&quot;: \&quot;${reviewFrequency}\&quot;,\n        \&quot;lastReviewDt\&quot;: \&quot;${lastReviewDt}\&quot;,\n        \&quot;authorizedAmt\&quot;: ${authorizedAmt},\n        \&quot;comment01\&quot;: \&quot;${comment01}\&quot;,\n        \&quot;comment02\&quot;: \&quot;${comment02}\&quot;,\n        \&quot;restraintReason01\&quot;: \&quot;${restraintReason01}\&quot;,\n        \&quot;restraintReason02\&quot;: \&quot;${restraintReason02}\&quot;,\n        \&quot;merchantCd\&quot;: ${merchantCd}\n      }\n    }\n  }\n}&quot;,
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
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://20.14.209.1:9443/createRestraintMerchantAuth/createRestraintMerchantAuth?</restUrl>
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
