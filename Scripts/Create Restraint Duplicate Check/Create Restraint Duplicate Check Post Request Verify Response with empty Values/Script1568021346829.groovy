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

for (int i = 6; i < 7; i++) {
    println('Row number is :- ' + i)

    response = WS.sendRequest(findTestObject('Create Restraint Duplicate Check/Create Restraint Duplicate Check Post Request Verify Response with empty Values', 
            [('rDupKeyCompanyNbr') : findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(
                    2, i), ('rDupKeyProductCode') : findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(
                    3, i), ('rDupKeyAccountNbr') : findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(
                    4, i), ('rDupVarKeyLowCheckNbr') : findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(
                    5, i), ('rDupVarKeyHighCheckNbr') : findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(
                    6, i), ('rDupVarKeyExpireDt') : findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(
                    7, i), ('rDupStatus') : findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(
                    8, i), ('rDupDuplicateCd') : findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(
                    9, i), ('rDupCheckDate') : findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(
                    10, i), ('rDupOutstandingNbr') : findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(
                    11, i), ('rDupChecksPaidNbr') : findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(
                    12, i), ('rDupComment1') : findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(
                    13, i), ('rDupComment2') : findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(
                    14, i), ('rDupReason1') : findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(
                    15, i), ('rDupReason2') : findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(
                    16, i), ('rDupChkTermCd') : findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(
                    17, i), ('rDupTerm') : findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(
                    18, i), ('rDupRenewNbr') : findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(
                    19, i), ('rDupChannel') : findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(
                    20, i)]))

    WS.verifyResponseStatusCode(response, 200)

    WS.verifyElementPropertyValue(response, 'createRestraintDuplicateCheckServiceOperationResponse.RESPONSE.Output.xStatus.applicationCd', 
        findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(22, i))

    WS.verifyElementPropertyValue(response, 'createRestraintDuplicateCheckServiceOperationResponse.RESPONSE.Output.xStatus.statusCd', 
        findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(23, i))

    WS.verifyElementPropertyValue(response, 'createRestraintDuplicateCheckServiceOperationResponse.RESPONSE.Output.xStatus.statusMessage', 
        findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(24, i))

    WS.verifyElementPropertyValue(response, 'createRestraintDuplicateCheckServiceOperationResponse.RESPONSE.Output.xStatus.severity', 
        findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData').getValue(25, i))
}

