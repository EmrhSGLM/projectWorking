package stepdefinitions.UIStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AdminFundaPage;
import pages.StaffPage;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.ReusableMethods.waitFor;

public class US_016StepDefinations {

    StaffPage staff = new StaffPage();
    AdminFundaPage admin= new AdminFundaPage();
    Actions actions=new Actions(Driver.getDriver());

    @Given("FAdmin, Url' e gider")
    public void f_admin_url_e_gider() { Driver.getDriver().get(ConfigReader.getProperty("URL"));}

    @Given("FAdmin,insan figurune basar")
    public void f_admin_insan_figurune_basar() throws InterruptedException {
        Thread.sleep(1500);
        staff.AccountMenu.click();
        Thread.sleep(1500);
    }
    @Given("FAdmin, signIn buttonuna basar")
    public void f_admin_sign_ın_buttonuna_basar() throws InterruptedException {
        staff.SignIn.click();
        Thread.sleep(1500);
    }
    @Given("FAdmin, username ve password girer")
    public void f_admin_username_ve_password_girer() {
        staff.UsernameTextbox.sendKeys(ConfigReader.getProperty("AdminFundaUsername"));
        staff.PasswordTextbox.sendKeys(ConfigReader.getProperty("AdminFundaPassword"));
    }
    @Given("FAdmin, sign in tiklanir")
    public void f_admin_sign_in_tiklanir() {staff.SignInButton.click();    }

    @Then("FAdmin, giris yapildigini dogrular")
    public void f_admin_giris_yapildigini_dogrular() {Assert.assertTrue(admin.adminIsmi.getText().contains("Funda Yay"));}

    @Given("FAdmin, items&titles tiklanir")
    public void f_admin_items_titles_drapdown_tiklanir() {
        admin.itemstitles.click();
        waitFor(2);
    }

    @Given("FRoom secilir")
    public void f_room_secilir() {admin.room.click();}

    @Given("FCreate a new room tiklanir ve form doldurulur")
    public void f_create_a_new_room_tiklanir_ve_form_doldurulur() {
        admin.CreateANewRoom.click();
        admin.roomNumber.click();
        Actions actions= new Actions(Driver.getDriver()) ;
        Faker faker= new Faker();
        int roomNumber=faker.number().numberBetween(100,1000);
        //actions.sendKeys(( admin.roomNumber,roomNumber).sendKeys(Keys.ENTER).perform();
        admin.roomNumber.sendKeys("3506",Keys.ENTER);
        Select select= new Select(admin.roomType);
        select.selectByIndex(2);
        admin.status.click();
        double fiyat = faker.random().nextDouble();
        admin.price.sendKeys("300",Keys.ENTER);
        admin.description.sendKeys("Premie room",Keys.ENTER);
        admin.date.sendKeys("23.04.2022 01:20");
        waitFor(2);
        admin.save.click();
        waitFor(5);
        Assert.assertTrue(admin.saveToastify.isDisplayed());

    }
    @Given("FCreate a new room tiklanir")
    public void f_create_a_new_room_tiklanir(){admin.CreateANewRoom.click();}

    @Given("FRoom Number bos birakilirsa {string} hatasi verir")
    public void f_room_number_bos_birakilirsa_hatasi_verir(String hataMesaji) {
    admin.roomNumber.click();
    Actions actions= new Actions(Driver.getDriver());
    actions.sendKeys(Keys.TAB).perform();
    Assert.assertTrue(admin.hataMesaji.isDisplayed());
    }

    @Then("FRoom type drapdowdan oda tipi secimi yapilabilmeli")
    public void f_room_type_drapdowdan_oda_tipi_secimi_yapilabilmeli() {
        Assert.assertTrue(admin.roomType.isEnabled());
        Driver.closeDriver();
    }


    @Then("FStatus tiklanabilmeli")
    public void f_status_tiklanabilmeli() {
        Assert.assertTrue(admin.status.isEnabled());
        Driver.closeDriver();
    }

    @Then("FPrice box bos birakilirsa {string} hatasi verir")
    public void f_price_box_bos_birakilirsa_this_field_is_required_hatasi_verir(String str) {
        waitFor(1);
        admin.price.click();
        waitFor(1);
        actions.sendKeys(Keys.TAB).perform();
        Assert.assertTrue(admin.hataMesaji.isEnabled());
        Driver.closeDriver();
    }

    @Then("FDescription box bos birakilirsa {string} hatasi vermez")
    public void f_description_box_bos_birakilirsa_this_field_is_required_hatasi_vermez(String str) {
        admin.description.click();
        actions.sendKeys(Keys.TAB).perform();
        Assert.assertFalse(admin.hataMesaji.isEnabled());
        Driver.closeDriver();
    }

    @Then("FCreated Date gecmis tarih secildiginde  hata mesaji vermeli oda kayidi yapilmamali")
    public void f_created_date_gecmis_tarih_secildiginde_hata_mesaji_vermeli_oda_kayidi_yapilmamali() {
        admin.date.sendKeys("20.04.2022 00:00",Keys.ENTER);
        Assert.assertTrue(admin.hataMesaji.isDisplayed());
        Driver.closeDriver();

    }

    @Then("FRooms tablosunda room type tiklanir")
    public void f_rooms_tablosunda_room_type_tiklanir() {
    Assert.assertTrue(admin.roomsTalosu.isDisplayed());
    admin.roomTypeTablo.click();
    String roomTypeUrl= Driver.getDriver().getCurrentUrl();
    Assert.assertTrue(roomTypeUrl.contains("roomType"));
    Driver.closeDriver();

    }

    @Then("FRooms tablosunda istedigi {string} deki roomu editi tiklayarak guncelleme yapabilir")
    public void froomsTablosundaIstedigiDekiRoomuEditiTiklayarakGuncellemeYapabilir(String id) {
    admin.idTablosu.click();
        System.out.println(admin.idTablosu.getText());
        Driver.closeDriver();


        // for döngüsünde tablolar listinden istenen id yi seçip edit tıklayacak

    }

    @Then("FRooms tablosunda istedigi {string} deki roomu delete tiklayarak silebilir")
    public void froomsTablosundaIstedigiDekiRoomuDeleteTiklayarakSilebilir(String id) {
    }
}
