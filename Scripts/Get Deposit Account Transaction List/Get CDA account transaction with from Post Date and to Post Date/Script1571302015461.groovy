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

response = WS.sendRequest(findTestObject('Get Deposit Account Transaction List/Get CDA account transaction with from Post Date and to Post Date'))

WS.verifyResponseStatusCode(response, 200)

String str = 'getDepositAccountTransactionListServiceOperationResponse.RESPONSE.Output.'

testdatapath = findTestData('Z-Connect Test Data/Get Deposit Account Transaction List_TestData')

for (int i = 4; i < 5; i++) {
	println('EXCEL SHEET ROW NUMBER IS ' + i)

	WS.verifyElementPropertyValue(response, str + 'xStatus.applicationCd', testdatapath.getValue(2, i))

	WS.verifyElementPropertyValue(response, str + 'xStatus.statusCd', testdatapath.getValue(3, i))

	//WS.verifyElementPropertyValue(response, str + 'xStatus.statusmessage', testdatapath.getValue(4, i))

	WS.verifyElementPropertyValue(response, str + 'xStatus.severity', testdatapath.getValue(5, i))
	
	WS.verifyElementPropertyValue(response, str + 'offset', testdatapath.getValue(6, i))
	
	WS.verifyElementPropertyValue(response, str + 'limit', testdatapath.getValue(7, i))
	
	WS.verifyElementPropertyValue(response, str + 'accountNbr', testdatapath.getValue(8, i))
	
	WS.verifyElementPropertyValue(response, str + 'productCd', testdatapath.getValue(9, i))
	
	WS.verifyElementPropertyValue(response, str + 'companyNbr', testdatapath.getValue(10, i))
	
	WS.verifyElementPropertyValue(response, str + 'transactions[0].tranId', testdatapath.getValue(11, i))
	
	WS.verifyElementPropertyValue(response, str + 'transactions[0].tranType', testdatapath.getValue(12, i))
	
	WS.verifyElementPropertyValue(response, str + 'transactions[0].createDate', testdatapath.getValue(13, i))
	
	WS.verifyElementPropertyValue(response, str + 'transactions[0].postDate', testdatapath.getValue(14, i))
	
	WS.verifyElementPropertyValue(response, str + 'transactions[0].tranAmount', testdatapath.getValue(15, i))
	
	WS.verifyElementPropertyValue(response, str + 'transactions[0].tranDesc', testdatapath.getValue(16, i))
	
	WS.verifyElementPropertyValue(response, str + 'transactions[0].checkNbr', testdatapath.getValue(17, i))
	
	WS.verifyElementPropertyValue(response, str + 'transactions[0].currentBalance', testdatapath.getValue(18, i))

   
}

