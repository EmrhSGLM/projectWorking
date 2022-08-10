package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import pages.HastaRanduvuPage;
import utilities.Driver;
import utilities.ReusableMethods;

import static stepdefinitions.UIStepDefinitions.KullaniciGiris.clickElementByJS;

public class hastaRandevuTarih {

    HastaRanduvuPage hastaRandevu=new HastaRanduvuPage();


    @Given("hasta kullanıcı username ve password girer")
    public void hasta_kullanıcı_username_ve_password_girer() {
     hastaRandevu.userNameBoxElement.sendKeys("yksl");
     hastaRandevu.passwordBoxElement.sendKeys("123456789");
    }
    @Then("Sign in eder")
    public void sign_in_eder() {
        Actions actions=new Actions(Driver.getDriver());
        ReusableMethods.waitFor(1);
    actions.click(hastaRandevu.signInGirisButtonElement).perform();
      //  clickElementByJS(hastaRandevu.signInButtonElement);
        ReusableMethods.waitFor(1);

    }
  //  @Then("sayfanin altindaki  Appointment DateTime yazısını görür")
    //public void sayfanin_altindaki_appointment_date_time_yazısını_görür() {

    //}
    @Then("My Pages butonuna tıklar")
    public void my_pages_butonuna_tıklar() {
        hastaRandevu.myPagesButonu.click();
    }
    @Then("Make N appoİTMENT butonuna tıklar")
    public void make_n_appo_itment_butonuna_tıklar() {
        clickElementByJS(hastaRandevu.myPagesButonu);
        ReusableMethods.waitFor(1);
    }
    @Then("Firstname girer")
    public void firstname_girer() {
        hastaRandevu.firstnameKutusu.sendKeys("hstyksl");
        ReusableMethods.waitFor(1);
    }
    @Then("SSN bilgisini girer")
    public void ssn_bilgisini_girer() {
    hastaRandevu.ssnKutusu.sendKeys("132-45-6789");
        ReusableMethods.waitFor(1);


       // Actions actions=new Actions(Driver.getDriver());
       // actions.sendKeys(Keys.PAGE_DOWN).perform();
       // ReusableMethods.waitFor(1);
    }

    @Then("phone bilgisini girer")
    public void phone_bilgisini_girer() {
        hastaRandevu.phoneKutusu.sendKeys("555-444-8888");
        ReusableMethods.waitFor(1);
    }
    @Then("LastName girer")
    public void last_name_girer() {
        hastaRandevu.lastnameKutusu.sendKeys("avcı");
        ReusableMethods.waitFor(1);
    }

    @Then("email kutusunu siler")
    public void email_kutusunu_siler() {
        hastaRandevu.emailKutusu.clear();
      //  ReusableMethods.waitFor(1);
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        jsexecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    @Then("Email girer")
    public void email_girer() {
        hastaRandevu.emailKutusu.sendKeys("hst@gmail.com");


       // ReusableMethods.waitFor(1);

    }
    @Then("Appointment data time \\(randevu tarihini) girer")
    public void appointment_data_time_randevu_tarihini_girer() {
        hastaRandevu.dataTimeBox.sendKeys("22.04.2022");
        ReusableMethods.waitFor(1);
    }

    @Then("Appointment registion Saved! yazisini görür")
    public void appointment_registion_saved_yazisini_görür() {
        Assert.assertTrue(hastaRandevu.appointRegistrationYaziElementi.isDisplayed());
        ReusableMethods.waitFor(1);
    }
    @Then("Send an Appoinment butonunu tıklar")
    public void send_an_appoinment_butonunu_tıklar() {
   clickElementByJS(hastaRandevu.sendAnAppoinment);
        ReusableMethods.waitFor(1);
    }
    @Then("Ssn kutusunu siler")
    public void ssn_kutusunu_siler() {
    hastaRandevu.ssnKutusu.clear();
        ReusableMethods.waitFor(1);
    }


    @Then("phone kutusunu siler")
    public void phone_kutusunu_siler() {
      hastaRandevu.phoneKutusu.clear();
        ReusableMethods.waitFor(1);
    }

    @Then("appoinment kutusunu siler")
    public void appoinment_kutusunu_siler() {
       hastaRandevu.dataTimeBox.clear();
        ReusableMethods.waitFor(1);
    }

    @Then("Appointment data time gecersiz tarih  girer")
    public void appointment_data_time_gecersiz_tarih_girer() {

      hastaRandevu.dataTimeBox.sendKeys("10.02.0001");
        ReusableMethods.waitFor(1);

    }
    @Then("gecersiz tarih yazisini görür")
    public void gecersiz_tarih_yazisini_görür() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(hastaRandevu.appointmenGecersizTarihYaziElementi.isDisplayed());
        ReusableMethods.waitFor(1);
    }


}



