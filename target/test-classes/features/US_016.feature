Feature: US_16

  Background: giris
    Given FAdmin, Url' e gider
    And FAdmin,insan figurune basar
    And FAdmin, signIn buttonuna basar
    And FAdmin, username ve password girer
    And FAdmin, sign in tiklanir


  Scenario: TC_01

    Then FAdmin, giris yapildigini dogrular
    Given FAdmin, items&titles tiklanir
    And FRoom secilir
    And FCreate a new room tiklanir ve form doldurulur
  @Smoke
  Scenario: TC_02
    Given FAdmin, items&titles tiklanir
    And FRoom secilir
    And FCreate a new room tiklanir
    And FRoom Number bos birakilirsa "This field is required." hatasi verir
    Then FRoom type drapdowdan oda tipi secimi yapilabilmeli
  @Smoke
  Scenario: TC_03 Oda için "Status" ayarlanabilir olmalı.
    Given FAdmin, items&titles tiklanir
    And FRoom secilir
    And FCreate a new room tiklanir
    Then FStatus tiklanabilmeli
  @Smoke
  Scenario: TC_04 Fiyat eklenebilir olmalı ve boş bırakılamamalı.
    Given FAdmin, items&titles tiklanir
    And FRoom secilir
    And FCreate a new room tiklanir
    Then FPrice box bos birakilirsa "This field is required." hatasi verir

  Scenario: TC_05
    Given FAdmin, items&titles tiklanir
    And FRoom secilir
    And FCreate a new room tiklanir
    Then FDescription box bos birakilirsa "This field is required." hatasi vermez

  Scenario: TC_06
    Given FAdmin, items&titles tiklanir
    And FRoom secilir
    And FCreate a new room tiklanir
    Then FCreated Date gecmis tarih secildiginde  hata mesaji vermeli oda kayidi yapilmamali

  Scenario: TC_07
    Given FAdmin, items&titles tiklanir
    And FRoom secilir
    Then FRooms tablosunda room type tiklanir
  @Smoke
  Scenario Outline: TC_08 Admin mevcut odaları düzenleyebilir ve güncelleyebilir.
    Given FAdmin, items&titles tiklanir
    And FRoom secilir
    Then FRooms tablosunda istedigi "<id>" deki roomu editi tiklayarak guncelleme yapabilir
    Examples:
      | id |
      |  1451  |

  Scenario Outline: TC_10
    Given FAdmin, items&titles tiklanir
    And FRoom secilir
    Then FRooms tablosunda istedigi "<id>" deki roomu delete tiklayarak silebilir
    Examples:
      | id |
      |  1451  |

