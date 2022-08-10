package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.Given;
import utilities.ConfigReader;
import utilities.Driver;

public class againStepDefinitions {

    @Given("Kullanici URL'e gider")
    public void kullanici_url_e_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("URL"));
    }
}
