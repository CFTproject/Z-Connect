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

String str = 'changeDepositAccountDDAServiceOperationResponse.RESPONSE.Output.xStatus.'

testdatapath = findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData')

for (int i = 1; i < 8; i++) {
    println('EXCEL SHEET ROW NUMBER IS : ' + i)

    //Change DDA account record with blank account no field
    if (i == 1) {
        response = WS.sendRequest(findTestObject('Change Deposit Account DDA/Change DDA account record with blank account no field', 
                [('companyNbr') : testdatapath.getValue(2, i), ('accountNumber') : testdatapath.getValue(3, i), ('accountName') : testdatapath.getValue(
                        4, i)]))
    }
    
    //Change DDA account record without  company no field
    if (i == 2) {
        response = WS.sendRequest(findTestObject('Change Deposit Account DDA/Change DDA account record with blank account no field', 
                [('companyNbr') : testdatapath.getValue(2, i), ('accountNumber') : testdatapath.getValue(3, i), ('accountName') : testdatapath.getValue(
                        4, i)]))
    }
    
    //Change DDA account record with few blank input fields
    if (i == 3) {
        response = WS.sendRequest(findTestObject('Change Deposit Account DDA/Change DDA account record with few blank input fields', 
                [('companyNbr') : testdatapath.getValue(2, i), ('accountNumber') : testdatapath.getValue(3, i), ('largeItemMonitor') : testdatapath.getValue(
                        13, i), ('tranAdviceCode') : testdatapath.getValue(14, i), ('sigBalChgCode') : testdatapath.getValue(
                        15, i), ('relOfficer1') : testdatapath.getValue(16, i), ('relOfficer2') : testdatapath.getValue(
                        17, i), ('ownerCode') : testdatapath.getValue(18, i), ('subownerCode') : testdatapath.getValue(19, 
                        i), ('freeCheckCount') : testdatapath.getValue(20, i)]))
    }
    
    //Change DDA account record with  blank NAICS code field
    if (i == 4) {
        response = WS.sendRequest(findTestObject('Change Deposit Account DDA/Change DDA account record with blank NAICS code field', 
                [('companyNbr') : testdatapath.getValue(2, i), ('accountNumber') : testdatapath.getValue(3, i), ('location') : testdatapath.getValue(
                        21, i), ('geographicCode') : testdatapath.getValue(22, i), ('sic') : testdatapath.getValue(23, i)
                    , ('naics') : testdatapath.getValue(24, i), ('intCode') : testdatapath.getValue(25, i), ('intWaiveCode') : testdatapath.getValue(
                        26, i), ('intCycle') : testdatapath.getValue(27, i), ('intPaymentMethod') : testdatapath.getValue(
                        28, i)]))
    }
    
    //Change DDA account record with few invalid input field values
    if (i == 5) {
        response = WS.sendRequest(findTestObject('Change Deposit Account DDA/Change DDA account record with few invalid input field values', 
                [('companyNbr') : testdatapath.getValue(2, i), ('accountNumber') : testdatapath.getValue(3, i), ('debitIntCode') : testdatapath.getValue(
                        29, i), ('debitIntWaiveCode') : testdatapath.getValue(30, i), ('debitIntCycle') : testdatapath.getValue(
                        31, i), ('debitIntPaymentMethod') : testdatapath.getValue(32, i), ('svcChgCode') : testdatapath.getValue(
                        33, i), ('svcChgWaiveCode') : testdatapath.getValue(34, i), ('svcChgCycle') : testdatapath.getValue(
                        35, i), ('svcChgPaymentMethod') : testdatapath.getValue(36, i)]))
    }
    
    //Change DDA account record with current input field values
    if (i == 6) {
        response = WS.sendRequest(findTestObject('Change Deposit Account DDA/Change DDA account record with current input field values', 
                [('companyNbr') : testdatapath.getValue(2, i), ('accountNumber') : testdatapath.getValue(3, i), ('odSvcChgCode') : testdatapath.getValue(
                        37, i), ('odSvcChgWaiveCode') : testdatapath.getValue(38, i), ('odSvcChgCycle') : testdatapath.getValue(
                        39, i), ('statementCycle') : testdatapath.getValue(40, i), ('statementMailCode') : testdatapath.getValue(
                        41, i), ('statementSequence') : testdatapath.getValue(42, i)]))
    }
    
    //Change DDA account record with valid input field
    if (i == 7) {
        response = WS.sendRequest(findTestObject('Change Deposit Account DDA/Change DDA account record with valid input field', 
                [('companyNbr') : testdatapath.getValue(2, i), ('accountNumber') : testdatapath.getValue(3, i), ('accountName') : testdatapath.getValue(
                        4, i)]))
    }
    
    WS.verifyResponseStatusCode(response, 200)

    def slurper = new groovy.json.JsonSlurper()

    def result = slurper.parseText(response.getResponseBodyContent())

    def app = result.str+'applicationCd'

    def status = result.str+'statusCd'

    String applicationCd = app

    String statusCd = status

    if (applicationCd.equals('842') || applicationCd.equals('0')) {
        println('APPLICATION CODE:- ' + applicationCd)

        WS.verifyElementPropertyValue(response, str + 'applicationCd', testdatapath.getValue(44, i))
    }
    
    if (((statusCd.equals('42013') || statusCd.equals('55457')) || statusCd.equals('56023')) || statusCd.equals('42003')) {
        println('STATUS CODE:- ' + statusCd)

        WS.verifyElementPropertyValue(response, str + 'statusCd', testdatapath.getValue(45, i))
    }
    
    WS.verifyElementPropertyValue(response, str + 'statusMessage', testdatapath.getValue(46, i))

    WS.verifyElementPropertyValue(response, str + 'severity', testdatapath.getValue(47, i))
}