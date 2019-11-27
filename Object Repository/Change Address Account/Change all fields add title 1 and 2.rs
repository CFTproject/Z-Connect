<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Change all fields add title 1 and 2</name>
   <tag></tag>
   <elementGuidId>0cdbb329-3c21-4405-b04b-5c38bc03c358</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;changeAddressAccountServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;actionCd\&quot;: \&quot;${actionCd}\&quot;,\n        \&quot;accountProductCd\&quot;: \&quot;${accountProductCd}\&quot;,\n        \&quot;accountNbr\&quot;: \&quot;${accountNbr}\&quot;,\n        \&quot;useCd\&quot;: \&quot;${useCd}\&quot;,\n        \&quot;sequence\&quot;: ${sequence},\n        \&quot;accountTitle1\&quot;: \&quot;${accountTitle1}\&quot;,\n        \&quot;accountTitle2\&quot;: \&quot;${accountTitle2}\&quot;,\n        \&quot;accountTitle3\&quot;: \&quot;${accountTitle3}\&quot;,\n        \&quot;addressLine1\&quot;: \&quot;${addressLine1}\&quot;,\n        \&quot;city\&quot;: \&quot;${city}\&quot;,\n        \&quot;postalCd\&quot;: \&quot;${postalCd}\&quot;\n      }\n    }\n  }\n}&quot;,
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
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Address Account_TestData').getValue(2, 1)</defaultValue>
      <description></description>
      <id>c92b0e4e-e717-4ed6-bb8d-8d5f32794dda</id>
      <masked>false</masked>
      <name>actionCd</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Address Account_TestData').getValue(3, 1)</defaultValue>
      <description></description>
      <id>cc65aa20-aada-487d-b599-cef58b3388de</id>
      <masked>false</masked>
      <name>accountProductCd</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Address Account_TestData').getValue(4, 1)</defaultValue>
      <description></description>
      <id>a7a52cee-6f6b-4905-bf2e-49a299bbc29d</id>
      <masked>false</masked>
      <name>accountNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Address Account_TestData').getValue(5, 1)</defaultValue>
      <description></description>
      <id>cfa777b2-fda5-48e5-9b5e-efe0575232c5</id>
      <masked>false</masked>
      <name>useCd</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Address Account_TestData').getValue(6, 1)</defaultValue>
      <description></description>
      <id>d4a72cd0-b87d-4e52-86fe-125e310a7d6d</id>
      <masked>false</masked>
      <name>sequence</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Address Account_TestData').getValue(7, 1)</defaultValue>
      <description></description>
      <id>7ca5111d-bd97-48c2-abc5-889a50e5ae4e</id>
      <masked>false</masked>
      <name>accountTitle1</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Address Account_TestData').getValue(8, 1)</defaultValue>
      <description></description>
      <id>f9b98691-be03-4551-945d-ce40fedc26c8</id>
      <masked>false</masked>
      <name>addressLine1</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Address Account_TestData').getValue(9, 1)</defaultValue>
      <description></description>
      <id>e999ca41-11fc-4469-870c-c2833edcede4</id>
      <masked>false</masked>
      <name>addressLine2</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Address Account_TestData').getValue(10, 1)</defaultValue>
      <description></description>
      <id>a80d960d-5941-47b0-b1b7-1c564bb36181</id>
      <masked>false</masked>
      <name>addressLine3</name>
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
