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

String str = 'getCustomerListServiceOperationResponse.RESPONSE.Output.'

testdatapath = findTestData('Z-Connect Test Data/GetCustomerList_TestData')

for (int i = 2; i < 3; i++) {
    println('EXCEL SHEET ROW NUMBER IS :' + i)

    response = WS.sendRequest(findTestObject('GetCustomerList/GetCustomerList_Verify_Response_with_Empty_Values'))

    WS.verifyResponseStatusCode(response, 200)

    WS.verifyElementPropertyValue(response, str + 'xStatus.applicationCd', testdatapath.getValue(2, i))

    WS.verifyElementPropertyValue(response, str + 'xStatus.statusCd', testdatapath.getValue(3, i))

    WS.verifyElementPropertyValue(response, str + 'xStatus.statusMessage', testdatapath.getValue(4, i))

    WS.verifyElementPropertyValue(response, str + 'xStatus.severity', testdatapath.getValue(5, i))

    WS.verifyElementPropertyValue(response, str + 'offset', testdatapath.getValue(6, i))

    WS.verifyElementPropertyValue(response, str + 'limit', testdatapath.getValue(7, i))

    WS.verifyElementPropertyValue(response, str + 'customerInfo[4].customerCompanyNbr', testdatapath.getValue(8, i))

    WS.verifyElementPropertyValue(response, str + 'customerInfo[4].customerNameLine1', testdatapath.getValue(9, i))

    WS.verifyElementPropertyValue(response, str + 'customerInfo[4].customerKey', testdatapath.getValue(10, i))

    WS.verifyElementPropertyValue(response, str + 'customerInfo[4].tieBreakerNbr', testdatapath.getValue(11, i))

    WS.verifyElementPropertyValue(response, str + 'customerInfo[4].customerNbr', testdatapath.getValue(12, i))

    WS.verifyElementPropertyValue(response, str + 'customerInfo[4].taxPayerNbr', testdatapath.getValue(13, i))

    //WS.verifyElementPropertyValue(response, str + 'customerInfo[4].customerAddressLine1', testdatapath.getValue(14, i))
    WS.verifyElementPropertyValue(response, str + 'customerInfo[4].customerAddressLine2', testdatapath.getValue(15, i))

    WS.verifyElementPropertyValue(response, str + 'customerInfo[4].customerAddressLine3', testdatapath.getValue(16, i))

    WS.verifyElementPropertyValue(response, str + 'customerInfo[4].customerCity', testdatapath.getValue(17, i))

    WS.verifyElementPropertyValue(response, str + 'customerInfo[4].customerState', testdatapath.getValue(18, i))

    WS.verifyElementPropertyValue(response, str + 'customerInfo[4].customerPostalCode', testdatapath.getValue(19, i))

    WS.verifyElementPropertyValue(response, str + 'customerInfo[4].customerCountryCd', testdatapath.getValue(20, i))

    WS.verifyElementPropertyValue(response, str + 'customerInfo[4].birthDt', testdatapath.getValue(21, i))
}