<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create Funds Transfer Post Electronic Payment Request Verify Response with Empty Values</name>
   <tag></tag>
   <elementGuidId>81749bff-082e-4b9a-a56f-d26207276c10</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;CreateFundsTransferDepositAccountOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;companyNbr\&quot;: 0,\n        \&quot;paymentType\&quot;: \&quot;EP\&quot;,\n        \&quot;accountType\&quot;: \&quot;\&quot;,\n        \&quot;accountNbr\&quot;: \&quot;\&quot;,\n        \&quot;period\&quot;: \&quot;\&quot;,\n        \&quot;frequency\&quot;: 0,\n        \&quot;startDate\&quot;: \&quot;\&quot;,\n        \&quot;expiryDate\&quot;: \&quot;\&quot;,\n        \&quot;nonBusDayException\&quot;: \&quot;\&quot;,\n        \&quot;holdCode\&quot;: \&quot;\&quot;,\n        \&quot;variable\&quot;: \&quot;\&quot;,\n        \&quot;amount\&quot;: 0,\n        \&quot;partial\&quot;: \&quot;\&quot;,\n        \&quot;minimum\&quot;: 0,\n        \&quot;maximum\&quot;: 0,\n        \&quot;target\&quot;: 0,\n        \&quot;destinationTransitRouting\&quot;: 0,\n        \&quot;destinationAccountType\&quot;: \&quot;\&quot;,\n        \&quot;destinationAccountNbr\&quot;: \&quot;\&quot;,\n        \&quot;destinationCurrency\&quot;: \&quot;\&quot;,\n        \&quot;destinationCompanyNbr\&quot;: 0,\n        \&quot;shortName\&quot;: \&quot;\&quot;,\n        \&quot;otherInfo\&quot;: \&quot;\&quot;\n      }\n    }\n  }\n}&quot;,
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
   <restUrl>https://20.14.209.1:9443/createtransferfunds/CreateTransferFunds?</restUrl>
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
