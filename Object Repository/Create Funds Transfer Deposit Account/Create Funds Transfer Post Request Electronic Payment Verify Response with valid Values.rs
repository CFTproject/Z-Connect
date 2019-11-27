<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create Funds Transfer Post Request Electronic Payment Verify Response with valid Values</name>
   <tag></tag>
   <elementGuidId>88ba3024-c132-412a-84ab-956368dd97eb</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;CreateFundsTransferDepositAccountOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;companyNbr\&quot;: 11,\n        \&quot;paymentType\&quot;: \&quot;EP\&quot;,\n        \&quot;accountType\&quot;: \&quot;DDA\&quot;,\n        \&quot;accountNbr\&quot;: \&quot;12345\&quot;,\n        \&quot;period\&quot;: \&quot;W\&quot;,\n        \&quot;frequency\&quot;: 0002,\n        \&quot;startDate\&quot;: \&quot;2019-09-02\&quot;,\n        \&quot;expiryDate\&quot;: \&quot;2022-12-31\&quot;,\n        \&quot;nonBusDayException\&quot;: \&quot;B\&quot;,\n        \&quot;holdCode\&quot;: \&quot;1\&quot;,\n        \&quot;variable\&quot;: \&quot;C\&quot;,\n        \&quot;amount\&quot;: 1009,\n        \&quot;partial\&quot;: \&quot;N\&quot;,\n        \&quot;minimum\&quot;: 10,\n        \&quot;maximum\&quot;: 20,\n        \&quot;target\&quot;: 100,\n        \&quot;destinationTransitRouting\&quot;: 112344,\n        \&quot;destinationAccountType\&quot;: \&quot;CDA\&quot;,\n        \&quot;destinationAccountNbr\&quot;: \&quot;45634\&quot;,\n        \&quot;destinationCurrency\&quot;: \&quot;USD\&quot;,\n        \&quot;destinationCompanyNbr\&quot;: 0,\n        \&quot;shortName\&quot;: \&quot;san\&quot;,\n        \&quot;otherInfo\&quot;: \&quot;test\&quot;\n      }\n    }\n  }\n}&quot;,
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
