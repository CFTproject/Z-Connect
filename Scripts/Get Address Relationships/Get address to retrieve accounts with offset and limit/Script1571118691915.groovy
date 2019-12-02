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

String str = 'getAddressRelationshipsServiceOperationResponse.RESPONSE.Output.'

testdatapath = findTestData('Z-Connect Test Data/Get Address Relationships_TestData')

for (int i = 7; i < 8; i++) {
    response = WS.sendRequest(findTestObject('Get Address Relationships/Get address to retrieve accounts with offset and limit'))

    WS.verifyResponseStatusCode(response, 200)

    println('EXCEL SHEET ROW NUMBER IS :' + i)

    WS.verifyElementPropertyValue(response, str + 'xStatus.applicationCd', testdatapath.getValue(2, i))

    WS.verifyElementPropertyValue(response, str + 'xStatus.statusCd', testdatapath.getValue(3, i))

    WS.verifyElementPropertyValue(response, str + 'xStatus.statusmessage', testdatapath.getValue(4, i))

    WS.verifyElementPropertyValue(response, str + 'xStatus.severity', testdatapath.getValue(5, i))

    WS.verifyElementPropertyValue(response, str + 'companyNbr', testdatapath.getValue(6, i))

    WS.verifyElementPropertyValue(response, str + 'addressLine1', testdatapath.getValue(7, i))

    WS.verifyElementPropertyValue(response, str + 'addressLine2', testdatapath.getValue(8, i))

    WS.verifyElementPropertyValue(response, str + 'addressLine3', testdatapath.getValue(9, i))

    WS.verifyElementPropertyValue(response, str + 'city', testdatapath.getValue(10, i))

    WS.verifyElementPropertyValue(response, str + 'state', testdatapath.getValue(11, i))

    WS.verifyElementPropertyValue(response, str + 'postalCd', testdatapath.getValue(12, i))

    WS.verifyElementPropertyValue(response, str + 'country', testdatapath.getValue(13, i))

    WS.verifyElementPropertyValue(response, str + 'addressTie', testdatapath.getValue(14, i))

    WS.verifyElementPropertyValue(response, str + 'householdNumber', testdatapath.getValue(15, i))

    WS.verifyElementPropertyValue(response, str + 'offsetCustomer', testdatapath.getValue(16, i))

    WS.verifyElementPropertyValue(response, str + 'limitCustomer', testdatapath.getValue(17, i))

    WS.verifyElementPropertyValue(response, str + 'addressCustomerInfo[0].companyNbr', testdatapath.getValue(18, i /* WS.verifyElementPropertyValue(response, 'getAddressRelationshipsServiceOperationResponse.RESPONSE.Output.addressCustomerInfo[0].customerNameLine1', 
        findTestData('Z-Connect Test Data/Get Address Relationships_TestData').getValue(19, i))

    WS.verifyElementPropertyValue(response, 'getAddressRelationshipsServiceOperationResponse.RESPONSE.Output.addressCustomerInfo[0].addressUseCd', 
        findTestData('Z-Connect Test Data/Get Address Relationships_TestData').getValue(20, i))

    WS.verifyElementPropertyValue(response, 'getAddressRelationshipsServiceOperationResponse.RESPONSE.Output.addressCustomerInfo[0].sequenceWithinUseCd', 
        findTestData('Z-Connect Test Data/Get Address Relationships_TestData').getValue(21, i))

    WS.verifyElementPropertyValue(response, 'getAddressRelationshipsServiceOperationResponse.RESPONSE.Output.addressCustomerInfo[0].addressEffectiveDt', 
        findTestData('Z-Connect Test Data/Get Address Relationships_TestData').getValue(22, i))

    WS.verifyElementPropertyValue(response, 'getAddressRelationshipsServiceOperationResponse.RESPONSE.Output.addressCustomerInfo[0].addressExpiryDt', 
        findTestData('Z-Connect Test Data/Get Address Relationships_TestData').getValue(23, i))

    WS.verifyElementPropertyValue(response, 'getAddressRelationshipsServiceOperationResponse.RESPONSE.Output.addressCustomerInfo[0].addressTempIndicator', 
        findTestData('Z-Connect Test Data/Get Address Relationships_TestData').getValue(24, i))*/ ))
}