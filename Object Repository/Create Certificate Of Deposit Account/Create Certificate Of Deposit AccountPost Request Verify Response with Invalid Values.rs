<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create Certificate Of Deposit AccountPost Request Verify Response with Invalid Values</name>
   <tag></tag>
   <elementGuidId>6a8a11f2-118b-4770-a8ab-7507e5cb1a3b</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;createCertificateOfDepositAccountServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;companyNbr\&quot;: 1123,\n        \&quot;accountNumber\&quot;: 4567876545364576542,\n        \&quot;accountName\&quot;: \&quot;\&quot;,\n        \&quot;product\&quot;: \&quot;41\&quot;,\n        \&quot;processingId\&quot;: 0,\n        \&quot;openDate\&quot;: \&quot;\&quot;,\n        \&quot;packageCode\&quot;: \&quot;\&quot;,\n        \&quot;socialSecurityNumber\&quot;: 0,\n        \&quot;taxIdNumber\&quot;: 0,\n        \&quot;language\&quot;: \&quot;\&quot;,\n        \&quot;withholdCode\&quot;: \&quot;\&quot;,\n        \&quot;largeItemMonitor\&quot;: \&quot;\&quot;,\n        \&quot;currency\&quot;: \&quot;\&quot;,\n        \&quot;branch\&quot;: 0,\n        \&quot;costCenter\&quot;: 0,\n        \&quot;relOfficer1\&quot;: \&quot;\&quot;,\n        \&quot;relOfficer2\&quot;: \&quot;\&quot;,\n        \&quot;ownerCode\&quot;: \&quot;034561\&quot;,\n        \&quot;subownerCode\&quot;: \&quot;\&quot;,\n        \&quot;location\&quot;: \&quot;\&quot;,\n        \&quot;geographicCode\&quot;: \&quot;\&quot;,\n        \&quot;sic\&quot;: \&quot;\&quot;,\n        \&quot;naics\&quot;: \&quot;\&quot;,\n        \&quot;intCode\&quot;: \&quot;\&quot;,\n        \&quot;intWaiveCode\&quot;: \&quot;\&quot;,\n        \&quot;intCycle\&quot;: \&quot;\&quot;,\n        \&quot;intPaymentMethod\&quot;: \&quot;\&quot;,\n        \&quot;statementCycle\&quot;: \&quot;\&quot;,\n        \&quot;statementMailCode\&quot;: \&quot;\&quot;,\n        \&quot;statementSequence\&quot;: \&quot;\&quot;,\n        \&quot;term\&quot;: 0,\n        \&quot;termCode\&quot;: \&quot;\&quot;,\n        \&quot;issueDate\&quot;: \&quot;\&quot;,\n        \&quot;maturityDate\&quot;: \&quot;\&quot;,\n        \&quot;accountStatus\&quot;: \&quot;\&quot;\n      }\n    }\n  }\n}&quot;,
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
   <restUrl>https://20.14.209.1:9443/createCertificateOfDepositAccount/createCertificateOfDepositAccount?</restUrl>
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
