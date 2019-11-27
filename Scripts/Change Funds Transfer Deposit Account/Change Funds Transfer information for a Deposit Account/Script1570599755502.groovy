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

for (int i = 1; i < 5; i++) {
    println('EXCEL SHEET ROW NUMBER IS : ' + i)

    //Change Funds Transfer information for a Deposit Account
    if (i == 1) {
        response = WS.sendRequest(findTestObject('Change Funds Transfer Deposit Account/Change Funds Transfer information for a Deposit Account for TR', 
                [('companyNbr') : findTestData('Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(
                        2, i), ('paymentType') : findTestData('Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(
                        3, i), ('productCd') : findTestData('Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(
                        4, i), ('accountNbr') : findTestData('Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(
                        5, i), ('transferNumberHi') : findTestData('Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(
                        6, i), ('transferNumberLo') : findTestData('Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(
                        7, i), ('destinationAccountType') : findTestData('Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(
                        21, i), ('destainationAccountNbr') : findTestData('Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(
                        22, i), ('destinationCompanyNbr') : findTestData('Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(
                        24, i)]))
    }
    
    //Change Dates and Other info TR
    if (i == 2) {
        response = WS.sendRequest(findTestObject('Change Funds Transfer Deposit Account/Change Dates and Other info for TR', [('companyNbr') : findTestData(
                        'Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(2, i), ('paymentType') : findTestData(
                        'Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(3, i), ('productCd') : findTestData(
                        'Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(4, i), ('accountNbr') : findTestData(
                        'Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(5, i), ('transferNumberHi') : findTestData(
                        'Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(6, i), ('transferNumberLo') : findTestData(
                        'Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(7, i), ('startDate') : findTestData(
                        'Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(10, i), ('expiryDate') : findTestData(
                        'Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(11, i), ('nonBusDayException') : findTestData(
                        'Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(12, i), ('holdCode') : findTestData(
                        'Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(13, i), ('variable') : findTestData(
                        'Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(14, i), ('amount') : findTestData(
                        'Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(15, i), ('partial') : findTestData(
                        'Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(16, i), ('minimum') : findTestData(
                        'Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(17, i), ('maximum') : findTestData(
                        'Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(18, i), ('target') : findTestData(
                        'Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(19, i)]))
    }
	
	//Change Funds Transfer information for a Deposit Account for EP
	if (i == 3) {
		response = WS.sendRequest(findTestObject('Change Funds Transfer Deposit Account/Change Funds Transfer information for a Deposit Account for EP',
				[('companyNbr') : findTestData('Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(
						2, i), ('paymentType') : findTestData('Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(
						3, i), ('productCd') : findTestData('Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(
						4, i), ('accountNbr') : findTestData('Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(
						5, i), ('transferNumberHi') : findTestData('Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(
						6, i), ('transferNumberLo') : findTestData('Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(
						7, i), ('destinationTransitRouting') : findTestData('Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(
						20, i), ('destinationAccountType') : findTestData('Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(
						21, i), ('destainationAccountNbr') : findTestData('Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(
						22, i), ('destinationCompanyNbr') : findTestData('Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(
						24, i)]))
	}
	
	//Change Dates and Other info EP
	if (i == 4) {
		response = WS.sendRequest(findTestObject('Change Funds Transfer Deposit Account/Change Dates and Other info for EP', [('companyNbr') : findTestData(
						'Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(2, i), ('paymentType') : findTestData(
						'Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(3, i), ('productCd') : findTestData(
						'Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(4, i), ('accountNbr') : findTestData(
						'Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(5, i), ('transferNumberHi') : findTestData(
						'Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(6, i), ('transferNumberLo') : findTestData(
						'Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(7, i), ('startDate') : findTestData(
						'Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(10, i), ('expiryDate') : findTestData(
						'Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(11, i), ('nonBusDayException') : findTestData(
						'Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(12, i), ('holdCode') : findTestData(
						'Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(13, i), ('variable') : findTestData(
						'Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(14, i), ('amount') : findTestData(
						'Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(15, i), ('partial') : findTestData(
						'Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(16, i), ('minimum') : findTestData(
						'Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(17, i), ('maximum') : findTestData(
						'Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(18, i), ('target') : findTestData(
						'Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(19, i)]))
	}
    
    WS.verifyResponseStatusCode(response, 200)

    WS.verifyElementPropertyValue(response, 'changeFundsTransferDepositAccountServiceOperationResponse.RESPONSE.Output.xStatus.applicationCd', 
        findTestData('Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(28, i))

    WS.verifyElementPropertyValue(response, 'changeFundsTransferDepositAccountServiceOperationResponse.RESPONSE.Output.xStatus.statusCd', 
        findTestData('Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(29, i))

    WS.verifyElementPropertyValue(response, 'changeFundsTransferDepositAccountServiceOperationResponse.RESPONSE.Output.xStatus.detailMessages', 
        findTestData('Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(30, i))

    WS.verifyElementPropertyValue(response, 'changeFundsTransferDepositAccountServiceOperationResponse.RESPONSE.Output.xStatus.severity', 
        findTestData('Z-Connect Test Data/Change Funds Transfer Deposit Account_TestData').getValue(31, i))
}