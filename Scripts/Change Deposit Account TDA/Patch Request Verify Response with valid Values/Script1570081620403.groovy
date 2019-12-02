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

String str = 'changeDepositAccountTDAServiceOperationResponse.RESPONSE.Output.xStatus.'

testdatapath = findTestData('Z-Connect Test Data/Change Deposit Account TDA_TestData')

for (int i = 1; i < 6; i++) {
    println('EXCEL SHEET ROW NUMBER IS : ' + i)

    //Chenge the account name in RSV account information
    if (i == 1) {
        response = WS.sendRequest(findTestObject('Change Deposit Account TDA/Chenge the account name in RSV account information', 
                [('companyNbr') : testdatapath.getValue(2, i), ('accountNumber') : testdatapath.getValue(3, i), ('accountType') : testdatapath.getValue(
                        4, i), ('accountName') : testdatapath.getValue(5, i)]))
    }
    
    //Chenge the account number in  RSV account information
    if (i == 2) {
        response = WS.sendRequest(findTestObject('Change Deposit Account TDA/Chenge the account number in RSV account information', 
                [('companyNbr') : testdatapath.getValue(2, i), ('accountNumber') : testdatapath.getValue(3, i), ('accountType') : testdatapath.getValue(
                        4, i), ('ownerCode') : testdatapath.getValue(31, i)]))
    }
    
    //option 1 and 13 of RSV
    if (i == 3) {
        response = WS.sendRequest(findTestObject('Change Deposit Account TDA/option 1 and 13 of RSV', [('companyNbr') : testdatapath.getValue(
                        2, i), ('accountNumber') : testdatapath.getValue(3, i), ('accountType') : testdatapath.getValue(
                        4, i), ('accountName') : testdatapath.getValue(5, i), ('packageCode') : testdatapath.getValue(8, 
                        i), ('obpCode') : testdatapath.getValue(9, i), ('largeItemMonitor') : testdatapath.getValue(11, 
                        i), ('transactionAdviceCode') : testdatapath.getValue(12, i), ('relOfficer1') : testdatapath.getValue(
                        29, i), ('relOfficer2') : testdatapath.getValue(30, i), ('intCode') : testdatapath.getValue(37, 
                        i), ('intWaiveCode') : testdatapath.getValue(38, i), ('svcChgCode') : testdatapath.getValue(41, 
                        i), ('svcChgWaiveCode') : testdatapath.getValue(42, i)]))
    }
    
    //Chenge the account name in CDA account information
    if (i == 4) {
        response = WS.sendRequest(findTestObject('Change Deposit Account TDA/Chenge the account name in CDA account information', 
                [('companyNbr') : testdatapath.getValue(2, i), ('accountNumber') : testdatapath.getValue(3, i), ('accountType') : testdatapath.getValue(
                        4, i), ('accountName') : testdatapath.getValue(5, i)]))
    }
    
    //option 1 and 13 of CDA
    if (i == 5) {
        response = WS.sendRequest(findTestObject('Change Deposit Account TDA/option 1 and 13 of CDA', [('companyNbr') : testdatapath.getValue(
                        2, i), ('accountNumber') : testdatapath.getValue(3, i), ('accountType') : testdatapath.getValue(
                        4, i), ('accountName') : testdatapath.getValue(5, i), ('packageCode') : testdatapath.getValue(8, 
                        i), ('obpCode') : testdatapath.getValue(9, i), ('largeItemMonitor') : testdatapath.getValue(11, 
                        i), ('transactionAdviceCode') : testdatapath.getValue(12, i), ('intCode') : testdatapath.getValue(
                        37, i), ('intWaiveCode') : testdatapath.getValue(38, i), ('svcChgCode') : testdatapath.getValue(
                        41, i), ('svcChgWaiveCode') : testdatapath.getValue(42, i)]))
    }
    
    WS.verifyResponseStatusCode(response, 200)

    WS.verifyElementPropertyValue(response, str + 'applicationCd', testdatapath.getValue(52, i))

    WS.verifyElementPropertyValue(response, str + 'statusCd', testdatapath.getValue(53, i))

    WS.verifyElementPropertyValue(response, str + 'statusmessage', testdatapath.getValue(54, i))

    WS.verifyElementPropertyValue(response, str + 'severity', testdatapath.getValue(55, i))
}