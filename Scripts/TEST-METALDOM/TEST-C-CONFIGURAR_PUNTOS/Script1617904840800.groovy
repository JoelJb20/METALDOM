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

WebUI.callTestCase(findTestCase('TEST-METALDOM/TEST-C-LOGIN-CORREO'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('METALDOM_OR/CONFIGURACION_PUNTOS_OR/Page_base-fe/span_Configuraciones de Puntos'), 
    0)

WebUI.waitForPageLoad(0)

WebUI.delay(4)

WebUI.click(findTestObject('METALDOM_OR/CONFIGURACION_PUNTOS_OR/Page_base-fe/span_Configuraciones de Puntos'))

WebUI.click(findTestObject('METALDOM_OR/CONFIGURACION_PUNTOS_OR/Page_base-fe/a_Agregar'))

WebUI.scrollToElement(findTestObject('METALDOM_OR/CONFIGURACION_PUNTOS_OR/Page_base-fe/input_Valor de Toneladas_tonsValue'), 
    0)

WebUI.focus(findTestObject('METALDOM_OR/CONFIGURACION_PUNTOS_OR/Page_base-fe/input_Nombre_name'))

WebUI.setText(findTestObject('METALDOM_OR/CONFIGURACION_PUNTOS_OR/Page_base-fe/input_Nombre_name'), GlobalVariable.PUNTOS_NOMBRE)

WebUI.focus(findTestObject('METALDOM_OR/CONFIGURACION_PUNTOS_OR/Page_base-fe/input_Descripcin_description'))

WebUI.setText(findTestObject('METALDOM_OR/CONFIGURACION_PUNTOS_OR/Page_base-fe/input_Descripcin_description'), GlobalVariable.PUNTOS_DESCRIPCION)

WebUI.focus(findTestObject('METALDOM_OR/CONFIGURACION_PUNTOS_OR/Page_base-fe/input_Valor de Puntos_pointsValue'))

WebUI.setText(findTestObject('METALDOM_OR/CONFIGURACION_PUNTOS_OR/Page_base-fe/input_Valor de Puntos_pointsValue'), GlobalVariable.PUNTOS_VALOR)

WebUI.focus(findTestObject('METALDOM_OR/CONFIGURACION_PUNTOS_OR/Page_base-fe/input_Valor de Toneladas_tonsValue'))

WebUI.setText(findTestObject('METALDOM_OR/CONFIGURACION_PUNTOS_OR/Page_base-fe/input_Valor de Toneladas_tonsValue'), GlobalVariable.PUNTOS_TONELADAS)

WebUI.selectOptionByIndex(findTestObject('METALDOM_OR/CONFIGURACION_PUNTOS_OR/Page_base-fe/select_Tipos de espiracin  Vencimiento por das  Vencimiento por meses  Vencimiento por aos'), 
    2)

WebUI.focus(findTestObject('METALDOM_OR/CONFIGURACION_PUNTOS_OR/Page_base-fe/input_Valor de tipo de expiracion_expirationTypeValue'))

WebUI.setText(findTestObject('METALDOM_OR/CONFIGURACION_PUNTOS_OR/Page_base-fe/input_Valor de tipo de expiracion_expirationTypeValue'), 
    GlobalVariable.PUNTOS_TIPOS_EXP)

WebUI.delay(3)

//WebUI.click(findTestObject('METALDOM_OR/CONFIGURACION_PUNTOS_OR/Page_base-fe/button_S_button is-medium is-primary'))

WebUI.delay(4)

WebUI.delay(3)

WebUI.click(findTestObject('METALDOM_OR/CONFIGURACION_PUNTOS_OR/Page_base-fe/span_Guardar'))

WebUI.delay(3)

