package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.ConfigReader;
import utilities.Driver;

public class Hooks {

    public static RequestSpecification spec;

    @Before(value= "@ApiRegistrant")
    public void setup(){
        spec = new RequestSpecBuilder().
                setBaseUri(ConfigReader.getProperty("base_url")).
                build();
    }

    @Before(order = 1, value = "@UIRegistration")
    public void navigateToRegistrationPage(){

        Driver.getDriver().get(ConfigReader.getProperty("medunna_registration_url"));

    }

//    @Before( value = "@DBUsers")
//    public void createNewDBConnection(){
//
//        createConnection(ConfigurationReader.getProperty("db_credentials_url"),
//                ConfigReader.getProperty("db_username"),
//                ConfigReader.getProperty("db_password"));
//
//    }


    @Before(order = 1, value = "@Appointment")
    public void navigateToLandingPage(){

        Driver.getDriver().get(ConfigReader.getProperty("medunna_registration_url"));

    }

    @Before(order=1, value="@UIRegistration")
    public void navigateToRegistration(){
        Driver.getDriver().get(ConfigReader.getProperty(""));
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshots");
        }
       Driver.closeDriver();
    }





}