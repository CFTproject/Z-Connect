<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Change product code and account number for REA</name>
   <tag></tag>
   <elementGuidId>a4bd0248-f2d8-476b-b969-4720e13ada15</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;changeRestraintPledgeToServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;restraintPldgKeyCompanyNbr\&quot;: ${restraintPldgKeyCompanyNbr},\n        \&quot;restraintPldgKeyProductCode\&quot;: \&quot;${restraintPldgKeyProductCode}\&quot;,\n        \&quot;restraintPldgKeyAccountNbr\&quot;: ${restraintPldgKeyAccountNbr},\n        \&quot;restraintPldgKeyType\&quot;: ${restraintPldgKeyType},\n        \&quot;restraintPldgVarKeyExpireDt\&quot;: \&quot;${restraintPldgVarKeyExpireDt}\&quot;,\n        \&quot;restraintPldgVarKeyPlacedDt\&quot;: \&quot;${restraintPldgVarKeyPlacedDt}\&quot;,\n        \&quot;restraintPldgVarKeySequenceNbr\&quot;: ${restraintPldgVarKeySequenceNbr},\n        \&quot;restraintPldgToProductCode\&quot;: \&quot;${restraintPldgToProductCode}\&quot;,\n        \&quot;restraintPldgToAccountNbr\&quot;: ${restraintPldgToAccountNbr},\n        }\n    }\n  }\n}&quot;,
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
