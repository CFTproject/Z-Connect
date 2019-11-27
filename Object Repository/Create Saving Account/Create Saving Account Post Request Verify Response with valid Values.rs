<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create Saving Account Post Request Verify Response with valid Values</name>
   <tag></tag>
   <elementGuidId>dbd6e438-5e32-447f-8f18-e8b346cb1a3b</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;createSavingsAccountServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;companyNbr\&quot;: 11,\n        \&quot;accountNumber\&quot;: 7964556934,\n        \&quot;accountName\&quot;: \&quot;\&quot;,\n        \&quot;product\&quot;: \&quot;02\&quot;,\n        \&quot;processingId\&quot;: 00000,\n        \&quot;openDate\&quot;: \&quot;\&quot;,\n        \&quot;packageCode\&quot;: \&quot;23AB23\&quot;,\n        \&quot;obpCode\&quot;: \&quot;01\&quot;,\n        \&quot;socialSecurityNumber\&quot;: 1,\n        \&quot;taxIdNumber\&quot;: 123456789,\n        \&quot;language\&quot;: \&quot;ENG\&quot;,\n        \&quot;withholdCode\&quot;: \&quot;PD\&quot;,\n        \&quot;largeItemMonitor\&quot;: \&quot;0\&quot;,\n        \&quot;currency\&quot;: \&quot;\&quot;,\n        \&quot;branch\&quot;: 00001,\n        \&quot;costCenter\&quot;: 0000002,\n        \&quot;relOfficer1\&quot;: \&quot;OFF01\&quot;,\n        \&quot;relOfficer2\&quot;: \&quot;OFF02\&quot;,\n        \&quot;ownerCode\&quot;: \&quot;06\&quot;,\n        \&quot;subownerCode\&quot;: \&quot;03\&quot;,\n        \&quot;location\&quot;: \&quot;DD\&quot;,\n        \&quot;geographicCode\&quot;: \&quot;MEOC\&quot;,\n        \&quot;sic\&quot;: \&quot;0111\&quot;,\n        \&quot;naics\&quot;: \&quot;11113\&quot;,\n        \&quot;intCode\&quot;: \&quot;02\&quot;,\n        \&quot;intWaiveCode\&quot;: \&quot;01\&quot;,\n        \&quot;intCycle\&quot;: \&quot;EM\&quot;,\n        \&quot;intPaymentMethod\&quot;: \&quot;TA\&quot;,\n        \&quot;svcChgCode\&quot;: \&quot;17\&quot;,\n        \&quot;svcChgWaiveCode\&quot;: \&quot;01\&quot;,\n        \&quot;svcChgCycle\&quot;: \&quot;02\&quot;,\n        \&quot;statementCycle\&quot;: \&quot;02\&quot;,\n        \&quot;statementMailCode\&quot;: \&quot;02\&quot;,\n        \&quot;statementSequence\&quot;: \&quot;B\&quot;,       \n      }\n    }\n  }\n}&quot;,
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
