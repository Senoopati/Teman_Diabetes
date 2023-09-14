import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class AddGulaDarahStep {
	@Given("I want to add Gula Darah")
	def openTemanDiabetesku() {
		Mobile.startApplication('C:\\Users\\Senopati\\Downloads\\TemanDiabetes_1.7.20_Apkpure.apk', false)
	}

	@And("I go to menu Rekaman")
	def navigateMenuRekaman() {
		Mobile.tap(findTestObject('Rekaman/btnIcon_Rekaman'), 3)
	}

	@And("i tap Masukan Gula Darah icon")
	def tapMasukanGulaDarah() {
		Mobile.tap(findTestObject('Rekaman/Previous Date'), 3)
		Mobile.tap(findTestObject('Rekaman/btn_MasukanGulaDarah'), 5)
		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
	}

	@And("i choose Manual Mechanism")
	def chooseManual() {
		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
		Mobile.tap(findTestObject('Rekaman/btn_Manual'), 0)
	}

	@When("I select Jenis Pemeriksaan Gula Darah : Sebelum Makan Siang")
	def selectJenisPemeriksaanSebelumMakanSiang() {
		Mobile.tap(findTestObject('Rekaman/Input Gula Darah/Jenis Pemeriksaan/field_JenisPemeriksaan'), 0)
		Mobile.tap(findTestObject('Rekaman/Input Gula Darah/Jenis Pemeriksaan/Sebelum Makan Siang/txtJenisPemeriksaan - Sebelum Makan Siang'),
				0)
	}

	@And("i fill field Waktu")
	def selectTime() {
		Mobile.tap(findTestObject('Rekaman/Input Gula Darah/Masukkan Waktu/field_MasukanWaktu'), 0)
		Mobile.setSliderValue(findTestObject('Rekaman/Input Gula Darah/Masukkan Waktu/txtMasukanWaktu - Jam'), 50, 10)
		Mobile.tap(findTestObject('Rekaman/Input Gula Darah/Masukkan Waktu/btn_KonfirmasiWaktu'), 0)
	}

	@And("I fill field Gula Darah : (.*)")
	def fillGulaDarah(String gulaDarah) {
		Mobile.setText(findTestObject('Rekaman/Input Gula Darah/field_gulaDarah'), gulaDarah, 0)
	}

	@And("I fill field Sarapan Sebelumnya : (.*)")
	def fillSarapanSebelumnya(String SarapanSebelumnya) {
		Mobile.setText(findTestObject('Rekaman/Input Gula Darah/Makanan/Sebelum Makan Siang/field_SarapanAndaSebelumnya'), SarapanSebelumnya,
				0)
	}

	@And("I fill field Snack Pagi Sebelumnya : (.*)")
	def fillSnackPagiSebelumnya(String SnackPagiSebelumnya) {
		Mobile.setText(findTestObject('Rekaman/Input Gula Darah/Makanan/Sebelum Makan Siang/field_SnackPagiAndaSebelumnya'), SnackPagiSebelumnya,
				0)
	}

	@And("I tap button Selesai")
	def tapButtonSelesai() {
		Mobile.tap(findTestObject('Rekaman/Input Gula Darah/btnSelesai'), 0)
	}

	@Then("I able to see Konfirmasi Data pop up jenis pemeriksaan Sebelum Makan Siang")
	def popUpKonfirmasiSebelumMakanSiang() {
		def txtKonfirmGulaDarah = Mobile.getText(findTestObject('Rekaman/Input Gula Darah/Konfirmasi Data/txtKonfirmasiData_GulaDarah'),
				5)
		Mobile.verifyEqual(txtKonfirmGulaDarah, '128 mg/dl')

		def txtWaktu = Mobile.getText(findTestObject('Rekaman/Input Gula Darah/Konfirmasi Data/txtKonfirmasiData_Waktu'), 5)
		Mobile.verifyEqual(txtWaktu, 'Sebelum Makan Siang')

		def txtSarapan = Mobile.getText(findTestObject('Rekaman/Input Gula Darah/Konfirmasi Data/txtKonfirmasiData_Sarapan'), 5)
		Mobile.verifyEqual(txtSarapan, 'Nasi Goreng')

		def txtSnackPagi = Mobile.getText(findTestObject('Rekaman/Input Gula Darah/Konfirmasi Data/txtKonfirmasiData_SnackPagi'),
				5)
		Mobile.verifyEqual(txtSnackPagi, 'Kentang')
	}

	@And("I tap button Ya, Benar")
	def tapButtonYaKonfirmasiData() {
		Mobile.tap(findTestObject('Rekaman/Input Gula Darah/Konfirmasi Data/btn_YaBenar'), 0)
	}

	@And("I able to see alert Berhasil")
	def seeAlertBerhasil() {
		Mobile.verifyElementVisible(findTestObject('Rekaman/Input Gula Darah/Alert/alert_Berhasil'), 0)
	}

	@Then("I able to see Konfirmasi Data pop up jenis pemeriksaan 1sd2 Jam Setelah Makan Siang")
	def popUpKonfirmasi12JamSetelahMakanSiang(){
		def txtKonfirmGulaDarah = Mobile.getText(findTestObject('Rekaman/Input Gula Darah/Konfirmasi Data/txtKonfirmasiData_GulaDarah'),
				5)
		Mobile.verifyEqual(txtKonfirmGulaDarah, '145 mg/dl')

		def txtWaktu = Mobile.getText(findTestObject('Rekaman/Input Gula Darah/Konfirmasi Data/txtKonfirmasiData_Waktu'), 5)
		Mobile.verifyEqual(txtWaktu, '1-2 Jam Setelah Makan Siang')

		def txtSarapan = Mobile.getText(findTestObject('Rekaman/Input Gula Darah/Konfirmasi Data/txtKonfirmasiData_MakanSiang'),
				5)
		Mobile.verifyEqual(txtSarapan, 'Bakso')
	}

	@When("I select Jenis Pemeriksaan Gula Darah : 1sd2 Jam Setelah Makan Siang")
	def selectJenisPemeriksaan12JamSetelahMakanSiang() {
		Mobile.tap(findTestObject('Rekaman/Input Gula Darah/Jenis Pemeriksaan/field_JenisPemeriksaan'), 0)
		Mobile.tap(findTestObject('Rekaman/Input Gula Darah/Jenis Pemeriksaan/1-2 Jam Setelah Makan Siang/txtJenisPemeriksaan - 1-2 Jam Setelah Makan Siang'),
				0)
	}

	@And("I fill field Gula Darah 1sd2 Jam Setelah Makan Siang")
	def fillGulaDarah12JamSetelahMakanSiang() {
		Mobile.setText(findTestObject('Rekaman/Input Gula Darah/field_gulaDarah'), '145', 0)
	}

	@And("I fill field Makan Siang Sebelumnya")
	def fillMakanSiangSebelumnya() {
		Mobile.setText(findTestObject('Rekaman/Input Gula Darah/Makanan/1-2 Jam Setelah Makan Siang/field_MakanSiangSebelumnya'),
				'Bakso', 0)
	}

	@When("I select Jenis Pemeriksaan Gula Darah : Lainnya")
	def selectJenisPemeriksaanLainnya() {
		Mobile.tap(findTestObject('Rekaman/Input Gula Darah/Jenis Pemeriksaan/field_JenisPemeriksaan'), 0)
		Mobile.tap(findTestObject('Rekaman/Input Gula Darah/Jenis Pemeriksaan/Lainnya/txtJenisPemeriksaan- Lainnya'), 0)
	}

	@And("I fill field Gula Darah Lainnya")
	def fillGulaDarahLainnya() {
		Mobile.setText(findTestObject('Rekaman/Input Gula Darah/field_gulaDarah'), '121', 0)
	}

	@And("I fill field Makanan Sebelumnya")
	def fillMakananSebelumnya() {
		Mobile.setText(findTestObject('Rekaman/Input Gula Darah/Makanan/Lainnya/field_MakananAndaSebelumnya'), 'Mie Ayam', 0)
	}

	@Then("I able to see Konfirmasi Data pop up jenis pemeriksaan Lainnya")
	def popUpKonfirmasiLainnya() {
		def txtKonfirmGulaDarah = Mobile.getText(findTestObject('Rekaman/Input Gula Darah/Konfirmasi Data/txtKonfirmasiData_GulaDarah'),
				5)

		Mobile.verifyEqual(txtKonfirmGulaDarah, '121 mg/dl')

		def txtWaktu = Mobile.getText(findTestObject('Rekaman/Input Gula Darah/Konfirmasi Data/txtKonfirmasiData_Waktu'), 5)

		Mobile.verifyEqual(txtWaktu, 'Lainnya')

		def txtSarapan = Mobile.getText(findTestObject('Rekaman/Input Gula Darah/Konfirmasi Data/txtKonfirmasiData_MakanSiang'),
				5)

		Mobile.verifyEqual(txtSarapan, 'Mie Ayam')
	}
}