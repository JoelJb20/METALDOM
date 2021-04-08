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

WebUI.navigateToUrl('https://metaldomsx.b2clogin.com/metaldomsx.onmicrosoft.com/b2c_1_identity_provider/oauth2/v2.0/authorize?response_type=id_token&scope=openid%20profile&client_id=a8322c90-a407-4733-ab42-7befe6ab3e2c&redirect_uri=https%3A%2F%2Fsxmetaldomfe.azurewebsites.net%2F&state=eyJpZCI6IjhlOTU4ODQ1LWQ4Y2EtNGY3Yi1hNDFkLTc4YWNiMTI5MTMxMCIsInRzIjoxNjE3NjUxNjY0LCJtZXRob2QiOiJyZWRpcmVjdEludGVyYWN0aW9uIn0%3D&nonce=87565306-19d8-4383-860f-36a482ecb546&client_info=1&x-client-SKU=MSAL.JS&x-client-Ver=msal&client-request-id=ee1885fb-0756-44b0-99f3-78069dd6feee&response_mode=fragment')

// AQUI VERIFICAREMOS LA PRESENCIA DE TODOS LOS ELEMENTOS QUE COMPONEN ESTA PATALLA
WebUI.verifyElementPresent(findTestObject('LOGIN_OR/Page_Sign in/input_Username or email address_Username or email address'), 
    0)

WebUI.verifyElementPresent(findTestObject('LOGIN_OR/Page_Sign in/input_Olvid su contrasea_Contrasea'), 0)

WebUI.verifyElementPresent(findTestObject('LOGIN_OR/Page_Sign in/button_Iniciar sesin'), 0)

WebUI.verifyElementPresent(findTestObject('LOGIN_OR/Page_Sign in/img__companyLogo'), 0)

WebUI.verifyElementPresent(findTestObject('LOGIN_OR/Page_Sign in/font_No tienes una cuenta'), 0)

WebUI.verifyElementPresent(findTestObject('LOGIN_OR/Page_Sign in/font_Regstrate ahora'), 0)

WebUI.verifyElementPresent(findTestObject('LOGIN_OR/Page_Sign in/h2_Inicie sesin con su cdula o correo'), 0)

WebUI.verifyElementPresent(findTestObject('LOGIN_OR/Page_Sign in/a_Olvid su contrasea'), 0)

//AQUI TERMINA LA VERFICACION DE LOS ELEMENTOS DE LA PANTALLA DEL LOGIN
//-----------------------------------------------------------------------------------------------------------------------------------------
//AHORA LE VAMOS A DAR LOS VALORES CORRESPONDIENTES A LOS CAMPOS, PARA PODER ENTRAR A LA PAGINA.
WebUI.click(findTestObject('LOGIN_OR/Page_Sign in/input_Username or email address_Username or email address'))

WebUI.focus(findTestObject('LOGIN_OR/Page_Sign in/input_Username or email address_Username or email address'))

//ASIGNAMOS EL NOMBRE DE USUARIO
WebUI.setText(findTestObject('LOGIN_OR/Page_Sign in/input_Username or email address_Username or email address'), GlobalVariable.USER_VAL)

WebUI.click(findTestObject('LOGIN_OR/Page_Sign in/input_Olvid su contrasea_Contrasea'))

WebUI.focus(findTestObject('LOGIN_OR/Page_Sign in/input_Olvid su contrasea_Contrasea'))

//ASIGNAMOS LA CONTRASEÑA 
WebUI.setText(findTestObject('LOGIN_OR/Page_Sign in/input_Olvid su contrasea_Contrasea'), GlobalVariable.PASS_VAL)

WebUI.verifyElementClickable(findTestObject('LOGIN_OR/Page_Sign in/button_Iniciar sesin'))

//DAMOS CLICK AL NOTON ¨INICIAR SESION¨ PARA INGRESAR
WebUI.click(findTestObject('LOGIN_OR/Page_Sign in/button_Iniciar sesin'))

