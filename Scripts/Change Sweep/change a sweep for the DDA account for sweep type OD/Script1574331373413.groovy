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

String str = 'changeSweepServiceOperationResponse.RESPONSE.Output.xStatus.'

testdatapath = findTestData('Z-Connect Test Data/Change Sweep_TestData')

for (int i = 2; i < 3; i++) {
    println('EXCEL SHEET ROW NUMBER IS : ' + i)

    response = WS.sendRequest(findTestObject('Change Sweep/change a sweep for the DDA account for sweep type OD', [('companyId') : testdatapath.getValue(
                    2, i), ('sweepType') : testdatapath.getValue(3, i), ('originatingAccountNbr') : testdatapath.getValue(
                    4, i), ('sweepSequenceNbr') : testdatapath.getValue(5, i), ('relatedProductCd') : testdatapath.getValue(
                    6, i), ('relatedExecSequenceNbr') : testdatapath.getValue(7, i), ('executionProcSeqCd') : testdatapath.getValue(
                    8, i), ('sweepStatus') : testdatapath.getValue(9, i), ('ownershipCd') : testdatapath.getValue(10, i)
                , ('protectionAcctBalanceCd') : testdatapath.getValue(11, i), ('balanceCd') : testdatapath.getValue(12, 
                    i), ('instructionCd') : testdatapath.getValue(13, i), ('targetAmt') : testdatapath.getValue(14, i), ('minimumBalance') : testdatapath.getValue(
                    15, i), ('maximumBalance') : testdatapath.getValue(16, i), ('varianceAmt') : testdatapath.getValue(17, 
                    i), ('incrementAmt') : testdatapath.getValue(18, i), ('suspendExcess') : testdatapath.getValue(19, i)
                , ('dailyLimitAmt') : testdatapath.getValue(20, i), ('globalAvailableInd') : testdatapath.getValue(21, i)]))

    WS.verifyResponseStatusCode(response, 200)
	
	WS.verifyElementPropertyValue(response, str+'applicationCd', testdatapath.getValue(26, i))
	
	WS.verifyElementPropertyValue(response, str+'statusCd', testdatapath.getValue(27, i))
	
	WS.verifyElementPropertyValue(response, str+'statusMessage', testdatapath.getValue(28, i))
	
	WS.verifyElementPropertyValue(response, str+'severity', testdatapath.getValue(29, i))
}