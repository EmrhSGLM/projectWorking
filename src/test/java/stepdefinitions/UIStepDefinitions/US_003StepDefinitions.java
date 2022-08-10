package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.HomePageOguz;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_003StepDefinitions {

    HomePage register = new HomePage();
    HomePageOguz register1 = new HomePageOguz();
    Actions actions = new Actions(Driver.getDriver());


    @And("kullanici register butonunu bulup tiklar")
    public void kullaniciRegisterButonunuBulupTiklar() {
        register.ikonElement.click();
        register.registerButonElemnti.click();
    }

    @Then("sayfada asagi iner ve password butonunu bulur")
    public void sayfadaAsagiInerVePasswordButonunuBulur() {
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();

      }
    @Then("kullanici password sekmesine en az bir  kucuk harf olacak sekilde bir password girmeli")
    public void kullanici_password_sekmesine_en_az_bir_kucuk_harf_olacak_sekilde_bir_password_girmeli() {
        register1.newPasswordBox.sendKeys(ConfigReader.getProperty("Password1"));
        ReusableMethods.waitFor(3);

    }
    @Then("kullanici password {int}'i girdigi zaman Password strenght seviyesinin degistigini gorebilmeli")
    public void kullanici_password_i_girdigi_zaman_password_strenght_seviyesinin_degistigini_gorebilmeli(Integer int1) {

        Assert.assertTrue(register1.passwordStrength2orange.isDisplayed());
    }


    @Then("kullanici Password sekmesine en az {int} buyuk harf icerecek sekilde bir password girmeli")
    public void kullaniciPasswordSekmesineEnAzBuyukHarfIcerecekSekildeBirPasswordGirmeli(int arg0) {
        register1.newPasswordBox.sendKeys(ConfigReader.getProperty("Password2"));
        ReusableMethods.waitFor(3);

    }

    @And("kullanici password {int}'yi girdigi zaman Password strenght seviyesinin degistigini gorebilmeli")
    public void kullaniciPasswordYiGirdigiZamanPasswordStrenghtSeviyesininDegistiginiGorebilmeli(int arg0) {
        Assert.assertTrue(register1.passwordStrength4green.isDisplayed());
    }

    @Then("kullanici Password sekmesine en az {int}  rakam icerecek sekilde bir password girmeli")
    public void kullaniciPasswordSekmesineEnAzRakamIcerecekSekildeBirPasswordGirmeli(int arg0) {
        register1.newPasswordBox.sendKeys(ConfigReader.getProperty("Password3"));
        ReusableMethods.waitFor(3);

    }

    @And("kullanici password {int}'u girdigi zaman Password strenght seviyesinin degistigini gorebilmeli")
    public void kullaniciPasswordUGirdigiZamanPasswordStrenghtSeviyesininDegistiginiGorebilmeli(int arg0) {
        Assert.assertTrue(register1.passwordStrength5green.isDisplayed());
    }

    @Then("kullanici Password sekmesine en az {int}  ozel karakter icerecek sekilde bir password girmeli")
    public void kullaniciPasswordSekmesineEnAzOzelKarakterIcerecekSekildeBirPasswordGirmeli(int arg0) {
        register1.newPasswordBox.sendKeys(ConfigReader.getProperty("Password4"));
        ReusableMethods.waitFor(3);
    }

    @Then("kullanici Password sekmesine en az {int}  karakterden olusacak sekilde bir Password girmeli")
    public void kullaniciPasswordSekmesineEnAzKarakterdenOlusacakSekildeBirPasswordGirmeli(int arg0) {
        register1.newPasswordBox.sendKeys(ConfigReader.getProperty("Password5"));
        ReusableMethods.waitFor(3);
    }
}
