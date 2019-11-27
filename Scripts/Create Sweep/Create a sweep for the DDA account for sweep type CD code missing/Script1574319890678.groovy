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

String str = 'createSweepServiceOperationResponse.RESPONSE.Output.xStatus.'

testdatapath = findTestData('Z-Connect Test Data/Create Sweep_TestData')

for (int i = 3; i < 4; i++) {
	println ('EXCEL SHEET ROW NUMBER IS : '+i)
    response = WS.sendRequest(findTestObject('Create Sweep/Create a sweep for the DDA account for sweep type CD code missing', [('companyNbr') : testdatapath.getValue(
                    2, i), ('sweepType') : testdatapath.getValue(3, i), ('originatingCompanyNbr') : testdatapath.getValue(
                    4, i), ('originatingAccountNbr') : testdatapath.getValue(5, i), ('sweepSequenceNbr') : testdatapath.getValue(
                    6, i), ('relatedCompanyNbr') : testdatapath.getValue(7, i), ('relatedProductCd') : testdatapath.getValue(
                    8, i), ('relatedAccountNbr') : testdatapath.getValue(9, i), ('relatedExecSequenceNbr') : testdatapath.getValue(
                    10, i), ('executionProcSeqCd') : testdatapath.getValue(11, i), ('sweepStatus') : testdatapath.getValue(
                    12, i), ('ownershipCd') : testdatapath.getValue(13, i), ('protectionAcctBalanceCd') : testdatapath.getValue(
                    14, i), ('balanceCd') : testdatapath.getValue(15, i), ('instructionCd') : testdatapath.getValue(16, 
                    i), ('targetAmt') : testdatapath.getValue(17, i), ('minimumBalance') : testdatapath.getValue(18, i), ('maximumBalance') : testdatapath.getValue(
                    19, i), ('varianceAmt') : testdatapath.getValue(20, i), ('incrementAmt') : testdatapath.getValue(21, 
                    i), ('suspendExcess') : testdatapath.getValue(22, i), ('dailyLimitAmt') : testdatapath.getValue(23, 
                    i), ('globalAvailableInd') : testdatapath.getValue(24, i)]))

    WS.verifyResponseStatusCode(response, 200)
	
	WS.verifyElementPropertyValue(response, str+'applicationCd', testdatapath.getValue(26, i))
	
	WS.verifyElementPropertyValue(response, str+'statusCd', testdatapath.getValue(27, i))
	
	WS.verifyElementPropertyValue(response, str+'detailMessages', testdatapath.getValue(28, i))
	
	WS.verifyElementPropertyValue(response, str+'severity', testdatapath.getValue(29, i))
}