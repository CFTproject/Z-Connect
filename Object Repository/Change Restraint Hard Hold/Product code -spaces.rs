<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Product code -spaces</name>
   <tag></tag>
   <elementGuidId>b66cdba7-8eb1-4bf0-ac6a-396537064f4e</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;changeRestraintHardHoldServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;restraintHhKeyCompanyNbr\&quot;: ${restraintHhKeyCompanyNbr},\n        \&quot;restraintHhKeyProductCode\&quot;: \&quot;${restraintHhKeyProductCode}\&quot;,\n        \&quot;restraintHhKeyAccountNbr\&quot;: ${restraintHhKeyAccountNbr},\n        \&quot;restraintHhKeyType\&quot;: ${restraintHhKeyType},\n        \&quot;restraintHhVarKeyExpireDt\&quot;: \&quot;${restraintHhVarKeyExpireDt}\&quot;,\n        \&quot;restraintHhVarKeyPlacedDt\&quot;: \&quot;${restraintHhVarKeyPlacedDt}\&quot;,\n        \&quot;restraintHhVarKeySequenceNbr\&quot;: ${restraintHhVarKeySequenceNbr},\n        \&quot;restraintHhTypeCd\&quot;: \&quot;${restraintHhTypeCd}\&quot;,\n        \&quot;restraintHhReason\&quot;: \&quot;${restraintHhReason}\&quot;,\n        \&quot;restraintHhComment1\&quot;: \&quot;${restraintHhComment1}\&quot;,\n        \&quot;restraintHhComment2\&quot;: \&quot;${restraintHhComment2}\&quot;,\n        \&quot;restraintHhReason1\&quot;: \&quot;${restraintHhReason1}\&quot;,\n        \&quot;restraintHhReason2\&quot;: \&quot;${restraintHhReason2}\&quot;\n      }\n    }\n  }\n}&quot;,
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
