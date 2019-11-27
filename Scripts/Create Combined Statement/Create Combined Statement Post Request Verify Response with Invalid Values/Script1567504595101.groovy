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

response = WS.sendRequest(findTestObject('Create Combined Statement/Create Combined Statement Post Request Verify Response with Invalid Values', 
        [('companyNbr') : findTestData('Z-Connect Test Data/Create Combined Statement_TestData').getValue(2, 3), ('accountType') : findTestData(
                'Z-Connect Test Data/Create Combined Statement_TestData').getValue(3, 3), ('accountNbr') : findTestData(
                'Z-Connect Test Data/Create Combined Statement_TestData').getValue(4, 3), ('MA_actionCd') : findTestData(
                'Z-Connect Test Data/Create Combined Statement_TestData').getValue(5, 3), ('MA_companyNbr') : findTestData(
                'Z-Connect Test Data/Create Combined Statement_TestData').getValue(6, 3), ('MA_accountNbr') : findTestData(
                'Z-Connect Test Data/Create Combined Statement_TestData').getValue(7, 3), ('MA_accountType') : findTestData(
                'Z-Connect Test Data/Create Combined Statement_TestData').getValue(8, 3)]))

WS.verifyResponseStatusCode(response, 400)

WS.verifyElementPropertyValue(response, 'errorMessage', errorMessage)

WS.verifyElementPropertyValue(response, 'errorDetails', errorDetails)


