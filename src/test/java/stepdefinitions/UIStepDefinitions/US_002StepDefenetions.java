package stepdefinitions.UIStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AliRegistaPage;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;


public class US_002StepDefenetions {
    AliRegistaPage registerPage=new AliRegistaPage();
    HomePage homePage=new HomePage();

    @When("Register sekmesini secer")
    public void register_sekmesini_secer() {
        registerPage.loginRegisterSekmesi.click();
        
       
   /* @And("Register butonuna tıklar")
    public void registerButonunaTıklar() {
        registerPage.registerButonu.click();
    }*/
       
    }

    @When("Kullanici {string} gider")
    public void kullaniciGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("Username kutusunu bos birakarak diger kutucuklara bilgi girisi yapılır")
    public void usernameKutusunuBosBirakarakDigerKutucuklaraBilgiGirisiYapılır() {
        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();
        actions.click(registerPage.SSNBox).sendKeys(faker.idNumber().ssnValid()).sendKeys(Keys.TAB).
                sendKeys(faker.name().firstName()).sendKeys(Keys.TAB).
                sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(faker.internet().emailAddress()).sendKeys(Keys.TAB).
                sendKeys("Aa1234,.").sendKeys(Keys.TAB).
                sendKeys("Aa1234,.").sendKeys(Keys.TAB).perform();
    }


    @Then("Your username is required yazisini gorur")
    public void yourUsernameIsRequiredYazisiniGorur() {
        Assert.assertTrue(registerPage.yourUsernameIsRequiredYazisi.isDisplayed());

    }


    @Then("This field is invalid yazisini gorur")
    public void thisFieldIsInvalidYazisiniGorur() {
        Assert.assertTrue(registerPage.thisFieldIsInvalid.isDisplayed());

    }
    @Then("Email kutusunu @ ve . karakterlerini kullanmadan doldurur ve diger kutucuklara bilgi girisi yapılır")
    public void emailKutusunuVeKarakterleriniKullanmadanDoldururVeDigerKutucuklaraBilgiGirisiYapılır() {
        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();
        actions.click(registerPage.SSNBox).sendKeys(faker.idNumber().ssnValid()).sendKeys(Keys.TAB).
                sendKeys(faker.name().firstName()).sendKeys(Keys.TAB).
                sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).
                sendKeys(faker.name().username()).sendKeys(Keys.TAB).
                sendKeys("abcdegmailcom").sendKeys(Keys.TAB).
                sendKeys("Aa1234,.").sendKeys(Keys.TAB).
                sendKeys("Aa1234,.").sendKeys(Keys.TAB).perform();
    }



    @Then("Email kutusunu  . karakteri kullanmadan doldurur ve diger kutucuklara bilgi girisi yapilir")
    public void emailKutusunuKarakteriKullanmadanDoldururVeDigerKutucuklaraBilgiGirisiYapilir() {
        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();
        actions.click(registerPage.SSNBox).sendKeys(faker.idNumber().ssnValid()).sendKeys(Keys.TAB).
                sendKeys(faker.name().firstName()).sendKeys(Keys.TAB).
                sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).
                sendKeys(faker.name().username()).sendKeys(Keys.TAB).
                sendKeys("abcde@gmailcom").sendKeys(Keys.TAB).
                sendKeys("Aa1234,.").sendKeys(Keys.TAB).
                sendKeys("Aa1234,.").sendKeys(Keys.TAB).perform();
    }

    @Then("Email kutusunu  @ karakteri kullanmadan doldurur ve diger kutucuklara bilgi girisi yapilmali")
    public void emailKutusunuKarakteriKullanmadanDoldururVeDigerKutucuklaraBilgiGirisiYapilmali() {
        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();
        actions.click(registerPage.SSNBox).sendKeys(faker.idNumber().ssnValid()).sendKeys(Keys.TAB).
                sendKeys(faker.name().firstName()).sendKeys(Keys.TAB).
                sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).
                sendKeys(faker.name().username()).sendKeys(Keys.TAB).
                sendKeys("abcdegmail.com").sendKeys(Keys.TAB).
                sendKeys("Aa1234,.").sendKeys(Keys.TAB).
                sendKeys("Aa1234,.").sendKeys(Keys.TAB).perform();
    }

    @Then("Email kutusunu bos birakir ve diger kutucuklara bilgi girisi yapilmali")
    public void emailKutusunuBosBirakirVeDigerKutucuklaraBilgiGirisiYapilmali() {
        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();
        actions.click(registerPage.SSNBox).sendKeys(faker.idNumber().ssnValid()).sendKeys(Keys.TAB).
                sendKeys(faker.name().firstName()).sendKeys(Keys.TAB).
                sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).
                sendKeys(faker.name().username()).sendKeys(Keys.TAB).
                sendKeys("").sendKeys(Keys.TAB).
                sendKeys("Aa1234,.").sendKeys(Keys.TAB).
                sendKeys("Aa1234,.").sendKeys(Keys.TAB).perform();
    }

    @Then("Your email is required yazisini gorur")
    public void yourEmailIsRequiredYazisiniGorur() {
        Assert.assertTrue(registerPage.yourEmailIsRequired.isDisplayed());
    }
}
