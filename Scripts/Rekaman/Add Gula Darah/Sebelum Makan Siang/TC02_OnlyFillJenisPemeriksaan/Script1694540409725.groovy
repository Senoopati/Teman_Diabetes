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

WebUI.callTestCase(findTestCase('Rekaman/Add Gula Darah/TC01_AllFieldEmpty'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Rekaman/Input Gula Darah/Jenis Pemeriksaan/field_JenisPemeriksaan'), 0)

Mobile.tap(findTestObject('Rekaman/Input Gula Darah/Jenis Pemeriksaan/Sebelum Makan Siang/txtJenisPemeriksaan - Sebelum Makan Siang'), 
    0)

Mobile.tap(findTestObject('Rekaman/Input Gula Darah/btn_Selesai'), 0)

def messageError = Mobile.getText(findTestObject('Rekaman/Input Gula Darah/Alert/alert_OnlySelectJenisPemeriksaanSebelumMakanSiang'), 
    5)

Mobile.verifyEqual(messageError, 'Waktu tidak boleh kosong\nGula darah tidak boleh kosong\nSarapan tidak boleh kosong\nSnack Pagi tidak boleh kosong')

Mobile.tap(findTestObject('Rekaman/Input Gula Darah/Alert/btn_OkEmptyField'), 0)

