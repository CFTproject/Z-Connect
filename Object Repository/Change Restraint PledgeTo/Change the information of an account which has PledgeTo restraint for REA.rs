<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Change the information of an account which has PledgeTo restraint for REA</name>
   <tag></tag>
   <elementGuidId>addb6d95-c42a-4234-a438-a4a61c1df0fc</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;changeRestraintPledgeToServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;restraintPldgKeyCompanyNbr\&quot;: 11,\n        \&quot;restraintPldgKeyProductCode\&quot;: \&quot;REA\&quot;,\n        \&quot;restraintPldgKeyAccountNbr\&quot;: 123,\n        \&quot;restraintPldgKeyType\&quot;: 2,\n        \&quot;restraintPldgVarKeyExpireDt\&quot;: \&quot;2020-12-31\&quot;,\n        \&quot;restraintPldgVarKeyPlacedDt\&quot;: \&quot;2017-05-18\&quot;,\n        \&quot;restraintPldgVarKeySequenceNbr\&quot;: 2,\n        \&quot;restraintPldgToProductCode\&quot;: \&quot;DDA\&quot;,\n        \&quot;restraintPldgToAccountNbr\&quot;: 123,\n        \&quot;restraintPldgCurrentPldgAmt\&quot;: 200.00,\n        \&quot;restraintPldgComment1\&quot;: \&quot;COMMENT1COMMENT1\&quot;,\n        \&quot;restraintPldgComment2\&quot;: \&quot;COMMENT2COMMENT1\&quot;,\n        \&quot;restraintPldgReason1\&quot;: \&quot;REASON1COMMENT1\&quot;,\n        \&quot;restraintPldgReason2\&quot;: \&quot;REASON2COMMENT1\&quot;\n      }\n    }\n  }\n}&quot;,
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
   <restUrl>https://20.14.209.1:9443/changeRestraintPledgeTo/changeRestraintPledgeTo?</restUrl>
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
