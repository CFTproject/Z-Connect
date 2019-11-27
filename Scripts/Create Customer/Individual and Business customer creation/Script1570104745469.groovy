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

for (int i = 3; i < 5; i++) {
   
    if ((i == 3 || i==4)) {
		
		println ('EXCEL SHEET ROW NUMBER IS :- '+ i)
        response = WS.sendRequest(findTestObject('Create Customer/Individual and Business customer creation', [('customerCompanyNbr') : findTestData(
                        'Z-Connect Test Data/Create Customer_TestData').getValue(2, i), ('customerNameLine1') : findTestData(
                        'Z-Connect Test Data/Create Customer_TestData').getValue(3, i), ('customerNameLine2') : findTestData(
                        'Z-Connect Test Data/Create Customer_TestData').getValue(4, i), ('individualBusinessInd') : findTestData(
                        'Z-Connect Test Data/Create Customer_TestData').getValue(5, i), ('homePhoneNbr') : findTestData(
                        'Z-Connect Test Data/Create Customer_TestData').getValue(10, i), ('businessPhoneNbr') : findTestData(
                        'Z-Connect Test Data/Create Customer_TestData').getValue(11, i), ('contactPhoneNbr') : findTestData(
                        'Z-Connect Test Data/Create Customer_TestData').getValue(12, i), ('contactName') : findTestData(
                        'Z-Connect Test Data/Create Customer_TestData').getValue(13, i), ('birthDt') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        15, i), ('genderCd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(18, 
                        i), ('maritalStatusCd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        19, i), ('occupationCd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        24, i), ('employerName') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        26, i), ('customerTypeCd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        31, i), ('customerOfficer1Cd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        35, i), ('customerOfficer2Cd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        36, i), ('emailAddress') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        41, i), ('customerAddressLine1') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        42, i), ('customerAddressLine2') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        43, i), ('customerAddressLine3') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        44, i), ('useZipTable') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        45, i), ('customerCity') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        46, i), ('customerState') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        47, i), ('customerPostalCd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        48, i), ('customerCountryCd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        49, i), ('customerAddressTie') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        50, i), ('addressUseCd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        51, i), ('sequenceWithinUseCd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        52, i), ('addressEffectiveDt') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        53, i), ('addressExpiryDt') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        54, i), ('bankRelationshipCd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        55, i),('bankRelationshipCd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        56, i),('bankServiceCd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        57, i),('bankServiceCd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        58, i),('remarkTypeCd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        59, i),('remarkStartDt') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        60, i),('remarkEndDt') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        61, i),('remarkData') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        62, i),('identTypeCd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        63, i),('identDesc') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        64, i),('identIssue') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        65, i),('identEffDt') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        66, i),('identExpDt') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        67, i)]))
    }
    
    WS.verifyResponseStatusCode(response, 200)

    WS.verifyElementPropertyValue(response, 'createCustomerServiceOperationResponse.RESPONSE.Output.xStatus.applicationCd', 
        findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(69, i))

    WS.verifyElementPropertyValue(response, 'createCustomerServiceOperationResponse.RESPONSE.Output.xStatus.statusCd', findTestData(
            'Z-Connect Test Data/Create Customer_TestData').getValue(70, i))

    WS.verifyElementPropertyValue(response, 'createCustomerServiceOperationResponse.RESPONSE.Output.xStatus.statusMessage', 
        findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(71, i))

    WS.verifyElementPropertyValue(response, 'createCustomerServiceOperationResponse.RESPONSE.Output.xStatus.severity', findTestData(
            'Z-Connect Test Data/Create Customer_TestData').getValue(72, i))
}