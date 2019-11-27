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

response = WS.sendRequest(findTestObject('Get Address Relationships/Get address with date filtering Use date range when no account or customer available for address'))

WS.verifyResponseStatusCode(response, 200)

for (int i = 6; i < 7; i++) {
	
	println ('EXCEL SHEET ROW NUMBER IS :'+i)
    WS.verifyElementPropertyValue(response, 'getAddressRelationshipsServiceOperationResponse.RESPONSE.Output.xStatus.applicationCd', 
        findTestData('Z-Connect Test Data/Get Address Relationships_TestData').getValue(2, i))

    WS.verifyElementPropertyValue(response, 'getAddressRelationshipsServiceOperationResponse.RESPONSE.Output.xStatus.statusCd', 
        findTestData('Z-Connect Test Data/Get Address Relationships_TestData').getValue(3, i))

    WS.verifyElementPropertyValue(response, 'getAddressRelationshipsServiceOperationResponse.RESPONSE.Output.xStatus.statusmessage', 
        findTestData('Z-Connect Test Data/Get Address Relationships_TestData').getValue(4, i))

    WS.verifyElementPropertyValue(response, 'getAddressRelationshipsServiceOperationResponse.RESPONSE.Output.xStatus.severity', 
        findTestData('Z-Connect Test Data/Get Address Relationships_TestData').getValue(5, i))

    WS.verifyElementPropertyValue(response, 'getAddressRelationshipsServiceOperationResponse.RESPONSE.Output.companyNbr', 
        findTestData('Z-Connect Test Data/Get Address Relationships_TestData').getValue(6, i))

    WS.verifyElementPropertyValue(response, 'getAddressRelationshipsServiceOperationResponse.RESPONSE.Output.addressLine1', 
        findTestData('Z-Connect Test Data/Get Address Relationships_TestData').getValue(7, i))

    WS.verifyElementPropertyValue(response, 'getAddressRelationshipsServiceOperationResponse.RESPONSE.Output.addressLine2', 
        findTestData('Z-Connect Test Data/Get Address Relationships_TestData').getValue(8, i))

    WS.verifyElementPropertyValue(response, 'getAddressRelationshipsServiceOperationResponse.RESPONSE.Output.addressLine3', 
        findTestData('Z-Connect Test Data/Get Address Relationships_TestData').getValue(9, i))

    WS.verifyElementPropertyValue(response, 'getAddressRelationshipsServiceOperationResponse.RESPONSE.Output.city', findTestData(
            'Z-Connect Test Data/Get Address Relationships_TestData').getValue(10, i))

    WS.verifyElementPropertyValue(response, 'getAddressRelationshipsServiceOperationResponse.RESPONSE.Output.state', findTestData(
            'Z-Connect Test Data/Get Address Relationships_TestData').getValue(11, i))

    WS.verifyElementPropertyValue(response, 'getAddressRelationshipsServiceOperationResponse.RESPONSE.Output.postalCd', 
        findTestData('Z-Connect Test Data/Get Address Relationships_TestData').getValue(12, i))

    WS.verifyElementPropertyValue(response, 'getAddressRelationshipsServiceOperationResponse.RESPONSE.Output.country', findTestData(
            'Z-Connect Test Data/Get Address Relationships_TestData').getValue(13, i))

    WS.verifyElementPropertyValue(response, 'getAddressRelationshipsServiceOperationResponse.RESPONSE.Output.addressTie', 
        findTestData('Z-Connect Test Data/Get Address Relationships_TestData').getValue(14, i))

    WS.verifyElementPropertyValue(response, 'getAddressRelationshipsServiceOperationResponse.RESPONSE.Output.householdNumber', 
        findTestData('Z-Connect Test Data/Get Address Relationships_TestData').getValue(15, i))

    WS.verifyElementPropertyValue(response, 'getAddressRelationshipsServiceOperationResponse.RESPONSE.Output.offsetCustomer', 
        findTestData('Z-Connect Test Data/Get Address Relationships_TestData').getValue(16, i))

    WS.verifyElementPropertyValue(response, 'getAddressRelationshipsServiceOperationResponse.RESPONSE.Output.limitCustomer', 
        findTestData('Z-Connect Test Data/Get Address Relationships_TestData').getValue(17, i))

    WS.verifyElementPropertyValue(response, 'getAddressRelationshipsServiceOperationResponse.RESPONSE.Output.addressCustomerInfo[0].companyNbr', 
        findTestData('Z-Connect Test Data/Get Address Relationships_TestData').getValue(18, i))

    WS.verifyElementPropertyValue(response, 'getAddressRelationshipsServiceOperationResponse.RESPONSE.Output.addressCustomerInfo[0].sequenceWithinUseCd', 
        findTestData('Z-Connect Test Data/Get Address Relationships_TestData').getValue(21, i))

    WS.verifyElementPropertyValue(response, 'getAddressRelationshipsServiceOperationResponse.RESPONSE.Output.addressCustomerInfo[0].customerTie', 
        findTestData('Z-Connect Test Data/Get Address Relationships_TestData').getValue(25, i))
}