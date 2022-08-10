package stepdefinitions.UIStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.Select;
import pages.DoctorsPage;
import pages.HomePage;
import pages.US_1101_DoctorsAndHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.US_011_Methods;

public class US_011Stepdefinitions {

    DoctorsPage doctorsPage=new DoctorsPage();
    HomePage homePage=new HomePage();
    JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
    ReusableMethods reusableMethods=new ReusableMethods();
    US_011_Methods us1101Methods=new US_011_Methods();
    US_1101_DoctorsAndHomePage doctorsPageUs1101=new US_1101_DoctorsAndHomePage();


    // TC_1101

    @Given("Sag ustte bulunan kullanici ikonuna tiklar")
    public void kullanici_sekmesini_tiklar() throws InterruptedException {
        reusableMethods.waitFor(2);
        homePage.ikonElement.click();

    }
    @Then("Acilan pencerede sign in secenegini tiklar")
    public void sign_in_sekmesini_tiklar() {

        homePage.signInButtonElement.click();

    }
    @Then("Kullanici adini girer")
    public void kullanici_adini_girer() {

        homePage.userNameBoxElement.sendKeys(ConfigReader.getProperty("HastaKaanUsername"));

    }
    @Then("Kullanici sifre girer")
    public void kullanici_sifre_girer() {

        homePage.passwordBoxElement.sendKeys(ConfigReader.getProperty("HastaKaanPassword"));
    }
    @Then("Kullanci sign in butonuna basar")
    public void kullanci_sign_in_butonuna_basar() {

        homePage.signInGirisButtonElement.click();

    }
    @Then("Sayfayi Make an Appointment basligini gorunceye kadar asagi kaydirir")
    public void anasayfada_bulunan_get_started_sekmesini_tiklar() {

        js.executeScript("javascript:window.scrollBy(0,1000)");
        homePage.makeAnAppointmentFirstNameBox.click();
        doctorsPageUs1101.makeAnAppointmentLastNameBox.click();
        doctorsPageUs1101.makeAnAppointmentSsnBox.click();
        doctorsPageUs1101.makeAnAppointmentPhoneBox.click();
        doctorsPageUs1101.makeAnAppointmentEmailBox.click();

    }
    @Then("Firstname textbox'ina isim yazmiyorsa, hastanin ismi yazilir")
    public void firstname_textbox_ina_isim_yazmiyorsa_hastanin_ismi_yazilir() {

        try {
            Assert.assertFalse(doctorsPageUs1101.makeAnAppointmentFirstnameTextBosUyariYazisi.isDisplayed());
                homePage.makeAnAppointmentFirstNameBox.sendKeys(ConfigReader.getProperty("HastaKaanUsername"));
        }catch (NoSuchElementException e){
            System.out.println("firstname textbox bilgi iceriyor");
        }


    }

    @Then("Lastname textbox'ina soyisim yazmiyorsa, hastanin soyismi yazilir")
    public void lastname_textbox_ina_soyisim_yazmiyorsa_hastanin_soyismi_yazilir() {

        try {
            Assert.assertFalse(doctorsPageUs1101.makeAnAppointmentLastnameTextBosUyariYazisi.isDisplayed());
                doctorsPageUs1101.makeAnAppointmentLastNameBox.sendKeys(ConfigReader.getProperty("HastaKaanLastName"));
        }catch (NoSuchElementException e){
            System.out.println("lastname textbox bilgi iceriyor");
        }


    }
    @Then("SSN textbox'ina SSN yazmiyorsa, hastanin SSN yazilir")
    public void ssn_textbox_ina_ssn_yazmiyorsa_hastanin_ssn_yazilir()  {

        try {
            Assert.assertFalse(doctorsPageUs1101.makeAnAppointmentSsnTextBosUyariYazisi.isDisplayed());
                doctorsPageUs1101.makeAnAppointmentSsnBox.sendKeys(ConfigReader.getProperty("HastaKaanSsn"));
        }catch (NoSuchElementException e){
            System.out.println("ssn textbox bilgi iceriyor");
        }


    }
    @Then("Email textbox'ina email yazmiyorsa, hastanin email yazilir")
    public void email_textbox_ina_email_yazmiyorsa_hastanin_email_yazilir() {


        try {
            Assert.assertFalse(doctorsPageUs1101.makeAnAppointmentEmailTextBosUyariYazisi.isDisplayed());
                doctorsPageUs1101.makeAnAppointmentEmailBox.sendKeys(ConfigReader.getProperty("HastaKaanEmail"));
        }catch (NoSuchElementException e){
            System.out.println("ssn textbox bilgi iceriyor");
        }


    }
    @Then("Phone textbox'ina phone yazmiyorsa, hastanin telefon numarasi yazilir")
    public void phone_textbox_ina_phone_yazmiyorsa_hastanin_telefon_numarasi_yazilir() {

  //- Text bos ise bilgi gonder degilse gonderme olarak 2 sart oldugu icin if blok kullan  --//
        try {
            if(doctorsPageUs1101.makeAnAppointmentPhoneTextBosUyariYazisi.isDisplayed())
                doctorsPageUs1101.makeAnAppointmentPhoneBox.sendKeys(ConfigReader.getProperty("HastaKaanPhone"));
        }catch (NoSuchElementException e){
            System.out.println("phone textbox bilgi iceriyor");
        }

        // 2. way

        if( doctorsPageUs1101.makeAnAppointmentPhoneBox.getAttribute("value").length()==0){
            doctorsPageUs1101.makeAnAppointmentPhoneBox.sendKeys(ConfigReader.getProperty("HastaKaanPhone"));
        }

    }

