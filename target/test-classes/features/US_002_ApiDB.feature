Feature: US002_ApiDB

  Scenario: TC_2303 Api email test
    # Given kullanici path params ayarlar
    Given  kullanici token olusturur
    Then kullanici emaili dogrular

  Scenario Outline: TC_2304 email dogrulama
    Given kullanici veritabanina baglanir
    And "email" sutunundaki verileri secer
    Then kullanici "<email>" dogrulamasi yapar
    Then veritabani ile bağlantiyi sonlandirir


    Examples:
      | email |
      |team88@medunna.com|
      |team89@medunna.com|
      |team90@medunna.com|