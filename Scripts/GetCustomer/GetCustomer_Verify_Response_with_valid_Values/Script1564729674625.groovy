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

String str = 'getCustomerServiceOperationResponse.RESPONSE.Output.'

testdatapath = findTestData('Z-Connect Test Data/GetCustomer_TestData')

for (int i = 1; i < 2; i++) {
    println('EXCEL SHEET ROW NUMBER IS :' + i)

    response = WS.sendRequest(findTestObject('GetCustomer/GetCustomer_Verify_Response_with_valid_Values'))

    WS.verifyResponseStatusCode(response, 200)

    WS.verifyElementPropertyValue(response, str + 'xStatus.applicationCd', testdatapath.getValue(2, i))

    WS.verifyElementPropertyValue(response, str + 'xStatus.statusCd', testdatapath.getValue(3, i))

    WS.verifyElementPropertyValue(response, str + 'xStatus.statusMessage', testdatapath.getValue(4, i))

    WS.verifyElementPropertyValue(response, str + 'xStatus.severity', testdatapath.getValue(5, i))

    WS.verifyElementPropertyValue(response, str + 'contactOffset', testdatapath.getValue(6, i))

    WS.verifyElementPropertyValue(response, str + 'contactLimit', testdatapath.getValue(7, i))

    WS.verifyElementPropertyValue(response, str + 'relcusOffset', testdatapath.getValue(8, i))

    WS.verifyElementPropertyValue(response, str + 'relcusLimit', testdatapath.getValue(9, i))

    WS.verifyElementPropertyValue(response, str + 'relacctOffset', testdatapath.getValue(10, i))

    WS.verifyElementPropertyValue(response, str + 'relacctLimit', testdatapath.getValue(11, i))

    WS.verifyElementPropertyValue(response, str + 'customerCompanyNbr', testdatapath.getValue(12, i))
	
	WS.verifyElementPropertyValue(response, str + 'customerNameLine1', testdatapath.getValue(13, i))

    WS.verifyElementPropertyValue(response, str + 'customerTie', testdatapath.getValue(14, i))

    WS.verifyElementPropertyValue(response, str + 'customerNbr', testdatapath.getValue(15, i))

    WS.verifyElementPropertyValue(response, str + 'customerCostCenterNbr', testdatapath.getValue(21, i))

    WS.verifyElementPropertyValue(response, str + 'customerBranchNbr', testdatapath.getValue(22, i))

    WS.verifyElementPropertyValue(response, str + 'sensitivityCode', testdatapath.getValue(23, i))

    WS.verifyElementPropertyValue(response, str + 'commercialContactInfo[0].contactSeq', testdatapath.getValue(28, i))

    WS.verifyElementPropertyValue(response, str + 'relatedCustomerInfo[0].companyNbr', testdatapath.getValue(30, i))

    WS.verifyElementPropertyValue(response, str + 'relatedCustomerInfo[0].tie', testdatapath.getValue(31, i))

    WS.verifyElementPropertyValue(response, str + 'relatedCustomerInfo[0].ownershipPercent', testdatapath.getValue(38, i))

    WS.verifyElementPropertyValue(response, str + 'relatedAccountInfo[0].companyNbr', testdatapath.getValue(34, i))

    WS.verifyElementPropertyValue(response, str + 'relatedAccountInfo[0].ownershipPercent', testdatapath.getValue(38, i))
}