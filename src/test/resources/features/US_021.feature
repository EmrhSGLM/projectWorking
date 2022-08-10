Feature: US021
@TC2101
  Scenario: Staff sadece randevuları güncelleyebilir.
    Given : I-URL'e gider
    Then  : I-Sag ustte bulunan ikona tiklar
    And   : I-Sign in'e tiklar
    And   : I-Staff username girer
    And   : I-Staff password girer
    Then  : I-Sign in buttonuna tiklar
    And   : I-My Pages buttonunna tiklar
    And   : I-Search Patient seçenegine tiklar
    And   : I-Acilan sayfada Patients goruntulenir
    And   : I-Patient SSN ve box  goruntulenir
    And   : I-SSN box'a Patient SSN girilir
    Then  : I-Patient name Kate Karen oldugu dogrulanir
    And   : I-Show Appoitments tiklanir
    And   : I-Acilan sayfada Edit tiklanir
    And   : I-Status degistirilir
    And   : I-Prescription yazilir
    And   : I-Save buttonuna tiklanilir
    And   : I-Toast Conatainer goruntulenir
    And   : I-Tekrar  SSN box'a Patiet SSN girilir
    Then  : I-Edit tiklanir
    And   : I-Country degistirilir
    And   : I-Save butonuna tiklanir
    Then  : I-Kaydedilemedi toast containeri goruntulenir

@TC2102
  Scenario: Staff hasta durumunu (status)  "UNAPPROVED, PENDING veya CANCELLED" yapabilmeli ancak "COMPLETED" yapamamalı.
  Given : I-URL'e gider
  Then  : I-Sag ustte bulunan ikona tiklar
  And   : I-Sign in'e tiklar
  And   : I-Staff username girer
  And   : I-Staff password girer
  Then  : I-Sign in buttonuna tiklar
  And   : I-My Pages buttonunna tiklar
  And   : I-Search Patient seçenegine tiklar
  And   : I-Acilan sayfada Patients goruntulenir
  And   : I-Patient SSN ve box  goruntulenir
  And   : I-SSN box'a Patient SSN girilir
  Then  : I-Patient name Kate Karen oldugu dogrulanir
  And   : I-Show Appoitments tiklanir
  And   : I-Acilan sayfada Edit tiklanir
  Then  : I-Status PENDING olarak degistirilir
  And   : I-Status UNAPPROVED olarak degistirilir
  And   : I-Status CANCELLED olarak degistirilir
  Then  : I-Status COMPLATED olarak degistirilir


@TC2103
  Scenario: Staff "Anamnesis (Hastalık Geçmişi), Treatment ( Tedavi) veya Diagnosis(Teşhis)" kısımlarına girmemeli.
  Given : I-URL'e gider
  Then  : I-Sag ustte bulunan ikona tiklar
  And   : I-Sign in'e tiklar
  And   : I-Staff username girer
  And   : I-Staff password girer
  Then  : I-Sign in buttonuna tiklar
  And   : I-My Pages buttonunna tiklar
  And   : I-Search Patient seçenegine tiklar
  And   : I-Acilan sayfada Patients goruntulenir
  And   : I-Patient SSN ve box  goruntulenir
  And   : I-SSN box'a Patient SSN girilir
  Then  : I-Patient name Kate Karen oldugu dogrulanir
  And   : I-Show Appoitments tiklanir
  And   : I-Acilan sayfada Edit tiklanir
  And   : I-Anamnesis box girilemez
  And   : I-Treatement box girilemez
  And   : I-Diagnosis  box girilemez

@TC2104
Scenario: Hasta için gerekli doktoru seçebilmeli ve randevuyu oluşturmalı.
  Given : I-URL'e gider
  Then  : I-Sag ustte bulunan ikona tiklar
  And   : I-Sign in'e tiklar
  And   : I-Staff username girer
  And   : I-Staff password girer
  Then  : I-Sign in buttonuna tiklar
  And   : I-My Pages buttonunna tiklar
  And   : I-Search Patient seçenegine tiklar
  And   : I-Acilan sayfada Patients goruntulenir
  And   : I-Patient SSN ve box  goruntulenir
  And   : I-SSN box'a Patient SSN girilir
  Then  : I-Patient name Kate Karen oldugu dogrulanir
  And   : I-Show Appoitments tiklanir
  And   : I-Acilan sayfada Edit tiklanir
  And   : I-Patient icin gerekli Physician secilir
  And   : I-Save buttonuna tiklanir
  Then  : I-Save toast container goruntulenir