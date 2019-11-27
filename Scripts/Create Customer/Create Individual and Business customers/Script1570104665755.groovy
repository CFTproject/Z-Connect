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
    println('EXCEL SHEET ROW NUMBER IS : -' + i)

    if (i == 1 || i==2) {
        response = WS.sendRequest(findTestObject('Create Customer/Create Individual and Business customers', [('customerCompanyNbr') : findTestData(
                        'Z-Connect Test Data/Create Customer_TestData').getValue(2, i), ('customerNameLine1') : findTestData(
                        'Z-Connect Test Data/Create Customer_TestData').getValue(3, i), ('customerNameLine2') : findTestData(
                        'Z-Connect Test Data/Create Customer_TestData').getValue(4, i), ('individualBusinessInd') : findTestData(
                        'Z-Connect Test Data/Create Customer_TestData').getValue(5, i), ('tie') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        6, i), ('taxPayerNbr') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(7, 
                        i), ('taxPayerCd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(8, i)
                    , ('taxPayerSuffixCd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(9, i)
                    , ('homePhoneNbr') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(10, i), ('businessPhoneNbr') : findTestData(
                        'Z-Connect Test Data/Create Customer_TestData').getValue(11, i), ('contactPhoneNbr') : findTestData(
                        'Z-Connect Test Data/Create Customer_TestData').getValue(12, i), ('contactName') : findTestData(
                        'Z-Connect Test Data/Create Customer_TestData').getValue(13, i), ('contactTitle') : findTestData(
                        'Z-Connect Test Data/Create Customer_TestData').getValue(14, i), ('birthDt') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        15, i), ('establishedDt') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        16, i), ('bankruptcyDt') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        17, i), ('genderCd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(18, 
                        i), ('maritalStatusCd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        19, i), ('customerLanguageCd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        20, i), ('nationalityCd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        21, i), ('communicationMethodCd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        22, i), ('solicitationCd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        23, i), ('occupationCd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        24, i), ('naicsCd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(25, 
                        i), ('employerName') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(26, 
                        i), ('customerSegmentCd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        27, i), ('factActInd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(28, 
                        i), ('customerOpenDt') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(29, 
                        i), ('customerStatusCd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        30, i), ('customerTypeCd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        31, i), ('employeeInd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        32, i), ('customerCostCenterNbr') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        33, i), ('customerBranchNbr') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        34, i), ('customerOfficer1Cd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        35, i), ('customerOfficer2Cd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        36, i), ('customerWithholdCd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        37, i), ('sensitivityCd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(
                        38, i), ('fatcaId') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(39, 
                        i), ('sicCd') : findTestData('Z-Connect Test Data/Create Customer_TestData').getValue(40, i), ('emailAddress') : findTestData(
                        'Z-Connect Test Data/Create Customer_TestData').getValue(41, i), ('customerAddressLine1') : findTestData(
                        'Z-Connect Test Data/Create Customer_TestData').getValue(42, i), ('customerAddressLine2') : findTestData(
                        'Z-Connect Test Data/Create Customer_TestData').getValue(43, i), ('customerAddressLine3') : findTestData(
                        'Z-Connect Test Data/Create Customer_TestData').getValue(44, i), ('useZipTable') : findTestData(
                        'Z-Connect Test Data/Create Customer_TestData').getValue(45, i), ('customerCity') : findTestData(
                        'Z-Connect Test Data/Create Customer_TestData').getValue(46, i), ('customerState') : findTestData(
                        'Z-Connect Test Data/Create Customer_TestData').getValue(47, i), ('customerPostalCd') : findTestData(
                        'Z-Connect Test Data/Create Customer_TestData').getValue(48, i), ('customerCountryCd') : findTestData(
                        'Z-Connect Test Data/Create Customer_TestData').getValue(49, i), ('customerAddressTie') : findTestData(
                        'Z-Connect Test Data/Create Customer_TestData').getValue(50, i), ('addressUseCd') : findTestData(
                        'Z-Connect Test Data/Create Customer_TestData').getValue(51, i), ('sequenceWithinUseCd') : findTestData(
                        'Z-Connect Test Data/Create Customer_TestData').getValue(52, i), ('addressEffectiveDt') : findTestData(
                        'Z-Connect Test Data/Create Customer_TestData').getValue(53, i), ('addressExpiryDt') : findTestData(
                        'Z-Connect Test Data/Create Customer_TestData').getValue(54, i)]))
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

