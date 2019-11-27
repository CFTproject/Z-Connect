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

response = WS.sendRequest(findTestObject('Create Combined Statement/Create Combined Statement Post Request Verify Response with Empty Values', 
        [('companyNbr') : findTestData('Z-Connect Test Data/Create Combined Statement_TestData').getValue(2, 2), ('accountType') : findTestData(
                'Z-Connect Test Data/Create Combined Statement_TestData').getValue(3, 2), ('accountNbr') : findTestData(
                'Z-Connect Test Data/Create Combined Statement_TestData').getValue(4, 2), ('MA_actionCd') : findTestData(
                'Z-Connect Test Data/Create Combined Statement_TestData').getValue(5, 2), ('MA_companyNbr') : findTestData(
                'Z-Connect Test Data/Create Combined Statement_TestData').getValue(6, 2), ('MA_accountNbr') : findTestData(
                'Z-Connect Test Data/Create Combined Statement_TestData').getValue(7, 2), ('MA_accountType') : findTestData(
                'Z-Connect Test Data/Create Combined Statement_TestData').getValue(8, 2)]))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, 'createCombinedStatementServiceOperationResponse.RESPONSE.Output.xStatus.applicationCd', 
    applicationCd)

WS.verifyElementPropertyValue(response, 'createCombinedStatementServiceOperationResponse.RESPONSE.Output.xStatus.statusCd', 
    statusCd)

WS.verifyElementPropertyValue(response, 'createCombinedStatementServiceOperationResponse.RESPONSE.Output.xStatus.statusMessage', 
    statusMessage)

WS.verifyElementPropertyValue(response, 'createCombinedStatementServiceOperationResponse.RESPONSE.Output.xStatus.severity', 
    severity)

