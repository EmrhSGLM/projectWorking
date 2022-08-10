Feature: US011 "My Appointments" Physician (Doctor) tarafından düzenlenebilmeli


  @TC1101
  Scenario: TC_1101 Yeni bir randevu oluşturun veya mevcut bir randevuyu düzenleyin.
    Given Kullanici URL'e gider
    And  Sag ustte bulunan kullanici ikonuna tiklar
    When Acilan pencerede sign in secenegini tiklar
    And  Kullanici adini girer
    And  Kullanici sifre girer
    When Kullanci sign in butonuna basar
    Then Sayfayi Make an Appointment basligini gorunceye kadar asagi kaydirir
    And Firstname textbox'ina isim yazmiyorsa, hastanin ismi yazilir
    And Lastname textbox'ina soyisim yazmiyorsa, hastanin soyismi yazilir
    And SSN textbox'ina SSN yazmiyorsa, hastanin SSN yazilir
    And Email textbox'ina email yazmiyorsa, hastanin email yazilir
    And Phone textbox'ina phone yazmiyorsa, hastanin telefon numarasi yazilir
    And Appointment DateTime uzerinden randevu alinacak tarih secilir
    When Send an Appointment Request butonuna basilir
    Then Randevunun olusturuldugu goruntulenir


  @TC1102
  Scenario: TC_1102 Kullanıcı (doktor) hastanın aşağıdaki gibi bilgilerini görmelidir.kimlik, başlangıç ve bitiş tarihi, Durum, doktor ve hasta.
    Given Kullanici URL'e gider
    And Sag ustte bulunan kullanici ikonuna tiklar
    When Acilan pencerede sign in secenegini tiklar
    Then Doktor kullanici adini girer
    And Doktor kullanici sifre girer
    When Kullanci sign in butonuna basar
    Then MY PAGES sekmesini tiklanir
    And Acilan pencerede My Appointments tiklanir
    And ID no goruntulenir
    And Start DateTime goruntulenir
    And End DateTime goruntulenir
    And Durum goruntulenir
    And Doktor ismi goruntulenir
    Then Hastanin ismi goruntulenilir


  @TC1103
  Scenario: TC_1103 Doktor, gerekli alanlara Anamnez, Tedavi ve Teşhis yazmalıdır.
    Given Kullanici URL'e gider
    And Sag ustte bulunan kullanici ikonuna tiklar
    When Acilan pencerede sign in secenegini tiklar
    And Doktor kullanici adini girer
    And Doktor kullanici sifre girer
    When Kullanci sign in butonuna basar
    And MY PAGES sekmesini tiklanir
    And Acilan pencerede My Appointments tiklanir
    Then Hasta numarasi yazilir 4 ve Update edilecek hastanin bilgilerinin yaninda bulunan edit butonuna tiklanir
    And Anamnesis bos birakilirsa uyari verir
    And Treatment bos birakilirsa uyari verir
    And Diagnosis bos birakilirsa uyari verir
    And Anamnesis kismina "AnamnesisBilgi" girilir
    And Treatment kismina "TreatmentBilgi" girilir
    And Diagnosis kismina "DiagnosisBilgi" girilir
    And Save butonuna basilir
    Then Update gerceklestirildi yazisi goruntulenir

  @TC1104
  Scenario: TC_1104 Reçete ve açıklama isteğe bağlı olabilir
    Given Kullanici URL'e gider
    And Sag ustte bulunan kullanici ikonuna tiklar
    When Acilan pencerede sign in secenegini tiklar
    And Doktor kullanici adini girer
    And Doktor kullanici sifre girer
    Then Kullanci sign in butonuna basar
    And MY PAGES sekmesini tiklanir
    And Acilan pencerede My Appointments tiklanir
    Then Hasta numarasi yazilir 11 ve Update edilecek hastanin bilgilerinin yaninda bulunan edit butonuna tiklanir
    And Prescription bos birakilir
    And Description bos birakilir
    And Save butonuna basilir
    Then Update gerceklestirildi yazisi goruntulenir
    And Kullanici bir onceki sayfaya geri doner
    And Prescription kismina "PrescriptionBilgi" girilir
    And Description kismina "DescriptionBilgi" girilir
    And Save butonuna basilir
    Then Update gerceklestirildi yazisi goruntulenir

  @TC1105
  Scenario: TC_1105 Durum sadece Doktor tarafından BEKLEMEDE, TAMAMLANDI veya İPTAL olarak seçilebilir.
    Given Kullanici URL'e gider
    And Sag ustte bulunan kullanici ikonuna tiklar
    When Acilan pencerede sign in secenegini tiklar
    And Doktor kullanici adini girer
    And Doktor kullanici sifre girer
    When Kullanci sign in butonuna basar
    Then MY PAGES sekmesini tiklanir
    And Acilan pencerede My Appointments tiklanir
    And Hasta numarasi yazilir 12 ve Update edilecek hastanin bilgilerinin yaninda bulunan edit butonuna tiklanir
    Then Status'a erisilir
    And CANCELLED secilir
    And CANCELLED'in secili oldugu ekran goruntusu ile goruntulenir
    And Save butonuna basilir
    Then Update gerceklestirildi yazisi goruntulenir
    And  Kullanici bir onceki sayfaya geri doner
    And PENDING secilir
    And PENDING'in secili oldugu ekran goruntusu ile goruntulenir
    And Save butonuna basilir
    Then Update gerceklestirildi yazisi goruntulenir
    And COMPLETED secilir
    And COMPLETED'in secili oldugu ekran goruntusu ile goruntulenir
    And Save butonuna basilir
    Then Update gerceklestirildi yazisi goruntulenir
