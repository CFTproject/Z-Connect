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

String str = 'getPayoffTDAServiceOperationResponse.RESPONSE.Output.'

testdatapath = findTestData('Z-Connect Test Data/Get pay off TDA_TestData')

for (int i = 3; i < 8; i++) {
    String url = testdatapath.getValue(2, i)

    GlobalVariable.GetpayoffTDAURLS = url

    println(('URL :- ' + 'https://20.14.209.1:9443/getPayoffTDA/getPayoffTDA/') + url)

    println('EXCEL SHEET ROW NUMBER :- ' + i)

    response = WS.sendRequest(findTestObject('Get pay off TDA/Get pay off TDA Verify Response with valid Values'))

    WS.verifyResponseStatusCode(response, 200)

    WS.verifyElementPropertyValue(response, str + 'xStatus.applicationCd', testdatapath.getValue(3, i))

    WS.verifyElementPropertyValue(response, str + 'xStatus.statusCd', testdatapath.getValue(4, i))

    WS.verifyElementPropertyValue(response, str + 'xStatus.statusMessage', testdatapath.getValue(5, i))

    WS.verifyElementPropertyValue(response, str + 'xStatus.severity', testdatapath.getValue(6, i))

    WS.verifyElementPropertyValue(response, str + 'companyNbr', testdatapath.getValue(7, i))

    //WS.verifyElementPropertyValue(response, str + 'accountType', testdatapath.getValue(8, i))

    WS.verifyElementPropertyValue(response, str + 'accountNbr', testdatapath.getValue(9, i))

    //WS.verifyElementPropertyValue(response, str + 'shortName', testdatapath.getValue(10, i))

    WS.verifyElementPropertyValue(response, str + 'ledgerBalanceAmt', testdatapath.getValue(11, i))

    WS.verifyElementPropertyValue(response, str + 'interestEarnedAmt', testdatapath.getValue(12, i))

    WS.verifyElementPropertyValue(response, str + 'amountWithheldAmt', testdatapath.getValue(13, i))

    WS.verifyElementPropertyValue(response, str + 'penaltyAmt', testdatapath.getValue(14, i))

    WS.verifyElementPropertyValue(response, str + 'feeTaxAmt', testdatapath.getValue(15, i))

    WS.verifyElementPropertyValue(response, str + 'adpPaymentAmt', testdatapath.getValue(16, i))

    WS.verifyElementPropertyValue(response, str + 'closeoutAmt', testdatapath.getValue(17, i))

    if ((i == 3) || (i == 4)) {
        //WS.verifyElementPropertyValue(response, str + 'inAip', testdatapath.getValue(18, i), FailureHandling.CONTINUE_ON_FAILURE)
    }
    
    //println ('inAip field not getting from response in row numer 5, 6 and 7')
    WS.verifyElementPropertyValue(response, str + 'aipAdjAmt', testdatapath.getValue(19, i))

    WS.verifyElementPropertyValue(response, str + 'memoCreditsAmt', testdatapath.getValue(20, i))

    WS.verifyElementPropertyValue(response, str + 'memoDebitsAmt', testdatapath.getValue(21, i))

    WS.verifyElementPropertyValue(response, str + 'restrictedDepAmt', testdatapath.getValue(22, i))
}

