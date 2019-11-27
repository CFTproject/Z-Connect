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

String str = 'getSweepSummaryServiceOperationResponse.RESPONSE.Output.'

testdatapath = findTestData('Z-Connect Test Data/Get Sweep Summary_TestData')

for (int i = 4; i < 5; i++) {
    println('EXCEL SHEET ROW NUMBER IS : ' + i)

    response = WS.sendRequest(findTestObject('Get Sweep Summary/cycle sweep count cycleSweepActivityCount'))
	
	WS.verifyResponseStatusCode(response, 200)
	
	WS.verifyElementPropertyValue(response, str+'xStatus.applicationCd', testdatapath.getValue(2, i))
	
	WS.verifyElementPropertyValue(response, str+'xStatus.statusCd', testdatapath.getValue(3, i))
	
	WS.verifyElementPropertyValue(response, str+'xStatus.statusMessage', testdatapath.getValue(4, i))
	
	WS.verifyElementPropertyValue(response, str+'xStatus.severity', testdatapath.getValue(5, i))
	
	WS.verifyElementPropertyValue(response, str+'companyNbr', testdatapath.getValue(6, i))
	
	WS.verifyElementPropertyValue(response, str+'productCd', testdatapath.getValue(7, i))
	
	WS.verifyElementPropertyValue(response, str+'accountNbr', testdatapath.getValue(8, i))
	
	WS.verifyElementPropertyValue(response, str+'lastMaintenanceDate', testdatapath.getValue(9, i))
	
	WS.verifyElementPropertyValue(response, str+'lastActivityDate', testdatapath.getValue(10, i))
	
	//WS.verifyElementPropertyValue(response, str+'executionProcessingSeqCd', testdatapath.getValue(11, i))
	
	WS.verifyElementPropertyValue(response, str+'plasticTransferAmt', testdatapath.getValue(12, i))
	
	WS.verifyElementPropertyValue(response, str+'zbaControlCompanyNbr', testdatapath.getValue(13, i))
	
	WS.verifyElementPropertyValue(response, str+'zbaControlId', testdatapath.getValue(14, i))
	
	WS.verifyElementPropertyValue(response, str+'cycleSweepRelatedAcctCount', testdatapath.getValue(15, i))
	
	WS.verifyElementPropertyValue(response, str+'cycleSweepCount', testdatapath.getValue(16, i))
	
	WS.verifyElementPropertyValue(response, str+'cycleSweepActivityCount', testdatapath.getValue(17, i))
	
	WS.verifyElementPropertyValue(response, str+'moneyFundRelatedAcctCount', testdatapath.getValue(18, i))
	
	WS.verifyElementPropertyValue(response, str+'moneyFundCount', testdatapath.getValue(19, i))
	
	WS.verifyElementPropertyValue(response, str+'moneyFundActivityCount', testdatapath.getValue(20, i))
	
	WS.verifyElementPropertyValue(response, str+'transferBalanceRelatedAcctCount', testdatapath.getValue(21, i))
	
	WS.verifyElementPropertyValue(response, str+'transferBalanceCount', testdatapath.getValue(22, i))
	
	WS.verifyElementPropertyValue(response, str+'transferBalanceActivityCount', testdatapath.getValue(23, i))
	
	WS.verifyElementPropertyValue(response, str+'transferCreditRelatedAcctCount', testdatapath.getValue(24, i))
	
	WS.verifyElementPropertyValue(response, str+'transferCreditCount', testdatapath.getValue(25, i))
	
	WS.verifyElementPropertyValue(response, str+'transferCreditActivityCount', testdatapath.getValue(26, i))
	
	WS.verifyElementPropertyValue(response, str+'transferDebitRelatedAcctCount', testdatapath.getValue(27, i))
	
	WS.verifyElementPropertyValue(response, str+'transferDebitCount', testdatapath.getValue(28, i))
	
	WS.verifyElementPropertyValue(response, str+'transferDebitActivityCount', testdatapath.getValue(29, i))
	
	WS.verifyElementPropertyValue(response, str+'transferSweepRelatedAcctCount', testdatapath.getValue(30, i))
	
	WS.verifyElementPropertyValue(response, str+'transferSweepCount', testdatapath.getValue(31, i))
	
	WS.verifyElementPropertyValue(response, str+'transferSweepActivityCount', testdatapath.getValue(32, i))
	
	WS.verifyElementPropertyValue(response, str+'odProtectionRelatedAcctCount', testdatapath.getValue(33, i))
	
	WS.verifyElementPropertyValue(response, str+'odProtectionCount', testdatapath.getValue(34, i))
	
	WS.verifyElementPropertyValue(response, str+'odProtectionActivityCount', testdatapath.getValue(35, i))
	
	WS.verifyElementPropertyValue(response, str+'controlledDisbRelatedAcctCount', testdatapath.getValue(36, i))
	
	WS.verifyElementPropertyValue(response, str+'controlledDisbCount', testdatapath.getValue(37, i))
	
	WS.verifyElementPropertyValue(response, str+'controlledDisbActivityCount', testdatapath.getValue(38, i))
	
	WS.verifyElementPropertyValue(response, str+'userSweepRelatedAcctCount', testdatapath.getValue(39, i))
	
	WS.verifyElementPropertyValue(response, str+'userSweepCount', testdatapath.getValue(40, i))
	
	WS.verifyElementPropertyValue(response, str+'userSweepActivityCount', testdatapath.getValue(41, i))
	
	WS.verifyElementPropertyValue(response, str+'globalAvailableBalRelatedAcctCount', testdatapath.getValue(42, i))
	
	WS.verifyElementPropertyValue(response, str+'globalAvailableBalanceCount', testdatapath.getValue(43, i))
	
	
}