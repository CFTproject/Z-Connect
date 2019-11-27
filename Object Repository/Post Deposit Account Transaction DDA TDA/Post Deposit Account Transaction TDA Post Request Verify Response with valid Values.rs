<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Post Deposit Account Transaction TDA Post Request Verify Response with valid Values</name>
   <tag></tag>
   <elementGuidId>1d35a423-5fb4-4cd9-872c-af4822f78307</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n\&quot;postDepositAccountTransactionServiceOperation\&quot;: {\n  \&quot;REQUEST\&quot;: {\n    \&quot;Input\&quot;: {\n      \&quot;companyNbr\&quot;: 11,\n      \&quot;accountType\&quot;: \&quot;cda\&quot;,\n      \&quot;accountNbr\&quot;: 111,\n      \&quot;tranCode\&quot;: 3003,\n      \&quot;tranAmt\&quot;: 71.78, \n      \&quot;effectiveDt\&quot;: \&quot; \&quot;,\n      \&quot;gliSource\&quot;: \&quot; \&quot;,\n      \&quot;tranReasonCd\&quot;: \&quot; \&quot;,\n      \&quot;currency\&quot;: \&quot; \&quot;,\n      \&quot;origCurrency\&quot;: \&quot;   \&quot;,\n      \&quot;origCurrencyTransactionAmt\&quot;: 0,\n      \&quot;exchangeRate\&quot;: 0,\n      \&quot;tranDesc\&quot;: \&quot;Test float and xfer to\&quot;,\n      \&quot;tranBranchOfOrigin\&quot;: 0,\n      \&quot;time\&quot;: \&quot;000000\&quot;,\n      \&quot;source\&quot;: \&quot; \&quot;,\n      \&quot;operator\&quot;: \&quot; \&quot;,\n      \&quot;traceId\&quot;: \&quot; \&quot;,\n      \&quot;checkNum\&quot;: 0,\n      \&quot;captureCenter\&quot;: 0,\n      \&quot;adjustedSubproductCd\&quot;: \&quot; \&quot;,\n      \&quot;statementReversalFlag\&quot;: \&quot; \&quot;,\n      \&quot;localDepositItemsCount\&quot;: 0,\n      \&quot;foreignDepositItemsCount\&quot;: 0,\n      \&quot;creditCount\&quot;: 0,\n      \&quot;debitCount\&quot;: 0,\n      \&quot;localFloatAmt\&quot;: 10.00,\n      \&quot;localFloatShortDays\&quot;: 1,\n      \&quot;localFloatLongDays\&quot;: 3,\n      \&quot;outTownFloatAmt\&quot;: 20.00,\n      \&quot;outTownFloatShortDays\&quot;: 2,\n      \&quot;outTownFloatLongDays\&quot;: 4,\n      \&quot;transferToApplicationId\&quot;: 91,\n      \&quot;transferToTranCd\&quot;: 222,\n      \&quot;transferToAccountNbr\&quot;: 223344,\n      \&quot;transferFromApplicationId\&quot;: 0,\n      \&quot;transferFromTranCd\&quot;: 0,\n      \&quot;transferFromAccountNbr\&quot;: 0,\n      \&quot;transferCompanyId\&quot;: 11,\n      \&quot;transferProductCd\&quot;: \&quot;PLS\&quot;,\n      \&quot;transferAccountNumber\&quot;: \&quot;232425\&quot;,\n      \&quot;tranPaycodeAlerts\&quot;: \&quot; \&quot;,\n      \&quot;tranPaycodeBlocks\&quot;: \&quot; \&quot;,\n      \&quot;tranStops\&quot;: \&quot; \&quot;,\n      \&quot;restraintPaycodeAlerts\&quot;: \&quot; \&quot;,\n      \&quot;restraintPaycodeBlocks\&quot;: \&quot; \&quot;,\n      \&quot;overrideTermCd\&quot;: \&quot; \&quot;,\n      \&quot;overrideCreditInterestCd\&quot;: \&quot; \&quot;,\n      \&quot;overrideAnualInterestRate\&quot;: 0,\n      \&quot;overrideTermAmount\&quot;: 0,\n      \&quot;addendumLine01\&quot;: \&quot; \&quot;,\n      \&quot;addendumLine02\&quot;: \&quot; \&quot;,\n      \&quot;addendumLine03\&quot;: \&quot; \&quot; \n     }\n    }\n   }\n  }&quot;,
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
   <restUrl>https://20.14.209.1:9443/postDepositAccountTransaction/postDepositAccountTransaction?</restUrl>
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
