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

response = WS.sendRequest(findTestObject('Change Currency Rates/effectiveTime is Mandatory'))

WS.verifyResponseStatusCode(response, 200)

for (int i = 10; i < 11; i++) {
    println('EXCEL SHEET ROW NUMBER IS :' + i)

    WS.verifyElementPropertyValue(response, 'changeCurrencyRatesServiceOperationResponse.RESPONSE.Output.xStatus.applicationCd', 
        findTestData('Z-Connect Test Data/Change Currency Rates1_TestData').getValue(2, i))

    WS.verifyElementPropertyValue(response, 'changeCurrencyRatesServiceOperationResponse.RESPONSE.Output.xStatus.statusCd', 
        findTestData('Z-Connect Test Data/Change Currency Rates1_TestData').getValue(3, i))

    WS.verifyElementPropertyValue(response, 'changeCurrencyRatesServiceOperationResponse.RESPONSE.Output.xStatus.statusMessage', 
        findTestData('Z-Connect Test Data/Change Currency Rates1_TestData').getValue(4, i))

    WS.verifyElementPropertyValue(response, 'changeCurrencyRatesServiceOperationResponse.RESPONSE.Output.xStatus.severity', 
        findTestData('Z-Connect Test Data/Change Currency Rates1_TestData').getValue(5, i))
}

