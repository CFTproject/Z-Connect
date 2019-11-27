<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create Restraint Stop Pay Post Request Verify Response with empty Values</name>
   <tag></tag>
   <elementGuidId>f9c2d0ac-27fb-431a-93cc-dc726a33030c</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;createRestraintStopPayServiceOperation\&quot;: {\n    \&quot;REQUEST\&quot;: {\n      \&quot;Input\&quot;: {\n        \&quot;restraintStpKeyCompanyNbr\&quot;: ${rStpKeyCompanyNbr},\n        \&quot;restraintStpKeyProductCode\&quot;: \&quot;${rStpKeyProductCode}\&quot;,\n        \&quot;restraintStpKeyAccountNbr\&quot;: ${rStpKeyAccountNbr},\n        \&quot;restraintStpKeyType\&quot;: ${rStpKeyType},\n\t   \&quot;restraintStpVarKeyCheckNbrBegin\&quot;: ${StpVarKeyCheckNbrBegin},\n\t   \&quot;restraintStpVarKeyCheckNbrEnd\&quot;: ${rStpVarKeyCheckNbrEnd}, \n\t   \&quot;restraintStpVarKeyAmountBegin\&quot;: ${rStpVarKeyAmountBegin},\n\t   \&quot;restraintStpVarKeyAmountEnd\&quot;: ${rStpVarKeyAmountEnd},\n\t   \&quot;restraintStpVarKeyExpireDt\&quot;: \&quot;${rStpVarKeyExpireDt}\&quot;, \n\t   \&quot;restraintStpCheckDt\&quot;: \&quot;${rStpCheckDt}\&quot;, \n\t   \&quot;restraintStpChargeCd\&quot;: \&quot;${rStpChargeCd}\&quot;, \n\t   \&quot;restraintStpOvrdChgAmt\&quot;: ${rStpOvrdChgAmt}, \n\t   \&quot;restraintStpLastCheckReturnedDt\&quot;: \&quot;${rStpLastCheckReturnedDt}\&quot;, \n\t   \&quot;restraintStpPayee\&quot;: \&quot;${rStpPayee}\&quot;, \n\t   \&quot;restraintStpHitCount\&quot;: ${rStpHitCount},\n\t   \&quot;restraintStpCksOutNbr\&quot;: ${rStpCksOutNbr},\n\t   \&quot;restraintStpComment1\&quot;: \&quot;${rStpComment1}\&quot;,\n\t   \&quot;restraintStpComment2\&quot;: \&quot;${rStpComment2}\&quot;,\n\t   \&quot;restraintStpReason1\&quot;: \&quot;${rStpReason1}\&quot;,\n\t   \&quot;restraintStpReason2\&quot;: \&quot;${rStpReason2}\&quot;,\n\t   \&quot;restraintStpTermCd\&quot;: ${rStpTermCd}, \n\t   \&quot;restraintStpTerm\&quot;: ${rStpTerm}, \n\t   \&quot;restraintStpRenewNbr\&quot;: ${rStpRenewNbr}, \n\t   \&quot;restraintStpChannel\&quot;: ${rStpChannel}, \n      }\n    }\n  }\n}&quot;,
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
   <restUrl>https://20.14.209.1:9443/createRestraintStopPay/createRestraintStopPay?</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(2, 6)</defaultValue>
      <description></description>
      <id>9fec18cf-252e-407c-93f4-6042c86962c6</id>
      <masked>false</masked>
      <name>rStpKeyCompanyNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(3, 6)</defaultValue>
      <description></description>
      <id>a5995a51-04b2-41e3-8d30-4b0a6d97e837</id>
      <masked>false</masked>
      <name>rStpKeyProductCode</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(4, 6)</defaultValue>
      <description></description>
      <id>20d86e46-06a2-4969-972e-aac88c53aa4d</id>
      <masked>false</masked>
      <name>rStpKeyAccountNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(5, 6)</defaultValue>
      <description></description>
      <id>3b395cc1-7c86-4098-b350-ded4cd5e8e2d</id>
      <masked>false</masked>
      <name>rStpKeyType</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(6, 6)</defaultValue>
      <description></description>
      <id>8e6b8415-588e-4a45-98a8-121e05048c37</id>
      <masked>false</masked>
      <name>StpVarKeyCheckNbrBegin</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(7, 6)</defaultValue>
      <description></description>
      <id>bf90c577-2f4d-4114-bd96-a9485f4aaee3</id>
      <masked>false</masked>
      <name>rStpVarKeyCheckNbrEnd</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(8, 6)</defaultValue>
      <description></description>
      <id>920b5cb5-6bce-4243-bc03-732cda3e7495</id>
      <masked>false</masked>
      <name>rStpVarKeyAmountBegin</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(9, 6)</defaultValue>
      <description></description>
      <id>b9e94728-d7ae-4cc9-b711-ef2c7961eda8</id>
      <masked>false</masked>
      <name>rStpVarKeyAmountEnd</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(10, 6)</defaultValue>
      <description></description>
      <id>4cc7c7d9-338d-474f-8954-03fd9aba3296</id>
      <masked>false</masked>
      <name>rStpVarKeyExpireDt</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(11, 6)</defaultValue>
      <description></description>
      <id>4d366b8d-8a0f-4969-8d00-d2a32a38ad6f</id>
      <masked>false</masked>
      <name>rStpCheckDt</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(12, 6)</defaultValue>
      <description></description>
      <id>69c3ec10-8161-4fef-b5b9-bbc863231d37</id>
      <masked>false</masked>
      <name>rStpChargeCd</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(13, 6)</defaultValue>
      <description></description>
      <id>b0ef8a73-4551-4ac6-9a05-378b26e12a50</id>
      <masked>false</masked>
      <name>rStpOvrdChgAmt</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(14, 6)</defaultValue>
      <description></description>
      <id>de387d02-0b8c-49c9-9203-319676ca7eba</id>
      <masked>false</masked>
      <name>rStpLastCheckReturnedDt</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(15, 6)</defaultValue>
      <description></description>
      <id>1d3ec088-1682-492e-9fba-b9d7fd00d4da</id>
      <masked>false</masked>
      <name>rStpPayee</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(16, 6)</defaultValue>
      <description></description>
      <id>6cec87f2-83a6-4e3d-aced-33f03bcbdf70</id>
      <masked>false</masked>
      <name>rStpHitCount</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(17, 6)</defaultValue>
      <description></description>
      <id>5fd4d88a-f12f-406a-9259-16374c137c8f</id>
      <masked>false</masked>
      <name>rStpCksOutNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(18, 6)</defaultValue>
      <description></description>
      <id>0d53f2eb-3999-459c-8eb6-a5403843f2e0</id>
      <masked>false</masked>
      <name>rStpComment1</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(19, 6)</defaultValue>
      <description></description>
      <id>f34bbde0-0331-4860-be36-41a924880953</id>
      <masked>false</masked>
      <name>rStpComment2</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(20, 6)</defaultValue>
      <description></description>
      <id>ee6bec22-a74c-47da-a3d1-b402bee1fe16</id>
      <masked>false</masked>
      <name>rStpReason1</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(21, 6)</defaultValue>
      <description></description>
      <id>fa1d3ff5-9cf0-4827-8abb-9178c3d636b0</id>
      <masked>false</masked>
      <name>rStpReason2</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(22, 6)</defaultValue>
      <description></description>
      <id>747b1c3b-8102-4a87-9923-fa153d2f64c1</id>
      <masked>false</masked>
      <name>rStpTermCd</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(23, 6)</defaultValue>
      <description></description>
      <id>23090e2e-91d1-4b52-9098-e4b6140ea30d</id>
      <masked>false</masked>
      <name>rStpTerm</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(24, 6)</defaultValue>
      <description></description>
      <id>dc521c1c-eaff-4329-833a-5e299b7cbc65</id>
      <masked>false</masked>
      <name>rStpRenewNbr</name>
   </variables>
   <variables>
      <defaultValue>findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(25, 6)</defaultValue>
      <description></description>
      <id>af8b1637-9f57-4771-b689-66a95dc862a6</id>
      <masked>false</masked>
      <name>rStpChannel</name>
   </variables>
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
