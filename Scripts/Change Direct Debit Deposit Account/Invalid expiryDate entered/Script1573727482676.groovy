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

String str = 'changeDirectDebitDepositAccountServiceOperationResponse.RESPONSE.Output.xStatus.'

testdatapath = findTestData('Z-Connect Test Data/Change Direct Debit Deposit Account_TestData')

for (int i = 5; i < 6; i++) {
    println('EXCEL SHEET ROW NUMBER IS :' + i)

    response = WS.sendRequest(findTestObject('Change Direct Debit Deposit Account/Invalid expiryDate entered', 
            [('companyNbr') : testdatapath.getValue(2, i), ('productCd') : testdatapath.getValue(4, i), ('accountNbr') : testdatapath.getValue(
                    5, i), ('sequenceNumberHi') : testdatapath.getValue(6, i), ('sequenceNumberLo') : testdatapath.getValue(
                    7, i), ('startDate') : testdatapath.getValue(8, i), ('expiryDate') : testdatapath.getValue(9, i), ('maximumAuthorizedAmt') : testdatapath.getValue(
                    10, i), ('originationTransitRouting') : testdatapath.getValue(11, i), ('originationProductCd') : testdatapath.getValue(
                    12, i), ('originationAccountNbr') : testdatapath.getValue(13, i), ('originationBankName') : testdatapath.getValue(
                    14, i)]))

    WS.verifyResponseStatusCode(response, 200)

    WS.verifyElementPropertyValue(response, str + 'applicationCd', testdatapath.getValue(16, i))

    WS.verifyElementPropertyValue(response, str + 'statusCd', testdatapath.getValue(17, i))

    WS.verifyElementPropertyValue(response, str + 'statusMessage', testdatapath.getValue(18, i))

    WS.verifyElementPropertyValue(response, str + 'severity', testdatapath.getValue(19, i))
}