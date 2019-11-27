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

String str = 'cancelActivateDirectDebitDepositAccountServiceOperationResponse.RESPONSE.Output.xStatus.'

testdatapath = findTestData('Z-Connect Test Data/Cancel Activate Direct Debit Deposit Account_TestData')

for (int i = 2; i < 3; i++) {
    println('EXCEL SHEET ROW NUMBER IS :' + i)

    response = WS.sendRequest(findTestObject('Cancel Activate Direct Debit Deposit Account/AccountNbr of 0', [('companyNbr') : testdatapath.getValue(
                    2, i), ('productCd') : testdatapath.getValue(3, i), ('accountNbr') : testdatapath.getValue(4, i), ('sequenceNumberHi') : testdatapath.getValue(
                    5, i), ('sequenceNumberLo') : testdatapath.getValue(6, i), ('action') : testdatapath.getValue(7, i)]))

    WS.verifyResponseStatusCode(response, 200)

    WS.verifyElementPropertyValue(response, str + 'applicationCd', testdatapath.getValue(9, i))

    WS.verifyElementPropertyValue(response, str + 'statusCd', testdatapath.getValue(10, i))

    WS.verifyElementPropertyValue(response, str + 'statusMessage', testdatapath.getValue(11, i))

    WS.verifyElementPropertyValue(response, str + 'severity', testdatapath.getValue(12, i))
}