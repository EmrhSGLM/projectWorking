package stepdefinitions.APIStepDefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utilities.ConfigReader;

import java.io.IOException;
import java.util.HashMap;


import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class ApiAppoinmentsVerify {

    Response response;
    HashMap<String, Object> expectedData;
    public static RequestSpecification spec;

    @Given("EKullanıcı randevu sorgusu icin get path params ayarını yapar")
    public void e_kullanıcı_randevu_sorgusu_icin_get_path_params_ayarını_yapar() {
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("base_url")).build();
        spec.pathParams("get1", "api", "get2", "appointments",
                "get3", "3412");
        // api/appointments/3412
    }
    @Given("EKullanıcı randevular ile alakalı expected dataları olusturur")
    public void e_kullanıcı_randevular_ile_alakalı_expected_dataları_olusturur() {
        /*
        {
    "createdBy": "anonymousUser",
    "createdDate": "2021-12-28T19:01:32.728695Z",
    "id": 3412,
    "startDate": "2021-12-29T00:00:00Z",
    "endDate": "2021-12-29T01:00:00Z",
    "status": "UNAPPROVED",
    "anamnesis": "history",
    "treatment": null,
    "diagnosis": null,
    "prescription": null,
    "description": null,

         */
        expectedData = new HashMap<>();
        expectedData.put("createdBy", "anonymousUser");
        expectedData.put("id", 3412);
        expectedData.put("status", "UNAPPROVED");
        expectedData.put("anamnesis", "history");

    }

    @Given("EKullanıcı randevu icin request gonderirir ve response alır")
    public void e_kullanıcı_randevu_icin_request_gonderirir_ve_response_alır() {
        String token = generateToken("ADMINEmrah", "Amine2016+-");
        response = given().
                headers("Authorization", "Bearer " + token).
                //given().
                spec(spec).
                contentType(ContentType.JSON).
                when().
                get("/{get1}/{get2}/{get3}");

        //response.prettyPrint();

    }
    @Given("EKullanıcı  response status sorgusunu yapar")
    public void e_kullanıcı_response_status_sorgusunu_yapar() {
        response.then().assertThat().statusCode(200);
    }
    @Given("EKullanıcı randevu dogrulama islemini yapar")
    public void e_kullanıcı_randevu_dogrulama_islemini_yapar() throws IOException {
        ObjectMapper obj = new ObjectMapper();
        HashMap<String, Object> actualData = obj.readValue(response.asString(), HashMap.class);
        assertEquals(expectedData.get("createdBy"), actualData.get("createdBy"));
        assertEquals(expectedData.get("id"), actualData.get("id"));
        assertEquals(expectedData.get("status"), actualData.get("status"));
        assertEquals(expectedData.get("anamnesis"), actualData.get("anamnesis"));

    }



}
