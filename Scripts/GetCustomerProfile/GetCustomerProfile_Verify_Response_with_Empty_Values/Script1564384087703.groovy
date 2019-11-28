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



String str = 'getCustomerProfileServiceOperationResponse.RESPONSE.Output.'

testdatapath = findTestData('Z-Connect Test Data/GetCustomerProfile_TestData')

for (int i = 2; i < 3; i++) {
    println('EXCEL SHEET ROW NUMBER IS :' + i)

    response = WS.sendRequest(findTestObject('GetCustomerProfile/GetCustomerProfile_Verify_Response_with_Empty_Values'))

    WS.verifyResponseStatusCode(response, 200)

    WS.verifyElementPropertyValue(response, str + 'xStatus.applicationCd', testdatapath.getValue(2, i))

    WS.verifyElementPropertyValue(response, str + 'xStatus.statusCd', testdatapath.getValue(3, i))

    WS.verifyElementPropertyValue(response, str + 'xStatus.statusMessage', testdatapath.getValue(4, i))

    WS.verifyElementPropertyValue(response, str + 'xStatus.severity', testdatapath.getValue(5, i))

    WS.verifyElementPropertyValue(response, str + 'customerCompanyNbr', testdatapath.getValue(6, i))

    WS.verifyElementPropertyValue(response, str + 'customerNbr', testdatapath.getValue(7, i))

    WS.verifyElementPropertyValue(response, str + 'householdNbr', testdatapath.getValue(8, i))

    WS.verifyElementPropertyValue(response, str + 'customerCostCenterNbr', testdatapath.getValue(9, i))

    WS.verifyElementPropertyValue(response, str + 'customerBranchNbr', testdatapath.getValue(10, i))

    WS.verifyElementPropertyValue(response, str + 'accountInformation[0].companyNbr', testdatapath.getValue(11, i))

    WS.verifyElementPropertyValue(response, str + 'accountInformation[0].currentBalanceAmt', testdatapath.getValue(12, i))

    WS.verifyElementPropertyValue(response, str + 'accountInformation[0].ownershipPercent', testdatapath.getValue(13, i))

    WS.verifyElementPropertyValue(response, str + 'aliasInfo[0].aliasCompanyNbr', testdatapath.getValue(14, i))

    WS.verifyElementPropertyValue(response, str + 'aliasInfo[0].aliasTie', testdatapath.getValue(15, i))

    WS.verifyElementPropertyValue(response, str + 'csCrRptScor', testdatapath.getValue(16, i))

    WS.verifyElementPropertyValue(response, str + 'csWoCrRptScr', testdatapath.getValue(17, i))
}



