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

response = WS.sendRequest(findTestObject('Get Deposit Account TDA/Get Account details for REA account positive'))

WS.verifyResponseStatusCode(response, 200)

String str = 'getDepositAccountTDAServiceOperationResponse.RESPONSE.Output.'

testdatapath = findTestData('Z-Connect Test Data/Get Deposit Account TDA_TestData')

for(int i=3; i<4; i++)
{
	println ('EXCEL SHEET ROW NUMBER IS '+i)
	WS.verifyElementPropertyValue(response, str+'xStatus.applicationCd', testdatapath.getValue(2, i))
	
	WS.verifyElementPropertyValue(response, str+'xStatus.statusCd', testdatapath.getValue(3, i))
	
	WS.verifyElementPropertyValue(response, str+'xStatus.statusmessage', testdatapath.getValue(4, i))
	
	WS.verifyElementPropertyValue(response, str+'xStatus.severity', testdatapath.getValue(5, i))
	
	WS.verifyElementPropertyValue(response, str+'companyNbr', testdatapath.getValue(6, i))
	
	WS.verifyElementPropertyValue(response, str+'accountNbr', testdatapath.getValue(7, i))
	
	WS.verifyElementPropertyValue(response, str+'processingId', testdatapath.getValue(8, i))
	
	WS.verifyElementPropertyValue(response, str+'aggPlusLedgerBalance', testdatapath.getValue(9, i))
	
	WS.verifyElementPropertyValue(response, str+'aggPlusLedgerDays', testdatapath.getValue(10, i))
	
	WS.verifyElementPropertyValue(response, str+'aggOverdrawnLedgerBalance', testdatapath.getValue(11, i))
	
	WS.verifyElementPropertyValue(response, str+'aggOverdrawnLedgerDays', testdatapath.getValue(12, i))
	
	WS.verifyElementPropertyValue(response, str+'aggPlusCollectedBalance', testdatapath.getValue(13, i))
	
	WS.verifyElementPropertyValue(response, str+'aggPlusCollectedDays', testdatapath.getValue(14, i))
	
	WS.verifyElementPropertyValue(response, str+'aggOverdrawnCollectedBal', testdatapath.getValue(15, i))
	
	WS.verifyElementPropertyValue(response, str+'aggOverdrawnCollectedDays', testdatapath.getValue(16, i))
	
	WS.verifyElementPropertyValue(response, str+'ledgerBalanceLow', testdatapath.getValue(17, i))
	
	WS.verifyElementPropertyValue(response, str+'ledgerBalanceHigh', testdatapath.getValue(18, i))
	
	WS.verifyElementPropertyValue(response, str+'collectedBalanceLow', testdatapath.getValue(19, i))
	
	WS.verifyElementPropertyValue(response, str+'collectedBalanceHigh', testdatapath.getValue(20, i))
	
	WS.verifyElementPropertyValue(response, str+'creditsCount', testdatapath.getValue(21, i))
	
	WS.verifyElementPropertyValue(response, str+'aggCreditsAmount', testdatapath.getValue(22, i))
	
	WS.verifyElementPropertyValue(response, str+'debitsCount', testdatapath.getValue(23, i))
	
	WS.verifyElementPropertyValue(response, str+'aggDebitsAmount', testdatapath.getValue(24, i))
	
	WS.verifyElementPropertyValue(response, str+'chargeableCreditsCount', testdatapath.getValue(25, i))
	
	WS.verifyElementPropertyValue(response, str+'chargeableDebitsCount', testdatapath.getValue(26, i))
	
	WS.verifyElementPropertyValue(response, str+'paperCreditsCount', testdatapath.getValue(27, i))
	
	WS.verifyElementPropertyValue(response, str+'paperDebitsCount', testdatapath.getValue(28, i))
	
	WS.verifyElementPropertyValue(response, str+'paperlessCreditsCount', testdatapath.getValue(29, i))
	
	WS.verifyElementPropertyValue(response, str+'paperlessDebitsCount', testdatapath.getValue(30, i))
	
	WS.verifyElementPropertyValue(response, str+'chargebacksCount', testdatapath.getValue(31, i))
	
	WS.verifyElementPropertyValue(response, str+'chargebacksAmount', testdatapath.getValue(32, i))
	
	WS.verifyElementPropertyValue(response, str+'depositsCount', testdatapath.getValue(33, i))
	
	WS.verifyElementPropertyValue(response, str+'depositsAmount', testdatapath.getValue(34, i))
	
	WS.verifyElementPropertyValue(response, str+'depositedItemsCount', testdatapath.getValue(35, i))
	
	WS.verifyElementPropertyValue(response, str+'withdrawalsCount', testdatapath.getValue(36, i))
	
	WS.verifyElementPropertyValue(response, str+'withdrawalsAmount', testdatapath.getValue(37, i))
	
	WS.verifyElementPropertyValue(response, str+'balanceAfterInterestPymt', testdatapath.getValue(38, i))
	
	WS.verifyElementPropertyValue(response, str+'interestLastAccruedAmount', testdatapath.getValue(39, i))
	
	WS.verifyElementPropertyValue(response, str+'interestAccruedCtdAmount', testdatapath.getValue(40, i))
	
	WS.verifyElementPropertyValue(response, str+'interestPaidCtdAmount', testdatapath.getValue(41, i))
	
	WS.verifyElementPropertyValue(response, str+'balanceForInterestAccrual', testdatapath.getValue(42, i))
	
	WS.verifyElementPropertyValue(response, str+'interestPenaltyCtdAmount', testdatapath.getValue(43, i))
	
	WS.verifyElementPropertyValue(response, str+'priorAverageBalanceCtd', testdatapath.getValue(44, i))
	
	WS.verifyElementPropertyValue(response, str+'priorMinimumBalanceCtd', testdatapath.getValue(45, i))
	
	WS.verifyElementPropertyValue(response, str+'currentBalance', testdatapath.getValue(46, i))
	
	WS.verifyElementPropertyValue(response, str+'currentCollectedBalance', testdatapath.getValue(47, i))
	
	WS.verifyElementPropertyValue(response, str+'pledgedRestraintsAmount', testdatapath.getValue(48, i))
	
	WS.verifyElementPropertyValue(response, str+'lastCustomerActivityDate', testdatapath.getValue(49, i))
	
	WS.verifyElementPropertyValue(response, str+'lastDrCrTransactionAmount', testdatapath.getValue(50, i))
	
	WS.verifyElementPropertyValue(response, str+'lastDepositAmount', testdatapath.getValue(51, i))
	
	WS.verifyElementPropertyValue(response, str+'lastDirectDepositAmount', testdatapath.getValue(52, i))
	
	WS.verifyElementPropertyValue(response, str+'lastWithdrawalAmount', testdatapath.getValue(53, i))
	
	WS.verifyElementPropertyValue(response, str+'lastDirectWithdrawalAmount', testdatapath.getValue(54, i))
	
	WS.verifyElementPropertyValue(response, str+'branch', testdatapath.getValue(55, i))
	
	WS.verifyElementPropertyValue(response, str+'costCenter', testdatapath.getValue(56, i))
	
	WS.verifyElementPropertyValue(response, str+'accountNumberToCredit', testdatapath.getValue(57, i))
	
	WS.verifyElementPropertyValue(response, str+'interestRate', testdatapath.getValue(58, i))
	
	WS.verifyElementPropertyValue(response, str+'compoundFrequency', testdatapath.getValue(59, i))
	
	WS.verifyElementPropertyValue(response, str+'aipTransitRouting', testdatapath.getValue(60, i))
	
	WS.verifyElementPropertyValue(response, str+'exemptCodeChangeDate', testdatapath.getValue(61, i))
	
	WS.verifyElementPropertyValue(response, str+'firstBNoticeDate', testdatapath.getValue(62, i))
	
	WS.verifyElementPropertyValue(response, str+'secondBNoticeDateEnter', testdatapath.getValue(63, i))
	
	WS.verifyElementPropertyValue(response, str+'cNoticeDate', testdatapath.getValue(64, i))
	
	WS.verifyElementPropertyValue(response, str+'term', testdatapath.getValue(65, i))
	
	
}