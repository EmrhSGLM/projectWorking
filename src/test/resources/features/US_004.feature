Feature: US_004  Giris islemlerinin Basariyla Yapilmasi

  @TC01
  Scenario: TC_01 Giriş yapmak için başari mesajini  dogrulayan, geçerli bir kullanici adi ve şifre olmalidir.


    Given Kullanici URL'e gider
    And Kullanici ikon elementine tiklar
    Then Kullanici sign in yapar
   And Kullanici gecerli bilgilerle giris yapar
    #Then Kullanicinin basarili giris yaptigini dogrulayiniz
    Given Kullanici profilinden çıkış yapar.




  Scenario:TC002 Kullanıcının mevcut kimlik bilgilerini her zaman kullanabileceği bir beni hatırla seçeneği olmalıdır
    Given Kullanici URL'e gider
    And Kullanici ikon elementine tiklar
    Given Kullanici sign in yapar
    Given Kullanici gecerli bilgilerle giris yapar
    Given Kullanici Remember Me kutusuna tıklar.
    Given Kullanici profilinden çıkış yapar.
    Given Kullanıcı anasayfa uzerinden Sign-In butonuna tıklar





  Scenario:TC003 Eğer şifre unutulursa diye Did you forget your password? seçeneği olmalı
    Given Kullanici URL'e gider
    And Kullanici ikon elementine tiklar
    Given Kullanici sign in yapar
    Then Kullanici yanlış password ile giriş yapar.
    And Kullanıcı Profiline bağlanamadığını görür.
    Then Kullanici Did you forget your password? butonuna tıklar.
    #Then Kullanici Did you forget your password? ekranına baglanır.
    Then Kullanici mail adresini yazar ve şifresini resetler.
    Then Kullanici yeni şifresi ile profiline giriş  yapar.
    Then Kullanıcı profiline başarıyla erişir ve bunu doğrular.
    Given Kullanici profilinden çıkış yapar.



  Scenario:TC004 You don't have an account yet? Register a new account secenegi olmali

    Given Kullanici URL'e gider
    Given Kullanici Sign In butonu gorur.
    Given Kullanici Sign In butonuna tıklar.
    #Then Kullanici Sign In sayfasına erisir.
    #Then Kullanici You don't have an account yet? Register a new account butonunu gorur.
    And Kullanici You don't have an account yet? Register a new account butonuna tıklar.
    And Kullanici Registration sayfasına erisir.
    And Kullanıcı anasayfaya geri doner.





  Scenario:TC005 Cancel secenegi olmali

    Given Kullanici anasayfaya erisir.
    And Kullanici Sign In butonu gorur.
    And Kullanici Sign In butonuna tıklar.
    #And Kullanici Sign In sayfasına erisir.
    #Then Kullanici Cancel butonunu gorur.
    And Kullanıcı Cancel butonuna tıklar.
    Then Kullanici anasayfaya tekrar yonlendirildigini gorur.
