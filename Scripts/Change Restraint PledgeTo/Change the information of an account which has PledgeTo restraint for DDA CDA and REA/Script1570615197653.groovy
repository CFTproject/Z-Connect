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

for (int i = 1; i < 4; i++) {
    println('EXCEL SHEET ROW NUMBER IS : ' + i)

    //Change the information of an account which has PledgeTo restraint for DDA
    if (i == 1) {
        response = WS.sendRequest(findTestObject('Change Restraint PledgeTo/Change the information of an account which has PledgeTo restraint for DDA', 
                [('restraintPldgKeyCompanyNbr') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        2, i), ('restraintPldgKeyProductCode') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        3, i), ('restraintPldgKeyAccountNbr') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        4, i), ('restraintPldgKeyType') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        5, i), ('restraintPldgVarKeyExpireDt') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        6, i), ('restraintPldgVarKeyPlacedDt') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        7, i), ('restraintPldgVarKeySequenceNbr') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        8, i), ('restraintPldgToProductCode') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        9, i), ('restraintPldgToAccountNbr') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        10, i), ('restraintPldgReviewFreq') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        11, i), ('restraintPldgLastReviewDt') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        12, i), ('restraintPldgCurrentPldgAmt') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        13, i), ('restraintPldgComment1') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        14, i), ('restraintPldgComment2') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        15, i), ('restraintPldgReason1') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        16, i), ('restraintPldgReason2') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        17, i)]))
    }
    
    //Change the information of an account which has PledgeTo restraint for REA
    if (i == 2) {
        response = WS.sendRequest(findTestObject('Change Restraint PledgeTo/Change the information of an account which has PledgeTo restraint for REA', 
                [('restraintPldgKeyCompanyNbr') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        2, i), ('restraintPldgKeyProductCode') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        3, i), ('restraintPldgKeyAccountNbr') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        4, i), ('restraintPldgKeyType') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        5, i), ('restraintPldgVarKeyExpireDt') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        6, i), ('restraintPldgVarKeyPlacedDt') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        7, i), ('restraintPldgVarKeySequenceNbr') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        8, i), ('restraintPldgToProductCode') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        9, i), ('restraintPldgToAccountNbr') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        10, i), ('restraintPldgCurrentPldgAmt') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        13, i), ('restraintPldgComment1') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        14, i), ('restraintPldgComment2') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        15, i), ('restraintPldgReason1') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        16, i), ('restraintPldgReason2') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        17, i)]))
    }
    
    //Change the information of an account which has PledgeTo restraint for CDA
    if (i == 3) {
        response = WS.sendRequest(findTestObject('Change Restraint PledgeTo/Change the information of an account which has PledgeTo restraint for CDA', 
                [('restraintPldgKeyCompanyNbr') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        2, i), ('restraintPldgKeyProductCode') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        3, i), ('restraintPldgKeyAccountNbr') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        4, i), ('restraintPldgKeyType') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        5, i), ('restraintPldgVarKeyExpireDt') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        6, i), ('restraintPldgVarKeyPlacedDt') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        7, i), ('restraintPldgVarKeySequenceNbr') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        8, i), ('restraintPldgComment1') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        14, i), ('restraintPldgComment2') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        15, i), ('restraintPldgReason1') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        16, i), ('restraintPldgReason2') : findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(
                        17, i)]))
    }
    
    WS.verifyResponseStatusCode(response, 200)

    WS.verifyElementPropertyValue(response, 'changeRestraintPledgeToServiceOperationResponse.RESPONSE.Output.xStatus.applicationCd', 
        findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(19, i))

    WS.verifyElementPropertyValue(response, 'changeRestraintPledgeToServiceOperationResponse.RESPONSE.Output.xStatus.statusCd', 
        findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(20, i))

    WS.verifyElementPropertyValue(response, 'changeRestraintPledgeToServiceOperationResponse.RESPONSE.Output.xStatus.statusMessage', 
        findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(21, i))

    WS.verifyElementPropertyValue(response, 'changeRestraintPledgeToServiceOperationResponse.RESPONSE.Output.xStatus.severity', 
        findTestData('Z-Connect Test Data/Change Restraint PledgeTo_TestData').getValue(22, i))
}