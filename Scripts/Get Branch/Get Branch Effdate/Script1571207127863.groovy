import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

response = WS.sendRequest(findTestObject('Get Branch/Get Branch Effdate'))

WS.verifyResponseStatusCode(response, 200)

String str = 'getBranchServiceOperationResponse.RESPONSE.Output.'

testdatapath = findTestData('Z-Connect Test Data/Get Branch_TestData')

for (int i = 4; i < 5; i++) {
	
    println('EXCEL SHEET ROW NUMBER IS :' + i)
	
	WS.verifyElementPropertyValue(response, str+'XSTATUS.applicationCd', testdatapath.getValue(2, i))
	
	WS.verifyElementPropertyValue(response, str+'XSTATUS.statusCd', testdatapath.getValue(3, i))
	
	WS.verifyElementPropertyValue(response, str+'XSTATUS.statusMessage', testdatapath.getValue(4, i))
	
	WS.verifyElementPropertyValue(response, str+'XSTATUS.severity', testdatapath.getValue(5, i))
	
	WS.verifyElementPropertyValue(response, str+'owner', testdatapath.getValue(6, i))
	
	WS.verifyElementPropertyValue(response, str+'companyNbr', testdatapath.getValue(7, i))
	
	WS.verifyElementPropertyValue(response, str+'companyNbrFound', testdatapath.getValue(8, i))
	
	WS.verifyElementPropertyValue(response, str+'effectiveDate', testdatapath.getValue(9, i))
	
	WS.verifyElementPropertyValue(response, str+'effectiveDateFound', testdatapath.getValue(10, i))
	
	WS.verifyElementPropertyValue(response, str+'branchNbr', testdatapath.getValue(11, i))
	
	WS.verifyElementPropertyValue(response, str+'expireDate', testdatapath.getValue(12, i))
	
	WS.verifyElementPropertyValue(response, str+'branchName', testdatapath.getValue(13, i))
	
	WS.verifyElementPropertyValue(response, str+'branchAddress1', testdatapath.getValue(14, i))
	
	WS.verifyElementPropertyValue(response, str+'branchAddress2', testdatapath.getValue(15, i))
	
	WS.verifyElementPropertyValue(response, str+'branchAddress3', testdatapath.getValue(16, i))
	
	WS.verifyElementPropertyValue(response, str+'branchAreaCostCenter', testdatapath.getValue(17, i))
	
	WS.verifyElementPropertyValue(response, str+'branchAreaCode', testdatapath.getValue(18, i))
	
	WS.verifyElementPropertyValue(response, str+'branchPhoneNbr', testdatapath.getValue(19, i))
	
	WS.verifyElementPropertyValue(response, str+'branchPhoneExt', testdatapath.getValue(20, i))
	
	WS.verifyElementPropertyValue(response, str+'routingTransitNumber', testdatapath.getValue(21, i))
	
	WS.verifyElementPropertyValue(response, str+'branchRegion', testdatapath.getValue(22, i))
	
	WS.verifyElementPropertyValue(response, str+'branchDivision', testdatapath.getValue(23, i))
	
	WS.verifyElementPropertyValue(response, str+'branchCountry', testdatapath.getValue(24, i))
	
	WS.verifyElementPropertyValue(response, str+'branchCurrency', testdatapath.getValue(25, i))
	
	WS.verifyElementPropertyValue(response, str+'currencyConvTableId', testdatapath.getValue(26, i))
	
	WS.verifyElementPropertyValue(response, str+'bulkFileLocation', testdatapath.getValue(27, i))
	
	WS.verifyElementPropertyValue(response, str+'branchGeoLatitude', testdatapath.getValue(28, i))
	
	WS.verifyElementPropertyValue(response, str+'branchGeoLongitude', testdatapath.getValue(29, i))
	
	WS.verifyElementPropertyValue(response, str+'timeZone', testdatapath.getValue(30, i))
	
	WS.verifyElementPropertyValue(response, str+'lobbyOpenMondayTime', testdatapath.getValue(31, i))
	
	WS.verifyElementPropertyValue(response, str+'lobbyClosedMondayTime', testdatapath.getValue(32, i))
	
	WS.verifyElementPropertyValue(response, str+'lobbyOpenTuesdayTime', testdatapath.getValue(33, i))
	
	WS.verifyElementPropertyValue(response, str+'lobbyClosedTuesdayTime', testdatapath.getValue(34, i))
	
	WS.verifyElementPropertyValue(response, str+'lobbyOpenWednesdayTime', testdatapath.getValue(35, i))
	
	WS.verifyElementPropertyValue(response, str+'lobbyClosedWednesdayTime', testdatapath.getValue(36, i))
	
	WS.verifyElementPropertyValue(response, str+'lobbyOpenThursdayTime', testdatapath.getValue(37, i))
	
	WS.verifyElementPropertyValue(response, str+'lobbyClosedThursdayTime', testdatapath.getValue(38, i))
	
	WS.verifyElementPropertyValue(response, str+'lobbyOpenFridayTime', testdatapath.getValue(39, i))
	
	WS.verifyElementPropertyValue(response, str+'lobbyClosedFridayTime', testdatapath.getValue(40, i))
	
	WS.verifyElementPropertyValue(response, str+'lobbyOpenSaturdayTime', testdatapath.getValue(41, i))
	
	WS.verifyElementPropertyValue(response, str+'lobbyClosedSaturdayTime', testdatapath.getValue(42, i))
	
	WS.verifyElementPropertyValue(response, str+'lobbyOpenSundayTime', testdatapath.getValue(43, i))
	
	WS.verifyElementPropertyValue(response, str+'lobbyClosedSundayTime', testdatapath.getValue(44, i))
	
	WS.verifyElementPropertyValue(response, str+'driveUpOpenMondayTime', testdatapath.getValue(45, i))
	
	WS.verifyElementPropertyValue(response, str+'driveUpClosedMondayTime', testdatapath.getValue(46, i))
	
	WS.verifyElementPropertyValue(response, str+'driveUpOpenTuesdayTime', testdatapath.getValue(47, i))
	
	WS.verifyElementPropertyValue(response, str+'driveUpClosedTuesdayTime', testdatapath.getValue(48, i))
	
	WS.verifyElementPropertyValue(response, str+'driveUpOpenWednesdayTime', testdatapath.getValue(49, i))
	
	WS.verifyElementPropertyValue(response, str+'driveUpClosedWednesdayTime', testdatapath.getValue(50, i))
	
	WS.verifyElementPropertyValue(response, str+'driveUpOpenThursdayTime', testdatapath.getValue(51, i))
	
	WS.verifyElementPropertyValue(response, str+'driveUpClosedThursdayTime', testdatapath.getValue(52, i))
	
	WS.verifyElementPropertyValue(response, str+'driveUpOpenFridayTime', testdatapath.getValue(53, i))
	
	WS.verifyElementPropertyValue(response, str+'driveUpClosedFridayTime', testdatapath.getValue(54, i))
	
	WS.verifyElementPropertyValue(response, str+'driveUpOpenSaturdayTime', testdatapath.getValue(55, i))
	
	WS.verifyElementPropertyValue(response, str+'driveUpClosedSaturdayTime', testdatapath.getValue(56, i))
	
	WS.verifyElementPropertyValue(response, str+'driveUpOpenSundayTime', testdatapath.getValue(57, i))
	
	WS.verifyElementPropertyValue(response, str+'driveUpClosedSundayTime', testdatapath.getValue(58, i))
	
	WS.verifyElementPropertyValue(response, str+'atmOpenMondayTime', testdatapath.getValue(59, i))
	
	WS.verifyElementPropertyValue(response, str+'atmClosedMondayTime', testdatapath.getValue(60, i))
	
	WS.verifyElementPropertyValue(response, str+'atmOpenTuesdayTime', testdatapath.getValue(61, i))
	
	WS.verifyElementPropertyValue(response, str+'atmClosedTuesdayTime', testdatapath.getValue(62, i))
	
	WS.verifyElementPropertyValue(response, str+'atmOpenWednesdayTime', testdatapath.getValue(63, i))
	
	WS.verifyElementPropertyValue(response, str+'atmClosedWednesdayTime', testdatapath.getValue(64, i))
	
	WS.verifyElementPropertyValue(response, str+'atmOpenThursdayTime', testdatapath.getValue(65, i))
	
	WS.verifyElementPropertyValue(response, str+'atmClosedThursdayTime', testdatapath.getValue(66, i))
	
	WS.verifyElementPropertyValue(response, str+'atmOpenFridayTime', testdatapath.getValue(67, i))
	
	WS.verifyElementPropertyValue(response, str+'atmClosedFridayTime', testdatapath.getValue(68, i))
	
	WS.verifyElementPropertyValue(response, str+'atmOpenSaturdayTime', testdatapath.getValue(69, i))
	
	WS.verifyElementPropertyValue(response, str+'atmClosedSaturdayTime', testdatapath.getValue(70, i))
	
	WS.verifyElementPropertyValue(response, str+'atmOpenSundayTime', testdatapath.getValue(71, i))
	
	WS.verifyElementPropertyValue(response, str+'atmClosedSundayTime', testdatapath.getValue(72, i))
	
	WS.verifyElementPropertyValue(response, str+'branchFeaturedService01', testdatapath.getValue(73, i))
	
	WS.verifyElementPropertyValue(response, str+'branchFeaturedService02', testdatapath.getValue(74, i))
	
	WS.verifyElementPropertyValue(response, str+'branchFeaturedService03', testdatapath.getValue(75, i))
	
	WS.verifyElementPropertyValue(response, str+'branchFeaturedService04', testdatapath.getValue(76, i))
	
	WS.verifyElementPropertyValue(response, str+'branchFeaturedService05', testdatapath.getValue(77, i))
	
	WS.verifyElementPropertyValue(response, str+'branchFeaturedService06', testdatapath.getValue(78, i))
	
	WS.verifyElementPropertyValue(response, str+'branchFeaturedService07', testdatapath.getValue(79, i))
	
	WS.verifyElementPropertyValue(response, str+'branchFeaturedService08', testdatapath.getValue(80, i))
	
	WS.verifyElementPropertyValue(response, str+'branchFeaturedService09', testdatapath.getValue(81, i))
	
	WS.verifyElementPropertyValue(response, str+'branchFeaturedService10', testdatapath.getValue(82, i))
	
	WS.verifyElementPropertyValue(response, str+'lastChangeDate', testdatapath.getValue(83, i))
	
	WS.verifyElementPropertyValue(response, str+'lastChangeTime', testdatapath.getValue(84, i))
	
	WS.verifyElementPropertyValue(response, str+'lastChangeControlNbr', testdatapath.getValue(85, i))
	
	WS.verifyElementPropertyValue(response, str+'lastChangeSource', testdatapath.getValue(86, i))
	
	WS.verifyElementPropertyValue(response, str+'lastChangeOperator', testdatapath.getValue(87, i))
	

    
}

