<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Change record with non blank input fields Low check no greter than High Check No Invalid placed date</name>
   <tag></tag>
   <elementGuidId>5ca1d545-736a-4ca6-822e-5995982370c3</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;changeRestraintDuplicateCheckServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;restraintDupKeyCompanyNbr\&quot;: ${restraintDupKeyCompanyNbr},\n        \&quot;restraintDupKeyProductCode\&quot;: \&quot;${restraintDupKeyProductCode}\&quot;,\n        \&quot;restraintDupKeyAccountNbr\&quot;: ${restraintDupKeyAccountNbr},\n        \&quot;restraintDupVarKeyLowCheckNbr\&quot;: ${restraintDupVarKeyLowCheckNbr},\n        \&quot;restraintDupVarKeyHighCheckNbr\&quot;: ${restraintDupVarKeyHighCheckNbr},\n        \&quot;restraintDupVarKeyExpireDt\&quot;: \&quot;${restraintDupVarKeyExpireDt}\&quot;,\n        \&quot;restraintDupVarKeyPlacedDt\&quot;: \&quot;${restraintDupVarKeyPlacedDt}\&quot;,\n        \&quot;restraintDupDuplicateCd\&quot;: \&quot;${restraintDupDuplicateCd}\&quot;,\n        \&quot;restraintDupCheckDt\&quot;: \&quot;${restraintDupCheckDt}\&quot;,\n        \&quot;restraintDupChecksOutstandingNbr\&quot;: ${restraintDupChecksOutstandingNbr},\n        \&quot;restraintDupChecksPaidNbr\&quot;: ${restraintDupChecksPaidNbr},\n        \&quot;restraintDupCheckLastPaidDt\&quot;: \&quot;${restraintDupCheckLastPaidDt}\&quot;,\n        \&quot;restraintDupComment1\&quot;: \&quot;${restraintDupComment1}\&quot;,\n        \&quot;restraintDupComment2\&quot;: \&quot;${restraintDupComment2}\&quot;,\n        \&quot;restraintDupReason1\&quot;: \&quot;${restraintDupReason1}\&quot;,\n        \&quot;restraintDupReason2\&quot;: \&quot;${restraintDupReason2}\&quot;,\n      }\n    }\n  }\n}&quot;,
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
   <restUrl>https://20.14.209.1:9443/changeRestraintDuplicateCheck/changeRestraintDuplicateCheck?</restUrl>
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
