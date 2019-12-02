<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Change DDA account record with blank account no field</name>
   <tag></tag>
   <elementGuidId>373d5280-831a-4b31-aa31-429530e3a892</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;changeDepositAccountDDAServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;companyNbr\&quot;: ${companyNbr},\n        \&quot;accountNumber\&quot;: ${accountNumber},\n        \&quot;accountName\&quot;: \&quot;${accountName}\&quot;,\n      }\n    }\n  }\n}&quot;,
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
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>System</name>
      <type>Main</type>
      <value>zosapiconn</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PATCH</restRequestMethod>
   <restUrl>https://20.14.209.1:9443/changeDepositAccountDDA/changeDepositAccountDDA?</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(2, 1)</defaultValue>
      <description></description>
      <id>bcc261bf-bd7a-4fb6-bbf6-4caf78d4d252</id>
      <masked>false</masked>
      <name>companyNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(3, 1)</defaultValue>
      <description></description>
      <id>0aab447a-0176-4bd7-a9e4-fe7e0d85eb33</id>
      <masked>false</masked>
      <name>accountNumber</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(4, 1)</defaultValue>
      <description></description>
      <id>df788f6b-3055-4269-b5f8-054b94235557</id>
      <masked>false</masked>
      <name>accountName</name>
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
