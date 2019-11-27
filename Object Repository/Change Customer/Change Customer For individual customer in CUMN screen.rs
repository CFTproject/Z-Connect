<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Change Customer For individual customer in CUMN screen</name>
   <tag></tag>
   <elementGuidId>33c41f0c-03a0-418f-a7ac-ab2252c2593a</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;changeCustomerServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;inputKey\&quot;: \&quot;${inputKey}\&quot;,\n        \&quot;customerTie\&quot;: ${customerTie},\n        \&quot;companyNbr\&quot;: \&quot;${companyNbr}\&quot;,\n        \&quot;customerKeyLine2\&quot;: \&quot;${customerKeyLine2}\&quot;,\n        \&quot;employeeInd\&quot;: \&quot;${employeeInd}\&quot;,\n        \&quot;sensitivityCode\&quot;: ${sensitivityCode},\n        \&quot;customerOfficer1Cd\&quot;: \&quot;${customerOfficer1Cd}\&quot;,\n        \&quot;customerOfficer2Cd\&quot;: \&quot;${customerOfficer2Cd}\&quot;,\n        \&quot;employerName\&quot;: \&quot;${employerName}\&quot;,\n        \&quot;homePhoneNbr\&quot;: \&quot;${homePhoneNbr}\&quot;,\n        \&quot;businessPhoneNbr\&quot;: \&quot;${businessPhoneNbr}\&quot;,\n        \&quot;birthDt\&quot;: \&quot;${birthDt}\&quot;,\n        \&quot;genderCd\&quot;: \&quot;${genderCd}\&quot;\n      }\n    }\n  }\n}&quot;,
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
      <defaultValue>findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(2, 1)</defaultValue>
      <description></description>
      <id>c1f6948e-fc87-4679-8378-b0394ffc0a3d</id>
      <masked>false</masked>
      <name>inputKey</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(3, 1)</defaultValue>
      <description></description>
      <id>ea31925a-7dfa-4134-bc7d-6694cfeac24a</id>
      <masked>false</masked>
      <name>customerTie</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(5, 1)</defaultValue>
      <description></description>
      <id>997ade3d-b7c9-4469-ad52-06c0639ab1fd</id>
      <masked>false</masked>
      <name>companyNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(13, 1)</defaultValue>
      <description></description>
      <id>36a3c6f0-af76-464b-8d51-8ce1465c6a85</id>
      <masked>false</masked>
      <name>customerKeyLine2</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(14, 1)</defaultValue>
      <description></description>
      <id>1214fdfc-9c19-46c8-bf06-b860add10a34</id>
      <masked>false</masked>
      <name>employeeInd</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(15, 1)</defaultValue>
      <description></description>
      <id>008f4502-c189-4075-8189-9c2f0c7447e8</id>
      <masked>false</masked>
      <name>sensitivityCode</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(18, 1)</defaultValue>
      <description></description>
      <id>5abaa3e1-9a07-4050-9498-91c79ef5e452</id>
      <masked>false</masked>
      <name>customerOfficer1Cd</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(19, 1)</defaultValue>
      <description></description>
      <id>29e08016-fd08-472a-985e-8f0d797683e7</id>
      <masked>false</masked>
      <name>customerOfficer2Cd</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(20, 1)</defaultValue>
      <description></description>
      <id>1bca1296-7995-44f2-b219-d9ef3da25c78</id>
      <masked>false</masked>
      <name>employerName</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(21, 1)</defaultValue>
      <description></description>
      <id>174e8ced-e733-492c-aec3-2d08dc0497a2</id>
      <masked>false</masked>
      <name>homePhoneNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(22, 1)</defaultValue>
      <description></description>
      <id>54f0c1e0-8276-4757-8af0-283379c82b50</id>
      <masked>false</masked>
      <name>businessPhoneNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(23, 1)</defaultValue>
      <description></description>
      <id>587bda87-da07-437b-b954-51fb71569f77</id>
      <masked>false</masked>
      <name>birthDt</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(24, 1)</defaultValue>
      <description></description>
      <id>f19701c6-2189-4a86-b616-3bd089b103e3</id>
      <masked>false</masked>
      <name>genderCd</name>
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
