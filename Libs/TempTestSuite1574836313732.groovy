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


suiteProperties.put('id', 'Test Suites/Create Sweep')

suiteProperties.put('name', 'Create Sweep')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\khaja.h\\Katalon Studio\\Z-Connect\\Reports\\Create Sweep\\20191127_120153\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Create Sweep', suiteProperties, [new TestCaseBinding('Test Cases/Create Sweep/Create a sweep for the DDA account for sweep type XF', 'Test Cases/Create Sweep/Create a sweep for the DDA account for sweep type XF',  null), new TestCaseBinding('Test Cases/Create Sweep/Create a sweep for the DDA account for sweep type CD and Account not unique', 'Test Cases/Create Sweep/Create a sweep for the DDA account for sweep type CD and Account not unique',  null), new TestCaseBinding('Test Cases/Create Sweep/Create a sweep for the DDA account for sweep type CD code missing', 'Test Cases/Create Sweep/Create a sweep for the DDA account for sweep type CD code missing',  null), new TestCaseBinding('Test Cases/Create Sweep/Create a sweep for the DDA account for sweep type OD', 'Test Cases/Create Sweep/Create a sweep for the DDA account for sweep type OD',  null), new TestCaseBinding('Test Cases/Create Sweep/Create a sweep for the DDA account for sweep type TB', 'Test Cases/Create Sweep/Create a sweep for the DDA account for sweep type TB',  null), new TestCaseBinding('Test Cases/Create Sweep/Create a sweep for the DDA account for sweep type TC', 'Test Cases/Create Sweep/Create a sweep for the DDA account for sweep type TC',  null), new TestCaseBinding('Test Cases/Create Sweep/Create a sweep for the DDA account for sweep type TD', 'Test Cases/Create Sweep/Create a sweep for the DDA account for sweep type TD',  null), new TestCaseBinding('Test Cases/Create Sweep/Create a sweep for the DDA account with out mandatory fields', 'Test Cases/Create Sweep/Create a sweep for the DDA account with out mandatory fields',  null), new TestCaseBinding('Test Cases/Create Sweep/Create a sweep for the DDA account duplicate driver presents', 'Test Cases/Create Sweep/Create a sweep for the DDA account duplicate driver presents',  null), new TestCaseBinding('Test Cases/Create Sweep/Create a sweep for the DDA account account number lass then origin', 'Test Cases/Create Sweep/Create a sweep for the DDA account account number lass then origin',  null), new TestCaseBinding('Test Cases/Create Sweep/Create a sweep for the DDA account for sweep type MF', 'Test Cases/Create Sweep/Create a sweep for the DDA account for sweep type MF',  null), new TestCaseBinding('Test Cases/Create Sweep/Create a sweep for the DDA account for sweep type OD inv instr cde for driver type', 'Test Cases/Create Sweep/Create a sweep for the DDA account for sweep type OD inv instr cde for driver type',  null), new TestCaseBinding('Test Cases/Create Sweep/Create a sweep for the DDA account for sweep type OD rel account info already exists', 'Test Cases/Create Sweep/Create a sweep for the DDA account for sweep type OD rel account info already exists',  null)])
