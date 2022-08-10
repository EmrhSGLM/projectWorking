Feature: US_028

  Scenario Outline: TC001 Kullanici yeni bir ulke olusturabilir

    Given Kullanici URL'e gider
    And    Sign in sayfasina gider
    Then ZKullanici Staff olarak giris yapar   "<username>" ve "<password>" girer
    Then ZItems Titles e tiklanir  Country secilir
    And ZCreate a new country tiklanir Name ve Created Date  doldurulur
    Then ZYeni country olusturuldugu dogrulanir

    Examples: Test Data
    |username | password|
    |Team89Admin |Batch44+|

  Scenario Outline: TC002 Kullanici, ulkeye göre ilgili eyaletler veya sehirler olusturabilmelidir.

      Given Kullanici URL'e gider
      And Sign in sayfasina gider
      Then ZKullanici Staff olarak giris yapar   "<username>" ve "<password>" girer
      And ZItems Titles e tiklanir  StateCity secilir
      And ZCreate a new StateCity tiklanir Name Created Date ve StateCity doldurulur  Save tiklanir
      And ZStateCity  olusturuldugu dogrulanir

      Examples: Test Data
        |username | password|
        |Team89Admin |Batch44+|


       Scenario :TC005   Kullanici bunlari DB ile dogrulamalidir

       Given Kullanici DataBase baglantısini kurar
       And Kullanici "country" tablosundan "*" lari alir
       And Kullanici "name" sutunundaki datalari okur
       And "name" sutununun "ANKARA" icerdigini dogrular
       And DataBase kapatir




  Scenario Outline: TC006 Kullanici ulkeleri silebilmelidir.

    Given  Kullanici URL'e gider
     And Sign in sayfasina gider
     Then ZKullanici Staff olarak giris yapar   "<username>" ve "<password>" girer
     Then ZItems Titles e tiklanir  Country secilir
     And ZKullanici delete tiklar country siler

     Examples: Test Data
       |username | password|
       |Team89Admin |Batch44+|