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

response = WS.sendRequest(findTestObject('GetCustomerProfile/GetCustomerProfile_Verify_Response__with_Invalid_Values'))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, 'CustomerprofileOperationResponse.RESPONSE.Output.xStatus.applicationCd', applicationCd)

WS.verifyElementPropertyValue(response, 'CustomerprofileOperationResponse.RESPONSE.Output.xStatus.statusCd', statusCd)

WS.verifyElementPropertyValue(response, 'CustomerprofileOperationResponse.RESPONSE.Output.xStatus.statusMessage', statusMessage)

WS.verifyElementPropertyValue(response, 'CustomerprofileOperationResponse.RESPONSE.Output.xStatus.severity', severity)


WS.verifyElementPropertyValue(response, 'CustomerprofileOperationResponse.RESPONSE.Output.customerCompanyNbr', customerCompanyNbr)

WS.verifyElementPropertyValue(response, 'CustomerprofileOperationResponse.RESPONSE.Output.customerNbr', customerNbr)

WS.verifyElementPropertyValue(response, 'CustomerprofileOperationResponse.RESPONSE.Output.householdNbr', householdNbr)

WS.verifyElementPropertyValue(response, 'CustomerprofileOperationResponse.RESPONSE.Output.customerCostCenterNbr', customerCostCenterNbr)

WS.verifyElementPropertyValue(response, 'CustomerprofileOperationResponse.RESPONSE.Output.customerBranchNbr', customerBranchNbr)

WS.verifyElementPropertyValue(response, 'CustomerprofileOperationResponse.RESPONSE.Output.accountInformation[0].companyNbr', companyNbr)

WS.verifyElementPropertyValue(response, 'CustomerprofileOperationResponse.RESPONSE.Output.accountInformation[0].currentBalanceAmt', currentBalanceAmt)

WS.verifyElementPropertyValue(response, 'CustomerprofileOperationResponse.RESPONSE.Output.accountInformation[0].ownershipPercent', ownershipPercent)

WS.verifyElementPropertyValue(response, 'CustomerprofileOperationResponse.RESPONSE.Output.aliasInfo[0].aliasCompanyNbr', aliasCompanyNbr)

WS.verifyElementPropertyValue(response, 'CustomerprofileOperationResponse.RESPONSE.Output.aliasInfo[0].aliasTie', aliasTie)

WS.verifyElementPropertyValue(response, 'CustomerprofileOperationResponse.RESPONSE.Output.csCrRptScor', csCrRptScor)

WS.verifyElementPropertyValue(response, 'CustomerprofileOperationResponse.RESPONSE.Output.csWoCrRptScr', csWoCrRptScr)

