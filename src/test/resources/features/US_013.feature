Feature: Test Results islemleri

  Scenario: TC_1301 Test sonuçları doktor tarafindan gorulmesi

    When Kullanici URL'e gider
    And Login ikonuna tiklar
    And Sign in sekmesine tiklar
    And username girer
    And password girer
    And sign in butonuna tiklar
    And 1 saniye bekler
    And My pages sekmesine tiklar
    And My Appointments sekmesine tiklar
    And Test sonucunu görmek istedigi hastanin satirinda bulunan Edit butonuna tiklar
    And 1 saniye bekler
    And Show Test Results butonuna tiklar
    And 1 saniye bekler
    And doktor View Results butonuna tiklar
    And 1 saniye bekler
    And Test Resulsts sayfasinin acildigini gorur

    Scenario: Tc_1302 Doktorun hasta icin yatılı tedavi görmesi isteğinde bulunmasi

   When Kullanici URL'e gider
    And Login ikonuna tiklar
    And Sign in sekmesine tiklar
    And username girer
    And password girer
    And sign in butonuna tiklar
      And 1 saniye bekler
    And My pages sekmesine tiklar
    And My Appointments sekmesine tiklar
      And 1 saniye bekler
    And Test sonucunu görmek istedigi hastanin satirinda bulunan Edit butonuna tiklar
      And 1 saniye bekler
    And Request Inpatient butonuna tiklar
      And 1 saniye bekler
    And In patients sayfasinda hastayi gorur
