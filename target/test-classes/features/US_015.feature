Feature: Admin_tarafindan_hasta_olusturma_ve_duzenleme
  Background: Yonetici_giris
    When Yonetici url gider
    And Sign in ikonuna tiklar
    And Yonetici username ve password bilgileri girer
    And Sign in buttonuna tiklar
    And Items&Titles sekmesini tiklar

  Scenario: TC001_Yeni_Hastalar_sadece_yonetici_tarafindan_olusturulabilmeli

    Then Patient secenegini secer ve tiklar
    And Create a new Patient buttonuna tiklar
    And First Name buttonunu tiklar ve bilgileri girer
    And Last Name buttonunu tiklar ve bilgileri girer
    And Birth Date buttonuna tiklar ve bilgileri girer
    When Email buttonuna tiklar ve bilgileri girer
    And Phone buttonuna tiklar ve bilgileri girer
    And Gender sekmesini tiklar ve FEMALE secer
    And Bloud Group sekmesini tiklar ve kan grubunu secer
    And Description buttonuna tiklar ve hasta tanimini yazar
    Then User sekmesini tiklar ve system secenegini secer
    And Country sekmesini tiklar ve US secenegini secer
    And State City sekmesini tiklar ve Alabana secenegini secer
    And Save buttonuna tiklar ve hastayi kayit eder
    And A new Patient is created alert yazisini dogrular

  Scenario: TC002_Yonetici_FirstName_LastName_BirthDate_Email_Phone_Gender_BloadGroup_Adress_Description_User_Country_State/City_bilgilerini_gorebilmeli

    Given Patient secenegini secer ve tiklar
    And Ilk satirdaki hastanin View buttonuna tiklar
    Then Patient yazisi altindaki bilgiler dogrulanir
  @Smoke
  Scenario: TC003_Yonetici_Hasta_olusturdugunda_veya_guncellediginde_yukaridaki_ogelere_data_girisi_yapabilmeli

    Given Patient secenegini secer ve tiklar
    And Ilk satirdaki hastanin Edit buttonuna tiklar
    Then Hastanin id boxunu dogurular

  Scenario: TC004_Yonetici_Hastaya_Doktor_atayabilmeli

    Given Appointment secenegini secer ve tiklar
    And Ilk satirdaki hastanin Edit buttonuna tiklar
    And Yonetici Hastaya Doktor atar
    And Yonetici Doktora Hasta atar
    And Assign sonrasi save buttonuna tiklar
    Then The Appointment is update mesajini dogrular
  @Smoke
  Scenario: TC005_State_buttonu_Us_state olmali_bos_birakilmamali

    Given State City secenegini secer ve tiklar
    And Create a new State City buttonuna tiklar
    And Name textboxna tiklar ve isim yazar
    Then State City sekmesine tiklar ve Us secenegini secer
    And Save buttonuna tiklar
    And Successful mesajini goruldugunu dogrular

  @Smoke
  Scenario: TC006_Yonetici_herhangi_bir_hastayi_silebilmeli

    Given Patient secenegini secer ve tiklar
    And Ilk satirdaki hastanin Delete buttonuna tiklar
    Then Confirm delete operation yazisi altindaki Delete buttonuna tiklar
    And Successful mesajini dogrular

