<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Delete Restraint PledgeTo for REA type 2</name>
   <tag></tag>
   <elementGuidId>d4425953-eecd-4abf-94db-779f31b9194e</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;deleteRestraintPledgeToServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n          \&quot;companyNbr\&quot;: ${companyNbr},\n          \&quot;productCd\&quot;: \&quot;${productCd}\&quot;,\n          \&quot;accountNbr\&quot;: ${accountNbr},\n          \&quot;pledgeToType\&quot;: ${pledgeToType},\n          \&quot;expireDt\&quot;: \&quot;${expireDt}\&quot;,\n          \&quot;placedDt\&quot;: \&quot;${placedDt}\&quot;,\n          \&quot;sequenceNbr\&quot;: ${sequenceNbr},\n          \&quot;authorizationNbr\&quot;: ${authorizationNbr}\n      }\n    }\n  }\n}&quot;,
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
   <restRequestMethod>DELETE</restRequestMethod>
   <restUrl>https://20.14.209.1:9443/deleteRestraintPledgeTo/deleteRestraintPledgeTo</restUrl>
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
