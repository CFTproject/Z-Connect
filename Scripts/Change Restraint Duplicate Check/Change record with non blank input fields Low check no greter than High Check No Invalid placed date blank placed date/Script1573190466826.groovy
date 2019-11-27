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

for (int i = 5; i < 7; i++) {
    println('EXCEL SHEET ROW NUMBER IS : ' + i)

    //Change record with non blank input fields Low check no greter than High Check No Invalid placed date
    if (i == 5) {
        response = WS.sendRequest(findTestObject('Change Restraint Duplicate Check/Change record with non blank input fields Low check no greter than High Check No Invalid placed date', 
                [('restraintDupKeyCompanyNbr') : findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(
                        2, i), ('restraintDupKeyProductCode') : findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(
                        3, i), ('restraintDupKeyAccountNbr') : findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(
                        4, i), ('restraintDupVarKeyLowCheckNbr') : findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(
                        5, i), ('restraintDupVarKeyHighCheckNbr') : findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(
                        6, i), ('restraintDupVarKeyExpireDt') : findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(
                        7, i), ('restraintDupVarKeyPlacedDt') : findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(
                        8, i), ('restraintDupDuplicateCd') : findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(
                        9, i), ('restraintDupCheckDt') : findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(
                        10, i), ('restraintDupChecksOutstandingNbr') : findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(
                        11, i), ('restraintDupChecksPaidNbr') : findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(
                        12, i), ('restraintDupCheckLastPaidDt') : findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(
                        13, i), ('restraintDupComment1') : findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(
                        14, i), ('restraintDupComment2') : findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(
                        15, i), ('restraintDupReason1') : findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(
                        16, i), ('restraintDupReason2') : findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(
                        17, i)]))
    }
	
	
	//Change record with all valid non blank input fields and blank placed date
	if (i == 6) {
		response = WS.sendRequest(findTestObject('Change Restraint Duplicate Check/Change record with all valid non blank input fields and blank placed date',
				[('restraintDupKeyCompanyNbr') : findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(
						2, i), ('restraintDupKeyProductCode') : findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(
						3, i), ('restraintDupKeyAccountNbr') : findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(
						4, i), ('restraintDupVarKeyLowCheckNbr') : findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(
						5, i), ('restraintDupVarKeyHighCheckNbr') : findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(
						6, i), ('restraintDupVarKeyExpireDt') : findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(
						7, i), ('restraintDupVarKeyPlacedDt') : findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(
						8, i), ('restraintDupDuplicateCd') : findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(
						9, i), ('restraintDupCheckDt') : findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(
						10, i), ('restraintDupChecksOutstandingNbr') : findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(
						11, i), ('restraintDupChecksPaidNbr') : findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(
						12, i), ('restraintDupCheckLastPaidDt') : findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(
						13, i), ('restraintDupComment1') : findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(
						14, i), ('restraintDupComment2') : findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(
						15, i), ('restraintDupReason1') : findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(
						16, i), ('restraintDupReason2') : findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(
						17, i)]))
	}
	
	WS.verifyResponseStatusCode(response, 200)
	
	WS.verifyElementPropertyValue(response, 'changeRestraintDuplicateCheckServiceOperationResponse.RESPONSE.Output.xStatus.applicationCd', findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(19, i))
	
	WS.verifyElementPropertyValue(response, 'changeRestraintDuplicateCheckServiceOperationResponse.RESPONSE.Output.xStatus.statusCd', findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(20, i))
	
	WS.verifyElementPropertyValue(response, 'changeRestraintDuplicateCheckServiceOperationResponse.RESPONSE.Output.xStatus.statusMessage', findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(21, i))
	
	WS.verifyElementPropertyValue(response, 'changeRestraintDuplicateCheckServiceOperationResponse.RESPONSE.Output.xStatus.severity', findTestData('Z-Connect Test Data/Change Restraint Duplicate Check_TestData').getValue(22, i))
}