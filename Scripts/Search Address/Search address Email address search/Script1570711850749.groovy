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

response = WS.sendRequest(findTestObject('Search Address/Search address Email address search'))

WS.verifyResponseStatusCode(response, 200)

for(int i=5; i<6; i++ ){
	println ('EXCEL SHEET ROW NUMBER IS : '+i)

WS.verifyElementPropertyValue(response, 'searchAddressServiceOperationResponse.RESPONSE.Output.xStatus.applicationCd', findTestData('Z-Connect Test Data/Search Address_TestData').getValue(3, i))

WS.verifyElementPropertyValue(response, 'searchAddressServiceOperationResponse.RESPONSE.Output.xStatus.statusCd', findTestData('Z-Connect Test Data/Search Address_TestData').getValue(4, i))

WS.verifyElementPropertyValue(response, 'searchAddressServiceOperationResponse.RESPONSE.Output.xStatus.statusMessage', findTestData('Z-Connect Test Data/Search Address_TestData').getValue(5, i))

WS.verifyElementPropertyValue(response, 'searchAddressServiceOperationResponse.RESPONSE.Output.xStatus.severity', findTestData('Z-Connect Test Data/Search Address_TestData').getValue(6, i))

WS.verifyElementPropertyValue(response, 'searchAddressServiceOperationResponse.RESPONSE.Output.offset', findTestData('Z-Connect Test Data/Search Address_TestData').getValue(7, i))

WS.verifyElementPropertyValue(response, 'searchAddressServiceOperationResponse.RESPONSE.Output.limit', findTestData('Z-Connect Test Data/Search Address_TestData').getValue(8, i))

WS.verifyElementPropertyValue(response, 'searchAddressServiceOperationResponse.RESPONSE.Output.totalFound', findTestData('Z-Connect Test Data/Search Address_TestData').getValue(9, i))

WS.verifyElementPropertyValue(response, 'searchAddressServiceOperationResponse.RESPONSE.Output.addressListInfo[0].addressLine1', findTestData('Z-Connect Test Data/Search Address_TestData').getValue(10, i))

WS.verifyElementPropertyValue(response, 'searchAddressServiceOperationResponse.RESPONSE.Output.addressListInfo[0].addressLine2', findTestData('Z-Connect Test Data/Search Address_TestData').getValue(11, i))

WS.verifyElementPropertyValue(response, 'searchAddressServiceOperationResponse.RESPONSE.Output.addressListInfo[0].addressLine3', findTestData('Z-Connect Test Data/Search Address_TestData').getValue(12, i))

WS.verifyElementPropertyValue(response, 'searchAddressServiceOperationResponse.RESPONSE.Output.addressListInfo[0].addressTie', findTestData('Z-Connect Test Data/Search Address_TestData').getValue(13, i))

WS.verifyElementPropertyValue(response, 'searchAddressServiceOperationResponse.RESPONSE.Output.addressListInfo[0].addressBranch', findTestData('Z-Connect Test Data/Search Address_TestData').getValue(14, i))

WS.verifyElementPropertyValue(response, 'searchAddressServiceOperationResponse.RESPONSE.Output.addressListInfo[0].householdNbr', findTestData('Z-Connect Test Data/Search Address_TestData').getValue(15, i))

WS.verifyElementPropertyValue(response, 'searchAddressServiceOperationResponse.RESPONSE.Output.addressListInfo[0].country', findTestData('Z-Connect Test Data/Search Address_TestData').getValue(16, i))

}