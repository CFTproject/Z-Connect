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

String str = 'changeRestraintHardHoldServiceOperationResponse.RESPONSE.Output.xStatus.'

testdatapath = findTestData('Z-Connect Test Data/Change Restraint Hard Hold_TestData')

for (int i = 1; i < 11; i++) {
    println('EXCEL SHEET ROW NUMBER IS : ' + i)

    //change rst Hardhold DDA
    if (i == 1) {
        response = WS.sendRequest(findTestObject('Change Restraint Hard Hold/change rst Hardhold DDA', [('restraintHhKeyCompanyNbr') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(2, i), ('restraintHhKeyProductCode') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(3, i), ('restraintHhKeyAccountNbr') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(4, i), ('restraintHhKeyType') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(5, i), ('restraintHhVarKeyExpireDt') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(6, i), ('restraintHhVarKeyPlacedDt') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(7, i), ('restraintHhVarKeySequenceNbr') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(8, i), ('restraintHhTypeCd') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(9, i), ('restraintHhReason') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(10, i), ('restraintHhComment1') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(11, i), ('restraintHhComment2') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(12, i), ('restraintHhReason1') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(13, i), ('restraintHhReason2') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(14, i)]))
    }
    
    //change rst Hardhold CDA
    if (i == 2) {
        response = WS.sendRequest(findTestObject('Change Restraint Hard Hold/change rst Hardhold CDA', [('restraintHhKeyCompanyNbr') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(2, i), ('restraintHhKeyProductCode') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(3, i), ('restraintHhKeyAccountNbr') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(4, i), ('restraintHhKeyType') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(5, i), ('restraintHhVarKeyExpireDt') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(6, i), ('restraintHhVarKeyPlacedDt') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(7, i), ('restraintHhVarKeySequenceNbr') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(8, i), ('restraintHhTypeCd') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(9, i), ('restraintHhReason') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(10, i), ('restraintHhComment1') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(11, i), ('restraintHhComment2') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(12, i), ('restraintHhReason1') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(13, i), ('restraintHhReason2') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(14, i)]))
    }
    
    //change rst Hardhold REA
    if (i == 3) {
        response = WS.sendRequest(findTestObject('Change Restraint Hard Hold/change rst Hardhold REA', [('restraintHhKeyCompanyNbr') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(2, i), ('restraintHhKeyProductCode') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(3, i), ('restraintHhKeyAccountNbr') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(4, i), ('restraintHhKeyType') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(5, i), ('restraintHhVarKeyExpireDt') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(6, i), ('restraintHhVarKeyPlacedDt') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(7, i), ('restraintHhVarKeySequenceNbr') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(8, i), ('restraintHhTypeCd') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(9, i), ('restraintHhReason') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(10, i), ('restraintHhComment1') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(11, i), ('restraintHhComment2') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(12, i), ('restraintHhReason1') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(13, i), ('restraintHhReason2') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(14, i)]))
    }
    
    //Invalid product code
    if (i == 4) {
        response = WS.sendRequest(findTestObject('Change Restraint Hard Hold/Invalid product code', [('restraintHhKeyCompanyNbr') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(2, i), ('restraintHhKeyProductCode') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(3, i), ('restraintHhKeyAccountNbr') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(4, i), ('restraintHhKeyType') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(5, i), ('restraintHhVarKeyExpireDt') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(6, i), ('restraintHhVarKeyPlacedDt') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(7, i), ('restraintHhVarKeySequenceNbr') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(8, i), ('restraintHhTypeCd') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(9, i), ('restraintHhReason') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(10, i), ('restraintHhComment1') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(11, i), ('restraintHhComment2') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(12, i), ('restraintHhReason1') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(13, i), ('restraintHhReason2') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(14, i)]))
    }
    
    //Invalid expiry date
    if (i == 5) {
        response = WS.sendRequest(findTestObject('Change Restraint Hard Hold/Invalid expiry date', [('restraintHhKeyCompanyNbr') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(2, i), ('restraintHhKeyProductCode') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(3, i), ('restraintHhKeyAccountNbr') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(4, i), ('restraintHhKeyType') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(5, i), ('restraintHhVarKeyExpireDt') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(6, i), ('restraintHhVarKeyPlacedDt') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(7, i), ('restraintHhVarKeySequenceNbr') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(8, i), ('restraintHhTypeCd') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(9, i), ('restraintHhReason') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(10, i), ('restraintHhComment1') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(11, i), ('restraintHhComment2') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(12, i), ('restraintHhReason1') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(13, i), ('restraintHhReason2') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(14, i)]))
    }
    
    //Invalid Placed date
    if (i == 6) {
        response = WS.sendRequest(findTestObject('Change Restraint Hard Hold/Invalid Placed date', [('restraintHhKeyCompanyNbr') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(2, i), ('restraintHhKeyProductCode') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(3, i), ('restraintHhKeyAccountNbr') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(4, i), ('restraintHhKeyType') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(5, i), ('restraintHhVarKeyExpireDt') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(6, i), ('restraintHhVarKeyPlacedDt') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(7, i), ('restraintHhVarKeySequenceNbr') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(8, i), ('restraintHhTypeCd') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(9, i), ('restraintHhReason') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(10, i), ('restraintHhComment1') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(11, i), ('restraintHhComment2') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(12, i), ('restraintHhReason1') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(13, i), ('restraintHhReason2') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(14, i)]))
    }
    
    //Product code -spaces
    if (i == 7) {
        response = WS.sendRequest(findTestObject('Change Restraint Hard Hold/Product code -spaces', [('restraintHhKeyCompanyNbr') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(2, i), ('restraintHhKeyProductCode') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(3, i), ('restraintHhKeyAccountNbr') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(4, i), ('restraintHhKeyType') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(5, i), ('restraintHhVarKeyExpireDt') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(6, i), ('restraintHhVarKeyPlacedDt') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(7, i), ('restraintHhVarKeySequenceNbr') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(8, i), ('restraintHhTypeCd') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(9, i), ('restraintHhReason') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(10, i), ('restraintHhComment1') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(11, i), ('restraintHhComment2') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(12, i), ('restraintHhReason1') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(13, i), ('restraintHhReason2') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(14, i)]))
    }
    
    //Account number blank
    if (i == 8) {
        response = WS.sendRequest(findTestObject('Change Restraint Hard Hold/Account number blank', [('restraintHhKeyCompanyNbr') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(2, i), ('restraintHhKeyProductCode') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(3, i), ('restraintHhKeyAccountNbr') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(4, i), ('restraintHhKeyType') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(5, i), ('restraintHhVarKeyExpireDt') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(6, i), ('restraintHhVarKeyPlacedDt') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(7, i), ('restraintHhVarKeySequenceNbr') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(8, i), ('restraintHhTypeCd') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(9, i), ('restraintHhReason') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(10, i), ('restraintHhComment1') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(11, i), ('restraintHhComment2') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(12, i), ('restraintHhReason1') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(13, i), ('restraintHhReason2') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(14, i)]))
    }
    
    //no changes entered
    if (i == 9) {
        response = WS.sendRequest(findTestObject('Change Restraint Hard Hold/no changes entered', [('restraintHhKeyCompanyNbr') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(2, i), ('restraintHhKeyProductCode') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(3, i), ('restraintHhKeyAccountNbr') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(4, i), ('restraintHhKeyType') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(5, i), ('restraintHhVarKeyExpireDt') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(6, i), ('restraintHhVarKeyPlacedDt') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(7, i), ('restraintHhVarKeySequenceNbr') : findTestData(
                        'Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(8, i)]))
    }
    
    //High values for any of the change fields
    if (i == 10) {
        response = WS.sendRequest(findTestObject('Change Restraint Hard Hold/High values for any of the change fields', 
                [('restraintHhKeyCompanyNbr') : findTestData('Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(
                        2, i), ('restraintHhKeyProductCode') : findTestData('Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(
                        3, i), ('restraintHhKeyAccountNbr') : findTestData('Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(
                        4, i), ('restraintHhKeyType') : findTestData('Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(
                        5, i), ('restraintHhVarKeyExpireDt') : findTestData('Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(
                        6, i), ('restraintHhVarKeyPlacedDt') : findTestData('Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(
                        7, i), ('restraintHhVarKeySequenceNbr') : findTestData('Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(
                        8, i), ('restraintHhTypeCd') : findTestData('Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(
                        9, i), ('restraintHhReason') : findTestData('Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(
                        10, i), ('restraintHhReason1') : findTestData('Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(
                        13, i), ('restraintHhReason2') : findTestData('Z-Connect Test Data/Change Restraint Hard Hold_TestData').getValue(
                        14, i)]))
    }
    
    if (i == 8) {
        WS.verifyResponseStatusCode(response, 400)
    } else {
        WS.verifyResponseStatusCode(response, 200)
    }
    
    if (i != 8) {
        WS.verifyElementPropertyValue(response, str + 'applicationCd', testdatapath.getValue(16, i))

        WS.verifyElementPropertyValue(response, str + 'statusCd', testdatapath.getValue(17, i))

        WS.verifyElementPropertyValue(response, str + 'statusMessage', testdatapath.getValue(18, i))

        WS.verifyElementPropertyValue(response, str + 'severity', testdatapath.getValue(19, i))
    } else {
        WS.verifyElementPropertyValue(response, 'errorMessage', testdatapath.getValue(20, i))
    }
}