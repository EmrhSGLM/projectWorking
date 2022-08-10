@US16_API
Feature: Admin olarak API ile oda oluşturma, okuma, güncellme ve silme doğrulanmalı.

  @US16_API_TC01
    @ApiRegistrant
  Scenario Outline: API oluşturma ile odaları doğrulayın
    Given Beklenen verileri "<description>", <price>, "<roomType>" ve "<status>" olarak ayarlayın
    When Kullanıcı "POST" isteğini gönderdiğinde
    Then O zaman odalar için durum kodu 201 olmalıdır
    Then Ardından yanıt gövdesinin beklenen bir veri olması gerektiğini doğrulayın.

    Examples:
      |description|price|roomType|status|
      |With TV    |200  |DELUXE  |false |

  @US16_API_TC02
    @ApiRegistrant
  Scenario Outline: API okuması ile tüm odaları doğrulayın
    Given Beklenen verileri "<description>", <price>, <roomNumber>, "<roomType>" ve "<status>" olarak ayarlayın
    When Kullanıcı "GET" isteğini gönderdiğinde
    Then O zaman odalar için durum kodu 200 olmalıdır
    Then Ardından yanıt gövdesinin beklenen tüm verileri içerdiğini doğrulayın

    Examples:
      |description|price|roomNumber|roomType|status|
      |critical   |100  |3626      |DAYCARE |true  |
      |mus        |111  |1111      |TWIN    |true  |
  @US16_API_TC03
    @ApiRegistrant
  Scenario Outline: API ile güncellemeli odaları doğrulayın
    Given <roomId> için beklenen verileri "<description>", <price>, <roomNumber>, "<roomType>" ve "<status>" olarak ayarlayın
    Then Kullanıcı "PUT" isteğini gönderdiğinde
    Then O zaman odalar için durum kodu 200 olmalıdır
    Then Ardından yanıt gövdesinin beklendiği gibi olması gerektiğini doğrulayın.
    Examples:
      |description|price|roomNumber|roomType|status|roomId|
      |critic     |120  |3626      |DAYCARE |true  |31701 |
  @US16_API_TC04
  @ApiRegistrant
  Scenario: API silme işlemiyle odaları doğrulayın
    Given Verilen kullanıcı silme isteği gönderir
    Then O zaman odalar için durum kodu 204 olmalıdır