@smoke
Feature: Hastalar randevu tarihi oluşturabilmelidir.

  Background: Tarih güncelleme

      Given Kullanici URL'e gider
      And ikona tıklar
      And sig in eder
      And hasta kullanıcı username ve password girer
      Then Sign in eder
      And  My Pages butonuna tıklar
      And Make N appoİTMENT butonuna tıklar
      And firstname kutusunu siler
      And Firstname girer
      And Ssn kutusunu siler
      And SSN bilgisini girer
      And phone kutusunu siler
      Then phone bilgisini girer
      And lastname kutusunu siler
      And LastName girer
      And email kutusunu siler
      And Email girer

     Scenario: And appoinment kutusunu siler
      Then Appointment data time (randevu tarihini) girer
      Then Send an Appoinment butonunu tıklar
      And Appointment registion Saved! yazisini görür

      Scenario: gecersiz tarih girer

        And Make N appoİTMENT butonuna tıklar

        Then Appointment data time gecersiz tarih  girer
        Then Send an Appoinment butonunu tıklar
        And gecersiz tarih yazisini görür










