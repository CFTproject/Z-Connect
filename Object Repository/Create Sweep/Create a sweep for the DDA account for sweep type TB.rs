<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create a sweep for the DDA account for sweep type TB</name>
   <tag></tag>
   <elementGuidId>03610416-7001-4874-b0da-b6af19cdb19d</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;createSweepServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;companyNbr\&quot;: ${companyNbr},\n        \&quot;sweepType\&quot;: \&quot;${sweepType}\&quot;,\n        \&quot;originatingCompanyNbr\&quot;: ${originatingCompanyNbr},\n        \&quot;originatingAccountNbr\&quot;: ${originatingAccountNbr},\n        \&quot;sweepSequenceNbr\&quot;: ${sweepSequenceNbr},\n        \&quot;relatedCompanyNbr\&quot;: ${relatedCompanyNbr},\n        \&quot;relatedProductCd\&quot;: \&quot;${relatedProductCd}\&quot;,\n        \&quot;relatedAccountNbr\&quot;: ${relatedAccountNbr},\n        \&quot;relatedExecSequenceNbr\&quot;: ${relatedExecSequenceNbr},\n        \&quot;executionProcSeqCd\&quot;: \&quot;${executionProcSeqCd}\&quot;,\n        \&quot;sweepStatus\&quot;: \&quot;${sweepStatus}\&quot;,\n        \&quot;ownershipCd\&quot;: \&quot;${ownershipCd}\&quot;,\n        \&quot;protectionAcctBalanceCd\&quot;: \&quot;${protectionAcctBalanceCd}\&quot;,\n        \&quot;balanceCd\&quot;: \&quot;${balanceCd}\&quot;,\n        \&quot;instructionCd\&quot;: \&quot;${instructionCd}\&quot;,\n        \&quot;targetAmt\&quot;: ${targetAmt},\n        \&quot;minimumBalance\&quot;: ${minimumBalance},\n        \&quot;maximumBalance\&quot;: ${maximumBalance},\n        \&quot;varianceAmt\&quot;: ${varianceAmt},\n        \&quot;incrementAmt\&quot;: ${incrementAmt},\n        \&quot;suspendExcess\&quot;: \&quot;${suspendExcess}\&quot;,\n        \&quot;dailyLimitAmt\&quot;: ${dailyLimitAmt},\n        \&quot;globalAvailableInd\&quot;: \&quot;${globalAvailableInd}\&quot;,\n      }\n    }\n  }\n}&quot;,
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
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>System</name>
      <type>Main</type>
      <value>zosapifnon</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://20.14.209.1:9443/createSweep/createSweep?</restUrl>
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
