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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver
import io.appium.java_client.TouchAction as TouchAction
import io.appium.java_client.touch.offset.PointOption as PointOption

WebUI.callTestCase(findTestCase('Rekaman/Add Gula Darah/Sebelum Makan Siang/TC02_OnlyFillJenisPemeriksaan'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Rekaman/Input Gula Darah/Masukkan Waktu/field_MasukanWaktu'), 0)

Mobile.tap(findTestObject('Rekaman/Input Gula Darah/Masukkan Waktu/buttom_waktu'), 0)

Mobile.setSliderValue(findTestObject('Rekaman/Input Gula Darah/Masukkan Waktu/buttom_waktu'), 50, 10)

Mobile.tap(findTestObject('Rekaman/Input Gula Darah/Masukkan Waktu/btn_KonfirmasiWaktu'), 0)

def messageError = Mobile.getText(findTestObject('Rekaman/Input Gula Darah/Alert/alert - Waktu tidak boleh lebih dari jam saat ini'), 
    5)

Mobile.verifyEqual(messageError, 'Waktu tidak boleh lebih dari jam saat ini')

Mobile.tap(findTestObject('Rekaman/Input Gula Darah/Alert/btn_PilihUlangWaktuLebihDariSekarang'), 0)

