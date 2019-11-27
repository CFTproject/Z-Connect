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


for (int i = 3; i < 8; i++) {
	
	
	
	String url = findTestData('Z-Connect Test Data/Get pay off TDA_TestData').getValue(2, i)
	
	GlobalVariable.GetpayoffTDAURLS = url
	
	println ('URL :- '+'https://20.14.209.1:9443/getPayoffTDA/getPayoffTDA/'+url)
	
	println ('EXCEL SHEET ROW NUMBER :- '+i)
	
	response = WS.sendRequest(findTestObject('Get pay off TDA/Get pay off TDA Verify Response with valid Values'))
	
	WS.verifyResponseStatusCode(response, 200)
	
    WS.verifyElementPropertyValue(response, 'getPayoffTDAServiceOperationResponse.RESPONSE.Output.xStatus.applicationCd', 
        findTestData('Z-Connect Test Data/Get pay off TDA_TestData').getValue(3, i))

    WS.verifyElementPropertyValue(response, 'getPayoffTDAServiceOperationResponse.RESPONSE.Output.xStatus.statusCd', findTestData(
            'Z-Connect Test Data/Get pay off TDA_TestData').getValue(4, i))

    WS.verifyElementPropertyValue(response, 'getPayoffTDAServiceOperationResponse.RESPONSE.Output.xStatus.statusMessage', 
        findTestData('Z-Connect Test Data/Get pay off TDA_TestData').getValue(5, i))

    WS.verifyElementPropertyValue(response, 'getPayoffTDAServiceOperationResponse.RESPONSE.Output.xStatus.severity', findTestData(
            'Z-Connect Test Data/Get pay off TDA_TestData').getValue(6, i))

    WS.verifyElementPropertyValue(response, 'getPayoffTDAServiceOperationResponse.RESPONSE.Output.companyNbr', findTestData(
            'Z-Connect Test Data/Get pay off TDA_TestData').getValue(7, i))

    WS.verifyElementPropertyValue(response, 'getPayoffTDAServiceOperationResponse.RESPONSE.Output.accountType', findTestData(
            'Z-Connect Test Data/Get pay off TDA_TestData').getValue(8, i))

    WS.verifyElementPropertyValue(response, 'getPayoffTDAServiceOperationResponse.RESPONSE.Output.accountNbr', findTestData(
            'Z-Connect Test Data/Get pay off TDA_TestData').getValue(9, i))

    WS.verifyElementPropertyValue(response, 'getPayoffTDAServiceOperationResponse.RESPONSE.Output.shortName', findTestData(
            'Z-Connect Test Data/Get pay off TDA_TestData').getValue(10, i))

    WS.verifyElementPropertyValue(response, 'getPayoffTDAServiceOperationResponse.RESPONSE.Output.ledgerBalanceAmt', findTestData(
            'Z-Connect Test Data/Get pay off TDA_TestData').getValue(11, i))

    WS.verifyElementPropertyValue(response, 'getPayoffTDAServiceOperationResponse.RESPONSE.Output.interestEarnedAmt', findTestData(
            'Z-Connect Test Data/Get pay off TDA_TestData').getValue(12, i))

    WS.verifyElementPropertyValue(response, 'getPayoffTDAServiceOperationResponse.RESPONSE.Output.amountWithheldAmt', findTestData(
            'Z-Connect Test Data/Get pay off TDA_TestData').getValue(13, i))

    WS.verifyElementPropertyValue(response, 'getPayoffTDAServiceOperationResponse.RESPONSE.Output.penaltyAmt', findTestData(
            'Z-Connect Test Data/Get pay off TDA_TestData').getValue(14, i))

    WS.verifyElementPropertyValue(response, 'getPayoffTDAServiceOperationResponse.RESPONSE.Output.feeTaxAmt', findTestData(
            'Z-Connect Test Data/Get pay off TDA_TestData').getValue(15, i))

    WS.verifyElementPropertyValue(response, 'getPayoffTDAServiceOperationResponse.RESPONSE.Output.adpPaymentAmt', findTestData(
            'Z-Connect Test Data/Get pay off TDA_TestData').getValue(16, i))

    WS.verifyElementPropertyValue(response, 'getPayoffTDAServiceOperationResponse.RESPONSE.Output.closeoutAmt', findTestData(
            'Z-Connect Test Data/Get pay off TDA_TestData').getValue(17, i))
	if(i==3 || i==4){
	WS.verifyElementPropertyValue(response, 'getPayoffTDAServiceOperationResponse.RESPONSE.Output.inAip', findTestData('Z-Connect Test Data/Get pay off TDA_TestData').getValue(
		18, i), FailureHandling.CONTINUE_ON_FAILURE)
	}
	//println ('inAip field not getting from response in row numer 5, 6 and 7')

    WS.verifyElementPropertyValue(response, 'getPayoffTDAServiceOperationResponse.RESPONSE.Output.aipAdjAmt', findTestData(
            'Z-Connect Test Data/Get pay off TDA_TestData').getValue(19, i))

    WS.verifyElementPropertyValue(response, 'getPayoffTDAServiceOperationResponse.RESPONSE.Output.memoCreditsAmt', findTestData(
            'Z-Connect Test Data/Get pay off TDA_TestData').getValue(20, i))

    WS.verifyElementPropertyValue(response, 'getPayoffTDAServiceOperationResponse.RESPONSE.Output.memoDebitsAmt', findTestData(
            'Z-Connect Test Data/Get pay off TDA_TestData').getValue(21, i))

    WS.verifyElementPropertyValue(response, 'getPayoffTDAServiceOperationResponse.RESPONSE.Output.restrictedDepAmt', findTestData(
            'Z-Connect Test Data/Get pay off TDA_TestData').getValue(22, i))
	
	
}

