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

WebUI.verifyElementPresent(findTestObject('METALDOM_OR/AGREGAR_PREMIO_OR/Page_base-fe/span_Configuraciones de Premios'), 
    0)

WebUI.delay(4)

WebUI.click(findTestObject('METALDOM_OR/AGREGAR_PREMIO_OR/Page_base-fe/span_Configuraciones de Premios'))

WebUI.delay(3)

//ESTE CICLO "FOR" NOS AGREGARA UN NUEVO PREMIO POR CADA DATO QUE HAYA EN EL DATA FILE

for (def rowdata = 1; rowdata <= findTestData('Data Files/DATA METALDOM/AGREGAR_PREMIOS').getRowNumbers(); rowdata++) {
    WebUI.click(findTestObject('METALDOM_OR/AGREGAR_PREMIO_OR/Page_base-fe/a_Agregar'))

    WebUI.scrollToPosition(0, 15)

    WebUI.verifyElementPresent(findTestObject('METALDOM_OR/AGREGAR_PREMIO_OR/Page_base-fe/input_Nombre_name'), 0)

    WebUI.verifyElementPresent(findTestObject('METALDOM_OR/AGREGAR_PREMIO_OR/Page_base-fe/input_Descripcin_description'), 
        0)

    WebUI.verifyElementPresent(findTestObject('METALDOM_OR/AGREGAR_PREMIO_OR/Page_base-fe/input_Puntos requeridos_requiredPoints'), 
        0)

    WebUI.verifyElementPresent(findTestObject('METALDOM_OR/AGREGAR_PREMIO_OR/Page_base-fe/select_Premio para proveedores excelentes  Premios clientes Premium'), 
        0)

    WebUI.verifyElementPresent(findTestObject('METALDOM_OR/AGREGAR_PREMIO_OR/Page_base-fe/input_Disponibles_available'), 
        0)

    WebUI.verifyElementPresent(findTestObject('METALDOM_OR/AGREGAR_PREMIO_OR/Page_base-fe/span_Subir foto del premio'), 
        0)

    WebUI.scrollToElement(findTestObject('METALDOM_OR/AGREGAR_PREMIO_OR/Page_base-fe/input_Disponibles_available'), 0)

    WebUI.focus(findTestObject('METALDOM_OR/AGREGAR_PREMIO_OR/Page_base-fe/input_Nombre_name'))

    WebUI.setText(findTestObject('METALDOM_OR/AGREGAR_PREMIO_OR/Page_base-fe/input_Nombre_name'), findTestData('Data Files/DATA METALDOM/AGREGAR_PREMIOS').getValue(
            1, rowdata))

    WebUI.focus(findTestObject('METALDOM_OR/AGREGAR_PREMIO_OR/Page_base-fe/input_Descripcin_description'))

    WebUI.setText(findTestObject('METALDOM_OR/AGREGAR_PREMIO_OR/Page_base-fe/input_Descripcin_description'), findTestData(
            'Data Files/DATA METALDOM/AGREGAR_PREMIOS').getValue(2, rowdata))

    WebUI.focus(findTestObject('METALDOM_OR/AGREGAR_PREMIO_OR/Page_base-fe/input_Puntos requeridos_requiredPoints'))

    WebUI.setText(findTestObject('METALDOM_OR/AGREGAR_PREMIO_OR/Page_base-fe/input_Puntos requeridos_requiredPoints'), findTestData(
            'Data Files/DATA METALDOM/AGREGAR_PREMIOS').getValue(3, rowdata))

    WebUI.selectOptionByIndex(findTestObject('METALDOM_OR/AGREGAR_PREMIO_OR/Page_base-fe/select_Premio para proveedores excelentes  Premios clientes Premium'), 
        findTestData('DATA METALDOM/AGREGAR_PREMIOS').getValue(4, rowdata))

    WebUI.focus(findTestObject('METALDOM_OR/AGREGAR_PREMIO_OR/Page_base-fe/input_Disponibles_available'))

    WebUI.setText(findTestObject('METALDOM_OR/AGREGAR_PREMIO_OR/Page_base-fe/input_Disponibles_available'), findTestData(
            'Data Files/DATA METALDOM/AGREGAR_PREMIOS').getValue(5, rowdata))
	
	//WebUI.focus(  findTestObject('Object Repository/METALDOM_OR/AGREGAR_PREMIO_OR/Page_base-fe/span_Subir foto del premio')  )

    //WebUI.uploadFile(findTestObject('METALDOM_OR/AGREGAR_PREMIO_OR/Page_base-fe/span_Subir foto del premio'), 'C:\\Users\\joel_\\OneDrive\\Escritorio\\SOLVEX\\auriculares.jpg')

    WebUI.delay(3)

    WebUI.click(findTestObject('METALDOM_OR/AGREGAR_PREMIO_OR/Page_base-fe/button_Guardar'))

    WebUI.back()

    WebUI.refresh()
}

WebUI.click(findTestObject('Object Repository/METALDOM_OR/AGREGAR_PREMIO_OR/Page_base-fe/span_Configuraciones de Premios'))

WebUI.scrollToPosition(0, 40)

WebUI.delay(5)

WebUI.closeBrowser()

