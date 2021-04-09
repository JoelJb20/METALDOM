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

WebUI.waitForPageLoad(3)

WebUI.delay(6)

WebUI.verifyElementPresent(findTestObject('METALDOM_OR/TIPOS_PREMIOS/Page_base-fe/span_Tipos de Premios'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('METALDOM_OR/TIPOS_PREMIOS/Page_base-fe/span_Tipos de Premios'))

WebUI.delay(2)


for (def rowdata = 1; rowdata <= findTestData('Data Files/DATA METALDOM/TIPOS_PREMIOS').getRowNumbers(); rowdata++) {
	
		
	WebUI.click(findTestObject('METALDOM_OR/TIPOS_PREMIOS/Page_base-fe/a_Agregar'))
	
	WebUI.focus(findTestObject('METALDOM_OR/TIPOS_PREMIOS/Page_base-fe/input_Nombre_name'))
	
	WebUI.setText(findTestObject('METALDOM_OR/TIPOS_PREMIOS/Page_base-fe/input_Nombre_name'), findTestData('Data Files/DATA METALDOM/TIPOS_PREMIOS').getValue(1, rowdata))
	
	WebUI.focus(findTestObject('METALDOM_OR/TIPOS_PREMIOS/Page_base-fe/input_Descripcin_description'))
	
	WebUI.setText(findTestObject('METALDOM_OR/TIPOS_PREMIOS/Page_base-fe/input_Descripcin_description'),  findTestData('Data Files/DATA METALDOM/TIPOS_PREMIOS').getValue(2, rowdata))
	
	WebUI.delay(3)
	
	WebUI.click(findTestObject('METALDOM_OR/TIPOS_PREMIOS/Page_base-fe/button_Guardar'))
	
	WebUI.delay(3)
	
	
}



WebUI.delay(4)

WebUI.closeBrowser()

