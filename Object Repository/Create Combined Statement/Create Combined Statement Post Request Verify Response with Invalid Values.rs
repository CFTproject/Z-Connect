<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create Combined Statement Post Request Verify Response with Invalid Values</name>
   <tag></tag>
   <elementGuidId>db26f280-c18c-4c55-a87a-e0f0a524ed24</elementGuidId>
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
      <defaultValue>findTestData('Z-Connect Test Data/Create Combined Statement_TestData').getValue(2, 3)</defaultValue>
      <description></description>
      <id>cb4947ae-949b-490d-9d1a-360594ca63d4</id>
      <masked>false</masked>
      <name>companyNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Combined Statement_TestData').getValue(3, 3)</defaultValue>
      <description></description>
      <id>80d2a9a6-52ad-4f24-b324-c9adce9e97b2</id>
      <masked>false</masked>
      <name>accountType</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Combined Statement_TestData').getValue(4, 3)</defaultValue>
      <description></description>
      <id>bd444a24-556f-4956-8900-de64732676ec</id>
      <masked>false</masked>
      <name>accountNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Combined Statement_TestData').getValue(5, 3)</defaultValue>
      <description></description>
      <id>25a23190-603b-43e6-b2ce-a6acd7420ac0</id>
      <masked>false</masked>
      <name>MA_actionCd</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Combined Statement_TestData').getValue(6, 3)</defaultValue>
      <description></description>
      <id>5e6375cc-6c94-45dc-913a-4199b2903e4f</id>
      <masked>false</masked>
      <name>MA_companyNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Combined Statement_TestData').getValue(7, 3)</defaultValue>
      <description></description>
      <id>c645d250-e6fe-4fb0-8da6-1b689dff7313</id>
      <masked>false</masked>
      <name>MA_accountNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Combined Statement_TestData').getValue(8, 3)</defaultValue>
      <description></description>
      <id>17e1ec50-fa8f-4e99-b26f-99a684fe602f</id>
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
