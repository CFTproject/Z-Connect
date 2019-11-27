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


for(int i=1; i<=14; i++)
{
	println ('Row number is :- '+i)
	response = WS.sendRequest(findTestObject('Create Hardhold Restraint/Create Hardhold Restraint Post Request Verify Response with valid Values', 
        [('rHhKeyCompanyNbr') : findTestData('Z-Connect Test Data/Create Hardhold Restraint_TestData').getValue(2, i), ('rHhKeyProductCode') : findTestData(
                'Z-Connect Test Data/Create Hardhold Restraint_TestData').getValue(3, i), ('rHhKeyAccountNbr') : findTestData(
                'Z-Connect Test Data/Create Hardhold Restraint_TestData').getValue(4, i), ('rHhKeyType') : findTestData(
                'Z-Connect Test Data/Create Hardhold Restraint_TestData').getValue(5, i), ('rHhVarKeyExpireDt') : findTestData(
                'Z-Connect Test Data/Create Hardhold Restraint_TestData').getValue(6, i), ('rHhTypeCd') : findTestData('Z-Connect Test Data/Create Hardhold Restraint_TestData').getValue(
                7, i), ('rHhReasonCode') : findTestData('Z-Connect Test Data/Create Hardhold Restraint_TestData').getValue(
                8, i), ('rHhCommnent1') : findTestData('Z-Connect Test Data/Create Hardhold Restraint_TestData').getValue(
                9, i), ('rHhComment2') : findTestData('Z-Connect Test Data/Create Hardhold Restraint_TestData').getValue(
                10, i), ('rHhReason1') : findTestData('Z-Connect Test Data/Create Hardhold Restraint_TestData').getValue(
                11, i), ('rHhReason2') : findTestData('Z-Connect Test Data/Create Hardhold Restraint_TestData').getValue(
                12, i)]))
	

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, 'createRestraintHardHoldServiceOperationResponse.RESPONSE.Output.xStatus.applicationCd', applicationCd)

WS.verifyElementPropertyValue(response, 'createRestraintHardHoldServiceOperationResponse.RESPONSE.Output.xStatus.statusCd', statusCd)

WS.verifyElementPropertyValue(response, 'createRestraintHardHoldServiceOperationResponse.RESPONSE.Output.xStatus.statusMessage', statusMessage)

WS.verifyElementPropertyValue(response, 'createRestraintHardHoldServiceOperationResponse.RESPONSE.Output.xStatus.severity', severity)

}



