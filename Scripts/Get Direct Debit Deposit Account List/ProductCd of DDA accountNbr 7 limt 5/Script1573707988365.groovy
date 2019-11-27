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

String str = 'getDirectDebitDepositAccountListServiceOperationResponse.RESPONSE.Output.'

testdatapath = findTestData('Z-Connect Test Data/Get Direct Debit Deposit Account List_TestData')

for (int i = 3; i < 4; i++) {
    println('EXCEL SHEET ROW NUMBER IS : ' + i)

    response = WS.sendRequest(findTestObject('Get Direct Debit Deposit Account List/ProductCd of DDA accountNbr 7 limt 5'))

    WS.verifyElementPropertyValue(response, str + 'xStatus.applicationCd', testdatapath.getValue(2, i))

    WS.verifyElementPropertyValue(response, str + 'xStatus.statusCd', testdatapath.getValue(3, i))

    WS.verifyElementPropertyValue(response, str + 'xStatus.statusMessage', testdatapath.getValue(4, i))

    WS.verifyElementPropertyValue(response, str + 'xStatus.severity', testdatapath.getValue(5, i))

    WS.verifyElementPropertyValue(response, str + 'companyNbr', testdatapath.getValue(6, i))

    WS.verifyElementPropertyValue(response, str + 'paymentType', testdatapath.getValue(7, i))

    WS.verifyElementPropertyValue(response, str + 'productCd', testdatapath.getValue(8, i))

    WS.verifyElementPropertyValue(response, str + 'accountNbr', testdatapath.getValue(9, i))

    WS.verifyElementPropertyValue(response, str + 'offsetHi', testdatapath.getValue(10, i))

    WS.verifyElementPropertyValue(response, str + 'offsetLo', testdatapath.getValue(11, i))

    WS.verifyElementPropertyValue(response, str + 'limit', testdatapath.getValue(12, i))

    WS.verifyElementPropertyValue(response, str + 'directDebitList[0].sequenceNumberHi', testdatapath.getValue(13, i))

    WS.verifyElementPropertyValue(response, str + 'directDebitList[0].sequenceNumberLo', testdatapath.getValue(14, i))

    WS.verifyElementPropertyValue(response, str + 'directDebitList[0].startDate', testdatapath.getValue(15, i))

    WS.verifyElementPropertyValue(response, str + 'directDebitList[0].expiryDate', testdatapath.getValue(16, i))

    WS.verifyElementPropertyValue(response, str + 'directDebitList[0].lastMaintenanceDate', testdatapath.getValue(17, i))

    WS.verifyElementPropertyValue(response, str + 'directDebitList[0].maximumAuthorizedAmt', testdatapath.getValue(18, i))

    WS.verifyElementPropertyValue(response, str + 'directDebitList[0].originationTransitRouting', testdatapath.getValue(
            19, i))

    WS.verifyElementPropertyValue(response, str + 'directDebitList[0].originationProductCd', testdatapath.getValue(20, i))

    WS.verifyElementPropertyValue(response, str + 'directDebitList[0].originationAccountNbr', testdatapath.getValue(21, 
            i))

    WS.verifyElementPropertyValue(response, str + 'directDebitList[0].originationBankName', testdatapath.getValue(22, i))
}