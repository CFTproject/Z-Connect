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


suiteProperties.put('id', 'Test Suites/Get Account Profile')

suiteProperties.put('name', 'Get Account Profile')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\khaja.h\\Katalon Studio\\Z-Connect\\Reports\\Get Account Profile\\20191128_134424\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Get Account Profile', suiteProperties, [new TestCaseBinding('Test Cases/Get Account Profile/Individual account profile using non existing product code and numeric existing account no', 'Test Cases/Get Account Profile/Individual account profile using non existing product code and numeric existing account no',  null), new TestCaseBinding('Test Cases/Get Account Profile/Individual account profile using existing product code and non numeric account no', 'Test Cases/Get Account Profile/Individual account profile using existing product code and non numeric account no',  null), new TestCaseBinding('Test Cases/Get Account Profile/Individual account profile using existing product code and numeric account no', 'Test Cases/Get Account Profile/Individual account profile using existing product code and numeric account no',  null), new TestCaseBinding('Test Cases/Get Account Profile/Individual account profile using existing product code, numeric account no and company no', 'Test Cases/Get Account Profile/Individual account profile using existing product code, numeric account no and company no',  null), new TestCaseBinding('Test Cases/Get Account Profile/Individual account profile using existing product code and non existing numeric account no', 'Test Cases/Get Account Profile/Individual account profile using existing product code and non existing numeric account no',  null), new TestCaseBinding('Test Cases/Get Account Profile/Individual account profile using existing product code, numeric account no and company no for cross company account', 'Test Cases/Get Account Profile/Individual account profile using existing product code, numeric account no and company no for cross company account',  null), new TestCaseBinding('Test Cases/Get Account Profile/Individual account profile using existing product code, numeric account no and company no for cross company account but cross company no', 'Test Cases/Get Account Profile/Individual account profile using existing product code, numeric account no and company no for cross company account but cross company no',  null)])
