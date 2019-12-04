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


suiteProperties.put('id', 'Test Suites/Change Restraint Duplicate Check')

suiteProperties.put('name', 'Change Restraint Duplicate Check')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\khaja.h\\Katalon Studio\\Z-Connect\\Reports\\Change Restraint Duplicate Check\\20191204_113653\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Change Restraint Duplicate Check', suiteProperties, [new TestCaseBinding('Test Cases/Change Restraint Duplicate Check/Change record with all blank input fields non blank account no and all other blank input fields', 'Test Cases/Change Restraint Duplicate Check/Change record with all blank input fields non blank account no and all other blank input fields',  null), new TestCaseBinding('Test Cases/Change Restraint Duplicate Check/Change record with all valid non blank input fields for an non-existing record', 'Test Cases/Change Restraint Duplicate Check/Change record with all valid non blank input fields for an non-existing record',  null), new TestCaseBinding('Test Cases/Change Restraint Duplicate Check/Change record with non blank input fields Low check no greter than High Check No Invalid placed date blank placed date', 'Test Cases/Change Restraint Duplicate Check/Change record with non blank input fields Low check no greter than High Check No Invalid placed date blank placed date',  null), new TestCaseBinding('Test Cases/Change Restraint Duplicate Check/Change record with non blank product code and account no fields and all other blank input fields less than High Check No', 'Test Cases/Change Restraint Duplicate Check/Change record with non blank product code and account no fields and all other blank input fields less than High Check No',  null)])
