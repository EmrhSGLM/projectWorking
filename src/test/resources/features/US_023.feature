Feature: US_023

  Scenario: TC_2301
    Given cstaff url gider
    And cLogin ikonuna tiklar
    And cSign in sekmesine tiklar
    And cusername girer
    And cpassword girer
    And csign in butonuna tiklar
    And 1 saniye bekler
    And cMy pages sekmesine tiklar
  Then cSearch patient sekmesine tiklar
  Then cPatient SSN kismina data girilir
  Then cShow Appointments butonuna tiklar
  Then cShow invoices butonuna tiklar (page down)
  Then cinvoices sayfasini gordugunu dogrular

    Scenario: TC_2302

      Given cstaff url gider
      And cLogin ikonuna tiklar
      And cSign in sekmesine tiklar
      And cusername girer
      And cpassword girer
      And csign in butonuna tiklar
      And 1 saniye bekler
      And cMy pages sekmesine tiklar
      Then cSearch patient sekmesine tiklar
      Then cPatient SSN kismina data girilir
      Then cShow Appointments butonuna tiklar

