Feature: API Dogrulama

Scenario Outline: TC_1507 API ile paients dogrulama

Given US0015 Kullanici gerekli path params ayarini yapar
Then US0015 Kullanici items ile alakali expected datalari "<firstname>" , "<lastname>" , "<birthday>" , "<phone>" , "<gender>" , "<bloodGroup>" , "<adress>" , "<email>" , "<description>" girer
And US0015 Kullanici request gonderirir ve response alir
Then US0015 Kullanici response status sorgusunu yapar
And US0015 Kullanici API kayitlarini dosyaya kaydeder
Then US0015 Kullanici API kayitlarini dogrular

Examples: test data
|firstname|lastname|birthday    |phone           |gender|bloodGroup|adress   |email              |description|
|Heidi    |David   |15.08.1994  |1234567890      |female  |A+     |Berlin    |heidi@gmail.com  |Null     |