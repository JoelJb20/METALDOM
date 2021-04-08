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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://metaldomsx.b2clogin.com/metaldomsx.onmicrosoft.com/b2c_1_identity_provider/oauth2/v2.0/authorize?response_type=id_token&scope=openid%20profile&client_id=a8322c90-a407-4733-ab42-7befe6ab3e2c&redirect_uri=https%3A%2F%2Fsxmetaldomfe.azurewebsites.net%2F&state=eyJpZCI6IjFjNmNkMTJkLTY1YjYtNDc4ZS1hMjYwLTc5OTg5ZmRhNzk4MiIsInRzIjoxNjE3OTA2NTgwLCJtZXRob2QiOiJyZWRpcmVjdEludGVyYWN0aW9uIn0%3D&nonce=eb69c372-acb1-4163-8f5b-c25aec8069a5&client_info=1&x-client-SKU=MSAL.JS&x-client-Ver=msal&client-request-id=e9d838ff-741e-4e5e-8e48-e0c967052cf2&response_mode=fragment')

WebUI.verifyElementPresent(findTestObject('METALDOM_LOGIN/Page_Sign in/input_Username or email address_Username or email address'), 
    0)

WebUI.verifyElementPresent(findTestObject('METALDOM_LOGIN/Page_Sign in/input_Olvid su contrasea_Contrasea'), 0)

WebUI.focus(findTestObject('METALDOM_LOGIN/Page_Sign in/input_Username or email address_Username or email address'))

WebUI.setText(findTestObject('METALDOM_LOGIN/Page_Sign in/input_Username or email address_Username or email address'), GlobalVariable.USER_EMAIL)

WebUI.focus(findTestObject('METALDOM_LOGIN/Page_Sign in/input_Olvid su contrasea_Contrasea'))

WebUI.setText(findTestObject('METALDOM_LOGIN/Page_Sign in/input_Olvid su contrasea_Contrasea'), GlobalVariable.PASS_EMAIL)

WebUI.click(findTestObject('METALDOM_LOGIN/Page_Sign in/button_Iniciar sesin'))

WebUI.waitForPageLoad(3)

