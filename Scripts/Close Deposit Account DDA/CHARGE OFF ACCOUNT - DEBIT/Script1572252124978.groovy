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

String str = 'closeDepositAccountDDAServiceOperationResponse.RESPONSE.Output.xStatus.'

testdatapath = findTestData('Z-Connect Test Data/Close Deposit Account DDA_TestData')

for (int i = 8; i < 9; i++) {
    println('EXCEL SHEET ROW NUMBER IS : ' + i)

    response = WS.sendRequest(findTestObject('Close Deposit Account DDA/CHARGE OFF ACCOUNT - DEBIT', [('companyNbr') : findTestData(
                    'Z-Connect Test Data/Close Deposit Account DDA_TestData').getValue(2, i), ('accountNbr') : findTestData(
                    'Z-Connect Test Data/Close Deposit Account DDA_TestData').getValue(3, i), ('typeOfClose') : findTestData(
                    'Z-Connect Test Data/Close Deposit Account DDA_TestData').getValue(4, i), ('closingReason') : findTestData(
                    'Z-Connect Test Data/Close Deposit Account DDA_TestData').getValue(5, i), ('postInterestOpt') : findTestData(
                    'Z-Connect Test Data/Close Deposit Account DDA_TestData').getValue(6, i), ('excessActivityOpt') : findTestData(
                    'Z-Connect Test Data/Close Deposit Account DDA_TestData').getValue(7, i), ('branchOfOrigin') : findTestData(
                    'Z-Connect Test Data/Close Deposit Account DDA_TestData').getValue(8, i), ('captureCenter') : findTestData(
                    'Z-Connect Test Data/Close Deposit Account DDA_TestData').getValue(9, i), ('outstandingItemAmt') : findTestData(
                    'Z-Connect Test Data/Close Deposit Account DDA_TestData').getValue(10, i), ('closingTranCode') : findTestData(
                    'Z-Connect Test Data/Close Deposit Account DDA_TestData').getValue(11, i), ('closeoutAmt') : findTestData(
                    'Z-Connect Test Data/Close Deposit Account DDA_TestData').getValue(12, i)]))

    WS.verifyResponseStatusCode(response, 200)

    WS.verifyElementPropertyValue(response, str + 'applicationCd', testdatapath.getValue(14, i))

    WS.verifyElementPropertyValue(response, str + 'statusCd', testdatapath.getValue(15, i))

    WS.verifyElementPropertyValue(response, str + 'statusmessage', testdatapath.getValue(16, i))

    WS.verifyElementPropertyValue(response, str + 'severity', testdatapath.getValue(17, i))
}