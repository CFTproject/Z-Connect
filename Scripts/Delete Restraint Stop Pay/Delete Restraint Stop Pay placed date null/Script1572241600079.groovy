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

String str = 'deleteRestraintStopPayServiceOperationResponse.RESPONSE.Output.xStatus.'

testdatapath = findTestData('Z-Connect Test Data/Delete Restraint Stop Pay_TestData')

for (int i = 9; i < 10; i++) {
    println('EXCEL SHEET ROW NUMBER IS : ' + i)

    response = WS.sendRequest(findTestObject('Delete Restraint Stop Pay/Delete Restraint Stop Pay placed date null', [('companyNbr') : findTestData(
                    'Z-Connect Test Data/Delete Restraint Stop Pay_TestData').getValue(2, i), ('productCd') : findTestData(
                    'Z-Connect Test Data/Delete Restraint Stop Pay_TestData').getValue(3, i), ('accountNbr') : findTestData(
                    'Z-Connect Test Data/Delete Restraint Stop Pay_TestData').getValue(4, i), ('stopPayType') : findTestData(
                    'Z-Connect Test Data/Delete Restraint Stop Pay_TestData').getValue(5, i), ('lowCheckNbr') : findTestData(
                    'Z-Connect Test Data/Delete Restraint Stop Pay_TestData').getValue(6, i), ('highCheckNbr') : findTestData(
                    'Z-Connect Test Data/Delete Restraint Stop Pay_TestData').getValue(7, i), ('lowCheckAmt') : findTestData(
                    'Z-Connect Test Data/Delete Restraint Stop Pay_TestData').getValue(8, i), ('highCheckAmt') : findTestData(
                    'Z-Connect Test Data/Delete Restraint Stop Pay_TestData').getValue(9, i), ('expireDt') : findTestData(
                    'Z-Connect Test Data/Delete Restraint Stop Pay_TestData').getValue(10, i), ('placedDt') : findTestData(
                    'Z-Connect Test Data/Delete Restraint Stop Pay_TestData').getValue(11, i)]))

    WS.verifyResponseStatusCode(response, 200)

    WS.verifyElementPropertyValue(response, str + 'applicationCd', testdatapath.getValue(13, i))

    WS.verifyElementPropertyValue(response, str + 'statusCd', testdatapath.getValue(14, i))

    WS.verifyElementPropertyValue(response, str + 'statusMessage', testdatapath.getValue(15, i))

    WS.verifyElementPropertyValue(response, str + 'severity', testdatapath.getValue(16, i))
}