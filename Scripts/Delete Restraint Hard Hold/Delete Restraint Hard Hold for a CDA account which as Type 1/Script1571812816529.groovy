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

String str = 'deleteRestraintHardHoldServiceOperationResponse.RESPONSE.Output.xStatus.'


testdatapath = findTestData('Z-Connect Test Data/Delete Restraint Hard Hold_TestData')

for (int i = 1; i < 2; i++) {
    println('EXCEL SHEET ROW NUMBER IS: ' + i)

    response = WS.sendRequest(findTestObject('Delete Restraint Hard Hold/Delete Restraint Hard Hold for a CDA account which as Type 1', 
            [('companyNbr') : findTestData('Z-Connect Test Data/Delete Restraint Hard Hold_TestData').getValue(2, i), ('productCd') : findTestData(
                    'Z-Connect Test Data/Delete Restraint Hard Hold_TestData').getValue(3, i), ('accountNbr') : findTestData(
                    'Z-Connect Test Data/Delete Restraint Hard Hold_TestData').getValue(4, i), ('hardHoldType') : findTestData(
                    'Z-Connect Test Data/Delete Restraint Hard Hold_TestData').getValue(5, i), ('expireDt') : findTestData(
                    'Z-Connect Test Data/Delete Restraint Hard Hold_TestData').getValue(6, i), ('placedDt') : findTestData(
                    'Z-Connect Test Data/Delete Restraint Hard Hold_TestData').getValue(7, i), ('sequenceNbr') : findTestData(
                    'Z-Connect Test Data/Delete Restraint Hard Hold_TestData').getValue(8, i)]))

    WS.verifyResponseStatusCode(response, 200)

    WS.verifyElementPropertyValue(response, str + 'applicationCd', testdatapath.getValue(10, i))

    WS.verifyElementPropertyValue(response, str + 'statusCd', testdatapath.getValue(11, i))

    WS.verifyElementPropertyValue(response, str + 'statusMessage', testdatapath.getValue(12, i))

    WS.verifyElementPropertyValue(response, str + 'severity', testdatapath.getValue(13, i))
}