package stepdefinitions.APIStepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.codehaus.jackson.map.ObjectMapper;
import pojos.TestItem;
import utilities.ConfigReader;


import java.io.IOException;
import java.util.HashMap;

import static hooks.Hooks.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class ApiTestItemVerify {
    Response response;
    TestItem expectedData;
    public static RequestSpecification spec;

    @Given("Kullanıcı gerekli get icin path params ayarını yapar")
    public void kullanıcıGerekliGetIcinPathParamsAyarınıYapar() {
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("base_url")).build();
        spec.pathParams("1", "api", "2", "c-test-items", "3", "1402");

    }

    @Given("Kullanıcı items ile alakalı expected dataları olusturur")
    public void kullanıcı_items_ile_alakalı_expected_dataları_olusturur() {
        /*
        {
                "createdBy": "admin",
                "createdDate": "2021-12-04T22:24:09.835288Z",
                "id": 1402,
                "name": "Urea",
                "description": "",
                "price": 12.00,
                "defaultValMin": "17",
                "defaultValMax": "49"
           }
         */
        expectedData = new TestItem("Urea", "", 12,
                "17", "49");

    }
    @Given("Kullanıcı request gonderiri ve response alır")
    public void kullanıcı_request_gonderiri_ve_response_alır() {
        String token = generateToken("ADMINEmrah","Amine2016+-");

       response = given().
                headers("Authorization", "Bearer " + token).
                spec(spec).
                contentType(ContentType.JSON).
                when().
                get("/{1}/{2}/{3}");

        response.prettyPrint();
        System.out.println(response.statusCode());
    }


    @And("E Kullanıcı response status sorgusunu yapar")
    public void eKullanıcıResponseStatusSorgusunuYapar() {
        response.then().assertThat().statusCode(200);
    }
    @Given("Kullanıcı dogrulama islemini yapar")
    public void kullanıcı_dogrulama_islemini_yapar() throws IOException {

        ObjectMapper obj = new ObjectMapper();

        HashMap<String, Object> actualData = obj.readValue(response.asString(), HashMap.class);


        System.out.println("actualData = " + actualData);

        assertEquals(expectedData.getName(), actualData.get("name"));
        //assertEquals(expectedData.getPrice(), actualData.get("price"));
        assertEquals(expectedData.getDefaultValMax(), actualData.get("defaultValMax"));
        assertEquals(expectedData.getDefaultValMin(), actualData.get("defaultValMin"));
        //assertEquals(expectedData.getId(), actualData.get("id"));
        System.out.println("\nISLEM SONUCU\n");
        System.out.println("Apı ile dogrulama islemi BASARIYLA YAPILDI");
    }

}
