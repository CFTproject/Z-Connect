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

for (int i = 1; i < 6; i++) {
    println('EXCEL SHEET ROW NUMBER IS : ' + i)

    println('APPLICATION CODE : ' + findTestData('Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(52, 
            i))

    println('STATUS CODE : ' + findTestData('Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(53, i))

    println('STATUS MESSAGE : ' + findTestData('Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(54, i))

    println('SEVERITY : ' + findTestData('Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(55, i))

    //Chenge the account name in RSV account information
    if (i == 1) {
        response = WS.sendRequest(findTestObject('Change Deposit Account TDA/Chenge the account name in RSV account information', 
                [('companyNbr') : findTestData('Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(2, i)
                    , ('accountNumber') : findTestData('Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(
                        3, i), ('accountType') : findTestData('Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(
                        4, i), ('accountName') : findTestData('Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(
                        5, i)]))
    }
    
    //Chenge the account number in  RSV account information
    if (i == 2) {
        response = WS.sendRequest(findTestObject('Change Deposit Account TDA/Chenge the account number in RSV account information', 
                [('companyNbr') : findTestData('Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(2, i)
                    , ('accountNumber') : findTestData('Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(
                        3, i), ('accountType') : findTestData('Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(
                        4, i), ('ownerCode') : findTestData('Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(
                        31, i)]))
    }
    
    //option 1 and 13 of RSV
    if (i == 3) {
        response = WS.sendRequest(findTestObject('Change Deposit Account TDA/option 1 and 13 of RSV', [('companyNbr') : findTestData(
                        'Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(2, i), ('accountNumber') : findTestData(
                        'Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(3, i), ('accountType') : findTestData(
                        'Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(4, i), ('accountName') : findTestData(
                        'Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(5, i), ('packageCode') : findTestData(
                        'Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(8, i), ('obpCode') : findTestData(
                        'Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(9, i), ('largeItemMonitor') : findTestData(
                        'Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(11, i), ('transactionAdviceCode') : findTestData(
                        'Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(12, i), ('relOfficer1') : findTestData(
                        'Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(29, i), ('relOfficer2') : findTestData(
                        'Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(30, i), ('intCode') : findTestData(
                        'Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(37, i), ('intWaiveCode') : findTestData(
                        'Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(38, i), ('svcChgCode') : findTestData(
                        'Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(41, i), ('svcChgWaiveCode') : findTestData(
                        'Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(42, i)]))
    }
    
    //Chenge the account name in CDA account information
    if (i == 4) {
        response = WS.sendRequest(findTestObject('Change Deposit Account TDA/Chenge the account name in CDA account information', 
                [('companyNbr') : findTestData('Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(2, i)
                    , ('accountNumber') : findTestData('Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(
                        3, i), ('accountType') : findTestData('Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(
                        4, i), ('accountName') : findTestData('Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(
                        5, i)]))
    }
    
    //option 1 and 13 of CDA
    if (i == 5) {
        response = WS.sendRequest(findTestObject('Change Deposit Account TDA/option 1 and 13 of CDA', [('companyNbr') : findTestData(
                        'Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(2, i), ('accountNumber') : findTestData(
                        'Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(3, i), ('accountType') : findTestData(
                        'Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(4, i), ('accountName') : findTestData(
                        'Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(5, i), ('packageCode') : findTestData(
                        'Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(8, i), ('obpCode') : findTestData(
                        'Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(9, i), ('largeItemMonitor') : findTestData(
                        'Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(11, i), ('transactionAdviceCode') : findTestData(
                        'Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(12, i), ('intCode') : findTestData(
                        'Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(37, i), ('intWaiveCode') : findTestData(
                        'Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(38, i), ('svcChgCode') : findTestData(
                        'Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(41, i), ('svcChgWaiveCode') : findTestData(
                        'Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(42, i)]))
    }
    
    WS.verifyResponseStatusCode(response, 200)

    WS.verifyElementPropertyValue(response, 'changeDepositAccountTDAServiceOperationResponse.RESPONSE.Output.xStatus.applicationCd', 
        findTestData('Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(52, i))

    WS.verifyElementPropertyValue(response, 'changeDepositAccountTDAServiceOperationResponse.RESPONSE.Output.xStatus.statusCd', 
        findTestData('Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(53, i))

    WS.verifyElementPropertyValue(response, 'changeDepositAccountTDAServiceOperationResponse.RESPONSE.Output.xStatus.statusmessage', 
        findTestData('Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(54, i))

    WS.verifyElementPropertyValue(response, 'changeDepositAccountTDAServiceOperationResponse.RESPONSE.Output.xStatus.severity', 
        findTestData('Z-Connect Test Data/Change Deposit Account TDA_TestData').getValue(55, i))
}