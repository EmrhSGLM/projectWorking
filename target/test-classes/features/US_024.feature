Feature: US_024
  @Smoke
  Scenario: TC_2401

  Given cPatient url'e gider
    And cLogin ikonuna tiklar
    And cSign in sekmesine tiklar
    And cPatient username ve password girer
    And csign in butonuna tiklar
    And 1 saniye bekler
    And cMy pages patient sekmesine tiklar
    Then cMy Appointments sekmesine tiklar
    Then cShow test butonuna tiklar
    And 1 saniye bekler
    And cTest sayfasinin acildigini dogrular

    Scenario: TC_2402

      Given cPatient url'e gider
      And cLogin ikonuna tiklar
      And cSign in sekmesine tiklar
      And cPatient username ve password girer
      And csign in butonuna tiklar
      And 1 saniye bekler
      And cMy pages sekmesine tiklar
      Then cMy Appointments sekmesine tiklar
      Then Show invoice butonuna tiklar
      Then invoice syafasinin acildigini dogrular
