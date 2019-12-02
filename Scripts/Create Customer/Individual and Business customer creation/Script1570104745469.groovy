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

String str = 'createCustomerServiceOperationResponse.RESPONSE.Output.xStatus.'

testdatapath = findTestData('Z-Connect Test Data/Create Customer_TestData')

for (int i = 3; i < 5; i++) {
    if ((i == 3) || (i == 4)) {
        println('EXCEL SHEET ROW NUMBER IS :- ' + i)

        response = WS.sendRequest(findTestObject('Create Customer/Individual and Business customer creation', [('customerCompanyNbr') : testdatapath.getValue(
                        2, i), ('customerNameLine1') : testdatapath.getValue(3, i), ('customerNameLine2') : testdatapath.getValue(
                        4, i), ('individualBusinessInd') : testdatapath.getValue(5, i), ('homePhoneNbr') : testdatapath.getValue(
                        10, i), ('businessPhoneNbr') : testdatapath.getValue(11, i), ('contactPhoneNbr') : testdatapath.getValue(
                        12, i), ('contactName') : testdatapath.getValue(13, i), ('birthDt') : testdatapath.getValue(15, 
                        i), ('genderCd') : testdatapath.getValue(18, i), ('maritalStatusCd') : testdatapath.getValue(19, 
                        i), ('occupationCd') : testdatapath.getValue(24, i), ('employerName') : testdatapath.getValue(26, 
                        i), ('customerTypeCd') : testdatapath.getValue(31, i), ('customerOfficer1Cd') : testdatapath.getValue(
                        35, i), ('customerOfficer2Cd') : testdatapath.getValue(36, i), ('emailAddress') : testdatapath.getValue(
                        41, i), ('customerAddressLine1') : testdatapath.getValue(42, i), ('customerAddressLine2') : testdatapath.getValue(
                        43, i), ('customerAddressLine3') : testdatapath.getValue(44, i), ('useZipTable') : testdatapath.getValue(
                        45, i), ('customerCity') : testdatapath.getValue(46, i), ('customerState') : testdatapath.getValue(
                        47, i), ('customerPostalCd') : testdatapath.getValue(48, i), ('customerCountryCd') : testdatapath.getValue(
                        49, i), ('customerAddressTie') : testdatapath.getValue(50, i), ('addressUseCd') : testdatapath.getValue(
                        51, i), ('sequenceWithinUseCd') : testdatapath.getValue(52, i), ('addressEffectiveDt') : testdatapath.getValue(
                        53, i), ('addressExpiryDt') : testdatapath.getValue(54, i), ('bankRelationshipCd') : testdatapath.getValue(
                        55, i), ('bankRelationshipCd') : testdatapath.getValue(56, i), ('bankServiceCd') : testdatapath.getValue(
                        57, i), ('bankServiceCd') : testdatapath.getValue(58, i), ('remarkTypeCd') : testdatapath.getValue(
                        59, i), ('remarkStartDt') : testdatapath.getValue(60, i), ('remarkEndDt') : testdatapath.getValue(
                        61, i), ('remarkData') : testdatapath.getValue(62, i), ('identTypeCd') : testdatapath.getValue(63, 
                        i), ('identDesc') : testdatapath.getValue(64, i), ('identIssue') : testdatapath.getValue(65, i), ('identEffDt') : testdatapath.getValue(
                        66, i), ('identExpDt') : testdatapath.getValue(67, i)]))

        WS.verifyResponseStatusCode(response, 200)

        WS.verifyElementPropertyValue(response, str + 'applicationCd', testdatapath.getValue(69, i))

        WS.verifyElementPropertyValue(response, str + 'statusCd', testdatapath.getValue(70, i))

        WS.verifyElementPropertyValue(response, str + 'statusMessage', testdatapath.getValue(71, i))

        WS.verifyElementPropertyValue(response, str + 'severity', testdatapath.getValue(72, i))
    }
}