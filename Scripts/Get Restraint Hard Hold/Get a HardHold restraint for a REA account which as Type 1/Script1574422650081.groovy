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

String str = 'getRestraintHardHoldServiceOperationResponse.RESPONSE.Output.'

testdatapath = findTestData('Z-Connect Test Data/Get Restraint Hard Hold_TestData')

for (int i = 8; i < 9; i++) {
    println('EXCEL SHEET ROW NUMBER IS :' + i)

    response = WS.sendRequest(findTestObject('Get Restraint Hard Hold/Get a HardHold restraint for a REA account which as Type 1'))
	
	WS.verifyResponseStatusCode(response, 200)
	
	WS.verifyElementPropertyValue(response, str+'xStatus.applicationCd', testdatapath.getValue(2, i))
	
	WS.verifyElementPropertyValue(response, str+'xStatus.statusCd', testdatapath.getValue(3, i))
	
	WS.verifyElementPropertyValue(response, str+'xStatus.statusMessage', testdatapath.getValue(4, i))
	
	WS.verifyElementPropertyValue(response, str+'xStatus.severity', testdatapath.getValue(5, i))
	
	WS.verifyElementPropertyValue(response, str+'companyNbr', testdatapath.getValue(6, i))
	
	WS.verifyElementPropertyValue(response, str+'productCd', testdatapath.getValue(7, i))
	
	WS.verifyElementPropertyValue(response, str+'accountNbr', testdatapath.getValue(8, i))
	
	WS.verifyElementPropertyValue(response, str+'hardHoldClass', testdatapath.getValue(9, i))
	
	WS.verifyElementPropertyValue(response, str+'hardHoldType', testdatapath.getValue(10, i))
	
	WS.verifyElementPropertyValue(response, str+'expireDt', testdatapath.getValue(11, i))
	
	WS.verifyElementPropertyValue(response, str+'placedDt', testdatapath.getValue(12, i))
	
	WS.verifyElementPropertyValue(response, str+'sequenceNbr', testdatapath.getValue(13, i))
	
	WS.verifyElementPropertyValue(response, str+'hardHoldStatus', testdatapath.getValue(14, i))
	
	WS.verifyElementPropertyValue(response, str+'typeCd', testdatapath.getValue(15, i))
	
	WS.verifyElementPropertyValue(response, str+'reasonCd', testdatapath.getValue(16, i))
	
	WS.verifyElementPropertyValue(response, str+'comment01', testdatapath.getValue(17, i))
	
	WS.verifyElementPropertyValue(response, str+'comment02', testdatapath.getValue(18, i))
	
	WS.verifyElementPropertyValue(response, str+'restraintReason01', testdatapath.getValue(19, i))
	
	WS.verifyElementPropertyValue(response, str+'restraintReason02', testdatapath.getValue(20, i))
	
	
}