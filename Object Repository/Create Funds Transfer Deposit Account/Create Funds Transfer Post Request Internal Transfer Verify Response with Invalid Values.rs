<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create Funds Transfer Post Request Internal Transfer Verify Response with Invalid Values</name>
   <tag></tag>
   <elementGuidId>79e8338e-8b03-41b1-b696-80da981a8990</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;createFundsTransferDepositAccountServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;companyNbr\&quot;: 113243,\n        \&quot;paymentType\&quot;: \&quot;TRSDFS\&quot;,\n        \&quot;productCd\&quot;: \&quot;DDADGDFG\&quot;,\n        \&quot;accountNbr\&quot;: \&quot;3FGDG\&quot;,\n        \&quot;period\&quot;: \&quot;MDGDFG\&quot;,\n        \&quot;frequency\&quot;: 0002343534,\n        \&quot;startDate\&quot;: \&quot; \&quot;,\n        \&quot;expiryDate\&quot;: \&quot; \&quot;,\n        \&quot;nonBusDayException\&quot;: \&quot; \&quot;,\n        \&quot;holdCode\&quot;: \&quot; \&quot;,\n        \&quot;variable\&quot;: \&quot; \&quot;,\n        \&quot;amount\&quot;: 100345345345,\n        \&quot;partial\&quot;: \&quot; \&quot;,\n        \&quot;minimum\&quot;: 05345345,\n        \&quot;maximum\&quot;: 0453453,\n        \&quot;target\&quot;: 0435345,\n        \&quot;destinationTransitRouting\&quot;: 03453535,\n        \&quot;destinationAccountType\&quot;: \&quot;CDAGSDFBHDFGH\&quot;,\n        \&quot;destinationAccountNbr\&quot;: \&quot;390034345346\&quot;,\n        \&quot;destinationCurrency\&quot;: \&quot; \&quot;,\n        \&quot;destinationCompanyNbr\&quot;: 045345345,\n        \&quot;shortName\&quot;: \&quot; \&quot;,\n        \&quot;otherInfo\&quot;: \&quot; \&quot;\n      }\n    }\n  }\n}&quot;,
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
   <restUrl>https://20.14.209.1:9443/createFundsTransferDepositAccount/createFundsTransferDepositAccount?</restUrl>
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
