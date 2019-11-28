import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Get Deposit Account TDA')

suiteProperties.put('name', 'Get Deposit Account TDA')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\khaja.h\\Katalon Studio\\Z-Connect\\Reports\\Get Deposit Account TDA\\20191128_151748\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Get Deposit Account TDA', suiteProperties, [new TestCaseBinding('Test Cases/Get Deposit Account TDA/Get Account details for CDA account positive', 'Test Cases/Get Deposit Account TDA/Get Account details for CDA account positive',  null), new TestCaseBinding('Test Cases/Get Deposit Account TDA/Get Account details for RSV account positive', 'Test Cases/Get Deposit Account TDA/Get Account details for RSV account positive',  null), new TestCaseBinding('Test Cases/Get Deposit Account TDA/Get Account details for REA account positive', 'Test Cases/Get Deposit Account TDA/Get Account details for REA account positive',  null), new TestCaseBinding('Test Cases/Get Deposit Account TDA/Get Account details for Invalid account number', 'Test Cases/Get Deposit Account TDA/Get Account details for Invalid account number',  null), new TestCaseBinding('Test Cases/Get Deposit Account TDA/Get Account details for invalid account type', 'Test Cases/Get Deposit Account TDA/Get Account details for invalid account type',  null)])
