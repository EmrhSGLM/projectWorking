@US16_DB
Feature: DB ile Yönetici tarafından Oda oluşturmayı doğrulayın

  Scenario Outline: DB ile tüm odaları doğrulayın
    Given Verilen kullanıcı Veritabanına bağlanır
    When Kullanici "created_by = 'medunnaadmin'" icin "room" tablosundan "id, room_number,price, room_type, status, description" sectiginde
    And Ve verilerin <id>, <roomNumber>, "<price>", "<roomType>", "<status>", "<description>" bilgilerini icerdigini dogrulayin
    Then Ardından kullanıcı veritabanı bağlantısını kapatın

    Examples:
      |description|price|roomNumber|roomType|status|id    |
      |           |299.00  |297       |TWIN    |false |31707 |
      |With TV    |200.00  |590       |DELUXE  |false |32638 |

