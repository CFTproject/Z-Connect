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

for (int i = 10; i < 13; i++) {
	
    println('EXCEL SHEET ROW NUMBER IS : ' + i)
	
	//Change frequency for DDA
	if (i == 10) {
		response = WS.sendRequest(findTestObject('Change Restraint PledgeTo/Change frequency for DDA',
				[('restraintPldgKeyCompanyNbr') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
						2, i), ('restraintPldgKeyProductCode') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
						3, i), ('restraintPldgKeyAccountNbr') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
						4, i), ('restraintPldgKeyType') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
						5, i), ('restraintPldgVarKeyExpireDt') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
						6, i), ('restraintPldgVarKeyPlacedDt') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
						7, i), ('restraintPldgVarKeySequenceNbr') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
						8, i),  ('restraintPldgReviewFreq') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
						11, i)]))
	}
	
	
	//Change frequency for REA
	if (i == 11) {
		response = WS.sendRequest(findTestObject('Change Restraint PledgeTo/Change frequency for REA',
				[('restraintPldgKeyCompanyNbr') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
						2, i), ('restraintPldgKeyProductCode') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
						3, i), ('restraintPldgKeyAccountNbr') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
						4, i), ('restraintPldgKeyType') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
						5, i), ('restraintPldgVarKeyExpireDt') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
						6, i), ('restraintPldgVarKeyPlacedDt') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
						7, i), ('restraintPldgVarKeySequenceNbr') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
						8, i),  ('restraintPldgReviewFreq') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
						11, i)]))
	}
	
	//Change frequency for CDA
	if (i == 12) {
		response = WS.sendRequest(findTestObject('Change Restraint PledgeTo/Change frequency for CDA',
				[('restraintPldgKeyCompanyNbr') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
						2, i), ('restraintPldgKeyProductCode') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
						3, i), ('restraintPldgKeyAccountNbr') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
						4, i), ('restraintPldgKeyType') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
						5, i), ('restraintPldgVarKeyExpireDt') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
						6, i), ('restraintPldgVarKeyPlacedDt') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
						7, i), ('restraintPldgVarKeySequenceNbr') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
						8, i),  ('restraintPldgReviewFreq') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
						11, i)]))
	}
	
	WS.verifyResponseStatusCode(response, 200)
	
		WS.verifyElementPropertyValue(response, 'changeRestraintPledgeToServiceOperationResponse.RESPONSE.Output.xStatus.applicationCd',
			findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(19, i))
	
		WS.verifyElementPropertyValue(response, 'changeRestraintPledgeToServiceOperationResponse.RESPONSE.Output.xStatus.statusCd',
			findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(20, i))
	
		WS.verifyElementPropertyValue(response, 'changeRestraintPledgeToServiceOperationResponse.RESPONSE.Output.xStatus.statusMessage',
			findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(21, i))
	
		WS.verifyElementPropertyValue(response, 'changeRestraintPledgeToServiceOperationResponse.RESPONSE.Output.xStatus.severity',
			findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(22, i))
    
}