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

WebUI.callTestCase(findTestCase('Login/TEST-C1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(5)

//WebUI.click(findTestObject('INICIO/Page_base-fe/a_Inicio'))

//WebUI.click(findTestObject('INICIO/Page_base-fe/span_Inicio'))

WebUI.verifyElementPresent(findTestObject('INICIO/Page_base-fe/img'), 0)

WebUI.verifyElementPresent(findTestObject('INICIO/Page_base-fe/a_Inicio'), 0)

WebUI.verifyElementPresent(findTestObject('INICIO/Page_base-fe/a_Premios disponibles'), 0)

WebUI.verifyElementPresent(findTestObject('INICIO/Page_base-fe/a_Historial de solicitudes'), 0)

WebUI.verifyElementPresent(findTestObject('INICIO/Page_base-fe/a_Tipos de Premios'), 0)

WebUI.verifyElementPresent(findTestObject('INICIO/Page_base-fe/a_Configuraciones de Premios'), 0)

WebUI.verifyElementPresent(findTestObject('INICIO/Page_base-fe/a_Configuraciones de Puntos'), 0)

WebUI.verifyElementPresent(findTestObject('INICIO/Page_base-fe/a_Salir'), 0)

WebUI.verifyElementPresent(findTestObject('INICIO/Page_base-fe/h1_Bienvenido a Seguimiento de puntaje'), 0)

WebUI.verifyElementPresent(findTestObject('INICIO/Page_base-fe/i_Seguimiento de puntaje_fa fa-user-o'), 0)

WebUI.verifyElementPresent(findTestObject('INICIO/Page_base-fe/div_Seguimiento de puntaje'), 0)

WebUI.verifyElementPresent(findTestObject('INICIO/Page_base-fe/div_0TMToneladas facturadas  Mi historial'), 0)

WebUI.verifyElementPresent(findTestObject('INICIO/Page_base-fe/div_0Canjeos'), 0)

WebUI.verifyElementPresent(findTestObject('INICIO/Page_base-fe/div_Seguimiento de puntaje'), 0)

WebUI.verifyElementPresent(findTestObject('INICIO/Page_base-fe/button_Canjear puntos'), 0)

WebUI.verifyElementPresent(findTestObject('INICIO/Page_base-fe/button_Mi historial'), 0)

WebUI.verifyElementPresent(findTestObject('INICIO/Page_base-fe/button_Ver solicitudes'), 0)

WebUI.delay(1)

WebUI.verifyElementClickable(findTestObject('INICIO/Page_base-fe/a_Inicio'))

WebUI.verifyElementClickable(findTestObject('INICIO/Page_base-fe/a_Premios disponibles'))

WebUI.verifyElementClickable(findTestObject('INICIO/Page_base-fe/a_Historial de solicitudes'))

WebUI.verifyElementClickable(findTestObject('INICIO/Page_base-fe/a_Tipos de Premios'))

WebUI.verifyElementClickable(findTestObject('INICIO/Page_base-fe/a_Configuraciones de Premios'))

WebUI.verifyElementClickable(findTestObject('INICIO/Page_base-fe/a_Configuraciones de Puntos'))

WebUI.verifyElementClickable(findTestObject('INICIO/Page_base-fe/button_Canjear puntos'))

WebUI.verifyElementClickable(findTestObject('INICIO/Page_base-fe/button_Mi historial'))

WebUI.verifyElementClickable(findTestObject('INICIO/Page_base-fe/button_Ver solicitudes'))

WebUI.verifyElementClickable(findTestObject('INICIO/Page_base-fe/i_Seguimiento de puntaje_fa fa-user-o'))

