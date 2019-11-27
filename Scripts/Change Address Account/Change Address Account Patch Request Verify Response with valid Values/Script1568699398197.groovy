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

for (int i = 1; i < 9; i++) {
    println('EXCEL SHEET ROW NUMBER IS : ' + i)

    println('APPLICATION CODE : ' + findTestData('Z-Connect Test Data/Change Address Account_TestData').getValue(18, i))

    println('STATUS CODE : ' + findTestData('Z-Connect Test Data/Change Address Account_TestData').getValue(19, i))

    println('STATUS MESSAGE : ' + findTestData('Z-Connect Test Data/Change Address Account_TestData').getValue(20, i))

    println('SEVERITY : ' + findTestData('Z-Connect Test Data/Change Address Account_TestData').getValue(21, i))

    //change all fields
    if (i == 1) {
        response = WS.sendRequest(findTestObject('Change Address Account/Change Address Account Patch Request Verify Response with valid Values', 
                [('actionCd') : findTestData('Z-Connect Test Data/Change Address Account_TestData').getValue(2, i), ('accountProductCd') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(3, i), ('accountNbr') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(4, i), ('useCd') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(5, i), ('sequence') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(6, i), ('accountTitle1') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(7, i), ('addressLine1') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(10, i), ('addressLine2') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(11, i), ('addressLine3') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(12, i)]))
    }   
	
	
    //change city and all fields
    if (i == 2) {
        println('EXCEL SHEET ROW NUMBER IS : ' + i)

        response = WS.sendRequest(findTestObject('Change Address Account/Verify Response change city with valid Values', 
                [('actionCd') : findTestData('Z-Connect Test Data/Change Address Account_TestData').getValue(2, i), ('accountProductCd') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(3, i), ('accountNbr') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(4, i), ('useCd') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(5, i), ('sequence') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(6, i), ('accountTitle1') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(7, i), ('addressLine1') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(10, i), ('city') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(13, i)]))
    }
    
    //change postal code and all fields
    if (i == 3) {
        println('EXCEL SHEET ROW NUMBER IS : ' + i)

        response = WS.sendRequest(findTestObject('Change Address Account/Verify Response change postal code with valid Values', 
                [('actionCd') : findTestData('Z-Connect Test Data/Change Address Account_TestData').getValue(2, i), ('accountProductCd') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(3, i), ('accountNbr') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(4, i), ('useCd') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(5, i), ('sequence') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(6, i), ('accountTitle1') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(7, i), ('addressLine1') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(10, i), ('city') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(13, i), ('postalCd') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(14, i)]))
    }
    
    //change titile 1 and 2 and all fields
    if (i == 4) {
        println('EXCEL SHEET ROW NUMBER IS : ' + i)

        response = WS.sendRequest(findTestObject('Change Address Account/Change all fields add title 1 and 2', [('actionCd') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(2, i), ('accountProductCd') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(3, i), ('accountNbr') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(4, i), ('useCd') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(5, i), ('sequence') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(6, i), ('accountTitle1') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(7, i), ('accountTitle2') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(8, i), ('accountTitle3') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(9, i), ('addressLine1') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(10, i), ('city') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(13, i), ('postalCd') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(14, i)]))
    }
    
    //change state and all fields
    if (i == 5) {
        println('EXCEL SHEET ROW NUMBER IS : ' + i)

        response = WS.sendRequest(findTestObject('Change Address Account/Change all fields and state Verify Response with valid Values', 
                [('actionCd') : findTestData('Z-Connect Test Data/Change Address Account_TestData').getValue(2, i), ('accountProductCd') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(3, i), ('accountNbr') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(4, i), ('useCd') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(5, i), ('sequence') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(6, i), ('accountTitle1') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(7, i), ('state') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(15, i)]))
    }
    
    //change country and all fields
    if (i == 6) {
        println('EXCEL SHEET ROW NUMBER IS : ' + i)

        response = WS.sendRequest(findTestObject('Change Address Account/Change all fields and country Verify Response with valid Values', 
                [('actionCd') : findTestData('Z-Connect Test Data/Change Address Account_TestData').getValue(2, i), ('accountProductCd') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(3, i), ('accountNbr') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(4, i), ('useCd') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(5, i), ('sequence') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(6, i), ('accountTitle1') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(7, i), ('country') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(16, i)]))
    }
    
	//Change Address of an account
    if ((i == 7) || (i == 8)) {
        response = WS.sendRequest(findTestObject('Change Address Account/Change Address of an account', [('actionCd') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(2, i), ('accountProductCd') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(3, i), ('accountNbr') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(4, i), ('useCd') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(5, i), ('sequence') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(6, i), ('accountTitle1') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(7, i), ('accountTitle2') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(8, i), ('accountTitle3') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(9, i),('addressLine1') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(10, i),('addressLine2') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(11, i),('addressLine3') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(12, i), ('city') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(13, i), ('postalCd') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(14, i), ('country') : findTestData(
                        'Z-Connect Test Data/Change Address Account_TestData').getValue(16, i)]))
    }
    
    WS.verifyResponseStatusCode(response, 200)

    WS.verifyElementPropertyValue(response, 'changeAddressAccountServiceOperationResponse.RESPONSE.Output.xStatus.applicationCd', 
        findTestData('Z-Connect Test Data/Change Address Account_TestData').getValue(18, i))

    WS.verifyElementPropertyValue(response, 'changeAddressAccountServiceOperationResponse.RESPONSE.Output.xStatus.statusCd', 
        findTestData('Z-Connect Test Data/Change Address Account_TestData').getValue(19, i))

    WS.verifyElementPropertyValue(response, 'changeAddressAccountServiceOperationResponse.RESPONSE.Output.xStatus.statusMessage', 
        findTestData('Z-Connect Test Data/Change Address Account_TestData').getValue(20, i))

    WS.verifyElementPropertyValue(response, 'changeAddressAccountServiceOperationResponse.RESPONSE.Output.xStatus.severity', 
        findTestData('Z-Connect Test Data/Change Address Account_TestData').getValue(21, i))
}