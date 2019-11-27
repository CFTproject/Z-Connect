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

response = WS.sendRequest(findTestObject('Get Address Profile/Get valid address with offsetCustomer offsetAccount LimitCustomer LimitAccount as blank'))

WS.verifyResponseStatusCode(response, 200)

for(int i=1; i<2; i++){
	println ('EXCELSHEET ROW NUMBER IS '+i)
	WS.verifyElementPropertyValue(response, 'getAddressProfileServiceOperationResponse.RESPONSE.Output.xStatus.applicationCd', findTestData('Z-Connect Test Data/Get Address Profile_TestData').getValue(2, i))
	
	WS.verifyElementPropertyValue(response, 'getAddressProfileServiceOperationResponse.RESPONSE.Output.xStatus.statusCd', findTestData('Z-Connect Test Data/Get Address Profile_TestData').getValue(3, i))
	
	WS.verifyElementPropertyValue(response, 'getAddressProfileServiceOperationResponse.RESPONSE.Output.xStatus.detailMessages', findTestData('Z-Connect Test Data/Get Address Profile_TestData').getValue(4, i))
	
	WS.verifyElementPropertyValue(response, 'getAddressProfileServiceOperationResponse.RESPONSE.Output.xStatus.severity', findTestData('Z-Connect Test Data/Get Address Profile_TestData').getValue(5, i))
	
	WS.verifyElementPropertyValue(response, 'getAddressProfileServiceOperationResponse.RESPONSE.Output.companyNbr', findTestData('Z-Connect Test Data/Get Address Profile_TestData').getValue(6, i))
	
	WS.verifyElementPropertyValue(response, 'getAddressProfileServiceOperationResponse.RESPONSE.Output.postalCd', findTestData('Z-Connect Test Data/Get Address Profile_TestData').getValue(7, i))
	
	WS.verifyElementPropertyValue(response, 'getAddressProfileServiceOperationResponse.RESPONSE.Output.addressLine1', findTestData('Z-Connect Test Data/Get Address Profile_TestData').getValue(8, i))
	
	WS.verifyElementPropertyValue(response, 'getAddressProfileServiceOperationResponse.RESPONSE.Output.addressTie', findTestData('Z-Connect Test Data/Get Address Profile_TestData').getValue(9, i))
	
	WS.verifyElementPropertyValue(response, 'getAddressProfileServiceOperationResponse.RESPONSE.Output.addressLine2', findTestData('Z-Connect Test Data/Get Address Profile_TestData').getValue(11, i))
	
	WS.verifyElementPropertyValue(response, 'getAddressProfileServiceOperationResponse.RESPONSE.Output.householdNbr', findTestData('Z-Connect Test Data/Get Address Profile_TestData').getValue(12, i))
	
	WS.verifyElementPropertyValue(response, 'getAddressProfileServiceOperationResponse.RESPONSE.Output.addressLine3', findTestData('Z-Connect Test Data/Get Address Profile_TestData').getValue(13, i))
	
	WS.verifyElementPropertyValue(response, 'getAddressProfileServiceOperationResponse.RESPONSE.Output.addressBranch', findTestData('Z-Connect Test Data/Get Address Profile_TestData').getValue(14, i))
	
	WS.verifyElementPropertyValue(response, 'getAddressProfileServiceOperationResponse.RESPONSE.Output.city', findTestData('Z-Connect Test Data/Get Address Profile_TestData').getValue(16, i))
	
	WS.verifyElementPropertyValue(response, 'getAddressProfileServiceOperationResponse.RESPONSE.Output.state', findTestData('Z-Connect Test Data/Get Address Profile_TestData').getValue(17, i))
	
	WS.verifyElementPropertyValue(response, 'getAddressProfileServiceOperationResponse.RESPONSE.Output.country', findTestData('Z-Connect Test Data/Get Address Profile_TestData').getValue(18, i))
	
	WS.verifyElementPropertyValue(response, 'getAddressProfileServiceOperationResponse.RESPONSE.Output.effectiveDt', findTestData('Z-Connect Test Data/Get Address Profile_TestData').getValue(19, i))
	
	WS.verifyElementPropertyValue(response, 'getAddressProfileServiceOperationResponse.RESPONSE.Output.thruDt', findTestData('Z-Connect Test Data/Get Address Profile_TestData').getValue(20, i))
	
	WS.verifyElementPropertyValue(response, 'getAddressProfileServiceOperationResponse.RESPONSE.Output.lastMaintDt', findTestData('Z-Connect Test Data/Get Address Profile_TestData').getValue(21, i))
	
	WS.verifyElementPropertyValue(response, 'getAddressProfileServiceOperationResponse.RESPONSE.Output.custOffset', findTestData('Z-Connect Test Data/Get Address Profile_TestData').getValue(22, i))
	
	WS.verifyElementPropertyValue(response, 'getAddressProfileServiceOperationResponse.RESPONSE.Output.custLimit', findTestData('Z-Connect Test Data/Get Address Profile_TestData').getValue(23, i))
	
	WS.verifyElementPropertyValue(response, 'getAddressProfileServiceOperationResponse.RESPONSE.Output.addressCustomerInfo[0].custCompanyNbr', findTestData('Z-Connect Test Data/Get Address Profile_TestData').getValue(24, i))
	
	WS.verifyElementPropertyValue(response, 'getAddressProfileServiceOperationResponse.RESPONSE.Output.addressCustomerInfo[0].custName', findTestData('Z-Connect Test Data/Get Address Profile_TestData').getValue(25, i))
	
	WS.verifyElementPropertyValue(response, 'getAddressProfileServiceOperationResponse.RESPONSE.Output.addressCustomerInfo[0].custUseCd', findTestData('Z-Connect Test Data/Get Address Profile_TestData').getValue(26, i))
	
	WS.verifyElementPropertyValue(response, 'getAddressProfileServiceOperationResponse.RESPONSE.Output.addressCustomerInfo[0].custSeq', findTestData('Z-Connect Test Data/Get Address Profile_TestData').getValue(27, i))
	
	WS.verifyElementPropertyValue(response, 'getAddressProfileServiceOperationResponse.RESPONSE.Output.addressCustomerInfo[0].custTemp', findTestData('Z-Connect Test Data/Get Address Profile_TestData').getValue(28, i))
	
	WS.verifyElementPropertyValue(response, 'getAddressProfileServiceOperationResponse.RESPONSE.Output.addressCustomerInfo[0].custEffectiveDt', findTestData('Z-Connect Test Data/Get Address Profile_TestData').getValue(29, i))
	
	WS.verifyElementPropertyValue(response, 'getAddressProfileServiceOperationResponse.RESPONSE.Output.addressCustomerInfo[0].custExpiryDt', findTestData('Z-Connect Test Data/Get Address Profile_TestData').getValue(30, i))
	
	
}