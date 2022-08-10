@smoke
Feature: US002 Username ve email bos birakilamaz

  Scenario: TC_101 Username test

    When Kullanici URL'e gider
    And  Login ikonuna tiklar
    And Register sekmesini secer
    And 1 saniye bekler
    Then Username kutusunu bos birakarak diger kutucuklara bilgi girisi yapılır
    Then Register butonuna tıklar
    Then Your username is required yazisini gorur

  Scenario: TC_102 email test

    When Kullanici URL'e gider
    And  Login ikonuna tiklar
    And Register sekmesini secer
    And 1 saniye bekler
    Then Email kutusunu @ ve . karakterlerini kullanmadan doldurur ve diger kutucuklara bilgi girisi yapılır
    And 1 saniye bekler
    Then Register butonuna tıklar
    Then This field is invalid yazisini gorur

  Scenario: TC_103 email test

    When Kullanici URL'e gider
    And  Login ikonuna tiklar
    And Register sekmesini secer
    And 1 saniye bekler
    Then Email kutusunu  . karakteri kullanmadan doldurur ve diger kutucuklara bilgi girisi yapilir
    And 1 saniye bekler
    Then Register butonuna tıklar
    Then This field is invalid yazisini gorur

  Scenario: TC_104 email test
      When Kullanici URL'e gider
      And  Login ikonuna tiklar
      And Register sekmesini secer
      And 1 saniye bekler
      Then Email kutusunu  @ karakteri kullanmadan doldurur ve diger kutucuklara bilgi girisi yapilmali
      And 1 saniye bekler
      Then Register butonuna tıklar
      Then This field is invalid yazisini gorur

  Scenario: TC_105 email test
    When Kullanici URL'e gider
    And  Login ikonuna tiklar
    And Register sekmesini secer
    And 1 saniye bekler
    Then Email kutusunu bos birakir ve diger kutucuklara bilgi girisi yapilmali
    And 1 saniye bekler
    Then Register butonuna tıklar
   Then Your email is required yazisini gorur