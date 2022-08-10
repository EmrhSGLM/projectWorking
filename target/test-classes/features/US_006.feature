@smoke
Feature:US06_001 Kullanici giris

 Background:TC_001 anasayfaya user olarak giris yapar

   Given  Kullanici URL'e gider
   And    ikonu tiklar
   And    sig in eder
   Then   username ve password girer
   Then   sign eder
   Then   ikona tıklar
   Then   ikondan settingse tıklar
   Then   firstname kutusunu siler
   Then  firstname  girer
   Then  lastname kutusunu siler
   Then  lastname girer
   Then  Email kutusunu siler
   Then  e mail girer
    Then save eder
   Then  setting saved!yazisini görür


Scenario:TC_002 firstname güncelleme
  And firstname kutusunu bos bırakır
  And "Your first name is required" yazısı görülür

Scenario:TC_003 Lastname güncelleme
  And lastname kutusunu bos bırakır veya gecersiz bilgi girer
  And "Your last name is required." yazisini görür


Scenario:TC_004 Email kutusu güncelleme
  And emaile bos bırakir veya gecersiz bilgi girer
  And Your email is required. yzisini görür



