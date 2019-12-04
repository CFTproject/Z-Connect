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


suiteProperties.put('id', 'Test Suites/Get pay off TDA')

suiteProperties.put('name', 'Get pay off TDA')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\khaja.h\\Katalon Studio\\Z-Connect\\Reports\\Get pay off TDA\\20191204_144337\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Get pay off TDA', suiteProperties, [new TestCaseBinding('Test Cases/Get pay off TDA/Get pay off TDA Verify Response with valid Values', 'Test Cases/Get pay off TDA/Get pay off TDA Verify Response with valid Values',  null), new TestCaseBinding('Test Cases/Get pay off TDA/Get pay off TDA Verify Response with empty Values', 'Test Cases/Get pay off TDA/Get pay off TDA Verify Response with empty Values',  null), new TestCaseBinding('Test Cases/Get pay off TDA/Get pay off TDA Verify Response with invalid Values', 'Test Cases/Get pay off TDA/Get pay off TDA Verify Response with invalid Values',  null)])
