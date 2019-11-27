<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create Combined Statement Post Request Verify Response with valid Values</name>
   <tag></tag>
   <elementGuidId>ebb35145-3e24-42e3-a1f0-031cc915d5a1</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;createCombinedStatementServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;companyNbr\&quot;: ${companyNbr},\n        \&quot;accountType\&quot;: \&quot;${accountType}\&quot;,\n        \&quot;accountNbr\&quot;: ${accountNbr},\n        \&quot;addCombinedStatementMasterAccount\&quot;: [\n          {\n            \&quot;actionCd\&quot;: \&quot;${MA_actionCd}\&quot;,\n            \&quot;companyNbr\&quot;: ${MA_companyNbr},\n            \&quot;accountNbr\&quot;: \&quot;${MA_accountNbr}\&quot;,\n            \&quot;accountType\&quot;: \&quot;${MA_accountType}\&quot;\n          },\n          {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n           {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n           {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          }, \n            {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },       \n          {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },         \n          {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n             {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n           {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n             {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n           {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n            {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n           {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },          \n          {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n            {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n            {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n            {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },          \n          {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n           {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n            {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n            {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n           {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n             {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n            {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n             {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n             {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n            {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n            {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n              {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n             {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n           {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n           {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n           {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n             {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n            {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n             {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n            {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n            {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n            {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },  \n          {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n            {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n           {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n            {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n           {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          },\n           {\n            \&quot;actionCd\&quot;: \&quot; \&quot;,\n            \&quot;companyNbr\&quot;: 0,\n            \&quot;accountNbr\&quot;: \&quot; \&quot;,\n            \&quot;accountType\&quot;: \&quot; \&quot;\n          }\n        ]\n      }\n    }\n  }\n}&quot;,
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
   <restUrl>https://20.14.209.1:9443/createCombinedStatement/createCombinedStatement?</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Combined Statement_TestData').getValue(2, 1)</defaultValue>
      <description></description>
      <id>f1bd02fd-dc0a-4957-a918-517f46617c9f</id>
      <masked>false</masked>
      <name>companyNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Combined Statement_TestData').getValue(3, 1)</defaultValue>
      <description></description>
      <id>070a2c5d-91b7-4a7f-bf69-3105e03cab0a</id>
      <masked>false</masked>
      <name>accountType</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Combined Statement_TestData').getValue(4, 1)</defaultValue>
      <description></description>
      <id>badec39a-fd37-458d-89bf-c6da9ed174ae</id>
      <masked>false</masked>
      <name>accountNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Combined Statement_TestData').getValue(5, 1)</defaultValue>
      <description></description>
      <id>1732f8b6-f6e2-467b-a510-c120990cca13</id>
      <masked>false</masked>
      <name>MA_actionCd</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Combined Statement_TestData').getValue(6, 1)</defaultValue>
      <description></description>
      <id>24de5230-e4d9-478a-bb55-89d1843978df</id>
      <masked>false</masked>
      <name>MA_companyNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Combined Statement_TestData').getValue(7, 1)</defaultValue>
      <description></description>
      <id>f38a845d-1b0d-45f4-a989-fceb2dda6295</id>
      <masked>false</masked>
      <name>MA_accountNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Combined Statement_TestData').getValue(8, 1)</defaultValue>
      <description></description>
      <id>98f0afb3-d8c9-40ab-8235-fbd64b780f1b</id>
      <masked>false</masked>
      <name>MA_accountType</name>
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
