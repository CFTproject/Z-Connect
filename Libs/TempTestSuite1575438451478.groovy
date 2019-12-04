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


suiteProperties.put('id', 'Test Suites/Change Restraint Stop Pay')

suiteProperties.put('name', 'Change Restraint Stop Pay')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\khaja.h\\Katalon Studio\\Z-Connect\\Reports\\Change Restraint Stop Pay\\20191204_111731\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Change Restraint Stop Pay', suiteProperties, [new TestCaseBinding('Test Cases/Change Restraint Stop Pay/Change Check date Last Check Returne date and Stp Payee', 'Test Cases/Change Restraint Stop Pay/Change Check date Last Check Returne date and Stp Payee',  null), new TestCaseBinding('Test Cases/Change Restraint Stop Pay/Change Stp Checks Out Standing Nbr Checks Returned Nbr restraint Stp Comment1 and Comment2 Reason1 Reason2', 'Test Cases/Change Restraint Stop Pay/Change Stp Checks Out Standing Nbr Checks Returned Nbr restraint Stp Comment1 and Comment2 Reason1 Reason2',  null), new TestCaseBinding('Test Cases/Change Restraint Stop Pay/Change No fields Mandatory fields and prod code blank Mandatory field Account Number Zero Mandatory field type zero', 'Test Cases/Change Restraint Stop Pay/Change No fields Mandatory fields and prod code blank Mandatory field Account Number Zero Mandatory field type zero',  null), new TestCaseBinding('Test Cases/Change Restraint Stop Pay/Change Mandatory field restraint Stp VarKey High Check Nbr zero Low Check Nbr zero High Check Amt zero Low Check Amt zero', 'Test Cases/Change Restraint Stop Pay/Change Mandatory field restraint Stp VarKey High Check Nbr zero Low Check Nbr zero High Check Amt zero Low Check Amt zero',  null), new TestCaseBinding('Test Cases/Change Restraint Stop Pay/Change Mandatory field restraint Stp VarKey Expire Date blank and Placed Date blank', 'Test Cases/Change Restraint Stop Pay/Change Mandatory field restraint Stp VarKey Expire Date blank and Placed Date blank',  null)])
