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


//LLAMAMOS EL TEST CASE DE INICIO SESION MEDIANTE CORREO PARA PODER VER Y TENER TODAS LA OPCIONES

WebUI.callTestCase(findTestCase('TEST-METALDOM/TEST-C-LOGIN-CORREO'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('METALDOM_OR/BUSCADOR/Page_base-fe/span_Configuraciones de Premios'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('METALDOM_OR/BUSCADOR/Page_base-fe/span_Configuraciones de Premios'))


//ESTE CICLO "FOR" NOS VA A ITERAR UNA BUSQUEDA CON CADA UNO DE LOS DATOS AGREGADO EN EL DATA FILE

for (def rowdata = 1; rowdata <= findTestData('Data Files/DATA METALDOM/BUSQUEDA_PREMIOS').getRowNumbers(); rowdata++) {
    WebUI.waitForPageLoad(0)

    WebUI.scrollToPosition(0, 15)

    WebUI.verifyElementPresent(findTestObject('METALDOM_OR/BUSCADOR/Page_base-fe/input_Buscar por nombre_input is-medium'), 
        0)

    WebUI.focus(findTestObject('METALDOM_OR/BUSCADOR/Page_base-fe/input_Buscar por nombre_input is-medium'))

    WebUI.setText(findTestObject('Object Repository/METALDOM_OR/BUSCADOR/Page_base-fe/input_Buscar por nombre_input is-medium'), 
        findTestData('Data Files/DATA METALDOM/BUSQUEDA_PREMIOS').getValue(1, rowdata))

    WebUI.delay(3)

    WebUI.sendKeys(findTestObject('METALDOM_OR/BUSCADOR/Page_base-fe/input_Buscar por nombre_input is-medium'), Keys.chord(
            Keys.ENTER))

    WebUI.scrollToPosition(0, 20)

    WebUI.delay(3)

    WebUI.refresh()
}

WebUI.delay(3)

