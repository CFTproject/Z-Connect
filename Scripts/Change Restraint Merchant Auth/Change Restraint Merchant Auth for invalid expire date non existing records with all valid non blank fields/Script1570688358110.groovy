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

for (int i = 4; i < 8; i++) {
    println('EXCEL SHEET ROW NUMBER IS : ' + i)

	//Change record with non blank input fields and Invalid Expire date
	if(i == 4){		
	
    response = WS.sendRequest(findTestObject('Change Restraint Merchant Auth/Change record with non blank input fields and Invalid Expire date', 
            [('restraintMchKeyCompanyNbr') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
                    2, i), ('restraintMchKeyProductCode') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
                    3, i), ('restraintMchKeyAccountNbr') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
                    4, i), ('restraintMchVarKeyExpireDt') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
                    5, i), ('restraintMchVarKeyPlacedDt') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
                    6, i), ('restraintMchVarKeySequenceNbr') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
                    7, i), ('restraintMchVarKeyMerchAuthNbr') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
                    8, i), ('restraintMchPlgToAccountNbr') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
                    9, i), ('restraintMchReviewFreq') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
                    10, i), ('restraintMchLastReviewDt') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
                    11, i), ('restraintMchAuthAmt') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
                    12, i), ('restraintMchCommentsLine1') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
                    13, i), ('restraintMchCommentsLine2') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
                    14, i),('restraintMchReasonLine1') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
                    15, i),('restraintMchReasonLine2') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
                    16, i),('restraintMchMerchCode') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
                    17, i)]))
	}
	
	
	//Change record with all valid non blank input fields and blank placed date
	if(i == 5){
	
	response = WS.sendRequest(findTestObject('Change Restraint Merchant Auth/Change record with all valid non blank input fields and blank placed date',
			[('restraintMchKeyCompanyNbr') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					2, i), ('restraintMchKeyProductCode') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					3, i), ('restraintMchKeyAccountNbr') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					4, i), ('restraintMchVarKeyExpireDt') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					5, i), ('restraintMchVarKeyPlacedDt') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					6, i), ('restraintMchVarKeySequenceNbr') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					7, i), ('restraintMchVarKeyMerchAuthNbr') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					8, i), ('restraintMchPlgToAccountNbr') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					9, i), ('restraintMchReviewFreq') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					10, i), ('restraintMchLastReviewDt') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					11, i), ('restraintMchAuthAmt') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					12, i), ('restraintMchCommentsLine1') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					13, i), ('restraintMchCommentsLine2') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					14, i),('restraintMchReasonLine1') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					15, i),('restraintMchReasonLine2') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					16, i),('restraintMchMerchCode') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					17, i)]))
	}
	
	//Change record with all valid non blank input fields
	if(i == 6){
	
	response = WS.sendRequest(findTestObject('Change Restraint Merchant Auth/Change record with all valid non blank input fields',
			[('restraintMchKeyCompanyNbr') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					2, i), ('restraintMchKeyProductCode') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					3, i), ('restraintMchKeyAccountNbr') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					4, i), ('restraintMchVarKeyExpireDt') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					5, i), ('restraintMchVarKeyPlacedDt') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					6, i), ('restraintMchVarKeySequenceNbr') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					7, i), ('restraintMchVarKeyMerchAuthNbr') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					8, i), ('restraintMchPlgToAccountNbr') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					9, i), ('restraintMchReviewFreq') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					10, i), ('restraintMchLastReviewDt') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					11, i), ('restraintMchAuthAmt') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					12, i), ('restraintMchCommentsLine1') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					13, i), ('restraintMchCommentsLine2') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					14, i),('restraintMchReasonLine1') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					15, i),('restraintMchReasonLine2') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					16, i),('restraintMchMerchCode') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					17, i)]))
	}
	
	//Change record with all valid non blank input fields for an non-existing record
	if(i == 7){
	
	response = WS.sendRequest(findTestObject('Change Restraint Merchant Auth/Change record with all valid non blank input fields for an non-existing record',
			[('restraintMchKeyCompanyNbr') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					2, i), ('restraintMchKeyProductCode') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					3, i), ('restraintMchKeyAccountNbr') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					4, i), ('restraintMchVarKeyExpireDt') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					5, i), ('restraintMchVarKeyPlacedDt') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					6, i), ('restraintMchVarKeySequenceNbr') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					7, i), ('restraintMchVarKeyMerchAuthNbr') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					8, i), ('restraintMchPlgToAccountNbr') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					9, i), ('restraintMchReviewFreq') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					10, i), ('restraintMchLastReviewDt') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					11, i), ('restraintMchAuthAmt') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					12, i), ('restraintMchCommentsLine1') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					13, i), ('restraintMchCommentsLine2') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					14, i),('restraintMchReasonLine1') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					15, i),('restraintMchReasonLine2') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					16, i),('restraintMchMerchCode') : findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
					17, i)]))
	}
	
	
	
	WS.verifyResponseStatusCode(response, 200)
	
	WS.verifyElementPropertyValue(response, 'changeRestraintMerchantAuthServiceOperationResponse.RESPONSE.Output.xStatus.applicationCd', findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
                    19, i))
	WS.verifyElementPropertyValue(response, 'changeRestraintMerchantAuthServiceOperationResponse.RESPONSE.Output.xStatus.statusCd', findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
		20, i))
	
	WS.verifyElementPropertyValue(response, 'changeRestraintMerchantAuthServiceOperationResponse.RESPONSE.Output.xStatus.statusMessage', findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
		21, i))
	
	WS.verifyElementPropertyValue(response, 'changeRestraintMerchantAuthServiceOperationResponse.RESPONSE.Output.xStatus.severity', findTestData('Z-Connect Test Data/Change Restraint Merchant Auth_TestData').getValue(
		22, i))
}

