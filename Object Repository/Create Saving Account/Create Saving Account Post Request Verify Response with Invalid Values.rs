<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create Saving Account Post Request Verify Response with Invalid Values</name>
   <tag></tag>
   <elementGuidId>d1ed3515-a4a1-46fa-8b2f-81c2c8b4fbd6</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;CreateSavingAccountOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;companyNbr\&quot;: 11,\n        \&quot;accountNumber\&quot;: 023456756789923456,\n        \&quot;accountName\&quot;: \&quot;\&quot;,\n        \&quot;product\&quot;: \&quot;\&quot;,\n        \&quot;processingId\&quot;: 0,\n        \&quot;openDate\&quot;: \&quot;\&quot;,\n        \&quot;packageCode\&quot;: \&quot;\&quot;,\n        \&quot;obpCode\&quot;: \&quot;\&quot;,\n        \&quot;socialSecurityNumber\&quot;: 1,\n        \&quot;taxIdNumber\&quot;: 0,\n        \&quot;language\&quot;: \&quot;\&quot;,\n        \&quot;withholdCode\&quot;: \&quot;\&quot;,\n        \&quot;largeItemMonitor\&quot;: \&quot;\&quot;,\n        \&quot;currency\&quot;: \&quot;\&quot;,\n        \&quot;branch\&quot;: 1,\n        \&quot;costCenter\&quot;: 0,\n        \&quot;relOfficer1\&quot;: \&quot;\&quot;,\n        \&quot;relOfficer2\&quot;: \&quot;\&quot;,\n        \&quot;ownerCode\&quot;: \&quot;\&quot;,\n        \&quot;subownerCode\&quot;: \&quot;\&quot;,\n        \&quot;location\&quot;: \&quot;\&quot;,\n        \&quot;geographicCode\&quot;: \&quot;\&quot;,\n        \&quot;sic\&quot;: \&quot;\&quot;,\n        \&quot;naics\&quot;: \&quot;\&quot;,\n        \&quot;intCode\&quot;: \&quot;\&quot;,\n        \&quot;intWaiveCode\&quot;: \&quot;\&quot;,\n        \&quot;intCycle\&quot;: \&quot;\&quot;,\n        \&quot;intPaymentMethod\&quot;: \&quot;\&quot;,\n        \&quot;svcChgCode\&quot;: \&quot;\&quot;,\n        \&quot;svcChgWaiveCode\&quot;: \&quot;\&quot;,\n        \&quot;svcChgCycle\&quot;: \&quot;\&quot;,\n        \&quot;statementCycle\&quot;: \&quot;\&quot;,\n        \&quot;statementMailCode\&quot;: \&quot;\&quot;,\n        \&quot;statementSequence\&quot;: \&quot;\&quot;,       \n      }\n    }\n  }\n}&quot;,
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
   <restUrl>https://20.14.209.1:9443/createSavingsAccount/createSavingsAccount?</restUrl>
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
