package stepdefinitions.APIStepDefinitions;

import io.cucumber.java.en.Given;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.TestItem;
import utilities.Authentication;
import utilities.Authentication2;
import utilities.ConfigReader;

import static hooks.Hooks.spec;
import static io.restassured.RestAssured.given;

public class US_028_APIStepDefinitions {

    Response response;
    TestItem expectedData;


    @Given("ZKullanici gerekli get icin path params ayarini yapar")
    public void z_kullanici_gerekli_get_icin_path_params_ayarini_yapar() {

        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("base_url")).build();
        spec.pathParams("get1", "api", "get2", "c-states", "country", "3802");


    }
    @Given("ZKullanici items ile alakali expected datalari olusturur")
    public void z_kullanici_items_ile_alakali_expected_datalari_olusturur() {




    }
    @Given("ZKullanici request gonderirir ve response alir")
    public void z_kullanici_request_gonderirir_ve_response_alir() {



    }
    @Given("ZKullanici response status sorgusunu yapar")
    public void z_kullanici_response_status_sorgusunu_yapar() {



    }
    @Given("ZKullanici dogrulama islemini yapar")
    public void z_kullanici_dogrulama_islemini_yapar() {


    }

    @Given("kullanici medunna apiden {string} ulke bilgilerini okur")
    public void kullanici_medunna_apiden_ulke_bilgilerini_okur(String url) {

        response = given().headers(
                        "Authorization",
                        "Bearer " + Authentication2.generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when()
                .get(url)
                .then()
                .extract()
                .response();
        response.prettyPrint();
    }
    @Given("kullanici api end point {string} den {string} ve {string} kullanarak ulke olusturur")
    public void kullanici_api_end_point_den_ve_kullanarak_ulke_olusturur(String url, String type, String country) {
        response = given().headers(
                        "Authorization",
                        "Bearer " + Authentication2.generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when().body("{\""+type+"\":\""+country+"\"}")
                .post(url)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
    }
    @Given("kullanici api end point {string} den {string} ve {string} kullanarak guncelleme yapar")
    public void kullanici_api_end_point_den_ve_kullanarak_guncelleme_yapar(String endPoint, String id, String name) {
        response = given().headers(
                        "Authorization",
                        "Bearer " + Authentication2.generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when().body("{\"id\": "+id+",\"name\": \""+name+"\"}")
                .put(endPoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
    }
    @Given("kullanici endpoint {string} ve id ile {string} ulke siler")
    public void kullanici_endpoint_ve_id_ile_ulke_siler(String endPoint, String id) {
        response =given().headers(
                        "Authorization",
                        "Bearer " + Authentication2.generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when()
                .delete(endPoint + id)
                .then()
                .extract()
                .response();
    }


}
