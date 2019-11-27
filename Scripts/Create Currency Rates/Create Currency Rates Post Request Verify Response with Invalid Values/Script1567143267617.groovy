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

response = WS.sendRequest(findTestObject('Create Currency Rates/Create Currency Rates Post Request Verify Response with Invalid Values'))

WS.verifyResponseStatusCode(response, 400)

for(int i=3; i< 4; i++){
	
println ('EXCEL SHEET ROW NUMBER IS:'+i)

WS.verifyElementPropertyValue(response, 'errorMessage', findTestData('Z-Connect Test Data/Create Currency Rates_TestData').getValue(6, i))

WS.verifyElementPropertyValue(response, 'errorDetails', findTestData('Z-Connect Test Data/Create Currency Rates_TestData').getValue(7, i))



}


