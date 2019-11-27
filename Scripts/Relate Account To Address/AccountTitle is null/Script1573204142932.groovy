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

String str = 'relateAccountToAddressServiceOperationResponse.RESPONSE.Output.xStatus.'

testdatapath = findTestData('Z-Connect Test Data/Relate Account To Address_TestData')

for (int i = 10; i < 11; i++) {
    println('EXCEL SHEET ROW NUMBER IS : ' + i)

    response = WS.sendRequest(findTestObject('Relate Account To Address/AccountTitle is null'))
            /*[('accountCompanyNbr') : findTestData('Z-Connect Test Data/Relate Account To Address_TestData').getValue(2, 
                    i), ('accountProductCd') : findTestData('Z-Connect Test Data/Relate Account To Address_TestData').getValue(
                    3, i), ('accountNbr') : findTestData('Z-Connect Test Data/Relate Account To Address_TestData').getValue(
                    4, i), ('accountTitle') : findTestData('Z-Connect Test Data/Relate Account To Address_TestData').getValue(
                    5, i), ('addressCompanyNbr') : findTestData('Z-Connect Test Data/Relate Account To Address_TestData').getValue(
                    6, i), ('addressLine1') : findTestData('Z-Connect Test Data/Relate Account To Address_TestData').getValue(
                    7, i), ('addressLine2') : findTestData('Z-Connect Test Data/Relate Account To Address_TestData').getValue(
                    8, i), ('addressLine3') : findTestData('Z-Connect Test Data/Relate Account To Address_TestData').getValue(
                    9, i), ('city') : findTestData('Z-Connect Test Data/Relate Account To Address_TestData').getValue(10, 
                    i), ('state') : findTestData('Z-Connect Test Data/Relate Account To Address_TestData').getValue(11, 
                    i), ('postalCd') : findTestData('Z-Connect Test Data/Relate Account To Address_TestData').getValue(12, 
                    i), ('country') : findTestData('Z-Connect Test Data/Relate Account To Address_TestData').getValue(13, 
                    i), ('addressTie') : findTestData('Z-Connect Test Data/Relate Account To Address_TestData').getValue(
                    14, i), ('addressUseCd') : findTestData('Z-Connect Test Data/Relate Account To Address_TestDataa').getValue(
                    15, i), ('sequenceWithinUseCd') : findTestData('Z-Connect Test Data/Relate Account To Address_TestData').getValue(
                    16, i), ('addressEffectiveDt') : findTestData('Z-Connect Test Data/Relate Account To Address_TestData').getValue(
                    17, i), ('addressExpiryDt') : findTestData('Z-Connect Test Data/Relate Account To Address_TestData').getValue(
                    18, i)]))*/

    WS.verifyResponseStatusCode(response, 200)

    WS.verifyElementPropertyValue(response, str + 'applicationCd', testdatapath.getValue(20, i))

    WS.verifyElementPropertyValue(response, str + 'statusCd', testdatapath.getValue(21, i))

    WS.verifyElementPropertyValue(response, str + 'detailMessages', testdatapath.getValue(22, i))

    WS.verifyElementPropertyValue(response, str + 'severity', testdatapath.getValue(23, i))
}