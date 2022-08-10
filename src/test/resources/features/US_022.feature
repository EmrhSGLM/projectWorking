Feature: Hasta Test sonuclari (Staff)


  Scenario Outline: TC_001 Kullanici (Staff) hastanin SSN id ie arama yapabilir.

      Given Kullanici URL'e gider
      And Sign in sayfasina gider
      Then ZKullanici Staff olarak giris yapar   "<username>" ve "<password>" girer
      And ZMy Pages butonundan search  patient a tiklar
      And ZSSN ile arama yapar hastanin bilgilerinin ciktigi dogrulanir
      And Zkullanici sing out elementine tiklar


    Examples: Test Data
    |username | password|
    |stfzuhal |Drzuhal308*|

  @Smoke
  Scenario Outline: TC 002 Kullanici (Staff) test sonuclarini gorebilmelidir
      Given Kullanici URL'e gider
      And Sign in sayfasina gider
      Then  ZKullanici Staff olarak giris yapar   "<username>" ve "<password>" girer
      And ZMy Pages butonundan search  patient a tiklar
      And ZShow Appointments a tiklar ve Show test tiklanir
      And ZTest sonuclarinin goruldugu dogrulanir
      And Zkullanici sing out elementine tiklar

    Examples: Test Data
      |username | password|
      |stfzuhal |Drzuhal308*|


  Scenario Outline: TC 003 Kullanici (Staff) "ID, Date, Result, description, Created date, ..." gibi sonuç bilgileini gorebilmeli ve
      guncelleyebilmelidir.

      Given Kullanici URL'e gider
      And Sign in sayfasina gider
      Then ZKullanici Staff olarak giris yapar   "<username>" ve "<password>" girer
      And ZMy Pages butonundan search  patient a tiklar
      And ZShow Appointments a tiklar ve Show test tiklanir
      And ZTest sonuclarinin goruldugu dogrulanir
      And ZKullanici Staff  sonuc bilgilerini gorebilmeli ve guncelleyebilmelidir.
       And Zkullanici sing out elementine tiklar

    Examples: Test Data
      |username | password|
      |stfzuhal |Drzuhal308*|