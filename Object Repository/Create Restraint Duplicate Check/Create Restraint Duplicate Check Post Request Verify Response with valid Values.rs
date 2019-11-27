<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create Restraint Duplicate Check Post Request Verify Response with valid Values</name>
   <tag></tag>
   <elementGuidId>79911f1a-2dca-4b85-ae40-bcfd9ca8180d</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;createRestraintDuplicateCheckServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;restraintDupKeyCompanyNbr\&quot;: ${rDupKeyCompanyNbr},\n        \&quot;restraintDupKeyProductCode\&quot;: \&quot;${rDupKeyProductCode}\&quot;,\n        \&quot;restraintDupKeyAccountNbr\&quot;: ${rDupKeyAccountNbr},\n        \&quot;restraintDupVarKeyLowCheckNbr\&quot;: ${rDupVarKeyLowCheckNbr},\n        \&quot;restraintDupVarKeyHighCheckNbr\&quot;: ${rDupVarKeyHighCheckNbr},\n        \&quot;restraintDupVarKeyExpireDt\&quot;: \&quot;${rDupVarKeyExpireDt}\&quot;,\n        \&quot;restraintDupStatus\&quot;: \&quot;${rDupStatus}\&quot;,\n        \&quot;restraintDupDuplicateCd\&quot;: \&quot;${rDupDuplicateCd}\&quot;,\n        \&quot;restraintDupCheckDate\&quot;: \&quot;${rDupCheckDate}\&quot;,\n        \&quot;restraintDupOutstandingNbr\&quot;: ${rDupOutstandingNbr},\n        \&quot;restraintDupChecksPaidNbr\&quot;: ${rDupChecksPaidNbr},\n        \&quot;restraintDupComment1\&quot;: \&quot;${rDupComment1}\&quot;,\n        \&quot;restraintDupComment2\&quot;: \&quot;${rDupComment2}\&quot;,\n        \&quot;restraintDupReason1\&quot;: \&quot;${rDupReason1}\&quot;,\n        \&quot;restraintDupReason2\&quot;: \&quot;${rDupReason2}\&quot;,\n        \&quot;restraintDupChkTermCd\&quot;: \&quot;${rDupChkTermCd}\&quot;,\n        \&quot;restraintDupTerm\&quot;: ${rDupTerm},\n        \&quot;restraintDupRenewNbr\&quot;: ${rDupRenewNbr},\n        \&quot;restraintDupChannel\&quot;: \&quot;${rDupChannel}\&quot;\n      }\n    }\n  }\n}&quot;,
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
   <restUrl>https://20.14.209.1:9443/createRestraintDuplicateCheck/createRestraintDuplicateCheck?</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(2, 1)</defaultValue>
      <description></description>
      <id>b85e4327-8767-44d0-8aa1-208ef4434332</id>
      <masked>false</masked>
      <name>rDupKeyCompanyNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(3, 1)</defaultValue>
      <description></description>
      <id>dff57ad5-12bd-4c60-9168-cad0440cd64b</id>
      <masked>false</masked>
      <name>rDupKeyProductCode</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(4, 1)</defaultValue>
      <description></description>
      <id>b3bf7721-f67a-443d-97b5-561c296270eb</id>
      <masked>false</masked>
      <name>rDupKeyAccountNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(5, 1)</defaultValue>
      <description></description>
      <id>c92371e5-8b2d-43d2-bce6-79999a1c2723</id>
      <masked>false</masked>
      <name>rDupVarKeyLowCheckNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(6, 1)</defaultValue>
      <description></description>
      <id>fbfeae57-c63a-4bc6-83ba-e9eb62af4375</id>
      <masked>false</masked>
      <name>rDupVarKeyHighCheckNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(7, 1)</defaultValue>
      <description></description>
      <id>5722aee9-0e3d-4712-a05b-cb03cbdcbcb2</id>
      <masked>false</masked>
      <name>rDupVarKeyExpireDt</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(8, 1)</defaultValue>
      <description></description>
      <id>92f90686-b0e1-431e-aa58-0ae4fd06b8e8</id>
      <masked>false</masked>
      <name>rDupStatus</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(9, 1)</defaultValue>
      <description></description>
      <id>b7e49a15-dbc8-4d2a-81eb-74ebd8c312b1</id>
      <masked>false</masked>
      <name>rDupDuplicateCd</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(10, 1)</defaultValue>
      <description></description>
      <id>64bf9d54-4653-4cbd-affc-1ff3c298a753</id>
      <masked>false</masked>
      <name>rDupCheckDate</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(11, 1)</defaultValue>
      <description></description>
      <id>400d23b9-56fd-4024-a010-8ff6e63fa116</id>
      <masked>false</masked>
      <name>rDupOutstandingNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(12, 1)</defaultValue>
      <description></description>
      <id>f2361833-348f-467e-ba0f-e2c249162c9f</id>
      <masked>false</masked>
      <name>rDupChecksPaidNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(13, 1)</defaultValue>
      <description></description>
      <id>7faf365a-a7c2-4be8-b83e-1e72674156b9</id>
      <masked>false</masked>
      <name>rDupComment1</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(14, 1)</defaultValue>
      <description></description>
      <id>123f9744-8d59-4115-a3d6-b39ea54fb7da</id>
      <masked>false</masked>
      <name>rDupComment2</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(15, 1)</defaultValue>
      <description></description>
      <id>8bb739ad-6d2e-4ded-8c0b-2459454d049b</id>
      <masked>false</masked>
      <name>rDupReason1</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(16, 1)</defaultValue>
      <description></description>
      <id>09d681ce-69e0-4158-8fdb-f72c86a9e034</id>
      <masked>false</masked>
      <name>rDupReason2</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(17, 1)</defaultValue>
      <description></description>
      <id>77ea82a2-9990-4fe9-8316-5ffc81054d3b</id>
      <masked>false</masked>
      <name>rDupChkTermCd</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(18, 1)</defaultValue>
      <description></description>
      <id>ff612c0c-83af-41ea-b06e-4968f028a0a2</id>
      <masked>false</masked>
      <name>rDupTerm</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(19, 1)</defaultValue>
      <description></description>
      <id>c43fc49c-014a-4c98-997c-5319aecced30</id>
      <masked>false</masked>
      <name>rDupRenewNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(20, 1)</defaultValue>
      <description></description>
      <id>e5c4e249-15e0-40fb-b110-55e2539c8a46</id>
      <masked>false</masked>
      <name>rDupChannel</name>
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
