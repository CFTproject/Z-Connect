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

for (int i = 5; i < 6; i++) {
    println('EXCEL SHEET ROW NUMBERS :- ' + i)

    response = WS.sendRequest(findTestObject('Relate Customer To Address/Relate Customer To Address Patch Method Verify Response with invalid Values', 
            [('customerCompanyNbr') : findTestData('Z-Connect Test Data/Relate Customer To Address_TestData').getValue(3, 
                    i), ('inputKey') : findTestData('Z-Connect Test Data/Relate Customer To Address_TestData').getValue(
                    4, i), ('tie') : findTestData('Z-Connect Test Data/Relate Customer To Address_TestData').getValue(5, 
                    i), ('useCd') : findTestData('Z-Connect Test Data/Relate Customer To Address_TestData').getValue(6, 
                    i), ('postalCd') : findTestData('Z-Connect Test Data/Relate Customer To Address_TestData').getValue(
                    7, i), ('addressLine1') : findTestData('Z-Connect Test Data/Relate Customer To Address_TestData').getValue(
                    8, i), ('addressLine2') : findTestData('Z-Connect Test Data/Relate Customer To Address_TestData').getValue(
                    9, i), ('addressLine3') : findTestData('Z-Connect Test Data/Relate Customer To Address_TestData').getValue(
                    10, i), ('useZipTable') : findTestData('Z-Connect Test Data/Relate Customer To Address_TestData').getValue(
                    11, i), ('city') : findTestData('Z-Connect Test Data/Relate Customer To Address_TestData').getValue(
                    12, i), ('state') : findTestData('Z-Connect Test Data/Relate Customer To Address_TestData').getValue(
                    13, i)]))

    WS.verifyResponseStatusCode(response, 400)

    WS.verifyElementPropertyValue(response, 'errorMessage', findTestData('Z-Connect Test Data/Relate Customer To Address_TestData').getValue(
            19, i))
}