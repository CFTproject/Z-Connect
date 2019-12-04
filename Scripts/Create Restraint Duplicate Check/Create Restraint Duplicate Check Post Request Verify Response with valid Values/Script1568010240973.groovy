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

String str = 'createRestraintDuplicateCheckServiceOperationResponse.RESPONSE.Output.xStatus.'

testdatapath = findTestData('Z-Connect Test Data/Create Restraint Duplicate Check_TestData')

for (int i = 1; i <= 2; i++) {
    println('Row number is :- ' + i)

    response = WS.sendRequest(findTestObject('Create Restraint Duplicate Check/Create Restraint Duplicate Check Post Request Verify Response with valid Values', 
            [('rDupKeyCompanyNbr') : testdatapath.getValue(2, i), ('rDupKeyProductCode') : testdatapath.getValue(3, i), ('rDupKeyAccountNbr') : testdatapath.getValue(
                    4, i), ('rDupVarKeyLowCheckNbr') : testdatapath.getValue(5, i), ('rDupVarKeyHighCheckNbr') : testdatapath.getValue(
                    6, i), ('rDupVarKeyExpireDt') : testdatapath.getValue(7, i), ('rDupStatus') : testdatapath.getValue(
                    8, i), ('rDupDuplicateCd') : testdatapath.getValue(9, i), ('rDupCheckDate') : testdatapath.getValue(
                    10, i), ('rDupOutstandingNbr') : testdatapath.getValue(11, i), ('rDupChecksPaidNbr') : testdatapath.getValue(
                    12, i), ('rDupComment1') : testdatapath.getValue(13, i), ('rDupComment2') : testdatapath.getValue(14, 
                    i), ('rDupReason1') : testdatapath.getValue(15, i), ('rDupReason2') : testdatapath.getValue(16, i), ('rDupChkTermCd') : testdatapath.getValue(
                    17, i), ('rDupTerm') : testdatapath.getValue(18, i), ('rDupRenewNbr') : testdatapath.getValue(19, i)
                , ('rDupChannel') : testdatapath.getValue(20, i)]))

    WS.verifyResponseStatusCode(response, 200)

    WS.verifyElementPropertyValue(response, str + 'applicationCd', testdatapath.getValue(22, i))

    WS.verifyElementPropertyValue(response, str + 'statusCd', testdatapath.getValue(23, i))

    WS.verifyElementPropertyValue(response, str + 'statusMessage', testdatapath.getValue(24, i))

    WS.verifyElementPropertyValue(response, str + 'severity', testdatapath.getValue(25, i))
}