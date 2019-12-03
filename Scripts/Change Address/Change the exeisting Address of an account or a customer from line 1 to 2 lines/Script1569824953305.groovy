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

String str = 'changeAddressServiceOperationResponse.RESPONSE.Output.xStatus.'

testdatapath = findTestData('Z-Connect Test Data/Change Address_TestData')

for (int i = 9; i < 10; i++) {
    println('EXCEL SHEET ROW NUMBER IS : ' + i)

    response = WS.sendRequest(findTestObject('Change Address/Change the exeisting Address of an account or a customer from line 1 to 2 lines', 
            [('actionCode') : testdatapath.getValue(2, i), ('presentAddressLine1') : testdatapath.getValue(3, i), ('presentAddressTie') : testdatapath.getValue(
                    5, i), ('presentPostalCd') : testdatapath.getValue(6, i), ('chgAddressLine1') : testdatapath.getValue(
                    7, i), ('chgAddressLine2') : testdatapath.getValue(8, i), ('userAcknowledge') : testdatapath.getValue(
                    13, i)]))

    WS.verifyResponseStatusCode(response, 200)

    WS.verifyElementPropertyValue(response, str + 'applicationCd', testdatapath.getValue(15, i))

    WS.verifyElementPropertyValue(response, str + 'statusCd', testdatapath.getValue(16, i))

    WS.verifyElementPropertyValue(response, str + 'statusMessage', testdatapath.getValue(17, i))

    WS.verifyElementPropertyValue(response, str + 'severity', testdatapath.getValue(18, i))
}