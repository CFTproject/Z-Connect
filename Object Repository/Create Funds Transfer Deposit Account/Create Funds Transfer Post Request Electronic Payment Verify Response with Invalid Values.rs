<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create Funds Transfer Post Request Electronic Payment Verify Response with Invalid Values</name>
   <tag></tag>
   <elementGuidId>291e3f6a-fd26-4cee-9f82-7f444dce9ff8</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;CreateFundsTransferDepositAccountOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;companyNbr\&quot;: 113456,\n        \&quot;paymentType\&quot;: \&quot;EPASXD\&quot;,\n        \&quot;accountType\&quot;: \&quot;DDACDFVG\&quot;,\n        \&quot;accountNbr\&quot;: \&quot;12345345666788908756434332343434\&quot;,\n        \&quot;period\&quot;: \&quot;WSDERF\&quot;,\n        \&quot;frequency\&quot;: 000245678,\n        \&quot;startDate\&quot;: \&quot;2019345-09-02\&quot;,\n        \&quot;expiryDate\&quot;: \&quot;2022456-12-31\&quot;,\n        \&quot;nonBusDayException\&quot;: \&quot;BRTGF\&quot;,\n        \&quot;holdCode\&quot;: \&quot;13456\&quot;,\n        \&quot;variable\&quot;: \&quot;CFVGBH\&quot;,\n        \&quot;amount\&quot;: 10093456,\n        \&quot;partial\&quot;: \&quot;NFVGB\&quot;,\n        \&quot;minimum\&quot;: 10334456,\n        \&quot;maximum\&quot;: 202345,\n        \&quot;target\&quot;: 1004567,\n        \&quot;destinationTransitRouting\&quot;: 11234445677,\n        \&quot;destinationAccountType\&quot;: \&quot;CDADFVGB\&quot;,\n        \&quot;destinationAccountNbr\&quot;: \&quot;456343456\&quot;,\n        \&quot;destinationCurrency\&quot;: \&quot;USDGFVBH\&quot;,\n        \&quot;destinationCompanyNbr\&quot;: 04567,\n        \&quot;shortName\&quot;: \&quot;sanFGVBNHJUYHGBVGF\&quot;,\n        \&quot;otherInfo\&quot;: \&quot;testRFGTYHBNMJUKIOLMKNJ\&quot;\n      }\n    }\n  }\n}&quot;,
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