    @Then("Appointment DateTime uzerinden randevu alinacak tarih secilir")
    public void appointment_date_time_uzerinden_randevu_alinacak_tarih_secilir() {

        doctorsPageUs1101.makeAnAppointmentDateTimeBox.sendKeys(ConfigReader.getProperty("HastaKaanRandevuTarihi"));

    }
    @Then("Send an Appointment Request butonuna basilir")
    public void send_an_appointment_request_butonuna_basilir() {

        doctorsPageUs1101.makeAnAppointmentSendAppointmentRequestButon.click();

    }
    @Then("Randevunun olusturuldugu goruntulenir")
    public void randevunun_olusturuldugu_goruntulenir() {

        Assert.assertTrue(doctorsPageUs1101.succesYaziElementi.isDisplayed());
    }

    // TC_1102

    @Then("Doktor kullanici adini girer")
    public void doktorKullaniciAdiniGirer() {
        homePage.userNameBoxElement.sendKeys(ConfigReader.getProperty("DrArsenLupenUsername"));
    }

    @And("Doktor kullanici sifre girer")
    public void doktorKullaniciSifreGirer() {
        homePage.passwordBoxElement.sendKeys(ConfigReader.getProperty("DrArsenLupenPassword"));
    }


    @Then("MY PAGES sekmesini tiklanir")
    public void my_pages_sekmesini_tiklanir() throws InterruptedException {
        reusableMethods.waitFor(2);
        doctorsPage.myPagesButtonElement.click();
    }
    @Then("Acilan pencerede My Appointments tiklanir")
    public void acilan_pencerede_my_appointments_tiklanir() throws InterruptedException {
        reusableMethods.waitFor(2);
        doctorsPage.myAppointmentsButtonElement.click();

    }
    @Then("ID no goruntulenir")
    public void id_no_goruntulenir() {
        us1101Methods.getTableTitle(1);
        us1101Methods.getTableBody(1);

    }


    @Then("Start DateTime goruntulenir")
    public void start_date_time_goruntulenir() {
        us1101Methods.getTableTitle(2);
        us1101Methods.getTableBody(2);
    }
    @Then("End DateTime goruntulenir")
    public void end_date_time_goruntulenir() {
        us1101Methods.getTableTitle(3);
        us1101Methods.getTableBody(3);
    }
    @Then("Durum goruntulenir")
    public void durum_goruntulenir() {
        us1101Methods.getTableTitle(4);
        us1101Methods.getTableBody(4);
    }
    @Then("Doktor ismi goruntulenir")
    public void doktor_ismi_goruntulenir() {
        us1101Methods.getTableTitle(11);
        us1101Methods.getTableBody(11);
    }
    @Then("Hastanin ismi goruntulenilir")
    public void hastanin_ismi_goruntulenilir() {
        us1101Methods.getTableTitle(12);
        us1101Methods.getTableBody(12);

    }

    // TC_1103

    @Then("Hasta numarasi yazilir {int} ve Update edilecek hastanin bilgilerinin yaninda bulunan edit butonuna tiklanir")
    public void updateEdilecekHastaninBilgilerininYanindaBulunanEditButonunaHastaNoOlarakBasilir(int no) {
        us1101Methods.editButonuSec(no).click();
    }
    @And("Anamnesis bos birakilirsa uyari verir")
    public void anamnesisBosBirakilirsaUyariVerir() throws InterruptedException {
        js.executeScript("javascript:window.scrollBy(0,750)");
        reusableMethods.waitFor(2);
        doctorsPageUs1101.anamnesisTextBox.click();
        reusableMethods.waitFor(2);
        doctorsPageUs1101.treatmentTextBox.click();
        reusableMethods.waitFor(2);
        Assert.assertTrue(doctorsPageUs1101.anamnesisTextBoxBosBirakilamazYazisi.isDisplayed());
    }



    @And("Treatment bos birakilirsa uyari verir")
    public void treatmentBosBirakilirsaUyariVerir() throws InterruptedException {
        doctorsPageUs1101.treatmentTextBox.click();
        reusableMethods.waitFor(2);
        doctorsPageUs1101.anamnesisTextBox.click();
        Assert.assertTrue(doctorsPageUs1101.treatmentTextBoxBosBirakilamazYazisi.isDisplayed());
        reusableMethods.waitFor(2);
    }


