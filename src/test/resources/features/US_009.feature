Feature: US_009 Personel


  @TC01Funda
  Scenario: TC_01 Hasta bilgilerini gorur
    Given Kullanici URL'e gider
    Then Account-menu tıklanır
    Then Sing in tıklanır
    Then username girilir
    And password girilir
    And Singin buttonuna tıklanır
    Then My pages buttonu tıklanır
    Then Search patient tıklanır
    Then Hasta bilgileri görülür

  @TC02
  Scenario Outline: TC_02 Hasta bilgilerini guncelleme
    Given Kullanici URL'e gider
    Then Account-menu tıklanır
    Then Sing in tıklanır
    Then username girilir
    And password girilir
    And Singin buttonuna tıklanır
    Then My pages buttonu tıklanır
    Then Search patient tıklanır
    Given Patient SSN box'ına hasta "<SSN>" bilgisi girilir
    Then Edit buttonu tıklanır
    Then Create or edit a Patient formu geçerli bilgiler ile güncellenir
    And Save tıklanır
    Then Kayıt yapıldığı doğrulanır

    Examples:
      | SSN |
      | 123-56-9424 |


  @TC03Funda

  Scenario Outline: TC_03 Personel,  SSN'lerine göre yeni bir başvuru sahibi arayabilmeli ve tüm kayıt bilgilerinin doldurulduğunu görebilmelidir.
    Given Kullanici URL'e gider
    Then Account-menu tıklanır
    Then Sing in tıklanır
    Then username girilir
    And password girilir
    And Singin buttonuna tıklanır
    Then My pages buttonu tıklanır
    Then Search patient tıklanır
    Given Patient SSN box'ına hasta "<SSN>" bilgisi girilir
    Then Hasta bilgilerinin doldurulduğu kontrol edilir
    Examples:
      | SSN |
      | 123-56-9424 |

  @TC06
  Scenario Outline: TC_06 Personel herhangi bir hasta bilgisini silebilir
    Given Kullanici URL'e gider
    Then Account-menu tıklanır
    Then Sing in tıklanır
    Then username girilir
    And password girilir
    And Singin buttonuna tıklanır
    Then My pages buttonu tıklanır
    Then Search patient tıklanır
    Given Patient SSN box'ına hasta "<SSN>" bilgisi girilir
    Then Edit buttonu tıklanır
    And Her hangi bir hasata bilgisi silebilir
    Then Silinme isleminden sonra "This field is required." uyarisi cikmaz.
    Examples:
      | SSN |
      | 123-56-9424 |

  @TC07
  Scenario Outline: TC_07  Staff hastaları silememeli.
     Given Kullanici URL'e gider
     Then Account-menu tıklanır
     Then Sing in tıklanır
     Then username girilir
     And password girilir
     And Singin buttonuna tıklanır
     Then My pages buttonu tıklanır
     Then Search patient tıklanır
     Then Patient SSN box'ına hasta "<SSN>" bilgisi girilir
     Then Edit buttonu tıklanır
     Then Staff hasta silememeli
    Examples:
      | SSN |
      | 123-56-9424 |

  @TC08Funda
  Scenario Outline: TC_08 Personel(Staff), hastaları SSN kimliklerine göre arayabilir.
    Given Kullanici URL'e gider
    Then Account-menu tıklanır
    Then Sing in tıklanır
    Then username girilir
    And password girilir
    And Singin buttonuna tıklanır
    Then My pages buttonu tıklanır
    Then Search patient tıklanır
    Given Patient SSN box'ına hasta "<SSN>" bilgisi girilir
    And Hasta bilgileri görülür
    Examples:
      | SSN |
      | 123-56-9424 |

