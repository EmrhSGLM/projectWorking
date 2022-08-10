package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.RegistarPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class KullaniciGiris {

    HomePage homePages = new HomePage();
    RegistarPage register=new RegistarPage();

    @Given("Medunna sayfasının urlsini girer")
    public void medunna_sayfasının_urlsini_girer() {

        Driver.getDriver().get(ConfigReader.getProperty("URL"));
    }

    @Given("ikonu tiklar")
    public void ikonu_tiklar() {
        clickElementByJS(homePages.ikonElement);
        ReusableMethods.waitFor(1);
    }

    public static void clickElementByJS(WebElement element) {
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        jsexecutor.executeScript("arguments[0].click();", element);
    }

    @Given("sig in eder")
    public void sig_in_eder() {
        //  Actions actions=new Actions(Driver.getDriver());
        ReusableMethods.waitFor(1);
        // actions.click(homePages.signInGirisButtonElement).perform();
        clickElementByJS(homePages.signInButtonElement);
        ReusableMethods.waitFor(1);

    }

    @Then("username ve password girer")
    public void username_ve_password_girer() {
        homePages.userNameBoxElement.sendKeys("UserEymen");

        homePages.passwordBoxElement.sendKeys("123456");
    }

    @Then("sign eder")

    public void sign_eder() {

        clickElementByJS(homePages.signInGirisButtonElement);
    }

    @Then("ikona tıklar")

    public void ikona_tıklar() {
        clickElementByJS(homePages.ikonElement);
    }

    @Then("ikondan settingse tıklar")
    public void ikondan_settingse_tıklar() {
        clickElementByJS(register.settingsbutonu);
    }

    @Then("firstname kutusunu siler")
    public void firstname_kutusunu_siler() {
        register.firstnamekutusu.clear();
    }

    @Then("firstname  girer")
    public void firstname_girer() {
        register.firstnamekutusu.sendKeys("UserEymen");
    }


    @Then("lastname kutusunu siler")
    public void lastname_kutusunu_siler() {
        register.lastnamekutusu.clear();
    }

    @Then("lastname girer")
    public void lastname_girer() {
        register.lastnamekutusu.sendKeys("Eymen");
    }

    @Then("Email kutusunu siler")
    public void email_kutusunu_siler() {
        register.emailkutusu.clear();
    }

    @Then("e mail girer")
    public void e_mail_girer() {
        register.emailkutusu.sendKeys("eymen@gmail.com");
    }

    @Then("save eder")
    public void save_eder() {
        register.userSaveButonu.click();


        // clickElementByJS(homePages.userSaveButonu);

        //  ReusableMethods.waitFor(1);
    }

    @Then("setting saved!yazisini görür")
    public void setting_saved_yazisini_görür() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(register.settingsSavedYaziElementi.isDisplayed());
    }

    @Then("firstname kutusunu bos bırakır")
    public void firstname_kutusunu_bos_bırakır() {
        register.firstnamekutusu.clear();
        register.firstnamekutusu.sendKeys(Keys.ENTER);


    }

    @Then("{string} yazısı görülür")
    public void yazısı_görülür(String string) {
        Assert.assertTrue(register.firstnameyanlisdata.isDisplayed());

    }


    //String actualSettingsSaved = homePages.settingsSavedYaziElementi.isDisplayed()
    //Assert.assertTrue(actualSettingsSaved.contains("Settings Saved!"));
    // ReusableMethods.waitFor(1);

    @Then("lastname kutusunu bos bırakır veya gecersiz bilgi girer")
    public void lastname_kutusunu_bos_bırakır_veya_gecersiz_bilgi_girer() {
        register.lastnamekutusu.clear();
        register.lastnamekutusu.sendKeys(Keys.ENTER);
    }

    @Then("{string} yazisini görür")
    public void yazisini_görür(String string) {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(register.lastnameyanlısdata.isDisplayed());
        ReusableMethods.waitFor(1);
    }
    @Then("emaile bos bırakir veya gecersiz bilgi girer")
    public void emaile_bos_bırakir_veya_gecersiz_bilgi_girer() {
        register.emailkutusu.clear();
        register.emailkutusu.sendKeys(Keys.ENTER);


    }
    @Then("Your email is required. yzisini görür")
    public void your_email_is_required_yzisini_görür() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(register.emailyanlisdata.isDisplayed());
        ReusableMethods.waitFor(1);
    }



























}
    // @Then("firstname kutusunu bos bırakır")
    //  public void firstname_kutusunu_bos_bırakır() ;
    ////  {
    //       homePages.firstnameyanlisdata.getText();
    //  }

    // @Then("{string} yazısı görülür")
    // public void yazısı_görülür(String, String) {
    //   String actualYourfirstnameisrequired=homePages.firstnameyanlisdata.getText();
    // Assert.assertTrue(actualYourfirstnameisrequired.contains("Your first name is required"));



   // @Given("firstname kutusunu bos bırakır")
    //public void firstname_kutusunu_bos_bırakır() {
      //  homePages.firstnamekutusu.clear();
        //homePages.firstnameyanlisdata.sendKeys("");
    //}
    //@Given("{string} yazısı görülür")
    //public void yazısı_görülür(String string) {









