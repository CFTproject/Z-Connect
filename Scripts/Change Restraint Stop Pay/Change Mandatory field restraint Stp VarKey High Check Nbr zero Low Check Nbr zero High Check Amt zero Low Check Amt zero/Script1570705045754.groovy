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

for (int i = 12; i < 16; i++) {
	println ('EXEEL SHEET ROW NUMBER IS :'+i)
	
	//Change Mandatory field restraint Stp VarKey High Check Nbr zero
	if(i==12){		
	
    response = WS.sendRequest(findTestObject('Change Restraint Stop Pay/Change Mandatory field restraint Stp VarKey High Check Nbr zero', [('restraintStpKeyCompanyNbr') : findTestData(
                    'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(2, i), ('restraintStpKeyProductCode') : findTestData(
                    'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(3, i), ('restraintStpKeyAccountNbr') : findTestData(
                    'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(4, i), ('restraintStpKeyType') : findTestData(
                    'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(5, i), ('restraintStpVarKeyHighCheckNbr') : findTestData(
                    'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(6, i), ('restraintStpVarKeyLowCheckNbr') : findTestData(
                    'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(7, i), ('restraintStpVarKeyHighCheckAmt') : findTestData(
                    'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(8, i), ('restraintStpVarKeyLowCheckAmt') : findTestData(
                    'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(9, i), ('restraintStpVarKeyExpireDt') : findTestData(
                    'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(10, i), ('restraintStpVarKeyPlacedDt') : findTestData(
                    'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(11, i), ('restraintStpCheckDt') : findTestData(
                    'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(12, i), ('restraintStpLastCheckReturnedDt') : findTestData(
                    'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(13, i), ('restraintStpPayee') : findTestData(
                    'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(14, i), ('restraintStpChecksoutstandingNbr') : findTestData(
                    'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(15, i), ('restraintStpChecksReturnedNbr') : findTestData(
                    'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(16, i), ('restraintStpComment1') : findTestData(
                    'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(17, i), ('restraintStpComment2') : findTestData(
                    'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(18, i), ('restraintStpReason1') : findTestData(
                    'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(19, i), ('restraintStpReason2') : findTestData(
                    'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(20, i)]))
	}
	
	//Change Mandatory field restraint Stp VarKey Low Check Nbr zero
	if(i==13){
		
		response = WS.sendRequest(findTestObject('Change Restraint Stop Pay/Change Mandatory field restraint Stp VarKey Low Check Nbr zero', [('restraintStpKeyCompanyNbr') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(2, i), ('restraintStpKeyProductCode') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(3, i), ('restraintStpKeyAccountNbr') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(4, i), ('restraintStpKeyType') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(5, i), ('restraintStpVarKeyHighCheckNbr') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(6, i), ('restraintStpVarKeyLowCheckNbr') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(7, i), ('restraintStpVarKeyHighCheckAmt') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(8, i), ('restraintStpVarKeyLowCheckAmt') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(9, i), ('restraintStpVarKeyExpireDt') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(10, i), ('restraintStpVarKeyPlacedDt') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(11, i), ('restraintStpCheckDt') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(12, i), ('restraintStpLastCheckReturnedDt') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(13, i), ('restraintStpPayee') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(14, i), ('restraintStpChecksoutstandingNbr') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(15, i), ('restraintStpChecksReturnedNbr') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(16, i), ('restraintStpComment1') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(17, i), ('restraintStpComment2') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(18, i), ('restraintStpReason1') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(19, i), ('restraintStpReason2') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(20, i)]))
		}
	
	//Change Mandatory field restraint Stp VarKey High Check Amt zero
	if(i==14){
		
		response = WS.sendRequest(findTestObject('Change Restraint Stop Pay/Change Mandatory field restraint Stp VarKey High Check Amt zero', [('restraintStpKeyCompanyNbr') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(2, i), ('restraintStpKeyProductCode') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(3, i), ('restraintStpKeyAccountNbr') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(4, i), ('restraintStpKeyType') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(5, i), ('restraintStpVarKeyHighCheckNbr') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(6, i), ('restraintStpVarKeyLowCheckNbr') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(7, i), ('restraintStpVarKeyHighCheckAmt') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(8, i), ('restraintStpVarKeyLowCheckAmt') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(9, i), ('restraintStpVarKeyExpireDt') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(10, i), ('restraintStpVarKeyPlacedDt') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(11, i), ('restraintStpCheckDt') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(12, i), ('restraintStpLastCheckReturnedDt') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(13, i), ('restraintStpPayee') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(14, i), ('restraintStpChecksoutstandingNbr') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(15, i), ('restraintStpChecksReturnedNbr') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(16, i), ('restraintStpComment1') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(17, i), ('restraintStpComment2') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(18, i), ('restraintStpReason1') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(19, i), ('restraintStpReason2') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(20, i)]))
		}
	
	//Change Mandatory field restraint Stp VarKey Low Check Amt zero
	if(i==15){
		
		response = WS.sendRequest(findTestObject('Change Restraint Stop Pay/Change Mandatory field restraint Stp VarKey Low Check Amt zero', [('restraintStpKeyCompanyNbr') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(2, i), ('restraintStpKeyProductCode') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(3, i), ('restraintStpKeyAccountNbr') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(4, i), ('restraintStpKeyType') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(5, i), ('restraintStpVarKeyHighCheckNbr') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(6, i), ('restraintStpVarKeyLowCheckNbr') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(7, i), ('restraintStpVarKeyHighCheckAmt') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(8, i), ('restraintStpVarKeyLowCheckAmt') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(9, i), ('restraintStpVarKeyExpireDt') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(10, i), ('restraintStpVarKeyPlacedDt') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(11, i), ('restraintStpCheckDt') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(12, i), ('restraintStpLastCheckReturnedDt') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(13, i), ('restraintStpPayee') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(14, i), ('restraintStpChecksoutstandingNbr') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(15, i), ('restraintStpChecksReturnedNbr') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(16, i), ('restraintStpComment1') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(17, i), ('restraintStpComment2') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(18, i), ('restraintStpReason1') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(19, i), ('restraintStpReason2') : findTestData(
						'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(20, i)]))
		}
	
	WS.verifyResponseStatusCode(response, 200)

	WS.verifyElementPropertyValue(response, 'changeRestraintStopPayServiceOperationResponse.RESPONSE.Output.xStatus.applicationCd', findTestData(
                    'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(22, i))
	
	WS.verifyElementPropertyValue(response, 'changeRestraintStopPayServiceOperationResponse.RESPONSE.Output.xStatus.statusCd', findTestData(
		'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(23, i))
	
	WS.verifyElementPropertyValue(response, 'changeRestraintStopPayServiceOperationResponse.RESPONSE.Output.xStatus.statusMessage', findTestData(
		'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(24, i))
	
	WS.verifyElementPropertyValue(response, 'changeRestraintStopPayServiceOperationResponse.RESPONSE.Output.xStatus.severity', findTestData(
		'Z-Connect Test Data/Change Restraint Stop Pay_TestData').getValue(25, i))
	}