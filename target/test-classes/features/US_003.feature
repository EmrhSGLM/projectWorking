Feature:US_03 RegistrationPage

  Background:
    Given Kullanici URL'e gider
    And kullanici register butonunu bulup tiklar
    Then sayfada asagi iner ve password butonunu bulur

  Scenario: TC_0301 Daha güçlü şifre için en az 1 küçük harf olmalı ve "Password strength:" seviyesinin değiştiği görülebilmelidir.
    Then kullanici password sekmesine en az bir  kucuk harf olacak sekilde bir password girmeli
    And kullanici password 1'i girdigi zaman Password strenght seviyesinin degistigini gorebilmeli

  Scenario: TC_0302 Şifre en az 1 büyük harf içermeli ve "Password strength:" seviyesinin değiştiği görülebilmelidir.
    Then kullanici Password sekmesine en az 1 buyuk harf icerecek sekilde bir password girmeli
    And kullanici password 2'yi girdigi zaman Password strenght seviyesinin degistigini gorebilmeli

  Scenario: TC_0303 Şifre en az 1 rakam içermeli ve "Password strength:" seviyesinin değiştiği görülebilmelidir.
    Then kullanici Password sekmesine en az 1  rakam icerecek sekilde bir password girmeli
    And kullanici password 3'u girdigi zaman Password strenght seviyesinin degistigini gorebilmeli

  Scenario: TC_0304 Şifre en az 1 özel karakter içermeli ve"Password strength:" seviyesinin değiştiği görülebilmelidir.
    Then kullanici Password sekmesine en az 1  ozel karakter icerecek sekilde bir password girmeli
    And kullanici password 4'u girdigi zaman Password strenght seviyesinin degistigini gorebilmeli

  Scenario: TC_0305 Güçlü bir parola için şifre en az 7 karakterden oluşmalıdır.
    Then kullanici Password sekmesine en az 7  karakterden olusacak sekilde bir Password girmeli
    And kullanici password 5'i girdigi zaman Password strenght seviyesinin degistigini gorebilmeli






