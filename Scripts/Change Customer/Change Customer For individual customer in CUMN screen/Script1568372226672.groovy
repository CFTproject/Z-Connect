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

for (int i = 1; i < 3; i++) {
	
    println('EXCEL SHEET ROW NUMBER IS : ' + i)

    println('APPLICATION CODE : ' + findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(36, i))

    println('STATUS CODE : ' + findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(37, i))

    println('STATUS MESSAGE : ' + findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(38, i))

    println('SEVERITY : ' + findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(39, i))

    response = WS.sendRequest(findTestObject('Change Customer/Change Customer For individual customer in CUMN screen', [
                ('inputKey') : findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(2, i), ('customerTie') : findTestData(
                    'Z-Connect Test Data/Change Customer_TestData').getValue(3, i), ('companyNbr') : findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(
                    5, i), ('customerKeyLine2') : findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(
                    13, i), ('employeeInd') : findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(14, 
                    i), ('sensitivityCode') : findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(15, 
                    i), ('customerOfficer1Cd') : findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(18, 
                    i), ('customerOfficer2Cd') : findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(19, 
                    i), ('employerName') : findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(20, i), ('homePhoneNbr') : findTestData(
                    'Z-Connect Test Data/Change Customer_TestData').getValue(21, i), ('businessPhoneNbr') : findTestData(
                    'Z-Connect Test Data/Change Customer_TestData').getValue(22, i), ('birthDt') : findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(
                    23, i), ('genderCd') : findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(24, i)]))

    WS.verifyResponseStatusCode(response, 200)

    WS.verifyElementPropertyValue(response, 'changeCustomerServiceOperationResponse.RESPONSE.Output.xStatus.applicationCd', 
        findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(36, i))

    WS.verifyElementPropertyValue(response, 'changeCustomerServiceOperationResponse.RESPONSE.Output.xStatus.statusCd', findTestData(
            'Z-Connect Test Data/Change Customer_TestData').getValue(37, i))

    WS.verifyElementPropertyValue(response, 'changeCustomerServiceOperationResponse.RESPONSE.Output.xStatus.statusMessage', 
        findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(38, i))

    WS.verifyElementPropertyValue(response, 'changeCustomerServiceOperationResponse.RESPONSE.Output.xStatus.severity', findTestData(
            'Z-Connect Test Data/Change Customer_TestData').getValue(39, i))
}

