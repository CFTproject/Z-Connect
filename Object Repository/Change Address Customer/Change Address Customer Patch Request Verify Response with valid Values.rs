<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Change Address Customer Patch Request Verify Response with valid Values</name>
   <tag></tag>
   <elementGuidId>4f6bf1ee-f320-4cc8-b72b-bd755ad8fcac</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;changeAddressCustomerServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n\t    \&quot;actionCode\&quot;:\&quot;${actionCode}\&quot;,\n        \&quot;customerCompanyNbr\&quot;: ${customerCompanyNbr},\n        \&quot;inputKey\&quot;: \&quot;${inputKey}\&quot;,\n        \&quot;tie\&quot;: ${tie},\n        \&quot;useCd\&quot;: \&quot;${useCd}\&quot;,\n        \&quot;postalCd\&quot;: \&quot;${postalCd}\&quot;,\n        \&quot;addressLine1\&quot;: \&quot;${addressLine1}\&quot;,\n        \&quot;addressLine2\&quot;: \&quot;${addressLine2}\&quot;,\n        \&quot;addressLine3\&quot;: \&quot;${addressLine3}\&quot;,\n        \&quot;addressTie\&quot;: ${addressTie},\n        \&quot;useZipTable\&quot;: \&quot;${useZipTable}\&quot;,\n        \&quot;city\&quot;: \&quot;${city}\&quot;,\n        \&quot;state\&quot;: \&quot;${state}\&quot;\n   }\n    }\n  }\n}&quot;,
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
   <restUrl>https://20.14.209.1:9443/changeAddressCustomer/changeAddressCustomer?</restUrl>
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
