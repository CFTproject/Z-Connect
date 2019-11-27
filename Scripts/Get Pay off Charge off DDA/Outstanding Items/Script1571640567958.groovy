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

response = WS.sendRequest(findTestObject('Get Pay off Charge off DDA/Outstanding Items'))

WS.verifyResponseStatusCode(response, 200)

String str = 'getPayoffChargeoffDDAServiceOperationResponse.RESPONSE.Output.'

testdatapath = findTestData('Z-Connect Test Data/Get Pay off Charge off DDA_TestData')

for(int i=9; i<10; i++)
{
	println ('EXCEL SHEET ROW NUMBER IS :'+i)
	WS.verifyElementPropertyValue(response, str+'xStatus.applicationCd', testdatapath.getValue(2, i))
	
	WS.verifyElementPropertyValue(response, str+'xStatus.statusCd', testdatapath.getValue(3, i))
	
	//WS.verifyElementPropertyValue(response, str+'xStatus.statusMessage', testdatapath.getValue(4, i))
	
	//WS.verifyElementPropertyValue(response, str+'xStatus.severity', testdatapath.getValue(5, i))
	
	WS.verifyElementPropertyValue(response, str+'companyNbr', testdatapath.getValue(6, i))
	
	WS.verifyElementPropertyValue(response, str+'shortName', testdatapath.getValue(7, i))
	
	WS.verifyElementPropertyValue(response, str+'accountNbr', testdatapath.getValue(8, i))
	
	WS.verifyElementPropertyValue(response, str+'postInterestOpt', testdatapath.getValue(9, i))
	
	WS.verifyElementPropertyValue(response, str+'ledgerBalanceAmt', testdatapath.getValue(11, i))
	
	WS.verifyElementPropertyValue(response, str+'outstandingItemAmt', testdatapath.getValue(12, i))
	
	WS.verifyElementPropertyValue(response, str+'accruedCreditIntAmt', testdatapath.getValue(13, i))
	
	WS.verifyElementPropertyValue(response, str+'accruedDebitIntAmt', testdatapath.getValue(14, i))
	
	WS.verifyElementPropertyValue(response, str+'amtWithheldAmt', testdatapath.getValue(15, i))
	
	WS.verifyElementPropertyValue(response, str+'feeTaxAmt', testdatapath.getValue(16, i))
	
	WS.verifyElementPropertyValue(response, str+'memoCreditsAmt', testdatapath.getValue(17, i))
	
	WS.verifyElementPropertyValue(response, str+'memoDebitsAmt', testdatapath.getValue(18, i))
	
	WS.verifyElementPropertyValue(response, str+'externalCreditsAmt', testdatapath.getValue(19, i))
	
	WS.verifyElementPropertyValue(response, str+'externalDebitsAmt', testdatapath.getValue(20, i))
	
	WS.verifyElementPropertyValue(response, str+'closeoutBalanceAmt', testdatapath.getValue(21, i))
	
	WS.verifyElementPropertyValue(response, str+'tranCode', testdatapath.getValue(22, i))
	
	WS.verifyElementPropertyValue(response, str+'closeoutAmt', testdatapath.getValue(23, i))
	
	WS.verifyElementPropertyValue(response, str+'restraintsAmt', testdatapath.getValue(24, i))
	
	WS.verifyElementPropertyValue(response, str+'floatAmt', testdatapath.getValue(25, i))
	
	WS.verifyElementPropertyValue(response, str+'restrictedDepAmt', testdatapath.getValue(26, i))
	
	WS.verifyElementPropertyValue(response, str+'extRestrictedDepAmt', testdatapath.getValue(27, i))
	
	
}