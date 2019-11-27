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

for (int i = 1; i < 8; i++) {
    println('EXCEL SHEET ROW NUMBER IS : ' + i)

    /* println('APPLICATION CODE : ' + findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(44, 
            i))*/
    /* println('STATUS CODE : ' + findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(45, i))*/
    println('STATUS MESSAGE : ' + findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(46, i))

    println('SEVERITY : ' + findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(47, i))

    //Change DDA account record with blank account no field
    if (i == 1) {
        response = WS.sendRequest(findTestObject('Change Deposit Account DDA/Change DDA account record with blank account no field', 
                [('companyNbr') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(2, i)
                    , ('accountNumber') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        3, i), ('accountName') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        4, i)]))
    }
    
    //Change DDA account record without  company no field
    if (i == 2) {
        response = WS.sendRequest(findTestObject('Change Deposit Account DDA/Change DDA account record with blank account no field', 
                [('companyNbr') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(2, i)
                    , ('accountNumber') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        3, i), ('accountName') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        4, i)]))
    }
    
    //Change DDA account record with few blank input fields
    if (i == 3) {
        response = WS.sendRequest(findTestObject('Change Deposit Account DDA/Change DDA account record with few blank input fields', 
                [('companyNbr') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(2, i)
                    , ('accountNumber') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        3, i), ('largeItemMonitor') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        13, i), ('tranAdviceCode') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        14, i), ('sigBalChgCode') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        15, i), ('relOfficer1') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        16, i), ('relOfficer2') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        17, i), ('ownerCode') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        18, i), ('subownerCode') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        19, i), ('freeCheckCount') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        20, i)]))
    }
    
    //Change DDA account record with  blank NAICS code field
    if (i == 4) {
        response = WS.sendRequest(findTestObject('Change Deposit Account DDA/Change DDA account record with blank NAICS code field', 
                [('companyNbr') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(2, i)
                    , ('accountNumber') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        3, i), ('location') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        21, i), ('geographicCode') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        22, i), ('sic') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        23, i), ('naics') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        24, i), ('intCode') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        25, i), ('intWaiveCode') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        26, i), ('intCycle') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        27, i), ('intPaymentMethod') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        28, i)]))
    }
    
    //Change DDA account record with few invalid input field values
    if (i == 5) {
        response = WS.sendRequest(findTestObject('Change Deposit Account DDA/Change DDA account record with few invalid input field values', 
                [('companyNbr') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(2, i)
                    , ('accountNumber') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        3, i), ('debitIntCode') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        29, i), ('debitIntWaiveCode') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        30, i), ('debitIntCycle') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        31, i), ('debitIntPaymentMethod') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        32, i), ('svcChgCode') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        33, i), ('svcChgWaiveCode') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        34, i), ('svcChgCycle') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        35, i), ('svcChgPaymentMethod') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        36, i)]))
    }
    
    //Change DDA account record with current input field values
    if (i == 6) {
        response = WS.sendRequest(findTestObject('Change Deposit Account DDA/Change DDA account record with current input field values', 
                [('companyNbr') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(2, i)
                    , ('accountNumber') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        3, i), ('odSvcChgCode') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        37, i), ('odSvcChgWaiveCode') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        38, i), ('odSvcChgCycle') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        39, i), ('statementCycle') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        40, i), ('statementMailCode') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        41, i), ('statementSequence') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        42, i)]))
    }
    
    //Change DDA account record with valid input field
    if (i == 7) {
        response = WS.sendRequest(findTestObject('Change Deposit Account DDA/Change DDA account record with valid input field', 
                [('companyNbr') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(2, i)
                    , ('accountNumber') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        3, i), ('accountName') : findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(
                        4, i)]))
    }
    
    WS.verifyResponseStatusCode(response, 200)

    def slurper = new groovy.json.JsonSlurper()

    def result = slurper.parseText(response.getResponseBodyContent())

    def app = result.changeDepositAccountDDAServiceOperationResponse.RESPONSE.Output.xStatus.applicationCd    

    def status = result.changeDepositAccountDDAServiceOperationResponse.RESPONSE.Output.xStatus.statusCd
	
	String applicationCd = app

    String statusCd = status

   
    if (applicationCd.equals('842') || applicationCd.equals('0')) {
        println('APPLICATION CODE:- ' + applicationCd)

        WS.verifyElementPropertyValue(response, 'changeDepositAccountDDAServiceOperationResponse.RESPONSE.Output.xStatus.applicationCd', 
            findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(44, i))
    }
    
    if (((statusCd.equals('42013') || statusCd.equals('55457')) || statusCd.equals('56023')) || statusCd.equals('42003')) {
        println('STATUS CODE:- ' + statusCd)

        WS.verifyElementPropertyValue(response, 'changeDepositAccountDDAServiceOperationResponse.RESPONSE.Output.xStatus.statusCd', 
            findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(45, i))
    }
    
    WS.verifyElementPropertyValue(response, 'changeDepositAccountDDAServiceOperationResponse.RESPONSE.Output.xStatus.statusMessage', 
        findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(46, i))

    WS.verifyElementPropertyValue(response, 'changeDepositAccountDDAServiceOperationResponse.RESPONSE.Output.xStatus.severity', 
        findTestData('Z-Connect Test Data/Change Deposit Account DDA_TestData').getValue(47, i))
}