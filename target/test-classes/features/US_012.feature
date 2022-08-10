Feature:US012
  @1201
  Scenario: Doctor test isteyebilmeli "Request A Test"
    Given Kullanici URL'e gider
    And     Sag ustte bulunan sing in ikonuna tiklar
    And     Cikan seceneklerden "Sign in" butonuna tiklar
    And     Doktor Username'inii girer
    And     Doktor Password'unu girer
    And     "Sing in" butonuna tiklar
    And     "MY PAGES" sekmesine tiklar
    And     "My Appointmnets" secenegine tiklar
    And     "from" secenegi girilir
    And     "to" secenegi girilir
    #And     Max 15 gunluk randevular goruntulenir toastContainer mesaji görünür
    And     Status "PENDING" goruntulenir
    And     PENDING gorunen hastanin sagindaki "edit" butonu tiklanir
    And     Acilan sayfada "Create or Edit an Apploimnet" goruntulenir
    And     "Request A Test" butonu tiklanir
    Then    Acilan sayfada "Test Items" gorunur
  @1202
  Scenario: Test içeriğinde "Glucose, Urea, Creatinine, Sodium,Potassium, Total protein, Albumin, Hemoglobin" seçenekleri olmalı
    Given Kullanici URL'e gider
    And     Sag ustte bulunan sing in ikonuna tiklar
    And     Cikan seceneklerden "Sign in" butonuna tiklar
    And     Doktor Username'inii girer
    And     Doktor Password'unu girer
    And     "Sing in" butonuna tiklar
    And     "MY PAGES" sekmesine tiklar
    And     "My Appointmnets" secenegine tiklar
    And     "from" secenegi girilir
    And     "to" secenegi girilir
   # And     Max 15 gunluk randevular goruntulenir toastContainer mesaji görünür
    And     Status "PENDING" goruntulenir
    And     PENDING gorunen hastanin sagindaki "edit" butonu tiklanir
    And     Acilan sayfada "Create or Edit an Apploimnet" goruntulenir
    And     "Request A Test" butonu tiklanir
    Then    Acilan sayfada "Test Items" gorunur
    And     "Urea" tiklanir
    And     "Creatinine" tiklanir
    And     "Sodium" tiklanir
    And     "Sodium" tiklanir
    And     "Potassium" tiklanir
    And     "Total protein" tiklanir
    And     "Hemoglobin" tiklanir
    And     "Albumin" tiklanir
    And     "Glucose" tiklanir
    Then    Sayfanin en altinda bulunan "SAVE" butonuna tiklanir
    Then    "A new Test is created" toastContainer'i goruntulenmeli