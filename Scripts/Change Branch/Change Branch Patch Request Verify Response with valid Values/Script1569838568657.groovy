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

String str = 'changeBranchServiceOperationResponse.RESPONSE.Output.XSTATUS.'

testdatapath = findTestData('Z-Connect Test Data/Change Branch_TestData')

for (int i = 1; i < 6; i++) {
    println('EXCEL SHEET ROW NUMBER IS : ' + i)

    //Change branch name
    if (i == 1) {
        response = WS.sendRequest(findTestObject('Change Branch/Change branch name', [('branchNbr') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        4, i), ('owner') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(5, i), ('changeControlNbr') : findTestData(
                        'Z-Connect Test Data/Change Branch_TestData').getValue(6, i), ('lastChangeDate') : findTestData(
                        'Z-Connect Test Data/Change Branch_TestData').getValue(7, i), ('lastChangeTime') : findTestData(
                        'Z-Connect Test Data/Change Branch_TestData').getValue(8, i), ('branchName') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        9, i)]))
    }
    
    //Change branch address 1-3
    if (i == 2) {
        response = WS.sendRequest(findTestObject('Change Branch/Change branch address 1-3', [('branchNbr') : findTestData(
                        'Z-Connect Test Data/Change Branch_TestData').getValue(4, i), ('owner') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        5, i), ('changeControlNbr') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        6, i), ('lastChangeDate') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        7, i), ('lastChangeTime') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        8, i), ('branchAddress1') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        10, i), ('branchAddress2') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        11, i), ('branchAddress3') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        12, i)]))
    }
    
    //Change Lobby OP CL hours
    if (i == 3) {
        response = WS.sendRequest(findTestObject('Change Branch/Change Lobby OP CL hours', [('branchNbr') : findTestData(
                        'Z-Connect Test Data/Change Branch_TestData').getValue(4, i), ('owner') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        5, i), ('changeControlNbr') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        6, i), ('lastChangeDate') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        7, i), ('lastChangeTime') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        8, i), ('lobbyOpenMondayTime') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        26, i), ('lobbyClosedMondayTime') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        27, i), ('lobbyOpenTuesdayTime') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        28, i), ('lobbyClosedTuesdayTime') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        29, i), ('lobbyOpenWednesdayTime') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        30, i), ('lobbyClosedWednesdayTime') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        31, i), ('lobbyOpenThursdayTime') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        32, i), ('lobbyClosedThursdayTime') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        33, i), ('lobbyOpenFridayTime') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        34, i), ('lobbyClosedFridayTime') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        35, i), ('lobbyOpenSaturdayTime') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        36, i), ('lobbyClosedSaturdayTime') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        37, i), ('lobbyOpenSundayTime') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        38, i), ('lobbyClosedSundayTime') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        39, i)]))
    }
    
    //Change Driveup OP CL hours
    if (i == 4) {
        response = WS.sendRequest(findTestObject('Change Branch/Change Driveup OP CL hours', [('branchNbr') : findTestData(
                        'Z-Connect Test Data/Change Branch_TestData').getValue(4, i), ('owner') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        5, i), ('changeControlNbr') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        6, i), ('lastChangeDate') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        7, i), ('lastChangeTime') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        8, i), ('driveUpOpenMondayTime') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        40, i), ('driveUpClosedMondayTime') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        41, i), ('driveUpOpenTuesdayTime') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        42, i), ('driveUpClosedTuesdayTime') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        43, i), ('driveUpOpenWednesdayTime') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        44, i), ('driveUpClosedWednesdayTime') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        45, i), ('driveUpOpenThursdayTime') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        46, i), ('driveUpClosedThursdayTime') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        47, i), ('driveUpOpenFridayTime') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        48, i), ('driveUpClosedFridayTime') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        49, i), ('driveUpOpenSaturdayTime') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        50, i), ('driveUpClosedSaturdayTime') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        51, i), ('driveUpOpenSundayTime') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        52, i), ('driveUpClosedSundayTime') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        53, i)]))
    }
    
    //Change ATM OP CL hours
    if (i == 5) {
        response = WS.sendRequest(findTestObject('Change Branch/Change ATM OP CL hours', [('branchNbr') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(
                        4, i), ('owner') : findTestData('Z-Connect Test Data/Change Branch_TestData').getValue(5, i), ('changeControlNbr') : findTestData(
                        'Z-Connect Test Data/Change Branch_TestData').getValue(6, i), ('lastChangeDate') : findTestData(
                        'Z-Connect Test Data/Change Branch_TestData').getValue(7, i), ('lastChangeTime') : findTestData(
                        'Z-Connect Test Data/Change Branch_TestData').getValue(8, i), ('atmOpenMondayTime') : findTestData(
                        'Z-Connect Test Data/Change Branch_TestData').getValue(54, i), ('atmClosedMondayTime') : findTestData(
                        'Z-Connect Test Data/Change Branch_TestData').getValue(55, i), ('atmOpenTuesdayTime') : findTestData(
                        'Z-Connect Test Data/Change Branch_TestData').getValue(56, i), ('atmClosedTuesdayTime') : findTestData(
                        'Z-Connect Test Data/Change Branch_TestData').getValue(57, i), ('atmOpenWednesdayTime') : findTestData(
                        'Z-Connect Test Data/Change Branch_TestData').getValue(58, i), ('atmClosedWednesdayTime') : findTestData(
                        'Z-Connect Test Data/Change Branch_TestData').getValue(59, i), ('atmOpenThursdayTime') : findTestData(
                        'Z-Connect Test Data/Change Branch_TestData').getValue(60, i), ('atmClosedThursdayTime') : findTestData(
                        'Z-Connect Test Data/Change Branch_TestData').getValue(61, i), ('atmOpenFridayTime') : findTestData(
                        'Z-Connect Test Data/Change Branch_TestData').getValue(62, i), ('atmClosedFridayTime') : findTestData(
                        'Z-Connect Test Data/Change Branch_TestData').getValue(63, i), ('atmOpenSaturdayTime') : findTestData(
                        'Z-Connect Test Data/Change Branch_TestData').getValue(64, i), ('atmClosedSaturdayTime') : findTestData(
                        'Z-Connect Test Data/Change Branch_TestData').getValue(65, i), ('atmOpenSundayTime') : findTestData(
                        'Z-Connect Test Data/Change Branch_TestData').getValue(66, i), ('atmClosedSundayTime') : findTestData(
                        'Z-Connect Test Data/Change Branch_TestData').getValue(67, i)]))
    }
    
    WS.verifyResponseStatusCode(response, 200)

    WS.verifyElementPropertyValue(response, str + 'applicationCd', testdatapath.getValue(79, i))

    WS.verifyElementPropertyValue(response, str + 'statusCd', testdatapath.getValue(80, i))

    WS.verifyElementPropertyValue(response, str + 'statusMessage', testdatapath.getValue(81, i))

    WS.verifyElementPropertyValue(response, str + 'severity', testdatapath.getValue(82, i))
}