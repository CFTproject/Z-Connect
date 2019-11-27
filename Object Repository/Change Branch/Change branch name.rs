<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Change branch name</name>
   <tag></tag>
   <elementGuidId>4c92b8bc-d13b-4f7b-b6d5-0cbcce38d580</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;changeBranchServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;branchNbr\&quot;: \&quot;${branchNbr}\&quot;,\n        \&quot;owner\&quot;: \&quot;${owner}\&quot;,\n        \&quot;changeControlNbr\&quot;: ${changeControlNbr},\n        \&quot;lastChangeDate\&quot;: \&quot;${lastChangeDate}\&quot;,\n        \&quot;lastChangeTime\&quot;: \&quot;${lastChangeTime}\&quot;,\n        \&quot;branchName\&quot;: \&quot;${branchName}\&quot;\n}}}} &quot;,
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
   <restUrl>https://20.14.209.1:9443/changeBranch/changeBranch?</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(4, 1)</defaultValue>
      <description></description>
      <id>07c89385-0ecc-4613-9872-0246316c0415</id>
      <masked>false</masked>
      <name>branchNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(5, 1)</defaultValue>
      <description></description>
      <id>648ad892-3906-4c09-8901-e5885bee1eba</id>
      <masked>false</masked>
      <name>owner</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(6, 1)</defaultValue>
      <description></description>
      <id>0ff98db4-44d9-4764-9fa5-6dffd545e61c</id>
      <masked>false</masked>
      <name>changeControlNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(7, 1)</defaultValue>
      <description></description>
      <id>a0e3ec35-0dba-4075-be24-a5c091795789</id>
      <masked>false</masked>
      <name>lastChangeDate</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(8, 1)</defaultValue>
      <description></description>
      <id>61fb5dfe-d249-4162-aaf2-47b13bf7d490</id>
      <masked>false</masked>
      <name>lastChangeTime</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(9, 1)</defaultValue>
      <description></description>
      <id>77487768-4810-48df-86d5-c6c51acee3e8</id>
      <masked>false</masked>
      <name>branchName</name>
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
