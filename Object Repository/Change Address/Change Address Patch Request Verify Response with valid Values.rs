<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Change Address Patch Request Verify Response with valid Values</name>
   <tag></tag>
   <elementGuidId>1cca4c66-d776-4944-8fb3-1ca72e8e19ad</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;changeAddressServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;actionCode\&quot;: \&quot;${actionCode}\&quot;,\n        \&quot;presentAddressLine1\&quot;: \&quot;${presentAddressLine1}\&quot;,\n        \&quot;presentAddressLine2\&quot;: \&quot;${presentAddressLine2}\&quot;,\n        \&quot;presentAddressTie\&quot;: ${presentAddressTie},\n        \&quot;presentPostalCd\&quot;: \&quot;${presentPostalCd}\&quot;,\n        \&quot;chgAddressLine1\&quot;: \&quot;${chgAddressLine1}\&quot;,\n        \&quot;chgAddressLine2\&quot;: \&quot;${chgAddressLine2}\&quot;,\n        \&quot;chgAddressLine3\&quot;: \&quot;${chgAddressLine3}\&quot;,\n        \&quot;chgCity\&quot;: \&quot;${chgCity}\&quot;,\n        \&quot;chgState\&quot;: \&quot;${chgState}\&quot;,\n        \&quot;chgPostalCd\&quot;: \&quot;${chgPostalCd}\&quot;,\n        \&quot;userAcknowledge\&quot;: \&quot;${userAcknowledge}\&quot;\n      }\n    }\n  }\n}&quot;,
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
   <restUrl>https://20.14.209.1:9443/changeAddress/changeAddress?</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Address_TestData').getValue(2, 1)</defaultValue>
      <description></description>
      <id>6bf687ea-c2a2-492d-9cb3-b916e3a285fa</id>
      <masked>false</masked>
      <name>actionCode</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Address_TestData').getValue(3, 1)</defaultValue>
      <description></description>
      <id>99094ee1-d258-4e80-a08a-f0b11f03804c</id>
      <masked>false</masked>
      <name>presentAddressLine1</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Address_TestData').getValue(4, 1)</defaultValue>
      <description></description>
      <id>ac6f2787-c739-402d-a21f-74c9af0eaf70</id>
      <masked>false</masked>
      <name>presentAddressLine2</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Address_TestData').getValue(5, 1)</defaultValue>
      <description></description>
      <id>df87bc66-4a3b-49de-b69e-dbe1327306c6</id>
      <masked>false</masked>
      <name>presentAddressTie</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Address_TestData').getValue(6, 1)</defaultValue>
      <description></description>
      <id>d24f0791-5f36-4a30-83db-cf5a9c704624</id>
      <masked>false</masked>
      <name>presentPostalCd</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Address_TestData').getValue(7, 1)</defaultValue>
      <description></description>
      <id>4cd3a4d4-a77e-43f7-9bdd-0fd0103da5cc</id>
      <masked>false</masked>
      <name>chgAddressLine1</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Address_TestData').getValue(8, 1)</defaultValue>
      <description></description>
      <id>5419aaaa-1663-40dc-beb5-479fb82ea743</id>
      <masked>false</masked>
      <name>chgAddressLine2</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Address_TestData').getValue(9, 1)</defaultValue>
      <description></description>
      <id>c0490e0d-f6ad-4931-8912-a1ebd7129bf3</id>
      <masked>false</masked>
      <name>chgAddressLine3</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Address_TestData').getValue(10, 1)</defaultValue>
      <description></description>
      <id>029c3ae1-423f-4a83-a769-d7ef24842f76</id>
      <masked>false</masked>
      <name>chgCity</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Address_TestData').getValue(11, 1)</defaultValue>
      <description></description>
      <id>5ed5db20-3f75-4ae5-90d7-644d7cc27993</id>
      <masked>false</masked>
      <name>chgState</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Address_TestData').getValue(12, 1)</defaultValue>
      <description></description>
      <id>d40387a7-83a0-4d29-b937-a95d5b6b3f8e</id>
      <masked>false</masked>
      <name>chgPostalCd</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Address_TestData').getValue(13, 1)</defaultValue>
      <description></description>
      <id>45cf7d29-8d62-44d2-87e9-ff33a0e162de</id>
      <masked>false</masked>
      <name>userAcknowledge</name>
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
