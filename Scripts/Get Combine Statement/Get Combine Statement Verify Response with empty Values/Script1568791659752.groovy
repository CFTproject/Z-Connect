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

response = WS.sendRequest(findTestObject('Get Combine Statement/Get Combine Statement Verify Response with empty Values'))

WS.verifyResponseStatusCode(response, 200)

for (int i = 2; i < 3; i++) {
    WS.verifyElementPropertyValue(response, 'getCombinedStatementServiceOperationResponse.RESPONSE.Output.xStatus.applicationCd', 
        findTestData('Z-Connect Test Data/Get Combine Statement_TestData').getValue(2, i))

    WS.verifyElementPropertyValue(response, 'getCombinedStatementServiceOperationResponse.RESPONSE.Output.xStatus.statusCd', 
        findTestData('Z-Connect Test Data/Get Combine Statement_TestData').getValue(3, i))

    WS.verifyElementPropertyValue(response, 'getCombinedStatementServiceOperationResponse.RESPONSE.Output.xStatus.statusMessage', 
        findTestData('Z-Connect Test Data/Get Combine Statement_TestData').getValue(4, i))

    WS.verifyElementPropertyValue(response, 'getCombinedStatementServiceOperationResponse.RESPONSE.Output.xStatus.severity', 
        findTestData('Z-Connect Test Data/Get Combine Statement_TestData').getValue(5, i))

    WS.verifyElementPropertyValue(response, 'getCombinedStatementServiceOperationResponse.RESPONSE.Output.masterCompanyNbr', 
        findTestData('Z-Connect Test Data/Get Combine Statement_TestData').getValue(6, i))

    WS.verifyElementPropertyValue(response, 'getCombinedStatementServiceOperationResponse.RESPONSE.Output.masterAccountType', 
        findTestData('Z-Connect Test Data/Get Combine Statement_TestData').getValue(7, i))

    WS.verifyElementPropertyValue(response, 'getCombinedStatementServiceOperationResponse.RESPONSE.Output.masterAccountNbr', 
        findTestData('Z-Connect Test Data/Get Combine Statement_TestData').getValue(8, i))

    WS.verifyElementPropertyValue(response, 'getCombinedStatementServiceOperationResponse.RESPONSE.Output.lastMaintDate', 
        findTestData('Z-Connect Test Data/Get Combine Statement_TestData').getValue(9, i))

    WS.verifyElementPropertyValue(response, 'getCombinedStatementServiceOperationResponse.RESPONSE.Output.operatorID', findTestData(
            'Z-Connect Test Data/Get Combine Statement_TestData').getValue(10, i))

    WS.verifyElementPropertyValue(response, 'getCombinedStatementServiceOperationResponse.RESPONSE.Output.combinedStatementRelatedAccountsInfo[0].companyNbr', 
        findTestData('Z-Connect Test Data/Get Combine Statement_TestData').getValue(11, i))

    WS.verifyElementPropertyValue(response, 'getCombinedStatementServiceOperationResponse.RESPONSE.Output.combinedStatementRelatedAccountsInfo[0].accountNbr', 
        findTestData('Z-Connect Test Data/Get Combine Statement_TestData').getValue(12, i))

    WS.verifyElementPropertyValue(response, 'getCombinedStatementServiceOperationResponse.RESPONSE.Output.combinedStatementRelatedAccountsInfo[0].accountType', 
        findTestData('Z-Connect Test Data/Get Combine Statement_TestData').getValue(13, i))

    WS.verifyElementPropertyValue(response, 'getCombinedStatementServiceOperationResponse.RESPONSE.Output.combinedStatementRelatedAccountsInfo[0].lastStatementDate', 
        findTestData('Z-Connect Test Data/Get Combine Statement_TestData').getValue(14, i))

    WS.verifyElementPropertyValue(response, 'getCombinedStatementServiceOperationResponse.RESPONSE.Output.combinedStatementRelatedAccountsInfo[0].statementCycle', 
        findTestData('Z-Connect Test Data/Get Combine Statement_TestData').getValue(15, i))

    WS.verifyElementPropertyValue(response, 'getCombinedStatementServiceOperationResponse.RESPONSE.Output.combinedStatementRelatedAccountsInfo[0].svcChgCycle', 
        findTestData('Z-Connect Test Data/Get Combine Statement_TestData').getValue(16, i))

    WS.verifyElementPropertyValue(response, 'getCombinedStatementServiceOperationResponse.RESPONSE.Output.combinedStatementRelatedAccountsInfo[0].intCycle', 
        findTestData('Z-Connect Test Data/Get Combine Statement_TestData').getValue(17, i))

    WS.verifyElementPropertyValue(response, 'getCombinedStatementServiceOperationResponse.RESPONSE.Output.combinedStatementRelatedAccountsInfo[0].fileLocation', 
        findTestData('Z-Connect Test Data/Get Combine Statement_TestData').getValue(18, i))
}

