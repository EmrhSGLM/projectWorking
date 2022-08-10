package stepdefinitions.DBStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DatabaseUtility;

import java.util.ArrayList;
import java.util.List;

public class US_002_EmailDBStepDef {

    @Given("kullanici veritabanina baglanir")
    public void kullaniciVeritabaninaBaglanir() {
        DatabaseUtility.createConnectionCck();

    }

   /* @And("email sutunundaki verileri kaydeder")
    public void emailSutunundakiVerileriKaydeder() throws JsonProcessingException {
        String filename="src/test/resources/testdata/EmailList.txt";
        ObjectMapper obj = new ObjectMapper();
        registrants = obj.readValue(response.asString(), Registrant[].class);
        WriteToTxt.saveEmailData(filename,registrants);
    }*/

    List<Object> emailDB= new ArrayList<>();
    @And("{string} sutunundaki verileri secer")
    public void sutunundakiVerileriSecer(String email) {
        String query="select * from jhi_user";
        emailDB=DatabaseUtility.getColumnData(query,"Email");
        //System.out.println("emailDB = " + emailDB);
    }

    @Then("kullanici {string} dogrulamasi yapar")
    public void kullaniciDogrulamasiYapar(String email) {
        Assert.assertTrue(emailDB.toString().contains(email));

    }

    @Then("veritabani ile bağlantiyi sonlandirir")
    public void veritabaniIleBağlantiyiSonlandirir() {
        DatabaseUtility.closeConnection();
    }
}
