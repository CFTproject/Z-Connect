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

String str = 'deleteRestraintMerchantAuthServiceOperationResponse.RESPONSE.Output.xStatus.'

testdatapath = findTestData('Z-Connect Test Data/Delete Restraint Merchant Auth_TestData')

for (int i = 3; i < 4; i++) {
    response = WS.sendRequest(findTestObject('Delete Restraint Merchant Auth/Delete Restraint Merchant Auth record with non blank product code and account no fields and all other blank input fields', 
            [('companyNbr') : testdatapath.getValue(2, i), ('productCd') : testdatapath.getValue(3, i), ('accountNbr') : testdatapath.getValue(
                    4, i), ('expireDt') : testdatapath.getValue(5, i), ('placedDt') : testdatapath.getValue(6, i), ('sequenceNbr') : testdatapath.getValue(
                    7, i), ('authorizationNbr') : testdatapath.getValue(8, i)]))

    WS.verifyResponseStatusCode(response, 200)

    WS.verifyElementPropertyValue(response, str + 'applicationCd', testdatapath.getValue(10, i))

    WS.verifyElementPropertyValue(response, str + 'statusCd', testdatapath.getValue(11, i))

    WS.verifyElementPropertyValue(response, str + 'statusMessage', testdatapath.getValue(12, i))

    WS.verifyElementPropertyValue(response, str + 'severity', testdatapath.getValue(13, i))
}