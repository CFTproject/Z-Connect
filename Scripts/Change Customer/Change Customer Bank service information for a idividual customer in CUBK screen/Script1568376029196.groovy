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

for (int i = 4; i < 5; i++) {
	
    println('EXCEL SHEET ROW NUMBER IS : ' + i)

    println('APPLICATION CODE : ' + findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(15, i))

    println('STATUS CODE : ' + findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(16, i))

    println('STATUS MESSAGE : ' + findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(17, i))

    println('SEVERITY : ' + findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(18, i))

    response = WS.sendRequest(findTestObject('Change Customer/Change Customer Bank service information for a idividual customer in CUBK screen', 
            [('inputKey') : findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(2, i), ('customerTie') : findTestData(
                    'Z-Connect Test Data/Change Customer_TestData').getValue(3, i), ('companyNbr') : findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(
                    4, i), ('customerKeyLine2') : findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(
                    5, i), ('employeeInd') : findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(6, i)
                , ('sensitivityCode') : findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(7, i), ('bankServicesActionCd') : findTestData(
                    'Z-Connect Test Data/Change Customer_TestData').getValue(8, i), ('bankServiceCd') : findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(
                    9, i)]))

    WS.verifyResponseStatusCode(response, 200)

    WS.verifyElementPropertyValue(response, 'changeCustomerServiceOperationResponse.RESPONSE.Output.xStatus.applicationCd', 
        findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(15, i))

    WS.verifyElementPropertyValue(response, 'changeCustomerServiceOperationResponse.RESPONSE.Output.xStatus.statusCd', findTestData(
            'Z-Connect Test Data/Change Customer_TestData').getValue(16, i))

    WS.verifyElementPropertyValue(response, 'changeCustomerServiceOperationResponse.RESPONSE.Output.xStatus.statusMessage', 
        findTestData('Z-Connect Test Data/Change Customer_TestData').getValue(17, i))

    WS.verifyElementPropertyValue(response, 'changeCustomerServiceOperationResponse.RESPONSE.Output.xStatus.severity', findTestData(
            'Z-Connect Test Data/Change Customer_TestData').getValue(18, i))
}

