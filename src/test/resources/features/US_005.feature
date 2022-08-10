Feature: US005
  @TC501
  Scenario: TC_001 User needs to type in their name containing any chars and it cannot be blank
    Given Kullanici URL'e gider
    Then  Make an Appointment be view
    And   Make an Appointment button click
    And   Make an Appointment be view on the opened page
    And   First Name box be view
    And   First Name box is left blank
    And   Your FirstName is required feedback be view
    And   Patient enters first name
    Then  Assert that the first name has been entered
  @TC502
  Scenario: TC_002 User provides their matching SSN id (same as registered SSN) and it cannot be blank
    Given Kullanici URL'e gider
    Then  Make an Appointment be view
    And   Make an Appointment button click
    And   Make an Appointment be view on the opened page
    And   SSN box be view
    And   SSN box is left blank
    And   Your SSN is required feedback be view
    And   Wrong SSN has been entered
    And   Your SSN is invalid feedback be view
    And   Hasta 11 rakamli,  3. ve 5. rakamlardan sonra "-" iceren SSN girer
    Then  Assert that the patient entered the corret SSN
  @TC503
  Scenario: TC_003 User provides their lastname containing any chars and it cannot be blank
    Given Kullanici URL'e gider
    Then  Make an Appointment be view
    And   Make an Appointment button click
    And   Make an Appointment be view on the opened page
    And   Last Name box be view
    And   Last Name box is left blank
    And   Your LastName is required feedback be view
    And   Patient enters last name
    Then  Assert that the last name has been entered
  @TC504
  Scenario: TC_004 Kullanıcı "." ve "@" içeren e-mail adresi girmeli, boş bırakılamaz.
    Given Kullanici URL'e gider
    Then  Make an Appointment be view
    And   Make an Appointment button click
    And   Make an Appointment be view on the opened page
    And   Email box be view
    And   Email box is left blank
    And   Your Email is required feedback be view
    And   Wrong Email has been entered
    And   Your Email is invalied feedback be view
    And   Hasta "@" ve "." iceren email adresini girer
    Then  Assert that the patient entered the corret Email
  @TC505
  Scenario: TC_005 Kullanıcı, 3. ve 6. rakamdan sonra "-" olan 10 rakamlı telefon numarasını gireli, boş bırakılamaz.
    Given Kullanici URL'e gider
    Then  Make an Appointment be view
    And   Make an Appointment button click
    And   Make an Appointment be view on the opened page
    And   Phone box be view
    And   Phone box is left blank
    And   Your Phone is required feedback be view
    And   Wrong Phone has been entered
    And   Your Phone is invalied feedback be view
    And   10-Hasta 10 rakamli 3. ve 6. rakamdan sonra "-" iceren  phone numarasi girer
    And   Assert that the patient entered the correct Phone
    And   11-Phone number 10 rakamli krakter girilir
    Then  Your Phone is invalied feedback be view again
  @TC506
  Scenario: TC_006 Kullanıcı randevu alıp kaydolduğunda, profillerini görebilir ve uygulamada oturum açabilir.
    Given Kullanici URL'e gider
    Then  Make an Appointment be view
    And   Make an Appointment button click
    And   Make an Appointment be view on the opened page
    And   5-Hasta First Name girer
    And   6-Hasta  SSN girer
    And   7-Hasta Last Name girer
    And   8-Hasta Email girer
    And   9-Hasta Phone girer
    And   10-Hasta Appointment DateTime girer
    And   11-Send an Appointment Request butonuna tiklar
    And   12-"Appointment registration saved!" bilgisi goruntulenir
    And   13-Sayfa da yukari cikilir ve User simgesi tiklanir
    And   14-Sing in butonuna tiklanir
    And   15-Hasta Username'ini girer
    And   16-Hasta Password'unu girer
    And   17-Sing in butonuna tiklar
    And   18-Acilan sayfada  "My Pages(PATIENT)" butonuna tıklanir
    And   19-My Appointments e tiklanir
    And   20-Acilan sayfa Appointments goruntulenir
