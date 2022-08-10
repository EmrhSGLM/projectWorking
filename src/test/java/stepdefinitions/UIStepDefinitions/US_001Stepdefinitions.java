package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import pages.DoctorsPage;
import pages.HomePage;
import pages.US_101_Registiration;
import pages.US_1101_DoctorsAndHomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_001Stepdefinitions {

    HomePage homePage=new HomePage();
    DoctorsPage doctorsPage=new DoctorsPage();
    US_101_Registiration registirationPage=new US_101_Registiration();
    US_1101_DoctorsAndHomePage doctorsAndHomePage=new US_1101_DoctorsAndHomePage();
    JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();



    @Then("Register butonuna tıklar")
    public void register_butonuna_tıklar() throws InterruptedException {
        Thread.sleep(2000);
        homePage.ikonElement.click();
        Thread.sleep(2000);
        homePage.registerButonElemnti.click();
    }
    @And("SSN numarasinin ucuncu ve besinci rakamlardan sonra - olacak sekilde girer")
    public void ssnSifresiniUcuncuVeBesinciRakamlardanSonraOlacakSekildeGirer() {
        registirationPage.registrationSsnTextBox.click();
        registirationPage.getRegistrationWindowTitle.click();


        Assert.assertTrue(registirationPage.ssnTextBosElementi.isDisplayed());
        registirationPage.registrationSsnTextBox.sendKeys(ConfigReader.getProperty("VaidRegistration"));

        registirationPage.getRegistrationWindowTitle.click();
    }
    @And("Sayinin 9 hane uzunlugunda oldugu kontrol edilir")
    public void sayininHaneUzunlugundaOlduguKontrolEdilir() {
        String ssnType= ConfigReader.getProperty("VaidRegistration").toString();
        String ssnSayilari=ssnType.replaceAll("-","");
        //System.out.println(ssnSayilari.length());
        Assert.assertTrue(ssnSayilari.length()==9);

    }

    @Then("Girilen SSN nin dogru girildigini dogrular")
    public void girilen_ssn_nin_dogru_girildigini_dogrular() throws InterruptedException {

        try {
            Assert.assertFalse(registirationPage.ssnTextBosElementi.isDisplayed());
        }catch (NoSuchElementException e){
            //System.out.println("SSN eksik girilmemistir");
        }

        try {
            Assert.assertFalse(registirationPage.ssnTextHataliElement.isDisplayed());
        }catch (NoSuchElementException e){
            //System.out.println("SSN dogru girilmistir");
        }


    }
    /*
    @Then("sayfayi kapatir")
    public void sayfayiKapatir() throws InterruptedException {
        Thread.sleep(3000);
        Driver.closeDriver();
    }
*/
    // TC_102

    @And("SSN kutusunu bos bırakır")
    public void ssnKutusunuBosBırakır() {
        registirationPage.randevuSsnTextBox.click();

    }

    @Given("First Name girilir,")
    public void first_name_girilir() {
        registirationPage.registrationFirstName.sendKeys(ConfigReader.getProperty("HastaKaanUsername"));

    }
    @Then("Lastname girilir,")
    public void lastname_girilir() {
        registirationPage.registrationLastName.sendKeys(ConfigReader.getProperty("HastaKaanLastName"));

    }
    @Then("Username girilir,")
    public void username_girilir() {
        registirationPage.registrationUsername.sendKeys(ConfigReader.getProperty("HastaKaanUsername"));
    }
    @Then("Email girilir,")
    public void email_girilir() {
        js.executeScript("javascript:window.scrollBy(0,350)");
        registirationPage.registrationEmail.sendKeys(ConfigReader.getProperty("HastaKaanEmail"));

    }
    @Then("New Password girilir,")
    public void new_password_girilir() {
        registirationPage.passwordTextBox.sendKeys("HastaKaanPassword");

    }
    @Then("New password confirmation girilir,")
    public void new_password_confirmation_girilir() {
        registirationPage.registrationSecondPassword.sendKeys("HastaKaanPassword");

    }
    @Then("Sayfa yukari kaydirilir")
    public void sayfa_yukari_kaydirilir() {
        js.executeScript("javascript:window.scrollBy(0,-350)");

    }
    @Then("Ssn bos birakilamaz yazisi goruntulenir")
    public void ssn_bos_birakilamaz_yazisi_goruntulenir() {

        Assert.assertTrue(registirationPage.ssnTextBosElementi.isDisplayed());
    }

    // TC_103

    @And("First Name {string} girilir,")
    public void firstNameGirilir(String karakter) throws InterruptedException {

        registirationPage.registrationFirstName.sendKeys(karakter);
        registirationPage.getRegistrationWindowTitle.click();
    }


    @And("First Name hatali giris olmadigi kontrol edilir")
    public void hataliGirisOlmadigiKontrolEdilir() throws InterruptedException {


        try {
            Assert.assertFalse(registirationPage.firstNameTextHataliElement.isDisplayed());
        }catch (NoSuchElementException e){
            System.out.println("First Name dogru girilmistir");
        }

    }

    @And("Last Name {string} girilir,")
    public void lastNameGirilir(String karakter) {
        registirationPage.registrationLastName.sendKeys(karakter);
        registirationPage.getRegistrationWindowTitle.click();

    }

    @And("Last Name hatali giris olmadigi kontrol edilir")
    public void lastNameHataliGirisOlmadigiKontrolEdilir() {

        try {
            Assert.assertFalse(registirationPage.lastNameTextHataliElement.isDisplayed());
        }catch (NoSuchElementException e){
            System.out.println("First Name dogru girilmistir");
        }

    }

    @And("First Name bos birakilir")
    public void firstNameBosBirakilir() throws InterruptedException {
        registirationPage.registrationFirstName.sendKeys("");
        registirationPage.getRegistrationWindowTitle.click();
        Thread.sleep(2000);

    }

    @Then("First Name bos birakilmaz yazisi goruntulenir")
    public void firstNameBosBirakilmazYazisiGoruuntulenir() {
        Assert.assertTrue(registirationPage.firstnameTextBosElementi.isDisplayed());
    }

    @And("Last Name bos birakilir")
    public void lastNameBosBirakilir() {
        registirationPage.registrationLastName.sendKeys("");
        registirationPage.getRegistrationWindowTitle.click();
        registirationPage.getRegistrationWindowTitle.click();

    }

    @Then("Last Name bos birakilmaz yazisi goruntulenir")
    public void lastNameBosBirakilmazYazisiGoruuntulenir() {
        Assert.assertTrue(registirationPage.lastnameTextBosElementi.isDisplayed());
    }
}



