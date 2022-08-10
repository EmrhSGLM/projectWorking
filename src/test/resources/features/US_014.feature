Feature: US014

  Scenario: TC_1401 Doktorun hasta bilgilerini goruntulemesi ve guncellemesi

    When Kullanici URL'e gider
    And Login ikonuna tiklar
    And Sign in sekmesine tiklar
    And username girer
    And password girer
    And sign in butonuna tiklar
    And 1 saniye bekler
    And My pages sekmesine tiklar
    And My Inpatiens sekmesine tiklar
    And 1 saniye bekler
    Then duzenlemek istedigi hastanin satirindaki edit butonuna tiklar
    And 1 saniye bekler
     Then Kutucuklardaki bilgileri gorur ve gunceller
    And 1 saniye bekler
    And Guncelledigini dogrular





  Scenario: TC_1402 Statusun doktor tarafindan guncellemesi

    When Kullanici URL'e gider
    And Login ikonuna tiklar
    And Sign in sekmesine tiklar
    And username girer
    And password girer
    And sign in butonuna tiklar
    And 1 saniye bekler
    And My pages sekmesine tiklar
    And My Inpatiens sekmesine tiklar
    And 1 saniye bekler
    Then duzenlemek istedigi hastanin satirindaki edit butonuna tiklar
    And 1 saniye bekler
    Then Statusu gunceller
    And 1 saniye bekler
    Then statusu guncelledigini dogrular

  Scenario: TC_1403  Rezerve edilmis odanin doktor tarafindan guncellemesi

    When Kullanici URL'e gider
    And Login ikonuna tiklar
    And Sign in sekmesine tiklar
    And username girer
    And password girer
    And sign in butonuna tiklar
    And 1 saniye bekler
    And My pages sekmesine tiklar
    And My Inpatiens sekmesine tiklar
    And 1 saniye bekler
    Then duzenlemek istedigi hastanin satirindaki edit butonuna tiklar
    And 1 saniye bekler
    And Room kutucugunu gunceller
    And 1 saniye bekler
    Then room guncelledigini dogrular