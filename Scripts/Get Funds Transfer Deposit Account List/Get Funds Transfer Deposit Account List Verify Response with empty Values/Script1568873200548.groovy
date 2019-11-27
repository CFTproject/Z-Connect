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

response = WS.sendRequest(findTestObject('Get Funds Transfer Deposit Account List/Get Funds Transfer Deposit Account List Verify Response with empty Values'))

WS.verifyResponseStatusCode(response, 200)

for (int i = 2; i < 3; i++) {
    WS.verifyElementPropertyValue(response, 'getFundsTransferDepositAccountListServiceOperationResponse.RESPONSE.OUTPUT.xStatus.applicationCd', 
        findTestData('Z-Connect Test Data/Get Funds Transfer Deposit Account List_TestData').getValue(2, 1))

    WS.verifyElementPropertyValue(response, 'getFundsTransferDepositAccountListServiceOperationResponse.RESPONSE.OUTPUT.xStatus.statusCd', 
        findTestData('Z-Connect Test Data/Get Funds Transfer Deposit Account List_TestData').getValue(3, i))

    WS.verifyElementPropertyValue(response, 'getFundsTransferDepositAccountListServiceOperationResponse.RESPONSE.OUTPUT.xStatus.detailMessages', 
        findTestData('Z-Connect Test Data/Get Funds Transfer Deposit Account List_TestData').getValue(4, i))

    WS.verifyElementPropertyValue(response, 'getFundsTransferDepositAccountListServiceOperationResponse.RESPONSE.OUTPUT.xStatus.severity', 
        findTestData('Z-Connect Test Data/Get Funds Transfer Deposit Account List_TestData').getValue(5, i))

    WS.verifyElementPropertyValue(response, 'getFundsTransferDepositAccountListServiceOperationResponse.RESPONSE.OUTPUT.companyNbr', 
        findTestData('Z-Connect Test Data/Get Funds Transfer Deposit Account List_TestData').getValue(6, i))

    WS.verifyElementPropertyValue(response, 'getFundsTransferDepositAccountListServiceOperationResponse.RESPONSE.OUTPUT.paymentType', 
        findTestData('Z-Connect Test Data/Get Funds Transfer Deposit Account List_TestData').getValue(7, i))

    WS.verifyElementPropertyValue(response, 'getFundsTransferDepositAccountListServiceOperationResponse.RESPONSE.OUTPUT.accountType', 
        findTestData('Z-Connect Test Data/Get Funds Transfer Deposit Account List_TestData').getValue(8, i))

    WS.verifyElementPropertyValue(response, 'getFundsTransferDepositAccountListServiceOperationResponse.RESPONSE.OUTPUT.accountNbr', 
        findTestData('Z-Connect Test Data/Get Funds Transfer Deposit Account List_TestData').getValue(9, i))

    WS.verifyElementPropertyValue(response, 'getFundsTransferDepositAccountListServiceOperationResponse.RESPONSE.OUTPUT.offsetHi', 
        findTestData('Z-Connect Test Data/Get Funds Transfer Deposit Account List_TestData').getValue(10, i))

    WS.verifyElementPropertyValue(response, 'getFundsTransferDepositAccountListServiceOperationResponse.RESPONSE.OUTPUT.offsetLo', 
        findTestData('Z-Connect Test Data/Get Funds Transfer Deposit Account List_TestData').getValue(11, i))

    WS.verifyElementPropertyValue(response, 'getFundsTransferDepositAccountListServiceOperationResponse.RESPONSE.OUTPUT.limit', 
        findTestData('Z-Connect Test Data/Get Funds Transfer Deposit Account List_TestData').getValue(12, i))

    WS.verifyElementPropertyValue(response, 'getFundsTransferDepositAccountListServiceOperationResponse.RESPONSE.OUTPUT.fundsTransferList[0].transferNumberHi', 
        findTestData('Z-Connect Test Data/Get Funds Transfer Deposit Account List_TestData').getValue(13, i))

    WS.verifyElementPropertyValue(response, 'getFundsTransferDepositAccountListServiceOperationResponse.RESPONSE.OUTPUT.fundsTransferList[0].transferNumberLo', 
        findTestData('Z-Connect Test Data/Get Funds Transfer Deposit Account List_TestData').getValue(14, i))

    WS.verifyElementPropertyValue(response, 'getFundsTransferDepositAccountListServiceOperationResponse.RESPONSE.OUTPUT.fundsTransferList[0].period', 
        findTestData('Z-Connect Test Data/Get Funds Transfer Deposit Account List_TestData').getValue(15, i))

    WS.verifyElementPropertyValue(response, 'getFundsTransferDepositAccountListServiceOperationResponse.RESPONSE.OUTPUT.fundsTransferList[0].frequency', 
        findTestData('Z-Connect Test Data/Get Funds Transfer Deposit Account List_TestData').getValue(16, i))

    WS.verifyElementPropertyValue(response, 'getFundsTransferDepositAccountListServiceOperationResponse.RESPONSE.OUTPUT.fundsTransferList[0].startDate', 
        findTestData('Z-Connect Test Data/Get Funds Transfer Deposit Account List_TestData').getValue(17, i))

    WS.verifyElementPropertyValue(response, 'getFundsTransferDepositAccountListServiceOperationResponse.RESPONSE.OUTPUT.fundsTransferList[0].expiryDate', 
        findTestData('Z-Connect Test Data/Get Funds Transfer Deposit Account List_TestData').getValue(18, i))

    WS.verifyElementPropertyValue(response, 'getFundsTransferDepositAccountListServiceOperationResponse.RESPONSE.OUTPUT.fundsTransferList[0].nextReleaseDate', 
        findTestData('Z-Connect Test Data/Get Funds Transfer Deposit Account List_TestData').getValue(19, i))

    WS.verifyElementPropertyValue(response, 'getFundsTransferDepositAccountListServiceOperationResponse.RESPONSE.OUTPUT.fundsTransferList[0].lastMaintenance', 
        findTestData('Z-Connect Test Data/Get Funds Transfer Deposit Account List_TestData').getValue(20, i))

    WS.verifyElementPropertyValue(response, 'getFundsTransferDepositAccountListServiceOperationResponse.RESPONSE.OUTPUT.fundsTransferList[0].numberRetries', 
        findTestData('Z-Connect Test Data/Get Funds Transfer Deposit Account List_TestData').getValue(21, i))

    WS.verifyElementPropertyValue(response, 'getFundsTransferDepositAccountListServiceOperationResponse.RESPONSE.OUTPUT.fundsTransferList[0].nonBusDayException', 
        findTestData('Z-Connect Test Data/Get Funds Transfer Deposit Account List_TestData').getValue(22, i))

    WS.verifyElementPropertyValue(response, 'getFundsTransferDepositAccountListServiceOperationResponse.RESPONSE.OUTPUT.fundsTransferList[0].holdCode', 
        findTestData('Z-Connect Test Data/Get Funds Transfer Deposit Account List_TestData').getValue(23, i))

    WS.verifyElementPropertyValue(response, 'getFundsTransferDepositAccountListServiceOperationResponse.RESPONSE.OUTPUT.fundsTransferList[0].variable', 
        findTestData('Z-Connect Test Data/Get Funds Transfer Deposit Account List_TestData').getValue(24, i))

    WS.verifyElementPropertyValue(response, 'getFundsTransferDepositAccountListServiceOperationResponse.RESPONSE.OUTPUT.fundsTransferList[0].amount', 
        findTestData('Z-Connect Test Data/Get Funds Transfer Deposit Account List_TestData').getValue(25, i))

    WS.verifyElementPropertyValue(response, 'getFundsTransferDepositAccountListServiceOperationResponse.RESPONSE.OUTPUT.fundsTransferList[0].partial', 
        findTestData('Z-Connect Test Data/Get Funds Transfer Deposit Account List_TestData').getValue(26, i))

    WS.verifyElementPropertyValue(response, 'getFundsTransferDepositAccountListServiceOperationResponse.RESPONSE.OUTPUT.fundsTransferList[0].minimum', 
        findTestData('Z-Connect Test Data/Get Funds Transfer Deposit Account List_TestData').getValue(27, i))

    WS.verifyElementPropertyValue(response, 'getFundsTransferDepositAccountListServiceOperationResponse.RESPONSE.OUTPUT.fundsTransferList[0].maximum', 
        findTestData('Z-Connect Test Data/Get Funds Transfer Deposit Account List_TestData').getValue(28, i))

    WS.verifyElementPropertyValue(response, 'getFundsTransferDepositAccountListServiceOperationResponse.RESPONSE.OUTPUT.fundsTransferList[0].target', 
        findTestData('Z-Connect Test Data/Get Funds Transfer Deposit Account List_TestData').getValue(29, i))

    WS.verifyElementPropertyValue(response, 'getFundsTransferDepositAccountListServiceOperationResponse.RESPONSE.OUTPUT.fundsTransferList[0].destinationTransitRouting', 
        findTestData('Z-Connect Test Data/Get Funds Transfer Deposit Account List_TestData').getValue(30, i))

    WS.verifyElementPropertyValue(response, 'getFundsTransferDepositAccountListServiceOperationResponse.RESPONSE.OUTPUT.fundsTransferList[0].destinationAccountType', 
        findTestData('Z-Connect Test Data/Get Funds Transfer Deposit Account List_TestData').getValue(31, i))

    WS.verifyElementPropertyValue(response, 'getFundsTransferDepositAccountListServiceOperationResponse.RESPONSE.OUTPUT.fundsTransferList[0].destinationAccountNbr', 
        findTestData('Z-Connect Test Data/Get Funds Transfer Deposit Account List_TestData').getValue(32, i))

    WS.verifyElementPropertyValue(response, 'getFundsTransferDepositAccountListServiceOperationResponse.RESPONSE.OUTPUT.fundsTransferList[0].destinationCompanyNbr', 
        findTestData('Z-Connect Test Data/Get Funds Transfer Deposit Account List_TestData').getValue(33, i))

    WS.verifyElementPropertyValue(response, 'getFundsTransferDepositAccountListServiceOperationResponse.RESPONSE.OUTPUT.fundsTransferList[0].shortName', 
        findTestData('Z-Connect Test Data/Get Funds Transfer Deposit Account List_TestData').getValue(34, i))

    WS.verifyElementPropertyValue(response, 'getFundsTransferDepositAccountListServiceOperationResponse.RESPONSE.OUTPUT.fundsTransferList[0].otherInfo', 
        findTestData('Z-Connect Test Data/Get Funds Transfer Deposit Account List_TestData').getValue(35, i))
}

