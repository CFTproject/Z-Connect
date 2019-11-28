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

String str = 'getAccountProfileServiceOperationResponse.RESPONSE.Output.'

testdatapath = findTestData('Z-Connect Test Data/Get Account Profile_TestData')

response = WS.sendRequest(findTestObject('Get Account Profile/Individual account profile using existing product code and numeric account no'))

WS.verifyResponseStatusCode(response, 200)

for (int i = 3; i < 4; i++) {
    println('EXCEL SHEET ROW NUMBER IS :' + i)

    WS.verifyElementPropertyValue(response, str + 'xStatus.applicationCd', testdatapath.getValue(2, i))

    WS.verifyElementPropertyValue(response, str + 'xStatus.statusCd', testdatapath.getValue(3, i))

    WS.verifyElementPropertyValue(response, str + 'xStatus.statusMessage', testdatapath.getValue(4, i))

    WS.verifyElementPropertyValue(response, str + 'xStatus.severity', testdatapath.getValue(5, i))

    WS.verifyElementPropertyValue(response, str + 'accountCompanyNbr', testdatapath.getValue(6, i))

    WS.verifyElementPropertyValue(response, str + 'accountProductCd', testdatapath.getValue(7, i))

    WS.verifyElementPropertyValue(response, str + 'accountNbr', testdatapath.getValue(8, i))

    WS.verifyElementPropertyValue(response, str + 'accountBalance', testdatapath.getValue(9, i))

    WS.verifyElementPropertyValue(response, str + 'accountAddressId1', testdatapath.getValue(10, i))

    WS.verifyElementPropertyValue(response, str + 'accountAdress1', testdatapath.getValue(11, i))

    WS.verifyElementPropertyValue(response, str + 'accountAddressId2', testdatapath.getValue(12, i))

    WS.verifyElementPropertyValue(response, str + 'accountAdress2', testdatapath.getValue(13, i))

    WS.verifyElementPropertyValue(response, str + 'accountAddressId3', testdatapath.getValue(14, i))

    WS.verifyElementPropertyValue(response, str + 'accountAdress3', testdatapath.getValue(15, i))

    WS.verifyElementPropertyValue(response, str + 'accountAddressId4', testdatapath.getValue(16, i))

    WS.verifyElementPropertyValue(response, str + 'accountAdress4', testdatapath.getValue(17, i))

    WS.verifyElementPropertyValue(response, str + 'accountAddressId5', testdatapath.getValue(18, i))

    WS.verifyElementPropertyValue(response, str + 'accountAdress5', testdatapath.getValue(19, i))

    WS.verifyElementPropertyValue(response, str + 'accountAddressId6', testdatapath.getValue(20, i))

    WS.verifyElementPropertyValue(response, str + 'accountAdress6', testdatapath.getValue(21, i))

    WS.verifyElementPropertyValue(response, str + 'accountAddressId7', testdatapath.getValue(22, i))

    WS.verifyElementPropertyValue(response, str + 'accountAdress7', testdatapath.getValue(23, i))

    WS.verifyElementPropertyValue(response, str + 'accountAddressId8', testdatapath.getValue(24, i))

    WS.verifyElementPropertyValue(response, str + 'accountAdress8', testdatapath.getValue(25, i))

    WS.verifyElementPropertyValue(response, str + 'taxPayerCd', testdatapath.getValue(27, i))

    WS.verifyElementPropertyValue(response, str + 'accountLineNr', testdatapath.getValue(28, i))

    WS.verifyElementPropertyValue(response, str + 'accountSubPrd', testdatapath.getValue(29, i))

    WS.verifyElementPropertyValue(response, str + 'accountStatus', testdatapath.getValue(30, i))

    WS.verifyElementPropertyValue(response, str + 'accountCostCenter', testdatapath.getValue(31, i))

    WS.verifyElementPropertyValue(response, str + 'accountBranch', testdatapath.getValue(32, i))

    WS.verifyElementPropertyValue(response, str + 'accountOpenDt', testdatapath.getValue(33, i))

    WS.verifyElementPropertyValue(response, str + 'accountOfficer1Cd', testdatapath.getValue(34, i))

    WS.verifyElementPropertyValue(response, str + 'accountOfficer2Cd', testdatapath.getValue(35, i))

    WS.verifyElementPropertyValue(response, str + 'accountMaintDt', testdatapath.getValue(36, i))

    WS.verifyElementPropertyValue(response, str + 'accountEmployeeInd', testdatapath.getValue(37, i))

    WS.verifyElementPropertyValue(response, str + 'accountCountry', testdatapath.getValue(38, i))

    WS.verifyElementPropertyValue(response, str + 'accountSensitivity', testdatapath.getValue(39, i))

    WS.verifyElementPropertyValue(response, str + 'accountLanguageCd', testdatapath.getValue(40, i))

    WS.verifyElementPropertyValue(response, str + 'relatedCustomer[0].relcusCompanyNbr', testdatapath.getValue(41, i))

    WS.verifyElementPropertyValue(response, str + 'relatedCustomer[0].relcusCustomer', testdatapath.getValue(42, i))

    WS.verifyElementPropertyValue(response, str + 'relatedCustomer[0].relcusTie', testdatapath.getValue(43, i))

    WS.verifyElementPropertyValue(response, str + 'relatedCustomer[0].relcusRelation', testdatapath.getValue(44, i))

    WS.verifyElementPropertyValue(response, str + 'relatedCustomer[0].relcusApspInd', testdatapath.getValue(45, i))

    WS.verifyElementPropertyValue(response, str + 'relatedCustomer[0].relcusOwner', testdatapath.getValue(46, i))

    WS.verifyElementPropertyValue(response, str + 'relatedAccount[0].relactCompanyNbr', testdatapath.getValue(47, i))

    WS.verifyElementPropertyValue(response, str + 'relatedAccount[0].relactProductCd', testdatapath.getValue(48, i))

    WS.verifyElementPropertyValue(response, str + 'relatedAccount[0].relactAccountNbr', testdatapath.getValue(49, i))

    WS.verifyElementPropertyValue(response, str + 'relatedAccount[0].relactRelation', testdatapath.getValue(50, i))

    WS.verifyElementPropertyValue(response, str + 'relatedAccount[0].relactApspInd', testdatapath.getValue(51, i))

    WS.verifyElementPropertyValue(response, str + 'relatedAccount[0].relactOwner', testdatapath.getValue(52, i))

    WS.verifyElementPropertyValue(response, str + 'remarkInformation[0].remarkTypeCd', testdatapath.getValue(53, i))

    WS.verifyElementPropertyValue(response, str + 'remarkInformation[0].remarkEffectiveDt', testdatapath.getValue(54, i))

    WS.verifyElementPropertyValue(response, str + 'remarkInformation[0].remarkExpiryDt', testdatapath.getValue(55, i))

    WS.verifyElementPropertyValue(response, str + 'remarkInformation[0].remarkData', testdatapath.getValue(56, i))
}