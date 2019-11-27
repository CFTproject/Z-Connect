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

response = WS.sendRequest(findTestObject('Delete Currency Rates/Invalid Time in API Request'))

WS.verifyResponseStatusCode(response, 200)

String str = 'deleteCurrencyRatesServiceOperationResponse.RESPONSE.Output.xStatus.'

testdatapath = findTestData('Z-Connect Test Data/Delete Currency Rates_TestData')

for (int i = 4; i < 5; i++) {
	println ('EXCEL SHEET ROW NUMBER IS : '+i)
    WS.verifyElementPropertyValue(response, str + 'applicationCd', testdatapath.getValue(2, i))

    WS.verifyElementPropertyValue(response, str + 'statusCd', testdatapath.getValue(3, i))

    WS.verifyElementPropertyValue(response, str + 'statusMessage', testdatapath.getValue(4, i))

    WS.verifyElementPropertyValue(response, str + 'severity', testdatapath.getValue(5, i))
}

