Feature: US_017


Scenario Outline: TC_1701 Admin yeni test öğeleri oluşturabilir
  Given Kullanici URL'e gider
  And Sign in sayfasina gider
  And E "<username>" ve "<password>" girer
  And E Sign in butonuna basar
  And E Admin olarak giris yaptıgını dogrular
  And E Items&Title butonuna tıklar
  Then E Test Item sayfasina gider
  And E Create a new Test Item sayfasına gider
  And E Name, Description, Price, Default min Value, Created Date kutularına bilgi girisi yapılır
  And  E Save butonuna tıklar
  And E Kayıt isleminin gerceklestigini dogrular
  And Browseri kapatir


  Examples: test data
    |username|password|
    |ADMINEmrah|Amine2016+-|


Scenario Outline: TC_1702 Admin, "test items" olusturabilir ve güncelleyebilir.
  Given Kullanici URL'e gider
  And Sign in sayfasina gider
  And E "<username>" ve "<password>" girer
  And E Sign in butonuna basar
  And E Admin olarak giris yaptıgını dogrular
  And E Items&Title butonuna tıklar
  Then E Test Item sayfasina gider
  And  E Son sayfaya gider
  Then  E Oluşturdugu testi gorur
  And Edit butonuna tıklar
  And Name, Description, Price, Default min Value, Created Date kutularına bilgilerini gunceller
  And Save butonuna basar
  And Guncellendigini dogrular

  Examples: test data
    |username|password|
    |ADMINEmrah|Amine2016+-|
  @Smoke
  Scenario Outline:TC_1703 Admin test öğelerini görüntüleyebilir.
    Given Kullanici URL'e gider
    And Sign in sayfasina gider
    And E "<username>" ve "<password>" girer
    And E Sign in butonuna basar
    And E Admin olarak giris yaptıgını dogrular
    And E Items&Title butonuna tıklar
    Then E Test Item sayfasina gider
    And  Test items goruntuleyebildigini dogrular
    And sign out butonuna basar

  Examples: test data
    |username|password|
    |ADMINEmrah|Amine2016+-|


Scenario Outline: TC_1704 Admin test öğelerini silebilir.
  Given Kullanici URL'e gider
  And Sign in sayfasina gider
  And E "<username>" ve "<password>" girer
  And E Sign in butonuna basar
  And E Admin olarak giris yaptıgını dogrular
  And E Items&Title butonuna tıklar
  Then E Test Item sayfasina gider
  And  E Son sayfaya gider
  Then  E Oluşturdugu testi gorur
  And E Delete butonuna butonu_tiklanir
  And E Delete islemini onaylar
  And E Silindigini dogrular

  Examples: test data
    |username|password|
    |ADMINEmrah|Amine2016+-|


Scenario: TC_1705 API ile doğrulayın.
    Given Kullanıcı gerekli get icin path params ayarını yapar
    And Kullanıcı items ile alakalı expected dataları olusturur
    And Kullanıcı request gonderiri ve response alır
    And E Kullanıcı response status sorgusunu yapar
    And Kullanıcı dogrulama islemini yapar


Scenario Outline: TC_1706 API ile test items oluşturun.
    Given Kullanıcı gerekli path params ayarını yapar
    Then Kullanıcı items ile alakalı expected dataları "<name>","<description>", "<price>", "<defMinVal>", "<defMaxVal>" girer
    And Kullanıcı request gonderirir ve response alır
    Then Kullanıcı response status sorgusunu yapar
    And Kullanıcı API kayıtlarını dosyaya kaydeder
    Then Kullanıcı API kayıtlarını dogrular

    Examples: test data
      |name|description|price|defMinVal|defMaxVal|
      |Ali |Test013    |501  |1.5      |1.7      |


  Scenario: TC_1707 DB ile test items leri doğrulayın.
    Given EKullanici DataBase baglantısini kurar
    And EKullanici "c_test_item" tablosundan "*" lari alir
    And EKullanici "name" sutunundaki datalari okur
    And E"name" sutununun "Potassium" icerdigini dogrular
    And EDataBase kapatir


  Scenario: TC_1708 API ile gerçekleştirilen randevuları doğrulayın
    Given EKullanıcı randevu sorgusu icin get path params ayarını yapar
    And EKullanıcı randevular ile alakalı expected dataları olusturur
    And EKullanıcı randevu icin request gonderirir ve response alır
    And EKullanıcı  response status sorgusunu yapar
    And EKullanıcı randevu dogrulama islemini yapar

  @emrahh
  Scenario: TC_1709 DB ile gerçekleştiilen randevuları doğrulayın
    Given E1Kullanici DataBase baglantısini kurar
    And E1Kullanici "appointment" tablosundan "*" lari alir
    And E1Kullanici icin  "id" sutunundaki datalari okur
    And E "id" sutununun "3409" appointments icerdigini dogrular
    And E1DataBase kapatir


