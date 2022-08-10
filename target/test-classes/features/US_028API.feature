Feature: Country Okuma, Olusturma, Guncelleme ve Silme

  Scenario:Country Okuma

    Given kullanici medunna apiden "https://www.medunna.com/api/countries" ulke bilgilerini okur

  Scenario Outline:Country olusturma

    Given kullanici api end point "https://www.medunna.com/api/countries" den "<idJson>" ve "<nameJson>" kullanarak ulke olusturur
    Examples: Country olusturma
      |idJson |nameJson               |
      |name   |Okyanusya  |

  Scenario Outline:Coutry guncelleme

    Given kullanici api end point "https://www.medunna.com/api/countries/" den "<id>" ve "<name>" kullanarak guncelleme yapar
    Examples: country guncelleme
      |id   |name   |
      |80059|Okyanusya |

 #  Scenario Outline:Country silme
 #    * kullanici endpoint "<endPoint>" ve id ile "<id>" ulke siler
 #    Examples: Country silme
  #     |endPoint|id|
  #     |https://www.medunna.com/api/countries/|89709|