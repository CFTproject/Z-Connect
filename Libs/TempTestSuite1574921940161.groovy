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


suiteProperties.put('id', 'Test Suites/GetCustomerProfile')

suiteProperties.put('name', 'GetCustomerProfile')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\khaja.h\\Katalon Studio\\Z-Connect\\Reports\\GetCustomerProfile\\20191128_114900\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/GetCustomerProfile', suiteProperties, [new TestCaseBinding('Test Cases/GetCustomerProfile/GetCustomerProfile_Verify_Response_with_valid_Values', 'Test Cases/GetCustomerProfile/GetCustomerProfile_Verify_Response_with_valid_Values',  null), new TestCaseBinding('Test Cases/GetCustomerProfile/GetCustomerProfile_Verify_Response_with_Empty_Values', 'Test Cases/GetCustomerProfile/GetCustomerProfile_Verify_Response_with_Empty_Values',  null), new TestCaseBinding('Test Cases/GetCustomerProfile/GetCustomerProfile_Verify_Response__with_Invalid_Values', 'Test Cases/GetCustomerProfile/GetCustomerProfile_Verify_Response__with_Invalid_Values',  null)])
