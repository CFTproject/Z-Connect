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

response = WS.sendRequest(findTestObject('Get Account Relationships/Get Account Relationships with Account not on File'))

WS.verifyResponseStatusCode(response, 200)

String str = 'getAccountRelationshipsServiceOperationResponse.RESPONSE.Output.'

testdata = findTestData('Z-Connect Test Data/Get Account Relationships_TestData')

for (int i = 5; i < 6; i++) {
    println('EXCEL SHEET ROW NUMBER IS :' + i)

    WS.verifyElementPropertyValue(response, str + 'xStatus.applicationCd', testdata.getValue(2, i))

    WS.verifyElementPropertyValue(response, str + 'xStatus.statusCd', testdata.getValue(3, i))

    WS.verifyElementPropertyValue(response, str + 'xStatus.statusMessage', testdata.getValue(4, i))

    WS.verifyElementPropertyValue(response, str + 'xStatus.severity', testdata.getValue(5, i)) 
	
	
}

