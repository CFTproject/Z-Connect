<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Change the Combined Statement information of an account</name>
   <tag></tag>
   <elementGuidId>495b1d32-c2b3-4cf9-880e-d1671745a815</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;changeCombinedStatementServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;companyNbr\&quot;: ${companyNbr},\n        \&quot;productCd\&quot;: \&quot;${productCd}\&quot;,\n        \&quot;accountNbr\&quot;: ${accountNbr},\n        \&quot;changeCombinedStatementRelatedAccount\&quot;: [\n          {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n          {\n            \&quot;actionCd\&quot;: \&quot;${actionCd}\&quot;,\n            \&quot;companyNbr\&quot;: ${companyNbr1},\n            \&quot;accountNbr\&quot;: \&quot;${accountNbr1}\&quot;,\n            \&quot;productCd\&quot;: \&quot;${productCd1}\&quot;\n          },\n           {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n           {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          }, \n            {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },       \n          {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },         \n          {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n             {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n           {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n             {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n           {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n            {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n           {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },          \n          {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n            {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n            {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n            {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },          \n          {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n           {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n            {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n            {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n           {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n             {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n            {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n             {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n             {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n            {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n            {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n              {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n             {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n           {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n           {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n           {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n             {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n            {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n             {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n            {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n            {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n            {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },  \n          {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n            {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n           {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n            {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n           {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          },\n           {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;productCd\&quot;: \&quot; \&quot;\n          }\n        ]\n      }\n    }\n  }\n}&quot;,
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
   <restUrl>https://20.14.209.1:9443/changeCombinedStatement/changeCombinedStatement?</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Combined Statement_TestData').getValue(2, 1)</defaultValue>
      <description></description>
      <id>9b700a03-58c5-4b49-bf38-4078113aa404</id>
      <masked>false</masked>
      <name>companyNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Combined Statement_TestData').getValue(3, 1)</defaultValue>
      <description></description>
      <id>d04a8f26-9672-4382-8eb5-581f9a210d56</id>
      <masked>false</masked>
      <name>productCd</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Combined Statement_TestData').getValue(4, 1)</defaultValue>
      <description></description>
      <id>e9f0ab97-7e8a-41d4-8951-9c62a64bd23e</id>
      <masked>false</masked>
      <name>accountNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Combined Statement_TestData').getValue(5, 1)</defaultValue>
      <description></description>
      <id>c9704cb5-361b-4667-ba6f-0fc1eb3c79c6</id>
      <masked>false</masked>
      <name>actionCd</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Combined Statement_TestData').getValue(6, 1)</defaultValue>
      <description></description>
      <id>6a62171b-ee6b-408a-99a6-5e0d4c7ff73e</id>
      <masked>false</masked>
      <name>companyNbr1</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Combined Statement_TestData').getValue(7, 1)</defaultValue>
      <description></description>
      <id>7a9b7e4b-ba4c-4d00-be00-1947f5f8974f</id>
      <masked>false</masked>
      <name>accountNbr1</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Combined Statement_TestData').getValue(8, 1)</defaultValue>
      <description></description>
      <id>0057b635-3056-4ca4-89bc-55625e68969c</id>
      <masked>false</masked>
      <name>productCd1</name>
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
