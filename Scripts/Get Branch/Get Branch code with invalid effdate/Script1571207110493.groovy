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

response = WS.sendRequest(findTestObject('Get Branch/Get Branch code with invalid effdate'))

WS.verifyResponseStatusCode(response, 200)

String str = 'getBranchServiceOperationResponse.RESPONSE.Output.'

testdatapath = findTestData('Z-Connect Test Data/Get Branch_TestData')

for (int i = 3; i < 4; i++) {
	
    println('EXCEL SHEET ROW NUMBER IS :' + i)
	
	WS.verifyElementPropertyValue(response, str+'XSTATUS.applicationCd', testdatapath.getValue(2, i))
	
	WS.verifyElementPropertyValue(response, str+'XSTATUS.statusCd', testdatapath.getValue(3, i))
	
	WS.verifyElementPropertyValue(response, str+'XSTATUS.statusMessage', testdatapath.getValue(4, i))
	
	WS.verifyElementPropertyValue(response, str+'XSTATUS.severity', testdatapath.getValue(5, i))
	
	    
}

