Feature: US101 Kayıt olmak için SSN, Firstname ve Lastname bilgileri girililebilmelidir.

  Scenario: TC101 3. ve 5. rakamlardan sonra "-" sayılan geçerli bir SSN olmalı, 9 hane uzunluğunda olmalı

    Given Kullanici URL'e gider
    When Register butonuna tıklar
    And SSN numarasinin ucuncu ve besinci rakamlardan sonra - olacak sekilde girer
    And Sayinin 9 hane uzunlugunda oldugu kontrol edilir
    Then Girilen SSN nin dogru girildigini dogrular

  @smoke
  Scenario: TC_102 SSN boş bırakılamaz

    Given Kullanici URL'e gider
    When Register butonuna tıklar
    And SSN kutusunu bos bırakır
    And First Name girilir,
    Then Lastname girilir,
    And Username girilir,
    And Email girilir,
    And New Password girilir,
    And New password confirmation girilir,
    Then Sayfa yukari kaydirilir
    Then Ssn bos birakilamaz yazisi goruntulenir


  Scenario Outline: TC_103 Herhangi bir karakter içeren ve boş olmayan geçerli bir ad olmalıdır.

    Given Kullanici URL'e gider
    When Register butonuna tıklar
    And First Name bos birakilir
    Then First Name bos birakilmaz yazisi goruntulenir
    And First Name "<karakter>" girilir,
    Then First Name hatali giris olmadigi kontrol edilir


    Examples:
      |karakter|
      |  Adam!  |
      |  Sam{   |
      |  John-  |
      |  Robin$ |

  Scenario Outline: TC_104 Herhangi bir karakter içeren geçerli bir soyadı olmalı ve gerekli bir alandır.

    Given Kullanici URL'e gider
    When Register butonuna tıklar
    And Last Name bos birakilir
    And Last Name bos birakilmaz yazisi goruntulenir
    And Last Name "<karakter>" girilir,
    Then Last Name hatali giris olmadigi kontrol edilir


    Examples:
      |karakter|
      |    Baker!  |
      |    Campbell{  |
      |    Davis-  |
      |    King$  |
