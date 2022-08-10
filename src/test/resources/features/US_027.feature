Feature: US027


  @TC2701
  Scenario: Admin, mesaj portalına gidebilir ve tüm mesajları, yazarlarını ve e-postalarını görüntüleyebilir.
    Given I-URL'e gider
    Then  I-Sag ustte bulunan ikona tiklar
    And   I-Sign in'e tiklar
    Then  I-Admin username girer
    And   I-Admin password girer
    And   I-Sign in buttonuna tiklar
    Then  I-Item Titles goruntulenir ve tiklanir
    And   I-Cikan seceneklerde Messages tiklanir
    Then  I-Acilan sayfada Messages goruntulenir
    And   I-Email basligi goruntulenir
    And   I-Name basligi goruntulenir
    And   I-View buttonuna tiklanir
    Then  I-Name goruntulenir
    And   I-Email goruntulenir

  @TC2702
  Scenario: Admin, mesajları oluşturabilir, güncelleyebilir, silebilir.
    Given I-URL'e gider
    Then  I-Sag ustte bulunan ikona tiklar
    And   I-Sign in'e tiklar
    Then  I-Admin username girer
    And   I-Admin password girer
    And   I-Sign in buttonuna tiklar
    Then  I-Item Titles goruntulenir ve tiklanir
    And   I-Cikan seceneklerde Messages tiklanir
    Then  I-Acilan sayfada Messages goruntulenir
    And   I-Sag da bulunan Create a new Message goruntulenir
    And   I- Create a new Message buttonuna tiklanir
    And   I-Name box gorunutlenir ve name girilir
    And   I-Email box gorutnulenir ve email girilir
    And   I-Subject box goruntulenir ve subject girilir
    And   I-Messages box gorutnulenir ve messages girilir
    And   I-Save buttonuna tiklanir
    Then  I-Save Toast container goruntulenir
    And   I-Edit buttonunu goruntuler ve Edit buttonuna tiklar
    Then  I-Name box ve Subject box duzenlenir
    And   I-Edit Save buttonuna tiklanir
    Then  I-Edit Toast Container goruntulenir
    And   I-Delete buttonuna tiklanir
    And   I-Confirm delete operation goruntulenir
    And   I-Pop Up yazisi goruntulenir
    Then  I-Delete buttonuna tiklanir
    And   I-Toast Container gorutulenir

  @TC2703API
  Scenario:Kullanıcı, API kullanarak ileti oluşturmayı ve okumayı doğrulamalıdır
    Given  I-Kullanici gerekli path parametrelerini ayarlar
    And    I-Kullanici "id", "name", "email", "subject" "message" bilgileri ile expected datayi olusturur
    And    I-Kullanici GET islemi gonderir ve yanit alir
    Then   I-Kullanici api verilerini dogrular

  @TC2704DATABASE
  Scenario: Kullanıcı DB ile mesajları doğrulamalıdır
    Given  I-Kullanici gerekli POST islemi icin path parametrelerini ayarlar
    And    I-Kullanici "name", "email", "subject" "message" bilgileri ile POST islemi icin expected datayi olusturur
    And    I-Kullanici POST islemi gonderir ve yanit alir
    Then   I-Kullanici Post islemi icin api verilerini dogrular