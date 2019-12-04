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


suiteProperties.put('id', 'Test Suites/Get Pay off Charge off DDA')

suiteProperties.put('name', 'Get Pay off Charge off DDA')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\khaja.h\\Katalon Studio\\Z-Connect\\Reports\\Get Pay off Charge off DDA\\20191204_125215\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Get Pay off Charge off DDA', suiteProperties, [new TestCaseBinding('Test Cases/Get Pay off Charge off DDA/Type of Close P', 'Test Cases/Get Pay off Charge off DDA/Type of Close P',  null), new TestCaseBinding('Test Cases/Get Pay off Charge off DDA/Type of Close C', 'Test Cases/Get Pay off Charge off DDA/Type of Close C',  null), new TestCaseBinding('Test Cases/Get Pay off Charge off DDA/Type of Close O', 'Test Cases/Get Pay off Charge off DDA/Type of Close O',  null), new TestCaseBinding('Test Cases/Get Pay off Charge off DDA/Pay off with post interest Y', 'Test Cases/Get Pay off Charge off DDA/Pay off with post interest Y',  null), new TestCaseBinding('Test Cases/Get Pay off Charge off DDA/Pay off with post interest N', 'Test Cases/Get Pay off Charge off DDA/Pay off with post interest N',  null), new TestCaseBinding('Test Cases/Get Pay off Charge off DDA/Pay off with post interest and excess activity Y', 'Test Cases/Get Pay off Charge off DDA/Pay off with post interest and excess activity Y',  null), new TestCaseBinding('Test Cases/Get Pay off Charge off DDA/Outstanding with excess activity Y', 'Test Cases/Get Pay off Charge off DDA/Outstanding with excess activity Y',  null), new TestCaseBinding('Test Cases/Get Pay off Charge off DDA/Chargeoff with excess activity Y', 'Test Cases/Get Pay off Charge off DDA/Chargeoff with excess activity Y',  null), new TestCaseBinding('Test Cases/Get Pay off Charge off DDA/Outstanding Items', 'Test Cases/Get Pay off Charge off DDA/Outstanding Items',  null), new TestCaseBinding('Test Cases/Get Pay off Charge off DDA/Account not found', 'Test Cases/Get Pay off Charge off DDA/Account not found',  null), new TestCaseBinding('Test Cases/Get Pay off Charge off DDA/Invalid type of close option', 'Test Cases/Get Pay off Charge off DDA/Invalid type of close option',  null)])
