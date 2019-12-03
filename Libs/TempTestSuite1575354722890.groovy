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


suiteProperties.put('id', 'Test Suites/Create Hardhold Restraint')

suiteProperties.put('name', 'Create Hardhold Restraint')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\khaja.h\\Katalon Studio\\Z-Connect\\Reports\\Create Hardhold Restraint\\20191203_120202\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Create Hardhold Restraint', suiteProperties, [new TestCaseBinding('Test Cases/Create Hardhold Restraint/Create Hardhold Restraint Post Request Verify Response with valid Values', 'Test Cases/Create Hardhold Restraint/Create Hardhold Restraint Post Request Verify Response with valid Values',  [ 'statusMessage' : 'Mandatory fields can\'t be blank' , 'statusCd' : '1004' , 'severity' : 'E' , 'applicationCd' : '841' ,  ]), new TestCaseBinding('Test Cases/Create Hardhold Restraint/Create Hardhold Restraint Post Request Verify Response with Empty Values', 'Test Cases/Create Hardhold Restraint/Create Hardhold Restraint Post Request Verify Response with Empty Values',  [ 'statusMessage' : 'Mandatory fields can\'t be blank' , 'statusCd' : '1004' , 'severity' : 'E' , 'applicationCd' : '841' ,  ]), new TestCaseBinding('Test Cases/Create Hardhold Restraint/Create Hardhold Restraint Post Request Verify Response with Invalid Values', 'Test Cases/Create Hardhold Restraint/Create Hardhold Restraint Post Request Verify Response with Invalid Values',  null)])
