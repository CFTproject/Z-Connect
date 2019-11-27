<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>change rst Hardhold REA</name>
   <tag></tag>
   <elementGuidId>90aa5529-9907-4dd7-ac3a-8020fb6f9c6e</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;changeRestraintHardHoldServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;restraintHhKeyCompanyNbr\&quot;: 11,\n        \&quot;restraintHhKeyProductCode\&quot;: \&quot;REA\&quot;,\n        \&quot;restraintHhKeyAccountNbr\&quot;: 1,\n        \&quot;restraintHhKeyType\&quot;: 1,\n        \&quot;restraintHhVarKeyExpireDt\&quot;: \&quot;2023-01-01\&quot;,\n        \&quot;restraintHhVarKeyPlacedDt\&quot;: \&quot;2017-05-18\&quot;,\n        \&quot;restraintHhVarKeySequenceNbr\&quot;: 1,\n        \&quot;restraintHhTypeCd\&quot;: \&quot;AB\&quot;,\n        \&quot;restraintHhReason\&quot;: \&quot;AB\&quot;,\n        \&quot;restraintHhComment1\&quot;: \&quot;Comment1\&quot;,\n        \&quot;restraintHhComment2\&quot;: \&quot;comment2\&quot;,\n        \&quot;restraintHhReason1\&quot;: \&quot;Reason1\&quot;,\n        \&quot;restraintHhReason2\&quot;: \&quot;Reason2\&quot;\n      }\n    }\n  }\n}&quot;,
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
   <restUrl>https://20.14.209.1:9443/changeRestraintHardHold/changeRestraintHardHold?</restUrl>
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
