import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://www.zenithbank.com/')

WebUI.waitForElementClickable(findTestObject('Continue'), 0)

WebUI.click(findTestObject('Continue'))

WebUI.mouseOver(findTestObject('Personal Banking'))

WebUI.mouseOverOffset(findTestObject('Personal Banking'), 0, 0)

WebUI.click(findTestObject('Bank Account'))

WebUI.verifyElementPresent(findTestObject('Current Account'), 0)

WebUI.verifyElementClickable(findTestObject('Current Account'))

WebUI.click(findTestObject('Individual Current Account Top'))

WebUI.click(findTestObject('Learn More'))

WebUI.scrollToElement(findTestObject('Page_Current Account - Zenith Bank Plc/Ind Current Account'), 0)

WebUI.click(findTestObject('Close Socials'))

WebUI.click(findTestObject('Page_Current Account - Zenith Bank Plc/a_FEATURES AND BENEFITS'))

//WebUI.scrollToElement(findTestObject('Page_Current Account - Zenith Bank Plc/li_Cheque book'), 0)
WebUI.verifyElementPresent(findTestObject('Page_Current Account - Zenith Bank Plc/li_Zero account opening balance'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Current Account - Zenith Bank Plc/li_Internet Banking'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Current Account - Zenith Bank Plc/li_Zenith Mobile Banking app'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Current Account - Zenith Bank Plc/li_966 Eazybanking'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Current Account - Zenith Bank Plc/li_MasterCardVisaVerve debit card'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Current Account - Zenith Bank Plc/li_EmailSMS Alertz'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Current Account - Zenith Bank Plc/li_Cheque book'), 0)

//WebUI.click(findTestObject('Page_Current Account - Zenith Bank Plc/a_FEATURES AND BENEFITS'))
WebUI.click(findTestObject('Page_Current Account - Zenith Bank Plc/a_REQUIREMENTS'))

//WebUI.scrollToElement(findTestObject('Page_Current Account - Zenith Bank Plc/li_Public Utility Receipt dated within the last three months (PHCN bill, water rate bill, tenement rate, rent receipt, telephone)'), 
//   0)
WebUI.verifyElementPresent(findTestObject('Page_Current Account - Zenith Bank Plc/li_Account opening form duly completed'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Current Account - Zenith Bank Plc/li_One recent clear passport photograph of signatory'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Current Account - Zenith Bank Plc/li_Identification of signatories (Drivers License, International Passport, National Identity Card or Voters Card)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Current Account - Zenith Bank Plc/li_Residence permit (where applicable)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Current Account - Zenith Bank Plc/li_Twoindependent and satisfactory references'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Current Account - Zenith Bank Plc/li_Public Utility Receipt dated within the last three months (PHCN bill, water rate bill, tenement rate, rent receipt, telephone)'), 
    0)

//WebUI.click(findTestObject('Page_Current Account - Zenith Bank Plc/a_REQUIREMENTS'))
WebUI.click(findTestObject('Page_Current Account - Zenith Bank Plc/a_AVAILABLE CHANNELS'))

//WebUI.scrollToElement(findTestObject('Page_Current Account - Zenith Bank Plc/li_Access your account using your Zenith Bank debit card at participating merchant stores for payment of goods and services'), 
//    0)
WebUI.verifyElementPresent(findTestObject('Page_Current Account - Zenith Bank Plc/li_966 EazyBanking (1)'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Current Account - Zenith Bank Plc/li_Zenith Internet Banking'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Current Account - Zenith Bank Plc/li_In-branch at any Zenith Bank branch (1)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Current Account - Zenith Bank Plc/li_ZenithDirect  our 247 telephone banking'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Current Account - Zenith Bank Plc/li_Zenith Bank ATM nation-wide  free cash withdrawal'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Current Account - Zenith Bank Plc/li_Zenith Mobile Banking app'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Current Account - Zenith Bank Plc/li_Access your account using your Zenith Bank debit card at participating merchant stores for payment of goods and services'), 
    0)

WebUI.click(findTestObject('Page_Current Account - Zenith Bank Plc/a_AVAILABLE CHANNELS'))

WebUI.closeBrowser()

