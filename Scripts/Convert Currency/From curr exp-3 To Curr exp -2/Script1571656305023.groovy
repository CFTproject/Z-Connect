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

response = WS.sendRequest(findTestObject('Convert Currency/From curr exp-3 To Curr exp -2'))

WS.verifyResponseStatusCode(response, 200)

String str = 'convertCurrencyServiceOperationResponse.RESPONSE.Output.'

testdatapath = findTestData('Z-Connect Test Data/Convert Currency_TestData')

for(int i=10; i<11; i++)
{
	println ('EXCEL SHEET ROW NUMBER IS :'+i)
	
	WS.verifyElementPropertyValue(response, str+'xStatus.applicationCd', testdatapath.getValue(2, i))
	
	WS.verifyElementPropertyValue(response, str+'xStatus.statusCd', testdatapath.getValue(3, i))
	
	WS.verifyElementPropertyValue(response, str+'xStatus.statusMessage', testdatapath.getValue(4, i))
	
	WS.verifyElementPropertyValue(response, str+'xStatus.severity', testdatapath.getValue(5, i))
	
	WS.verifyElementPropertyValue(response, str+'fromCompanyNbr', testdatapath.getValue(6, i))
	
	WS.verifyElementPropertyValue(response, str+'toCompanyNbr', testdatapath.getValue(7, i))
	
	
	WS.verifyElementPropertyValue(response, str+'fromCurr', testdatapath.getValue(9, i))
	
	WS.verifyElementPropertyValue(response, str+'toCurr', testdatapath.getValue(10, i))
	
	
	
	WS.verifyElementPropertyValue(response, str+'amount', testdatapath.getValue(13, i))
	
	WS.verifyElementPropertyValue(response, str+'effectiveDate', testdatapath.getValue(14, i))
	
	//WS.verifyElementPropertyValue(response, str+'effectiveTime', testdatapath.getValue(15, i))
	
	WS.verifyElementPropertyValue(response, str+'feeFlag', testdatapath.getValue(16, i))
	
	WS.verifyElementPropertyValue(response, str+'branch', testdatapath.getValue(17, i))
	
	WS.verifyElementPropertyValue(response, str+'overrideRateInt', testdatapath.getValue(18, i))
	
	WS.verifyElementPropertyValue(response, str+'overrideRateExp', testdatapath.getValue(19, i))
	
	WS.verifyElementPropertyValue(response, str+'finalExchangeRateInt', testdatapath.getValue(20, i))
	
	WS.verifyElementPropertyValue(response, str+'finalExchangeRateExp', testdatapath.getValue(21, i))
	
	WS.verifyElementPropertyValue(response, str+'finalExchangeAmount', testdatapath.getValue(22, i))
	
	WS.verifyElementPropertyValue(response, str+'finalExchangeCurrExp', testdatapath.getValue(23, i))
	
		
}

