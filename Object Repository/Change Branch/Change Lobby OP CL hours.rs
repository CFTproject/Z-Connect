<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Change Lobby OP CL hours</name>
   <tag></tag>
   <elementGuidId>79cd302b-d2fd-4040-92e3-b84e1946b70e</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;changeBranchServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;branchNbr\&quot;: \&quot;${branchNbr}\&quot;,\n        \&quot;owner\&quot;: \&quot;${owner}\&quot;,\n        \&quot;changeControlNbr\&quot;: ${changeControlNbr},\n        \&quot;lastChangeDate\&quot;: \&quot;${lastChangeDate}\&quot;,\n        \&quot;lastChangeTime\&quot;: \&quot;${lastChangeTime}\&quot;,\n        \&quot;lobbyOpenMondayTime\&quot;: \&quot;${lobbyOpenMondayTime}\&quot;,\n        \&quot;lobbyClosedMondayTime\&quot;: \&quot;${lobbyClosedMondayTime}\&quot;,\n        \&quot;lobbyOpenTuesdayTime\&quot;: \&quot;${lobbyOpenTuesdayTime}\&quot;,\n        \&quot;lobbyClosedTuesdayTime\&quot;: \&quot;${lobbyClosedTuesdayTime}\&quot;,\n        \&quot;lobbyOpenWednesdayTime\&quot;: \&quot;${lobbyOpenWednesdayTime}\&quot;,\n        \&quot;lobbyClosedWednesdayTime\&quot;: \&quot;${lobbyClosedWednesdayTime}\&quot;,\n        \&quot;lobbyOpenThursdayTime\&quot;: \&quot;${lobbyOpenThursdayTime}\&quot;,\n        \&quot;lobbyClosedThursdayTime\&quot;: \&quot;${lobbyClosedThursdayTime}\&quot;,\n        \&quot;lobbyOpenFridayTime\&quot;: \&quot;${lobbyOpenFridayTime}\&quot;,\n        \&quot;lobbyClosedFridayTime\&quot;: \&quot;${lobbyClosedFridayTime}\&quot;,\n        \&quot;lobbyOpenSaturdayTime\&quot;: \&quot;${lobbyOpenSaturdayTime}\&quot;,\n        \&quot;lobbyClosedSaturdayTime\&quot;: \&quot;${lobbyClosedSaturdayTime}\&quot;,\n        \&quot;lobbyOpenSundayTime\&quot;: \&quot;${lobbyOpenSundayTime}\&quot;,\n        \&quot;lobbyClosedSundayTime\&quot;: \&quot;${lobbyClosedSundayTime}\&quot;\n}}}}&quot;,
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
