Feature: US_010 Doktor Randevuları

  Scenario: TC_1001 Doktor randevu listesini ve zaman dilimlerini testi
    Given Kullanici URL'e gider
    Then Sign in sayfasina gider
    And Doktor username ve password girer
    Then Sign in butonuna basar
    Then My Appointments butonuna basar
    And Randevu listesine ulaşildigini gorur
    Then Zaman dilimleri kutusuna erisebildigini gorur
  @emrah
  Scenario:TC_1002 Doktor "patient id, start date, end date, status" kutulari testi
    Given Kullanici URL'e gider
    Then Sign in sayfasina gider
    And Doktor username ve password girer
    And Sign in butonuna basar
    Then My Appointments butonuna basar
    Then patient id, start date, end date, status bilgilerini gorur