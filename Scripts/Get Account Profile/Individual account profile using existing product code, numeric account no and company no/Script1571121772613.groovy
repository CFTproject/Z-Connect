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

response = WS.sendRequest(findTestObject('Get Account Profile/Individual account profile using existing product code, numeric account no and company no'))

WS.verifyResponseStatusCode(response, 200)
String s = 'getAccountProfileServiceOperationResponse.RESPONSE.Output.xStatus.'

testdatapath = findTestData('Z-Connect Test Data/Get Account Profile_TestData')

for (int i = 4; i < 5; i++) {
    println('EXCEL SHEET ROW NUMBER IS :' + i)
	
WS.verifyElementPropertyValue(response, s+'applicationCd', testdatapath.getValue(2, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.xStatus.statusCd', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(3, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.xStatus.statusMessage', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(4, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.xStatus.severity', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(5, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.accountCompanyNbr', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(6, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.accountProductCd', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(7, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.accountNbr', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(8, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.accountBalance', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(9, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.accountAddressId1', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(10, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.accountAdress1', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(11, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.accountAddressId2', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(12, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.accountAdress2', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(13, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.accountAddressId3', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(14, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.accountAdress3', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(15, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.accountAddressId4', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(16, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.accountAdress4', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(17, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.accountAddressId5', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(18, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.accountAdress5', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(19, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.accountAddressId6', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(20, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.accountAdress6', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(21, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.accountAddressId7', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(22, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.accountAdress7', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(23, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.accountAddressId8', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(24, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.accountAdress8', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(25, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.taxPayerNbr', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(26, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.taxPayerCd', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(27, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.accountLineNr', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(28, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.accountSubPrd', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(29, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.accountStatus', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(30, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.accountCostCenter', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(31, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.accountBranch', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(32, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.accountOpenDt', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(33, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.accountOfficer1Cd', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(34, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.accountOfficer2Cd', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(35, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.accountMaintDt', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(36, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.accountEmployeeInd', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(37, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.accountCountry', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(38, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.accountSensitivity', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(39, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.accountLanguageCd', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(40, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.relatedCustomer[0].relcusCompanyNbr', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(41, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.relatedCustomer[0].relcusCustomer', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(42, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.relatedCustomer[0].relcusTie', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(43, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.relatedCustomer[0].relcusRelation', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(44, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.relatedCustomer[0].relcusApspInd', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(45, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.relatedCustomer[0].relcusOwner', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(46, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.relatedAccount[0].relactCompanyNbr', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(47, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.relatedAccount[0].relactProductCd', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(48, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.relatedAccount[0].relactAccountNbr', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(49, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.relatedAccount[0].relactRelation', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(50, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.relatedAccount[0].relactApspInd', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(51, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.relatedAccount[0].relactOwner', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(52, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.remarkInformation[0].remarkTypeCd', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(53, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.remarkInformation[0].remarkEffectiveDt', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(54, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.remarkInformation[0].remarkExpiryDt', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(55, i))

WS.verifyElementPropertyValue(response, 'getAccountProfileServiceOperationResponse.RESPONSE.Output.remarkInformation[0].remarkData', findTestData('Z-Connect Test Data/Get Account Profile_TestData').getValue(56, i))


    
}


