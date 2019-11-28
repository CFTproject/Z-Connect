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

String str = 'createAddressServiceOperationResponse.RESPONSE.Output.xStatus.'

testdatapath = findTestData('Z-Connect Test Data/Create Address_TestData')

for (int i = 1; i < 10; i++) {
    println('EXCEL SHEET ROW NUMBER IS : ' + i)

    if ((((((((i == 1) || (i == 2)) || (i == 3)) || (i == 4)) || (i == 5)) || (i == 6)) || (i == 8)) || (i == 9)) {
        response = WS.sendRequest(findTestObject('Create Address/Create Address Post Request Verify Response with valid Values', 
                [('companyNbr') : testdatapath.getValue(2, i), ('addressLine1') : testdatapath.getValue(3, i), ('addressLine2') : testdatapath.getValue(
                        4, i), ('addressLine3') : testdatapath.getValue(5, i), ('city') : testdatapath.getValue(7, i), ('state') : testdatapath.getValue(
                        8, i), ('postalCd') : testdatapath.getValue(9, i), ('country') : testdatapath.getValue(10, i), ('addressTie') : testdatapath.getValue(
                        11, i), ('householdNumber') : testdatapath.getValue(12, i)]))
    }
    
    if (i == 7) {
        response = WS.sendRequest(findTestObject('Create Address/Create an address with non blank address line 1, postal code, iseZipTable Y All other input fields blank', 
                [('companyNbr') : testdatapath.getValue(2, i), ('addressLine1') : testdatapath.getValue(3, i), ('addressLine2') : testdatapath.getValue(
                        4, i), ('addressLine3') : testdatapath.getValue(5, i), ('useZipTable') : testdatapath.getValue(6, 
                        i), ('city') : testdatapath.getValue(7, i), ('state') : testdatapath.getValue(8, i), ('postalCd') : testdatapath.getValue(
                        9, i), ('country') : testdatapath.getValue(10, i), ('addressTie') : testdatapath.getValue(11, i)
                    , ('householdNumber') : testdatapath.getValue(12, i)]))
    }
    
    WS.verifyResponseStatusCode(response, 200)

    WS.verifyElementPropertyValue(response, str + 'applicationCd', testdatapath.getValue(14, i))

    WS.verifyElementPropertyValue(response, str + 'statusCd', testdatapath.getValue(15, i))

    WS.verifyElementPropertyValue(response, str + 'statusMessage', testdatapath.getValue(16, i))

    WS.verifyElementPropertyValue(response, str + 'severity', testdatapath.getValue(17, i))
}