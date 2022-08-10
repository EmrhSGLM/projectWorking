package stepdefinitions.APIStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import pojos.TestItem;
import pojos.US018PhysiciansBaseUrl;
import pojos.US018TestData;
import stepdefinitions.DBStepDefinitions.US_018DataBase;
import utilities.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_018StepDefinitions extends US018PhysiciansBaseUrl {

    HomePage homePage=new HomePage();
    DoctorsPage doctorsPage=new DoctorsPage();
    US_101_Registiration registirationPage=new US_101_Registiration();
    US_1101_DoctorsAndHomePage doctorsAndHomePage=new US_1101_DoctorsAndHomePage();
    JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
    US_018_AdminPage adminPage=new US_018_AdminPage();
    US_011_Methods methods=new US_011_Methods();

// TC1801
    @When("Admin username girer")
    public void admin_username_girer() {

    homePage.userNameBoxElement.sendKeys(ConfigReader.getProperty("AdminUsername"));
    }
    @When("Admin password girer")
    public void admin_password_girer() {

    homePage.passwordBoxElement.sendKeys(ConfigReader.getProperty("AdminPassword"));
    }
    @When("Items&Titles linkine tiklar")
    public void items_titles_linkine_tiklar() throws InterruptedException {
        adminPage.aItemsTitleLinki.click();

    }
    @Then("Acilan pencerede Physician linkine tiklar")
    public void acilan_pencerede_physician_linkine_tiklar() {
        adminPage.aPhysicianLinki.click();

    }
    @Then("Kayitli olan doktor listesinden istenilen doktor icin edit butonu tiklanir")
    public void kayitli_olan_doktor_listesinden_istenilen_doktor_icin_edit_butonu_tiklanir()  {
        ReusableMethods.waitFor(2);
        js.executeScript("arguments[0].scrollBy(500, 0);",adminPage.aTableTumElementler);
        methods.editButonuSec(2).click();
    }
    @Then("Id goruntulenir")
    public void id_goruntulenir() {

        Assert.assertTrue(adminPage.aPhysicianId.isDisplayed());
    }
    @When("Back ile onceki sayfaya geri doner")
    public void back_ile_onceki_sayfaya_geri_doner() {

    Driver.getDriver().navigate().back();
    }
    @When("Ekranin saginda bulunan Create a new Physician butonuna tiklar")
    public void ekranin_saginda_bulunan_create_a_new_physician_butonuna_tiklar() {
    adminPage.aCreateAnewPhysicianbutonu.click();

    }
    @When("Use Search checkbox bos ise tiklanir")
    public void use_search_checkbox_bos_ise_tiklanir()  {
        ReusableMethods.waitFor(2);

        if (adminPage.aUseSearchCheckBox.isSelected())
            System.out.println("checkbox isaretli");
        else
            adminPage.aUseSearchCheckBox.click();



    }
    @Then("Ssn textboxa kayitli ssn yazilir")
    public void ssn_textboxa_kayitli_ssn_yazilir() {
    adminPage.aSearchSsnTextBox.sendKeys(ConfigReader.getProperty("TestSsn"));

    }
    @Then("Search User butonuna basilir")
    public void search_user_butonuna_basilir() {

    adminPage.aSearchUserButonu.click();
        ReusableMethods.waitFor(4);
    }
    @Then("Kayitli olan Physician'in Firstname'i goruntulenir")
    public void kayitli_olan_physician_in_firstname_i_goruntulenir() throws InterruptedException {

        Assert.assertTrue( adminPage.aPhysicianFirstNameTextBox.getAttribute("value").length()!=0);

   }

    @Then("Kayitli olan Physician'in Lastname'i goruntulenir")
    public void kayitliOlanPhysicianInLastnameIGoruntulenir() {

        Assert.assertTrue( adminPage.aPhysicianLastNameTextBox.getAttribute("value").length()!=0);
        Driver.getDriver().close();
    }


    // TC1802

    @Then("Firstname textboxina isim yazilir")
    public void firstname_textboxina_isim_yazilir() {
    js.executeScript("scroll(0, 200);");
    adminPage.aPhysicianFirstNameTextBox.clear();
    adminPage.aPhysicianFirstNameTextBox.sendKeys(ConfigReader.getProperty("DrArsenLupenUsername"));
    }
    @Then("Lastname textboxina soyisim yazilir")
    public void lastname_textboxina_soyisim_yazilir() {
    js.executeScript("scroll(0, 200);");
    adminPage.aPhysicianLastNameTextBox.clear();
    adminPage.aPhysicianLastNameTextBox.sendKeys(ConfigReader.getProperty("HastaKaanLastName"));
    }
    @And("Birth date kismina bir tarih yazilir")
    public void birthDateKisminaBirTarihYazilir() {
        js.executeScript("scroll(0, 200);");
    adminPage.aDateElementi.sendKeys(ConfigReader.getProperty("TestDate"));
    }
    @Then("Address textboxina adres yazilir")
    public void address_textboxina_adres_yazilir() {
    js.executeScript("scroll(0, 200);");
    adminPage.aAdresTextBox.clear();
    adminPage.aAdresTextBox.sendKeys(ConfigReader.getProperty("TestAdres"));
        ReusableMethods.waitFor(4);
        Driver.getDriver().close();
    }


    // TC1803

    @Then("Sayfayi asagi kaydirir")
    public void sayfayi_asagi_kaydirir() {
        js.executeScript("scroll(0, 600);");

    }
    @Then("Speciality dropdowndan uzmanlik alanini secer")
    public void speciality_dropdowndan_uzmanlik_alanini_secer() {
    Select select=new Select(adminPage.aSpecialityDropDown);
    select.selectByValue("DERMATOLOGY");
    }
    @Then("Uzmanlik alaninin secilebildigi goruntulenir")
    public void uzmanlik_alaninin_secilebildigi_goruntulenir() {
        Assert.assertTrue(adminPage.aSpecialityDropDown.getAttribute("value").contains("DERMATOLOGY"));

    }


    // TC1804
    @And("Image basliginin altnda bulunan Dosya sec butonuna basar")
    public void imageBasligininAltindaBulunanDosyaSecButonunaBasar() {
        ReusableMethods.waitFor(4);
        String path= "C:\\Users\\derdi\\OneDrive\\Masaüstü\\lion.jpg";
    adminPage.aImageSecButonu.sendKeys(path);

    }

    @And("Kayitli olan bir fotograf secilir")
    public void kayitliOlanBirFotografSecilir() {

    }

    @Then("Fotografin eklendigi dogrulanir")
    public void fotografinEklendigiDogrulanir() {
        Assert.assertTrue(adminPage.aKucukResimGoruntusu.isDisplayed());

    }


    // TC1805

    @And("User basliginin altinda bulunan dropdowndan doktor secimi yapar")
    public void userBasligininAltindaBulunanDropdowndanDoktorSecimiYapar() {
        js.executeScript("scroll(600, 900);");
        ReusableMethods.waitFor(3);
        Select select=new Select(adminPage.aUserDropDown);
        select.selectByVisibleText("drlupen:888-88-9891");
        ReusableMethods.waitFor(3);
    }

    @Then("Doktor secimi degisikligi goruntulenir")
    public void doktorSecimiDegisikligiGoruntulenir() {
    methods.getScreenshot("User degisirildi",adminPage.aUserGoruntulemeElementi);
    Driver.getDriver().close();
    }



    // TC1806

    @And("Exam Fee textboxina ucret yazilir")
    public void examFeeTextboxinaUcretYazilir() {
        js.executeScript("scroll(600, 900);");
        adminPage.aExamFeeTextBox.sendKeys(ConfigReader.getProperty("TestExamFee"));
    }

    @Then("Degisiklik goruntulenir")
    public void degisiklikGoruntulenir() {
        Assert.assertTrue(adminPage.aExamFeeTextBox.getAttribute("value").length()!=0);
        methods.getScreenshot("Exam Fee degistirildi",adminPage.aExamFeeTextBox);
        Driver.getDriver().close();
    }


    // TC1807

    @Then("Firstname goruntulenir")
    public void firstname_goruntulenir() {
    Assert.assertTrue(adminPage.aPhysicianFirstNameTextBox.isDisplayed());
    methods.getScreenshot("Secilen doctor'un Firstname'i",adminPage.aPhysicianFirstNameTextBox);
    }
    @Then("Lastname goruntulenir")
    public void lastname_goruntulenir() {
    Assert.assertTrue(adminPage.aPhysicianLastNameTextBox.isDisplayed());
    methods.getScreenshot("Secilen doctor'un Lastname'i",adminPage.aPhysicianLastNameTextBox);
    }
    @Then("Date time goruntulenir")
    public void date_time_goruntulenir() {
    Assert.assertTrue(adminPage.aDateElementi.isDisplayed());
    methods.getScreenshot("Secilen doctor'un Date time'i",adminPage.aDateElementi);
    }
    @Then("Phone goruntulenir")
    public void phone_goruntulenir() {
    Assert.assertTrue(adminPage.aPhoneTextBox.isDisplayed());
    methods.getScreenshot("Secilen doctor'un phone number'i",adminPage.aPhoneTextBox);
    }
    @Then("Adress goruntulenir")
    public void adress_goruntulenir() {
    Assert.assertTrue(adminPage.aAdresTextBox.isDisplayed());
    methods.getScreenshot("Secilen doctor'un adress'i",adminPage.aAdresTextBox);
    }




    // TC1808

    @Then("Firstname textboxinda yazan isim silinir ve yeni isim yazilir")
    public void firstname_textboxinda_yazan_isim_silinir_ve_yeni_isim_yazilir() {
        adminPage.aPhysicianFirstNameTextBox.clear();
        adminPage.aPhysicianFirstNameTextBox.sendKeys(ConfigReader.getProperty("DrArsenLupenUsername"));
    }
    @Then("Lastname textboxinda yazan soyisim silinir ve yeni soyisim yazilir")
    public void lastname_textboxinda_yazan_soyisim_silinir_ve_yeni_soyisim_yazilir() {
        adminPage.aPhysicianLastNameTextBox.clear();
        adminPage.aPhysicianLastNameTextBox.sendKeys(ConfigReader.getProperty("HastaKaanLastName"));
    }
    @Then("Date time textboxinda yazan tarih degistirilir")
    public void date_time_textboxinda_yazan_tarih_degistirilir() {
        adminPage.aDateElementi.sendKeys(ConfigReader.getProperty("TestDate"));
    }
    @Then("Phone textboxinda yazan telefon numarasi silinir ve yeni telefon numarasi yazilir")
    public void phone_textboxinda_yazan_telefon_numarasi_silinir_ve_yeni_telefon_numarasi_yazilir() {
        adminPage.aPhoneTextBox.clear();
        adminPage.aPhoneTextBox.sendKeys(ConfigReader.getProperty("TestPhone"));
    }
    @Then("Adress textboxinda yazan adres silinir ve yeni adres yazilir")
    public void adress_textboxinda_yazan_adres_silinir_ve_yeni_adres_yazilir() {
        adminPage.aAdresTextBox.clear();
        adminPage.aAdresTextBox.sendKeys(ConfigReader.getProperty("TestAdres"));
    }


    // TC1809

    @And("Kayitli olan doktor listesinden silinecek doktor icin delete butonu tiklanir")
    public void kayitliOlanDoktorListesindenSilinecekDoktorIcinDeleteButonuTiklanir() {
        ReusableMethods.waitFor(6);
        js.executeScript("arguments[0].scrollBy(500, 0);",adminPage.aTableTumElementler);
        methods.deleteButonuSec(1).click();
    }

    @And("Gelen bildirimde delete butonuna basilir")
    public void gelenBildirimdeDeleteButonunaBasilir() {
    adminPage.aAlertDeleteButonu.click();
    }

    @Then("Doktorun silindigi uyarisi goruntulenir")
    public void doktorunSilindigiUyarisiGoruntulenir() {
        ReusableMethods.waitFor(3);
    Assert.assertTrue(homePage.succesYaziElementi.isDisplayed());
    }


    // TC1810
    Response response;
    TestItem expectedData;



    // TC1811

    @Given("Verilen kullanıcı veritabanına bağlanır ve dogrulama yapar")
    public void verilenKullanıcıVeritabanınaBağlanırVeDogrulamaYapar() {

        US_018DataBase us_018DataBase=new US_018DataBase();
        us_018DataBase.DBTest();
    }


    @Then("Veritabani baglantisini kapatin")
    public void veritabaniBaglantisiniKapatin() {
        DBUtils.closeConnection();
    }

    List<Object> idDB=new ArrayList<>();
    @And("{string} sutununu secer")
    public void sutununuSecer(String email) {
        String query="select * from jhi_user";
        System.out.println(DatabaseUtility.getColumnData(query, "email"));

    }

    @Then("Kullanici {string} dogrulamasi yapar")
    public void kullaniciDogrulamasiYapar(String id) {

    Assert.assertTrue(idDB.toString().contains(id));
    }

    @Given("AKullanici token olusturur")
    public void akullaniciTokenOlusturur() {
        response=ApiUtils.getRequest(Authentication.
                generateToken(ConfigReader.getProperty("AdminUsername"),
                ConfigReader.getProperty("AdminPassword")),
                "https://medunna.com/api/users?=size=2000");

        response.prettyPrint();
    }

    @Then("akullanici emaili dogrular")
    public void akullaniciEmailiDogrular() {
        response.then().assertThat().body("email", Matchers.hasItems("bradford.ward@yahoo.com"));
    }

    @Given("Kullanici Physician icin token alir ve id yazar")
    public void kullaniciPhysicianIcinTokenAlirVeIdYazar() {
        response=ApiUtils.getRequest(Authentication.generateToken(ConfigReader.getProperty("AdminUsername"),
                ConfigReader.getProperty("AdminPassword")),ConfigReader.getProperty("TestPhysicianBaseUrl"));
    }

    @Given("Kullanici Physician icin token ve end point olusturur2")
    public void kullaniciPhysicianIcinTokenVeEndPointOlusturur2() {
        response=ApiUtils.getRequest(Authentication.generateToken(ConfigReader.getProperty("AdminUsername"),
                ConfigReader.getProperty("AdminPassword")),ConfigReader.getProperty("TestPhysicianBaseUrl"));
    }


    @And("Bigileri goruntule")
    public void bigileriGoruntule() {
        response.prettyPrint();
    }

    @Then("Bigileri dogrula")
    public void bigileriDogrula() {

        response.then().
                assertThat().
                statusCode(200).
                body("firstName",Matchers.equalTo("ozgur"),
                "lastName",Matchers.equalTo("bt"),
                "user.login",Matchers.equalTo("tara"),
                "user.activated",Matchers.equalTo(true));

        JsonPath jsonPath=response.jsonPath();

        Assert.assertEquals(200,response.getStatusCode());
        Assert.assertEquals("ozgur",jsonPath.get("firstName"));
        Assert.assertEquals("bt",jsonPath.getString("lastName"));
        Assert.assertEquals("tara",((Map)jsonPath.get("user")).get("login"));
        Assert.assertEquals(true,((Map)jsonPath.get("user")).get("activated"));



    }

    @Then("Pojo ile dogrula")
    public void pojoIleDogrula() {

        spec.pathParam("parametre1","10507");

        US018TestData testData=new US018TestData();

        Response response1=given().contentType(ContentType.JSON).spec(spec).when().get("/{parametre1}");

        response1.prettyPrint();

        HashMap<String,Object> actaul=response1.as(HashMap.class);

        Assert.assertEquals(testData.setupData().get("firstName"),actaul.get("firstname"));
        Assert.assertEquals(testData.setupData().get("lastName"),actaul.get("lastname"));
        Assert.assertEquals(testData.setupData().get("user.firstName"),actaul.get("user.firstName"));


    }
}
