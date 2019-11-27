<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create Restraint Pledge To Post Request Verify Response with empty Values</name>
   <tag></tag>
   <elementGuidId>100d026e-63c5-4f2c-bf06-a543acaf3bc3</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;createRestraintPledgeToServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;restraintPldgKeyCompanyNbr\&quot;: ${rPldgKeyCompanyNbr},\n        \&quot;restraintPldgKeyProductCode\&quot;: \&quot;${rPldgKeyProductCode}\&quot;,\n        \&quot;restraintPldgKeyAccountNbr\&quot;:${rPldgKeyAccountNbr},\n        \&quot;restraintPldgKeyType\&quot;: ${rPldgKeyType},\n        \&quot;restraintPldgVarKeyExpireDt\&quot;: \&quot;${rPldgVarKeyExpireDt}\&quot;,\n        \&quot;restraintPldgVarKeyMrchAuth\&quot;: ${rPldgVarKeyMrchAuth},\n        \&quot;restraintPldgToProdCd\&quot;: \&quot;${rPldgToProdCd}\&quot;,\n        \&quot;restraintPldgToAcctNbr\&quot;: ${rPldgToAcctNbr},\n        \&quot;restraintPldgReviewFreq\&quot;: \&quot;${rPldgReviewFreq}\&quot;,\n        \&quot;restraintPldgLastReviewDt\&quot;: \&quot;${rPldgLastReviewDt}\&quot;,\n        \&quot;restraintPldgOriginalPldgAmt\&quot;: ${rPldgOriginalPldgAmt},\n        \&quot;restraintPldgCurrentPldgAmt\&quot;: ${rPldgCurrentPldgAmt},\n        \&quot;restraintPldgComment1\&quot;: \&quot;${rPldgComment1}\&quot;,\n        \&quot;restraintPldgComment2\&quot;: \&quot;${rPldgComment2}\&quot;,\n        \&quot;restraintPldgReason1\&quot;: \&quot;${rPldgReason1}\&quot;,\n        \&quot;restraintPldgReason2\&quot;: \&quot;${rPldgReason2}\&quot;,\n        \&quot;restraintPldgMerchantCode\&quot;: ${rPldgMerchantCode}\n      }\n    }\n  }\n}&quot;,
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
   <restUrl>https://20.14.209.1:9443/createRestraintPledgeTo/createRestraintPledgeTo?</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(2, 15)</defaultValue>
      <description></description>
      <id>4155d4b4-1235-4672-b5a9-9be27fbe63f1</id>
      <masked>false</masked>
      <name>rPldgKeyCompanyNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(3, 15)</defaultValue>
      <description></description>
      <id>908ee7ce-2781-44d0-958d-221d08c5a664</id>
      <masked>false</masked>
      <name>rPldgKeyProductCode</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(4, 15)</defaultValue>
      <description></description>
      <id>5f9c932f-da4f-4583-b004-4b9e281f379d</id>
      <masked>false</masked>
      <name>rPldgKeyAccountNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(5, 15)</defaultValue>
      <description></description>
      <id>5d1322f7-9602-4e0e-a85b-c39c6e50b543</id>
      <masked>false</masked>
      <name>rPldgKeyType</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(6, 15)</defaultValue>
      <description></description>
      <id>729c5712-ed56-41c5-b841-a74471f212c7</id>
      <masked>false</masked>
      <name>rPldgVarKeyExpireDt</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(7, 15)</defaultValue>
      <description></description>
      <id>56acd6e1-6a8c-40d5-82e7-e4dd4a55f2ef</id>
      <masked>false</masked>
      <name>rPldgVarKeyMrchAuth</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(8, 15)</defaultValue>
      <description></description>
      <id>942977a2-6d0e-4f0f-8dd1-2dd741b99c56</id>
      <masked>false</masked>
      <name>rPldgToProdCd</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(9, 15)</defaultValue>
      <description></description>
      <id>6c834958-e1a9-4367-8af4-12e52a327cd7</id>
      <masked>false</masked>
      <name>rPldgToAcctNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(10, 15)</defaultValue>
      <description></description>
      <id>b3d86312-efea-43df-bc27-b47f1abbbe42</id>
      <masked>false</masked>
      <name>rPldgReviewFreq</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(11, 15)</defaultValue>
      <description></description>
      <id>d112eea7-f562-452b-871d-9e09fe5bc18d</id>
      <masked>false</masked>
      <name>rPldgLastReviewDt</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(12, 15)</defaultValue>
      <description></description>
      <id>b2bc6664-c4c3-4c1b-a1a8-be2404f7d137</id>
      <masked>false</masked>
      <name>rPldgOriginalPldgAmt</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(13, 15)</defaultValue>
      <description></description>
      <id>50f92080-f2ce-408f-a8de-ed9386f486fb</id>
      <masked>false</masked>
      <name>rPldgCurrentPldgAmt</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(14, 15)</defaultValue>
      <description></description>
      <id>eec3bd58-300c-4a99-8c28-8360a0e7dd43</id>
      <masked>false</masked>
      <name>rPldgComment1</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(15, 15)</defaultValue>
      <description></description>
      <id>d701379a-0dde-4dba-9077-34ae8fecd5c5</id>
      <masked>false</masked>
      <name>rPldgComment2</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(16, 15)</defaultValue>
      <description></description>
      <id>5b744d0f-d500-4446-a852-1b8b9881efc9</id>
      <masked>false</masked>
      <name>rPldgReason1</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(17, 15)</defaultValue>
      <description></description>
      <id>957dd662-c3df-4ad2-8592-e45c00727bd7</id>
      <masked>false</masked>
      <name>rPldgReason2</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(18, 15)</defaultValue>
      <description></description>
      <id>01e3efa4-7f49-415b-b9d2-707c0f5df9b6</id>
      <masked>false</masked>
      <name>rPldgMerchantCode</name>
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
