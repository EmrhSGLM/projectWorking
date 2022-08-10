package stepdefinitions.APIStepDefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import org.junit.Assert;
import pojos.Registrant;
import utilities.*;

import java.io.IOException;
import java.util.HashMap;

import static org.hamcrest.Matchers.*;

public class US_002_EmailApiStepDef {
    Response response;
    Registrant[] registrants;



     //  @Given("kullanici path params ayarlar")
    //public void kullaniciPathParamsAyarlar() {
        //spec.pathParams("parametre1", "api", "parametre2", "authenticate");

   // }

    @And("kullanici token olusturur")
    public void kullaniciTokenOlusturur() {
        response= ApiUtils.getRequest(Authentication.generateTokenCk(),
                ConfigReader.getProperty("registrant_endpoint"));
       response.prettyPrint();

    }
    @Then("kullanici emaili dogrular")
    public void kullaniciEmailiDogrular() throws IOException {

        response.then().statusCode(200);
        response.then().assertThat().body("email",hasItem("ali91@gmail.com"));
        response.then().assertThat().body("email", hasItem("hastapasta@gmail.com"));

      /* JsonPath jsonPath=response.jsonPath();
        System.out.println("jsonPath = " + jsonPath); // jsonPath = io.restassured.path.json.JsonPath@1e545821
        String jsonData="{\n" +
                "        \"id\": 18375,\n" +
                "        \"login\": \"madisonmonahan\",\n" +
                "        \"firstName\": \"Madison\",\n" +
                "        \"lastName\": \"Monahan\",\n" +
                "        \"ssn\": \"858-40-8706\",\n" +
                "        \"email\": \"betty.beer@hotmail.com\",\n" +
                "        \"imageUrl\": null,\n" +
                "        \"activated\": false,\n" +
                "        \"langKey\": \"en\",\n" +
                "        \"createdBy\": \"anonymousUser\",\n" +
                "        \"createdDate\": \"2022-03-07T20:51:56.923817Z\",\n" +
                "        \"lastModifiedBy\": \"anonymousUser\",\n" +
                "        \"lastModifiedDate\": \"2022-03-07T20:51:56.923817Z\",\n" +
                "        \"authorities\": [\n" +
                "            \n" +
                "        ]\n" +
                "    }";

        HashMap<String,Object> expected= Obj_Mapper_Util.ConvertJsonToJava(jsonData,HashMap.class);
        HashMap<String,Object> actualData= Obj_Mapper_Util.ConvertJsonToJava(response.asString(),HashMap.class);
        Assert.assertEquals(expected.get("email"),actualData.get("email"));*/


       /*String filename="src/test/resources/testData/EmailList.txt";
        ObjectMapper obj = new ObjectMapper();
        registrants = obj.readValue(response.asString(), Registrant[].class);
        WriteToTxt.saveEmailData(filename,registrants);*/





    }


}