    @And("Diagnosis bos birakilirsa uyari verir")
    public void diagnosisBosBirakilirsaUyariVerir() throws InterruptedException {
        reusableMethods.waitFor(2);
        doctorsPageUs1101.diagnosisTextBox.click();
        reusableMethods.waitFor(2);
        doctorsPageUs1101.treatmentTextBox.click();
        reusableMethods.waitFor(2);
        Assert.assertTrue(doctorsPageUs1101.diagnosisTextBoxBosBirakilamazYazisi.isDisplayed());
        reusableMethods.waitFor(2);
    }
    @And("Anamnesis kismina {string} girilir")
    public void anamnesisEBilgiGirilir(String bilgi) {
        doctorsPageUs1101.anamnesisTextBox.sendKeys(ConfigReader.getProperty(bilgi));
    }
    @And("Treatment kismina {string} girilir")
    public void treatmentKisminaGirilir(String bilgi) throws InterruptedException {
        doctorsPageUs1101.treatmentTextBox.sendKeys(ConfigReader.getProperty(bilgi));
        reusableMethods.waitFor(2);
        js.executeScript("arguments[0].scrollIntoView ();",doctorsPageUs1101.treatmentTextBox);

    }
    @And("Diagnosis kismina {string} girilir")
    public void diagnosiskisminaGirilir(String bilgi) {
        doctorsPageUs1101.diagnosisTextBox.sendKeys(ConfigReader.getProperty(bilgi));
    }
    @Then("Save butonuna basilir")
    public void save_butonuna_basilir() {
        doctorsPageUs1101.saveButonu.click();

    }
    @Then("Update gerceklestirildi yazisi goruntulenir")
    public void update_gerceklestirildi_yazisi_goruntulenir() {

        Assert.assertTrue(doctorsPageUs1101.succesYaziElementi.isDisplayed());
    }

    // TC_1104

    @And("Description bos birakilir")
    public void descriptionBosBirakilir() {
        doctorsPageUs1101.descriptionTextBox.click();
        doctorsPageUs1101.prescriptionTextBox.click();
    }

    @And("Prescription bos birakilir")
    public void prescriptionBosBirakilir() {
        doctorsPageUs1101.prescriptionTextBox.click();
        doctorsPageUs1101.descriptionTextBox.click();
    }


    @And("Description kismina {string} girilir")
    public void descriptionKisminaGirilir(String bilgi) {
        doctorsPageUs1101.descriptionTextBox.sendKeys(ConfigReader.getProperty(bilgi));
    }

    @And("Prescription kismina {string} girilir")
    public void prescriptionKisminaGirilir(String bilgi) {
        doctorsPageUs1101.prescriptionTextBox.sendKeys(ConfigReader.getProperty(bilgi));
    }

    @And("Kullanici bir onceki sayfaya geri doner")
    public void birOncekiSayfayaGeriDoner() throws InterruptedException {
        Driver.getDriver().navigate().back();
        reusableMethods.waitFor(2);
        js.executeScript("arguments[0].scrollIntoView ();",doctorsPageUs1101.prescriptionTextBox);
    }

    // TC_1105

    @Then("Status'a erisilir")
    public void status_erisilir()  {
        Select select=new Select(doctorsPageUs1101.statusDropdownElementi);
        js.executeScript("javascript:window.scrollBy(0,250)");
        Assert.assertTrue(doctorsPageUs1101.statusDropdownElementi.isEnabled());
        doctorsPageUs1101.statusDropdownElementi.click();
    }

    @Then("CANCELLED secilir")
    public void cancelled_secilir() throws InterruptedException {
        Select select=new Select(doctorsPageUs1101.statusDropdownElementi);
        reusableMethods.waitFor(2);
        select.selectByValue("CANCELLED");
    }

    @Then("CANCELLED'in secili oldugu ekran goruntusu ile goruntulenir")
    public void cancelled_in_secili_oldugu_goruntulenir() {

        us1101Methods.getScreenshot("CANCELLED",doctorsPageUs1101.statusElemanGoruntule);
    }

    @Then("PENDING secilir")
    public void pendıng_secilir() throws InterruptedException {
        Select select=new Select(doctorsPageUs1101.statusDropdownElementi);
        reusableMethods.waitFor(2);
        select.selectByValue("PENDING");
    }

    @Then("PENDING'in secili oldugu ekran goruntusu ile goruntulenir")
    public void pendıng_in_secili_oldugu_goruntulenir() {
        us1101Methods.getScreenshot("PENDING",doctorsPageUs1101.statusElemanGoruntule);
    }

    @Then("COMPLETED secilir")
    public void completed_secilir() throws InterruptedException {
        Select select=new Select(doctorsPageUs1101.statusDropdownElementi);
        reusableMethods.waitFor(2);
        select.selectByValue("COMPLETED");
    }

    @Then("COMPLETED'in secili oldugu ekran goruntusu ile goruntulenir")
    public void completed_in_secili_oldugu_goruntulenir() {
        us1101Methods.getScreenshot("COMPLETED",doctorsPageUs1101.statusElemanGoruntule);
    }



}
