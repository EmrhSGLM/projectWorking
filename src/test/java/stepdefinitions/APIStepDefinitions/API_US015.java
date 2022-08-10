package stepdefinitions.APIStepDefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import pojos.Patients_US015;
import utilities.ConfigReader;


import java.io.IOException;
import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;
import static utilities.WriteToTxt.savePatientdata;

public class API_US015 {
    public static RequestSpecification spec;
    Response response;
    Patients_US015 patients_us015=new Patients_US015();
    //  Patients_US015[] patients_us015s;



    @Given("US0015 Kullanici gerekli path params ayarini yapar")
    public void us0015_kullanici_gerekli_path_params_ayarini_yapar() {
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("base_url")).build();
        spec.pathParams("1", "api", "2", "patients");

        // https://medunna.com/api/patients

    }
    @Then("US0015 Kullanici items ile alakali expected datalari {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string} girer")
    public void us0015_kullanici_items_ile_alakali_expected_datalari_girer(String firstname, String lastname, String birthday, String phone,
                                                                           String gender, String bloodGroup, String adress,
                                                                           String email, String description) {


        firstname = Faker.instance().name().firstName();
        lastname = Faker.instance().name().lastName();
        //birthday=Faker.instance().date().birthday(21,35).toString();
        patients_us015.setFirstname(firstname);
        patients_us015.setLastname(lastname);
        patients_us015.setBirthday(birthday);
        patients_us015.setPhone(phone);
        patients_us015.setGender(gender);
        patients_us015.setBloodGroup(bloodGroup);
        patients_us015.setAdress(adress);
        patients_us015.setEmail(email);
        patients_us015.setDescription(description);

        System.out.println(patients_us015);
    }
    @Then("US0015 Kullanici request gonderirir ve response alir")
    public void us0015_kullanici_request_gonderirir_ve_response_alir() {

        String token = generateToken("Team88Admin","Batch44+");
        System.out.println(token);
        response = given().
                headers("Authorization", "Bearer " + token).
                given().
                spec(spec).
                contentType(ContentType.JSON).
                body(patients_us015).
                when().
                post("/{1}/{2}");

        response.prettyPrint();




    }
    @Then("US0015 Kullanici response status sorgusunu yapar")
    public void us0015_kullanici_response_status_sorgusunu_yapar() {
       response.then().assertThat().statusCode(200);



    }
    @Then("US0015 Kullanici API kayitlarini dosyaya kaydeder")
    public void us0015_kullanici_api_kayitlarini_dosyaya_kaydeder() {

        savePatientdata(patients_us015);


    }
    @Then("US0015 Kullanici API kayitlarini dogrular")
    public void us0015_kullanici_api_kayitlarini_dogrular() throws IOException {

        response.prettyPrint();
        //System.out.println(patients_us015.toString());

        ObjectMapper obj = new ObjectMapper();

        HashMap<String, Object> actualTestData = obj.readValue(response.asString(), HashMap.class);
        //System.out.println("actualTestData => "+actualTestData);

        assertEquals(patients_us015.getFirstname(), actualTestData.get("firstname"));
        assertEquals(patients_us015.getLastname(), actualTestData.get("lastname"));
        assertEquals(patients_us015.getBirthday(), actualTestData.get("birthday"));
        assertEquals(patients_us015.getPhone(), actualTestData.get("phone"));
        assertEquals(patients_us015.getGender(), actualTestData.get("gender"));
        assertEquals(patients_us015.getBloodGroup(), actualTestData.get("bloodGroup"));
        assertEquals(patients_us015.getAdress(), actualTestData.get("adress"));
        assertEquals(patients_us015.getEmail(), actualTestData.get("email"));
        assertEquals(patients_us015.getDescription(), actualTestData.get("description"));

    }

}

