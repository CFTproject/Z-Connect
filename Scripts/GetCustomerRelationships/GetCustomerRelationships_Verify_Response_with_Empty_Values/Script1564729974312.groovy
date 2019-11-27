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

response = WS.sendRequest(findTestObject('GetCustomerRelationships/GetCustomerRelationships_Verify_Response_with_Empty_Values'))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, 'GetCustomerRelationshipsOperationResponse.RESPONSE.Output.xStatus.applicationCd', applicationCd)

WS.verifyElementPropertyValue(response, 'GetCustomerRelationshipsOperationResponse.RESPONSE.Output.xStatus.statusCd', statusCd)

WS.verifyElementPropertyValue(response, 'GetCustomerRelationshipsOperationResponse.RESPONSE.Output.xStatus.statusMessage', statusMessage)

WS.verifyElementPropertyValue(response, 'GetCustomerRelationshipsOperationResponse.RESPONSE.Output.xStatus.severity', severity)

WS.verifyElementPropertyValue(response, 'GetCustomerRelationshipsOperationResponse.RESPONSE.Output.custOffset', custOffset)

WS.verifyElementPropertyValue(response, 'GetCustomerRelationshipsOperationResponse.RESPONSE.Output.custLimit', custLimit)

WS.verifyElementPropertyValue(response, 'GetCustomerRelationshipsOperationResponse.RESPONSE.Output.acctOffset', acctOffset)

WS.verifyElementPropertyValue(response, 'GetCustomerRelationshipsOperationResponse.RESPONSE.Output.acctLimit', acctLimit)

WS.verifyElementPropertyValue(response, 'GetCustomerRelationshipsOperationResponse.RESPONSE.Output.customerCompanyNbr', customerCompanyNbr)

WS.verifyElementPropertyValue(response, 'GetCustomerRelationshipsOperationResponse.RESPONSE.Output.customerTie', customerTie)

WS.verifyElementPropertyValue(response, 'GetCustomerRelationshipsOperationResponse.RESPONSE.Output.customerNbr', customerNbr)

WS.verifyElementPropertyValue(response, 'GetCustomerRelationshipsOperationResponse.RESPONSE.Output.addressCompanyNbr', addressCompanyNbr)

WS.verifyElementPropertyValue(response, 'GetCustomerRelationshipsOperationResponse.RESPONSE.Output.addressTie', addressTie)

WS.verifyElementPropertyValue(response, 'GetCustomerRelationshipsOperationResponse.RESPONSE.Output.householdNbr', householdNbr)

WS.verifyElementPropertyValue(response, 'GetCustomerRelationshipsOperationResponse.RESPONSE.Output.relatedCustomerInfo[0].relcusCompanyNbr', relcusCompanyNbr)

WS.verifyElementPropertyValue(response, 'GetCustomerRelationshipsOperationResponse.RESPONSE.Output.relatedCustomerInfo[0].relcusTie', relcusTie)

WS.verifyElementPropertyValue(response, 'GetCustomerRelationshipsOperationResponse.RESPONSE.Output.relatedCustomerInfo[0].relcusOwner', relcusOwner)

WS.verifyElementPropertyValue(response, 'GetCustomerRelationshipsOperationResponse.RESPONSE.Output.relatedAccountInfo[0].relactCompanyNbr', relactCompanyNbr)

WS.verifyElementPropertyValue(response, 'GetCustomerRelationshipsOperationResponse.RESPONSE.Output.relatedAccountInfo[0].relactOwner', relactOwner)
