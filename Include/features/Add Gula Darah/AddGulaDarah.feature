@AddGulaDarah
Feature: Add Gula Darah Sebelum Makan Siang
  As User, I Want to add Gula Darah based on Jenis Pemeriksaan, So that succesfuly add Gula Darah

  Background: 
    Given I want to add Gula Darah
    And I go to menu Rekaman
    And i tap Masukan Gula Darah icon
    And i choose Manual Mechanism

  @TCSebelumMakanSiang
  Scenario Outline: Add Gula Darah with Jenis Pemeriksaan Sebelum Makan Siang
    When I select Jenis Pemeriksaan Gula Darah : Sebelum Makan Siang
    And i fill field Waktu
    And I fill field Gula Darah : <gulaDarah>
    And I fill field Sarapan Sebelumnya : <SarapanSebelumnya>
    And I fill field Snack Pagi Sebelumnya : <SnackPagiSebelumnya>
    And I tap button Selesai
    Then I able to see Konfirmasi Data pop up jenis pemeriksaan Sebelum Makan Siang
    And I tap button Ya, Benar
    And I able to see alert Berhasil

    Examples: 
      | gulaDarah | SarapanSebelumnya | SnackPagiSebelumnya |
      |       128 | Nasi Goreng       | Kentang             |

  @TC1-2JamSetelahMakanSiang
  Scenario: Add Gula Darah with Jenis Pemeriksaan 1-2 Jam Setelah Makan Siang
    When I select Jenis Pemeriksaan Gula Darah : 1sd2 Jam Setelah Makan Siang
    And i fill field Waktu
    And I fill field Gula Darah 1sd2 Jam Setelah Makan Siang
    And I fill field Makan Siang Sebelumnya 
    And I tap button Selesai
    Then I able to see Konfirmasi Data pop up jenis pemeriksaan 1sd2 Jam Setelah Makan Siang
    And I tap button Ya, Benar
    And I able to see alert Berhasil
    
  @TCLainnya
  Scenario: Add Gula Darah with Jenis Pemeriksaan Lainnya
    When I select Jenis Pemeriksaan Gula Darah : Lainnya
    And i fill field Waktu
    And I fill field Gula Darah Lainnya
    And I fill field Makanan Sebelumnya
    And I tap button Selesai
    Then I able to see Konfirmasi Data pop up jenis pemeriksaan Lainnya
    And I tap button Ya, Benar
    And I able to see alert Berhasil
    
    
