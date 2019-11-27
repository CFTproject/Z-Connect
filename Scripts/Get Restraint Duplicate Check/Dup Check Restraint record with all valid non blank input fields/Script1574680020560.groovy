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

String str = 'getRestraintDuplicateCheckServiceOperationResponse.RESPONSE.Output.'

testdatapath = findTestData('Z-Connect Test Data/Get Restraint Duplicate Check_TestData')

for (int i = 5; i < 6; i++) {
    response = WS.sendRequest(findTestObject('Get Restraint Duplicate Check/Dup Check Restraint record with all valid non blank input fields'))
	
	WS.verifyResponseStatusCode(response, 200)
	
	WS.verifyElementPropertyValue(response, str+'xStatus.applicationCd', testdatapath.getValue(2, i))
	
	WS.verifyElementPropertyValue(response, str+'xStatus.statusCd', testdatapath.getValue(3, i))
	
	WS.verifyElementPropertyValue(response, str+'xStatus.statusMessage', testdatapath.getValue(4, i))
	
	WS.verifyElementPropertyValue(response, str+'xStatus.severity', testdatapath.getValue(5, i))
	
	WS.verifyElementPropertyValue(response, str+'companyNbr', testdatapath.getValue(6, i))
	
	WS.verifyElementPropertyValue(response, str+'productCd', testdatapath.getValue(7, i))
	
	WS.verifyElementPropertyValue(response, str+'accountNbr', testdatapath.getValue(8, i))
	
	WS.verifyElementPropertyValue(response, str+'duplicateCheckClass', testdatapath.getValue(9, i))
	
	WS.verifyElementPropertyValue(response, str+'duplicateCheckType', testdatapath.getValue(10, i))
	
	WS.verifyElementPropertyValue(response, str+'highCheckNbr', testdatapath.getValue(11, i))
	
	WS.verifyElementPropertyValue(response, str+'lowCheckNbr', testdatapath.getValue(12, i))
	
	WS.verifyElementPropertyValue(response, str+'expireDt', testdatapath.getValue(13, i))
	
	WS.verifyElementPropertyValue(response, str+'placedDt', testdatapath.getValue(14, i))
	
	WS.verifyElementPropertyValue(response, str+'placedTime', testdatapath.getValue(15, i))
	
	WS.verifyElementPropertyValue(response, str+'duplicateCheckStatus', testdatapath.getValue(16, i))
	
	WS.verifyElementPropertyValue(response, str+'duplicateCd', testdatapath.getValue(17, i))
	
	WS.verifyElementPropertyValue(response, str+'checkDt', testdatapath.getValue(18, i))
	
	WS.verifyElementPropertyValue(response, str+'checkOutstandingCount', testdatapath.getValue(19, i))
	
	WS.verifyElementPropertyValue(response, str+'checkPaidCount', testdatapath.getValue(20, i))
	
	WS.verifyElementPropertyValue(response, str+'comment01', testdatapath.getValue(21, i))
	
	WS.verifyElementPropertyValue(response, str+'comment02', testdatapath.getValue(22, i))
	
	WS.verifyElementPropertyValue(response, str+'restraintReason01', testdatapath.getValue(23, i))
	
	WS.verifyElementPropertyValue(response, str+'restraintReason02', testdatapath.getValue(24, i))
	
	WS.verifyElementPropertyValue(response, str+'termCd', testdatapath.getValue(25, i))
	
	WS.verifyElementPropertyValue(response, str+'term', testdatapath.getValue(26, i))
	
	WS.verifyElementPropertyValue(response, str+'numberOfTimesToRenew', testdatapath.getValue(27, i))
	
	WS.verifyElementPropertyValue(response, str+'numberOfTimesRenewed', testdatapath.getValue(28, i))
	
	WS.verifyElementPropertyValue(response, str+'renewalDt', testdatapath.getValue(29, i))
	
	WS.verifyElementPropertyValue(response, str+'channel', testdatapath.getValue(30, i))
	
	
}