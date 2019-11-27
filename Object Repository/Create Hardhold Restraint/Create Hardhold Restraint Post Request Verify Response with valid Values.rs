<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create Hardhold Restraint Post Request Verify Response with valid Values</name>
   <tag></tag>
   <elementGuidId>4d234d94-e25c-4360-8775-6e618b600ff8</elementGuidId>
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
      <defaultValue>findTestData('Z-Connect Test Data/Create Hardhold Restraint_TestData').getValue(2, 1)</defaultValue>
      <description></description>
      <id>4eb8abde-4590-4a4c-b0c6-3c6de0b54c2d</id>
      <masked>false</masked>
      <name>rHhKeyCompanyNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Hardhold Restraint_TestData').getValue(3, 1)</defaultValue>
      <description></description>
      <id>20d35b89-02ff-4eaf-8416-52162c8e7b6d</id>
      <masked>false</masked>
      <name>rHhKeyProductCode</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Hardhold Restraint_TestData').getValue(4, 1)</defaultValue>
      <description></description>
      <id>175204dc-4b91-4a82-892b-c296e95161f9</id>
      <masked>false</masked>
      <name>rHhKeyAccountNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Hardhold Restraint_TestData').getValue(5, 1)</defaultValue>
      <description></description>
      <id>9bab2956-4a62-4f9a-b435-15602ca9c22b</id>
      <masked>false</masked>
      <name>rHhKeyType</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Hardhold Restraint_TestData').getValue(6, 1)</defaultValue>
      <description></description>
      <id>17286645-3bcb-4901-888e-9309c85c23e6</id>
      <masked>false</masked>
      <name>rHhVarKeyExpireDt</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Hardhold Restraint_TestData').getValue(7, 1)</defaultValue>
      <description></description>
      <id>d2f74276-4a44-437a-bd26-80c385dfd7ec</id>
      <masked>false</masked>
      <name>rHhTypeCd</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Hardhold Restraint_TestData').getValue(8, 1)</defaultValue>
      <description></description>
      <id>36efea54-60a0-4f7e-a47c-621d8bca1cdd</id>
      <masked>false</masked>
      <name>rHhReasonCode</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Hardhold Restraint_TestData').getValue(9, 1)</defaultValue>
      <description></description>
      <id>171b47c9-5881-40b9-bf04-c0b95843e900</id>
      <masked>false</masked>
      <name>rHhCommnent1</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Hardhold Restraint_TestData').getValue(10, 1)</defaultValue>
      <description></description>
      <id>73068c6d-cc54-41ee-8f1b-83110ac931ed</id>
      <masked>false</masked>
      <name>rHhComment2</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Hardhold Restraint_TestData').getValue(11, 1)</defaultValue>
      <description></description>
      <id>8d639df0-845e-4237-a801-329d4b3fd5d9</id>
      <masked>false</masked>
      <name>rHhReason1</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Hardhold Restraint_TestData').getValue(12, 1)</defaultValue>
      <description></description>
      <id>9d3ed877-a38c-4b95-81bf-65d5b340eb87</id>
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
