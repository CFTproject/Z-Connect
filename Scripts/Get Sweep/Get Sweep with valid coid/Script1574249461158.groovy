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

String str = 'getSweepServiceOperationResponse.RESPONSE.Output.'

testdatapath = findTestData('Z-Connect Test Data/Get Sweep_TestData')

for (int i = 7; i < 8; i++) {
    println('EXCEL SHEET ROW NUMBER IS : ' + i)

    response = WS.sendRequest(findTestObject('Get Sweep/Get Sweep with valid coid'))
	
	WS.verifyResponseStatusCode(response, 200)
	
	WS.verifyElementPropertyValue(response, str+'xStatus.applicationCd', testdatapath.getValue(2, i))
	
	WS.verifyElementPropertyValue(response, str+'xStatus.statusCd', testdatapath.getValue(3, i))
	
	WS.verifyElementPropertyValue(response, str+'xStatus.statusMessage', testdatapath.getValue(4, i))
	
	WS.verifyElementPropertyValue(response, str+'xStatus.severity', testdatapath.getValue(5, i))
	
	WS.verifyElementPropertyValue(response, str+'sweepType', testdatapath.getValue(6, i))
	
	WS.verifyElementPropertyValue(response, str+'originatingProductCd', testdatapath.getValue(7, i))
	
	WS.verifyElementPropertyValue(response, str+'originatingAccountNbr', testdatapath.getValue(8, i))
	
	WS.verifyElementPropertyValue(response, str+'sweepSequenceNbr', testdatapath.getValue(9, i))
	
	WS.verifyElementPropertyValue(response, str+'relatedProductCd', testdatapath.getValue(10, i))
	
	WS.verifyElementPropertyValue(response, str+'relatedAccountNbr', testdatapath.getValue(11, i))
	
	WS.verifyElementPropertyValue(response, str+'relatedExecSequenceNbr', testdatapath.getValue(12, i))
	
	WS.verifyElementPropertyValue(response, str+'executionProcSeqCd', testdatapath.getValue(13, i))
	
	WS.verifyElementPropertyValue(response, str+'sweepStatus', testdatapath.getValue(14, i))
	
	WS.verifyElementPropertyValue(response, str+'ownershipCd', testdatapath.getValue(15, i))
	
	WS.verifyElementPropertyValue(response, str+'balanceCd', testdatapath.getValue(17, i))
	
	WS.verifyElementPropertyValue(response, str+'instructionCd', testdatapath.getValue(18, i))
	
	WS.verifyElementPropertyValue(response, str+'targetAmt', testdatapath.getValue(19, i))
	
	WS.verifyElementPropertyValue(response, str+'minimumBalance', testdatapath.getValue(20, i))
	
	WS.verifyElementPropertyValue(response, str+'maximumBalance', testdatapath.getValue(21, i))
	
	WS.verifyElementPropertyValue(response, str+'varianceAmt', testdatapath.getValue(22, i))
	
	WS.verifyElementPropertyValue(response, str+'incrementAmt', testdatapath.getValue(23, i))
	
	WS.verifyElementPropertyValue(response, str+'dailyLimitAmt', testdatapath.getValue(24, i))
	
	WS.verifyElementPropertyValue(response, str+'relatedDate', testdatapath.getValue(25, i))
	
	WS.verifyElementPropertyValue(response, str+'zbaControlId', testdatapath.getValue(26, i))
	
	WS.verifyElementPropertyValue(response, str+'activityCntCTD', testdatapath.getValue(27, i))
	
	WS.verifyElementPropertyValue(response, str+'activityCntYTD', testdatapath.getValue(28, i))
	
	WS.verifyElementPropertyValue(response, str+'transferredAmtCTD', testdatapath.getValue(29, i))
	
	WS.verifyElementPropertyValue(response, str+'transferredAmtYTD', testdatapath.getValue(30, i))
	
	WS.verifyElementPropertyValue(response, str+'lastTransferAmt', testdatapath.getValue(31, i))
	
	WS.verifyElementPropertyValue(response, str+'lastTransferDate', testdatapath.getValue(32, i))
}