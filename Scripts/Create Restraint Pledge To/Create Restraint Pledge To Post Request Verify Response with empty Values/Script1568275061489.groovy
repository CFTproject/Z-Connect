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

for (int i = 15; i < 16; i++) {
	
    println('Row number is :- ' + i)

    response = WS.sendRequest(findTestObject('Create Restraint Pledge To/Create Restraint Pledge To Post Request Verify Response with empty Values', 
            [('rPldgKeyCompanyNbr') : findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(2, 
                    i), ('rPldgKeyProductCode') : findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(
                    3, i), ('rPldgKeyAccountNbr') : findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(
                    4, i), ('rPldgKeyType') : findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(
                    5, i), ('rPldgVarKeyExpireDt') : findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(
                    6, i), ('rPldgVarKeyMrchAuth') : findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(
                    7, i), ('rPldgToProdCd') : findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(
                    8, i), ('rPldgToAcctNbr') : findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(
                    9, i), ('rPldgReviewFreq') : findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(
                    10, i), ('rPldgLastReviewDt') : findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(
                    11, i), ('rPldgOriginalPldgAmt') : findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(
                    12, i), ('rPldgCurrentPldgAmt') : findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(
                    13, i), ('rPldgComment1') : findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(
                    14, i), ('rPldgComment2') : findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(
                    15, i), ('rPldgReason1') : findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(
                    16, i), ('rPldgReason2') : findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(
                    17, i), ('rPldgMerchantCode') : findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(
                    18, i)]))

    WS.verifyResponseStatusCode(response, 200)

    WS.verifyElementPropertyValue(response, 'createRestraintPledgeToServiceOperationResponse.RESPONSE.Output.xStatus.applicationCd', 
        findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(20, i))

    WS.verifyElementPropertyValue(response, 'createRestraintPledgeToServiceOperationResponse.RESPONSE.Output.xStatus.statusCd', 
        findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(21, i))

    WS.verifyElementPropertyValue(response, 'createRestraintPledgeToServiceOperationResponse.RESPONSE.Output.xStatus.statusMessage', 
        findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(22, i))

    WS.verifyElementPropertyValue(response, 'createRestraintPledgeToServiceOperationResponse.RESPONSE.Output.xStatus.severity', 
        findTestData('Z-Connect Test Data/Create Restraint Pledge To_TestData').getValue(23, i))
}

