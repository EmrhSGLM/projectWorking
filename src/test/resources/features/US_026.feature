Feature: Kullanici mesaj gönderebilmeli

  Scenario: Kullanici gerekli bilgileri girmeli

    Given yKullanıcı url girer
  #  And Yikona tıklar
   # And Ysign in butonuna tıklar
    And Yonctact butonuna tıklar
    And Ymesaj kısmını görür



    Scenario: Ymesaj yazmak micin gerekli bilgileri girer
      Given yKullanıcı url girer
     # And Yikona tıklar
    #  And Ysign in butonuna tıklar
      And Yhasta olarak giris yapar
    And Ylastnama ,password girer
   # And Ysign in butonuna tıklar

    And YAcılan sayfanin altinda "name"alanini doldurur.
    And YEmail girer
    And YSubject girer
    And YMessage kutusuna mesajini yazar
    And YSend butonuna tıklar
    And Y"Your messege has bean recerved" yazisini girer.