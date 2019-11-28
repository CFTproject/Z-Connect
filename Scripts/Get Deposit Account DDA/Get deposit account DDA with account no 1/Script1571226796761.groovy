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

String str = 'getDepositAccountDDAServiceOperationResponse.RESPONSE.Output.'

testdatapath = findTestData('Z-Connect Test Data/Get Deposit Account DDA_TestData')

testdatapath1 = findTestData('Z-Connect Test Data/Get Deposit Account DDA1_TestData')

response = WS.sendRequest(findTestObject('Get Deposit Account DDA/Get deposit account DDA with account no 1'))

WS.verifyResponseStatusCode(response, 200)

for (int i = 2; i < 3; i++) {
    println('EXCEL SHEET ROW NUMBER IS : ' + i)

    WS.verifyElementPropertyValue(response, str + 'xStatus.applicationCd', testdatapath.getValue(2, i))

    WS.verifyElementPropertyValue(response, str + 'xStatus.statusCd', testdatapath.getValue(3, i))

    WS.verifyElementPropertyValue(response, str + 'xStatus.statusmessage', testdatapath.getValue(4, i))

    WS.verifyElementPropertyValue(response, str + 'xStatus.severity', testdatapath.getValue(5, i))

    WS.verifyElementPropertyValue(response, str + 'companyNbr', testdatapath.getValue(6, i))

    WS.verifyElementPropertyValue(response, str + 'accountNbr', testdatapath.getValue(7, i))

    WS.verifyElementPropertyValue(response, str + 'accountName', testdatapath.getValue(8, i))

    WS.verifyElementPropertyValue(response, str + 'subProductCd', testdatapath.getValue(9, i))

    WS.verifyElementPropertyValue(response, str + 'processingId', testdatapath.getValue(10, i))

    WS.verifyElementPropertyValue(response, str + 'openDate', testdatapath.getValue(11, i))

    WS.verifyElementPropertyValue(response, str + 'odLineAmount', testdatapath.getValue(12, i))

    WS.verifyElementPropertyValue(response, str + 'packageCode', testdatapath.getValue(13, i))

    WS.verifyElementPropertyValue(response, str + 'arpCode', testdatapath.getValue(14, i))

    WS.verifyElementPropertyValue(response, str + 'obpCode', testdatapath.getValue(15, i))

    WS.verifyElementPropertyValue(response, str + 'largeItemMonitor', testdatapath.getValue(16, i))

    WS.verifyElementPropertyValue(response, str + 'transactionAdviceCode', testdatapath.getValue(17, i))

    WS.verifyElementPropertyValue(response, str + 'sigBalChgCd', testdatapath.getValue(18, i))

    WS.verifyElementPropertyValue(response, str + 'accountStatus', testdatapath.getValue(19, i))

    WS.verifyElementPropertyValue(response, str + 'accountRestClass1', testdatapath.getValue(20, i))

    WS.verifyElementPropertyValue(response, str + 'accountRestClass2', testdatapath.getValue(21, i))

    WS.verifyElementPropertyValue(response, str + 'accountRestClass3', testdatapath.getValue(22, i))

    WS.verifyElementPropertyValue(response, str + 'lateChargeCode', testdatapath.getValue(23, i))

    WS.verifyElementPropertyValue(response, str + 'lateChargeWaiveCode', testdatapath.getValue(24, i))

    WS.verifyElementPropertyValue(response, str + 'zeroBalanceAccountCode', testdatapath.getValue(25, i))

    WS.verifyElementPropertyValue(response, str + 'driverProcessing', testdatapath.getValue(26, i))

    WS.verifyElementPropertyValue(response, str + 'signatureRequiredCount', testdatapath.getValue(27, i))

    WS.verifyElementPropertyValue(response, str + 'billingMethodCode', testdatapath.getValue(28, i))

   // WS.verifyElementPropertyValue(response, str + 'dailyBalanceSelectFlag', testdatapath.getValue(29, i))

    //WS.verifyElementPropertyValue(response, str + 'effectiveDatedOdLimitPresent', testdatapath.getValue(30, i))

   // WS.verifyElementPropertyValue(response, str + 'withholdingHistoryFlag', testdatapath.getValue(31, i))

    //WS.verifyElementPropertyValue(response, str + 'bonusInterestPresent', testdatapath.getValue(32, i))

    WS.verifyElementPropertyValue(response, str + 'odLedgerTolerance', testdatapath.getValue(33, i))

    WS.verifyElementPropertyValue(response, str + 'odCollectedTolerance', testdatapath.getValue(34, i))

    WS.verifyElementPropertyValue(response, str + 'regEOptInIndicatorCount', testdatapath.getValue(35, i))

    //WS.verifyElementPropertyValue(response, str + 'lastCycleDate', testdatapath.getValue(36, i))

   // WS.verifyElementPropertyValue(response, str + 'balancesLastAggDate', testdatapath.getValue(37, i))

    WS.verifyElementPropertyValue(response, str + 'aggPlusLedgerBalance', testdatapath.getValue(38, i))

    WS.verifyElementPropertyValue(response, str + 'aggPlusLedgerDays', testdatapath.getValue(39, i))

    WS.verifyElementPropertyValue(response, str + 'aggOverdrawnLedgerBalance', testdatapath.getValue(40, i))

    WS.verifyElementPropertyValue(response, str + 'aggOverdrawnLedgerDays', testdatapath.getValue(41, i))

    WS.verifyElementPropertyValue(response, str + 'aggPlusCollectedBalance', testdatapath.getValue(42, i))

    WS.verifyElementPropertyValue(response, str + 'aggPlusCollectedDays', testdatapath.getValue(43, i))

    WS.verifyElementPropertyValue(response, str + 'aggOverdrawnCollectedBalance', testdatapath.getValue(44, i))

    WS.verifyElementPropertyValue(response, str + 'aggOverdrawnCollectedDays', testdatapath.getValue(45, i))

    WS.verifyElementPropertyValue(response, str + 'ledgerBalanceLow', testdatapath.getValue(46, i))

    WS.verifyElementPropertyValue(response, str + 'ledgerBalanceHigh', testdatapath.getValue(47, i))

    WS.verifyElementPropertyValue(response, str + 'collectedBalanceLow', testdatapath.getValue(48, i))

    WS.verifyElementPropertyValue(response, str + 'collectedBalanceHigh', testdatapath.getValue(49, i))

    WS.verifyElementPropertyValue(response, str + 'creditsCount', testdatapath.getValue(50, i))

    WS.verifyElementPropertyValue(response, str + 'aggCreditsAmount', testdatapath.getValue(51, i))

    WS.verifyElementPropertyValue(response, str + 'debitsCount', testdatapath.getValue(52, i))

    WS.verifyElementPropertyValue(response, str + 'aggDebitsAmount', testdatapath.getValue(53, i))

    WS.verifyElementPropertyValue(response, str + 'chargeableCreditsCount', testdatapath.getValue(54, i))

    WS.verifyElementPropertyValue(response, str + 'chargeableDebitsCount', testdatapath.getValue(55, i))

    WS.verifyElementPropertyValue(response, str + 'paperCreditsCount', testdatapath.getValue(56, i))

    WS.verifyElementPropertyValue(response, str + 'paperDebitsCount', testdatapath.getValue(57, i))

    WS.verifyElementPropertyValue(response, str + 'paperlessCreditsCount', testdatapath.getValue(58, i))

    WS.verifyElementPropertyValue(response, str + 'paperlessDebitsCount', testdatapath.getValue(59, i))

    WS.verifyElementPropertyValue(response, str + 'odItemsCount', testdatapath.getValue(60, i))

    WS.verifyElementPropertyValue(response, str + 'odLedgerTimesCount', testdatapath.getValue(61, i))

    WS.verifyElementPropertyValue(response, str + 'odChargesAmount', testdatapath.getValue(62, i))

    WS.verifyElementPropertyValue(response, str + 'odChargesWaivedAmount', testdatapath.getValue(63, i))

    WS.verifyElementPropertyValue(response, str + 'nsfItemsCount', testdatapath.getValue(64, i))

    WS.verifyElementPropertyValue(response, str + 'returnItemsCount', testdatapath.getValue(65, i))

    WS.verifyElementPropertyValue(response, str + 'returnCheckChargesAmount', testdatapath.getValue(66, i))

    WS.verifyElementPropertyValue(response, str + 'returnCheckChargesWaivedAmount', testdatapath.getValue(67, i))

    WS.verifyElementPropertyValue(response, str + 'chargebacksCount', testdatapath.getValue(68, i))

    WS.verifyElementPropertyValue(response, str + 'chargebacksAmount', testdatapath.getValue(69, i))

    WS.verifyElementPropertyValue(response, str + 'depositsCount', testdatapath.getValue(70, i))

    WS.verifyElementPropertyValue(response, str + 'depositsAmount', testdatapath.getValue(71, i))

    WS.verifyElementPropertyValue(response, str + 'localDepositedItemsCount', testdatapath.getValue(72, i))

    WS.verifyElementPropertyValue(response, str + 'withdrawalsCount', testdatapath.getValue(73, i))

    WS.verifyElementPropertyValue(response, str + 'withdrawalsAmount', testdatapath.getValue(74, i))

    WS.verifyElementPropertyValue(response, str + 'cashLettersAmount', testdatapath.getValue(75, i))

    WS.verifyElementPropertyValue(response, str + 'presellDebitsCount', testdatapath.getValue(76, i))

    WS.verifyElementPropertyValue(response, str + 'stopPaySvcChargeCount', testdatapath.getValue(77, i))

    WS.verifyElementPropertyValue(response, str + 'stopPaySvcChargeWaivedCount', testdatapath.getValue(78, i))

    WS.verifyElementPropertyValue(response, str + 'odChargesCount', testdatapath.getValue(79, i))

    WS.verifyElementPropertyValue(response, str + 'odChargesWaivedCount', testdatapath.getValue(80, i))

    WS.verifyElementPropertyValue(response, str + 'odChargesOutrightWaivedCount', testdatapath.getValue(81, i))

    WS.verifyElementPropertyValue(response, str + 'returnCheckChargesCount', testdatapath.getValue(82, i))

    WS.verifyElementPropertyValue(response, str + 'returnCheckChargesWaivedCount', testdatapath.getValue(83, i))

    WS.verifyElementPropertyValue(response, str + 'returnCheckChargesOutrightWaivedCount', testdatapath.getValue(84, i))

    WS.verifyElementPropertyValue(response, str + 'collectionsCount', testdatapath.getValue(85, i))

    WS.verifyElementPropertyValue(response, str + 'wireTransfersCount', testdatapath.getValue(86, i))

    WS.verifyElementPropertyValue(response, str + 'creditReportsCount', testdatapath.getValue(87, i))

    WS.verifyElementPropertyValue(response, str + 'zbaTransfersCount', testdatapath.getValue(88, i))

    WS.verifyElementPropertyValue(response, str + 'balanceAfterInterestPayment', testdatapath.getValue(89, i))

    //WS.verifyElementPropertyValue(response, str + 'interestLastAccruedDate', testdatapath.getValue(90, i))

    WS.verifyElementPropertyValue(response, str + 'interestLastAccruedAmount', testdatapath.getValue(91, i))

    WS.verifyElementPropertyValue(response, str + 'interestAccruedCtdAmount', testdatapath.getValue(92, i))

    WS.verifyElementPropertyValue(response, str + 'interestPaidCtdAmount', testdatapath.getValue(93, i))

    WS.verifyElementPropertyValue(response, str + 'balanceForInterest', testdatapath.getValue(94, i))

    //WS.verifyElementPropertyValue(response, str + 'lastInterestPaymentDate', testdatapath.getValue(95, i))

    WS.verifyElementPropertyValue(response, str + 'foreignDepositedItemsCount', testdatapath.getValue(96, i))

    WS.verifyElementPropertyValue(response, str + 'achCreditsCount', testdatapath.getValue(97, i))

    WS.verifyElementPropertyValue(response, str + 'achDebitsCount', testdatapath.getValue(98, i))

    WS.verifyElementPropertyValue(response, str + 'posCreditsCount', testdatapath.getValue(99, i))

    WS.verifyElementPropertyValue(response, str + 'posDebitsCount', testdatapath.getValue(100, i))

    WS.verifyElementPropertyValue(response, str + 'autoTransferCreditsCount', testdatapath1.getValue(2, i))

    WS.verifyElementPropertyValue(response, str + 'autoTransferDebitsCount', testdatapath1.getValue(3, i))

    WS.verifyElementPropertyValue(response, str + 'checksCount', testdatapath1.getValue(4, i))

    WS.verifyElementPropertyValue(response, str + 'analysisChargesCount', testdatapath1.getValue(5, i))

    WS.verifyElementPropertyValue(response, str + 'analysisChargesAmount', testdatapath1.getValue(6, i))

    WS.verifyElementPropertyValue(response, str + 'directAnalysisChargesCount', testdatapath1.getValue(7, i))

    WS.verifyElementPropertyValue(response, str + 'directAnalysisChargesAmount', testdatapath1.getValue(8, i))

    WS.verifyElementPropertyValue(response, str + 'timesUncollectedCount', testdatapath1.getValue(9, i))

    WS.verifyElementPropertyValue(response, str + 'priorAverageCtdBalance', testdatapath1.getValue(10, i))

    WS.verifyElementPropertyValue(response, str + 'priorMinimumCtdBalance', testdatapath1.getValue(11, i))

    WS.verifyElementPropertyValue(response, str + 'presentmentNetVariance', testdatapath1.getValue(12, i))

    WS.verifyElementPropertyValue(response, str + 'checkDepositCount', testdatapath1.getValue(13, i))

    WS.verifyElementPropertyValue(response, str + 'checkDepositAmount', testdatapath1.getValue(14, i))

    WS.verifyElementPropertyValue(response, str + 'intTransferDepositCount', testdatapath1.getValue(15, i))

    WS.verifyElementPropertyValue(response, str + 'intTransferDepositAmount', testdatapath1.getValue(16, i))

    WS.verifyElementPropertyValue(response, str + 'eftDepositCount', testdatapath1.getValue(17, i))

    WS.verifyElementPropertyValue(response, str + 'eftDepositAmount', testdatapath1.getValue(18, i))

    WS.verifyElementPropertyValue(response, str + 'otherDepositCount', testdatapath1.getValue(19, i))

    WS.verifyElementPropertyValue(response, str + 'otherDepositAmount', testdatapath1.getValue(20, i))

    WS.verifyElementPropertyValue(response, str + 'checkWithdrawalAmount', testdatapath1.getValue(21, i))

    WS.verifyElementPropertyValue(response, str + 'intTransferWithdrawalCount', testdatapath1.getValue(22, i))

    WS.verifyElementPropertyValue(response, str + 'intTransferWithdrawalAmount', testdatapath1.getValue(23, i))

    WS.verifyElementPropertyValue(response, str + 'eftWithdrawalCount', testdatapath1.getValue(24, i))

    WS.verifyElementPropertyValue(response, str + 'eftWithdrawalAmount', testdatapath1.getValue(25, i))

    WS.verifyElementPropertyValue(response, str + 'otherWithdrawalCount', testdatapath1.getValue(26, i))

    WS.verifyElementPropertyValue(response, str + 'otherWithdrawalAmount', testdatapath1.getValue(27, i))

    WS.verifyElementPropertyValue(response, str + 'currentBalance', testdatapath1.getValue(28, i))

    WS.verifyElementPropertyValue(response, str + 'currentCollectedBalance', testdatapath1.getValue(29, i))

    WS.verifyElementPropertyValue(response, str + 'pledgedRestraintsAmount', testdatapath1.getValue(30, i))

    WS.verifyElementPropertyValue(response, str + 'lastCustomerActivityDate', testdatapath1.getValue(31, i))

    //WS.verifyElementPropertyValue(response, str + 'lastTransactionDate', testdatapath1.getValue(32, i))

    //WS.verifyElementPropertyValue(response, str + 'lastDrCrDate', testdatapath1.getValue(34, i))

    WS.verifyElementPropertyValue(response, str + 'lastDrCrTransactionAmount', testdatapath1.getValue(36, i))

    WS.verifyElementPropertyValue(response, str + 'lastMaintenanceDate', testdatapath1.getValue(37, i))

    //WS.verifyElementPropertyValue(response, str + 'lastDepositDate', testdatapath1.getValue(38, i))

    WS.verifyElementPropertyValue(response, str + 'lastDepositAmount', testdatapath1.getValue(39, i))

    WS.verifyElementPropertyValue(response, str + 'lastDirectDepositAmount', testdatapath1.getValue(40, i))

    WS.verifyElementPropertyValue(response, str + 'lastWithdrawalDate', testdatapath1.getValue(41, i))

    WS.verifyElementPropertyValue(response, str + 'lastWithdrawalAmount', testdatapath1.getValue(42, i))

    WS.verifyElementPropertyValue(response, str + 'lastDirectWithdrawalAmount', testdatapath1.getValue(43, i))

    WS.verifyElementPropertyValue(response, str + 'investmentBalance', testdatapath1.getValue(44, i))

    WS.verifyElementPropertyValue(response, str + 'branch', testdatapath1.getValue(45, i))

    WS.verifyElementPropertyValue(response, str + 'costCenter', testdatapath1.getValue(46, i))

    WS.verifyElementPropertyValue(response, str + 'relOfficer1', testdatapath1.getValue(47, i))

    WS.verifyElementPropertyValue(response, str + 'relOfficer2', testdatapath1.getValue(48, i))

    WS.verifyElementPropertyValue(response, str + 'ownerCode', testdatapath1.getValue(49, i))

    WS.verifyElementPropertyValue(response, str + 'subOwnerCode', testdatapath1.getValue(50, i))

    WS.verifyElementPropertyValue(response, str + 'freeCheckCount', testdatapath1.getValue(51, i))

    WS.verifyElementPropertyValue(response, str + 'location', testdatapath1.getValue(52, i))

    WS.verifyElementPropertyValue(response, str + 'geographicCode', testdatapath1.getValue(53, i))

    WS.verifyElementPropertyValue(response, str + 'sic', testdatapath1.getValue(54, i))

    WS.verifyElementPropertyValue(response, str + 'floatFactor', testdatapath1.getValue(55, i))

    WS.verifyElementPropertyValue(response, str + 'odSvcChargeCtdAmount', testdatapath1.getValue(56, i))

    WS.verifyElementPropertyValue(response, str + 'odSvcChargeYtdAmount', testdatapath1.getValue(57, i))

    WS.verifyElementPropertyValue(response, str + 'odSvcChargeWaiveYtdAmount', testdatapath1.getValue(58, i))

    WS.verifyElementPropertyValue(response, str + 'odAggPlusLedgerBalance', testdatapath1.getValue(59, i))

    WS.verifyElementPropertyValue(response, str + 'odAggPlusLedgerDays', testdatapath1.getValue(60, i))

    WS.verifyElementPropertyValue(response, str + 'odAggOverdraftLedgerBalance', testdatapath1.getValue(61, i))

    WS.verifyElementPropertyValue(response, str + 'odAggOverdraftLedgerDays', testdatapath1.getValue(62, i))

    WS.verifyElementPropertyValue(response, str + 'odAggPlusCollectedBalance', testdatapath1.getValue(63, i))

    WS.verifyElementPropertyValue(response, str + 'odAggPlusCollectedDays', testdatapath1.getValue(64, i))

    WS.verifyElementPropertyValue(response, str + 'odAggOverdraftCollectedBalance', testdatapath1.getValue(65, i))

    WS.verifyElementPropertyValue(response, str + 'odAggOverdraftCollectedDays', testdatapath1.getValue(66, i))

    WS.verifyElementPropertyValue(response, str + 'intCode', testdatapath1.getValue(67, i))

    WS.verifyElementPropertyValue(response, str + 'intWaiveCode', testdatapath1.getValue(68, i))

    WS.verifyElementPropertyValue(response, str + 'intCycle', testdatapath1.getValue(69, i))

    WS.verifyElementPropertyValue(response, str + 'intPaymentMethod', testdatapath1.getValue(70, i))

    WS.verifyElementPropertyValue(response, str + 'debitIntCode', testdatapath1.getValue(71, i))

    WS.verifyElementPropertyValue(response, str + 'debitIntWaiveCode', testdatapath1.getValue(72, i))

    WS.verifyElementPropertyValue(response, str + 'debitIntCycle', testdatapath1.getValue(73, i))

    WS.verifyElementPropertyValue(response, str + 'debitIntPaymentMethod', testdatapath1.getValue(74, i))

    WS.verifyElementPropertyValue(response, str + 'svcChgCode', testdatapath1.getValue(75, i))

    WS.verifyElementPropertyValue(response, str + 'svcChgWaiveCode', testdatapath1.getValue(76, i))

    WS.verifyElementPropertyValue(response, str + 'svcChgCycle', testdatapath1.getValue(77, i))

    WS.verifyElementPropertyValue(response, str + 'svcChgPaymentMethod', testdatapath1.getValue(78, i))

    WS.verifyElementPropertyValue(response, str + 'odSvcChgCode', testdatapath1.getValue(79, i))

    WS.verifyElementPropertyValue(response, str + 'odSvcChgWaiveCode', testdatapath1.getValue(80, i))

    WS.verifyElementPropertyValue(response, str + 'odSvcChgCycle', testdatapath1.getValue(81, i))

    WS.verifyElementPropertyValue(response, str + 'statementCycle', testdatapath1.getValue(82, i))

    WS.verifyElementPropertyValue(response, str + 'statementMailCode', testdatapath1.getValue(83, i))

    WS.verifyElementPropertyValue(response, str + 'statementSequence', testdatapath1.getValue(84, i))
}