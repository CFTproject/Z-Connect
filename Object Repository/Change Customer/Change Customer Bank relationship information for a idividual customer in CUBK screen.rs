<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Change Customer Bank relationship information for a idividual customer in CUBK screen</name>
   <tag></tag>
   <elementGuidId>0ea66c5b-0bad-4477-872b-18d23fa18308</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;changeCustomerServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n       \&quot;inputKey\&quot;: \&quot;${inputKey}\&quot;,\n        \&quot;customerTie\&quot;: ${customerTie},\n        \&quot;companyNbr\&quot;: \&quot;${companyNbr}\&quot;,\n        \&quot;employeeInd\&quot;: \&quot;${employeeInd}\&quot;,\n        \&quot;sensitivityCode\&quot;: ${sensitivityCode},\n  \&quot;bankRelationshipInfo\&quot;: [\n          {\n        \&quot;bankRelationshipActionCd\&quot;: \&quot; \&quot;,\n        \&quot;bankRelationshipCd\&quot;: \&quot; \&quot;\n        },\n                   {\n        \&quot;bankRelationshipActionCd\&quot;: \&quot;${bankRelationshipActionCd}\&quot;,\n        \&quot;bankRelationshipCd\&quot;: \&quot;${bankRelationshipCd}\&quot;\n        },\n                   {\n        \&quot;bankRelationshipActionCd\&quot;: \&quot; \&quot;,\n        \&quot;bankRelationshipCd\&quot;: \&quot; \&quot;\n        },\n                   {\n        \&quot;bankRelationshipActionCd\&quot;: \&quot; \&quot;,\n        \&quot;bankRelationshipCd\&quot;: \&quot; \&quot;\n        },\n                   {\n        \&quot;bankRelationshipActionCd\&quot;: \&quot; \&quot;,\n        \&quot;bankRelationshipCd\&quot;: \&quot; \&quot;\n        },\n                   {\n        \&quot;bankRelationshipActionCd\&quot;: \&quot; \&quot;,\n        \&quot;bankRelationshipCd\&quot;: \&quot; \&quot;\n        },\n                   {\n        \&quot;bankRelationshipActionCd\&quot;: \&quot; \&quot;,\n        \&quot;bankRelationshipCd\&quot;: \&quot; \&quot;\n                   },\n                   {\n        \&quot;bankRelationshipActionCd\&quot;: \&quot; \&quot;,\n        \&quot;bankRelationshipCd\&quot;: \&quot; \&quot;\n        },\n                   {\n        \&quot;bankRelationshipActionCd\&quot;: \&quot; \&quot;,\n        \&quot;bankRelationshipCd\&quot;: \&quot; \&quot;\n        },\n                   {\n        \&quot;bankRelationshipActionCd\&quot;: \&quot; \&quot;,\n        \&quot;bankRelationshipCd\&quot;: \&quot; \&quot;\n        },\n         {\n        \&quot;bankRelationshipActionCd\&quot;: \&quot; \&quot;,\n        \&quot;bankRelationshipCd\&quot;: \&quot; \&quot;\n        },\n         {\n        \&quot;bankRelationshipActionCd\&quot;: \&quot; \&quot;,\n        \&quot;bankRelationshipCd\&quot;: \&quot; \&quot;\n        },\n         {\n        \&quot;bankRelationshipActionCd\&quot;: \&quot; \&quot;,\n        \&quot;bankRelationshipCd\&quot;: \&quot; \&quot;\n        },\n         {\n        \&quot;bankRelationshipActionCd\&quot;: \&quot; \&quot;,\n        \&quot;bankRelationshipCd\&quot;: \&quot; \&quot;\n        },\n         {\n        \&quot;bankRelationshipActionCd\&quot;: \&quot; \&quot;,\n        \&quot;bankRelationshipCd\&quot;: \&quot; \&quot;\n        },\n         {\n        \&quot;bankRelationshipActionCd\&quot;: \&quot; \&quot;,\n        \&quot;bankRelationshipCd\&quot;: \&quot; \&quot;\n        },\n         {\n        \&quot;bankRelationshipActionCd\&quot;: \&quot; \&quot;,\n        \&quot;bankRelationshipCd\&quot;: \&quot; \&quot;\n        },\n         {\n        \&quot;bankRelationshipActionCd\&quot;: \&quot; \&quot;,\n        \&quot;bankRelationshipCd\&quot;: \&quot; \&quot;\&quot;\n        },\n         {\n        \&quot;bankRelationshipActionCd\&quot;: \&quot; \&quot;,\n        \&quot;bankRelationshipCd\&quot;: \&quot; \&quot;\n        },\n         {\n        \&quot;bankRelationshipActionCd\&quot;: \&quot; \&quot;,\n        \&quot;bankRelationshipCd\&quot;: \&quot; \&quot;\n        }\n      ]\n       }\n     }\n   }\n}\n&quot;,
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
      <defaultValue>findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(2, 4)</defaultValue>
      <description></description>
      <id>8a5a22a2-408c-44f0-a1dd-bff0b7dddb61</id>
      <masked>false</masked>
      <name>inputKey</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(3, 4)</defaultValue>
      <description></description>
      <id>e399ae18-8fab-43d1-86cb-0168e99cde3b</id>
      <masked>false</masked>
      <name>customerTie</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(4, 4)</defaultValue>
      <description></description>
      <id>50ee0342-93a4-4137-81ff-75f7ddb59e8e</id>
      <masked>false</masked>
      <name>companyNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(6, 4)</defaultValue>
      <description></description>
      <id>fcbc68cc-4cda-4d3c-a7b7-364f7a79c3e5</id>
      <masked>false</masked>
      <name>employeeInd</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(7, 4)</defaultValue>
      <description></description>
      <id>741f810e-819d-47d4-a654-190b1a714756</id>
      <masked>false</masked>
      <name>sensitivityCode</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(8, 4)</defaultValue>
      <description></description>
      <id>613cac1e-9ebe-47ae-9ef3-96e570ed1040</id>
      <masked>false</masked>
      <name>bankRelationshipActionCd</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(9, 4)</defaultValue>
      <description></description>
      <id>b1bc852a-92c4-4563-9c5a-0283fd9c2f29</id>
      <masked>false</masked>
      <name>bankRelationshipCd</name>
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
