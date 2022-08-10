package stepdefinitions.APIStepDefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojos.TestItem;
import utilities.ConfigReader;

import java.io.IOException;
import java.util.HashMap;


import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;
import static utilities.WriteToTxt.saveTestItemData;

public class ApiTestItemCreation {

    Response response;
    TestItem testItem = new TestItem();
    public static RequestSpecification spec;



    @Given("Kullanıcı gerekli path params ayarını yapar")
    public void kullanıcı_gerekli_path_params_ayarını_yapar() {
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("base_url")).build();
        spec.pathParams("post1", "api", "post2", "c-test-items");

    }
    @Then("Kullanıcı items ile alakalı expected dataları {string},{string}, {string}, {string}, " +
            "{string} girer")
    public void kullanıcıItemsIleAlakalıExpectedDatalarıGirer(String name, String description, String price,
                                                              String defaultValMin, String defaultValMax) {
        name = Faker.instance().name().firstName();
        testItem.setName(name);
        testItem.setDescription(description);
        testItem.setPrice(Integer.parseInt(price));
        testItem.setDefaultValMin(defaultValMin);
        testItem.setDefaultValMax(defaultValMax);
    }


    @Then("Kullanıcı request gonderirir ve response alır")
    public void kullanıcı_request_gonderirir_ve_response_alır() {
        String token = generateToken("ADMINEmrah","Amine2016+-");
        //System.out.println("token = " + token);
        System.out.println(testItem);
        response = given().
                headers("Authorization", "Bearer " + token).
                //given().
                spec(spec).
                contentType(ContentType.JSON).
                body(testItem).
                when().
                post("/{post1}/{post2}");

        response.prettyPrint();

    }
    @Then("Kullanıcı response status sorgusunu yapar")
    public void kullanıcı_response_status_sorgusunu_yapar() {
        response.then().assertThat().statusCode(201);
    }
    @Then("Kullanıcı API kayıtlarını dosyaya kaydeder")
    public void kullanıcı_apı_kayıtlarını_dosyaya_kaydeder() {
        saveTestItemData(testItem);

    }
    @Then("Kullanıcı API kayıtlarını dogrular")
    public void kullanıcı_apı_kayıtlarını_dogrular() throws IOException {

        //response.prettyPrint();
        //System.out.println(testItem.toString());

        ObjectMapper obj = new ObjectMapper();

        HashMap<String, Object> actualTestData = obj.readValue(response.asString(), HashMap.class);
        //System.out.println("actualTestData => "+actualTestData);

        assertEquals(testItem.getName(), actualTestData.get("name"));
        assertEquals(testItem.getDescription(), actualTestData.get("description"));
        assertEquals(testItem.getPrice(), actualTestData.get("price"));
        assertEquals(testItem.getDefaultValMin(), actualTestData.get("defaultValMin"));
        assertEquals(testItem.getDefaultValMax(), actualTestData.get("defaultValMax"));
        System.out.println("\nISLEM SONUCU\n");
        System.out.println("API ile test items create islemi Basariyla Gerceklesti");

    }

}
