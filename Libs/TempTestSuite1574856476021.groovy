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


suiteProperties.put('id', 'Test Suites/Change Customer')

suiteProperties.put('name', 'Change Customer')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\khaja.h\\Katalon Studio\\Z-Connect\\Reports\\Change Customer\\20191127_173755\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Change Customer', suiteProperties, [new TestCaseBinding('Test Cases/Change Customer/Change Customer For individual customer in CUMN screen', 'Test Cases/Change Customer/Change Customer For individual customer in CUMN screen',  null), new TestCaseBinding('Test Cases/Change Customer/Change Customer For individual customer in CUAI screen', 'Test Cases/Change Customer/Change Customer For individual customer in CUAI screen',  null), new TestCaseBinding('Test Cases/Change Customer/Change Customer For Business customer in CUCD screen', 'Test Cases/Change Customer/Change Customer For Business customer in CUCD screen',  null), new TestCaseBinding('Test Cases/Change Customer/Change Customer Bank service information for a idividual customer in CUBK screen', 'Test Cases/Change Customer/Change Customer Bank service information for a idividual customer in CUBK screen',  null), new TestCaseBinding('Test Cases/Change Customer/Change Customer Bank relationship information for a idividual customer in CUBK screen', 'Test Cases/Change Customer/Change Customer Bank relationship information for a idividual customer in CUBK screen',  null)])
