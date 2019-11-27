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

String str = 'createRestraintMerchantAuthServiceOperationResponse.RESPONSE.Output.xStatus.'

testdatapath = findTestData('Z-Connect Test Data/Create Restraint Merchant Auth_TestData')

for (int i = 5; i < 6; i++) {
    response = WS.sendRequest(findTestObject('Create Restraint Merchant Auth/Create Restraint Merchant Auth record with all valid non blank input fields', 
            [('companyNbr') : testdatapath.getValue(2, i), ('productCd') : testdatapath.getValue(3, i), ('accountNbr') : testdatapath.getValue(
                    4, i), ('expireDt') : testdatapath.getValue(5, i), ('authorizationNbr') : testdatapath.getValue(6, i)
                , ('pledgeToAccountNbr') : testdatapath.getValue(7, i), ('reviewFrequency') : testdatapath.getValue(8, i)
                , ('lastReviewDt') : testdatapath.getValue(9, i), ('authorizedAmt') : testdatapath.getValue(10, i), ('comment01') : testdatapath.getValue(
                    11, i), ('comment02') : testdatapath.getValue(12, i), ('restraintReason01') : testdatapath.getValue(
                    13, i), ('restraintReason02') : testdatapath.getValue(14, i), ('merchantCd') : testdatapath.getValue(
                    15, i)]))
	
	WS.verifyResponseStatusCode(response, 200)
	
	WS.verifyElementPropertyValue(response, str+'applicationCd', testdatapath.getValue(17, i))
	
	WS.verifyElementPropertyValue(response, str+'statusCd', testdatapath.getValue(18, i))
	
	WS.verifyElementPropertyValue(response, str+'statusMessage', testdatapath.getValue(19, i))
	
	WS.verifyElementPropertyValue(response, str+'severity', testdatapath.getValue(20, i))
}