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

String str = 'createRestraintStopPayServiceOperationResponse.RESPONSE.Output.xStatus.'

testdatapath = findTestData('Z-Connect Test Data/Create Restraint Stop Pay')

for (int i = 1; i <= 4; i++) {
    println('Row nuber si :-' + i)

    response = WS.sendRequest(findTestObject('Create Restraint Stop Pay/Create Restraint Stop Pay Post Request Verify Response with valid Values', 
            [('rStpKeyCompanyNbr') : testdatapath.getValue(2, i), ('rStpKeyProductCode') : testdatapath.getValue(3, i), ('rStpKeyAccountNbr') : testdatapath.getValue(
                    4, i), ('rStpKeyType') : testdatapath.getValue(5, i), ('StpVarKeyCheckNbrBegin') : testdatapath.getValue(
                    6, i), ('rStpVarKeyCheckNbrEnd') : testdatapath.getValue(7, i), ('rStpVarKeyAmountBegin') : testdatapath.getValue(
                    8, i), ('rStpVarKeyAmountEnd') : testdatapath.getValue(9, i), ('rStpVarKeyExpireDt') : testdatapath.getValue(
                    10, i), ('rStpCheckDt') : testdatapath.getValue(11, i), ('rStpChargeCd') : testdatapath.getValue(12, 
                    i), ('rStpOvrdChgAmt') : testdatapath.getValue(13, i), ('rStpLastCheckReturnedDt') : testdatapath.getValue(
                    14, i), ('rStpPayee') : testdatapath.getValue(15, i), ('rStpHitCount') : testdatapath.getValue(16, i)
                , ('rStpCksOutNbr') : testdatapath.getValue(17, i), ('rStpComment1') : testdatapath.getValue(18, i), ('rStpComment2') : testdatapath.getValue(
                    19, i), ('rStpReason1') : testdatapath.getValue(20, i), ('rStpReason2') : testdatapath.getValue(21, 
                    i), ('rStpTermCd') : testdatapath.getValue(22, i), ('rStpTerm') : testdatapath.getValue(23, i), ('rStpRenewNbr') : testdatapath.getValue(
                    24, i), ('rStpChannel') : testdatapath.getValue(25, i)]))

    WS.verifyResponseStatusCode(response, 200)

    WS.verifyElementPropertyValue(response, str + 'applicationCd', testdatapath.getValue(27, i))

    WS.verifyElementPropertyValue(response, str + 'statusCd', testdatapath.getValue(28, i))

    WS.verifyElementPropertyValue(response, str + 'statusMessage', testdatapath.getValue(29, i))

    WS.verifyElementPropertyValue(response, str + 'severity', testdatapath.getValue(30, i))
}





