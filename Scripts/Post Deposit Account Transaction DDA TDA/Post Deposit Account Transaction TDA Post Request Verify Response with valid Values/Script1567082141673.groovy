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

response = WS.sendRequest(findTestObject('Post Deposit Account Transaction DDA TDA/Post Deposit Account Transaction DDA Post Request Verify Response with valid Values'))

WS.verifyResponseStatusCode(response, 200)

for(int i=1; i<2; i++ )
{
	
println ('EXCEL SHEET ROW NUNBER IS :'+i)
WS.verifyElementPropertyValue(response, 'postDepositAccountTransactionServiceOperationResponse.RESPONSE.Output.XSTATUS.applicationCd', applicationCd)

WS.verifyElementPropertyValue(response, 'postDepositAccountTransactionServiceOperationResponse.RESPONSE.Output.XSTATUS.statusCd', statusCd)

WS.verifyElementPropertyValue(response, 'postDepositAccountTransactionServiceOperationResponse.RESPONSE.Output.XSTATUS.statusMessage', statusMessage)

WS.verifyElementPropertyValue(response, 'postDepositAccountTransactionServiceOperationResponse.RESPONSE.Output.XSTATUS.severity', severity)

}



