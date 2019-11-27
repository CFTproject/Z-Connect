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

for (int i = 1; i < 4; i++) {
	
    println('EXCEL SHEET ROW NUMBER IS : ' + i)

    if (i == 1 || i == 2 || i == 3) {
        response = WS.sendRequest(findTestObject('Change Combined Statement/Change the Combined Statement information of an account', 
                [('companyNbr') : findTestData('Z-Connect Test Data/Change Combined Statement_TestData').getValue(2, i), ('productCd') : findTestData(
                        'Z-Connect Test Data/Change Combined Statement_TestData').getValue(3, i), ('accountNbr') : findTestData(
                        'Z-Connect Test Data/Change Combined Statement_TestData').getValue(4, i), ('actionCd') : findTestData(
                        'Z-Connect Test Data/Change Combined Statement_TestData').getValue(5, i), ('companyNbr1') : findTestData(
                        'Z-Connect Test Data/Change Combined Statement_TestData').getValue(6, i), ('accountNbr1') : findTestData(
                        'Z-Connect Test Data/Change Combined Statement_TestData').getValue(7, i), ('productCd1') : findTestData(
                        'Z-Connect Test Data/Change Combined Statement_TestData').getValue(8, i)]))
    }
	WS.verifyResponseStatusCode(response, 200)
	
	WS.verifyElementPropertyValue(response, 'changeCombinedStatementServiceOperationResponse.RESPONSE.Output.xStatus.applicationCd', findTestData('Z-Connect Test Data/Change Combined Statement_TestData').getValue(10, i))
	
	WS.verifyElementPropertyValue(response, 'changeCombinedStatementServiceOperationResponse.RESPONSE.Output.xStatus.statusCd', findTestData('Z-Connect Test Data/Change Combined Statement_TestData').getValue(11, i))
	
	WS.verifyElementPropertyValue(response, 'changeCombinedStatementServiceOperationResponse.RESPONSE.Output.xStatus.statusMessage', findTestData('Z-Connect Test Data/Change Combined Statement_TestData').getValue(12, i))
	
	WS.verifyElementPropertyValue(response, 'changeCombinedStatementServiceOperationResponse.RESPONSE.Output.xStatus.severity', findTestData('Z-Connect Test Data/Change Combined Statement_TestData').getValue(13, i))
}
