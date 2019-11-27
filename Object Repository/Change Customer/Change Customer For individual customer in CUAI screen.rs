<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Change Customer For individual customer in CUAI screen</name>
   <tag></tag>
   <elementGuidId>4ceebb96-1e5f-47cc-803a-33918e6c3d34</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;changeCustomerServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;inputKey\&quot;: \&quot;${inputKey}\&quot;,\n        \&quot;customerTie\&quot;: ${customerTie},\n        \&quot;companyNbr\&quot;: \&quot;${companyNbr}\&quot;,\n        \&quot;birthState\&quot;: \&quot;${birthState}\&quot;,\n        \&quot;birthCity\&quot;: \&quot;${birthCity}\&quot;,\n        \&quot;privacyDeliveryDt\&quot;: \&quot;${privacyDeliveryDt}\&quot;,\n        \&quot;privacyFormReceiptDt\&quot;: \&quot;${privacyFormReceiptDt}\&quot;,\n        \&quot;documentNbr\&quot;: \&quot;${documentNbr}\&quot;,\n        \&quot;documentissuePlace\&quot;: \&quot;${documentissuePlace}\&quot;,\n        \&quot;batchNbr\&quot;: \&quot;${batchNbr}\&quot;\n      }\n    }\n  }\n}&quot;,
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
   <restUrl>https://20.14.209.1:9443/changeCustomer/changeCustomer?</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(2, 3)</defaultValue>
      <description></description>
      <id>0653ba5d-7db1-44c4-8a1c-43be43a25ed5</id>
      <masked>false</masked>
      <name>inputKey</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(3, 2)</defaultValue>
      <description></description>
      <id>1f754de3-3564-464e-9894-79d12ed0f3b5</id>
      <masked>false</masked>
      <name>customerTie</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(4, 2)</defaultValue>
      <description></description>
      <id>fcfa0611-edf9-48a7-b461-e7a771233949</id>
      <masked>false</masked>
      <name>companyNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(5, 2)</defaultValue>
      <description></description>
      <id>2900f523-1be7-460b-bd35-12dd45c73ac9</id>
      <masked>false</masked>
      <name>birthState</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(6, 2)</defaultValue>
      <description></description>
      <id>185cf169-479b-433b-be26-84aad20a242b</id>
      <masked>false</masked>
      <name>birthCity</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(7, 2)</defaultValue>
      <description></description>
      <id>2cbaa207-14b1-43d2-9c65-565e49af8b9d</id>
      <masked>false</masked>
      <name>privacyDeliveryDt</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(8, 2)</defaultValue>
      <description></description>
      <id>4078f4a3-76a7-4565-83e9-ff63c9ff6e5f</id>
      <masked>false</masked>
      <name>privacyFormReceiptDt</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(9, 2)</defaultValue>
      <description></description>
      <id>2b48b46e-aac1-42a9-b90d-33ccaa543fc0</id>
      <masked>false</masked>
      <name>documentNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(10, 2)</defaultValue>
      <description></description>
      <id>61f3bfee-9dea-4bd5-88f6-f0ab4e29d138</id>
      <masked>false</masked>
      <name>documentissuePlace</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(11, 2)</defaultValue>
      <description></description>
      <id>43cdd756-c4c9-4162-b27f-5d3900485987</id>
      <masked>false</masked>
      <name>batchNbr</name>
   </variables>
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
