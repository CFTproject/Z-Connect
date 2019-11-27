<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create Hardhold Restraint Post Request Verify Response with Empty Values</name>
   <tag></tag>
   <elementGuidId>ba19ae74-1bcb-4db2-814d-f6ad687983e8</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;createRestraintHardHoldServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;restraintHhKeyCompanyNbr\&quot;: ${rHhKeyCompanyNbr},\n        \&quot;restraintHhKeyProductCode\&quot;: \&quot;${rHhKeyProductCode}\&quot;,\n        \&quot;restraintHhKeyAccountNbr\&quot;: ${rHhKeyAccountNbr},\n        \&quot;restraintHhKeyType\&quot;: ${rHhKeyType},\n        \&quot;restraintHhVarKeyExpireDt\&quot;: \&quot;${rHhVarKeyExpireDt}\&quot;,\n        \&quot;restraintHhTypeCd\&quot;: \&quot;${rHhTypeCd}\&quot;,\n        \&quot;restraintHhReasonCode\&quot;: \&quot;${rHhReasonCode}\&quot;,\n        \&quot;restraintHhCommnent1\&quot;: \&quot;${rHhCommnent1}\&quot;,\n        \&quot;restraintHhComment2\&quot;: \&quot;${rHhComment2}\&quot;,\n        \&quot;restraintHhReason1\&quot;: \&quot;${rHhReason1}\&quot;,\n        \&quot;restraintHhReason2\&quot;: \&quot;${rHhReason2}\&quot;\n      }\n    }\n  }\n}&quot;,
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
   <restUrl>https://20.14.209.1:9443/createRestraintHardHold/createRestraintHardHold?</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Hardhold Restraint_TestData').getValue(2, 9)</defaultValue>
      <description></description>
      <id>7e65b742-b876-4f01-9f61-c5c79498fb7e</id>
      <masked>false</masked>
      <name>rHhKeyCompanyNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Hardhold Restraint_TestData').getValue(3, 9)</defaultValue>
      <description></description>
      <id>ae540c63-e139-408c-ada4-2b029b8593b4</id>
      <masked>false</masked>
      <name>rHhKeyProductCode</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Hardhold Restraint_TestData').getValue(4, 9)</defaultValue>
      <description></description>
      <id>adf3421b-0726-4b41-b2d5-d4bad74d41f0</id>
      <masked>false</masked>
      <name>rHhKeyAccountNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Hardhold Restraint_TestData').getValue(5, 9)</defaultValue>
      <description></description>
      <id>060b9fe2-5159-4687-a9d3-d01401cddfc1</id>
      <masked>false</masked>
      <name>rHhKeyType</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Hardhold Restraint_TestData').getValue(6, 9)</defaultValue>
      <description></description>
      <id>7b426661-b085-4fa9-8355-93be66630271</id>
      <masked>false</masked>
      <name>rHhVarKeyExpireDt</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Hardhold Restraint_TestData').getValue(7, 9)</defaultValue>
      <description></description>
      <id>31bee634-a688-4e07-92e9-6376a1d795bf</id>
      <masked>false</masked>
      <name>rHhTypeCd</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Hardhold Restraint_TestData').getValue(8, 9)</defaultValue>
      <description></description>
      <id>9bd14ab7-2046-4fef-a94f-261427f7c349</id>
      <masked>false</masked>
      <name>rHhReasonCode</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Hardhold Restraint_TestData').getValue(9, 9)</defaultValue>
      <description></description>
      <id>e7c584b2-f419-4d51-b9f5-007e330ddabb</id>
      <masked>false</masked>
      <name>rHhCommnent1</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Hardhold Restraint_TestData').getValue(10, 9)</defaultValue>
      <description></description>
      <id>3d8e72e9-c6d3-4294-82b3-b11fc46bc87f</id>
      <masked>false</masked>
      <name>rHhComment2</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Hardhold Restraint_TestData').getValue(11, 9)</defaultValue>
      <description></description>
      <id>88df86a2-817f-4dcf-b46c-1e7b58c610c8</id>
      <masked>false</masked>
      <name>rHhReason1</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Hardhold Restraint_TestData').getValue(12, 9)</defaultValue>
      <description></description>
      <id>096eef70-7c17-4829-a772-dfb194b6f258</id>
      <masked>false</masked>
      <name>rHhReason2</name>
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
