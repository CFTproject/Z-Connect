import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

response = WS.sendRequest(findTestObject('GetCustomerList/GetCustomerList_Verify_Response_with_valid_Values'))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, 'CustomerlistOperationResponse.RESPONSE.Output.xStatus.applicationCd', applicationCd)

WS.verifyElementPropertyValue(response, 'CustomerlistOperationResponse.RESPONSE.Output.xStatus.statusCd', statusCd)

WS.verifyElementPropertyValue(response, 'CustomerlistOperationResponse.RESPONSE.Output.xStatus.statusMessage', statusMessage)

WS.verifyElementPropertyValue(response, 'CustomerlistOperationResponse.RESPONSE.Output.xStatus.severity', severity)

WS.verifyElementPropertyValue(response, 'CustomerlistOperationResponse.RESPONSE.Output.offset', offset)

WS.verifyElementPropertyValue(response, 'CustomerlistOperationResponse.RESPONSE.Output.limit', limit)

WS.verifyElementPropertyValue(response, 'CustomerlistOperationResponse.RESPONSE.Output.customerInfo[4].customerCompanyNbr', customerCompanyNbr)

WS.verifyElementPropertyValue(response, 'CustomerlistOperationResponse.RESPONSE.Output.customerInfo[4].customerNameLine1', customerNameLine1)

WS.verifyElementPropertyValue(response, 'CustomerlistOperationResponse.RESPONSE.Output.customerInfo[4].customerKey', customerKey)

WS.verifyElementPropertyValue(response, 'CustomerlistOperationResponse.RESPONSE.Output.customerInfo[4].tieBreakerNbr', tieBreakerNbr)

WS.verifyElementPropertyValue(response, 'CustomerlistOperationResponse.RESPONSE.Output.customerInfo[4].customerNbr', customerNbr)

WS.verifyElementPropertyValue(response, 'CustomerlistOperationResponse.RESPONSE.Output.customerInfo[4].taxPayerNbr', taxPayerNbr)

WS.verifyElementPropertyValue(response, 'CustomerlistOperationResponse.RESPONSE.Output.customerInfo[4].customerAddressLine1', customerAddressLine1)

WS.verifyElementPropertyValue(response, 'CustomerlistOperationResponse.RESPONSE.Output.customerInfo[4].customerAddressLine2', customerAddressLine2)

WS.verifyElementPropertyValue(response, 'CustomerlistOperationResponse.RESPONSE.Output.customerInfo[4].customerAddressLine3', customerAddressLine3)

WS.verifyElementPropertyValue(response, 'CustomerlistOperationResponse.RESPONSE.Output.customerInfo[4].customerCity', customerCity)

WS.verifyElementPropertyValue(response, 'CustomerlistOperationResponse.RESPONSE.Output.customerInfo[4].customerState', customerState)

WS.verifyElementPropertyValue(response, 'CustomerlistOperationResponse.RESPONSE.Output.customerInfo[4].customerPostalCode', customerPostalCode)

WS.verifyElementPropertyValue(response, 'CustomerlistOperationResponse.RESPONSE.Output.customerInfo[4].customerCountryCd', customerCountryCd)

WS.verifyElementPropertyValue(response, 'CustomerlistOperationResponse.RESPONSE.Output.customerInfo[4].birthDt', birthDt)


