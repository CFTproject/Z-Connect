<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Change ATM OP CL hours</name>
   <tag></tag>
   <elementGuidId>7e615f3d-bb38-4c87-abdc-eb8ed73c995f</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;changeBranchServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: { \n        \&quot;branchNbr\&quot;: \&quot;11111111\&quot;,\n        \&quot;owner\&quot;: \&quot;INT\&quot;,\n        \&quot;changeControlNbr\&quot;: 1,\n        \&quot;lastChangeDate\&quot;: \&quot;2019-07-11\&quot;,\n        \&quot;lastChangeTime\&quot;: \&quot;114717\&quot;,\n        \&quot;atmClosedMondayTime\&quot;: \&quot;1700\&quot;,\n        \&quot;atmOpenTuesdayTime\&quot;: \&quot;0900\&quot;,\n        \&quot;atmClosedTuesdayTime\&quot;: \&quot;1700\&quot;,\n        \&quot;atmOpenWednesdayTime\&quot;: \&quot;0900\&quot;,\n        \&quot;atmClosedWednesdayTime\&quot;: \&quot;1700\&quot;,\n        \&quot;atmOpenThursdayTime\&quot;: \&quot;0900\&quot;,\n        \&quot;atmClosedThursdayTime\&quot;: \&quot;1700\&quot;,\n        \&quot;atmOpenFridayTime\&quot;: \&quot;0900\&quot;,\n        \&quot;atmClosedFridayTime\&quot;: \&quot;1700\&quot;,\n        \&quot;atmOpenSaturdayTime\&quot;: \&quot;0900\&quot;,\n        \&quot;atmClosedSaturdayTime\&quot;: \&quot;1700\&quot;,\n        \&quot;atmOpenSundayTime\&quot;: \&quot;0900\&quot;,\n        \&quot;atmClosedSundayTime\&quot;: \&quot;1500\&quot;\n}}}}&quot;,
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
