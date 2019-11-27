<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Closing a closed Acctount</name>
   <tag></tag>
   <elementGuidId>a3ca70fa-56d9-4c6c-b0ca-68f180bac7d3</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;closeDepositAccountDDAServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;companyNbr\&quot;: ${companyNbr},\n        \&quot;accountNbr\&quot;: ${accountNbr},\n        \&quot;typeOfClose\&quot;: \&quot;${typeOfClose}\&quot;,\n        \&quot;closingReason\&quot;: \&quot;${closingReason}\&quot;,\n        \&quot;postInterestOpt\&quot;: \&quot;${postInterestOpt}\&quot;,\n        \&quot;excessActivityOpt\&quot;: \&quot;${excessActivityOpt}\&quot;,\n        \&quot;branchOfOrigin\&quot;: ${branchOfOrigin},\n        \&quot;captureCenter\&quot;: ${captureCenter}, \n        \&quot;outstandingItemAmt\&quot;: ${outstandingItemAmt},\n        \&quot;closingTranCode\&quot;: ${closingTranCode},\n        \&quot;closeoutAmt\&quot;: ${closeoutAmt},\n      }\n    }\n  }\n}&quot;,
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
   <restUrl>https://20.14.209.1:9443/closeDepositAccountDDA/closeDepositAccountDDA</restUrl>
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
