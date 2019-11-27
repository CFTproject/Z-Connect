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

String str = 'getRestraintListServiceOperationResponse.RESPONSE.Output.'

testdatapath = findTestData('Z-Connect Test Data/Get Restraint List_TestData')

for (int i = 1; i < 2; i++) {
    println('EXCEL SHEET ROW NUMBER IS : ' + i)

    response = WS.sendRequest(findTestObject('Get Restraint List/All limit fields 1 to check limit function of all restraint types'))

    WS.verifyResponseStatusCode(response, 200)

    WS.verifyElementPropertyValue(response, str + 'xStatus.applicationCd', testdatapath.getValue(2, i))

    WS.verifyElementPropertyValue(response, str + 'xStatus.statusCd', testdatapath.getValue(3, i))

    WS.verifyElementPropertyValue(response, str + 'xStatus.statusMessage', testdatapath.getValue(4, i))

    WS.verifyElementPropertyValue(response, str + 'xStatus.severity', testdatapath.getValue(5, i))

    WS.verifyElementPropertyValue(response, str + 'accountName', testdatapath.getValue(6, i))

    WS.verifyElementPropertyValue(response, str + 'hardHoldOffset', testdatapath.getValue(7, i))

    WS.verifyElementPropertyValue(response, str + 'hardHoldLimit', testdatapath.getValue(8, i))

    WS.verifyElementPropertyValue(response, str + 'hardHoldTableResult', testdatapath.getValue(9, i))

    WS.verifyElementPropertyValue(response, str + 'hardHoldArray[0].hardHoldCompanyNbr', testdatapath.getValue(10, i))

    WS.verifyElementPropertyValue(response, str + 'hardHoldArray[0].hardHoldProductCode', testdatapath.getValue(11, i))

    WS.verifyElementPropertyValue(response, str + 'hardHoldArray[0].hardHoldAccountNbr', testdatapath.getValue(12, i))

    WS.verifyElementPropertyValue(response, str + 'hardHoldArray[0].hardHoldClass', testdatapath.getValue(13, i))

    WS.verifyElementPropertyValue(response, str + 'hardHoldArray[0].hardHoldType', testdatapath.getValue(14, i))

    WS.verifyElementPropertyValue(response, str + 'hardHoldArray[0].hardHoldExpireDt', testdatapath.getValue(15, i))

    WS.verifyElementPropertyValue(response, str + 'hardHoldArray[0].hardHoldPlacedDt', testdatapath.getValue(16, i))

    WS.verifyElementPropertyValue(response, str + 'hardHoldArray[0].hardHoldSequenceNbr', testdatapath.getValue(17, i))

    WS.verifyElementPropertyValue(response, str + 'hardHoldArray[0].hardHoldCurrencyCode', testdatapath.getValue(18, i))

    WS.verifyElementPropertyValue(response, str + 'hardHoldArray[0].hardHoldStatus', testdatapath.getValue(19, i))

    WS.verifyElementPropertyValue(response, str + 'hardHoldArray[0].hardHoldTypeCd', testdatapath.getValue(20, i))

    WS.verifyElementPropertyValue(response, str + 'hardHoldArray[0].hardHoldReasonCd', testdatapath.getValue(21, i))

    WS.verifyElementPropertyValue(response, str + 'hardHoldArray[0].hardHoldComment01', testdatapath.getValue(22, i))

    WS.verifyElementPropertyValue(response, str + 'hardHoldArray[0].hardHoldComment02', testdatapath.getValue(23, i))

    WS.verifyElementPropertyValue(response, str + 'hardHoldArray[0].hardHoldRestraintReason01', testdatapath.getValue(24, 
            i))

    WS.verifyElementPropertyValue(response, str + 'hardHoldArray[0].hardHoldRestraintReason02', testdatapath.getValue(25, 
            i))

    WS.verifyElementPropertyValue(response, str + 'pledgeToOffset', testdatapath.getValue(26, i))

    WS.verifyElementPropertyValue(response, str + 'pledgeToLimit', testdatapath.getValue(27, i))

    WS.verifyElementPropertyValue(response, str + 'pledgeToTableResult', testdatapath.getValue(28, i))

    WS.verifyElementPropertyValue(response, str + 'pledgeToArray[0].pledgeToCompanyNbr', testdatapath.getValue(29, i))

    WS.verifyElementPropertyValue(response, str + 'pledgeToArray[0].pledgeToProductCode', testdatapath.getValue(30, i))

    WS.verifyElementPropertyValue(response, str + 'pledgeToArray[0].pledgeToAccountNbr', testdatapath.getValue(31, i))

    WS.verifyElementPropertyValue(response, str + 'pledgeToArray[0].pledgeToClass', testdatapath.getValue(32, i))

    WS.verifyElementPropertyValue(response, str + 'pledgeToArray[0].pledgeToType', testdatapath.getValue(33, i))

    WS.verifyElementPropertyValue(response, str + 'pledgeToArray[0].pledgeToExpireDt', testdatapath.getValue(34, i))

    WS.verifyElementPropertyValue(response, str + 'pledgeToArray[0].pledgeToPlacedDt', testdatapath.getValue(35, i))

    WS.verifyElementPropertyValue(response, str + 'pledgeToArray[0].pledgeToSequenceNbr', testdatapath.getValue(36, i))

    WS.verifyElementPropertyValue(response, str + 'pledgeToArray[0].pledgeToAuthorizationNbr', testdatapath.getValue(37, 
            i))

    WS.verifyElementPropertyValue(response, str + 'pledgeToArray[0].pledgeToCurrencyCd', testdatapath.getValue(38, i))

    WS.verifyElementPropertyValue(response, str + 'pledgeToArray[0].pledgeToStatus', testdatapath.getValue(39, i))

    WS.verifyElementPropertyValue(response, str + 'pledgeToArray[0].pledgeToToAccountNbr', testdatapath.getValue(40, i))

    WS.verifyElementPropertyValue(response, str + 'pledgeToArray[0].pledgeToOriginalPledgeAmt', testdatapath.getValue(41, 
            i))

    WS.verifyElementPropertyValue(response, str + 'pledgeToArray[0].pledgeToCurrentPledgeAmt', testdatapath.getValue(42, 
            i))

    WS.verifyElementPropertyValue(response, str + 'pledgeToArray[0].pledgeToMerchantCd', testdatapath.getValue(43, i))

    WS.verifyElementPropertyValue(response, str + 'stopPayOffset', testdatapath.getValue(44, i))

    WS.verifyElementPropertyValue(response, str + 'stopPayLimit', testdatapath.getValue(45, i))

    WS.verifyElementPropertyValue(response, str + 'stopPayTableResult', testdatapath.getValue(46, i))

    WS.verifyElementPropertyValue(response, str + 'stopPayArray[0].stopPayCompanyNbr', testdatapath.getValue(47, i))

    WS.verifyElementPropertyValue(response, str + 'stopPayArray[0].stopPayProductCode', testdatapath.getValue(48, i))

    WS.verifyElementPropertyValue(response, str + 'stopPayArray[0].stopPayAccountNbr', testdatapath.getValue(49, i))

    WS.verifyElementPropertyValue(response, str + 'stopPayArray[0].stopPayClass', testdatapath.getValue(50, i))

    WS.verifyElementPropertyValue(response, str + 'stopPayArray[0].stopPayType', testdatapath.getValue(51, i))

    WS.verifyElementPropertyValue(response, str + 'stopPayArray[0].stopPayHighCheckNbr', testdatapath.getValue(52, i))

    WS.verifyElementPropertyValue(response, str + 'stopPayArray[0].stopPayLowCheckNbr', testdatapath.getValue(53, i))

    WS.verifyElementPropertyValue(response, str + 'stopPayArray[0].stopPayHighCheckAmt', testdatapath.getValue(54, i))

    WS.verifyElementPropertyValue(response, str + 'stopPayArray[0].stopPayLowCheckAmt', testdatapath.getValue(55, i))

    WS.verifyElementPropertyValue(response, str + 'stopPayArray[0].stopPayExpireDt', testdatapath.getValue(56, i))

    WS.verifyElementPropertyValue(response, str + 'stopPayArray[0].stopPayPlacedDt', testdatapath.getValue(57, i))

    WS.verifyElementPropertyValue(response, str + 'stopPayArray[0].stopPayStatus', testdatapath.getValue(58, i))

    WS.verifyElementPropertyValue(response, str + 'stopPayArray[0].stopPayPlacedTime', testdatapath.getValue(59, i))

    WS.verifyElementPropertyValue(response, str + 'stopPayArray[0].stopPayCheckDt', testdatapath.getValue(60, i))

    WS.verifyElementPropertyValue(response, str + 'stopPayArray[0].stopPayOverrideChargeAmt', testdatapath.getValue(61, 
            i))

    WS.verifyElementPropertyValue(response, str + 'stopPayArray[0].stopPayCheckOutstandingCount', testdatapath.getValue(
            62, i))

    WS.verifyElementPropertyValue(response, str + 'stopPayArray[0].stopPayCheckReturnedCount', testdatapath.getValue(63, 
            i))

    WS.verifyElementPropertyValue(response, str + 'stopPayArray[0].stopPayTermCd', testdatapath.getValue(64, i))

    WS.verifyElementPropertyValue(response, str + 'stopPayArray[0].stopPayTerm', testdatapath.getValue(65, i))

    WS.verifyElementPropertyValue(response, str + 'stopPayArray[0].stopPayNumberOfTimesToRenew', testdatapath.getValue(66, 
            i))

    WS.verifyElementPropertyValue(response, str + 'stopPayArray[0].stopPayNumberOfTimesRenewed', testdatapath.getValue(67, 
            i))

    WS.verifyElementPropertyValue(response, str + 'stopPayArray[0].stopPayRenewalDt', testdatapath.getValue(68, i))

    WS.verifyElementPropertyValue(response, str + 'stopPayArray[0].stopPayChannel', testdatapath.getValue(69, i))

    WS.verifyElementPropertyValue(response, str + 'duplicateCheckOffset', testdatapath.getValue(70, i))

    WS.verifyElementPropertyValue(response, str + 'duplicateCheckLimit', testdatapath.getValue(71, i))

    WS.verifyElementPropertyValue(response, str + 'duplicateCheckTableResult', testdatapath.getValue(72, i))

    WS.verifyElementPropertyValue(response, str + 'duplicateCheckArray[0].duplicateCheckCompanyNbr', testdatapath.getValue(
            73, i))

    WS.verifyElementPropertyValue(response, str + 'duplicateCheckArray[0].duplicateCheckProductCode', testdatapath.getValue(
            74, i))

    WS.verifyElementPropertyValue(response, str + 'duplicateCheckArray[0].duplicateCheckAccountNbr', testdatapath.getValue(
            75, i))

    WS.verifyElementPropertyValue(response, str + 'duplicateCheckArray[0].duplicateCheckClass', testdatapath.getValue(76, 
            i))

    WS.verifyElementPropertyValue(response, str + 'duplicateCheckArray[0].duplicateCheckType', testdatapath.getValue(77, 
            i))

    WS.verifyElementPropertyValue(response, str + 'duplicateCheckArray[0].duplicateCheckHighCheckNbr', testdatapath.getValue(
            78, i))

    WS.verifyElementPropertyValue(response, str + 'duplicateCheckArray[0].duplicateCheckLowCheckNbr', testdatapath.getValue(
            79, i))

    WS.verifyElementPropertyValue(response, str + 'duplicateCheckArray[0].duplicateCheckHighCheckAmt', testdatapath.getValue(
            80, i))

    WS.verifyElementPropertyValue(response, str + 'duplicateCheckArray[0].duplicateCheckLowCheckAmount', testdatapath.getValue(
            81, i))

    WS.verifyElementPropertyValue(response, str + 'duplicateCheckArray[0].duplicateCheckExpireDt', testdatapath.getValue(
            82, i))

    WS.verifyElementPropertyValue(response, str + 'duplicateCheckArray[0].duplicateCheckPlacedDt', testdatapath.getValue(
            83, i))

    WS.verifyElementPropertyValue(response, str + 'duplicateCheckArray[0].duplicateCheckPlacedTime', testdatapath.getValue(
            84, i))

    WS.verifyElementPropertyValue(response, str + 'duplicateCheckArray[0].duplicateCheckStatus', testdatapath.getValue(85, 
            i))

    WS.verifyElementPropertyValue(response, str + 'duplicateCheckArray[0].duplicateCheckDuplicateCd', testdatapath.getValue(
            86, i))

    WS.verifyElementPropertyValue(response, str + 'duplicateCheckArray[0].duplicateCheckCheckDt', testdatapath.getValue(
            87, i))

    WS.verifyElementPropertyValue(response, str + 'duplicateCheckArray[0].duplicateCheckCheckOutstandingCount', testdatapath.getValue(
            88, i))

    WS.verifyElementPropertyValue(response, str + 'duplicateCheckArray[0].duplicateCheckCheckPaidCount', testdatapath.getValue(
            89, i))

    WS.verifyElementPropertyValue(response, str + 'duplicateCheckArray[0].duplicateCheckComment01', testdatapath.getValue(
            90, i))

    WS.verifyElementPropertyValue(response, str + 'duplicateCheckArray[0].duplicateCheckComment02', testdatapath.getValue(
            91, i))

    WS.verifyElementPropertyValue(response, str + 'duplicateCheckArray[0].duplicateCheckRestraintReason01', testdatapath.getValue(
            92, i))

    WS.verifyElementPropertyValue(response, str + 'duplicateCheckArray[0].duplicateCheckRestraintReason02', testdatapath.getValue(
            93, i))

    WS.verifyElementPropertyValue(response, str + 'duplicateCheckArray[0].duplicateCheckTermCd', testdatapath.getValue(94, 
            i))

    WS.verifyElementPropertyValue(response, str + 'duplicateCheckArray[0].duplicateCheckTerm', testdatapath.getValue(95, 
            i))

    WS.verifyElementPropertyValue(response, str + 'duplicateCheckArray[0].duplicateCheckNbrOfTimesToRenew', testdatapath.getValue(
            96, i))

    WS.verifyElementPropertyValue(response, str + 'duplicateCheckArray[0].duplicateCheckNbrOfTimesRenewed', testdatapath.getValue(
            97, i))

    WS.verifyElementPropertyValue(response, str + 'duplicateCheckArray[0].duplicateCheckRenewalDt', testdatapath.getValue(
            98, i))

    WS.verifyElementPropertyValue(response, str + 'duplicateCheckArray[0].duplicateCheckChannel', testdatapath.getValue(
            99, i))
}