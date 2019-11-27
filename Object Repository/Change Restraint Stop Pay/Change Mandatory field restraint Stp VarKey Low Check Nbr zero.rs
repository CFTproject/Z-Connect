<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Change Mandatory field restraint Stp VarKey Low Check Nbr zero</name>
   <tag></tag>
   <elementGuidId>a8128eb9-24a9-412c-8fa8-75a6e1e743c0</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;changeRestraintStopPayServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;restraintStpKeyCompanyNbr\&quot;: ${restraintStpKeyCompanyNbr},\n        \&quot;restraintStpKeyProductCode\&quot;: \&quot;${restraintStpKeyProductCode}\&quot;,\n        \&quot;restraintStpKeyAccountNbr\&quot;: ${restraintStpKeyAccountNbr},\n        \&quot;restraintStpKeyType\&quot;: ${restraintStpKeyType},\n        \&quot;restraintStpVarKeyHighCheckNbr\&quot;: ${restraintStpVarKeyHighCheckNbr},\n        \&quot;restraintStpVarKeyLowCheckNbr\&quot;: ${restraintStpVarKeyLowCheckNbr},\n        \&quot;restraintStpVarKeyHighCheckAmt\&quot;: ${restraintStpVarKeyHighCheckAmt},\n        \&quot;restraintStpVarKeyLowCheckAmt\&quot;: ${restraintStpVarKeyLowCheckAmt},\n        \&quot;restraintStpVarKeyExpireDt\&quot;: \&quot;${restraintStpVarKeyExpireDt}\&quot;,\n        \&quot;restraintStpVarKeyPlacedDt\&quot;: \&quot;${restraintStpVarKeyPlacedDt}\&quot;,\n        \&quot;restraintStpCheckDt\&quot;: ${restraintStpCheckDt},\n        \&quot;restraintStpLastCheckReturnedDt\&quot;: ${restraintStpLastCheckReturnedDt},\n        \&quot;restraintStpPayee\&quot;: ${restraintStpPayee},\n        \&quot;restraintStpChecksoutstandingNbr\&quot;: ${restraintStpChecksoutstandingNbr},\n        \&quot;restraintStpChecksReturnedNbr\&quot;: ${restraintStpChecksReturnedNbr},\n        \&quot;restraintStpComment1\&quot;: ${restraintStpComment1},\n        \&quot;restraintStpComment2\&quot;: ${restraintStpComment2},\n        \&quot;restraintStpReason1\&quot;: ${restraintStpReason1},\n        \&quot;restraintStpReason2\&quot;: ${restraintStpReason2}\n      }\n    }\n  }\n}&quot;,
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
   <restUrl>https://20.14.209.1:9443/changeRestraintStopPay/changeRestraintStopPay?</restUrl>
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
