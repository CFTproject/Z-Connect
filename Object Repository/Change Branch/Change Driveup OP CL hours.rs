<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Change Driveup OP CL hours</name>
   <tag></tag>
   <elementGuidId>15cf9fc3-b927-4505-b1df-9fd4092135a1</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;changeBranchServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;branchNbr\&quot;: \&quot;${branchNbr}\&quot;,\n        \&quot;owner\&quot;: \&quot;${owner}\&quot;,\n        \&quot;changeControlNbr\&quot;: ${changeControlNbr},\n        \&quot;lastChangeDate\&quot;: \&quot;${lastChangeDate}\&quot;,\n        \&quot;lastChangeTime\&quot;: \&quot;${lastChangeTime}\&quot;,\n        \&quot;driveUpOpenMondayTime\&quot;: \&quot;${driveUpOpenMondayTime}\&quot;,\n        \&quot;driveUpClosedMondayTime\&quot;: \&quot;${driveUpClosedMondayTime}\&quot;,\n        \&quot;driveUpOpenTuesdayTime\&quot;: \&quot;${driveUpOpenTuesdayTime}\&quot;,\n        \&quot;driveUpClosedTuesdayTime\&quot;: \&quot;${driveUpClosedTuesdayTime}\&quot;,\n        \&quot;driveUpOpenWednesdayTime\&quot;: \&quot;${driveUpOpenWednesdayTime}\&quot;,\n        \&quot;driveUpClosedWednesdayTime\&quot;: \&quot;${driveUpClosedWednesdayTime}\&quot;,\n        \&quot;driveUpOpenThursdayTime\&quot;: \&quot;${driveUpOpenThursdayTime}\&quot;,\n        \&quot;driveUpClosedThursdayTime\&quot;: \&quot;${driveUpClosedThursdayTime}\&quot;,\n        \&quot;driveUpOpenFridayTime\&quot;: \&quot;${driveUpOpenFridayTime}\&quot;,\n        \&quot;driveUpClosedFridayTime\&quot;: \&quot;${driveUpClosedFridayTime}\&quot;,\n        \&quot;driveUpOpenSaturdayTime\&quot;: \&quot;${driveUpOpenSaturdayTime}\&quot;,\n        \&quot;driveUpClosedSaturdayTime\&quot;: \&quot;${driveUpClosedSaturdayTime}\&quot;,\n        \&quot;driveUpOpenSundayTime\&quot;: \&quot;${driveUpOpenSundayTime}\&quot;,\n        \&quot;driveUpClosedSundayTime\&quot;: \&quot;${driveUpClosedSundayTime}\&quot;\n}}}}&quot;,
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
