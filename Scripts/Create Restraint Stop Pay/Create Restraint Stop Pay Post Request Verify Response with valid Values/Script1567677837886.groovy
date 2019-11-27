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

for (int i = 1; i <= 4; i++) {
	
    println('Row nuber si :-' + i)

    response = WS.sendRequest(findTestObject('Create Restraint Stop Pay/Create Restraint Stop Pay Post Request Verify Response with valid Values', 
            [('rStpKeyCompanyNbr') : findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(2, i), ('rStpKeyProductCode') : findTestData(
                    'Z-Connect Test Data/Create Restraint Stop Pay').getValue(3, i), ('rStpKeyAccountNbr') : findTestData(
                    'Z-Connect Test Data/Create Restraint Stop Pay').getValue(4, i), ('rStpKeyType') : findTestData(
                    'Z-Connect Test Data/Create Restraint Stop Pay').getValue(5, i), ('StpVarKeyCheckNbrBegin') : findTestData(
                    'Z-Connect Test Data/Create Restraint Stop Pay').getValue(6, i), ('rStpVarKeyCheckNbrEnd') : findTestData(
                    'Z-Connect Test Data/Create Restraint Stop Pay').getValue(7, i), ('rStpVarKeyAmountBegin') : findTestData(
                    'Z-Connect Test Data/Create Restraint Stop Pay').getValue(8, i), ('rStpVarKeyAmountEnd') : findTestData(
                    'Z-Connect Test Data/Create Restraint Stop Pay').getValue(9, i), ('rStpVarKeyExpireDt') : findTestData(
                    'Z-Connect Test Data/Create Restraint Stop Pay').getValue(10, i), ('rStpCheckDt') : findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(
                    11, i), ('rStpChargeCd') : findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(12, 
                    i), ('rStpOvrdChgAmt') : findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(13, 
                    i), ('rStpLastCheckReturnedDt') : findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(
                    14, i), ('rStpPayee') : findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(15, i)
                , ('rStpHitCount') : findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(16, i), ('rStpCksOutNbr') : findTestData(
                    'Z-Connect Test Data/Create Restraint Stop Pay').getValue(17, i), ('rStpComment1') : findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(
                    18, i), ('rStpComment2') : findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(19, 
                    i), ('rStpReason1') : findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(20, i), ('rStpReason2') : findTestData(
                    'Z-Connect Test Data/Create Restraint Stop Pay').getValue(21, i), ('rStpTermCd') : findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(
                    22, i), ('rStpTerm') : findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(23, i)
                , ('rStpRenewNbr') : findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(24, i)
                , ('rStpChannel') : findTestData('Z-Connect Test Data/Create Restraint Stop Pay').getValue(25, i)]))

    WS.verifyResponseStatusCode(response, 200)

    WS.verifyElementPropertyValue(response, 'createRestraintStopPayServiceOperationResponse.RESPONSE.Output.xStatus.applicationCd', 
        applicationCd)

    WS.verifyElementPropertyValue(response, 'createRestraintStopPayServiceOperationResponse.RESPONSE.Output.xStatus.statusCd', 
        statusCd)

    WS.verifyElementPropertyValue(response, 'createRestraintStopPayServiceOperationResponse.RESPONSE.Output.xStatus.statusMessage', 
        statusMessage)

    WS.verifyElementPropertyValue(response, 'createRestraintStopPayServiceOperationResponse.RESPONSE.Output.xStatus.severity', 
        severity)
}

