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

for(int i=1; i<10; i++){
	
println ('EXCEL SHEET ROW NUMBER IS :- '+i)	

response = WS.sendRequest(findTestObject('Relate Customer To Account/Relate Customer To Account Patch Method Verify Response with valid Values', 
        [('accountCompanyNbr') : findTestData('Z-Connect Test Data/Relate Customer To Account_TestData').getValue(3, i), ('inputKey') : findTestData(
                'Z-Connect Test Data/Relate Customer To Account_TestData').getValue(4, i), ('customerTie') : findTestData(
                'Z-Connect Test Data/Relate Customer To Account_TestData').getValue(5, i), ('offset') : findTestData('Z-Connect Test Data/Relate Customer To Account_TestData').getValue(
                9, i), ('actionCd') : findTestData('Z-Connect Test Data/Relate Customer To Account_TestData').getValue(10, 
                i), ('accountNbr') : findTestData('Z-Connect Test Data/Relate Customer To Account_TestData').getValue(13, 
                i), ('relationshipCd') : findTestData('Z-Connect Test Data/Relate Customer To Account_TestData').getValue(
                14, i), ('ownerPercentage') : findTestData('Z-Connect Test Data/Relate Customer To Account_TestData').getValue(
                15, i), ('rpmAnalysisIndicator') : findTestData('Z-Connect Test Data/Relate Customer To Account_TestData').getValue(
                16, i), ('rpmPricingIndicator') : findTestData('Z-Connect Test Data/Relate Customer To Account_TestData').getValue(
                16, i), ('cdsCombinedStatementIndicator') : findTestData('Z-Connect Test Data/Relate Customer To Account_TestData').getValue(
                18, i), ('pcsIndicator') : findTestData('Z-Connect Test Data/Relate Customer To Account_TestData').getValue(
                19, i), ('accountProductCd') : findTestData('Z-Connect Test Data/Relate Customer To Account_TestData').getValue(
                12, i)]))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, 'relateCustomerToAccountServiceOperationResponse.RESPONSE.Output.xStatus.applicationCd', findTestData('Z-Connect Test Data/Relate Customer To Account_TestData').getValue(21, i))

WS.verifyElementPropertyValue(response, 'relateCustomerToAccountServiceOperationResponse.RESPONSE.Output.xStatus.statusCd', findTestData('Z-Connect Test Data/Relate Customer To Account_TestData').getValue(22, i))

WS.verifyElementPropertyValue(response, 'relateCustomerToAccountServiceOperationResponse.RESPONSE.Output.xStatus.statusMessage', findTestData('Z-Connect Test Data/Relate Customer To Account_TestData').getValue(23, i))

WS.verifyElementPropertyValue(response, 'relateCustomerToAccountServiceOperationResponse.RESPONSE.Output.xStatus.severity', findTestData('Z-Connect Test Data/Relate Customer To Account_TestData').getValue(24, i))


}