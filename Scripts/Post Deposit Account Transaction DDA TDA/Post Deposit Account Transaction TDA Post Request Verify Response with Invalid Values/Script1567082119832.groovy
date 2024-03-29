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

response = WS.sendRequest(findTestObject('Post Deposit Account Transaction DDA TDA/Post Deposit Account Transaction TDA Post Request Verify Response with Invalid Values'))

WS.verifyResponseStatusCode(response, 400)

WS.verifyElementPropertyValue(response, 'errorMessage', 'BAQR0429W: API postDepositAccountTransaction encountered an error while processing a request under URL https://20.14.209.1:9443/postDepositAccountTransaction/postDepositAccountTransaction.')

WS.verifyElementPropertyValue(response, 'errorDetails', 'com.ibm.zosconnect.wv.transaction.messages.walkers.MessageWalkerException: GMOMW0005E: A data type conversion error occurred while the leaf field Input.companyNbr of service interface null was converted: Value out of range. Value:\"1134567\" Radix:10.')

