<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Individual and Business customer creation</name>
   <tag></tag>
   <elementGuidId>bd4331bc-d020-414d-90a0-6b9353154586</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;createCustomerServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;customerCompanyNbr\&quot;: ${customerCompanyNbr},\n        \&quot;customerNameLine1\&quot;: \&quot;${customerNameLine1}\&quot;,\n        \&quot;customerNameLine2\&quot;: \&quot;${customerNameLine2}\&quot;,\n        \&quot;individualBusinessInd\&quot;: \&quot;${individualBusinessInd}\&quot;,\n        \&quot;homePhoneNbr\&quot;: \&quot;${homePhoneNbr}\&quot;,\n        \&quot;businessPhoneNbr\&quot;: \&quot;${businessPhoneNbr}\&quot;,\n        \&quot;contactPhoneNbr\&quot;: \&quot;${contactPhoneNbr}\&quot;,\n        \&quot;contactName\&quot;: \&quot;${contactName}\&quot;,\n        \&quot;birthDt\&quot;: \&quot;${birthDt}\&quot;,\n        \&quot;genderCd\&quot;: \&quot;${genderCd}\&quot;,\n        \&quot;maritalStatusCd\&quot;: \&quot;${maritalStatusCd}\&quot;,\n        \&quot;occupationCd\&quot;: \&quot;${occupationCd}\&quot;,\n        \&quot;employerName\&quot;: \&quot;${employerName}\&quot;,\n        \&quot;customerTypeCd\&quot;: \&quot;${customerTypeCd}\&quot;,\n        \&quot;customerOfficer1Cd\&quot;: \&quot;${customerOfficer1Cd}\&quot;,\n        \&quot;customerOfficer2Cd\&quot;: \&quot;${customerOfficer2Cd}\&quot;,\n        \&quot;emailAddress\&quot;: \&quot;${emailAddress}\&quot;,\n        \&quot;bankRelationships\&quot;: [\n          {\n            \&quot;bankRelationshipCd\&quot;: \&quot;${bankRelationshipCd}\&quot;\n          },\n           {\n            \&quot;bankRelationshipCd\&quot;: \&quot;${bankRelationshipCd}\&quot;\n          },\n           {\n            \&quot;bankRelationshipCd\&quot;: \&quot; \&quot;\n          },\n           {\n            \&quot;bankRelationshipCd\&quot;: \&quot; \&quot;\n          },\n           {\n            \&quot;bankRelationshipCd\&quot;: \&quot; \&quot;\n          },\n           {\n            \&quot;bankRelationshipCd\&quot;: \&quot; \&quot;\n          },\n           {\n            \&quot;bankRelationshipCd\&quot;: \&quot; \&quot;\n          },\n           {\n            \&quot;bankRelationshipCd\&quot;: \&quot; \&quot;\n          }\n        ],\n        \&quot;bankServices\&quot;: [\n          {\n            \&quot;bankServiceCd\&quot;: \&quot;${bankServiceCd}\&quot;\n          },\n          {\n            \&quot;bankServiceCd\&quot;: \&quot;${bankServiceCd}\&quot;\n          },\n          {\n            \&quot;bankServiceCd\&quot;: \&quot; \&quot;\n          },\n          {\n            \&quot;bankServiceCd\&quot;: \&quot; \&quot;\n          },\n          {\n            \&quot;bankServiceCd\&quot;: \&quot; \&quot;\n          },\n          {\n            \&quot;bankServiceCd\&quot;: \&quot; \&quot;\n          },\n          {\n            \&quot;bankServiceCd\&quot;: \&quot; \&quot;\n          },\n          {\n            \&quot;bankServiceCd\&quot;: \&quot; \&quot;\n          }\n        ],\n        \&quot;customerRemarks\&quot;: [\n          {\n            \&quot;remarkTypeCd\&quot;: ${remarkTypeCd},\n            \&quot;remarkStartDt\&quot;: \&quot;${remarkStartDt}\&quot;,\n            \&quot;remarkEndDt\&quot;: \&quot;${remarkEndDt}\&quot;,\n            \&quot;remarkData\&quot;: \&quot;${remarkData}\&quot;\n          },\n          {\n            \&quot;remarkTypeCd\&quot;: 0,\n            \&quot;remarkStartDt\&quot;: \&quot; \&quot;,\n            \&quot;remarkEndDt\&quot;: \&quot; \&quot;,\n            \&quot;remarkData\&quot;: \&quot; \&quot;\n          }\n        ],\n        \&quot;customerIdentification\&quot;: [\n          {\n            \&quot;identTypeCd\&quot;: \&quot;${identTypeCd}\&quot;,\n            \&quot;identDesc\&quot;: \&quot;${identDesc}\&quot;,\n            \&quot;identIssue\&quot;: \&quot;${identIssue}\&quot;,\n            \&quot;identEffDt\&quot;: \&quot;${identEffDt}\&quot;,\n            \&quot;identExpDt\&quot;: \&quot;${identExpDt}\&quot;\n          },\n           {\n            \&quot;identTypeCd\&quot;: \&quot; \&quot;,\n            \&quot;identDesc\&quot;: \&quot; \&quot;,\n            \&quot;identIssue\&quot;: \&quot; \&quot;,\n            \&quot;identEffDt\&quot;: \&quot; \&quot;,\n            \&quot;identExpDt\&quot;: \&quot; \&quot;\n          }\n        ],\n        \&quot;customerAddressLine1\&quot;: \&quot;${customerAddressLine1}\&quot;,\n        \&quot;customerAddressLine2\&quot;: \&quot;${customerAddressLine2}\&quot;,\n        \&quot;customerAddressLine3\&quot;: \&quot;${customerAddressLine3}\&quot;,\n        \&quot;useZipTable\&quot;: \&quot;${useZipTable}\&quot;,\n        \&quot;customerCity\&quot;: \&quot;${customerCity}\&quot;,\n        \&quot;customerState\&quot;: \&quot;${customerState}\&quot;,\n        \&quot;customerPostalCd\&quot;: \&quot;${customerPostalCd}\&quot;,\n        \&quot;customerCountryCd\&quot;: \&quot;${customerCountryCd}\&quot;,\n        \&quot;customerAddressTie\&quot;: ${customerAddressTie},\n        \&quot;addressUseCd\&quot;: \&quot;${addressUseCd}\&quot;,\n        \&quot;sequenceWithinUseCd\&quot;: ${sequenceWithinUseCd},\n        \&quot;addressEffectiveDt\&quot;: \&quot;${addressEffectiveDt}\&quot;,\n        \&quot;addressExpiryDt\&quot;: \&quot;${addressExpiryDt}\&quot;\n      }\n    }\n  }\n}&quot;,
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
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://20.14.209.1:9443/createCustomer/createCustomer?</restUrl>
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
