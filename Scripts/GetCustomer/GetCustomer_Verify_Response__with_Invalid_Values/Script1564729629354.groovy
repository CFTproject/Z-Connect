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

response = WS.sendRequest(findTestObject('GetCustomer/GetCustomer_Verify_Response__with_Invalid_Values'))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, 'GetCustomerServiceOperationResponse.RESPONSE.Output.xStatus.applicationCd', applicationCd)

WS.verifyElementPropertyValue(response, 'GetCustomerServiceOperationResponse.RESPONSE.Output.xStatus.statusCd', statusCd)

WS.verifyElementPropertyValue(response, 'GetCustomerServiceOperationResponse.RESPONSE.Output.xStatus.statusMessage', statusMessage)

WS.verifyElementPropertyValue(response, 'GetCustomerServiceOperationResponse.RESPONSE.Output.xStatus.severity', severity)


WS.verifyElementPropertyValue(response, 'GetCustomerServiceOperationResponse.RESPONSE.Output.contactOffset', contactOffset)

WS.verifyElementPropertyValue(response, 'GetCustomerServiceOperationResponse.RESPONSE.Output.contactLimit', contactLimit)

WS.verifyElementPropertyValue(response, 'GetCustomerServiceOperationResponse.RESPONSE.Output.relcusOffset', relcusOffset)

WS.verifyElementPropertyValue(response, 'GetCustomerServiceOperationResponse.RESPONSE.Output.relcusLimit', relcusLimit)

WS.verifyElementPropertyValue(response, 'GetCustomerServiceOperationResponse.RESPONSE.Output.relacctOffset', relacctOffset)

WS.verifyElementPropertyValue(response, 'GetCustomerServiceOperationResponse.RESPONSE.Output.relacctLimit', relacctLimit)

WS.verifyElementPropertyValue(response, 'GetCustomerServiceOperationResponse.RESPONSE.Output.customerCompanyNbr', customerCompanyNbr)

WS.verifyElementPropertyValue(response, 'GetCustomerServiceOperationResponse.RESPONSE.Output.customerTie', customerTie)

WS.verifyElementPropertyValue(response, 'GetCustomerServiceOperationResponse.RESPONSE.Output.customerNbr', customerNbr)

WS.verifyElementPropertyValue(response, 'GetCustomerServiceOperationResponse.RESPONSE.Output.customerCostCenterNbr', customerCostCenterNbr)

WS.verifyElementPropertyValue(response, 'GetCustomerServiceOperationResponse.RESPONSE.Output.customerBranchNbr', customerBranchNbr)

WS.verifyElementPropertyValue(response, 'GetCustomerServiceOperationResponse.RESPONSE.Output.sensitivityCode', sensitivityCode)

WS.verifyElementPropertyValue(response, 'GetCustomerServiceOperationResponse.RESPONSE.Output.commercialContactInfo[0].contactSeq', contactSeq)


WS.verifyElementPropertyValue(response, 'GetCustomerServiceOperationResponse.RESPONSE.Output.relatedCustomerInfo[0].companyNbr', relatedCustomerInfo_companyNbr)

WS.verifyElementPropertyValue(response, 'GetCustomerServiceOperationResponse.RESPONSE.Output.relatedCustomerInfo[0].tie', relatedCustomerInfo_tie)

WS.verifyElementPropertyValue(response, 'GetCustomerServiceOperationResponse.RESPONSE.Output.relatedCustomerInfo[0].ownershipPercent', relatedCustomerInfo_ownershipPercent)

WS.verifyElementPropertyValue(response, 'GetCustomerServiceOperationResponse.RESPONSE.Output.relatedAccountInfo[0].companyNbr', relatedAccountInfo_companyNbr)

WS.verifyElementPropertyValue(response, 'GetCustomerServiceOperationResponse.RESPONSE.Output.relatedAccountInfo[0].ownershipPercent', relatedAccountInfo_ownershipPercent)

