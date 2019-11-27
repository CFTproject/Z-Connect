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

for (int i = 1; i < 4; i++) {
    println('EXCEL SHEET ROW NUMBER IS : ' + i)

    println('APPLICATION CODE : ' + findTestData('Z-Connect Test Data/Change Address Customer_TestData').getValue(17, i))

    println('STATUS CODE : ' + findTestData('Z-Connect Test Data/Change Address Customer_TestData').getValue(18, i))

    println('STATUS MESSAGE : ' + findTestData('Z-Connect Test Data/Change Address Customer_TestData').getValue(19, i))

    println('SEVERITY : ' + findTestData('Z-Connect Test Data/Change Address Customer_TestData').getValue(20, i))

    response = WS.sendRequest(findTestObject('Change Address Customer/Change Address Customer Patch Request Verify Response with valid Values', 
            [('actionCode') : findTestData('Z-Connect Test Data/Change Address Customer_TestData').getValue(3, i), ('customerCompanyNbr') : findTestData(
                    'Z-Connect Test Data/Change Address Customer_TestData').getValue(4, i), ('inputKey') : findTestData('Z-Connect Test Data/Change Address Customer_TestData').getValue(
                    5, i), ('tie') : findTestData('Z-Connect Test Data/Change Address Customer_TestData').getValue(6, i), ('useCd') : findTestData(
                    'Z-Connect Test Data/Change Address Customer_TestData').getValue(7, i), ('postalCd') : findTestData('Z-Connect Test Data/Change Address Customer_TestData').getValue(
                    8, i), ('addressLine1') : findTestData('Z-Connect Test Data/Change Address Customer_TestData').getValue(
                    9, i), ('addressLine2') : findTestData('Z-Connect Test Data/Change Address Customer_TestData').getValue(
                    10, i), ('addressLine3') : findTestData('Z-Connect Test Data/Change Address Customer_TestData').getValue(
                    11, i), ('addressTie') : findTestData('Z-Connect Test Data/Change Address Customer_TestData').getValue(
                    12, i), ('useZipTable') : findTestData('Z-Connect Test Data/Change Address Customer_TestData').getValue(
                    13, i), ('city') : findTestData('Z-Connect Test Data/Change Address Customer_TestData').getValue(14, 
                    i), ('state') : findTestData('Z-Connect Test Data/Change Address Customer_TestData').getValue(15, i)]))
	
	WS.verifyResponseStatusCode(response, 200)
	
	WS.verifyElementPropertyValue(response, 'changeAddressCustomerServiceOperationResponse.RESPONSE.Output.xStatus.applicationCd', findTestData('Z-Connect Test Data/Change Address Customer_TestData').getValue(17, i))
	
	WS.verifyElementPropertyValue(response, 'changeAddressCustomerServiceOperationResponse.RESPONSE.Output.xStatus.statusCd', findTestData('Z-Connect Test Data/Change Address Customer_TestData').getValue(18, i))
	
	WS.verifyElementPropertyValue(response, 'changeAddressCustomerServiceOperationResponse.RESPONSE.Output.xStatus.statusMessage', findTestData('Z-Connect Test Data/Change Address Customer_TestData').getValue(19, i))
	
	WS.verifyElementPropertyValue(response, 'changeAddressCustomerServiceOperationResponse.RESPONSE.Output.xStatus.severity', findTestData('Z-Connect Test Data/Change Address Customer_TestData').getValue(20, i))
	
	
}