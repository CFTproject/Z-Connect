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

for (int i = 1; i < 7; i++) {
    println('EXCEL SHEET ROW NUMBERS :- ' + i)

    response = WS.sendRequest(findTestObject('Relate Account to Account/Relate Account to Account Patch Method Verify Response with valid Values', 
            [('accountCompanyNbr') : findTestData('Z-Connect Test Data/Relate Account to Account_TestData').getValue(2, 
                    i), ('accountProductCd') : findTestData('Z-Connect Test Data/Relate Account to Account_TestData').getValue(
                    3, i), ('accountNbr') : findTestData('Z-Connect Test Data/Relate Account to Account_TestData').getValue(
                    4, i), ('actionCd') : findTestData('Z-Connect Test Data/Relate Account to Account_TestData').getValue(
                    5, i), ('companyNbr') : findTestData('Z-Connect Test Data/Relate Account to Account_TestData').getValue(
                    6, i), ('productCd') : findTestData('Z-Connect Test Data/Relate Account to Account_TestData').getValue(
                    7, i), ('account') : findTestData('Z-Connect Test Data/Relate Account to Account_TestData').getValue(
                    8, i), ('relationshipCd') : findTestData('Z-Connect Test Data/Relate Account to Account_TestData').getValue(
                    9, i), ('owner') : findTestData('Z-Connect Test Data/Relate Account to Account_TestData').getValue(10, 
                    i), ('apspInd') : findTestData('Z-Connect Test Data/Relate Account to Account_TestData').getValue(11, 
                    i)]))

    WS.verifyResponseStatusCode(response, 200)

    WS.verifyElementPropertyValue(response, 'relateAccountToAccountServiceOperationResponse.RESPONSE.Output.xStatus.applicationCd', 
        findTestData('Z-Connect Test Data/Relate Account to Account_TestData').getValue(13, i))
	
	WS.verifyElementPropertyValue(response, 'relateAccountToAccountServiceOperationResponse.RESPONSE.Output.xStatus.statusCd',
		findTestData('Z-Connect Test Data/Relate Account to Account_TestData').getValue(14, i))
	
	WS.verifyElementPropertyValue(response, 'relateAccountToAccountServiceOperationResponse.RESPONSE.Output.xStatus.statusMessage',
		findTestData('Z-Connect Test Data/Relate Account to Account_TestData').getValue(15, i))
	
	WS.verifyElementPropertyValue(response, 'relateAccountToAccountServiceOperationResponse.RESPONSE.Output.xStatus.severity',
		findTestData('Z-Connect Test Data/Relate Account to Account_TestData').getValue(16, i))

   
}

