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

String str = 'deleteRestraintPledgeToServiceOperationResponse.RESPONSE.Output.xStatus.'

testdatapath = findTestData('Z-Connect Test Data/Delete Restraint Pledge To_TestData')

for (int i = 3; i < 4; i++) {
	
	println ('EXCEL SHEET ROW NUMBER IS :'+i)
	
    response = WS.sendRequest(findTestObject('Delete Restraint Pledge To/Delete Restraint PledgeTo for DDA type 3', [('companyNbr') : findTestData(
                    'Z-Connect Test Data/Delete Restraint Pledge To_TestData').getValue(2, i), ('productCd') : findTestData(
                    'Z-Connect Test Data/Delete Restraint Pledge To_TestData').getValue(3, i), ('accountNbr') : findTestData(
                    'Z-Connect Test Data/Delete Restraint Pledge To_TestData').getValue(4, i), ('pledgeToType') : findTestData(
                    'Z-Connect Test Data/Delete Restraint Pledge To_TestData').getValue(5, i), ('expireDt') : findTestData(
                    'Z-Connect Test Data/Delete Restraint Pledge To_TestData').getValue(6, i), ('placedDt') : findTestData(
                    'Z-Connect Test Data/Delete Restraint Pledge To_TestData').getValue(7, i), ('sequenceNbr') : findTestData(
                    'Z-Connect Test Data/Delete Restraint Pledge To_TestData').getValue(8, i), ('authorizationNbr') : findTestData(
                    'Z-Connect Test Data/Delete Restraint Pledge To_TestData').getValue(9, i)]))

    WS.verifyResponseStatusCode(response, 200)

    WS.verifyElementPropertyValue(response, str + 'applicationCd', testdatapath.getValue(11, i))

    WS.verifyElementPropertyValue(response, str + 'statusCd', testdatapath.getValue(12, i))

    WS.verifyElementPropertyValue(response, str + 'statusMessage', testdatapath.getValue(13, i))

    WS.verifyElementPropertyValue(response, str + 'severity', testdatapath.getValue(14, i))
}