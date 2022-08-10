package stepdefinitions.UIStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.DoctorsPage;
import pages.Homepage2;
import pages.US_017Pages;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US_017StepDefinitions {

    DoctorsPage doctor = new DoctorsPage();
    US_017Pages admin = new US_017Pages();
    Actions actions = new Actions(Driver.getDriver());
    String name = Faker.instance().name().firstName();
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    Homepage2 homepage2=new Homepage2();

    @Given("E {string} ve {string} girer")
    public void e_ve_girer(String username, String password) {
        doctor.userNameBoxElement.sendKeys(username);
        doctor.passwordBoxElement.sendKeys(password);

    }
    @Given("E Sign in butonuna basar")
    public void e_sign_in_butonuna_basar() {
        doctor.signInGirisButtonElement.click();
    }
    @Given("E Admin olarak giris yaptıgını dogrular")
    public void e_admin_olarak_giris_yaptıgını_dogrular() {
        assertEquals("Emrah Admin",admin.adminLoginNameTextElement.getText());
    }
    @Given("E Items&Title butonuna tıklar")
    public void e_ıtems_title_butonuna_tıklar() {
        ReusableMethods.waitFor(2);
        admin.itemsTitlesButtonElement.click();
    }
    @Then("E Test Item sayfasina gider")
    public void e_test_ıtem_sayfasina_gider() {
        ReusableMethods.waitFor(1);
        admin.testItemButtonElement.click();
    }
    @Then("E Create a new Test Item sayfasına gider")
    public void e_create_a_new_test_ıtem_sayfasına_gider() {
        ReusableMethods.waitFor(1);
        admin.createANewTestItemButtonElement.click();
    }
    @Then("E Name, Description, Price, Default min Value, Created Date kutularına bilgi girisi yapılır")
    public void e_name_description_price_default_min_value_created_date_kutularına_bilgi_girisi_yapılır() {
        actions.click(admin.nameTestBoxElement).
                sendKeys(name).
                sendKeys(Keys.TAB).
                sendKeys("Team88").
                sendKeys(Keys.TAB).
                sendKeys("1500").
                sendKeys(Keys.TAB).
                sendKeys("1.5").
                sendKeys(Keys.TAB).
                sendKeys("2.3").
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).
                perform();
    }
    @Then("E Save butonuna tıklar")
    public void e_save_butonuna_tıklar() {
        //actions.click(admin.saveButtonElement).perform();
    }

    @And("E Kayıt isleminin gerceklestigini dogrular")
    public void eKayıtIslemininGerceklestiginiDogrular() {
        assertTrue(admin.toastOlusturulduTextElement.isDisplayed());
    }



    // TC_1702

    @Then("E Son sayfaya gider")
    public void e_son_sayfaya_gider() {
        //ReusableMethods.waitFor(3);
        //Driver.getDriver().navigate().refresh();
        //ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                perform();


        //actions.click(admin.lastPageElement).perform();
        jse.executeScript("arguments[0].click();", admin.lastPageElement);
    }
    @Then("E Oluşturdugu testi gorur")
    public void e_oluşturdugu_testi_gorur() {
       List<WebElement> nameList = Driver.getDriver().findElements(By.xpath("//tbody//tr//td[2]"));
       WebElement lastNameElement = Driver.getDriver().findElement(By.xpath("//tbody//tr//td["+nameList.size()+"]"));
       assertEquals(lastNameElement.getText(), name);
    }

    @Then("Edit butonuna tıklar")
    public void edit_butonuna_tıklar() {

    }
    @Then("Name, Description, Price, Default min Value, Created Date kutularına bilgilerini gunceller")
    public void name_description_price_default_min_value_created_date_kutularına_bilgilerini_gunceller() {

    }
    @Then("Save butonuna basar")
    public void save_butonuna_basar() {

    }
    @Then("Guncellendigini dogrular")
    public void guncellendigini_dogrular() {

    }

    // TC_1703 Admin test öğelerini görüntüleyebilir.

    @And("Test items goruntuleyebildigini dogrular")
    public void testItemsGoruntuleyebildiginiDogrular() {

        assertTrue(admin.testItemsTextElement.isDisplayed());

    }

    @And("sign out butonuna basar")
    public void signOutButonunaBasar() {

        homepage2.us017.click();
        homepage2.ZsignOutButtonZ.click();
    }
}
