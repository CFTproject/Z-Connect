<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Change record with all valid non blank input fields</name>
   <tag></tag>
   <elementGuidId>074850d4-dda0-49d0-b76b-1182f949eb17</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;changeRestraintMerchantAuthServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;restraintMchKeyCompanyNbr\&quot;: ${restraintMchKeyCompanyNbr},\n        \&quot;restraintMchKeyProductCode\&quot;: \&quot;${restraintMchKeyProductCode}\&quot;,\n        \&quot;restraintMchKeyAccountNbr\&quot;: ${restraintMchKeyAccountNbr},\n        \&quot;restraintMchVarKeyExpireDt\&quot;: \&quot;${restraintMchVarKeyExpireDt}\&quot;,\n        \&quot;restraintMchVarKeyPlacedDt\&quot;: \&quot;${restraintMchVarKeyPlacedDt}\&quot;,\n        \&quot;restraintMchVarKeySequenceNbr\&quot;: ${restraintMchVarKeySequenceNbr},\n        \&quot;restraintMchVarKeyMerchAuthNbr\&quot;: ${restraintMchVarKeyMerchAuthNbr},\n        \&quot;restraintMchPlgToAccountNbr\&quot;: ${restraintMchPlgToAccountNbr},\n        \&quot;restraintMchReviewFreq\&quot;: \&quot;${restraintMchReviewFreq}\&quot;,\n        \&quot;restraintMchLastReviewDt\&quot;: \&quot;${restraintMchLastReviewDt}\&quot;,\n        \&quot;restraintMchAuthAmt\&quot;: ${restraintMchAuthAmt},\n        \&quot;restraintMchCommentsLine1\&quot;: \&quot;${restraintMchCommentsLine1}\&quot;,\n        \&quot;restraintMchCommentsLine2\&quot;: \&quot;${restraintMchCommentsLine2}\&quot;,\n        \&quot;restraintMchReasonLine1\&quot;: \&quot;${restraintMchReasonLine1}\&quot;,\n        \&quot;restraintMchReasonLine2\&quot;: \&quot;${restraintMchReasonLine2}\&quot;,\n        \&quot;restraintMchMerchCode\&quot;: ${restraintMchMerchCode}\n      }\n    }\n  }\n}&quot;,
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
   <restUrl>https://20.14.209.1:9443/changeRestraintMerchantAuth/changeRestraintMerchantAuth?</restUrl>
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
