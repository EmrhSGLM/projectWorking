Feature: Admin olarak; Yeni Physicians Oluştur / Güncelle / Görüntüle ve Sil

  Scenario: TC_1801 Admin, SSN kimliğine göre kayıtlı bir kişiyi seçebilir/arayabilir.

    Given Kullanici URL'e gider
    And  Sag ustte bulunan kullanici ikonuna tiklar
    When Acilan pencerede sign in secenegini tiklar
    And  Admin username girer
    And  Admin password girer
    Then Kullanci sign in butonuna basar
    When Items&Titles linkine tiklar
    Then Acilan pencerede Physician linkine tiklar
    And Kayitli olan doktor listesinden istenilen doktor icin edit butonu tiklanir
    Then Id goruntulenir
    When Back ile onceki sayfaya geri doner
    And Ekranin saginda bulunan Create a new Physician butonuna tiklar
    And Use Search checkbox bos ise tiklanir
    Then Ssn textboxa kayitli ssn yazilir
    And Search User butonuna basilir
    Then Kayitli olan Physician'in Firstname'i goruntulenir
    Then Kayitli olan Physician'in Lastname'i goruntulenir

    Scenario: TC_1802 Kişilerin "firstname, lastname birth date .." bilgileri doldurulabilmeli.

    Given Kullanici URL'e gider
    And  Sag ustte bulunan kullanici ikonuna tiklar
    When Acilan pencerede sign in secenegini tiklar
    And  Admin username girer
    And  Admin password girer
    Then Kullanci sign in butonuna basar
    When Items&Titles linkine tiklar
    Then Acilan pencerede Physician linkine tiklar
    And Ekranin saginda bulunan Create a new Physician butonuna tiklar
    And Use Search checkbox bos ise tiklanir
    Then Ssn textboxa kayitli ssn yazilir
    And Search User butonuna basilir
    And Firstname textboxina isim yazilir
    And Lastname textboxina soyisim yazilir
    And Birth date kismina bir tarih yazilir
    Then Address textboxina adres yazilir
  @Smoke
    Scenario: TC_1803 Admin Doktor için bir uzmanlık alanı seçebilmeli.

        Given Kullanici URL'e gider
        And  Sag ustte bulunan kullanici ikonuna tiklar
        When Acilan pencerede sign in secenegini tiklar
        And  Admin username girer
        And  Admin password girer
        Then Kullanci sign in butonuna basar
        When Items&Titles linkine tiklar
        Then Acilan pencerede Physician linkine tiklar
        And Ekranin saginda bulunan Create a new Physician butonuna tiklar
        And Use Search checkbox bos ise tiklanir
        Then Ssn textboxa kayitli ssn yazilir
        And Search User butonuna basilir
        And Sayfayi asagi kaydirir
        And Speciality dropdowndan uzmanlik alanini secer
        Then Uzmanlik alaninin secilebildigi goruntulenir
        And sign out butonuna basar

    Scenario: TC_1804 Admin, doktorun profil resmini sağlayabilir.

    Given Kullanici URL'e gider
    And  Sag ustte bulunan kullanici ikonuna tiklar
    When Acilan pencerede sign in secenegini tiklar
    And  Admin username girer
    And  Admin password girer
    Then Kullanci sign in butonuna basar
    When Items&Titles linkine tiklar
    Then Acilan pencerede Physician linkine tiklar
    And Ekranin saginda bulunan Create a new Physician butonuna tiklar
    And Use Search checkbox bos ise tiklanir
    Then Ssn textboxa kayitli ssn yazilir
    And Search User butonuna basilir
    And Sayfayi asagi kaydirir
    And Image basliginin altnda bulunan Dosya sec butonuna basar
    And Kayitli olan bir fotograf secilir
    Then Fotografin eklendigi dogrulanir

      Scenario: TC_1805 Admin mevcut kullanıcılar arasından doktoru seçmelidir.

    Given Kullanici URL'e gider
    And  Sag ustte bulunan kullanici ikonuna tiklar
    When Acilan pencerede sign in secenegini tiklar
    And  Admin username girer
    And  Admin password girer
    Then Kullanci sign in butonuna basar
    When Items&Titles linkine tiklar
    Then Acilan pencerede Physician linkine tiklar
    And Ekranin saginda bulunan Create a new Physician butonuna tiklar
    And Use Search checkbox bos ise tiklanir
    Then Ssn textboxa kayitli ssn yazilir
    And Search User butonuna basilir
    And Sayfayi asagi kaydirir
    And User basliginin altinda bulunan dropdowndan doktor secimi yapar
    Then Doktor secimi degisikligi goruntulenir

    Scenario: TC_1806 Admin, doktorun Muayene ücretini girebilmelidir. (Exam fee)

    Given Kullanici URL'e gider
    And  Sag ustte bulunan kullanici ikonuna tiklar
    When Acilan pencerede sign in secenegini tiklar
    And  Admin username girer
    And  Admin password girer
    Then Kullanci sign in butonuna basar
    When Items&Titles linkine tiklar
    Then Acilan pencerede Physician linkine tiklar
    And Ekranin saginda bulunan Create a new Physician butonuna tiklar
    And Use Search checkbox bos ise tiklanir
    Then Ssn textboxa kayitli ssn yazilir
    And Search User butonuna basilir
    And Sayfayi asagi kaydirir
    And Exam Fee textboxina ucret yazilir
    Then Degisiklik goruntulenir

      Scenario: TC_1807 Admin, bütün doctorların bilgilerini görebilmelidir.

    Given Kullanici URL'e gider
    And  Sag ustte bulunan kullanici ikonuna tiklar
    When Acilan pencerede sign in secenegini tiklar
    And  Admin username girer
    And  Admin password girer
    Then Kullanci sign in butonuna basar
    When Items&Titles linkine tiklar
    Then Acilan pencerede Physician linkine tiklar
    And Kayitli olan doktor listesinden istenilen doktor icin edit butonu tiklanir
    And Firstname goruntulenir
    And Lastname goruntulenir
    And Date time goruntulenir
    And Phone goruntulenir
    Then Adress goruntulenir

     Scenario: TC_1808 Admin, Doktorların bilgilerini düzenleyebilir.

    Given Kullanici URL'e gider
    And  Sag ustte bulunan kullanici ikonuna tiklar
    When Acilan pencerede sign in secenegini tiklar
    And  Admin username girer
    And  Admin password girer
    Then Kullanci sign in butonuna basar
    When Items&Titles linkine tiklar
    Then Acilan pencerede Physician linkine tiklar
    And Kayitli olan doktor listesinden istenilen doktor icin edit butonu tiklanir
    And Firstname textboxinda yazan isim silinir ve yeni isim yazilir
    And Lastname textboxinda yazan soyisim silinir ve yeni soyisim yazilir
    And Date time textboxinda yazan tarih degistirilir
    And Phone textboxinda yazan telefon numarasi silinir ve yeni telefon numarasi yazilir
    Then Adress textboxinda yazan adres silinir ve yeni adres yazilir

     Scenario: TC_1809 Admin mevcut doktorları silebilir.

     Given Kullanici URL'e gider
     And  Sag ustte bulunan kullanici ikonuna tiklar
     When Acilan pencerede sign in secenegini tiklar
     And  Admin username girer
     And  Admin password girer
     Then Kullanci sign in butonuna basar
     When Items&Titles linkine tiklar
     Then Acilan pencerede Physician linkine tiklar
     And Kayitli olan doktor listesinden silinecek doktor icin delete butonu tiklanir
     And Gelen bildirimde delete butonuna basilir
     Then Doktorun silindigi uyarisi goruntulenir

    Scenario: TC_1810 API kullanarak doktorları doğrulayın




    @DBTest
    Scenario: TC_1811 DB kullanarak doktorları doğrulayın.

    Given Verilen kullanıcı veritabanına bağlanır ve dogrulama yapar
    Then Veritabani baglantisini kapatin


    Scenario: apiTest

    Given AKullanici token olusturur
    Then akullanici emaili dogrular

   Scenario: Api Physicians

    Given Kullanici Physician icin token alir ve id yazar
    And Bigileri goruntule
    Then Bigileri dogrula


   Scenario: Pojo

     Given Kullanici Physician icin token ve end point olusturur2
     Then Pojo ile dogrula