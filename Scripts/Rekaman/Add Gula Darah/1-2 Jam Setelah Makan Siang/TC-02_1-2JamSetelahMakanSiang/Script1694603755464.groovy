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

Mobile.tap(findTestObject('Rekaman/btn_MasukanGulaDarah'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Rekaman/btn_Manual'), 0)

Mobile.tap(findTestObject('Rekaman/Input Gula Darah/Jenis Pemeriksaan/field_JenisPemeriksaan'), 0)

Mobile.tap(findTestObject('Rekaman/Input Gula Darah/Jenis Pemeriksaan/1-2 Jam Setelah Makan Siang/txtJenisPemeriksaan - 1-2 Jam Setelah Makan Siang'), 
    0)

Mobile.tap(findTestObject('Rekaman/Input Gula Darah/Masukkan Waktu/field_MasukanWaktu'), 0)

Mobile.setSliderValue(findTestObject('Rekaman/Input Gula Darah/Masukkan Waktu/txtMasukanWaktu - Jam'), 50, 10)

Mobile.tap(findTestObject('Rekaman/Input Gula Darah/Masukkan Waktu/btn_KonfirmasiWaktu'), 0)

Mobile.setText(findTestObject('Rekaman/Input Gula Darah/field_gulaDarah'), '145', 0)

Mobile.setText(findTestObject('Rekaman/Input Gula Darah/Makanan/1-2 Jam Setelah Makan Siang/field_MakanSiangSebelumnya'), 
    'Bakso', 0)

Mobile.takeScreenshot('C:\\TemanDiabetes\\1sd2 Jam Setelah Makan Siiang\\1.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Rekaman/Input Gula Darah/btnSelesai'), 0)

def txtKonfirmGulaDarah = Mobile.getText(findTestObject('Rekaman/Input Gula Darah/Konfirmasi Data/txtKonfirmasiData_GulaDarah'), 
    5)

Mobile.verifyEqual(txtKonfirmGulaDarah, '145 mg/dl')

def txtWaktu = Mobile.getText(findTestObject('Rekaman/Input Gula Darah/Konfirmasi Data/txtKonfirmasiData_Waktu'), 5)

Mobile.verifyEqual(txtWaktu, '1-2 Jam Setelah Makan Siang')

def txtSarapan = Mobile.getText(findTestObject('Rekaman/Input Gula Darah/Konfirmasi Data/txtKonfirmasiData_MakanSiang'), 
    5)

Mobile.verifyEqual(txtSarapan, 'Bakso')

Mobile.takeScreenshot('C:\\TemanDiabetes\\1sd2 Jam Setelah Makan Siiang\\2.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Rekaman/Input Gula Darah/Konfirmasi Data/btn_YaBenar'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('C:\\TemanDiabetes\\1sd2 Jam Setelah Makan Siiang\\3.png', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Rekaman/Input Gula Darah/Alert/alert_Berhasil'), 0)

