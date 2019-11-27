<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create Combined Statement Post Request Verify Response with Empty Values</name>
   <tag></tag>
   <elementGuidId>b2bf6d48-9046-464a-8009-cc41e0ffda6d</elementGuidId>
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
      <defaultValue>findTestData('Z-Connect Test Data/Create Combined Statement_TestData').getValue(2, 2)</defaultValue>
      <description></description>
      <id>a725b942-71ed-4d47-b8e9-81d7dacf5dc0</id>
      <masked>false</masked>
      <name>companyNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Combined Statement_TestData').getValue(3, 2)</defaultValue>
      <description></description>
      <id>19cb4d31-92ac-4764-bb0b-cc63f9ffdb41</id>
      <masked>false</masked>
      <name>accountType</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Combined Statement_TestData').getValue(4, 2)</defaultValue>
      <description></description>
      <id>d6c9b4fd-e828-4a7d-af4a-7f838954f60b</id>
      <masked>false</masked>
      <name>accountNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Combined Statement_TestData').getValue(5, 2)</defaultValue>
      <description></description>
      <id>5bcd26b6-8d28-42e5-a38c-d3dc308bfaa0</id>
      <masked>false</masked>
      <name>MA_actionCd</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Combined Statement_TestData').getValue(6, 2)</defaultValue>
      <description></description>
      <id>811bb113-27f4-4415-81ea-515ad1d48fe5</id>
      <masked>false</masked>
      <name>MA_companyNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Combined Statement_TestData').getValue(7, 2)</defaultValue>
      <description></description>
      <id>87e40df4-bf56-48f6-ad77-99af93a31812</id>
      <masked>false</masked>
      <name>MA_accountNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Combined Statement_TestData').getValue(8, 2)</defaultValue>
      <description></description>
      <id>6b06fa3f-1a84-4240-8229-580cf282e37b</id>
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
