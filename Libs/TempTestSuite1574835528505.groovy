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


suiteProperties.put('id', 'Test Suites/Delete Restraint Merchant Auth')

suiteProperties.put('name', 'Delete Restraint Merchant Auth')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\khaja.h\\Katalon Studio\\Z-Connect\\Reports\\Delete Restraint Merchant Auth\\20191127_114848\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Delete Restraint Merchant Auth', suiteProperties, [new TestCaseBinding('Test Cases/Delete Restraint Merchant Auth/Delete Restraint Merchant Auth record with all blank input fields', 'Test Cases/Delete Restraint Merchant Auth/Delete Restraint Merchant Auth record with all blank input fields',  null), new TestCaseBinding('Test Cases/Delete Restraint Merchant Auth/Delete Restraint Merchant Auth record with non blank account no and all other blank input fields', 'Test Cases/Delete Restraint Merchant Auth/Delete Restraint Merchant Auth record with non blank account no and all other blank input fields',  null), new TestCaseBinding('Test Cases/Delete Restraint Merchant Auth/Delete Restraint Merchant Auth record with non blank product code and account no fields and all other blank input fields', 'Test Cases/Delete Restraint Merchant Auth/Delete Restraint Merchant Auth record with non blank product code and account no fields and all other blank input fields',  null), new TestCaseBinding('Test Cases/Delete Restraint Merchant Auth/Delete Restraint Merchant Auth record with non blank input fields Invalid placed date', 'Test Cases/Delete Restraint Merchant Auth/Delete Restraint Merchant Auth record with non blank input fields Invalid placed date',  null), new TestCaseBinding('Test Cases/Delete Restraint Merchant Auth/Delete Restraint Merchant Auth record with all valid non blank input fields and blank placed date', 'Test Cases/Delete Restraint Merchant Auth/Delete Restraint Merchant Auth record with all valid non blank input fields and blank placed date',  null), new TestCaseBinding('Test Cases/Delete Restraint Merchant Auth/Delete Restraint Merchant Auth record with all valid non blank input fields', 'Test Cases/Delete Restraint Merchant Auth/Delete Restraint Merchant Auth record with all valid non blank input fields',  null), new TestCaseBinding('Test Cases/Delete Restraint Merchant Auth/Delete Restraint Merchant Auth record with all valid non blank input fields for an non-existing record', 'Test Cases/Delete Restraint Merchant Auth/Delete Restraint Merchant Auth record with all valid non blank input fields for an non-existing record',  null)])
