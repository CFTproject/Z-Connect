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

response = WS.sendRequest(findTestObject('Get Account Relationships/Get Account Relationships with AddrOffset and AddrLimit'))

WS.verifyResponseStatusCode(response, 200)

String str = 'getAccountRelationshipsServiceOperationResponse.RESPONSE.Output.'

testdata = findTestData('Z-Connect Test Data/Get Account Relationships_TestData')

for (int i = 4; i < 5; i++) {
    println('EXCEL SHEET ROW NUMBER IS :' + i)

    WS.verifyElementPropertyValue(response, str + 'xStatus.applicationCd', testdata.getValue(2, i))

    WS.verifyElementPropertyValue(response, str + 'xStatus.statusCd', testdata.getValue(3, i))

    WS.verifyElementPropertyValue(response, str + 'xStatus.statusMessage', testdata.getValue(4, i))

    WS.verifyElementPropertyValue(response, str + 'xStatus.severity', testdata.getValue(5, i)) 
	
    WS.verifyElementPropertyValue(response, str+'companyNbr', testdata.getValue(6, i))
	
	WS.verifyElementPropertyValue(response, str+'productCd', testdata.getValue(7, i))
	
	WS.verifyElementPropertyValue(response, str+'accountNbr', testdata.getValue(8, i))
	
	WS.verifyElementPropertyValue(response, str+'custOffset', testdata.getValue(9, i))
	
	WS.verifyElementPropertyValue(response, str+'custLimit', testdata.getValue(10, i))
	
	WS.verifyElementPropertyValue(response, str+'acctOffset', testdata.getValue(11, i))
	
	WS.verifyElementPropertyValue(response, str+'acctLimit', testdata.getValue(12, i))
	
	WS.verifyElementPropertyValue(response, str+'addrOffset', testdata.getValue(13, i))
	
	WS.verifyElementPropertyValue(response, str+'addrLimit', testdata.getValue(14, i))
	
	WS.verifyElementPropertyValue(response, str+'relatedCustomerInfo[0].relcusCompanyNbr', testdata.getValue(15, i))
	
	WS.verifyElementPropertyValue(response, str+'relatedCustomerInfo[0].relcusName', testdata.getValue(16, i))
	
	WS.verifyElementPropertyValue(response, str+'relatedCustomerInfo[0].relcusTie', testdata.getValue(17, i))
	
	WS.verifyElementPropertyValue(response, str+'relatedCustomerInfo[0].relcusRelation', testdata.getValue(18, i))
	
	WS.verifyElementPropertyValue(response, str+'relatedCustomerInfo[0].relcusOwner', testdata.getValue(19, i))
	
	WS.verifyElementPropertyValue(response, str+'relatedCustomerInfo[0].relcusApspInd', testdata.getValue(20, i))
	
	WS.verifyElementPropertyValue(response, str+'relatedAccountInfo[0].relactCompanyNbr', testdata.getValue(21, i))
	
	WS.verifyElementPropertyValue(response, str+'relatedAccountInfo[0].relactProductCd', testdata.getValue(22, i))
	
	WS.verifyElementPropertyValue(response, str+'relatedAccountInfo[0].relactAccountNbr', testdata.getValue(23, i))
	
	WS.verifyElementPropertyValue(response, str+'relatedAccountInfo[0].relactRelation', testdata.getValue(24, i))
	
	WS.verifyElementPropertyValue(response, str+'relatedAccountInfo[0].relactRelationDesc', testdata.getValue(25, i))
	
	WS.verifyElementPropertyValue(response, str+'relatedAccountInfo[0].relactOwner', testdata.getValue(26, i))
	
	WS.verifyElementPropertyValue(response, str+'relatedAccountInfo[0].relactApspInd', testdata.getValue(27, i))
	
	WS.verifyElementPropertyValue(response, str+'relatedAddressInfo[0].addrTie', testdata.getValue(28, i))
	
	WS.verifyElementPropertyValue(response, str+'relatedAddressInfo[0].addrUseCd', testdata.getValue(29, i))
	
	WS.verifyElementPropertyValue(response, str+'relatedAddressInfo[0].addrSeq', testdata.getValue(30, i))
	
	WS.verifyElementPropertyValue(response, str+'relatedAddressInfo[0].addrTemp', testdata.getValue(31, i))
	
	WS.verifyElementPropertyValue(response, str+'relatedAddressInfo[0].addrEffectiveDt', testdata.getValue(32, i))
	
	WS.verifyElementPropertyValue(response, str+'relatedAddressInfo[0].addrExpiryDt', testdata.getValue(33, i))
	
	WS.verifyElementPropertyValue(response, str+'relatedAddressInfo[0].addrNameAddr1', testdata.getValue(34, i))
	
	WS.verifyElementPropertyValue(response, str+'relatedAddressInfo[0].addrNameAddr2', testdata.getValue(35, i))
	
	WS.verifyElementPropertyValue(response, str+'relatedAddressInfo[0].addrNameAddr3', testdata.getValue(36, i))
	
	WS.verifyElementPropertyValue(response, str+'relatedAddressInfo[0].addrNameAddr4', testdata.getValue(37, i))
	
	WS.verifyElementPropertyValue(response, str+'relatedAddressInfo[0].addrNameAddr5', testdata.getValue(38, i))
	
	WS.verifyElementPropertyValue(response, str+'relatedAddressInfo[0].addrNameAddr6', testdata.getValue(39, i))
	
	WS.verifyElementPropertyValue(response, str+'relatedAddressInfo[0].addrCountry', testdata.getValue(40, i))
	
	
	
}





